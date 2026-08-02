package xsna;

import android.os.Bundle;
import android.os.SystemClock;
import com.vk.auth.enteremail.binding.BindEnteredEmailScreenData;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.wfn0;

/* compiled from: BindEnteredEmailPresenter.kt */
/* loaded from: classes15.dex */
public final class c37 extends p66<y27> implements x27 {
    public long A;
    public io.reactivex.rxjava3.disposables.c B;
    public final l090 C;
    public final uy9 D;
    public final w27 E;
    public final BindEnteredEmailScreenData x;
    public String y;
    public String z;

    /* compiled from: BindEnteredEmailPresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<String, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(String str) {
            String str2 = str;
            y27 y27Var = (y27) ((c37) this.receiver).a;
            if (y27Var != null) {
                y27Var.q4(str2);
            }
            return s3q0.a;
        }
    }

    public c37(BindEnteredEmailScreenData bindEnteredEmailScreenData, Bundle bundle) {
        String string;
        String string2;
        this.x = bindEnteredEmailScreenData;
        this.y = (bundle == null || (string2 = bundle.getString("code_key")) == null) ? "" : string2;
        this.z = (bundle == null || (string = bundle.getString("actual_sid_key")) == null) ? bindEnteredEmailScreenData.b : string;
        Long e = bundle != null ? bo8.e(bundle, "timer_end_timestmap") : null;
        this.A = e != null ? e.longValue() : SystemClock.elapsedRealtime() + (bindEnteredEmailScreenData.e * 1000);
        this.C = new l090(this.b);
        uy9 uy9Var = new uy9(new t7(this, 2));
        this.D = uy9Var;
        boolean z = bindEnteredEmailScreenData.d;
        SignUpDataHolder signUpDataHolder = this.p;
        boolean z2 = (signUpDataHolder != null ? signUpDataHolder : null).v;
        w27 w27Var = new w27();
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        bVar.getClass();
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.EMAIL_VERIFICATION;
        com.vk.registration.funnels.b.z(bVar, schemeStatSak$EventScreen, null, null, null, 30);
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        ArrayList arrayList = new ArrayList();
        SchemeStatSak$RegistrationFieldItem schemeStatSak$RegistrationFieldItem = new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.CAN_SKIP, "", "", z ? "1" : "0");
        SchemeStatSak$RegistrationFieldItem schemeStatSak$RegistrationFieldItem2 = new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.REG_FLOW, "", "", z2 ? "add_reg" : "reg");
        arrayList.add(schemeStatSak$RegistrationFieldItem);
        arrayList.add(schemeStatSak$RegistrationFieldItem2);
        frf0.l(schemeStatSak$EventScreen, arrayList);
        w27Var.a = true;
        this.E = w27Var;
        h0(((io.reactivex.rxjava3.subjects.d) uy9Var.c).subscribe(new tf1(new a(1, this, c37.class, "onNewCodeFromClipboard", "onNewCodeFromClipboard(Ljava/lang/String;)V", 0), 4)));
    }

    @Override // xsna.x27
    public final void F() {
        l090 l090Var = this.C;
        String a2 = l090Var.a();
        if (l090Var.b(a2) && drm0.N(this.y) && a2 != null) {
            this.D.k(a2);
            l090Var.b = a2;
        }
    }

    @Override // xsna.x27
    public final void O() {
        this.E.getClass();
        com.vk.registration.funnels.b.a.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.VERIFY_AGAIN_TAP, null, null, null, null, null, null, 254);
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        this.t.b(mnh0.B(w0(wfn0.a.a(vdx0Var.e(), this.z, this.x.c, 4), true), this.s, new zt4(this, 1), new yy(4), null));
    }

    @Override // xsna.x27
    public final void Y(String str) {
        String str2 = this.y;
        this.y = str;
        w27 w27Var = this.E;
        if (w27Var.a && str.length() > 0) {
            com.vk.registration.funnels.b.a.getClass();
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.INPUT_EMAIL_CODE_INTERACTION, null, null, null, null, null, null, 254);
            w27Var.a = false;
        }
        if (epx.f(str2, str) || str.length() != this.x.f) {
            return;
        }
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        this.t.b(mnh0.B(w0(vdx0Var.e().j(this.z, this.y), true), this.s, new fb(this, 7), new qt(8), new ngl(null, null, null, null, new v20(this, 5), null, null, null, null, null, 1007)));
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.UNKNOWN;
    }

    @Override // xsna.p66, xsna.z55
    public final void onStart() {
        y0();
    }

    @Override // xsna.p66, xsna.z55
    public final void onStop() {
        io.reactivex.rxjava3.disposables.c cVar = this.B;
        if (cVar != null) {
            cVar.dispose();
        }
        this.B = null;
    }

    @Override // xsna.p66, xsna.z55
    /* renamed from: p */
    public final void y0(y27 y27Var) {
        y27 y27Var2 = y27Var;
        super.y0(y27Var2);
        y27Var2.qf(false);
        y27Var2.setSubtitle(this.x.c);
    }

    @Override // xsna.p66, xsna.z55
    public final void x(Bundle bundle) {
        bundle.putLong("timer_end_timestmap", this.A);
        bundle.putString("code_key", this.y);
        bundle.putString("actual_sid_key", this.z);
    }

    public final void y0() {
        long elapsedRealtime = (this.A - SystemClock.elapsedRealtime()) / 1000;
        if (elapsedRealtime <= 0) {
            y27 y27Var = (y27) this.a;
            if (y27Var != null) {
                y27Var.F6(null);
            }
            y27 y27Var2 = (y27) this.a;
            if (y27Var2 != null) {
                y27Var2.qf(true);
                return;
            }
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.B;
        if (cVar != null) {
            cVar.dispose();
        }
        this.B = null;
        y27 y27Var3 = (y27) this.a;
        if (y27Var3 != null) {
            y27Var3.Pc();
        }
        this.B = hg1.h(io.reactivex.rxjava3.core.q.S(1L, elapsedRealtime, 0L, 1L, TimeUnit.SECONDS).U(new w7(new b37(elapsedRealtime, 0), 6)).a0(io.reactivex.rxjava3.android.schedulers.a.b()), new x7(this, 11));
    }
}
