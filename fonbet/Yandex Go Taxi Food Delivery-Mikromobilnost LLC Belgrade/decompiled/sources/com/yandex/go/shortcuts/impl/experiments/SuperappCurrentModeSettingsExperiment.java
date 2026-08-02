package com.yandex.go.shortcuts.impl.experiments;

import defpackage.gsq0;
import defpackage.vn11;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/impl/experiments/SuperappCurrentModeSettingsExperiment;", "Lvn11;", "Companion", "com/yandex/go/shortcuts/impl/experiments/d", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuperappCurrentModeSettingsExperiment implements vn11 {
    public static final d Companion = new d();
    public static final SuperappCurrentModeSettingsExperiment c = new SuperappCurrentModeSettingsExperiment(0);
    public final boolean b;

    public /* synthetic */ SuperappCurrentModeSettingsExperiment(int i, boolean z) {
        if ((i & 1) == 0) {
            this.b = true;
        } else {
            this.b = z;
        }
    }

    public SuperappCurrentModeSettingsExperiment(int i) {
        this.b = true;
    }

    public SuperappCurrentModeSettingsExperiment() {
        this(0);
    }
}
