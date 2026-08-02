package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.screens.registration.domain.RegistrationPhone;
import com.ybsdk.screens.registration.phoneconfirmation.presentation.PhoneConfirmationViewState$PhoneMode;

/* loaded from: classes2.dex */
public final class ieb0 implements ev31 {
    @Override // defpackage.ev31
    public final Object q(Object obj) {
        String str;
        String str2;
        boolean z;
        yqi0 yqi0Var;
        RegistrationPhone registrationPhone;
        heb0 heb0Var = (heb0) obj;
        Text text = heb0Var.c;
        boolean z2 = heb0Var.g;
        u8j0 u8j0Var = heb0Var.a;
        yqi0 yqi0Var2 = u8j0Var != null ? (yqi0) u8j0Var.a() : null;
        PhoneConfirmationViewState$PhoneMode phoneConfirmationViewState$PhoneMode = (u8j0Var == null || (u8j0Var instanceof t8j0) || z2) ? PhoneConfirmationViewState$PhoneMode.DO_NOT_SHOW : heb0Var.d ? PhoneConfirmationViewState$PhoneMode.PREDEFINED : PhoneConfirmationViewState$PhoneMode.EDIT;
        boolean z3 = u8j0Var == null || (u8j0Var instanceof t8j0) || z2;
        PhoneConfirmationViewState$PhoneMode phoneConfirmationViewState$PhoneMode2 = PhoneConfirmationViewState$PhoneMode.PREDEFINED;
        String maskedPhone = (phoneConfirmationViewState$PhoneMode != phoneConfirmationViewState$PhoneMode2 || yqi0Var2 == null || (registrationPhone = yqi0Var2.b) == null) ? null : registrationPhone.getMaskedPhone();
        String str3 = heb0Var.e;
        String str4 = "";
        if (heb0Var.f) {
            String str5 = (u8j0Var == null || (yqi0Var = (yqi0) u8j0Var.a()) == null) ? null : yqi0Var.c;
            if (str5 != null) {
                str4 = str5;
            }
        }
        u8j0 u8j0Var2 = heb0Var.b;
        boolean z4 = (u8j0Var2 == null || !(u8j0Var2 instanceof t8j0) || z2) ? false : true;
        if (phoneConfirmationViewState$PhoneMode == phoneConfirmationViewState$PhoneMode2) {
            str = str3;
            str2 = str4;
            z = true;
        } else {
            str = str3;
            str2 = str4;
            z = false;
        }
        return new oeb0(z3, phoneConfirmationViewState$PhoneMode, maskedPhone, str, str2, z4, z, u8j0Var instanceof s8j0 ? r501.a(((s8j0) u8j0Var).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534) : null, text != null, text == null ? unr0.h(Text.Companion, dzh0.ybsdk_authorization_number_error_title) : text, (text != null || u8j0Var == null || (u8j0Var instanceof t8j0) || z2) ? false : true, !z2);
    }
}
