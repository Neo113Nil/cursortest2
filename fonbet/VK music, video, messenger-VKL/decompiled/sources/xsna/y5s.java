package xsna;

/* compiled from: FontVariation.kt */
/* loaded from: classes11.dex */
public final class y5s implements x5s {
    public final int a;

    public y5s(int i) {
        this.a = i;
    }

    @Override // xsna.x5s
    public final boolean a() {
        return false;
    }

    @Override // xsna.x5s
    public final String b() {
        return "wght";
    }

    @Override // xsna.x5s
    public final float c(ezl ezlVar) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5s)) {
            return false;
        }
        y5s y5sVar = (y5s) obj;
        y5sVar.getClass();
        return this.a == y5sVar.a;
    }

    public final int hashCode() {
        return 113071012 + this.a;
    }

    public final String toString() {
        return vu5.b(new StringBuilder("FontVariation.Setting(axisName='wght', value="), this.a, ')');
    }
}
