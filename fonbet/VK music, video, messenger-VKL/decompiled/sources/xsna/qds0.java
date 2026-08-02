package xsna;

import android.view.ViewGroup;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.ui.VideoBottomBarView;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import one.video.exo.offline.DownloadInfo;
import xsna.eao;

/* compiled from: VideoControlsDelegate.kt */
/* loaded from: classes7.dex */
public final class qds0 extends p1u0<AboutVideoItem.g> {
    public final c4 a;
    public final egs0 b;

    /* compiled from: VideoControlsDelegate.kt */
    public static final class a extends qf6 {
        public final c4 l;
        public AboutVideoItem.g m;
        public final VideoBottomBarView n;

        public a(ViewGroup viewGroup, c4 c4Var, egs0 egs0Var) {
            super(viewGroup, R.layout.video_controls_bar, egs0Var);
            this.l = c4Var;
            VideoBottomBarView videoBottomBarView = (VideoBottomBarView) this.itemView.findViewById(R.id.video_bottom_bar);
            this.n = videoBottomBarView;
            f4m.s(iah0.a(4), this.itemView);
            if (!fnj.d(this.itemView.getContext())) {
                f4m.r(iah0.a(1), this.itemView);
            }
            VideoFeatures videoFeatures = VideoFeatures.NEW_FULLSCREEN_REDESIGN_DISCOVERY;
            videoFeatures.getClass();
            videoBottomBarView.setIsDiscoveryRedesignEnabled(com.vk.toggle.b.A.a(videoFeatures));
            videoBottomBarView.setButtonsOnClickListener(new hn2(this, 12));
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(hfz hfzVar) {
            AboutVideoItem.g gVar = (AboutVideoItem.g) hfzVar;
            this.m = gVar;
            VideoFile videoFile = gVar.j;
            VideoBottomBarView videoBottomBarView = this.n;
            videoBottomBarView.a(videoFile);
            eao eaoVar = gVar.e;
            DownloadInfo downloadInfo = eaoVar instanceof eao.a ? ((eao.a) eaoVar).a : null;
            if (fxc0.B().s().isEnabled()) {
                videoBottomBarView.i.c(gpt0.F(downloadInfo), downloadInfo != null ? downloadInfo.a : null);
            }
        }
    }

    public qds0(c4 c4Var, egs0 egs0Var) {
        this.a = c4Var;
        this.b = egs0Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.g> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a, this.b);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.g;
    }
}
