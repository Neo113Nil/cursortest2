package xsna;

/* compiled from: TextMotion.android.kt */
/* loaded from: classes11.dex */
public final class zjo0 {
    public static final zjo0 c = new zjo0(2, false);
    public static final zjo0 d = new zjo0(1, true);
    public final int a;
    public final boolean b;

    /* compiled from: TextMotion.android.kt */
    @vby
    public static final class a {
        public final int a;

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.a == ((a) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            int i = this.a;
            return i == 1 ? "Linearity.Linear" : i == 2 ? "Linearity.FontHinting" : i == 3 ? "Linearity.None" : "Invalid";
        }
    }

    public zjo0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjo0)) {
            return false;
        }
        zjo0 zjo0Var = (zjo0) obj;
        return this.a == zjo0Var.a && this.b == zjo0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return equals(c) ? "TextMotion.Static" : equals(d) ? "TextMotion.Animated" : "Invalid";
    }
}
