package xsna;

import com.vk.articleeditor.impl.di.ArticleComponentImpl;
import com.vk.camera.clips.impl.di.CameraClipsComponentBase;
import com.vk.catalog2.feature.music.di.MusicCatalogComponentImpl;
import com.vk.clips.upload.vk.ui.impl.ClipsUploadUiVkComponentBase;
import com.vk.libvideo.adfree.impl.di.VideoAdFreeSubscriptionComponentImpl;
import com.vk.superapp.multiaccount.impl.MultiAccountComponentImpl;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.b;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.ImFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.music.MusicStorageTypeComponentImpl;
import xsna.qhd;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ug9 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ug9(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = CameraClipsComponentBase.i;
                qhd.a.getClass();
                return qhd.a.a();
            case 1:
                return new ClipsUploadUiVkComponentBase.a();
            case 2:
                return new ArticleComponentImpl.a();
            case 3:
                return new mel();
            case 4:
                return new ix4();
            case 5:
                return new MusicCatalogComponentImpl.a();
            case 6:
                qcy<Object>[] qcyVarArr2 = MusicStorageTypeComponentImpl.d;
                return new vg5();
            case 7:
                FeedFeatures feedFeatures = FeedFeatures.FRESH_NEWS_LOADER_FIX;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 8:
                try {
                    z = SakFeatures.Type.USERS_STORE_ONLY_CACHE.h();
                } catch (Throwable unused) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                VKApplication.a aVar = VKApplication.c;
                return (VideoShareComponent) m7m.e().a(fpf0.a(VideoShareComponent.class));
            case 10:
                VKApplication.a aVar2 = VKApplication.c;
                return m7m.e();
            case 11:
                qcy<Object>[] qcyVarArr3 = VideoAdFreeSubscriptionComponentImpl.g;
                return new czr0(new uft0());
            case 12:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_ADS_SUSPEND_TRIGGER;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 13:
                b.d i = com.vk.toggle.b.A.i(ImFeatures.IM_REVALIDATE_CAN_WRITE);
                if (i == null) {
                    return null;
                }
                if (!i.a) {
                    i = null;
                }
                if (i != null) {
                    return i.c.toString();
                }
                return null;
            case 14:
                return new MultiAccountComponentImpl.a(new s12(14));
            case 15:
                return new com.vk.billing.j();
            case 16:
                o2l.a.getClass();
                return Boolean.valueOf(o2l.b("__dbg_use_libverify_for_auth", true));
            case 17:
                VKApplication vKApplication = com.vk.core.apps.a.a;
                Boolean bool = (Boolean) com.vk.core.apps.a.c(Boolean.FALSE, "com.vk.is_strict_mode_enabled");
                bool.getClass();
                return bool;
            case 18:
                return new dlg();
            case 19:
                return s3q0.a;
            case 20:
                return new ysw(new vg20(), o25.a(), z4g.d());
            default:
                return new lit();
        }
    }

    public /* synthetic */ ug9(VKApplication vKApplication, int i) {
        this.b = i;
    }
}
