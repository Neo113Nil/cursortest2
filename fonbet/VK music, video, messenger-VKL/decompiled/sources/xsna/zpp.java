package xsna;

/* compiled from: EntityWithTrackcode.kt */
/* loaded from: classes2.dex */
public final class zpp<T> {
    public final T a;
    public final String b;

    public zpp(T t, String str) {
        this.a = t;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpp)) {
            return false;
        }
        zpp zppVar = (zpp) obj;
        return epx.f(this.a, zppVar.a) && epx.f(this.b, zppVar.b);
    }

    public final int hashCode() {
        T t = this.a;
        return this.b.hashCode() + ((t == null ? 0 : t.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EntityWithTrackcode(entity=");
        sb.append(this.a);
        sb.append(", trackcode=");
        return ho8.a(sb, this.b, ')');
    }
}
