package ru.ok.android.externcalls.sdk.stat;

import xsna.j7e0;
import xsna.qcy;
import xsna.wzs;
import xsna.zcl;

/* compiled from: Stats.kt */
/* loaded from: classes9.dex */
final class SimpleKeyProp<V> implements KeyProp<V> {
    public static final Companion Companion = new Companion(null);
    private StatKey<? extends V> value;

    /* compiled from: Stats.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public static /* synthetic */ j7e0 keyCreator$calls_sdk_stat_release$default(Companion companion, KeyPropBehavior keyPropBehavior, wzs wzsVar, int i, Object obj) {
            if ((i & 1) != 0) {
                keyPropBehavior = new KeyPropBehavior(false, false, false, false, false, 31, null);
            }
            return new SimpleKeyProp$Companion$keyCreator$1(wzsVar, keyPropBehavior);
        }

        public final <V> j7e0<StatGroup, KeyProp<V>> keyCreator$calls_sdk_stat_release(KeyPropBehavior keyPropBehavior, wzs<? super StatPack, ? super InnerExtractionContext, ? extends V> wzsVar) {
            return new SimpleKeyProp$Companion$keyCreator$1(wzsVar, keyPropBehavior);
        }

        private Companion() {
        }
    }

    public /* synthetic */ SimpleKeyProp(zcl zclVar) {
        this();
    }

    public static /* synthetic */ void construct$default(SimpleKeyProp simpleKeyProp, wzs wzsVar, qcy qcyVar, StatGroup statGroup, KeyPropBehavior keyPropBehavior, int i, Object obj) {
        if ((i & 8) != 0) {
            keyPropBehavior = new KeyPropBehavior(false, false, false, false, false, 31, null);
        }
        simpleKeyProp.setValue(new SimpleKeyProp$construct$1(keyPropBehavior, qcyVar.getName(), statGroup, wzsVar));
    }

    public final void construct(wzs<? super StatPack, ? super InnerExtractionContext, ? extends V> wzsVar, qcy<?> qcyVar, StatGroup statGroup, KeyPropBehavior keyPropBehavior) {
        setValue(new SimpleKeyProp$construct$1(keyPropBehavior, qcyVar.getName(), statGroup, wzsVar));
    }

    @Override // ru.ok.android.externcalls.sdk.stat.KeyProp, xsna.i7f0
    public /* bridge */ /* synthetic */ Object getValue(StatGroup statGroup, qcy qcyVar) {
        return getValue2(statGroup, (qcy<?>) qcyVar);
    }

    public void setValue(StatKey<? extends V> statKey) {
        this.value = statKey;
    }

    private SimpleKeyProp() {
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
