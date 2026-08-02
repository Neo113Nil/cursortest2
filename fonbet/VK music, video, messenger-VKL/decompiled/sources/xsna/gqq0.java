package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.onboarding.dto.OnboardingCampaignItemDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.hints.HintId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vk.voip.ui.scheduled.creation.ui.fragment.VoipCreateScheduleCallFragment;
import com.vk.voip.ui.whiteboard.presentation.main.ui.b;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.brw0;
import xsna.nww0;
import xsna.tj50;
import xsna.uu1;
import xsna.yow0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class gqq0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gqq0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Bitmap bitmap;
        switch (this.b) {
            case 0:
                slq0 slq0Var = (slq0) this.c;
                int i = UserProfileHeaderView.G;
                slq0Var.a(UserProfileAction.m.h.b);
                return s3q0.a;
            case 1:
                ((VideoRelatedVideosFragment) this.c).b0 = null;
                return s3q0.a;
            case 2:
                dw20 dw20Var = ((yit0) this.c).b;
                if (dw20Var != null) {
                    String str = dw20.d1;
                    dw20Var.Sn(null);
                }
                return s3q0.a;
            case 3:
                return sqt0.a((sqt0) this.c, (com.vk.fullscreenvideo.a) obj);
            case 4:
                xqo xqoVar = (xqo) this.c;
                ggj ggjVar = (ggj) obj;
                yq9 a = ggjVar.a0().a();
                ulo uloVar = (ulo) ((zak0) xqoVar.g).getValue();
                if (uloVar != null && (bitmap = uloVar.c) != null) {
                    Canvas canvas = e52.a;
                    ((d52) a).a.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
                }
                ggjVar.s1();
                return s3q0.a;
            case 5:
                lkr0 lkr0Var = ((j9u0) this.c).a;
                if (lkr0Var != null) {
                    lkr0Var.a();
                }
                return s3q0.a;
            case 6:
                ((com.vk.auth.ui.password.askpassword.a) this.c).b.I();
                return s3q0.a;
            case 7:
                ihu0 ihu0Var = (ihu0) this.c;
                Throwable th = (Throwable) obj;
                if (ihu0Var.e.h() && (th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == 1259) {
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    (superappUiRouterBridge != null ? superappUiRouterBridge : null).j(((ggu0) ihu0Var.h.c).b.getString(R.string.vk_apps_game_menu_limit_reached));
                }
                return s3q0.a;
            case 8:
                awi0 awi0Var = (awi0) this.c;
                List<OnboardingCampaignItemDto> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (OnboardingCampaignItemDto onboardingCampaignItemDto : list) {
                    arrayList.add(new VkOnboardingCampaign(onboardingCampaignItemDto.f(), onboardingCampaignItemDto.d(), onboardingCampaignItemDto.e()));
                }
                s7v0 s7v0Var = (s7v0) awi0Var.c;
                s7v0Var.b = arrayList;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"VkOnboardingSdk", "loaded campaigns: " + s7v0Var.b});
                }
                s7v0Var.e.compareAndSet(true, false);
                synchronized (s7v0Var.c) {
                    while (!s7v0Var.c.isEmpty()) {
                        ((gzs) s7v0Var.c.remove(0)).invoke();
                    }
                }
                return s3q0.a;
            case 9:
                return rsg0.y0(new if20(((ijp0) this.c).a, (String) null), null, null, 3);
            case 10:
                VoipCreateScheduleCallFragment voipCreateScheduleCallFragment = (VoipCreateScheduleCallFragment) this.c;
                nww0 nww0Var = (nww0) obj;
                int i2 = VoipCreateScheduleCallFragment.S;
                Context mo2getContext = voipCreateScheduleCallFragment.mo2getContext();
                if (mo2getContext != null) {
                    if (!epx.f(nww0Var, nww0.a.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cvk.w(mo2getContext.getString(R.string.voip_schedule_call_invalid_start_time), false);
                }
                return s3q0.a;
            case 11:
                ((wow0) this.c).T(new yow0.b.a((Throwable) obj));
                return s3q0.a;
            case 12:
                qqw0 qqw0Var = (qqw0) this.c;
                int i3 = qqw0.j1;
                if (!(((brw0) obj) instanceof brw0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                enj.q(R.string.common_network_error, 0, qqw0Var.requireContext());
                return s3q0.a;
            case 13:
                otw0 otw0Var = (otw0) this.c;
                int i4 = otw0.i1;
                dhw0 dhw0Var = (dhw0) ((it80) obj).a;
                return Boolean.valueOf(otw0Var.Yn(dhw0Var != null ? dhw0Var.s : null));
            case 14:
                fbx0 fbx0Var = (fbx0) this.c;
                ((Boolean) obj).booleanValue();
                fbx0Var.c = false;
                fbx0Var.b(null);
                fbx0Var.b.b(HintId.WARMUP_ONBOARDING_TOOLTIP.getId());
                return s3q0.a;
            case 15:
                xlx0 xlx0Var = (xlx0) this.c;
                tj50.a aVar = (tj50.a) obj;
                tlx0 tlx0Var = tlx0.b;
                ao8 ao8Var = ao8.d;
                return new b.a(aVar.a(tlx0Var, ao8Var), aVar.a(ulx0.b, ao8Var), aVar.a(vlx0.b, ao8Var), aVar.a(new wlx0(1, xlx0Var, xlx0.class, "composeWhiteboardState", "composeWhiteboardState(Lcom/vk/voip/ui/whiteboard/presentation/main/feature/WhiteboardFeatureState;)Lcom/vk/voip/ui/whiteboard/presentation/main/ui/WhiteboardViewState$WhiteboardViewState;", 0), ao8Var));
            default:
                com.vk.superapp.widget_settings.p004new.b bVar = (com.vk.superapp.widget_settings.p004new.b) this.c;
                uu1.b bVar2 = ((uu1) obj).a;
                bVar.f = bVar2;
                bVar.h = bVar2.a;
                ArrayList arrayList2 = bVar.g;
                arrayList2.clear();
                arrayList2.addAll(bVar.m());
                bVar.o();
                return s3q0.a;
        }
    }

    public /* synthetic */ gqq0(awi0 awi0Var, hpt0 hpt0Var) {
        this.b = 8;
        this.c = awi0Var;
    }
}
