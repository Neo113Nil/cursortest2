package xsna;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import com.unity3d.services.UnityAdsConstants;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AndroidTextPaint.android.kt */
/* loaded from: classes11.dex */
public final class fd2 extends TextPaint {
    public va2 a;
    public pdo0 b;
    public int c;
    public v4j0 d;
    public l5g e;
    public yk8 f;
    public f1m g;
    public mxj0 h;
    public qio i;

    public final fg90 a() {
        va2 va2Var = this.a;
        if (va2Var != null) {
            return va2Var;
        }
        va2 va2Var2 = new va2(this);
        this.a = va2Var2;
        return va2Var2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        ((va2) a()).i(i);
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if ((r1 == null ? false : xsna.mxj0.b(r1.a, r7)) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(final yk8 yk8Var, final long j, float f) {
        if (yk8Var == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (yk8Var instanceof rek0) {
            d(qxm0.s(f, ((rek0) yk8Var).b));
            return;
        }
        if (!(yk8Var instanceof n4j0)) {
            throw new NoWhenBranchMatchedException();
        }
        if (epx.f(this.f, yk8Var)) {
            mxj0 mxj0Var = this.h;
        }
        if (j != 9205357640488583168L) {
            this.f = yk8Var;
            this.h = new mxj0(j);
            this.g = bbk0.b(new gzs() { // from class: xsna.ed2
                @Override // xsna.gzs
                public final Object invoke() {
                    return ((n4j0) yk8.this).c(j);
                }
            });
        }
        fg90 a = a();
        f1m f1mVar = this.g;
        ((va2) a).f(f1mVar != null ? (Shader) f1mVar.getValue() : null);
        this.e = null;
        egi.p(this, f);
    }

    public final void d(long j) {
        l5g l5gVar = this.e;
        if (l5gVar == null ? false : l5g.d(l5gVar.a, j)) {
            return;
        }
        if (j != 16) {
            this.e = new l5g(j);
            setColor(f870.H(j));
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
        }
    }

    public final void e(qio qioVar) {
        if (qioVar == null || epx.f(this.i, qioVar)) {
            return;
        }
        this.i = qioVar;
        if (qioVar.equals(qbr.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(qioVar instanceof frm0)) {
            throw new NoWhenBranchMatchedException();
        }
        ((va2) a()).q(1);
        frm0 frm0Var = (frm0) qioVar;
        ((va2) a()).p(frm0Var.a);
        ((va2) a()).o(frm0Var.b);
        ((va2) a()).n(frm0Var.d);
        ((va2) a()).m(frm0Var.c);
        ((va2) a()).l(frm0Var.e);
    }

    public final void f(v4j0 v4j0Var) {
        if (v4j0Var == null || epx.f(this.d, v4j0Var)) {
            return;
        }
        this.d = v4j0Var;
        if (v4j0Var.equals(v4j0.d)) {
            clearShadowLayer();
            return;
        }
        v4j0 v4j0Var2 = this.d;
        float f = v4j0Var2.c;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (v4j0Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), f870.H(this.d.a));
    }

    public final void g(pdo0 pdo0Var) {
        if (pdo0Var == null || epx.f(this.b, pdo0Var)) {
            return;
        }
        this.b = pdo0Var;
        int i = pdo0Var.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
