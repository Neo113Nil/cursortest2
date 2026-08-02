package xsna;

/* compiled from: CustomTypeAdapter.kt */
/* loaded from: classes6.dex */
public final class yok {
    public final Class<?> a;
    public final uay<?> b;

    public yok(Class<?> cls, uay<?> uayVar) {
        this.a = cls;
        this.b = uayVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yok)) {
            return false;
        }
        yok yokVar = (yok) obj;
        return epx.f(this.a, yokVar.a) && epx.f(this.b, yokVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTypeAdapter(type=" + this.a + ", serializer=" + this.b + ')';
    }
}
