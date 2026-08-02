package defpackage;

/* loaded from: classes4.dex */
public final class e6w implements yjg0 {
    public byte[] a;
    public int[] b;

    public e6w(byte[] bArr, int[] iArr) {
        this.a = bArr;
        this.b = iArr;
    }

    @Override // defpackage.yjg0
    public void a(xjg0 xjg0Var, int i) {
        int[] iArr = this.b;
        try {
            xjg0Var.read(this.a, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            xjg0Var.close();
        }
    }
}
