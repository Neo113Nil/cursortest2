package defpackage;

/* loaded from: classes2.dex */
public final class gzj0 extends kzj0 {
    public final Throwable b;

    public gzj0(Throwable th) {
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
        return (obj instanceof gzj0) && jl40.l(this.b, ((gzj0) obj).b);
    }

    public final int hashCode() {
        Throwable th = this.b;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("Parse(exception="), this.b, ')');
    }
}
