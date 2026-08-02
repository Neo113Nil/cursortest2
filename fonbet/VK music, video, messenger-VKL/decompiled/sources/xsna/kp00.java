package xsna;

import android.widget.ImageView;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.sdk.shared.api.di.ClipsViewersSdkComponent;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MarketAdsItemDepsImpl.kt */
/* loaded from: classes17.dex */
public final class kp00 implements jp00 {
    public final mr00 a;
    public final ClipsViewersSdkComponent b;
    public final BridgeComponent c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new gbj(this, 23));

    public kp00(nr00 nr00Var, ClipsViewersSdkComponent clipsViewersSdkComponent, BridgeComponent bridgeComponent) {
        this.a = nr00Var;
        this.b = clipsViewersSdkComponent;
        this.c = bridgeComponent;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.jp00
    public final a1r a() {
        return (a1r) this.d.getValue();
    }

    @Override // xsna.jp00
    public final mr00 c() {
        return this.a;
    }

    @Override // xsna.jp00
    public final bcr0<ImageView> d() {
        return sdl.a;
    }

    @Override // xsna.jp00
    public final er00 e(tp00 tp00Var, up00 up00Var, ugm ugmVar) {
        return this.b.D5(tp00Var, up00Var, ugmVar);
    }

    @Override // xsna.jp00
    public final ojh0 h() {
        return this.b.h();
    }

    @Override // xsna.jp00
    public final y2f j() {
        return this.b.j();
    }

    @Override // xsna.jp00
    public final cjh0 o() {
        return this.b.o();
    }

    @Override // xsna.jp00
    public final ykh0 q() {
        return this.b.q();
    }

    @Override // xsna.jp00
    public final lkh0 q0() {
        return this.b.q0();
    }
}
