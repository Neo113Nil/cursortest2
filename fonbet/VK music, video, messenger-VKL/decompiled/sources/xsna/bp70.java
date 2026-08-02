package xsna;

import android.os.Bundle;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.smartflow.api.data.VerificationMethodState;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.states.MethodSelectorCodeState;
import com.vk.superapp.analytics.MaxMessengerAnalytics;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.pst;

/* compiled from: OTPCheckMethodSelectorPresenter.kt */
/* loaded from: classes15.dex */
public final class bp70 extends r0c<yo70> implements xo70 {
    public final bpn0 R;
    public io.reactivex.rxjava3.disposables.c S;

    /* compiled from: OTPCheckMethodSelectorPresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<pst, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(pst pstVar) {
            pst pstVar2 = pstVar;
            bp70 bp70Var = (bp70) this.receiver;
            MaxMessengerAnalytics maxMessengerAnalytics = bp70Var.E;
            if (pstVar2 instanceof pst.d) {
                String str = ((pst.d) pstVar2).a;
                if (str != null) {
                    bp70Var.W0(str);
                } else {
                    bp70Var.U0();
                }
            } else if (pstVar2 instanceof pst.a) {
                bp70Var.a1();
                maxMessengerAnalytics.n();
                bp70Var.U0();
            } else if (pstVar2 instanceof pst.b) {
                bp70Var.a1();
                String string = bp70Var.b.getString(R.string.vk_auth_max_messenger_timed_out_error_title);
                maxMessengerAnalytics.a();
                yo70 yo70Var = (yo70) bp70Var.a;
                if (yo70Var != null) {
                    yo70Var.wa(string, new put(bp70Var), new fa6(bp70Var));
                }
            } else if (!(pstVar2 instanceof pst.c) && !(pstVar2 instanceof pst.e)) {
                throw new NoWhenBranchMatchedException();
            }
            return s3q0.a;
        }
    }

    public bp70(VerificationMethodState verificationMethodState, Bundle bundle, String str, CheckPresenterInfo checkPresenterInfo, zo70 zo70Var, com.vk.auth.suspicious_auth.b bVar) {
        super(verificationMethodState, bundle, str, checkPresenterInfo, zo70Var, bVar);
        this.R = new bpn0(new y84(16));
    }

    @Override // xsna.ya6
    public final void N0() {
        super.N0();
        b1(false);
    }

    @Override // xsna.ya6
    public final void O0(String str) {
        super.O0(str);
        W0(str);
    }

    public final void a1() {
        MethodSelectorCodeState methodSelectorCodeState = this.A;
        MethodSelectorCodeState.MaxMessenger maxMessenger = methodSelectorCodeState instanceof MethodSelectorCodeState.MaxMessenger ? (MethodSelectorCodeState.MaxMessenger) methodSelectorCodeState : null;
        if (maxMessenger == null) {
            return;
        }
        L0(new MethodSelectorCodeState.MaxMessenger(maxMessenger.c, maxMessenger.d, maxMessenger.e, false, maxMessenger.g));
        X0();
    }

    public final void b1(boolean z) {
        MethodSelectorCodeState methodSelectorCodeState = this.A;
        if (methodSelectorCodeState instanceof MethodSelectorCodeState.MaxMessenger) {
            MethodSelectorCodeState.MaxMessenger maxMessenger = (MethodSelectorCodeState.MaxMessenger) methodSelectorCodeState;
            boolean z2 = maxMessenger.f;
            String str = maxMessenger.d;
            if (z2) {
                if (this.S != null) {
                    return;
                }
                SignUpDataHolder signUpDataHolder = this.p;
                (signUpDataHolder != null ? signUpDataHolder : null).L = str;
                this.S = hg1.h(((no10) this.R.getValue()).a(str, this.x, z).a0(io.reactivex.rxjava3.android.schedulers.a.b()), new a(1, this, bp70.class, "resolveMaxSessionStatus", "resolveMaxSessionStatus(Lcom/vk/auth/smartflow/api/data/models/maxmessenger/GetMaxSessionStatus;)V", 0));
                return;
            }
        }
        SignUpDataHolder signUpDataHolder2 = this.p;
        if (signUpDataHolder2 == null) {
            signUpDataHolder2 = null;
        }
        signUpDataHolder2.L = null;
        io.reactivex.rxjava3.disposables.c cVar = this.S;
        if (cVar != null) {
            cVar.dispose();
        }
        this.S = null;
    }

    @Override // xsna.p66, xsna.z55
    public final void onStart() {
        b1(true);
    }

    @Override // xsna.p66, xsna.z55
    public final void onStop() {
        io.reactivex.rxjava3.disposables.c cVar = this.S;
        if (cVar != null) {
            cVar.dispose();
        }
        this.S = null;
    }
}
