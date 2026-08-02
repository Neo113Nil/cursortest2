package ru.ok.android.externcalls.sdk.stat;

import xsna.j7e0;
import xsna.qcy;
import xsna.yzs;
import xsna.zcl;

/* compiled from: Stats.kt */
/* loaded from: classes9.dex */
final class SelfRefKeyProp<V> implements KeyProp<V> {
    public static final Companion Companion = new Companion(null);
    private StatKey<? extends V> value;

    /* compiled from: Stats.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public static /* synthetic */ j7e0 selfRefKeyCreator$calls_sdk_stat_release$default(Companion companion, KeyPropBehavior keyPropBehavior, yzs yzsVar, int i, Object obj) {
            if ((i & 1) != 0) {
                keyPropBehavior = new KeyPropBehavior(false, false, false, false, false, 31, null);
            }
            return new SelfRefKeyProp$Companion$selfRefKeyCreator$1(yzsVar, keyPropBehavior);
        }

        public final <V> j7e0<StatGroup, KeyProp<V>> selfRefKeyCreator$calls_sdk_stat_release(KeyPropBehavior keyPropBehavior, yzs<? super StatKey<? extends V>, ? super StatPack, ? super InnerExtractionContext, ? extends V> yzsVar) {
            return new SelfRefKeyProp$Companion$selfRefKeyCreator$1(yzsVar, keyPropBehavior);
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void construct$default(SelfRefKeyProp selfRefKeyProp, yzs yzsVar, qcy qcyVar, StatGroup statGroup, KeyPropBehavior keyPropBehavior, int i, Object obj) {
        if ((i & 8) != 0) {
            keyPropBehavior = new KeyPropBehavior(false, false, false, false, false, 31, null);
        }
        selfRefKeyProp.setValue(new SelfRefKeyProp$construct$1(keyPropBehavior, qcyVar.getName(), statGroup, yzsVar, selfRefKeyProp));
    }

    public final void construct(yzs<? super StatKey<? extends V>, ? super StatPack, ? super InnerExtractionContext, ? extends V> yzsVar, qcy<?> qcyVar, StatGroup statGroup, KeyPropBehavior keyPropBehavior) {
        setValue(new SelfRefKeyProp$construct$1(keyPropBehavior, qcyVar.getName(), statGroup, yzsVar, this));
    }

    @Override // ru.ok.android.externcalls.sdk.stat.KeyProp, xsna.i7f0
    public /* bridge */ /* synthetic */ Object getValue(StatGroup statGroup, qcy qcyVar) {
        return getValue2(statGroup, (qcy<?>) qcyVar);
    }

    public void setValue(StatKey<? extends V> statKey) {
        this.value = statKey;
    }

    @Override // ru.ok.android.externcalls.sdk.stat.KeyProp
    public StatKey<V> getValue() {
        return this.value;
    }

    /* renamed from: getValue, reason: avoid collision after fix types in other method */
    public StatKey<V> getValue2(StatGroup statGroup, qcy<?> qcyVar) {
        return getValue();
    }
}
