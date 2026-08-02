package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.catalog.mvi.block.video.impl.p002short.ShortVideoListView;
import com.vk.catalog.mvi.block.video.impl.upload.video.bottomsheet.UploadingVideoBottomSheetState;
import com.vk.dto.user.UserProfile;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.qrcode.QRStatsTracker;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoUploadClick;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Landscape;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.controls.VerificationController;
import xsna.dhr0;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ume0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ume0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        ByteStringDataSource initialize$lambda$220$lambda$19;
        Boolean lambda$onCancel$2;
        nb30 nb30Var;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                z4g.d().i((Activity) obj2, null, ((UserProfile) obj).c.b, false);
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.a(QRStatsTracker.Action.SEND_MESSAGE);
                return s3q0.a;
            case 1:
                cl40.a((View) obj2, MusicHapticEvent.LIGHT);
                ((izs) obj).invoke(new sx40.t(PlayerContext.FULL, null));
                return s3q0.a;
            case 2:
                return ((SearchUiComponent) ((k7m) m7m.f((mqh0) obj2)).a(fpf0.a(SearchUiComponent.class))).W(new irh0(false, ((iqh0) obj).c(), 491));
            case 3:
                initialize$lambda$220$lambda$19 = ServiceProvider.initialize$lambda$220$lambda$19((UnityAdsModule) obj2, (ServicesRegistry) obj);
                return initialize$lambda$220$lambda$19;
            case 4:
                ((izs) obj2).invoke(new ShortVideoListView.d.b(((ShortVideoListView.e) obj).b));
                return s3q0.a;
            case 5:
                com.vk.clips.sdk.shared.item.static_ads.c cVar = (com.vk.clips.sdk.shared.item.static_ads.c) obj2;
                oqh0 oqh0Var = new oqh0(cVar, 5);
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                Lazy a = msy.a(lazyThreadSafetyMode, oqh0Var);
                return new cwk0(msy.a(lazyThreadSafetyMode, new xg2(12, cVar, (Context) obj)), msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.r(18, a, cVar)), a, new d14(27));
            case 6:
                ((g9m0) obj2).b((Context) obj);
                return s3q0.a;
            case 7:
                deq0 deq0Var = (deq0) obj2;
                int i2 = deq0Var.i1;
                dot0 dot0Var = deq0Var.h1;
                if (((UploadingVideoBottomSheetState) ((wh50) obj).getValue()).b) {
                    deq0.fo(MobileOfficialAppsVideoStat$TypeVideoUploadClick.EventType.CLICK_TO_DELETE_UPLOAD);
                    dot0Var.d(i2);
                } else {
                    deq0.fo(MobileOfficialAppsVideoStat$TypeVideoUploadClick.EventType.CLICK_TO_CANCEL_UPLOAD);
                    dot0Var.c(i2);
                }
                deq0Var.dismiss();
                return s3q0.a;
            case 8:
                UserProfileFragment userProfileFragment = (UserProfileFragment) obj2;
                int i3 = UserProfileFragment.p0;
                ?? r0 = userProfileFragment.j0;
                VkOnboardingCampaign e = ((q7v0) r0.getValue()).e((String) obj);
                if (e != null && ((q7v0) r0.getValue()).d(e)) {
                    com.vk.profile.user.impl.ui.i iVar = userProfileFragment.Q;
                    UserProfileHeaderView userProfileHeaderView = (iVar != null ? iVar : null).h.e;
                    bwt0.j(userProfileHeaderView.A, new pm90(7, userProfileHeaderView, e));
                }
                return s3q0.a;
            case 9:
                dhr0.a[] aVarArr = (dhr0.a[]) obj2;
                dhr0.b bVar = (dhr0.b) obj;
                if (aVarArr != null) {
                    if (aVarArr.length > 0) {
                        aVarArr[0].getClass();
                        throw null;
                    }
                    g5g.A(bVar.b, aVarArr);
                    bVar.f = true;
                }
                return s3q0.a;
            case 10:
                lambda$onCancel$2 = ((VerificationController) obj2).lambda$onCancel$2((VerificationApi.CancelReason) obj);
                return lambda$onCancel$2;
            case 11:
                ((e6s0) obj2).b((View) obj);
                return s3q0.a;
            default:
                com.vk.video.ui.discovery.minimizable.m mVar = (com.vk.video.ui.discovery.minimizable.m) obj2;
                tus0 tus0Var = (tus0) obj;
                nb30 c = mVar.c();
                if (c == DiscoveryScreenMotionStates$Landscape.Fullscreen) {
                    if (fxc0.B().J().x1()) {
                        nb30Var = DiscoveryScreenMotionStates$Landscape.FullscreenWithRightPromo;
                    } else if (fxc0.B().J().K0()) {
                        nb30Var = DiscoveryScreenMotionStates$Landscape.FullscreenWithBottomPromo;
                    }
                    if (!epx.f(nb30Var, c)) {
                        tus0Var.invoke();
                        mVar.r(nb30Var);
                    }
                    return s3q0.a;
                }
                nb30Var = c;
                if (!epx.f(nb30Var, c)) {
                }
                return s3q0.a;
        }
    }
}
