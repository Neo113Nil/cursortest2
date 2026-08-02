package xsna;

/* compiled from: OnThemeDataChangeEvent.kt */
/* loaded from: classes2.dex */
public final class fc80 extends sxp {
    public final String b;

    public fc80(String str) {
        this.b = str;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fc80) && epx.f(this.b, ((fc80) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }

    public final String toString() {
        return i5s.a(new StringBuilder("OnThemeDataChangeEvent(themeId="), this.b, ", changerTag=null)");
    }
}
