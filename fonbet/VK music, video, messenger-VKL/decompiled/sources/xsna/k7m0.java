package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class k7m0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ n7m0 c;
    public final /* synthetic */ float[] d;

    public /* synthetic */ k7m0(int i, n7m0 n7m0Var, float[] fArr) {
        this.b = i;
        this.c = n7m0Var;
        this.d = fArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        while (true) {
            int i2 = this.b;
            n7m0 n7m0Var = this.c;
            if (i >= i2) {
                ((d7m0) n7m0Var.b).qj(n7m0Var.x);
                return;
            }
            if (i >= 0) {
                byte[] bArr = n7m0Var.x;
                if (i < bArr.length) {
                    bArr[i] = (byte) this.d[i];
                }
            }
            i++;
        }
    }
}
