package xsna;

import android.os.Handler;
import android.os.Looper;
import com.vk.clips.viewer.impl.di.ClipsViewersSdkComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.documents.impl.di.DocumentsComponentImpl;
import com.vk.ecomm.moderation.api.di.ModerationComponent$Companion$STUB$1;
import com.vk.games.model.GamesCatalogScreenTab;
import com.vk.newsfeed.common.views.header.PostHeaderAvatarV2View;
import com.vk.superapp.dating.sdk.js.bridge.impl.di.JsDatingSdkDelegateComponentImpl;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.R;
import one.video.player.BaseVideoPlayer;
import xsna.dai;
import xsna.y6p;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class te0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ te0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                VideoFeatures videoFeatures = VideoFeatures.WHITELIST_AD_PARAMS;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 1:
                return new StringBuffer();
            case 2:
                return io.reactivex.rxjava3.subjects.d.O0(y6p.a.a);
            case 3:
                vw3 vw3Var = BaseVideoPlayer.H;
                return new Exception();
            case 4:
                return new zzq(false);
            case 5:
                return OKVoipEngine.b.a();
            case 6:
                int i = ClipFeedListFragment.a2;
                return qsk0.a;
            case 7:
                qcy<Object>[] qcyVarArr = ClipsViewersSdkComponentImpl.l;
                return new zkh0();
            case 8:
                long d = f870.d(4284612846L);
                long d2 = f870.d(4281794739L);
                long d3 = f870.d(4278442694L);
                long d4 = f870.d(4278290310L);
                long j = l5g.d;
                long d5 = f870.d(4289724448L);
                long j2 = l5g.b;
                return new k9g(d, d2, d3, d4, j, j, d5, j, j2, j2, j2, j);
            case 9:
                return (m5w) m5w.c.getValue();
            case 10:
                ComFeatures comFeatures = ComFeatures.COM_NEW_MENU;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 11:
                ComFeatures comFeatures2 = ComFeatures.COM_NEW_MENU;
                comFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures2));
            case 12:
                return new dai.d();
            case 13:
                return s3q0.a;
            case 14:
                return s3q0.a;
            case 15:
                return new l2c0();
            case 16:
                qcy<Object>[] qcyVarArr2 = DocumentsComponentImpl.d;
                return new uun();
            case 17:
                return "writeEvent: can not write new events into append file";
            case 18:
                return new Handler(Looper.getMainLooper());
            case 19:
                return Integer.valueOf(GamesCatalogScreenTab.h().size());
            case 20:
                return new gko(R.drawable.vk_icon_add_circle_outline_28);
            case 21:
                return "#logout";
            case 22:
                return new s290();
            case 23:
                return new lsl0();
            case 24:
                qcy<Object>[] qcyVarArr3 = JsDatingSdkDelegateComponentImpl.b;
                return new z3y();
            case 25:
                qcy<Object>[] qcyVarArr4 = ModerationComponent$Companion$STUB$1.f;
                return new u530();
            case 26:
                return s3q0.a;
            case 27:
                return Boolean.valueOf(MusicFeatures.AUDIO_FORCE_BUFFERING_STATE.h());
            case 28:
                return Integer.valueOf(dhr0.t.c(R.attr.vk_ui_text_primary));
            default:
                int i2 = PostHeaderAvatarV2View.t;
                return Boolean.valueOf(fxc0.B().J().N1());
        }
    }
}
