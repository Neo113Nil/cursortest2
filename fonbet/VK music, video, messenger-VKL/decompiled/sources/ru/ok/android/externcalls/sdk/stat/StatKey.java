package ru.ok.android.externcalls.sdk.stat;

import xsna.epx;

/* compiled from: StatDefinitions.kt */
/* loaded from: classes9.dex */
public interface StatKey<V> extends StatBehavior {
    V doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext);

    default StatValue<V> extract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
        StatValue<V> statValue = (StatValue) innerExtractionContext.getResults().get(this);
        if (!epx.f(statValue != null ? statValue.getKey() : null, this)) {
            statValue = null;
        }
        if (statValue != null) {
            return statValue;
        }
        StatValue<V> statValue2 = new StatValue<>(this, doExtract(statPack, innerExtractionContext));
        innerExtractionContext.getResults().put(this, statValue2);
        return statValue2;
    }

    String getFullName();

    StatGroup getGroup();

    String getName();
}
