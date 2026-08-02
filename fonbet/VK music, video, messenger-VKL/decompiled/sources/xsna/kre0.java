package xsna;

import java.io.IOException;
import xsna.jre0;

/* compiled from: QueueFileLogStore.java */
/* loaded from: classes13.dex */
public final class kre0 implements jre0.d {
    public final /* synthetic */ byte[] a;
    public final /* synthetic */ int[] b;

    public kre0(byte[] bArr, int[] iArr) {
        this.a = bArr;
        this.b = iArr;
    }

    @Override // xsna.jre0.d
    public final void a(jre0.c cVar, int i) throws IOException {
        int[] iArr = this.b;
        try {
            cVar.read(this.a, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            cVar.close();
        }
    }
}
