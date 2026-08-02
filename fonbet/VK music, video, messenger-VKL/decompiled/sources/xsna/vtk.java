package xsna;

import java.io.IOException;
import java.util.Arrays;
import xsna.b9v;

/* compiled from: DataChunk.java */
/* loaded from: classes12.dex */
public abstract class vtk extends ccc {
    public byte[] j;
    public volatile boolean k;

    @Override // androidx.media3.exoplayer.upstream.Loader.d
    public final void cancelLoad() {
        this.k = true;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.d
    public final void load() throws IOException {
        try {
            this.i.open(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.k) {
                byte[] bArr = this.j;
                if (bArr.length < i2 + 16384) {
                    this.j = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.i.read(this.j, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.k) {
                ((b9v.a) this).l = Arrays.copyOf(this.j, i2);
            }
            cvk.k(this.i);
        } catch (Throwable th) {
            cvk.k(this.i);
            throw th;
        }
    }
}
