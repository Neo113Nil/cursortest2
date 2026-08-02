package xsna;

/* compiled from: ClipsWrapperPayload.kt */
/* loaded from: classes17.dex */
public final class wsf<T> {
    public final String a;
    public final T b;

    public wsf(String str, T t) {
        this.a = str;
        this.b = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsf)) {
            return false;
        }
        wsf wsfVar = (wsf) obj;
        return epx.f(this.a, wsfVar.a) && epx.f(this.b, wsfVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        T t = this.b;
        return hashCode + (t == null ? 0 : t.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsWrapperPayload(wrapperId=");
        sb.append(this.a);
        sb.append(", payload=");
        return k73.c(sb, this.b, ')');
    }
}
