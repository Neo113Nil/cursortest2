package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ch40 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Playlist c;

    public /* synthetic */ ch40(int i, Playlist playlist) {
        this.b = i;
        this.c = playlist;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                DownloadingState.PendingDownload pendingDownload = DownloadingState.PendingDownload.b;
                Playlist playlist = this.c;
                Playlist zb = Playlist.zb(playlist, null, null, null, pendingDownload, -1, 254);
                r5v0 r5v0Var = k840.a.h;
                if (r5v0Var == null) {
                    r5v0Var = null;
                }
                r5v0Var.b(new n8b0(playlist, zb));
                return s3q0.a;
            default:
                MusicTrack musicTrack = (MusicTrack) obj;
                return Boolean.valueOf((((musicTrack != null ? musicTrack.J : null) instanceof DownloadingState.Downloaded) && this.c.b == -1) ? false : true);
        }
    }
}
