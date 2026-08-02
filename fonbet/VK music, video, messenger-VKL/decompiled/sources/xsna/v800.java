package xsna;

import android.graphics.Canvas;
import xsna.nov;

/* compiled from: LottieSticker.kt */
/* loaded from: classes5.dex */
public class v800 extends lg2 {
    public final zf3 h;
    public final int i;
    public final String j;
    public final String k;

    public v800(i700 i700Var, String str, int i, String str2) {
        this.i = i;
        this.j = str;
        this.h = new zf3(i700Var);
        this.k = str2;
    }

    @Override // xsna.kr9, xsna.nov
    public nov E0(nov novVar) {
        if (novVar == null) {
            novVar = new v800(this);
        }
        v800 v800Var = (v800) novVar;
        nov.a.b(this, v800Var);
        return v800Var;
    }

    @Override // xsna.nov
    public final void G0(Canvas canvas) {
        zf3 zf3Var = this.h;
        k800 k800Var = zf3Var.a;
        if (zf3Var.b != -1) {
            k800Var.t((zf3Var.d / zf3Var.e) % zf3Var.c);
        }
        float f = zf3Var.f;
        canvas.scale(f, f);
        k800Var.draw(canvas);
    }

    @Override // xsna.nov
    public final float getOriginalHeight() {
        return this.h.a.getIntrinsicHeight();
    }

    @Override // xsna.nov
    public final float getOriginalWidth() {
        return this.h.a.getIntrinsicWidth();
    }

    @Override // xsna.kr9, xsna.nov
    public final int getStickerAlpha() {
        return this.g;
    }

    @Override // xsna.kr9
    public io.reactivex.rxjava3.core.q<nov> k() {
        bpn0 bpn0Var = c7r0.a;
        return c7r0.g(this.k, this.j, true).U(new t7(new x2y(this, 6), 20));
    }

    @Override // xsna.lg2
    public final int p() {
        return this.h.e;
    }

    @Override // xsna.kr9, xsna.nov
    public final void setStickerAlpha(int i) {
        this.g = i;
        this.h.a.setAlpha(i);
    }

    @Override // xsna.kr9, xsna.nov
    public final void setTimestampMsValue(int i) {
        this.b = i;
        zf3 zf3Var = this.h;
        zf3Var.d = i;
        if (i == -1) {
            zf3Var.b = -1;
            zf3Var.c = 0;
        } else if (zf3Var.b == -1) {
            zf3Var.c();
        }
    }

    @Override // xsna.kr9, xsna.nov
    public final void startEncoding() {
        zf3 zf3Var = this.h;
        k800 k800Var = zf3Var.a;
        zf3Var.c();
        try {
            if (k800Var.m()) {
                k800Var.stop();
            }
        } catch (Exception unused) {
        }
    }

    @Override // xsna.kr9, xsna.nov
    public final void stopEncoding() {
        zf3 zf3Var = this.h;
        k800 k800Var = zf3Var.a;
        zf3Var.c();
        try {
            if (k800Var.m()) {
                return;
            }
            k800Var.t(-1);
            k800Var.start();
        } catch (Exception unused) {
        }
    }

    public v800(v800 v800Var) {
        this.i = v800Var.i;
        this.j = v800Var.j;
        this.h = v800Var.h;
        this.k = v800Var.k;
    }
}
