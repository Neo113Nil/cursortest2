package xsna;

import android.graphics.drawable.Drawable;
import com.vk.auth.DefaultAuthActivity;
import com.vk.dto.common.ImageSizeKey;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dw20;

/* compiled from: PhoneConfirmationModal.kt */
/* loaded from: classes15.dex */
public final class a3a0 {
    public final String a;
    public final String b;

    public a3a0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    /* JADX WARN: Type inference failed for: r12v8, types: [T, xsna.dw20] */
    public final void a(DefaultAuthActivity defaultAuthActivity) {
        String str = this.b;
        String str2 = this.a;
        d3a0 d3a0Var = new d3a0(str, str2, defaultAuthActivity);
        Drawable e = enj.e(R.drawable.vk_icon_phone_outline_56, R.attr.vk_ui_icon_accent, defaultAuthActivity);
        Drawable e2 = enj.e(R.drawable.vk_icon_cancel_20, R.attr.vk_ui_icon_secondary, defaultAuthActivity);
        String replace = str2 != null ? str2.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183) : null;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        f540 f540Var = new f540(defaultAuthActivity, ref$ObjectRef);
        dw20.b bVar = new dw20.b(defaultAuthActivity, new kcu0(SchemeStatSak$EventScreen.VERIFICATION_ASK_NUMBER, false, null));
        cbq.a(bVar);
        ref$ObjectRef.element = ((dw20.b) dw20.a.R(((dw20.b) bVar.N(e).F(e2, null)).X(new x550(f540Var, 11)).b0(new qi00(f540Var, 18)).w0(defaultAuthActivity.getString(R.string.vk_service_phone_confirmation_title, replace)).M0(), defaultAuthActivity.getString(R.string.vk_service_phone_confirmation_message), 0, 0, 6)).h0(R.string.vk_service_validation_confirmation_confirm, new vxv(0, d3a0Var, d3a0.class, "openPhoneValidationScreen", "openPhoneValidationScreen()V", 0, 2)).T(R.string.vk_auth_sign_up_account_unavailable_try_another_phone, new wxv(0, d3a0Var, d3a0.class, "openEnterPhoneScreen", "openEnterPhoneScreen()V", 0, 1)).I0("PhoneConfirmation");
    }
}
