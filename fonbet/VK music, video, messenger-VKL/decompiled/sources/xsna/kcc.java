package xsna;

import androidx.media3.exoplayer.upstream.b;
import java.io.IOException;
import java.util.List;

/* compiled from: ChunkSource.java */
/* loaded from: classes12.dex */
public interface kcc {
    long a(long j, o3i0 o3i0Var);

    boolean b(ccc cccVar, boolean z, b.c cVar, androidx.media3.exoplayer.upstream.b bVar);

    boolean c(long j, ccc cccVar, List<? extends aq10> list);

    void e(ccc cccVar);

    void g(androidx.media3.exoplayer.f fVar, long j, List<? extends aq10> list, ecc eccVar);

    int getPreferredQueueSize(long j, List<? extends aq10> list);

    void maybeThrowError() throws IOException;

    void release();
}
