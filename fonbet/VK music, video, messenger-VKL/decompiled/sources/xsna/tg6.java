package xsna;

import xsna.dcc;

/* compiled from: BaseMediaChunkOutput.java */
/* loaded from: classes12.dex */
public final class tg6 implements dcc.a {
    public final int[] a;
    public final androidx.media3.exoplayer.source.p[] b;

    public tg6(int[] iArr, androidx.media3.exoplayer.source.p[] pVarArr) {
        this.a = iArr;
        this.b = pVarArr;
    }

    public final rgp0 a(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                ahn.n("BaseMediaChunkOutput", "Unmatched track of type: " + i);
                return new k0n();
            }
            if (i == iArr[i2]) {
                return this.b[i2];
            }
            i2++;
        }
    }
}
