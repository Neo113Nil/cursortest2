package xsna;

import android.graphics.Rect;
import xsna.v2s;

/* compiled from: HardwareFoldingFeature.kt */
/* loaded from: classes12.dex */
public final class buu implements v2s {
    public final aa8 a;
    public final a b;
    public final v2s.b c;

    /* compiled from: HardwareFoldingFeature.kt */
    public static final class a {
        public static final a b = new a("FOLD");
        public static final a c = new a("HINGE");
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final String toString() {
            return this.a;
        }
    }

    public buu(aa8 aa8Var, a aVar, v2s.b bVar) {
        this.a = aa8Var;
        this.b = aVar;
        this.c = bVar;
        if (aa8Var.b() == 0 && aa8Var.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (aa8Var.a != 0 && aa8Var.b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    @Override // xsna.v2s
    public final boolean a() {
        a aVar = a.c;
        a aVar2 = this.b;
        if (epx.f(aVar2, aVar)) {
            return true;
        }
        return epx.f(aVar2, a.b) && epx.f(this.c, v2s.b.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!buu.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        buu buuVar = (buu) obj;
        return epx.f(this.a, buuVar.a) && epx.f(this.b, buuVar.b) && epx.f(this.c, buuVar.c);
    }

    @Override // xsna.pen
    public final Rect getBounds() {
        return this.a.c();
    }

    @Override // xsna.v2s
    public final v2s.a getOrientation() {
        aa8 aa8Var = this.a;
        return aa8Var.b() > aa8Var.a() ? v2s.a.c : v2s.a.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return buu.class.getSimpleName() + " { " + this.a + ", type=" + this.b + ", state=" + this.c + " }";
    }
}
