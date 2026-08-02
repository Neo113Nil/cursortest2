package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: NoAvailableValidateWaysError.kt */
/* loaded from: classes15.dex */
public final class i270 {
    public static final void a(x65 x65Var, String str, Context context, vx6 vx6Var) {
        if (x65Var != null) {
            com.vk.registration.funnels.b.a.getClass();
            com.vk.registration.funnels.b.p();
            x65Var.U2(context.getString(R.string.vk_otp_method_selection_code_entering_no_available_methods_title), context.getString(R.string.vk_otp_method_selection_code_entering_no_available_methods_subtitle), context.getString(R.string.vk_otp_method_selection_code_entering_no_available_methods_restore_button_title), new zf20(str, 9), context.getString(R.string.close), new hj60(vx6Var, 3), false, new f550(vx6Var, 6), new f5x(vx6Var, 23));
        }
    }
}
