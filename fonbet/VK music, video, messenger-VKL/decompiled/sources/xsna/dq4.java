package xsna;

import kotlin.LazyThreadSafetyMode;

/* compiled from: AudioLongtapQueueFacade.kt */
/* loaded from: classes3.dex */
public final class dq4 {
    public final r9c0 a;
    public final rx4 b;
    public final Object c;

    public dq4(lx4 lx4Var, r9c0 r9c0Var, rx4 rx4Var) {
        this.a = r9c0Var;
        this.b = rx4Var;
        this.c = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.model.e(lx4Var, 3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final cq4 a() {
        return (cq4) this.c.getValue();
    }
}
