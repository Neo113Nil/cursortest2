package xsna;

/* compiled from: IntRef.kt */
/* loaded from: classes11.dex */
public final class m9x {
    public int a;

    public m9x() {
        this(0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.a);
        sb.append(")@");
        int hashCode = hashCode();
        ro.d(16);
        sb.append(Integer.toString(hashCode, 16));
        return sb.toString();
    }

    public m9x(int i) {
        this.a = 0;
    }
}
