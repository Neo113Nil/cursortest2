package xsna;

/* compiled from: FontVariation.kt */
/* loaded from: classes11.dex */
public final class z5s implements x5s {
    public final long a;

    public z5s(long j) {
        this.a = j;
    }

    @Override // xsna.x5s
    public final boolean a() {
        return true;
    }

    @Override // xsna.x5s
    public final String b() {
        return "opsz";
    }

    @Override // xsna.x5s
    public final float c(ezl ezlVar) {
        return ezlVar.c * fno0.d(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5s)) {
            return false;
        }
        z5s z5sVar = (z5s) obj;
        z5sVar.getClass();
        return fno0.b(this.a, z5sVar.a);
    }

    public final int hashCode() {
        gno0[] gno0VarArr = fno0.b;
        return Long.hashCode(this.a) + 105961720;
    }

    public final String toString() {
        return "FontVariation.Setting(axisName='opsz', value=" + ((Object) fno0.f(this.a)) + ')';
    }
}
