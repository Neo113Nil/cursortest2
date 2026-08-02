package xsna;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.upstream.Loader;

/* compiled from: Chunk.java */
/* loaded from: classes12.dex */
public abstract class ccc implements Loader.d {
    public final long a = bpz.g.getAndIncrement();
    public final evk b;
    public final int c;
    public final androidx.media3.common.a d;
    public final int e;

    @Nullable
    public final Object f;
    public final long g;
    public final long h;
    public final vyk0 i;

    public ccc(androidx.media3.datasource.a aVar, evk evkVar, int i, androidx.media3.common.a aVar2, int i2, @Nullable Object obj, long j, long j2) {
        this.i = new vyk0(aVar);
        this.b = evkVar;
        this.c = i;
        this.d = aVar2;
        this.e = i2;
        this.f = obj;
        this.g = j;
        this.h = j2;
    }

    public final long a() {
        return this.h - this.g;
    }
}
