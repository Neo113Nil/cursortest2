package xsna;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public final class yi01 extends hh01 {
    public final byte[] e;

    public yi01(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.e = bArr;
    }

    @Override // xsna.hh01
    public final byte[] f() {
        return this.e;
    }
}
