package xsna;

import android.content.Context;
import android.util.Size;
import androidx.media3.exoplayer.scheduler.PlatformScheduler;
import com.vk.core.view.components.formitem.VkTextArea;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.music.offline.impl.mediastore.download.service.OfflineMusicDownloadBoundService;
import com.vk.profile.user.impl.di.UserProfileParamsComponentImpl;
import com.vk.resetcounters.api.di.ResetCountersComponent$Companion$STUB$1;
import com.vk.sharing.im_engine_impl.di.SharingImEngineComponentImpl;
import com.vk.superapp.advertisement.di.sticky_banner_ad.StickyBannerAdFactoriesComponentImpl;
import com.vk.toggle.features.ContentFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.SoccomFeatures;
import com.vk.voip.ui.permissions.PictureInPicturePermissionFragment;
import com.vkontakte.android.R;
import java.util.concurrent.Executors;
import kotlinx.serialization.KSerializer;
import xsna.n1m0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class jo60 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ jo60(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new hm60();
            case 1:
                PlatformScheduler platformScheduler = OfflineMusicDownloadBoundService.w;
                Context context = e43.a;
                return ((OfflineAudioComponent) m7m.e().a(fpf0.a(OfflineAudioComponent.class))).P6();
            case 2:
                return new kll();
            case 3:
                return new p4r();
            case 4:
                SoccomFeatures soccomFeatures = SoccomFeatures.PRODUCT_CARD_RATING;
                soccomFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(soccomFeatures));
            case 5:
                qcy<Object>[] qcyVarArr = ResetCountersComponent$Companion$STUB$1.b;
                return new ResetCountersComponent$Companion$STUB$1.b();
            case 6:
                return new float[8];
            case 7:
                return s3q0.a;
            case 8:
                qcy<Object>[] qcyVarArr2 = SharingImEngineComponentImpl.m;
                return new k70();
            case 9:
                return Boolean.valueOf(com.vk.toggle.d.O());
            case 10:
                return s3q0.a;
            case 11:
                qcy<Object>[] qcyVarArr3 = StickyBannerAdFactoriesComponentImpl.b;
                return new cel0();
            case 12:
                ContentFeatures contentFeatures = ContentFeatures.STORY_VIEWER_SKIP_PREVIEW;
                contentFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(contentFeatures));
            case 13:
                return new n1m0.a();
            case 14:
                io.reactivex.rxjava3.disposables.c cVar = v9n0.e;
                if (cVar != null) {
                    cVar.dispose();
                }
                v9n0.e = null;
                v9n0.d = io.reactivex.rxjava3.subjects.d.N0();
                return s3q0.a;
            case 15:
                return s3q0.a;
            case 16:
                return s3q0.a;
            case 17:
                qcy<Object>[] qcyVarArr4 = UserProfileParamsComponentImpl.p;
                return new r0e0();
            case 18:
                return new ct2();
            case 19:
                return new s290();
            case 20:
                return new j500();
            case 21:
                return new s290();
            case 22:
                return Executors.newFixedThreadPool((Runtime.getRuntime().availableProcessors() * 2) - 1, new jeu0());
            case 23:
                return Boolean.valueOf(MusicFeatures.CATALOG_SINGLE_BANNER_FIX.h());
            case 24:
                return new rpj(fpf0.a(Size.class), null, new KSerializer[0]);
            case 25:
                return s3q0.a;
            case 26:
                int i = VkTextArea.r;
                return new int[]{R.attr.formItemStateError};
            case 27:
                return new PictureInPicturePermissionFragment();
            default:
                com.vk.voip.ui.c.b.getClass();
                return new iww0(com.vk.voip.ui.c.j0());
        }
    }
}
