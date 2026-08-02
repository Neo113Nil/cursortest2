package one.video.player;

import android.net.Uri;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import one.video.player.OneVideoPlayer;

/* compiled from: ForwardingTransferListener.kt */
/* loaded from: classes8.dex */
public final class k implements OneVideoPlayer.f {
    public final CopyOnWriteArrayList<OneVideoPlayer.f> a = new CopyOnWriteArrayList<>();

    @Override // one.video.player.OneVideoPlayer.f
    public final void a(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z, int i) {
        Iterator<OneVideoPlayer.f> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(oneVideoPlayer, uri, j, z, i);
        }
    }

    @Override // one.video.player.OneVideoPlayer.f
    public final void b(OneVideoPlayer oneVideoPlayer, String str, String str2) {
        Iterator<OneVideoPlayer.f> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b(oneVideoPlayer, str, str2);
        }
    }

    @Override // one.video.player.OneVideoPlayer.f
    public final void c(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z) {
        Iterator<OneVideoPlayer.f> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().c(oneVideoPlayer, uri, j, z);
        }
    }

    @Override // one.video.player.OneVideoPlayer.f
    public final void d(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z) {
        Iterator<OneVideoPlayer.f> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().d(oneVideoPlayer, uri, j, z);
        }
    }

    @Override // one.video.player.OneVideoPlayer.f
    public final void e(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z) {
        Iterator<OneVideoPlayer.f> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().e(oneVideoPlayer, uri, j, z);
        }
    }
}
