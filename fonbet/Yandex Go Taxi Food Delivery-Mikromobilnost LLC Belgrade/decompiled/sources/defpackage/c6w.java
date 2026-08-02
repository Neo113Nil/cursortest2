package defpackage;

/* loaded from: classes9.dex */
public final class c6w extends t5w {
    public final int a;
    public final int b;
    public boolean c;
    public int w;

    public c6w(int i, int i2, int i3) {
        this.a = i3;
        this.b = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.c = z;
        this.w = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // defpackage.t5w
    public final int nextInt() {
        int i = this.w;
        if (i != this.b) {
            this.w = this.a + i;
            return i;
        }
        if (this.c) {
            this.c = false;
            return i;
        }
        ny61.p();
        return 0;
    }
}
