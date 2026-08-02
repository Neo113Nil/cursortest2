package xsna;

import android.app.Activity;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;
import com.vk.imageloader.view.VkImageViewTopCrop;
import com.vk.money.createtransfer.people.pin.VkPayPinFragment;
import com.vk.pin.views.dots.PinDotsView;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.assessment.VoipAssessmentActivity;
import com.vk.voip.ui.assessment.VoipAssessmentActivityArguments;
import com.vk.voip.ui.call_by_link.ui.a;
import com.vk.voip.ui.group_selector.ui.a;
import com.vk.voip.ui.report.dialog.VoipReportSuspiciousCallActivity;
import com.vkontakte.android.R;
import java.util.Random;
import xsna.xv3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ftu0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ftu0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Activity b;
        UserId userId;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((wh50) obj2).setValue((ljo0) obj);
                break;
            case 1:
                int i2 = VkImageViewTopCrop.c;
                ((VkImageViewTopCrop) obj2).setImageDrawable(null);
                break;
            case 2:
                xbv0 xbv0Var = (xbv0) obj2;
                Throwable th = (Throwable) obj;
                VkPayPinFragment vkPayPinFragment = xbv0Var.f;
                if (th instanceof VKApiExecutionException) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                    int s = vKApiExecutionException.s();
                    if (s == 10) {
                        String message = th.getMessage();
                        if (message != null) {
                            vkPayPinFragment.getClass();
                            cvk.w(message, false);
                        }
                        xbv0Var.a7();
                    } else if (s == 19) {
                        vkPayPinFragment.lo(new dzk0(R.drawable.vk_icon_do_not_disturb_outline_56, R.attr.vk_legacy_placeholder_icon_foreground_primary, vkPayPinFragment.getActivity().getString(R.string.vkpay_pin_banned_status_title), vkPayPinFragment.getActivity().getString(R.string.vkpay_pin_banned_status_description), new au(vkPayPinFragment.getActivity().getString(R.string.vkpay_pin_banned_status_restore), new clt0(xbv0Var, 6))));
                    } else if (s == 504) {
                        vkPayPinFragment.lo(new dzk0(R.drawable.vk_icon_error_circle_outline_32, R.attr.vk_legacy_dynamic_orange, vkPayPinFragment.getActivity().getString(R.string.vkpay_pin_error_title), vkPayPinFragment.getActivity().getString(R.string.vkpay_pin_error_description), null));
                    } else if (s != 509) {
                        vkPayPinFragment.lo(new dzk0(R.drawable.vk_icon_error_circle_outline_32, R.attr.vk_legacy_dynamic_orange, vkPayPinFragment.getActivity().getString(R.string.vkpay_pin_error_title), vkPayPinFragment.getActivity().getString(R.string.vkpay_pin_error_description), null));
                    } else {
                        PinDotsView pinDotsView = vkPayPinFragment.V;
                        if (pinDotsView == null) {
                            pinDotsView = null;
                        }
                        pinDotsView.d();
                        Animation loadAnimation = AnimationUtils.loadAnimation(vkPayPinFragment.getActivity(), R.anim.pin_incorrect_shake);
                        loadAnimation.setAnimationListener(new cma0(vkPayPinFragment));
                        PinDotsView pinDotsView2 = vkPayPinFragment.V;
                        if (pinDotsView2 == null) {
                            pinDotsView2 = null;
                        }
                        pinDotsView2.startAnimation(loadAnimation);
                        String t = vKApiExecutionException.t();
                        TextView textView = vkPayPinFragment.X;
                        if (textView == null) {
                            textView = null;
                        }
                        textView.setText(t);
                        TextView textView2 = vkPayPinFragment.X;
                        (textView2 != null ? textView2 : null).setVisibility(0);
                    }
                } else {
                    xbv0Var.a7();
                }
                break;
            case 3:
                break;
            case 4:
                new0 new0Var = (new0) obj2;
                chw0 chw0Var = (chw0) obj;
                cow0 cow0Var = chw0Var.a;
                if (!cow0Var.l) {
                    new0Var.getClass();
                    if (cow0Var.e > 10 && cow0Var.k == null && !cow0Var.h && !cow0Var.g && ((cow0Var.f || new Random().nextFloat() <= 0.1f) && new0Var.b.n() && (b = c63.b()) != null)) {
                        VoipAssessmentActivityArguments voipAssessmentActivityArguments = new VoipAssessmentActivityArguments(chw0Var.a);
                        int i3 = VoipAssessmentActivity.m;
                        Intent intent = new Intent(b, (Class<?>) VoipAssessmentActivity.class);
                        intent.putExtra("VoipAssessmentActivity.Arguments", voipAssessmentActivityArguments);
                        b.startActivity(intent);
                    }
                } else if (new0Var.b.n() && (userId = cow0Var.b) != null) {
                    CallId callId = cow0Var.a;
                    Activity b2 = c63.b();
                    if (b2 != null) {
                        int i4 = VoipReportSuspiciousCallActivity.q;
                        Intent intent2 = new Intent(b2, (Class<?>) VoipReportSuspiciousCallActivity.class);
                        intent2.putExtra("call_id", callId);
                        intent2.putExtra("user_id", userId);
                        b2.startActivity(intent2);
                    }
                }
                break;
            case 5:
                ((hgw0) obj2).b.a(a.b.e.a);
                break;
            case 6:
                cvk.w(j03.g(((vjw0) obj2).a, ((xv3.a) obj).a, R.string.voip_asr_stop_error), false);
                break;
            default:
                ((sow0) obj2).c.a(a.b.a);
                break;
        }
        return s3q0.a;
    }
}
