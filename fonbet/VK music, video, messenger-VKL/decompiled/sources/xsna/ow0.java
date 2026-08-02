package xsna;

import android.app.Activity;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.sdk.shared.api.di.ClipsViewersSdkComponent;
import kotlin.LazyThreadSafetyMode;

/* compiled from: AdsItemDepsImpl.kt */
/* loaded from: classes17.dex */
public final class ow0 implements lw0 {
    public final pi0 a;
    public final BridgeComponent b;
    public final ClipsViewersSdkComponent c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    /* compiled from: AdsItemDepsImpl.kt */
    public static final class a implements ov0 {
        public a() {
        }

        @Override // xsna.ov0
        public final void a(Activity activity, gzs<s3q0> gzsVar) {
            if (ow0.this.b.x().k0().a(activity)) {
                return;
            }
            gzsVar.invoke();
        }

        @Override // xsna.ov0
        public final void b(Activity activity, h20 h20Var) {
            if (ow0.this.b.x().k0().a(activity)) {
                return;
            }
            h20Var.invoke();
        }
    }

    public ow0(pi0 pi0Var, BridgeComponent bridgeComponent, ClipsViewersSdkComponent clipsViewersSdkComponent) {
        this.a = pi0Var;
        this.b = bridgeComponent;
        this.c = clipsViewersSdkComponent;
        h9 h9Var = new h9(this, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, h9Var);
        int i = 1;
        this.e = msy.a(lazyThreadSafetyMode, new i9(i));
        this.f = msy.a(lazyThreadSafetyMode, new d1(i));
        int i2 = 2;
        this.g = msy.a(lazyThreadSafetyMode, new s5(this, i2));
        this.h = msy.a(lazyThreadSafetyMode, new t5(this, i2));
        this.i = msy.a(lazyThreadSafetyMode, new com.vk.newsfeed.posting.mediapicker.photovk.base.a(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.lw0
    public final a1r a() {
        return (a1r) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.lw0
    public final wkh0 b() {
        return (wkh0) this.g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.lw0
    public final ov0 e() {
        return (ov0) this.d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.lw0
    public final wcg0 f() {
        return (wcg0) this.f.getValue();
    }

    @Override // xsna.lw0
    public final kle g(iih0 iih0Var, com.vk.movika.sdk.base.logic.processor.actions.i iVar, com.vk.clips.sdk.shared.item.ads.c cVar) {
        return new kle(new e25(this.b.s()), this.a, iih0Var, iVar, cVar);
    }

    @Override // xsna.lw0
    public final ojh0 h() {
        return this.c.h();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.lw0
    public final jnp0 i() {
        return (jnp0) this.e.getValue();
    }

    @Override // xsna.lw0
    public final y2f j() {
        return this.c.j();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.lw0
    public final sjt0 k() {
        return (sjt0) this.h.getValue();
    }

    @Override // xsna.lw0
    public final cjh0 o() {
        return this.c.o();
    }
}
