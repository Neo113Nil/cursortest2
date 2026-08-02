package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.vk.bridges.di.BridgeComponent;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.dw20;
import xsna.elw0;
import xsna.gm50;
import xsna.mk50;

/* compiled from: VoipCallsJoinToCallByPasswordModalDialog.kt */
/* loaded from: classes7.dex */
public final class ykw0 extends tl50<wkw0, plw0, vkw0> {
    public static final /* synthetic */ int j1 = 0;
    public olw0 i1;

    /* compiled from: VoipCallsJoinToCallByPasswordModalDialog.kt */
    public static final class a extends dw20.b {
        public final elw0 e;
        public final Bundle f;

        public a(Context context, elw0 elw0Var, Bundle bundle) {
            super(context, tzp0.a(null, 3));
            this.e = elw0Var;
            this.f = bundle;
            K0(16);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            ykw0 ykw0Var;
            Bundle arguments;
            elw0 elw0Var = this.e;
            if (elw0Var instanceof elw0.b) {
                ykw0Var = new ykw0();
            } else {
                if (!(elw0Var instanceof elw0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ykw0 ykw0Var2 = new ykw0();
                ykw0Var2.setArguments(yfb.b(new Pair("link", ((elw0.a) elw0Var).a)));
                ykw0Var = ykw0Var2;
            }
            Bundle bundle = this.f;
            if (bundle != null && (arguments = ykw0Var.getArguments()) != null) {
                arguments.putAll(bundle);
            }
            return ykw0Var;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        View inflate = getLayoutInflater().inflate(R.layout.voip_join_to_call_by_password_view, (ViewGroup) null);
        this.i1 = new olw0(inflate, this, new hij0(this, 24));
        return new mk50.c(inflate);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        plw0 plw0Var = (plw0) ao50Var;
        olw0 olw0Var = this.i1;
        if (olw0Var != null) {
            gm50.a.b(this, plw0Var.a, new whi0(9, this, olw0Var));
        }
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        wkw0 wkw0Var = (wkw0) vk50Var;
        wkw0Var.j.a(new lyl0(this, 21), this);
        wkw0Var.i.a(new xkw0(this, 0), this);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        String str;
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("link")) == null) {
            str = "";
        }
        return new wkw0(str, new vg20(), ((BridgeComponent) m7m.d(this).a(fpf0.a(BridgeComponent.class))).s());
    }
}
