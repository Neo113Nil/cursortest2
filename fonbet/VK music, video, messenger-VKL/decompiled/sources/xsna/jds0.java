package xsna;

import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.libvideo.design.view.fullscreen.VideoFullscreenBottomBarView;
import com.vk.libvideo.pip.v2.activity.VideoContainerActivityWithPip;
import com.vk.vmoji.character.recommendations.VmojiRecommendationsFragment;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vk.writebar.WriteBar;
import xsna.fzw0;
import xsna.naw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class jds0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jds0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = VideoContainerActivityWithPip.G;
                break;
            case 1:
                int i3 = VideoEditTimelineView.H;
                ((VideoEditTimelineView) obj).j5(null, null);
                break;
            case 2:
                int i4 = VideoFullscreenBottomBarView.l;
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                ((nm8) obj).f(Boolean.TRUE);
                break;
            case 8:
                ((VmojiRecommendationsFragment.b) obj).invoke(naw0.c.a.b);
                break;
            case 9:
                int i5 = VoipCallServiceFragment.Y;
                break;
            case 10:
                break;
            case 11:
                hzw0 hzw0Var = (hzw0) obj;
                hzw0Var.C(new fzw0.b(hzw0Var.g.b()));
                break;
            default:
                int i6 = WriteBar.h0;
                ((WriteBar) obj).V();
                break;
        }
        return s3q0.a;
    }
}
