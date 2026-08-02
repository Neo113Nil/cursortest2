package yads;

/* loaded from: classes10.dex */
public final class vb1 {
    public int a = 0;
    public int b = -1;
    public int c = 0;
    public int[] d = new int[16];
    public int e = 15;

    public final void a(int i) {
        int i2 = this.c;
        int[] iArr = this.d;
        if (i2 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i3 = this.a;
            int i4 = length2 - i3;
            System.arraycopy(iArr, i3, iArr2, 0, i4);
            System.arraycopy(this.d, 0, iArr2, i4, i3);
            this.a = 0;
            this.b = this.c - 1;
            this.d = iArr2;
            this.e = length - 1;
        }
        int i5 = (this.b + 1) & this.e;
        this.b = i5;
        this.d[i5] = i;
        this.c++;
    }
}
