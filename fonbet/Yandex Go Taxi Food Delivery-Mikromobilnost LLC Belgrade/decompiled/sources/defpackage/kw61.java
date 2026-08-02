package defpackage;

/* loaded from: classes4.dex */
public final class kw61 {
    public int[] a;
    public byte[] b;
    public int c;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(int i) {
        int i2 = (i / 8) + (i % 8 == 0 ? 0 : 1);
        int i3 = 2048 - i2;
        int i4 = this.c;
        while (i4 <= i3) {
            for (int i5 = 0; i5 < i2; i5++) {
                if (this.b[i4 + i5] != 0) {
                    break;
                }
            }
            return i4;
        }
        return -1;
    }
}
