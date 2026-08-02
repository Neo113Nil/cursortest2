package xsna;

import android.graphics.Bitmap;

/* compiled from: TextEditState.kt */
/* loaded from: classes4.dex */
public final class veo0 implements nwx {
    public final gfo0 a;
    public final gfo0 b;
    public final wlo0 c;
    public final a d;
    public final a e;
    public final xeo0 f;

    /* compiled from: TextEditState.kt */
    public interface a {

        /* compiled from: TextEditState.kt */
        /* renamed from: xsna.veo0$a$a, reason: collision with other inner class name */
        public static final class C3885a implements a {
            public static final C3885a a = new C3885a();
        }

        /* compiled from: TextEditState.kt */
        public static final class b implements a {
            public static final b a = new b();
        }

        /* compiled from: TextEditState.kt */
        public static final class c implements a {
            public static final c a = new c();
        }

        /* compiled from: TextEditState.kt */
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
                return "Pipette(bitmap=" + this.a + ")";
            }
        }
    }

    public veo0(gfo0 gfo0Var, gfo0 gfo0Var2, wlo0 wlo0Var, a aVar, a aVar2, xeo0 xeo0Var) {
        this.a = gfo0Var;
        this.b = gfo0Var2;
        this.c = wlo0Var;
        this.d = aVar;
        this.e = aVar2;
        this.f = xeo0Var;
    }

    public static veo0 a(veo0 veo0Var, gfo0 gfo0Var, gfo0 gfo0Var2, wlo0 wlo0Var, a aVar, a aVar2, int i) {
        if ((i & 1) != 0) {
            gfo0Var = veo0Var.a;
        }
        gfo0 gfo0Var3 = gfo0Var;
        if ((i & 2) != 0) {
            gfo0Var2 = veo0Var.b;
        }
        gfo0 gfo0Var4 = gfo0Var2;
        if ((i & 4) != 0) {
            wlo0Var = veo0Var.c;
        }
        return new veo0(gfo0Var3, gfo0Var4, wlo0Var, aVar, aVar2, veo0Var.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof veo0)) {
            return false;
        }
        veo0 veo0Var = (veo0) obj;
        return epx.f(this.a, veo0Var.a) && epx.f(this.b, veo0Var.b) && epx.f(this.c, veo0Var.c) && epx.f(this.d, veo0Var.d) && epx.f(this.e, veo0Var.e) && epx.f(this.f, veo0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextEditState(defaultEditableData=" + this.a + ", currentEditableData=" + this.b + ", textState=" + this.c + ", prevState=" + this.d + ", currentState=" + this.e + ", textEditVariants=" + this.f + ")";
    }
}
