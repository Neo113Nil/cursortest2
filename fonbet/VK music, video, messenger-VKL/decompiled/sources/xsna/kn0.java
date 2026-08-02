package xsna;

import android.content.IntentFilter;
import com.vk.profile.design.view.fab.ProfileFabView;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vkontakte.android.R;
import java.util.regex.Pattern;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dw20;

/* compiled from: AddRoomToCallDialogFragment.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class kn0 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kn0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = 1;
        switch (this.b) {
            case 0:
                ln0 ln0Var = (ln0) this.receiver;
                Pattern pattern = ln0.h1;
                new dw20.b(ln0Var.requireContext(), null).v0(R.string.voip_add_room_to_call_success_message).M(R.drawable.vk_icon_check_circle_outline_56, Integer.valueOf(R.attr.vk_ui_icon_accent)).a0(new in0(ln0Var, 0)).h0(R.string.voip_add_room_to_call_success_ok_button, new z4(ln0Var, i)).H0(ln0Var.getParentFragmentManager(), null);
                break;
            case 1:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.RESEND_SMS_CODE_FAILED, null, null, null, null, null, null, 254);
                break;
            case 2:
                cp70 cp70Var = (cp70) this.receiver;
                IntentFilter intentFilter = cp70.N;
                cp70Var.P0();
                break;
            case 3:
                break;
            case 4:
                ProfileFabView.I((ProfileFabView) this.receiver);
                break;
            default:
                ((rkq0) this.receiver).g();
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn0(Object obj, int i) {
        super(0, obj, ln0.class, "onSuccess", "onSuccess()V", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(0, obj, com.vk.registration.funnels.b.class, "onResendSmsFailed", "onResendSmsFailed()V", 0);
                break;
            case 2:
                super(0, obj, cp70.class, "fetchNextCodeState", "fetchNextCodeState()V", 0);
                break;
            case 3:
            case 4:
            default:
                break;
            case 5:
                super(0, obj, rkq0.class, "handleBottomSheetClosed", "handleBottomSheetClosed()V", 0);
                break;
        }
    }
}
