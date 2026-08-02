package defpackage;

/* loaded from: classes10.dex */
public final class gzz implements c6e0 {
    public final hzz a;
    public int b;
    public Class c;

    public gzz(hzz hzzVar) {
        this.a = hzzVar;
    }

    @Override // defpackage.c6e0
    public final void a() {
        this.a.Kg(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gzz) {
            gzz gzzVar = (gzz) obj;
            if (this.b == gzzVar.b && this.c == gzzVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b * 31;
        Class cls = this.c;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.b + "array=" + this.c + '}';
    }
}
