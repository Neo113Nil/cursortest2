package xsna;

/* compiled from: ChaCha20.java */
/* loaded from: classes13.dex */
public final class rqa extends sqa {
    @Override // xsna.sqa
    public final int[] c(int i, int[] iArr) {
        if (iArr.length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = sqa.c;
        System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
        System.arraycopy(this.a, 0, iArr2, iArr3.length, 8);
        iArr2[12] = i;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }

    @Override // xsna.sqa
    public final int f() {
        return 12;
    }
}
