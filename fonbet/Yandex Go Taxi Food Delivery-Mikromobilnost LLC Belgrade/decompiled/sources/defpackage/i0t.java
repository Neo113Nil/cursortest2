package defpackage;

/* loaded from: classes5.dex */
public final class i0t {
    public final f0t a;

    public i0t(f0t f0tVar) {
        this.a = f0tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !i0t.class.equals(obj.getClass())) {
            return false;
        }
        return this.a.equals(((i0t) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
