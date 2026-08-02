package xsna;

/* compiled from: SchemaInfoUtil.kt */
/* loaded from: classes12.dex */
public final class w7s implements Comparable<w7s> {
    public final int b;
    public final int c;
    public final String d;
    public final String e;

    public w7s(int i, int i2, String str, String str2) {
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(w7s w7sVar) {
        w7s w7sVar2 = w7sVar;
        int i = this.b - w7sVar2.b;
        return i == 0 ? this.c - w7sVar2.c : i;
    }
}
