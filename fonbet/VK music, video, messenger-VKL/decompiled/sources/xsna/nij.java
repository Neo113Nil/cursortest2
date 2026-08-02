package xsna;

import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.voip.VoipCallActivity;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bex0;

/* compiled from: ContentPositionApplier.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class nij extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nij(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                qij.a((qij) this.receiver);
                break;
            case 1:
                r6y r6yVar = ((vrt) this.receiver).b;
                if (r6yVar != null) {
                    bex0.a.a(r6yVar, JsApiMethodType.GET_WORKOUTS, VkAppsErrors.Client.USER_DENIED, null, null, null, 60);
                }
                break;
            case 2:
                ((com.vk.photo.editor.features.mlenhance.c) this.receiver).H();
                break;
            case 3:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CONTINUE_VERIFICATION_TAP, null, null, null, null, null, null, 254);
                break;
            case 4:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack2 = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SERVICE_LOGOUT, null, null, null, null, null, null, 254);
                break;
            case 5:
                ((c6f0) this.receiver).dismiss();
                break;
            default:
                VoipCallActivity voipCallActivity = (VoipCallActivity) this.receiver;
                int i = VoipCallActivity.P;
                voipCallActivity.getClass();
                rq4.a.getClass();
                rq4.a(true);
                gau.c().d(voipCallActivity);
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nij(Object obj, int i) {
        super(0, obj, qij.class, "updateAllConsiderResumeFlag", "updateAllConsiderResumeFlag()V", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(0, obj, vrt.class, "sendPermissionDeniedEvent", "sendPermissionDeniedEvent()V", 0);
                break;
            case 2:
            default:
                break;
            case 3:
                super(0, obj, com.vk.registration.funnels.b.class, "onVerificationContinueTap", "onVerificationContinueTap()V", 0);
                break;
            case 4:
                super(0, obj, com.vk.registration.funnels.b.class, "onValidationServiceLogout", "onValidationServiceLogout()V", 0);
                break;
        }
    }
}
