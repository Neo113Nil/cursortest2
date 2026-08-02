package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.photo.editor.features.mlenhance.TextSwitcherView;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class bem0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ bem0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new psl0();
            case 1:
                return new ban0();
            case 2:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_NO_VIDEO_COMMENT_ATTACH;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 3:
                int i = TextSwitcherView.h;
                return new Handler(Looper.getMainLooper());
            case 4:
                return new avl0();
            case 5:
                return lyd.b(1, 0, null, 6);
            case 6:
                return (ofv0) jfv0.o.getValue();
            case 7:
                return new zs20(R.dimen.music_vk_mix_interactive_height, R.dimen.music_vk_mix_interactive_play_margin, R.dimen.music_vk_mix_interactive_title_margin, R.dimen.music_vk_mix_interactive_title_margin_placeholder);
            default:
                o2l.a.getClass();
                return Boolean.valueOf(o2l.b("__dbg_voip_v2_show_mediastat", false));
        }
    }
}
