package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001authapiphone.zzab;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.b;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.auth.verification.otp.OTPCheckPresenter$receiver$1;
import com.vk.superapp.api.states.VkAuthState;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import xsna.cp70;
import xsna.par0;
import xsna.sir0;

/* compiled from: OTPCheckPresenter.kt */
/* loaded from: classes15.dex */
public final class cp70 extends com.vk.auth.verification.base.b<vo70> implements uo70 {
    public static final IntentFilter N = new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
    public final wo70 H;
    public final bpn0 I;
    public io.reactivex.rxjava3.disposables.c J;
    public String K;
    public final OTPCheckPresenter$receiver$1 L;
    public final zzab M;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.BroadcastReceiver, com.vk.auth.verification.otp.OTPCheckPresenter$receiver$1] */
    public cp70(CodeState codeState, Bundle bundle, String str, CheckPresenterInfo checkPresenterInfo, wo70 wo70Var) {
        super(codeState, bundle, checkPresenterInfo);
        this.H = wo70Var;
        this.I = new bpn0(new xu0(26));
        this.K = str;
        ?? r1 = new BroadcastReceiver() { // from class: com.vk.auth.verification.otp.OTPCheckPresenter$receiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                Bundle extras;
                Intent intent2;
                if (!cp70.N.matchAction(intent.getAction()) || (extras = intent.getExtras()) == null) {
                    return;
                }
                Object obj = extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                Status status = obj instanceof Status ? (Status) obj : null;
                if (status == null || status.b != 0 || (intent2 = (Intent) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT")) == null) {
                    return;
                }
                try {
                    cp70.this.H.invoke(intent2, 2);
                } catch (Throwable th) {
                    par0.a.getClass();
                    par0.d(th);
                }
            }
        };
        this.L = r1;
        Context context = this.b;
        this.M = k0x.c(context) ? vua0.j(context) : null;
        this.b.registerReceiver(r1, N, "com.google.android.gms.auth.api.phone.permission.SEND", null, 2);
    }

    @Override // com.vk.auth.verification.base.b
    public final void N0() {
        super.N0();
        Q0(false);
    }

    @Override // com.vk.auth.verification.base.b
    public final void O0(String str) {
        super.O0(str);
        par0 par0Var = par0.a;
        StringBuilder sb = new StringBuilder("useCode, info=");
        CheckPresenterInfo checkPresenterInfo = this.x;
        sb.append(checkPresenterInfo);
        String sb2 = sb.toString();
        par0Var.getClass();
        par0.a(sb2);
        if (checkPresenterInfo instanceof CheckPresenterInfo.Auth) {
            VkAuthState vkAuthState = ((CheckPresenterInfo.Auth) checkPresenterInfo).b;
            vkAuthState.d.put("code", str);
            p66.j0(this, vkAuthState, new b.a(), null, null, 28);
            return;
        }
        String str2 = null;
        if (checkPresenterInfo instanceof CheckPresenterInfo.SignUp) {
            VerificationScreenData verificationScreenData = ((CheckPresenterInfo.SignUp) checkPresenterInfo).b;
            VerificationScreenData.Phone phone = verificationScreenData instanceof VerificationScreenData.Phone ? (VerificationScreenData.Phone) verificationScreenData : null;
            if (phone != null) {
                str2 = phone.b;
            }
        } else if (checkPresenterInfo instanceof CheckPresenterInfo.PasswordLessAuth) {
            VerificationScreenData verificationScreenData2 = ((CheckPresenterInfo.PasswordLessAuth) checkPresenterInfo).b;
            VerificationScreenData.Phone phone2 = verificationScreenData2 instanceof VerificationScreenData.Phone ? (VerificationScreenData.Phone) verificationScreenData2 : null;
            if (phone2 != null) {
                str2 = phone2.b;
            }
        } else if (checkPresenterInfo instanceof CheckPresenterInfo.Validation) {
            str2 = ((CheckPresenterInfo.Validation) checkPresenterInfo).b;
        }
        String str3 = str2;
        String str4 = this.K;
        Boolean bool = this.B;
        K0(new v2j(str3, str4, str, null, null, null, bool != null ? bool.booleanValue() : false));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P0() {
        boolean z;
        String str;
        CodeState codeState = this.z;
        CodeState codeState2 = codeState.c;
        if (codeState2 == null) {
            codeState2 = codeState.f();
            codeState2.b = codeState;
        }
        boolean z2 = codeState2 instanceof CodeState.VoiceCallWait;
        CheckPresenterInfo checkPresenterInfo = this.x;
        boolean z3 = false;
        if (!(checkPresenterInfo instanceof CheckPresenterInfo.Auth)) {
            SignUpDataHolder signUpDataHolder = this.p;
            if (signUpDataHolder == null) {
                signUpDataHolder = null;
            }
            if (signUpDataHolder.f) {
                if (!(checkPresenterInfo instanceof CheckPresenterInfo.SignUp ? ((CheckPresenterInfo.SignUp) checkPresenterInfo).d : checkPresenterInfo instanceof CheckPresenterInfo.PasswordLessAuth ? ((CheckPresenterInfo.PasswordLessAuth) checkPresenterInfo).c : false)) {
                    z = false;
                    if (!(checkPresenterInfo instanceof CheckPresenterInfo.SignUp)) {
                        VerificationScreenData verificationScreenData = ((CheckPresenterInfo.SignUp) checkPresenterInfo).b;
                        VerificationScreenData.Phone phone = verificationScreenData instanceof VerificationScreenData.Phone ? (VerificationScreenData.Phone) verificationScreenData : null;
                        if (phone != null) {
                            str = phone.b;
                        }
                        str = null;
                    } else if (checkPresenterInfo instanceof CheckPresenterInfo.Validation) {
                        str = ((CheckPresenterInfo.Validation) checkPresenterInfo).b;
                    } else {
                        if (checkPresenterInfo instanceof CheckPresenterInfo.PasswordLessAuth) {
                            str = ((CheckPresenterInfo.PasswordLessAuth) checkPresenterInfo).b.b;
                        }
                        str = null;
                    }
                    if (!(codeState.e() instanceof CodeState.MaxMessengerWait) || (codeState.e() instanceof CodeState.MaxCodeWait)) {
                        sir0.a.getClass();
                        if (sir0.c(str)) {
                            z3 = true;
                        }
                    }
                    sir0 sir0Var = sir0.a;
                    boolean z4 = z3;
                    String str2 = str;
                    sir0.e eVar = new sir0.e(this.K, str2, z4, z, z, z2, false, false, false, null, VideoRecord.DEFAULT_MAX_DIMENSION);
                    int i = 10;
                    sir0.d dVar = new sir0.d(new k82(18, this, str2), new wq20(this, i), null, null, 12);
                    sir0Var.getClass();
                    this.t.b(mnh0.B(w0(sir0.g(eVar, dVar).U(new d810(new px30(codeState2, i), 9)), true), this.s, new cqv(this, 25), new q130(this, 9), null));
                }
            }
        }
        z = true;
        if (!(checkPresenterInfo instanceof CheckPresenterInfo.SignUp)) {
        }
        if (!(codeState.e() instanceof CodeState.MaxMessengerWait) || (codeState.e() instanceof CodeState.MaxCodeWait)) {
        }
        sir0 sir0Var2 = sir0.a;
        boolean z42 = z3;
        String str22 = str;
        sir0.e eVar2 = new sir0.e(this.K, str22, z42, z, z, z2, false, false, false, null, VideoRecord.DEFAULT_MAX_DIMENSION);
        int i2 = 10;
        sir0.d dVar2 = new sir0.d(new k82(18, this, str22), new wq20(this, i2), null, null, 12);
        sir0Var2.getClass();
        this.t.b(mnh0.B(w0(sir0.g(eVar2, dVar2).U(new d810(new px30(codeState2, i2), 9)), true), this.s, new cqv(this, 25), new q130(this, 9), null));
    }

    public final void Q0(boolean z) {
        CodeState z0 = z0();
        if (z0 instanceof CodeState.MaxMessengerWait) {
            if (this.J != null) {
                return;
            }
            SignUpDataHolder signUpDataHolder = this.p;
            CodeState.MaxMessengerWait maxMessengerWait = (CodeState.MaxMessengerWait) z0;
            (signUpDataHolder != null ? signUpDataHolder : null).L = maxMessengerWait.g;
            this.J = hg1.h(((no10) this.I.getValue()).a(maxMessengerWait.g, this.K, z).a0(io.reactivex.rxjava3.android.schedulers.a.b()), new s8(1, this, cp70.class, "resolveMaxSessionStatus", "resolveMaxSessionStatus(Lcom/vk/auth/smartflow/api/data/models/maxmessenger/GetMaxSessionStatus;)V", 0, 11));
            return;
        }
        SignUpDataHolder signUpDataHolder2 = this.p;
        if (signUpDataHolder2 == null) {
            signUpDataHolder2 = null;
        }
        signUpDataHolder2.L = null;
        io.reactivex.rxjava3.disposables.c cVar = this.J;
        if (cVar != null) {
            cVar.dispose();
        }
        this.J = null;
    }

    @Override // com.vk.auth.verification.base.b, xsna.l0c
    public final void a() {
        if (this.z instanceof CodeState.CallResetPreview) {
            s(false);
        } else {
            super.a();
        }
    }

    @Override // xsna.p66, xsna.z55
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        if (i != 2) {
            return false;
        }
        if (i2 != -1) {
            return true;
        }
        String stringExtra = intent != null ? intent.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE") : null;
        inr0 inr0Var = this.E;
        inr0Var.getClass();
        inr0Var.d(new kl4(com.vk.registration.funnels.b.a));
        I0(stringExtra);
        return true;
    }

    @Override // xsna.p66, xsna.z55
    public final void onDestroy() {
        super.onDestroy();
        this.b.unregisterReceiver(this.L);
    }

    @Override // xsna.p66, xsna.z55
    public final void onStart() {
        Q0(true);
    }

    @Override // xsna.p66, xsna.z55
    public final void onStop() {
        io.reactivex.rxjava3.disposables.c cVar = this.J;
        if (cVar != null) {
            cVar.dispose();
        }
        this.J = null;
    }

    @Override // com.vk.auth.verification.base.b, xsna.p66, xsna.z55
    /* renamed from: p */
    public final void y0(x65 x65Var) {
        zzab zzabVar;
        super.y0((vo70) x65Var);
        if (!(this.z instanceof CodeState.SmsWait) || (zzabVar = this.M) == null) {
            return;
        }
        zzabVar.startSmsUserConsent(null);
    }

    @Override // com.vk.auth.verification.base.b, xsna.l0c
    public final void s(boolean z) {
        super.s(z);
        P0();
    }

    @Override // com.vk.auth.verification.base.b
    public final void y0(vo70 vo70Var) {
        zzab zzabVar;
        super.y0(vo70Var);
        if (!(this.z instanceof CodeState.SmsWait) || (zzabVar = this.M) == null) {
            return;
        }
        zzabVar.startSmsUserConsent(null);
    }
}
