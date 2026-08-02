package xsna;

import com.vk.bridges.di.BridgeComponent;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ShopsClipsGridBlockExternalDeps.kt */
/* loaded from: classes17.dex */
public final class dfj0 implements fbe {
    public final mxc a;
    public final gxp0 b;
    public final jih0 c;
    public final BridgeComponent d;
    public final zof e;
    public final z5e f;
    public final y5e g;
    public final String h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final ebe n;

    public dfj0(mxc mxcVar, gxp0 gxp0Var, jih0 jih0Var, BridgeComponent bridgeComponent, zof zofVar, z5e z5eVar, y5e y5eVar, uqd uqdVar) {
        this.a = mxcVar;
        this.b = gxp0Var;
        this.c = jih0Var;
        this.d = bridgeComponent;
        this.e = zofVar;
        this.f = z5eVar;
        this.g = y5eVar;
        this.h = uqdVar.a();
        iia0 iia0Var = new iia0(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i = msy.a(lazyThreadSafetyMode, iia0Var);
        this.j = msy.a(lazyThreadSafetyMode, new y84(24));
        this.k = msy.a(lazyThreadSafetyMode, new gwd0(3));
        this.l = msy.a(lazyThreadSafetyMode, new qkd0(this, 7));
        this.m = msy.a(lazyThreadSafetyMode, new hbj0(this, 1));
        this.n = new ebe(zofVar.M().b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fbe
    public final nkh0 a() {
        return (nkh0) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fbe
    public final sjt0 b() {
        return (sjt0) this.k.getValue();
    }

    @Override // xsna.fbe
    public final gzs<Integer> c() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fbe
    public final ffj0 d() {
        return (ffj0) this.j.getValue();
    }

    @Override // xsna.fbe
    public final gxp0 e() {
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fbe
    public final xej0 f() {
        return (xej0) this.l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fbe
    public final afj0 getCallback() {
        return (afj0) this.m.getValue();
    }

    @Override // xsna.fbe
    public final String getDeviceInfo() {
        return this.h;
    }
}
