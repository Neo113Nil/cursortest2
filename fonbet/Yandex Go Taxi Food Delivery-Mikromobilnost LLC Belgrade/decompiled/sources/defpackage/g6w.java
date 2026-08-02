package defpackage;

/* loaded from: classes.dex */
public final class g6w {
    public int a;

    public g6w(int i) {
        this.a = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.a);
        sb.append(")@");
        int hashCode = hashCode();
        rza.a(16);
        sb.append(Integer.toString(hashCode, 16));
        return sb.toString();
    }

    public g6w() {
        this(0);
    }
}
