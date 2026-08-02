package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.api.di.CatalogComponent;
import com.vk.catalog2.common.ui.mvp.holder.video.offline.di.component.impl.VideoCatalogComponentStubImpl;
import com.vk.contacts.e;
import com.vk.im.engine.di.sync.VkAppSynchronizationComponentImpl;
import com.vk.music.bottomsheets.promo.di.MusicBottomSheetComponentImpl;
import com.vk.tabbar.core.api.di.TabbarCoreComponent;
import com.vk.tabbar.settings.api.di.TabbarSettingsComponent;
import com.vk.tabbar.settings.impl.di.TabbarSettingsComponentImpl;
import com.vk.toggle.b;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.ImFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.clips.ClipsUploadSdkUiComponentVkApp;
import com.vkontakte.android.task.di.components.music.MusicStorageTypeComponentImpl;
import java.io.File;
import java.util.concurrent.ExecutorService;
import xsna.h850;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class z58 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ z58(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((TabbarCoreComponent) ((k7m) m7m.f(b68.b)).a(fpf0.a(TabbarCoreComponent.class))).y8();
            case 1:
                return new ClipsUploadSdkUiComponentVkApp.a();
            case 2:
                return new e.d();
            case 3:
                return new zlx0();
            case 4:
                vwv vwvVar = vwv.b;
                return 3;
            case 5:
                return ((TabbarSettingsComponent) ((k7m) m7m.f(new w7m())).a(fpf0.a(TabbarSettingsComponent.class))).tf();
            case 6:
                return new MusicBottomSheetComponentImpl.a();
            case 7:
                qcy<Object>[] qcyVarArr = MusicStorageTypeComponentImpl.d;
                return h850.a.a.getSTUB();
            case 8:
                FeedFeatures feedFeatures = FeedFeatures.COMPOSE_FOOTER;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 9:
                ExecutorService executorService = (ExecutorService) jgn0.e.getValue();
                io.reactivex.rxjava3.core.w wVar = io.reactivex.rxjava3.schedulers.a.a;
                return new io.reactivex.rxjava3.internal.schedulers.d(executorService, true);
            case 10:
                qcy<Object>[] qcyVarArr2 = TabbarSettingsComponentImpl.p;
                return new lun0();
            case 11:
                VKApplication.a aVar = VKApplication.c;
                return ((CatalogComponent) m7m.e().a(fpf0.a(CatalogComponent.class))).Ce();
            case 12:
                VKApplication.a aVar2 = VKApplication.c;
                fxc0.B().s().init();
                return s3q0.a;
            case 13:
                VideoFeatures videoFeatures = VideoFeatures.AVATAR_LIVE_BADGE_STAT;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 14:
                b.d i = com.vk.toggle.b.A.i(ImFeatures.FS_TRANSFER_RECOM_PAYLOAD);
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
            case 15:
                return new VideoCatalogComponentStubImpl.a();
            case 16:
                r55 r55Var = r55.a;
                return r55.j();
            case 17:
                qcy<Object>[] qcyVarArr3 = VkAppSynchronizationComponentImpl.c;
                a1w a1wVar = q1w.b;
                return new y0i0(a1wVar != null ? a1wVar : null);
            case 18:
                return (String) com.vk.core.apps.a.c("", "com.vk.SAFETY_NET_API_KEY");
            case 19:
                Context context = e43.a;
                return new File((context != null ? context : null).getFilesDir(), "vk_executors_watchdog_config");
            case 20:
                return new blg();
            case 21:
                return new ld8();
            case 22:
                com.vk.voip.ui.c.b.getClass();
                return com.vk.voip.ui.c.J().f();
            default:
                return new ajt();
        }
    }
}
