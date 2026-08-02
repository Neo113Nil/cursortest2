package xsna;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.List;

/* compiled from: GraffitiState.kt */
/* loaded from: classes15.dex */
public final class cdu implements km50 {
    public final int b;
    public final List<vlo> c;
    public final a d;
    public final rho e;
    public final a f;
    public final ghq0 g;

    /* compiled from: GraffitiState.kt */
    public interface a {

        /* compiled from: GraffitiState.kt */
        /* renamed from: xsna.cdu$a$a, reason: collision with other inner class name */
        public static final class C2659a implements a {
            public static final C2659a a = new C2659a();
        }

        /* compiled from: GraffitiState.kt */
        public static final class b implements a {
            public static final b a = new b();
        }

        /* compiled from: GraffitiState.kt */
        public static final class c implements a {
            public static final c a = new c();
        }

        /* compiled from: GraffitiState.kt */
        public static final class d implements a {
            public final Bitmap a;

            public d(Bitmap bitmap) {
                this.a = bitmap;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                Bitmap bitmap = this.a;
                if (bitmap == null) {
                    return 0;
                }
                return bitmap.hashCode();
            }

            public final String toString() {
                return qr.c(new StringBuilder("Pipette(bitmap="), this.a, ')');
            }
        }
    }

    public cdu() {
        this(0);
    }

    public static cdu a(cdu cduVar, int i, List list, a aVar, rho rhoVar, a aVar2, ghq0 ghq0Var, int i2) {
        if ((i2 & 1) != 0) {
            i = cduVar.b;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            list = cduVar.c;
        }
        List list2 = list;
        if ((i2 & 4) != 0) {
            aVar = cduVar.d;
        }
        a aVar3 = aVar;
        if ((i2 & 8) != 0) {
            rhoVar = cduVar.e;
        }
        rho rhoVar2 = rhoVar;
        if ((i2 & 16) != 0) {
            aVar2 = cduVar.f;
        }
        a aVar4 = aVar2;
        if ((i2 & 32) != 0) {
            ghq0Var = cduVar.g;
        }
        cduVar.getClass();
        return new cdu(i3, list2, aVar3, rhoVar2, aVar4, ghq0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdu)) {
            return false;
        }
        cdu cduVar = (cdu) obj;
        return this.b == cduVar.b && epx.f(this.c, cduVar.c) && epx.f(this.d, cduVar.d) && epx.f(this.e, cduVar.e) && epx.f(this.f, cduVar.f) && epx.f(this.g, cduVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + fw3.a(Integer.hashCode(this.b) * 31, 31, this.c)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GraffitiState(currentIndex=" + this.b + ", history=" + this.c + ", prevState=" + this.d + ", drawConfiguration=" + this.e + ", currentState=" + this.f + ", userData=" + this.g + ')';
    }

    public cdu(int i, List<vlo> list, a aVar, rho rhoVar, a aVar2, ghq0 ghq0Var) {
        this.b = i;
        this.c = list;
        this.d = aVar;
        this.e = rhoVar;
        this.f = aVar2;
        this.g = ghq0Var;
    }

    public cdu(int i) {
        this(0, Collections.singletonList(new vlo((kif0) null, 3)), a.c.a, new rho(0), a.b.a, new ghq0(null, null));
    }
}
