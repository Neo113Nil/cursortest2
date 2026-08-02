package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.Playlist;
import com.vk.log.L;

/* compiled from: PlaylistDownloadStateHandler.kt */
/* loaded from: classes3.dex */
public final class p8b0 {
    public final s6x a;
    public final u750 b;
    public Playlist c;

    public p8b0(Playlist playlist, s6x s6xVar, u750 u750Var) {
        this.a = s6xVar;
        this.b = u750Var;
        this.c = playlist;
    }

    public final void a(float f) {
        Playlist zb = Playlist.zb(this.c, null, null, null, new DownloadingState.Downloading(f), -1, 254);
        this.a.invoke(new n8b0(this.c, zb));
        this.c = zb;
    }

    public final void b(Throwable th) {
        Playlist zb = Playlist.zb(this.c, null, null, null, DownloadingState.NotLoaded.b, -1, 254);
        this.a.invoke(new n8b0(this.c, zb));
        this.c = zb;
        if (th != null) {
            L.i(th);
            i0q0.f(new l9(this, th));
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            this.b.t0(message);
        }
    }

    public final void c() {
        Playlist zb = Playlist.zb(this.c, null, null, null, DownloadingState.PartlyDownloaded.b, -1, 254);
        this.a.invoke(new n8b0(this.c, zb));
        this.c = zb;
    }
}
