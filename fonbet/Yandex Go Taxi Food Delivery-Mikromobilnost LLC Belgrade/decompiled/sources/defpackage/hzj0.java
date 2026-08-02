package defpackage;

/* loaded from: classes2.dex */
public final class hzj0 extends kzj0 {
    public final Throwable b;

    public hzj0(Throwable th) {
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
        return (obj instanceof hzj0) && this.b.equals(((hzj0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("Ssl(exception="), this.b, ')');
    }
}
