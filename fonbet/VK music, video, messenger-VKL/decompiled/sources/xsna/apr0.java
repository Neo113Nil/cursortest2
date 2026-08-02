package xsna;

import androidx.compose.foundation.gestures.Orientation;
import xsna.tra0;

/* compiled from: TextFieldScroll.kt */
/* loaded from: classes11.dex */
public final class apr0 implements loy {
    public final xgo0 a;
    public final int b;
    public final klp0 c;
    public final gzs<mjo0> d;

    public apr0(xgo0 xgo0Var, int i, klp0 klp0Var, gzs<mjo0> gzsVar) {
        this.a = xgo0Var;
        this.b = i;
        this.c = klp0Var;
        this.d = gzsVar;
    }

    @Override // xsna.loy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        final tra0 N = zo10Var.N(o6j.b(0, j, 0, 0, Integer.MAX_VALUE, 7));
        final int min = Math.min(N.c, o6j.h(j));
        return ep10Var.Q(N.b, min, jgp.b, new izs() { // from class: xsna.zor0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                tra0.a aVar = (tra0.a) obj;
                apr0 apr0Var = apr0.this;
                int i = apr0Var.b;
                xgo0 xgo0Var = apr0Var.a;
                klp0 klp0Var = apr0Var.c;
                mjo0 invoke = apr0Var.d.invoke();
                ljo0 ljo0Var = invoke != null ? invoke.a : null;
                tra0 tra0Var = N;
                xgo0Var.a(Orientation.Vertical, vgo0.a(aVar, i, klp0Var, ljo0Var, false, tra0Var.b), min, tra0Var.c);
                tra0.a.x(aVar, tra0Var, 0, Math.round(-((vak0) xgo0Var.a).getFloatValue()));
                return s3q0.a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apr0)) {
            return false;
        }
        apr0 apr0Var = (apr0) obj;
        return epx.f(this.a, apr0Var.a) && this.b == apr0Var.b && epx.f(this.c, apr0Var.c) && epx.f(this.d, apr0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerticalScrollLayoutModifier(scrollerPosition=");
        sb.append(this.a);
        sb.append(", cursorOffset=");
        sb.append(this.b);
        sb.append(", transformedText=");
        sb.append(this.c);
        sb.append(", textLayoutResultProvider=");
        return uf3.d(sb, this.d, ')');
    }
}
