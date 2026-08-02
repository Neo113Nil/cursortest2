package xsna;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import java.lang.reflect.Field;
import xsna.nov;

/* compiled from: StoryGifSticker.kt */
/* loaded from: classes5.dex */
public class g4m0 extends lg2 {
    public static final float u = iah0.a(110);
    public final wk2 h;
    public final String i;
    public final String j;
    public final pk2 k;
    public final int[] l;
    public final aj2 m;
    public boolean n;
    public final int o;
    public final float p;
    public final float q;
    public final float r;
    public final int s;
    public int t;

    public g4m0(wk2 wk2Var, String str, String str2) {
        this.h = wk2Var;
        this.i = str;
        this.j = str2;
        pk2 pk2Var = wk2Var.a;
        this.k = pk2Var;
        int[] w = pk2Var.w();
        this.l = w;
        kj2 a = wkw.f().a();
        tjo a2 = a == null ? null : a.a();
        if (a2 == null) {
            throw new IllegalStateException("AnimatedDrawableFactory is null");
        }
        Drawable a3 = a2.a(new pvf(new wk2(pk2Var), 0));
        aj2 aj2Var = a3 instanceof aj2 ? (aj2) a3 : null;
        if (aj2Var == null) {
            throw new IllegalStateException("Drawable is not AnimatedDrawable2");
        }
        aj2Var.setBounds(0, 0, pk2Var.getWidth(), pk2Var.getHeight());
        this.m = aj2Var;
        this.o = pk2Var.getDuration();
        float intrinsicWidth = aj2Var.getIntrinsicWidth();
        this.p = intrinsicWidth;
        float intrinsicHeight = aj2Var.getIntrinsicHeight();
        this.q = intrinsicHeight;
        float max = Math.max(intrinsicWidth, intrinsicHeight);
        float f = u;
        this.r = max < f ? f / max : 1.0f;
        aj2Var.start();
        Integer i0 = rl3.i0(w);
        this.s = i0 != null ? i0.intValue() : 30;
        this.t = this.g;
    }

    @Override // xsna.kr9, xsna.nov
    public nov E0(nov novVar) {
        if (novVar == null) {
            novVar = new g4m0(this.h, this.i, this.j);
        }
        g4m0 g4m0Var = (g4m0) novVar;
        nov.a.b(this, g4m0Var);
        return g4m0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0044  */
    @Override // xsna.nov
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G0(Canvas canvas) {
        int i;
        ym2 ym2Var;
        emo emoVar;
        canvas.save();
        float f = this.r;
        canvas.scale(f, f);
        int i2 = this.b;
        aj2 aj2Var = this.m;
        if (i2 != -1 || this.n) {
            int i3 = this.o;
            if (i3 > 0) {
                int[] iArr = this.l;
                if (iArr.length != 0) {
                    int floorMod = Math.floorMod(i2, i3);
                    int length = iArr.length;
                    i = 0;
                    int i4 = 0;
                    while (true) {
                        if (i >= length) {
                            i = iArr.length - 1;
                            break;
                        }
                        i4 += iArr[i];
                        if (floorMod < i4) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    ym2Var = aj2Var.b;
                    if (!(ym2Var == null ? ym2Var.drawFrame(aj2Var, canvas, i) : false)) {
                        aj2Var.stop();
                        if (aj2Var.b != null && (emoVar = aj2Var.c) != null) {
                            long j = 0;
                            for (int i5 = 0; i5 < i; i5++) {
                                j += emoVar.a.getFrameDurationMs(i);
                            }
                            aj2Var.f = j;
                            aj2Var.k = i;
                            aj2Var.i = 0L;
                            aj2Var.j = 0L;
                            long uptimeMillis = SystemClock.uptimeMillis() - aj2Var.f;
                            aj2Var.e = uptimeMillis;
                            aj2Var.g = uptimeMillis;
                            aj2Var.invalidateSelf();
                        }
                        aj2Var.draw(canvas);
                    }
                }
            }
            i = 0;
            ym2Var = aj2Var.b;
            if (!(ym2Var == null ? ym2Var.drawFrame(aj2Var, canvas, i) : false)) {
            }
        } else {
            aj2Var.draw(canvas);
        }
        canvas.restore();
    }

    @Override // xsna.nov
    public final float getOriginalHeight() {
        return this.r * this.m.getIntrinsicHeight();
    }

    @Override // xsna.nov
    public final float getOriginalWidth() {
        return this.r * this.m.getIntrinsicWidth();
    }

    @Override // xsna.kr9, xsna.nov
    public final int getStickerAlpha() {
        return this.t;
    }

    @Override // xsna.kr9
    public final io.reactivex.rxjava3.core.q<nov> k() {
        String str = this.j;
        Uri parse = brm0.B(str, "http", false) ? Uri.parse(str) : Uri.parse("file://".concat(str));
        Field field = mcr0.a;
        return new io.reactivex.rxjava3.internal.operators.observable.q(new qcr0(parse)).U(new si60(new ape0(this, 12), 8));
    }

    @Override // xsna.lg2
    public final int p() {
        return this.s;
    }

    @Override // xsna.kr9, xsna.nov
    public final void setStickerAlpha(int i) {
        this.t = i;
        this.m.setAlpha(i);
    }

    @Override // xsna.kr9, xsna.nov
    public final void startEncoding() {
        this.n = true;
        this.m.stop();
    }

    @Override // xsna.kr9, xsna.nov
    public final void stopEncoding() {
        this.n = false;
        this.m.start();
    }
}
