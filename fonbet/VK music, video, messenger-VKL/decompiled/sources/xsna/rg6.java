package xsna;

import androidx.annotation.Nullable;

/* compiled from: BaseMediaChunk.java */
/* loaded from: classes12.dex */
public abstract class rg6 extends aq10 {
    public final long k;
    public final long l;
    public tg6 m;
    public int[] n;

    public rg6(androidx.media3.datasource.a aVar, evk evkVar, androidx.media3.common.a aVar2, int i, @Nullable Object obj, long j, long j2, long j3, long j4, long j5) {
        super(aVar, evkVar, aVar2, i, obj, j, j2, j5);
        this.k = j3;
        this.l = j4;
    }

    public final int d(int i) {
        int[] iArr = this.n;
        iArr.getClass();
        return iArr[i];
    }
}
