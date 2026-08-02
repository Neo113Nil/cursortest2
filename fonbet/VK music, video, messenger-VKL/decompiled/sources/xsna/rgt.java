package xsna;

/* compiled from: GapAnchor.kt */
/* loaded from: classes11.dex */
public final class rgt implements yy1 {
    public int a;

    public rgt(int i) {
        this.a = i;
    }

    @Override // xsna.yy1
    public final boolean a() {
        return this.a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        return h5s.c(this.a, " }", sb);
    }
}
