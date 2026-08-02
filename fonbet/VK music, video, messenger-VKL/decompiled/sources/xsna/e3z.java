package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.auth.main.LibverifyFactorsForKazakhstan;
import com.vk.auth.main.LibverifyListener;
import com.vk.auth.main.LibverifyVerificationSource;
import com.vk.superapp.api.dto.auth.LibverifyValidationType;
import java.util.List;
import kotlin.Result;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.api.VerificationFactory;
import ru.mail.libverify.api.VerificationParameters;
import ru.mail.libverify.api.model.CodeDeliveryInfo;
import ru.mail.libverify.controls.OnReceiveCodeDeliveryInfo;

/* compiled from: LibverifyControllerWrapper.kt */
/* loaded from: classes15.dex */
public final class e3z implements d3z {
    public final anr0 a;
    public h3z b;
    public yqk0 c;

    /* compiled from: LibverifyControllerWrapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationApi.VerificationSource.values().length];
            try {
                iArr[VerificationApi.VerificationSource.ALREADY_VERIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: LibverifyControllerWrapper.kt */
    public static final class b implements OnReceiveCodeDeliveryInfo {
        public final /* synthetic */ LibverifyListener a;

        public b(LibverifyListener libverifyListener) {
            this.a = libverifyListener;
        }

        @Override // ru.mail.libverify.controls.OnReceiveCodeDeliveryInfo
        public final void onReceiveCodeDeliveryInfo(String str, CodeDeliveryInfo codeDeliveryInfo) {
            this.a.e(codeDeliveryInfo.getRouteType().value, codeDeliveryInfo.getStatus().name());
        }
    }

    public e3z(anr0 anr0Var) {
        this.a = anr0Var;
    }

    @Override // xsna.d3z
    public final int a() {
        return this.a.getSmsCodeLength();
    }

    @Override // xsna.d3z
    public final void b(String str) {
        this.a.onEnterSmsCode(str);
    }

    @Override // xsna.d3z
    public final void c(e7 e7Var) {
        anr0 anr0Var = this.a;
        if (e7Var == null) {
            anr0Var.setVKCListener(null);
        } else {
            anr0Var.setVKCListener(new com.vk.movika.sdk.base.ui.j(e7Var, 25));
        }
    }

    @Override // xsna.d3z
    public final void d(String str, String str2, boolean z, List<? extends LibverifyValidationType> list, LibverifyFactorsForKazakhstan libverifyFactorsForKazakhstan, boolean z2) {
        yqk0 yqk0Var = new yqk0(str, str2, z, list, libverifyFactorsForKazakhstan, z2);
        this.c = yqk0Var;
        p(yqk0Var);
    }

    @Override // xsna.d3z
    public final void e() {
        this.a.onConfirmed();
    }

    @Override // xsna.d3z
    public final LibverifyVerificationSource f() {
        VerificationApi.VerificationStateDescriptor verificationStateDescriptor = this.a.d;
        VerificationApi.VerificationSource source = verificationStateDescriptor != null ? verificationStateDescriptor.getSource() : null;
        if ((source == null ? -1 : a.$EnumSwitchMapping$0[source.ordinal()]) == 1) {
            return LibverifyVerificationSource.ALREADY_VERIFIED;
        }
        return null;
    }

    @Override // xsna.d3z
    public final void g() {
        this.a.sendCallInClickStats();
    }

    @Override // xsna.d3z
    public final boolean h(String str) {
        return this.a.isValidSmsCode(str);
    }

    @Override // xsna.d3z
    public final void i(LibverifyListener libverifyListener) {
        h3z h3zVar = this.b;
        if (epx.f(libverifyListener, h3zVar != null ? h3zVar.a : null)) {
            return;
        }
        h3z h3zVar2 = this.b;
        anr0 anr0Var = this.a;
        if (h3zVar2 != null) {
            anr0Var.unSubscribeSmsNotificationListener(h3zVar2);
            anr0Var.setListener(null);
        }
        this.b = null;
        if (libverifyListener == null) {
            return;
        }
        h3z h3zVar3 = new h3z(libverifyListener);
        anr0Var.setListener(h3zVar3);
        anr0Var.subscribeSmsNotificationListener(h3zVar3);
        anr0Var.setOnReceiveCodeDeliveryInfo(new b(libverifyListener));
        this.b = h3zVar3;
    }

    @Override // xsna.d3z
    public final void j(String str) {
        this.a.onStartWithUserId(str, new VerificationParameters().setCallUIEnabled(Boolean.TRUE).setCallInEnabled(Boolean.FALSE).setExternalId(null));
    }

    @Override // xsna.d3z
    public final void k(Context context, boolean z) {
        VerificationFactory.setDisableSimDataSend(context, z);
    }

    @Override // xsna.d3z
    public final String l() {
        return this.a.onLoginWithVKConnect2("");
    }

    @Override // xsna.d3z
    public final void m() {
        this.a.onErrorDismissed();
    }

    @Override // xsna.d3z
    public final void n() {
        this.a.onResendSms();
    }

    @Override // xsna.d3z
    public final void o() {
        yqk0 yqk0Var = this.c;
        if (yqk0Var == null || yqk0Var.a == null) {
            return;
        }
        this.a.onCancel(VerificationApi.CancelReason.CANCELLED_BY_USER);
        yqk0 yqk0Var2 = this.c;
        if (yqk0Var2 != null) {
            p(yqk0Var2);
        }
    }

    @Override // xsna.d3z
    public final void onCancel() {
        this.a.onCancel(VerificationApi.CancelReason.CANCELLED_BY_USER);
    }

    public final void p(yqk0 yqk0Var) {
        String str;
        Object failure;
        VerificationParameters messengerEnabled;
        List<LibverifyValidationType> list;
        yqk0 yqk0Var2 = this.c;
        if (yqk0Var2 == null || (str = yqk0Var2.a) == null) {
            return;
        }
        try {
            q55 q55Var = q55.a;
            Bundle bundle = q55.c().a.K;
            failure = bundle != null ? Boolean.valueOf(m63.g(bundle)) : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (!epx.f(failure instanceof Result.Failure ? null : failure, Boolean.TRUE) || (list = yqk0Var.d) == null) {
            LibverifyFactorsForKazakhstan libverifyFactorsForKazakhstan = yqk0Var.e;
            if (libverifyFactorsForKazakhstan != null) {
                List<LibverifyFactorsForKazakhstan.Factor> list2 = libverifyFactorsForKazakhstan.a;
                messengerEnabled = new VerificationParameters().setRoutes(list2.contains(LibverifyFactorsForKazakhstan.Factor.CALL_UI), list2.contains(LibverifyFactorsForKazakhstan.Factor.CALL_IN), list2.contains(LibverifyFactorsForKazakhstan.Factor.MOBILE_ID), list2.contains(LibverifyFactorsForKazakhstan.Factor.SMS), list2.contains(LibverifyFactorsForKazakhstan.Factor.CALL), list2.contains(LibverifyFactorsForKazakhstan.Factor.PUSH), false);
            } else {
                boolean z = yqk0Var.c;
                boolean z2 = yqk0Var.f;
                List<LibverifyValidationType> list3 = yqk0Var.d;
                boolean contains = list3 != null ? list3.contains(LibverifyValidationType.VALIDATION_TYPE_CALLRESET) : true;
                if (list3 != null) {
                    z = list3.contains(LibverifyValidationType.VALIDATION_TYPE_CALLIN);
                }
                if (list3 != null) {
                    z2 = list3.contains(LibverifyValidationType.VALIDATION_TYPE_MESSENGER);
                }
                messengerEnabled = new VerificationParameters().setCallUIEnabled(Boolean.valueOf(contains)).setCallInEnabled(Boolean.valueOf(z)).setMessengerEnabled(Boolean.valueOf(z2));
            }
        } else {
            messengerEnabled = new VerificationParameters().setCallUIEnabled(Boolean.valueOf(list.contains(LibverifyValidationType.VALIDATION_TYPE_CALLRESET))).setCallInEnabled(Boolean.valueOf(list.contains(LibverifyValidationType.VALIDATION_TYPE_CALLIN) && yqk0Var.c)).setMessengerEnabled(Boolean.valueOf(yqk0Var.f));
        }
        messengerEnabled.setExternalId(yqk0Var.b);
        this.a.onStartWithVKConnect(str, "", messengerEnabled);
    }
}
