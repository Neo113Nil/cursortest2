package xsna;

/* compiled from: SemanticsProperties.kt */
/* loaded from: classes11.dex */
public final class fmk {
    public final String a;
    public final gzs<Boolean> b;

    public fmk(String str, gzs<Boolean> gzsVar) {
        this.a = str;
        this.b = gzsVar;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fmk)) {
            return false;
        }
        fmk fmkVar = (fmk) obj;
        return epx.f(this.a, fmkVar.a) && this.b == fmkVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAccessibilityAction(label=");
        sb.append(this.a);
        sb.append(", action=");
        return uf3.d(sb, this.b, ')');
    }
}
