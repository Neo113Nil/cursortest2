package xsna;

/* compiled from: LayoutId.kt */
/* loaded from: classes11.dex */
final class boy extends d730<coy> {
    public final Object a;

    public boy(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof boy) && epx.f(this.a, ((boy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // xsna.d730
    public final coy r() {
        coy coyVar = new coy();
        coyVar.p = this.a;
        return coyVar;
    }

    @Override // xsna.d730
    public final void s(coy coyVar) {
        coyVar.p = this.a;
    }

    public final String toString() {
        return k73.c(new StringBuilder("LayoutIdElement(layoutId="), this.a, ')');
    }
}
