package xsna;

import android.os.Bundle;
import android.os.SystemClock;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import xsna.mii0;
import xsna.r6k0;
import xsna.sir0;
import xsna.t6k0;
import xsna.v6k0;

/* compiled from: SmsInboxPresenter.kt */
/* loaded from: classes15.dex */
public final class s6k0 extends p66<lii0> implements kii0 {
    public final q6k0 A;
    public izs<? super v6k0, s3q0> B;
    public v6k0 C = v6k0.c.a;
    public final z2a0 D = new z2a0();
    public final long E;
    public final long F;
    public io.reactivex.rxjava3.disposables.c G;
    public final String x;
    public final CheckPresenterInfo y;
    public final CodeState.SmsInbox z;

    public s6k0(String str, CheckPresenterInfo checkPresenterInfo, CodeState.SmsInbox smsInbox, q6k0 q6k0Var, Bundle bundle) {
        long elapsedRealtime;
        this.x = str;
        this.y = checkPresenterInfo;
        this.z = smsInbox;
        this.A = q6k0Var;
        Long valueOf = bundle != null ? Long.valueOf(bundle.getLong("timeout_end_timestamp")) : null;
        if (valueOf != null) {
            elapsedRealtime = valueOf.longValue();
        } else {
            elapsedRealtime = SystemClock.elapsedRealtime() + ((smsInbox != null ? smsInbox.g : 120) * 1000);
        }
        this.E = elapsedRealtime;
        this.F = smsInbox != null ? smsInbox.h : 3L;
    }

    @Override // xsna.kii0
    public final void B() {
        this.A.c();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.MESSAGE_APP_OPEN, null, null, null, null, null, null, 254);
        s3q0 s3q0Var = s3q0.a;
        y0(v6k0.b.a);
    }

    @Override // xsna.kii0
    public final void M() {
        CodeState.SmsInbox smsInbox = this.z;
        if (smsInbox == null) {
            return;
        }
        boolean z = this.C instanceof v6k0.c;
        q6k0 q6k0Var = this.A;
        if (z) {
            q6k0Var.c();
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SEND_SMS_TAP, null, null, null, null, null, null, 254);
            s3q0 s3q0Var = s3q0.a;
        } else {
            q6k0Var.c();
            RegistrationFunnelScreenStack registrationFunnelScreenStack2 = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.VERIFY_AGAIN_TAP, null, null, null, null, null, null, 254);
            s3q0 s3q0Var2 = s3q0.a;
        }
        lii0 lii0Var = (lii0) this.a;
        if (lii0Var != null) {
            lii0Var.K4(smsInbox.e, smsInbox.f);
        }
    }

    @Override // xsna.kii0
    public final void X(mii0.b bVar) {
        this.B = bVar;
        if (bVar != null) {
            bVar.invoke(this.C);
        }
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.UNKNOWN;
    }

    @Override // xsna.p66, xsna.z55
    public final void onStart() {
        v6k0 v6k0Var = this.C;
        if (!((v6k0Var instanceof v6k0.a) && ((v6k0.a) v6k0Var).b) && this.G == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.E;
            long j2 = 1000;
            io.reactivex.rxjava3.core.t T = (j - elapsedRealtime) / j2 <= 0 ? io.reactivex.rxjava3.core.q.T(new t6k0.a(null, true, r6k0.d.a)) : new io.reactivex.rxjava3.internal.operators.observable.o0(io.reactivex.rxjava3.core.q.P(0L, this.F, TimeUnit.SECONDS), new wii0(new w910(this, 29), 2));
            t6k0.a aVar = new t6k0.a(null, true, r6k0.d.a);
            long elapsedRealtime2 = (j - SystemClock.elapsedRealtime()) / j2;
            io.reactivex.rxjava3.core.q X = io.reactivex.rxjava3.core.q.X(T, elapsedRealtime2 <= 0 ? io.reactivex.rxjava3.core.q.T(aVar) : io.reactivex.rxjava3.core.q.B0(elapsedRealtime2, TimeUnit.SECONDS).U(new adz(new aj50(aVar, 24), 13)));
            vii0 vii0Var = new vii0(new h2w(26), 2);
            X.getClass();
            this.G = hg1.h(new io.reactivex.rxjava3.internal.operators.observable.q2(X, vii0Var).a0(io.reactivex.rxjava3.android.schedulers.a.b()), new bee(1, this, s6k0.class, "resolveValidationStatus", "resolveValidationStatus(Lcom/vk/auth/verification/smsinbox/SmsInboxValidationStatus;)V", 0, 6));
        }
    }

    @Override // xsna.p66, xsna.z55
    public final void onStop() {
        io.reactivex.rxjava3.disposables.c cVar = this.G;
        if (cVar != null) {
            cVar.dispose();
        }
        this.G = null;
    }

    @Override // xsna.kii0
    public final void q() {
        this.A.c();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.MESSAGE_APP_OPEN_ERROR, null, null, null, null, null, null, 254);
        s3q0 s3q0Var = s3q0.a;
        y0(new v6k0.a(this.b.getString(R.string.vk_sms_inbox_confirm_another_way_subtitle), true, r6k0.a.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    @Override // xsna.kii0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w() {
        boolean z;
        String str;
        String str2;
        this.A.c();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.VERIFY_BY_ANOTHER_WAY_TAP, null, null, null, null, null, null, 254);
        s3q0 s3q0Var = s3q0.a;
        CheckPresenterInfo checkPresenterInfo = this.y;
        boolean z2 = checkPresenterInfo instanceof CheckPresenterInfo.SignUp;
        boolean z3 = z2 ? ((CheckPresenterInfo.SignUp) checkPresenterInfo).d : checkPresenterInfo instanceof CheckPresenterInfo.PasswordLessAuth ? ((CheckPresenterInfo.PasswordLessAuth) checkPresenterInfo).c : false;
        if (!(checkPresenterInfo instanceof CheckPresenterInfo.Auth)) {
            SignUpDataHolder signUpDataHolder = this.p;
            if (signUpDataHolder == null) {
                signUpDataHolder = null;
            }
            if (signUpDataHolder.f && !z3) {
                z = false;
                if (z2) {
                    if (checkPresenterInfo instanceof CheckPresenterInfo.Validation) {
                        str = ((CheckPresenterInfo.Validation) checkPresenterInfo).b;
                    } else {
                        if (checkPresenterInfo instanceof CheckPresenterInfo.PasswordLessAuth) {
                            str = ((CheckPresenterInfo.PasswordLessAuth) checkPresenterInfo).b.b;
                        }
                        str2 = null;
                    }
                    str2 = str;
                } else {
                    VerificationScreenData verificationScreenData = ((CheckPresenterInfo.SignUp) checkPresenterInfo).b;
                    VerificationScreenData.Phone phone = verificationScreenData instanceof VerificationScreenData.Phone ? (VerificationScreenData.Phone) verificationScreenData : null;
                    if (phone != null) {
                        str = phone.b;
                        str2 = str;
                    }
                    str2 = null;
                }
                if (str2 != null) {
                    return;
                }
                sir0 sir0Var = sir0.a;
                sir0Var.getClass();
                this.t.b(mnh0.B(w0(sir0.h(sir0Var, new sir0.e(this.x, str2, sir0.c(str2), z, z, false, false, false, false, null, VideoRecord.DEFAULT_MAX_DIMENSION)), true), this.s, new ndg0(3, this, str2), new pj1(1, this, s6k0.class, "onValidatePhoneError", "onValidatePhoneError(Lcom/vk/superapp/core/errors/CommonApiError;)V", 0, 11), null));
                return;
            }
        }
        z = true;
        if (z2) {
        }
        if (str2 != null) {
        }
    }

    @Override // xsna.p66, xsna.z55
    public final void x(Bundle bundle) {
        bundle.putLong("timeout_end_timestamp", this.E);
    }

    public final void y0(v6k0 v6k0Var) {
        r6k0 r6k0Var;
        izs<? super v6k0, s3q0> izsVar = this.B;
        if (izsVar != null) {
            izsVar.invoke(v6k0Var);
        }
        q6k0 q6k0Var = this.A;
        if (!v6k0Var.equals(q6k0Var.b)) {
            q6k0Var.b = v6k0Var;
            q6k0Var.c();
            SchemeStatSak$EventScreen b = q6k0.b(q6k0Var.b);
            q6k0Var.c();
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.f(null, b, null, false, null, null, 61);
            s3q0 s3q0Var = s3q0.a;
            v6k0.a aVar = v6k0Var instanceof v6k0.a ? (v6k0.a) v6k0Var : null;
            if (aVar != null && (r6k0Var = aVar.c) != null) {
                if (r6k0Var.equals(r6k0.a.a)) {
                    q6k0Var.a(new c6(27));
                } else if (r6k0Var.equals(r6k0.b.a)) {
                    q6k0Var.a(new o2a0(10));
                } else if (r6k0Var.equals(r6k0.c.a)) {
                    q6k0Var.a(new s7c0(6));
                } else {
                    if (!r6k0Var.equals(r6k0.d.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    q6k0Var.a(new jkg0(3));
                }
            }
        }
        this.C = v6k0Var;
    }
}
