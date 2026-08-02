package xsna;

import android.graphics.PathMeasure;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Lambda;

/* compiled from: Vector.kt */
/* loaded from: classes11.dex */
public final class fq90 extends gir0 {
    public yk8 b;
    public float f;
    public yk8 g;
    public float k;
    public float m;
    public boolean p;
    public frm0 q;
    public final androidx.compose.ui.graphics.a r;
    public androidx.compose.ui.graphics.a s;
    public androidx.compose.ui.graphics.a t;
    public final Object u;
    public float c = 1.0f;
    public List<? extends qq90> d = jlr0.a;
    public float e = 1.0f;
    public int h = 0;
    public int i = 0;
    public float j = 4.0f;
    public float l = 1.0f;
    public boolean n = true;
    public boolean o = true;

    /* compiled from: Vector.kt */
    public static final class a extends Lambda implements gzs<oq90> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final oq90 invoke() {
            return new eb2(new PathMeasure());
        }
    }

    public fq90() {
        androidx.compose.ui.graphics.a a2 = androidx.compose.ui.graphics.b.a();
        this.r = a2;
        this.s = a2;
        this.u = msy.a(LazyThreadSafetyMode.NONE, a.i);
    }

    @Override // xsna.gir0
    public final void a(oio oioVar) {
        frm0 frm0Var;
        if (this.n) {
            tq90.b(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        yk8 yk8Var = this.b;
        if (yk8Var != null) {
            oio.u1(oioVar, this.s, yk8Var, this.c, null, null, 56);
        }
        yk8 yk8Var2 = this.g;
        if (yk8Var2 != null) {
            frm0 frm0Var2 = this.q;
            if (this.o || frm0Var2 == null) {
                frm0 frm0Var3 = new frm0(this.f, this.j, this.h, this.i, null, 16);
                this.q = frm0Var3;
                this.o = false;
                frm0Var = frm0Var3;
            } else {
                frm0Var = frm0Var2;
            }
            oio.u1(oioVar, this.s, yk8Var2, this.e, frm0Var, null, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void e() {
        float f = this.k;
        androidx.compose.ui.graphics.a aVar = this.r;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.l == 1.0f) {
            this.s = aVar;
            return;
        }
        if (epx.f(this.s, aVar)) {
            this.s = androidx.compose.ui.graphics.b.a();
        } else {
            int h = this.s.h();
            this.s.rewind();
            this.s.l(h);
        }
        ?? r0 = this.u;
        ((oq90) r0.getValue()).b(aVar);
        float length = ((oq90) r0.getValue()).getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((oq90) r0.getValue()).a(f4, f5, this.s);
            return;
        }
        androidx.compose.ui.graphics.a aVar2 = this.t;
        if (aVar2 == null) {
            aVar2 = androidx.compose.ui.graphics.b.a();
            this.t = aVar2;
        }
        aVar2.reset();
        ((oq90) r0.getValue()).a(f4, length, aVar2);
        this.s.w(aVar2, 0L);
        aVar2.reset();
        ((oq90) r0.getValue()).a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, aVar2);
        this.s.w(aVar2, 0L);
    }

    public final String toString() {
        return this.r.toString();
    }
}
