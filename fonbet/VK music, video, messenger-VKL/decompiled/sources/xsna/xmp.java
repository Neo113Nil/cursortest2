package xsna;

import android.util.Patterns;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SignUpRouter;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.core.api.models.SignUpField;
import com.vkontakte.android.R;
import java.util.ArrayList;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.wfn0;

/* compiled from: EnterEmailPresenter.kt */
/* loaded from: classes15.dex */
public final class xmp extends p66<vmp> implements ump {
    public final boolean x;
    public String y = "";
    public final tmp z;

    public xmp(boolean z) {
        this.x = z;
        SignUpDataHolder signUpDataHolder = this.p;
        boolean z2 = (signUpDataHolder == null ? null : signUpDataHolder).v;
        tmp tmpVar = new tmp();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.REGISTRATION_EMAIL;
        ArrayList arrayList = new ArrayList();
        SchemeStatSak$RegistrationFieldItem schemeStatSak$RegistrationFieldItem = new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.CAN_SKIP, "", "", z ? "1" : "0");
        SchemeStatSak$RegistrationFieldItem schemeStatSak$RegistrationFieldItem2 = new SchemeStatSak$RegistrationFieldItem(SchemeStatSak$RegistrationFieldItem.Name.REG_FLOW, "", "", z2 ? "add_reg" : "reg");
        arrayList.add(schemeStatSak$RegistrationFieldItem);
        arrayList.add(schemeStatSak$RegistrationFieldItem2);
        frf0.l(schemeStatSak$EventScreen, arrayList);
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        bVar.getClass();
        com.vk.registration.funnels.b.z(bVar, schemeStatSak$EventScreen, null, null, null, 30);
        tmpVar.a = true;
        this.z = tmpVar;
    }

    @Override // xsna.ump
    public final void K() {
        this.z.getClass();
        com.vk.registration.funnels.b.a.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.EMAIL_SKIP_TAP, null, null, null, null, null, null, 254);
        com.vk.auth.main.e eVar = this.o;
        if (eVar == null) {
            eVar = null;
        }
        eVar.b.s.add(SignUpField.EMAIL);
        eVar.j(SignUpRouter.DataScreen.EMAIL, this.w);
    }

    @Override // xsna.ump
    public final void g() {
        this.z.getClass();
        com.vk.registration.funnels.b.a.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CONTINUE_TAP, null, null, null, null, null, null, 254);
        if (Patterns.EMAIL_ADDRESS.matcher(this.y).matches()) {
            y0();
            return;
        }
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.INCORRECT_EMAIL, null, null, null, null, null, null, 254);
        vmp vmpVar = (vmp) this.a;
        if (vmpVar != null) {
            vmpVar.Pm(this.b.getString(R.string.vk_auth_enter_email_input_error_text));
        }
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.UNKNOWN;
    }

    @Override // xsna.p66, xsna.z55
    /* renamed from: p */
    public final void y0(vmp vmpVar) {
        vmp vmpVar2 = vmpVar;
        super.y0(vmpVar2);
        vmpVar2.W4(this.x);
        vmpVar2.setContinueButtonEnabled(this.y.length() > 0);
    }

    @Override // xsna.ump
    public final void t(String str) {
        String obj = drm0.p0(str).toString();
        this.y = obj;
        vmp vmpVar = (vmp) this.a;
        if (vmpVar != null) {
            vmpVar.setContinueButtonEnabled(obj.length() > 0);
        }
        vmp vmpVar2 = (vmp) this.a;
        if (vmpVar2 != null) {
            vmpVar2.Pm(null);
        }
        String str2 = this.y;
        tmp tmpVar = this.z;
        if (!tmpVar.a || str2.length() <= 0) {
            return;
        }
        com.vk.registration.funnels.b.a.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.INPUT_EMAIL_INTERACTION, null, null, null, null, null, null, 254);
        tmpVar.a = false;
    }

    public final void y0() {
        SignUpDataHolder signUpDataHolder = this.p;
        if (signUpDataHolder == null) {
            signUpDataHolder = null;
        }
        String str = signUpDataHolder.o;
        if (str == null) {
            m200.C(new IllegalStateException("sid should not be null"));
        } else {
            vdx0 vdx0Var = e370.e;
            this.t.b(mnh0.B(w0(wfn0.a.a((vdx0Var != null ? vdx0Var : null).e(), str, this.y, 4), true), this.s, new wzf(this, 16), new udo(this, 4), new ngl(null, null, null, null, null, null, null, null, null, new ux0(this, 25), ApiInvocationException.ErrorCodes.IDS_BLOCKED)));
        }
    }
}
