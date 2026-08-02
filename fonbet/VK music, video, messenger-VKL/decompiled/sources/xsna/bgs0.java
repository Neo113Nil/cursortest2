package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;

/* compiled from: VideoDiscoveryClipsHeaderDelegate.kt */
/* loaded from: classes7.dex */
public final class bgs0 extends p1u0<AboutVideoItem.f> {

    /* compiled from: VideoDiscoveryClipsHeaderDelegate.kt */
    public static final class a extends vfz<AboutVideoItem.f> {
        public final TextView l;

        public a(ViewGroup viewGroup) {
            super(bwt0.I(R.layout.video_discovery_header_item, viewGroup, false));
            this.l = (TextView) this.itemView.findViewById(R.id.title);
        }

        @Override // xsna.vfz
        public final void W5(AboutVideoItem.f fVar) {
            at.d(this.itemView, R.string.video_discovery_clips_header_title, this.l);
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.f> b(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.f;
    }
}
