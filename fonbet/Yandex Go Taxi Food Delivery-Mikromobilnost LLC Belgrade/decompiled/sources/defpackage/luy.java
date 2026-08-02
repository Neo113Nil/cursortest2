package defpackage;

/* loaded from: classes11.dex */
public final class luy {
    public final Object a;
    public final String b;

    public luy(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final String a() {
        return this.b + "@" + System.identityHashCode(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof luy)) {
            return false;
        }
        luy luyVar = (luy) obj;
        return this.a == luyVar.a && this.b.equals(luyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (System.identityHashCode(this.a) * 31);
    }
}
