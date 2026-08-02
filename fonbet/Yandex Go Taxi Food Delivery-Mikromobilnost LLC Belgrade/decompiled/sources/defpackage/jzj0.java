package defpackage;

/* loaded from: classes2.dex */
public final class jzj0 extends kzj0 {
    public final Throwable b;

    public jzj0(Throwable th) {
        super(th);
        this.b = th;
    }

    @Override // defpackage.kzj0
    public final Throwable a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jzj0) && jl40.l(this.b, ((jzj0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("Unknown(exception="), this.b, ')');
    }
}
