package xsna;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.catalog2.common.dto.ui.UIBlockTopshelf;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoTopshelfVh;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.b;
import com.vkontakte.android.R;

/* compiled from: TopshelfNewsView.kt */
/* loaded from: classes16.dex */
public final class icp0 extends tcp0 {
    public final zbp0 s;
    public final s2f t;
    public final ClipsRouter u;

    public icp0(zbp0 zbp0Var, s2f s2fVar, ClipsRouter clipsRouter, g7s0 g7s0Var, tu10 tu10Var, UIBlockTopshelf.TopshelfNews topshelfNews, bi80 bi80Var, VideoTopshelfVh.d dVar, gzs gzsVar, boolean z) {
        super(topshelfNews, g7s0Var, tu10Var, bi80Var, zbp0Var, dVar, gzsVar, z);
        this.s = zbp0Var;
        this.t = s2fVar;
        this.u = clipsRouter;
    }

    @Override // xsna.tcp0, xsna.jp6
    public final void d(ConstraintLayout constraintLayout) {
        super.d(constraintLayout);
        c(new w4j0(constraintLayout.getContext()), null);
        int a = e3m.a(this.s.e ? R.dimen.video_topshelf_tablet_margins_horizontal : R.dimen.video_topshelf_content_margin_horizontal, constraintLayout.getContext());
        ic60 ic60Var = new ic60(constraintLayout.getContext(), new ni0(23, constraintLayout, this));
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_play_24);
        int[] iArr = VkButton.W;
        VkButton vkButton = ic60Var.a;
        vkButton.a5(true, valueOf);
        vkButton.setText(R.string.topshelf_news_clips_watch);
        wbp0.b(ic60Var, new cwa(constraintLayout, a, 2));
        c(ic60Var, null);
        vbp0 dc60Var = new dc60(constraintLayout.getContext(), this.d);
        wbp0.b(dc60Var, new ka90(ic60Var, a, 1));
        c(dc60Var, null);
    }

    @Override // xsna.tcp0
    public final yg5 e(UIBlockTopshelf.TopshelfItem topshelfItem) {
        VideoFile videoFile = topshelfItem.c;
        yg5 yg5Var = null;
        if (videoFile != null) {
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            yg5Var = b.C1208b.a().e(videoFile, null);
        }
        if (yg5Var != null) {
            yg5Var.q0(this.s.d);
        }
        return yg5Var;
    }
}
