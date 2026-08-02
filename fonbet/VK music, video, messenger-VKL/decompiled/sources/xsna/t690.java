package xsna;

import com.vk.dto.stickers.AnimatedStickerInfo;
import xsna.nov;

/* compiled from: RLottieSticker.kt */
/* loaded from: classes5.dex */
public final class t690 extends ate0 {
    public final int m;
    public final int n;
    public final AnimatedStickerInfo o;

    public t690(int i, int i2, AnimatedStickerInfo animatedStickerInfo, String str, String str2) {
        super(animatedStickerInfo, str, i, str2);
        this.m = i;
        this.n = i2;
        this.o = animatedStickerInfo;
    }

    @Override // xsna.ate0, xsna.kr9, xsna.nov
    public final nov E0(nov novVar) {
        t690 t690Var = new t690(this);
        nov.a.b(this, t690Var);
        return t690Var;
    }

    @Override // xsna.ate0, xsna.kr9
    public final io.reactivex.rxjava3.core.q<nov> k() {
        bpn0 bpn0Var = c7r0.a;
        return c7r0.i(this.o.b).U(new d9(new e810(this, 13), 28));
    }

    public t690(t690 t690Var) {
        super(t690Var);
        this.m = t690Var.m;
        this.n = t690Var.n;
        this.o = t690Var.o;
    }
}
