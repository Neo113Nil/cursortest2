package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.design.view.download.DownloadingView;
import com.vkontakte.android.R;

/* compiled from: MusicDownloadTrackHolder.kt */
/* loaded from: classes3.dex */
public final class ei40 extends cg40<MusicTrack> {
    public final DownloadingView o;

    public ei40(se50<MusicTrack> se50Var) {
        super(se50Var);
        this.o = (DownloadingView) bwt0.q(this.itemView, R.id.downloaded_state, null, 6);
    }

    @Override // xsna.se50
    public final void b6(Object obj) {
        MusicTrack musicTrack = (MusicTrack) obj;
        DownloadingView downloadingView = this.o;
        if (downloadingView != null) {
            bi40 a = di40.a(musicTrack.J);
            int i = DownloadingView.m;
            downloadingView.a(a, true);
        }
    }
}
