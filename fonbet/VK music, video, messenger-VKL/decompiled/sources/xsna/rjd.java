package xsna;

import com.vk.catalog2.common.ui.holders.video.VideoSearchParamsVh;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.voip.VoipCallActivity;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ClipsBaseGridToolbar.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class rjd extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rjd(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((fee) this.receiver).l2();
                break;
            case 1:
                break;
            case 2:
                ((g7y) this.receiver).getClass();
                break;
            case 3:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CALLIN_CALL_TAP, null, null, null, null, null, null, 254);
                break;
            case 4:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack2 = frf0.a;
                frf0.g(SchemeStatSak$EventScreen.ALERT_UNLINK_PHONE_NUMBER, null, null, null, 12);
                break;
            case 5:
                clm0 clm0Var = (clm0) this.receiver;
                clm0Var.g.invoke();
                b6m.a().m(clm0Var.c, MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.PRIVACY_MODAL_WINDOW);
                clm0Var.h.invoke();
                break;
            case 6:
                ((u8r0) this.receiver).m();
                break;
            case 7:
                ((VideoSearchParamsVh) this.receiver).b();
                break;
            default:
                VoipCallActivity voipCallActivity = (VoipCallActivity) this.receiver;
                int i = VoipCallActivity.P;
                voipCallActivity.U1();
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjd(Object obj, int i) {
        super(0, obj, g7y.class, "providePushToken", "providePushToken()Ljava/lang/String;", 0);
        this.b = i;
        switch (i) {
            case 3:
                super(0, obj, com.vk.registration.funnels.b.class, "onVerificationCallInMakeCallTap", "onVerificationCallInMakeCallTap()V", 0);
                break;
            case 4:
                super(0, obj, com.vk.registration.funnels.b.class, "onProceedToAlertUnlinkPhoneClosed", "onProceedToAlertUnlinkPhoneClosed()V", 0);
                break;
            case 5:
                super(0, obj, clm0.class, "handleButtonClick", "handleButtonClick()V", 0);
                break;
            case 6:
            case 7:
            default:
                break;
            case 8:
                super(0, obj, VoipCallActivity.class, "finishAndEnsureIdle", "finishAndEnsureIdle()V", 0);
                break;
        }
    }
}
