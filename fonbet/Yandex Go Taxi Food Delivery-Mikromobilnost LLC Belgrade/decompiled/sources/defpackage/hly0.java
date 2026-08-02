package defpackage;

/* loaded from: classes10.dex */
public final class hly0 extends yky0 {
    public final String b;
    public final int c;
    public final tls d;

    public hly0(String str, tls tlsVar, int i, Object obj) {
        super(obj);
        this.b = str;
        this.c = i;
        this.d = tlsVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.a);
        sb.append(", label=\"");
        sb.append(this.b);
        sb.append("\", leadingIcon=");
        return oyr.s(sb, this.c, ')');
    }
}
