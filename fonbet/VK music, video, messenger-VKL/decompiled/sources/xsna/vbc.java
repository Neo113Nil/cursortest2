package xsna;

/* compiled from: ChromaFormat.java */
/* loaded from: classes13.dex */
public final class vbc {
    public static final vbc d = new vbc(0, 0, 0);
    public static final vbc e = new vbc(1, 2, 2);
    public static final vbc f = new vbc(2, 2, 1);
    public static final vbc g = new vbc(3, 1, 1);
    public final int a;
    public final int b;
    public final int c;

    public vbc(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChromaFormat{\nid=");
        sb.append(this.a);
        sb.append(",\n subWidth=");
        sb.append(this.b);
        sb.append(",\n subHeight=");
        return vu5.b(sb, this.c, '}');
    }
}
