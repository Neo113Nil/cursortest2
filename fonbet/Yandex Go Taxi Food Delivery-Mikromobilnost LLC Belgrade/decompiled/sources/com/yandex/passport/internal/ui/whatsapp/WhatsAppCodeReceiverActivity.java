package com.yandex.passport.internal.ui.whatsapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.whatsapp.otp.android.sdk.enums.WhatsAppOtpError;
import com.whatsapp.otp.android.sdk.exceptions.InvalidWhatsAppOtpIntentException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.logger.a;
import com.yandex.passport.common.logger.c;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.report.reporters.j0;
import com.yandex.passport.internal.report.v8;
import com.yandex.passport.internal.report.w8;
import com.yandex.passport.internal.smsretriever.SmsFromType;
import defpackage.ax41;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/passport/internal/ui/whatsapp/WhatsAppCodeReceiverActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WhatsAppCodeReceiverActivity extends AppCompatActivity {
    public static final int $stable = 0;

    private static final void onCreate$lambda$3(j0 j0Var, PassportProcessGlobalComponent passportProcessGlobalComponent, String str) {
        if (str == null) {
            j0Var.j(null, "code_is_null");
            c cVar = a.a;
            if (a.a.isEnabled()) {
                a.c(LogLevel.ERROR, null, "Failed code received from WhatsApp. Reason: code_is_null", 8);
                return;
            }
            return;
        }
        passportProcessGlobalComponent.getSmsRetrieverHelper().a(str, SmsFromType.OTP_WHATSAPP);
        j0Var.getClass();
        j0Var.h(w8.w);
        c cVar2 = a.a;
        if (a.a.isEnabled()) {
            a.c(LogLevel.DEBUG, null, "Successful code received from WhatsApp", 8);
        }
    }

    private static final void onCreate$lambda$5(j0 j0Var, WhatsAppOtpError whatsAppOtpError, Exception exc) {
        j0Var.j(exc, whatsAppOtpError.name().toLowerCase(Locale.ROOT));
        c cVar = a.a;
        if (a.a.isEnabled()) {
            a.b(LogLevel.ERROR, null, "Failed code received from WhatsApp. Reason:" + whatsAppOtpError.name(), exc);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        j0 otpWaReporter = a.getOtpWaReporter();
        try {
            otpWaReporter.getClass();
            otpWaReporter.h(v8.w);
            c cVar = a.a;
            if (a.a.isEnabled()) {
                a.c(LogLevel.DEBUG, null, "Intent received from WhatsApp", 8);
            }
            new ax41();
            try {
                String a2 = ax41.a(getIntent());
                if (a2 != null) {
                    onCreate$lambda$3(otpWaReporter, a, a2);
                } else {
                    onCreate$lambda$5(otpWaReporter, WhatsAppOtpError.OTP_CODE_NOT_RECEIVED, null);
                }
            } catch (InvalidWhatsAppOtpIntentException e) {
                onCreate$lambda$5(otpWaReporter, WhatsAppOtpError.INTENT_IS_NOT_FROM_WHATSAPP, e);
            } catch (Exception e2) {
                onCreate$lambda$5(otpWaReporter, WhatsAppOtpError.GENERIC_EXCEPTION, e2);
            }
        } catch (Exception e3) {
            otpWaReporter.j(e3, "activity_error");
        }
        finish();
    }
}
