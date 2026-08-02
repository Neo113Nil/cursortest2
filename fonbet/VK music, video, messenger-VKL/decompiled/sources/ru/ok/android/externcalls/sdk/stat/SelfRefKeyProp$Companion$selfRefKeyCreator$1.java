package ru.ok.android.externcalls.sdk.stat;

import xsna.j7e0;
import xsna.qcy;
import xsna.yzs;

/* compiled from: Stats.kt */
/* loaded from: classes9.dex */
public final class SelfRefKeyProp$Companion$selfRefKeyCreator$1<T, D> implements j7e0 {
    final /* synthetic */ KeyPropBehavior $behavior;
    final /* synthetic */ yzs<StatKey<? extends V>, StatPack, InnerExtractionContext, V> $selfRefExtractor;

    /* JADX WARN: Multi-variable type inference failed */
    public SelfRefKeyProp$Companion$selfRefKeyCreator$1(yzs<? super StatKey<? extends V>, ? super StatPack, ? super InnerExtractionContext, ? extends V> yzsVar, KeyPropBehavior keyPropBehavior) {
        this.$selfRefExtractor = yzsVar;
        this.$behavior = keyPropBehavior;
    }

    @Override // xsna.j7e0
    public /* bridge */ /* synthetic */ Object provideDelegate(Object obj, qcy qcyVar) {
        return provideDelegate((StatGroup) obj, (qcy<?>) qcyVar);
    }

    public final SelfRefKeyProp<V> provideDelegate(StatGroup statGroup, qcy<?> qcyVar) {
        SelfRefKeyProp<V> selfRefKeyProp = new SelfRefKeyProp<>();
        selfRefKeyProp.setValue(new SelfRefKeyProp$construct$1(this.$behavior, qcyVar.getName(), statGroup, this.$selfRefExtractor, selfRefKeyProp));
        statGroup.register$calls_sdk_stat_release(selfRefKeyProp);
        return selfRefKeyProp;
    }
}
