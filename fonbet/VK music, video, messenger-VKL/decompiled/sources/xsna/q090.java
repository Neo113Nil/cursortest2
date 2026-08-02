package xsna;

import android.view.View;
import com.vk.catalog2.common.ui.holders.video.VideoSearchParamsVh;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.search.ui.SearchParametersBottomView;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.voip.VoipCallActivity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OtpVerificationStat.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class q090 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q090(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CALLIN_PHONE_NUMBER_CHANGED, null, null, null, null, null, null, 254);
                return s3q0.a;
            case 1:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack2 = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ALERT_SOMETHING_WENT_WRONG, null, null, null, null, null, null, 254);
                return s3q0.a;
            case 2:
                ((wzh0) this.receiver).j();
                return s3q0.a;
            case 3:
                VideoSearchParamsVh videoSearchParamsVh = (VideoSearchParamsVh) this.receiver;
                SearchParametersBottomView searchParametersBottomView = videoSearchParamsVh.g;
                if (searchParametersBottomView == null) {
                    searchParametersBottomView = null;
                }
                searchParametersBottomView.setVisibility(8);
                View invoke = videoSearchParamsVh.c.invoke();
                if (invoke != null) {
                    awt0.x(invoke, 0, 0, 0, 0, 7);
                }
                return s3q0.a;
            default:
                return (VoipCallActivity) ((WeakReference) this.receiver).get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q090(Object obj, int i) {
        super(0, obj, com.vk.registration.funnels.b.class, "onCallInNumberChanged", "onCallInNumberChanged()V", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(0, obj, com.vk.registration.funnels.b.class, "onPhoneValidationErrorOpened", "onPhoneValidationErrorOpened()V", 0);
                break;
            default:
                break;
        }
    }
}
