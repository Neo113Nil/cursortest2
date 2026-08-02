package defpackage;

/* loaded from: classes9.dex */
public final class mi9 extends ni9 {
    public final Throwable a;

    public mi9(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mi9) {
            return jl40.l(this.a, ((mi9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.ni9
    public final String toString() {
        return unr0.s(new StringBuilder("Closed("), this.a, ')');
    }
}
