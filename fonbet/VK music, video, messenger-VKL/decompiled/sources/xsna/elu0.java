package xsna;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.analytics.RegistrationStatFlowType;
import com.vk.superapp.api.analytics.RegistrationStatParamsFactory;
import com.vk.toggle.anonymous.SakFeatures;
import com.vkontakte.android.R;
import xsna.xwu0;

/* compiled from: VkClientEnterLoginFragment.kt */
/* loaded from: classes11.dex */
public final class elu0 extends kop {
    public View F;
    public View G;
    public View H;

    @Override // xsna.kop
    public final void An() {
        super.An();
        View view = this.F;
        int i = 0;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.H;
        if (view2 != null) {
            View view3 = this.G;
            if (view3 == null || view3.getVisibility() != 0) {
                un().getClass();
                if (!otu0.a()) {
                    i = 8;
                }
            }
            view2.setVisibility(i);
        }
    }

    @Override // xsna.kop
    public final vop Bn() {
        r55 r55Var = r55.a;
        oou0 oou0Var = (oou0) r55.c.getValue();
        xwu0.a a = oou0Var != null ? oou0Var.a(kn(), g5z.a(this)) : null;
        ycu0 ycu0Var = this.p;
        return new flu0(a, (ycu0Var != null ? ycu0Var : null).a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.kop
    public final void Cn(ViewStub viewStub) {
        Object obj = this.o;
        Object obj2 = obj;
        if (obj == null) {
            obj2 = null;
        }
        final flu0 flu0Var = obj2 instanceof flu0 ? (flu0) obj2 : null;
        if (flu0Var == null) {
            return;
        }
        viewStub.setLayoutResource(R.layout.vk_auth_business_signup_button);
        View inflate = viewStub.inflate();
        inflate.setVisibility(0);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: xsna.dlu0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                flu0 flu0Var2 = flu0.this;
                SignUpDataHolder signUpDataHolder = flu0Var2.p;
                if (signUpDataHolder == null) {
                    signUpDataHolder = null;
                }
                ao8.q(signUpDataHolder);
                com.vk.registration.funnels.b.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CREATE_BUSINESS_START, null, null, null, null, null, null, 254);
                RegistrationStatParamsFactory.a = RegistrationStatFlowType.AUTH_WITHOUT_PASSWORD;
                SignUpDataHolder signUpDataHolder2 = flu0Var2.p;
                if (signUpDataHolder2 == null) {
                    signUpDataHolder2 = null;
                }
                signUpDataHolder2.f = true;
                com.vk.auth.main.e eVar = flu0Var2.o;
                (eVar != null ? eVar : null).l();
            }
        });
        this.F = inflate;
    }

    @Override // xsna.kop
    public final void Dn(ViewStub viewStub) {
        if (SakFeatures.Type.CORE_CONTENT_INFO_BOTTOM_SHEET.h()) {
            viewStub.setLayoutResource(R.layout.content_info_button);
            final View inflate = viewStub.inflate();
            inflate.setVisibility(0);
            inflate.setOnClickListener(new View.OnClickListener() { // from class: xsna.clu0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    View view2 = inflate;
                    qgj.a(view2.getContext(), new r770(11, view2, this));
                }
            });
            this.G = inflate;
        }
    }

    @Override // xsna.kop, xsna.mly, xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        un().getClass();
        boolean a = otu0.a();
        this.H = view.findViewById(R.id.help_buttons_container);
        View findViewById = view.findViewById(R.id.help_button);
        if (findViewById != null) {
            findViewById.setVisibility(a ? 0 : 8);
            findViewById.setOnClickListener(new hop(this, 1));
        }
    }

    @Override // xsna.kop, xsna.a66
    public final /* bridge */ /* synthetic */ z55 tn(Bundle bundle) {
        return Bn();
    }

    @Override // xsna.kop
    public final void zn() {
        super.zn();
        View view = this.F;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.H;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }
}
