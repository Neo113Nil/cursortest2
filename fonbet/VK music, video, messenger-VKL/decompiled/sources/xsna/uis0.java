package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.embedded_players.ui.fragments.VideoEmbedFragment;
import com.vk.libvideo.embedded_players.youtube.PlayerConstants$PlayerState;

/* compiled from: VideoEmbedFragment.kt */
/* loaded from: classes14.dex */
public final class uis0 implements s5y0 {
    public final /* synthetic */ VideoEmbedFragment a;
    public final /* synthetic */ String b;

    /* compiled from: VideoEmbedFragment.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayerConstants$PlayerState.values().length];
            try {
                iArr[PlayerConstants$PlayerState.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerConstants$PlayerState.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayerConstants$PlayerState.ENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public uis0(VideoEmbedFragment videoEmbedFragment, String str) {
        this.a = videoEmbedFragment;
        this.b = str;
    }

    @Override // xsna.s5y0
    public final void a() {
        o5y0 o5y0Var = this.a.e0;
        if (o5y0Var != null) {
            o5y0Var.c(o5y0Var.a, "loadVideo", this.b, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        }
    }

    @Override // xsna.s5y0
    public final void b(PlayerConstants$PlayerState playerConstants$PlayerState) {
        View view;
        int i = a.$EnumSwitchMapping$0[playerConstants$PlayerState.ordinal()];
        VideoEmbedFragment videoEmbedFragment = this.a;
        if (i == 1) {
            View view2 = videoEmbedFragment.getView();
            if (view2 != null) {
                view2.setKeepScreenOn(true);
                return;
            }
            return;
        }
        if ((i == 2 || i == 3) && (view = videoEmbedFragment.getView()) != null) {
            view.setKeepScreenOn(false);
        }
    }
}
