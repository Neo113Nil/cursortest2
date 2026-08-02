package yads;

/* loaded from: classes10.dex */
public final class pg1 {
    public final Object a;
    public dw0 b = new dw0();
    public boolean c;
    public boolean d;

    public pg1(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pg1.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((pg1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
