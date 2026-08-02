package xsna;

/* compiled from: FilterItems.kt */
/* loaded from: classes18.dex */
public final class y1c<T> {
    public final String a;
    public final T b;
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public y1c(Object obj, String str, boolean z) {
        this.a = str;
        this.b = obj;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1c)) {
            return false;
        }
        y1c y1cVar = (y1c) obj;
        return epx.f(this.a, y1cVar.a) && epx.f(this.b, y1cVar.b) && this.c == y1cVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        T t = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (t == null ? 0 : t.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckboxItem(title=");
        sb.append(this.a);
        sb.append(", originalValue=");
        sb.append(this.b);
        sb.append(", isChecked=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
