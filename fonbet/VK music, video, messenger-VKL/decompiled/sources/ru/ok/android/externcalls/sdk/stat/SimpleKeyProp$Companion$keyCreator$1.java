package ru.ok.android.externcalls.sdk.stat;

import xsna.j7e0;
import xsna.qcy;
import xsna.wzs;

/* compiled from: Stats.kt */
/* loaded from: classes9.dex */
public final class SimpleKeyProp$Companion$keyCreator$1<T, D> implements j7e0 {
    final /* synthetic */ KeyPropBehavior $behavior;
    final /* synthetic */ wzs<StatPack, InnerExtractionContext, V> $extractor;

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleKeyProp$Companion$keyCreator$1(wzs<? super StatPack, ? super InnerExtractionContext, ? extends V> wzsVar, KeyPropBehavior keyPropBehavior) {
        this.$extractor = wzsVar;
        this.$behavior = keyPropBehavior;
    }

    @Override // xsna.j7e0
    public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
        return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
    }

    public final SimpleKeyProp<V> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
        SimpleKeyProp<V> simpleKeyProp = new SimpleKeyProp<>(null);
        simpleKeyProp.setValue(new SimpleKeyProp$construct$1(this.$behavior, qcyVar.getName(), statGroup, this.$extractor));
        statGroup.register$calls_sdk_stat_release(simpleKeyProp);
        return simpleKeyProp;
    }
}
