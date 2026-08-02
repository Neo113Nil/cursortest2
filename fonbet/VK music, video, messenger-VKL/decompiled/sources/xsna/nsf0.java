package xsna;

import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import xsna.msf0;
import xsna.psf0;
import xsna.ssf0;
import xsna.tsf0;

/* compiled from: RelatedUserPinInputFeature.kt */
/* loaded from: classes6.dex */
public final class nsf0 extends wk50<usf0, tsf0, msf0, psf0> {
    public static final ArrayList<SchemeStatSak$RegistrationFieldItem> h;
    public final u240 f;
    public final f4z g;

    static {
        com.vk.registration.funnels.b.a.getClass();
        h = new ArrayList<>(Collections.singletonList(new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.ALERT, "", "", "pincode_too_many_attempts")));
    }

    public nsf0(u240 u240Var) {
        super(msf0.l.b, new qsf0(new tsf0(tsf0.a.C3765a.a, true)));
        this.f = u240Var;
        this.g = new f4z();
    }

    @Override // xsna.wk50
    public final void N(tsf0 tsf0Var, msf0 msf0Var) {
        tsf0 tsf0Var2 = tsf0Var;
        msf0 msf0Var2 = msf0Var;
        if (msf0Var2 instanceof msf0.l) {
            io.reactivex.rxjava3.core.q<lsf0> a = this.f.a();
            qw40 qw40Var = new qw40(new pf40(this, 13), 11);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            this.e.b(a.E(qw40Var, lVar, kVar, kVar).subscribe());
            return;
        }
        boolean z = msf0Var2 instanceof msf0.h;
        f4z f4zVar = this.g;
        if (z) {
            f4zVar.b(new ssf0.b(false));
            return;
        }
        if (msf0Var2 instanceof msf0.i) {
            f4zVar.b(new ssf0.d(((msf0.i) msf0Var2).b));
            return;
        }
        if (msf0Var2 instanceof msf0.k) {
            String str = ((msf0.k) msf0Var2).b;
            boolean z2 = tsf0Var2.c;
            if (str.length() <= 0 || !z2) {
                T(psf0.c.b);
                return;
            }
            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.PINCODE_INPUT_INTERACTION, null, null, null, null, null, null, 254);
            T(psf0.b.b);
            return;
        }
        if (msf0Var2 instanceof msf0.j) {
            T(psf0.a.C3528a.b);
            return;
        }
        if (msf0Var2 instanceof msf0.c) {
            T(psf0.d.b);
            return;
        }
        if (msf0Var2 instanceof msf0.b) {
            U();
            return;
        }
        if (msf0Var2 instanceof msf0.m) {
            T(new psf0.a.b(((msf0.m) msf0Var2).b));
            f4zVar.b(ssf0.f.a);
            return;
        }
        if (msf0Var2 instanceof msf0.f) {
            RegistrationFunnelScreenStack registrationFunnelScreenStack2 = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.PINCODE_INCORRECT, null, null, null, null, null, null, 254);
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.PINCODE_TOO_MANY_ATTEMPTS_ALERT, null, null, null, null, null, null, 254);
            T(psf0.a.c.b);
            return;
        }
        if (msf0Var2 instanceof msf0.d) {
            RegistrationFunnelScreenStack registrationFunnelScreenStack3 = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.PINCODE_SUCCESS_VALIDATION, null, null, null, null, null, null, 254);
            f4zVar.b(ssf0.c.a);
            return;
        }
        if (msf0Var2 instanceof msf0.e) {
            U();
            return;
        }
        if (msf0Var2 instanceof msf0.g) {
            f4zVar.b(ssf0.a.a);
            return;
        }
        boolean z3 = msf0Var2 instanceof msf0.n;
        ArrayList<SchemeStatSak$RegistrationFieldItem> arrayList = h;
        if (!z3) {
            if (!(msf0Var2 instanceof msf0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            RegistrationFunnelScreenStack registrationFunnelScreenStack4 = frf0.a;
            frf0.g(SchemeStatSak$EventScreen.PINCODE_VALIDATION_ENTER, SchemeStatSak$EventScreen.NOWHERE, arrayList, null, 8);
            return;
        }
        String str2 = ((msf0.n) msf0Var2).b;
        if (brm0.v(str2, "forgot_pincode", false)) {
            RegistrationFunnelScreenStack registrationFunnelScreenStack5 = frf0.a;
            frf0.f(SchemeStatSak$EventScreen.PINCODE_VALIDATION_ENTER, SchemeStatSak$EventScreen.PINCODE_CHANGE_NEW_PINCODE, null, false, null, null, 60);
        } else if (brm0.v(str2, "recover_pincode", false)) {
            RegistrationFunnelScreenStack registrationFunnelScreenStack6 = frf0.a;
            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.PINCODE_RESET_TAP, arrayList, null, SchemeStatSak$EventScreen.PINCODE_VALIDATION_ENTER, null, SchemeStatSak$EventScreen.PINCODE_CHANGE_NEW_PINCODE, null, Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE);
        }
        f4zVar.b(new ssf0.e(str2));
    }

    public final void U() {
        T(psf0.a.C3528a.b);
        this.g.b(ssf0.f.a);
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.PINCODE_INCORRECT, null, null, null, null, null, null, 254);
    }
}
