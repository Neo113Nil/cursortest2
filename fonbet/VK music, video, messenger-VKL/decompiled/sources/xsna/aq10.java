package xsna;

import androidx.annotation.Nullable;

/* compiled from: MediaChunk.java */
/* loaded from: classes12.dex */
public abstract class aq10 extends ccc {
    public final long j;

    public aq10(androidx.media3.datasource.a aVar, evk evkVar, androidx.media3.common.a aVar2, int i, @Nullable Object obj, long j, long j2, long j3) {
        super(aVar, evkVar, 1, aVar2, i, obj, j, j2);
        aVar2.getClass();
        this.j = j3;
    }

    public long b() {
        long j = this.j;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    public abstract boolean c();
}
