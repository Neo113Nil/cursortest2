package xsna;

import android.graphics.Color;
import android.graphics.Matrix;
import androidx.annotation.Nullable;
import xsna.tf6;

/* compiled from: DropShadowKeyframeAnimation.java */
/* loaded from: classes12.dex */
public final class lmo implements tf6.a {
    public final com.airbnb.lottie.model.layer.a a;
    public final com.airbnb.lottie.model.layer.a b;
    public final u6g c;
    public final hqr d;
    public final hqr e;
    public final hqr f;
    public final hqr g;

    @Nullable
    public Matrix h;

    /* compiled from: DropShadowKeyframeAnimation.java */
    public class a extends a900<Float> {
        public final /* synthetic */ a900 c;

        public a(a900 a900Var) {
            this.c = a900Var;
        }

        @Override // xsna.a900
        @Nullable
        public final Float a(p800<Float> p800Var) {
            Float f = (Float) this.c.a(p800Var);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public lmo(com.airbnb.lottie.model.layer.a aVar, com.airbnb.lottie.model.layer.a aVar2, m22 m22Var) {
        this.b = aVar;
        this.a = aVar2;
        tf6<?, ?> j = ((mf2) m22Var.a).j();
        this.c = (u6g) j;
        j.a(this);
        aVar2.h(j);
        hqr j2 = ((nf2) m22Var.b).j();
        this.d = j2;
        j2.a(this);
        aVar2.h(j2);
        hqr j3 = ((nf2) m22Var.c).j();
        this.e = j3;
        j3.a(this);
        aVar2.h(j3);
        hqr j4 = ((nf2) m22Var.d).j();
        this.f = j4;
        j4.a(this);
        aVar2.h(j4);
        hqr j5 = ((nf2) m22Var.e).j();
        this.g = j5;
        j5.a(this);
        aVar2.h(j5);
    }

    public final com.airbnb.lottie.utils.a a(Matrix matrix, int i) {
        float m = this.e.m() * 0.017453292f;
        float floatValue = this.f.f().floatValue();
        double d = m;
        float sin = ((float) Math.sin(d)) * floatValue;
        float cos = ((float) Math.cos(d + 3.141592653589793d)) * floatValue;
        float floatValue2 = this.g.f().floatValue();
        int intValue = this.c.f().intValue();
        int argb = Color.argb(Math.round((this.d.f().floatValue() * i) / 255.0f), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
        com.airbnb.lottie.utils.a aVar = new com.airbnb.lottie.utils.a();
        aVar.a = floatValue2 * 0.33f;
        aVar.b = sin;
        aVar.c = cos;
        aVar.d = argb;
        aVar.e = null;
        aVar.c(matrix);
        if (this.h == null) {
            this.h = new Matrix();
        }
        this.a.w.e().invert(this.h);
        aVar.c(this.h);
        return aVar;
    }

    public final void b(@Nullable a900<Float> a900Var) {
        hqr hqrVar = this.d;
        if (a900Var == null) {
            hqrVar.k(null);
        } else {
            hqrVar.k(new a(a900Var));
        }
    }

    @Override // xsna.tf6.a
    public final void i() {
        this.b.i();
    }
}
