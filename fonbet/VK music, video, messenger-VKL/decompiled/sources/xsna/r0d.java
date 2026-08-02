package xsna;

import com.vk.bridges.di.BridgeComponent;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ClipItemDepsImpl.kt */
/* loaded from: classes17.dex */
public final class r0d {
    public final pi0 a;
    public final Object b;
    public final Object c;

    public r0d(pi0 pi0Var, BridgeComponent bridgeComponent) {
        this.a = pi0Var;
        sx0 sx0Var = new sx0(bridgeComponent, 13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, sx0Var);
        this.c = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.b(bridgeComponent, 16));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final anc a() {
        return (anc) this.c.getValue();
    }
}
