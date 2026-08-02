package xsna;

import android.graphics.Paint;
import com.vk.rlottie.RLottieDrawable;

/* compiled from: StickersProviderImpl.kt */
/* loaded from: classes5.dex */
public final class nbl0 implements mbl0, w8i {
    public final ao8 b;
    public final bpn0 c;

    static {
        Paint b = rqi.b(1, -16711681);
        b.setStyle(Paint.Style.STROKE);
        b.setStrokeWidth(iah0.a(2));
    }

    public nbl0() {
        new bpn0(new ta50(6));
        this.b = new ao8(20);
        this.c = new bpn0(new su80(this, 22));
        new bpn0(new wm80(this, 21));
    }

    @Override // xsna.mbl0
    public final ao8 a() {
        return this.b;
    }

    @Override // xsna.mbl0
    public final void b() {
        vvr0.c();
    }

    @Override // xsna.mbl0
    public final void c(nov novVar) {
        if (novVar instanceof t690) {
            ((RLottieDrawable) ((t690) novVar).h.b).k();
        }
    }
}
