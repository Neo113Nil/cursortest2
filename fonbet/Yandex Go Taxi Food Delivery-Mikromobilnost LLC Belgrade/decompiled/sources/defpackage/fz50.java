package defpackage;

/* loaded from: classes11.dex */
public final class fz50 {
    public static final fz50 b = new fz50("GET");
    public static final fz50 c = new fz50("POST");
    public final String a;

    public fz50(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fz50) && jl40.l(this.a, ((fz50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
