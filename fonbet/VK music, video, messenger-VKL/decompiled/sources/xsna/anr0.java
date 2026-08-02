package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.api.VerificationFactory;
import ru.mail.libverify.controls.VerificationController;
import ru.mail.verify.core.api.UncaughtExceptionListener;
import ru.mail.verify.core.utils.LogReceiver;

/* compiled from: VerificationControllerImpl.kt */
/* loaded from: classes15.dex */
public final class anr0 extends VerificationController {
    public static final long e = TimeUnit.SECONDS.toMillis(60);
    public final String a;
    public final String b;
    public final bpn0 c;
    public VerificationApi.VerificationStateDescriptor d;

    public anr0(Context context, String str) {
        super(context);
        this.a = str;
        this.b = "libverify";
        this.c = new bpn0(new com.vk.movika.sdk.base.ui.m(29, context, this));
        VerificationFactory.setLocationUsage(context.getApplicationContext(), true);
    }

    @Override // ru.mail.libverify.controls.VerificationSupportProvider
    public final String getAlreadyExistingProfileDataJson() {
        return null;
    }

    @Override // ru.mail.libverify.controls.VerificationSupportProvider
    public final UncaughtExceptionListener getExceptionListener() {
        return null;
    }

    @Override // ru.mail.libverify.controls.VerificationSupportProvider
    public final long getIvrTimeoutDefault() {
        return e;
    }

    @Override // ru.mail.libverify.controls.VerificationSupportProvider
    public final LogReceiver getLogReceiver() {
        return null;
    }

    @Override // ru.mail.libverify.controls.VerificationSupportProvider
    public final SharedPreferences getPreferences() {
        return (SharedPreferences) this.c.getValue();
    }

    @Override // ru.mail.libverify.controls.VerificationSupportProvider
    public final int getSmsCodeLengthDefault() {
        return 0;
    }

    @Override // ru.mail.libverify.controls.VerificationSupportProvider
    public final Map<String, String> getSmsCodeTemplatesDefault() {
        return null;
    }

    @Override // ru.mail.libverify.controls.VerificationSupportProvider
    public final String getVerificationService() {
        return this.a;
    }

    @Override // ru.mail.libverify.controls.VerificationSupportProvider
    public final boolean isSmsCodeNumericDefault() {
        return true;
    }

    @Override // ru.mail.libverify.controls.VerificationController
    public final void onVerificationSucceeded(VerificationApi.VerificationStateDescriptor verificationStateDescriptor) {
        this.d = verificationStateDescriptor;
        super.onVerificationSucceeded(verificationStateDescriptor);
    }
}
