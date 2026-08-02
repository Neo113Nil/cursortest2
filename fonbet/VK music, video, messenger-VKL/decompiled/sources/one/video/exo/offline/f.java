package one.video.exo.offline;

import one.video.exo.offline.e;

/* compiled from: DownloadTracksSelection.kt */
/* loaded from: classes8.dex */
public final class f {
    public final e<one.video.player.tracks.c> a;
    public final e.a b;
    public final e<one.video.player.tracks.b> c;

    public f() {
        this((e.c) null, (e.c) null, 7);
    }

    public f(e eVar, e.a aVar, e eVar2) {
        this.a = eVar;
        this.b = aVar;
        this.c = eVar2;
    }

    public f(e.c cVar, e.c cVar2, int i) {
        this((i & 1) != 0 ? new e.a() : cVar, new e.a(), (i & 4) != 0 ? new e.a() : cVar2);
    }
}
