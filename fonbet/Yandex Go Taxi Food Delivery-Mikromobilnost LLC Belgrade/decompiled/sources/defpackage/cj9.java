package defpackage;

/* loaded from: classes12.dex */
public final class cj9 extends zi9 {
    public final int a;
    public final int b;
    public boolean c;
    public int w;

    public cj9(char c, char c2, int i) {
        this.a = i;
        this.b = c2;
        boolean z = false;
        if (i <= 0 ? c >= c2 : c <= c2) {
            z = true;
        }
        this.c = z;
        this.w = z ? c : c2;
    }

    @Override // defpackage.zi9
    public final char a() {
        int i = this.w;
        if (i != this.b) {
            this.w = this.a + i;
        } else {
            if (!this.c) {
                ny61.p();
                return (char) 0;
            }
            this.c = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }
}
