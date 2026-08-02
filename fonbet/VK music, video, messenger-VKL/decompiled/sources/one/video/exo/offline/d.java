package one.video.exo.offline;

import one.video.exo.offline.g;
import xsna.o7o;

/* compiled from: DownloadTracker.kt */
/* loaded from: classes11.dex */
public final class d implements g.a {
    public long a;
    public final /* synthetic */ c b;
    public final /* synthetic */ androidx.media3.exoplayer.offline.c c;

    public d(c cVar, androidx.media3.exoplayer.offline.c cVar2) {
        this.b = cVar;
        this.c = cVar2;
    }

    @Override // one.video.exo.offline.g.a
    public final void a() {
        c cVar = this.b;
        if (cVar.f.size() > 0) {
            long j = 0;
            for (o7o o7oVar : this.c.o) {
                cVar.g.put(o7oVar.a.b, new DownloadInfo(o7oVar));
                j += o7oVar.a();
            }
            if (this.a != j) {
                this.a = j;
                c.a(cVar);
            }
        }
    }
}
