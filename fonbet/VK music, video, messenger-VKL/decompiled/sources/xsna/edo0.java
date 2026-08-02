package xsna;

/* compiled from: TextContextMenuData.android.kt */
/* loaded from: classes11.dex */
public final class edo0 extends uco0 {
    public final String b;
    public final int c;
    public final izs<jdo0, s3q0> d;

    /* JADX WARN: Multi-variable type inference failed */
    public edo0(Object obj, String str, int i, izs<? super jdo0, s3q0> izsVar) {
        super(obj);
        this.b = str;
        this.c = i;
        this.d = izsVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.a);
        sb.append(", label=\"");
        sb.append(this.b);
        sb.append("\", leadingIcon=");
        return vu5.b(sb, this.c, ')');
    }
}
