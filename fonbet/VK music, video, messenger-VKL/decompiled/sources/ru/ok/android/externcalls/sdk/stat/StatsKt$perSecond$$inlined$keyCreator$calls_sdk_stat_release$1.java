package ru.ok.android.externcalls.sdk.stat;

import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.gzs;
import xsna.izs;
import xsna.j7e0;
import xsna.msy;
import xsna.pzl;
import xsna.qcy;
import xsna.u11;

/* compiled from: Stats.kt */
/* loaded from: classes9.dex */
public final class StatsKt$perSecond$$inlined$keyCreator$calls_sdk_stat_release$1<T, D> implements j7e0 {
    final /* synthetic */ KeyPropBehavior $behavior;
    final /* synthetic */ izs $diffTransform$inlined;
    final /* synthetic */ StatKey $source$inlined;

    /* compiled from: Stats.kt */
    /* renamed from: ru.ok.android.externcalls.sdk.stat.StatsKt$perSecond$$inlined$keyCreator$calls_sdk_stat_release$1$1, reason: invalid class name */
    public static final class AnonymousClass1 implements StatKey<Double>, StatBehavior {
        private final /* synthetic */ KeyPropBehavior $$delegate_0;
        final /* synthetic */ izs $diffTransform$inlined;
        final /* synthetic */ StatKey $source$inlined;
        private final Lazy fullName$delegate;
        private final StatGroup group;
        private final String name;

        public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup, StatKey statKey, izs izsVar) {
            this.$source$inlined = statKey;
            this.$diffTransform$inlined = izsVar;
            this.$$delegate_0 = keyPropBehavior;
            this.name = str;
            this.group = statGroup;
            this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.StatsKt$perSecond$.inlined.keyCreator.calls_sdk_stat_release.1.1.1
                @Override // xsna.gzs
                public final String invoke() {
                    return pzl.b(StatGroup.this.getFullName(), ".", str);
                }
            });
        }

        @Override // ru.ok.android.externcalls.sdk.stat.StatKey
        public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
            Long l;
            Long l2 = (Long) u11.d(Util.INSTANCE, statPack, innerExtractionContext);
            if (l2 != null) {
                long longValue = l2.longValue();
                Long l3 = (Long) this.$source$inlined.extract(statPack, innerExtractionContext).getValue();
                if (l3 != null) {
                    long longValue2 = l3.longValue();
                    StatValue previousValue = innerExtractionContext.getOuter().previousValue(this.$source$inlined);
                    if (previousValue != null && (l = (Long) previousValue.getValue()) != null) {
                        return Double.valueOf(((Number) this.$diffTransform$inlined.invoke(Long.valueOf(longValue2 - l.longValue()))).longValue() / (longValue / 1000.0d));
                    }
                }
            }
            return null;
        }

        @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
        public boolean getDerived() {
            return this.$$delegate_0.getDerived();
        }

        @Override // ru.ok.android.externcalls.sdk.stat.StatKey
        public String getFullName() {
            return (String) this.fullName$delegate.getValue();
        }

        @Override // ru.ok.android.externcalls.sdk.stat.StatKey
        public StatGroup getGroup() {
            return this.group;
        }

        @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
        public boolean getHumanReadable() {
            return this.$$delegate_0.getHumanReadable();
        }

        @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
        public boolean getMonotonic() {
            return this.$$delegate_0.getMonotonic();
        }

        @Override // ru.ok.android.externcalls.sdk.stat.StatKey
        public String getName() {
            return this.name;
        }

        @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
        public boolean getStatic() {
            return this.$$delegate_0.getStatic();
        }

        @Override // ru.ok.android.externcalls.sdk.stat.StatBehavior
        public boolean getSynthetic() {
            return this.$$delegate_0.getSynthetic();
        }
    }

    public StatsKt$perSecond$$inlined$keyCreator$calls_sdk_stat_release$1(KeyPropBehavior keyPropBehavior, StatKey statKey, izs izsVar) {
        this.$behavior = keyPropBehavior;
        this.$source$inlined = statKey;
        this.$diffTransform$inlined = izsVar;
    }

    @Override // xsna.j7e0
    public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
        return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
    }

    public final SimpleKeyProp<Double> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
        SimpleKeyProp<Double> simpleKeyProp = new SimpleKeyProp<>(null);
        simpleKeyProp.setValue(new AnonymousClass1(this.$behavior, qcyVar.getName(), statGroup, this.$source$inlined, this.$diffTransform$inlined));
        statGroup.register$calls_sdk_stat_release(simpleKeyProp);
        return simpleKeyProp;
    }
}
