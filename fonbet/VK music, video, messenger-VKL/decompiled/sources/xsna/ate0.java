package xsna;

import android.graphics.Canvas;
import com.vk.dto.stickers.AnimatedStickerInfo;
import com.vk.rlottie.RLottieDrawable;
import java.io.File;
import xsna.nov;

/* compiled from: RLottieSticker.kt */
/* loaded from: classes5.dex */
public class ate0 extends lg2 {
    public final rj01 h;
    public final int i;
    public final AnimatedStickerInfo j;
    public final String k;
    public final String l;

    public ate0(AnimatedStickerInfo animatedStickerInfo, String str, int i, String str2) {
        File file;
        rj01 rj01Var = new rj01();
        int i2 = animatedStickerInfo.c;
        int i3 = animatedStickerInfo.d;
        String str3 = null;
        if (yse0.d().a != null) {
            String str4 = yse0.d().a;
            File file2 = new File(str4 == null ? "" : str4);
            String str5 = i + '_' + i2 + '_' + i3 + ".scache";
            try {
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file = new File(file2, str5);
                if (!file.exists()) {
                    file.createNewFile();
                }
            } catch (Exception unused) {
                file = null;
            }
            if (file != null) {
                str3 = file.getAbsolutePath();
            }
        }
        String str6 = str3;
        String str7 = animatedStickerInfo.e;
        rj01Var.b = new RLottieDrawable(str7 != null ? str7 : "", String.valueOf(i), i2, i3, str6, false, false, null, 480);
        this.h = rj01Var;
        this.l = str;
        this.i = i;
        this.j = animatedStickerInfo;
        this.k = str2;
    }

    @Override // xsna.kr9, xsna.nov
    public nov E0(nov novVar) {
        ate0 ate0Var = new ate0(this);
        nov.a.b(this, ate0Var);
        return ate0Var;
    }

    @Override // xsna.nov
    public final void G0(Canvas canvas) {
        ((RLottieDrawable) this.h.b).draw(canvas);
    }

    @Override // xsna.nov
    public final float getOriginalHeight() {
        return ((RLottieDrawable) this.h.b).c;
    }

    @Override // xsna.nov
    public final float getOriginalWidth() {
        return ((RLottieDrawable) this.h.b).b;
    }

    @Override // xsna.kr9, xsna.nov
    public final int getStickerAlpha() {
        return this.g;
    }

    @Override // xsna.kr9
    public io.reactivex.rxjava3.core.q<nov> k() {
        bpn0 bpn0Var = c7r0.a;
        return c7r0.i(this.j.b).U(new sj4(new n3b0(this, 7), 27));
    }

    @Override // xsna.lg2
    public final int p() {
        return ((RLottieDrawable) this.h.b).k.B;
    }

    @Override // xsna.kr9, xsna.nov
    public final void setStickerAlpha(int i) {
        this.g = i;
        ((RLottieDrawable) this.h.b).setAlpha(i);
    }

    @Override // xsna.kr9, xsna.nov
    public final void setTimestampMsValue(int i) {
        this.b = i;
        ((RLottieDrawable) this.h.b).k.u = i;
    }

    @Override // xsna.kr9, xsna.nov
    public final void startEncoding() {
        ((RLottieDrawable) this.h.b).o(true);
    }

    @Override // xsna.kr9, xsna.nov
    public final void stopEncoding() {
        ((RLottieDrawable) this.h.b).o(false);
        rj01 rj01Var = this.h;
        ((RLottieDrawable) rj01Var.b).o(false);
        RLottieDrawable rLottieDrawable = (RLottieDrawable) rj01Var.b;
        wy3 wy3Var = rLottieDrawable.m;
        wy3Var.c.E = rLottieDrawable.k.E;
        wy3Var.c.l = false;
        ez3 ez3Var = wy3Var.a;
        int i = ez3Var.e.get();
        int f = wy3Var.f();
        if (f >= ez3Var.b[1]) {
            wy3Var.g(f);
        } else {
            ez3Var.e.set(f);
        }
        if (i == f) {
            return;
        }
        wy3Var.e(i, f);
        wy3Var.h(ez3Var.e.get());
    }

    public ate0(ate0 ate0Var) {
        this.h = ate0Var.h;
        this.l = ate0Var.l;
        this.i = ate0Var.i;
        this.j = ate0Var.j;
        this.k = ate0Var.k;
    }
}
