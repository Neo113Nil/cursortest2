package xsna;

/* compiled from: ShallowUiMenuInfo.kt */
/* loaded from: classes6.dex */
public final class q5j0 {
    public final int a;
    public final int b;
    public final a c;

    /* compiled from: ShallowUiMenuInfo.kt */
    public static abstract class a {
    }

    /* compiled from: ShallowUiMenuInfo.kt */
    public static final class b extends a {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("TintFromAttrRes(attrId="), this.a, ')');
        }
    }

    /* compiled from: ShallowUiMenuInfo.kt */
    public static final class c extends a {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("TintFromColorRes(colorId="), this.a, ')');
        }
    }

    public q5j0(int i, int i2, a aVar) {
        this.a = i;
        this.b = i2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5j0)) {
            return false;
        }
        q5j0 q5j0Var = (q5j0) obj;
        return this.a == q5j0Var.a && this.b == q5j0Var.b && epx.f(this.c, q5j0Var.c);
    }

    public final int hashCode() {
        int a2 = shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        a aVar = this.c;
        return a2 + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "ShallowUiMenuInfo(titleResId=" + this.a + ", iconResId=" + this.b + ", tint=" + this.c + ')';
    }
}
