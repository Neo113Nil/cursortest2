package xsna;

import android.view.View;
import android.widget.ImageView;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;

/* compiled from: MusicMagicWandTrackHolder.kt */
/* loaded from: classes3.dex */
public final class mn40 extends cg40<MusicTrack> {
    public final View o;
    public final ImageView p;
    public boolean q;

    public mn40(se50<MusicTrack> se50Var) {
        super(se50Var);
        this.o = bwt0.q(this.itemView, R.id.downloaded_state, null, 6);
        this.p = (ImageView) bwt0.q(this.itemView, R.id.magic_wand, null, 6);
    }

    @Override // xsna.se50
    public final void b6(Object obj) {
        this.q = epx.f(((MusicTrack) obj).J, DownloadingState.Downloaded.b);
    }

    @Override // xsna.se50
    public final void g6(String str, boolean z) {
        View view = this.o;
        boolean z2 = z && (view == null || view.getVisibility() != 0 || this.q);
        if (this.q && z2 && view != null) {
            view.setVisibility(8);
        }
        ImageView imageView = this.p;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }
}
