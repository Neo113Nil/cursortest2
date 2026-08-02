package defpackage;

/* loaded from: classes10.dex */
public class gy80 {
    public final Object a;

    public gy80(Object obj) {
        this.a = obj;
    }

    public Object a() {
        Object obj = this.a;
        d6z.n(obj instanceof fy80);
        return ((fy80) obj).a;
    }

    public void b(long j) {
        ((fy80) this.a).b = j;
    }

    public void c(int i) {
    }

    public void d(long j) {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gy80)) {
            return false;
        }
        return this.a.equals(((gy80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
