package defpackage;

/* loaded from: classes6.dex */
public final class ei41 {
    public final String a;
    public final boolean b;

    public ei41(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        fi41 fi41Var = obj instanceof fi41 ? (fi41) obj : null;
        return this.a.equals(fi41Var != null ? fi41Var.a : null);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g8e.p(this.a, ":", qoi0.a(getClass()).d());
    }
}
