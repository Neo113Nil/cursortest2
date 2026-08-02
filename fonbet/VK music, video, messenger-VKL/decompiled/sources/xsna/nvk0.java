package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.sdk.shared.api.di.ClipsViewersSdkComponent;
import kotlin.LazyThreadSafetyMode;

/* compiled from: StaticAdsItemDepsImpl.kt */
/* loaded from: classes17.dex */
public final class nvk0 implements lvk0 {
    public final pxk0 a;
    public final ClipsViewersSdkComponent b;
    public final BridgeComponent c;
    public final Object d;
    public final Object e;

    public nvk0(qxk0 qxk0Var, ClipsViewersSdkComponent clipsViewersSdkComponent, BridgeComponent bridgeComponent) {
        this.a = qxk0Var;
        this.b = clipsViewersSdkComponent;
        this.c = bridgeComponent;
        d3j0 d3j0Var = new d3j0(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, d3j0Var);
        this.e = msy.a(lazyThreadSafetyMode, new bbb0(this, 22));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.lvk0
    public final a1r a() {
        return (a1r) this.d.getValue();
    }

    @Override // xsna.lvk0
    public final mxk0 b() {
        return new mxk0(this.c.F());
    }

    @Override // xsna.lvk0
    public final pxk0 c() {
        return this.a;
    }

    @Override // xsna.lvk0
    public final sdl d() {
        return sdl.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.lvk0
    public final fvk0 e() {
        return (fvk0) this.e.getValue();
    }

    @Override // xsna.lvk0
    public final ojh0 h() {
        return this.b.h();
    }

    @Override // xsna.lvk0
    public final y2f j() {
        return this.b.j();
    }

    @Override // xsna.lvk0
    public final cjh0 o() {
        return this.b.o();
    }

    @Override // xsna.lvk0
    public final ykh0 q() {
        return this.b.q();
    }

    @Override // xsna.lvk0
    public final gxk0 r0(qw6 qw6Var, r8a0 r8a0Var) {
        return this.b.r0(qw6Var, r8a0Var);
    }
}
