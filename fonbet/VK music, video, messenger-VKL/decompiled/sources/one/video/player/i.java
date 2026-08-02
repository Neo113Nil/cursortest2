package one.video.player;

import android.os.Looper;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import one.video.player.OneVideoPlayer;
import xsna.vob;
import xsna.wo1;

/* compiled from: ForwardingHlsPlaylistListener.kt */
/* loaded from: classes8.dex */
public final class i implements OneVideoPlayer.b {
    public final CopyOnWriteArrayList<OneVideoPlayer.b> a = new CopyOnWriteArrayList<>();
    public final vob b = new vob((Looper) null);

    @Override // one.video.player.OneVideoPlayer.b
    public final void a(String str) {
        Iterator<OneVideoPlayer.b> it = this.a.iterator();
        while (it.hasNext()) {
            this.b.k(new wo1(5, it.next(), str));
        }
    }
}
