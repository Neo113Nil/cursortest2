package xsna;

import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.dialogtags.impl.list.TagsListState;
import com.vk.profile.questions.impl.QuestionsUsableRecyclerPaginatedView;
import com.vk.sharing.im_engine_impl.di.SharingImEngineScopedComponentImpl;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.ImFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.writebar.WriteBar;
import kotlin.collections.EmptyList;
import xsna.os20;
import xsna.s6o0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class vqe0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ vqe0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        WebViewEvent sendActivityDestroyed$lambda$17;
        boolean z = false;
        switch (this.b) {
            case 0:
                int i = QuestionsUsableRecyclerPaginatedView.U;
                return s3q0.a;
            case 1:
                return Long.valueOf(qni0.a());
            case 2:
                qcy<Object>[] qcyVarArr = SharingImEngineScopedComponentImpl.g;
                return new s84();
            case 3:
                return "1";
            case 4:
                return new l9n0();
            case 5:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_OPEN_STANDALONE_BOTTOMSHEET_BGR_VIEW;
                videoFeatures.getClass();
                if (com.vk.toggle.b.A.a(videoFeatures) && BuildInfo.s()) {
                    scn0.b.getClass();
                    if (Preference.j().getBoolean("video_background", true)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 6:
                return new TagsListState(EmptyList.b, null, null, 6, null);
            case 7:
                return (os20.a[]) rl3.m0(new os20.a[]{os20.a.e.a, os20.a.m.a, os20.a.h.a, os20.a.j.a, os20.a.f.a, os20.a.d.a, os20.a.l.a, os20.a.C3469a.a, os20.a.c.a, os20.a.b.a, os20.a.k.a, os20.a.i.a}, new s6o0.a()).toArray(new os20.a[0]);
            case 8:
                ComFeatures comFeatures = ComFeatures.COM_PROFILE_SUBSCRIBE;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 9:
                VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_RECOM_UI_FIX;
                videoFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures2));
            case 10:
                return new jgg();
            case 11:
                return new n5t0();
            case 12:
                VideoFeatures videoFeatures3 = VideoFeatures.VIDEO_NEW_SEEKBAR;
                videoFeatures3.getClass();
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                if (bVar.a(videoFeatures3)) {
                    VideoFeatures videoFeatures4 = VideoFeatures.VIDEO_NEW_SEEK_PREVIEW;
                    videoFeatures4.getClass();
                    if (bVar.a(videoFeatures4)) {
                        VideoFeatures videoFeatures5 = VideoFeatures.VIDEO_NEW_EXTEND_SEEK;
                        videoFeatures5.getClass();
                        if (bVar.a(videoFeatures5)) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 13:
                return Boolean.valueOf(SakFeatures.Type.VKC_SMARTFLOW_INTERNAL_ANDROID.h());
            case 14:
                return (kfv0) jfv0.m.getValue();
            case 15:
                return new aew0(o25.a());
            case 16:
                o2l.a.getClass();
                return Boolean.valueOf(o2l.b("__dbg_voip_v2_dump_audio", false));
            case 17:
                return new bvw0();
            case 18:
                com.vk.voip.ui.c.b.getClass();
                return Boolean.valueOf(!((Boolean) new eu2(18).invoke()).booleanValue());
            case 19:
                sendActivityDestroyed$lambda$17 = WebViewAdPlayer.sendActivityDestroyed$lambda$17();
                return sendActivityDestroyed$lambda$17;
            default:
                int i2 = WriteBar.h0;
                ImFeatures.GROUPS_MESSENGER_DISABLED.getClass();
                return Boolean.valueOf(!com.vk.toggle.b.A.a(r0));
        }
    }
}
