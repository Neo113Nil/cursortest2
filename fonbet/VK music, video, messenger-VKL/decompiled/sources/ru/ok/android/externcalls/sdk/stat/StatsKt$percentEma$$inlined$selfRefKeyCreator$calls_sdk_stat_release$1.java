package ru.ok.android.externcalls.sdk.stat;

import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.epx;
import xsna.gzs;
import xsna.j7e0;
import xsna.msy;
import xsna.pzl;
import xsna.qcy;

/* compiled from: Stats.kt */
/* loaded from: classes9.dex */
public final class StatsKt$percentEma$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1<T, D> implements j7e0 {
    final /* synthetic */ KeyPropBehavior $behavior;
    final /* synthetic */ double $factor$inlined;
    final /* synthetic */ StatKey $lossPerSec$inlined;
    final /* synthetic */ StatKey $totalPerSec$inlined;

    /* compiled from: Stats.kt */
    /* renamed from: ru.ok.android.externcalls.sdk.stat.StatsKt$percentEma$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1$1, reason: invalid class name */
    public static final class AnonymousClass1 implements StatKey<Double>, StatBehavior {
        private final /* synthetic */ KeyPropBehavior $$delegate_0;
        final /* synthetic */ double $factor$inlined;
        final /* synthetic */ StatKey $lossPerSec$inlined;
        final /* synthetic */ StatKey $totalPerSec$inlined;
        private final Lazy fullName$delegate;
        private final StatGroup group;
        private final String name;
        final /* synthetic */ SelfRefKeyProp this$0;

        public AnonymousClass1(KeyPropBehavior keyPropBehavior, final String str, final StatGroup statGroup, SelfRefKeyProp selfRefKeyProp, StatKey statKey, StatKey statKey2, double d) {
            this.this$0 = selfRefKeyProp;
            this.$totalPerSec$inlined = statKey;
            this.$lossPerSec$inlined = statKey2;
            this.$factor$inlined = d;
            this.$$delegate_0 = keyPropBehavior;
            this.name = str;
            this.group = statGroup;
            this.fullName$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<String>() { // from class: ru.ok.android.externcalls.sdk.stat.StatsKt$percentEma$.inlined.selfRefKeyCreator.calls_sdk_stat_release.1.1.1
                @Override // xsna.gzs
                public final String invoke() {
                    return pzl.b(StatGroup.this.getFullName(), ".", str);
                }
            });
        }

        @Override // ru.ok.android.externcalls.sdk.stat.StatKey
        public Double doExtract(StatPack statPack, InnerExtractionContext innerExtractionContext) {
            Double d;
            StatKey value = this.this$0.getValue();
            Double d2 = (Double) this.$totalPerSec$inlined.extract(statPack, innerExtractionContext).getValue();
            if (d2 != null) {
                double doubleValue = d2.doubleValue();
                Double d3 = (Double) this.$lossPerSec$inlined.extract(statPack, innerExtractionContext).getValue();
                if (d3 != null) {
                    double doubleValue2 = (d3.doubleValue() * 100.0d) / doubleValue;
                    StatValue previousValue = innerExtractionContext.getOuter().previousValue(value);
                    StatValue statValue = epx.f(previousValue != null ? previousValue.getKey() : null, value) ? previousValue : null;
                    double doubleValue3 = (statValue == null || (d = (Double) statValue.getValue()) == null) ? doubleValue2 : d.doubleValue();
                    double d4 = this.$factor$inlined;
                    return Double.valueOf((doubleValue2 * d4) + ((1 - d4) * doubleValue3));
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

    public StatsKt$percentEma$$inlined$selfRefKeyCreator$calls_sdk_stat_release$1(KeyPropBehavior keyPropBehavior, StatKey statKey, StatKey statKey2, double d) {
        this.$behavior = keyPropBehavior;
        this.$totalPerSec$inlined = statKey;
        this.$lossPerSec$inlined = statKey2;
        this.$factor$inlined = d;
    }

    @Override // xsna.j7e0
    public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
        return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
    }

    public final SelfRefKeyProp<Double> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
        SelfRefKeyProp<Double> selfRefKeyProp = new SelfRefKeyProp<>();
        selfRefKeyProp.setValue(new AnonymousClass1(this.$behavior, qcyVar.getName(), statGroup, selfRefKeyProp, this.$totalPerSec$inlined, this.$lossPerSec$inlined, this.$factor$inlined));
        statGroup.register$calls_sdk_stat_release(selfRefKeyProp);
        return selfRefKeyProp;
    }
}
