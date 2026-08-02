package defpackage;

/* loaded from: classes15.dex */
public final class lqp0 extends crp0 {
    public final String c;

    public lqp0(String str) {
        super("LoadingImageFromTesting");
        this.c = str;
    }

    @Override // defpackage.crp0
    public final Object c() {
        return null;
    }

    @Override // defpackage.crp0
    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lqp0) && this.c.equals(((lqp0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode() * 31;
    }

    public final String toString() {
        return oyr.p("LoadingImageFromTesting(url=", this.c, ", payload=null)");
    }
}
