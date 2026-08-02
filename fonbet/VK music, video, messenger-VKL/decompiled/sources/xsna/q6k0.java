package xsna;

import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.stats.VerificationStatFlow;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.lnr0;
import xsna.v6k0;

/* compiled from: SmsInboxAnalytics.kt */
/* loaded from: classes15.dex */
public final class q6k0 {
    public final CheckPresenterInfo a;
    public v6k0 b = v6k0.c.a;

    public q6k0(CheckPresenterInfo checkPresenterInfo) {
        this.a = checkPresenterInfo;
        a(new dgc0(10));
    }

    public static SchemeStatSak$EventScreen b(v6k0 v6k0Var) {
        if (v6k0Var instanceof v6k0.c) {
            return SchemeStatSak$EventScreen.VERIFICATION_PHONE_VERIFY;
        }
        if (v6k0Var instanceof v6k0.a) {
            return SchemeStatSak$EventScreen.SMS_INBOX_ERROR;
        }
        if (v6k0Var instanceof v6k0.b) {
            return SchemeStatSak$EventScreen.SMS_INBOX_CHECKING;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void a(gzs<s3q0> gzsVar) {
        c();
        gzsVar.invoke();
    }

    public final void c() {
        VerificationStatFlow verificationStatFlow;
        SchemeStatSak$EventScreen b = b(this.b);
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        ArrayList arrayList = new ArrayList();
        CheckPresenterInfo checkPresenterInfo = this.a;
        if (checkPresenterInfo == null) {
            verificationStatFlow = VerificationStatFlow.AUTH;
        } else if (checkPresenterInfo instanceof CheckPresenterInfo.Auth) {
            verificationStatFlow = VerificationStatFlow.AUTH;
        } else if (checkPresenterInfo instanceof CheckPresenterInfo.PasswordLessAuth) {
            verificationStatFlow = VerificationStatFlow.AUTH;
        } else if (checkPresenterInfo instanceof CheckPresenterInfo.Validation) {
            verificationStatFlow = VerificationStatFlow.VALIDATION;
        } else if (checkPresenterInfo instanceof CheckPresenterInfo.SignUp) {
            verificationStatFlow = ((CheckPresenterInfo.SignUp) checkPresenterInfo).c.b ? VerificationStatFlow.SIGN_UP : VerificationStatFlow.AUTH;
        } else {
            if (!(checkPresenterInfo instanceof CheckPresenterInfo.MethodSelectorAuth)) {
                throw new NoWhenBranchMatchedException();
            }
            verificationStatFlow = VerificationStatFlow.AUTH;
        }
        arrayList.add(verificationStatFlow.h());
        lnr0.p pVar = lnr0.p.b;
        pVar.getClass();
        arrayList.add(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.VERIFICATION_TYPE, "", "", pVar.a));
        frf0.l(b, arrayList);
    }
}
