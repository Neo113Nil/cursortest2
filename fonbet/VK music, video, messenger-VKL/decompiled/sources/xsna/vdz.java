package xsna;

/* compiled from: LinksParserResult.kt */
/* loaded from: classes17.dex */
public final class vdz {
    public boolean a;

    public vdz() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vdz) && this.a == ((vdz) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("LinksParserResult(hasObsceneText="), this.a, ')');
    }

    public vdz(int i) {
        this.a = false;
    }
}
