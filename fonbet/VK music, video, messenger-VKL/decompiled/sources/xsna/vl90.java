package xsna;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.auth.passkey.PasskeyCheckInfo;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.emailforwarding.api.VkEmailForwardingConfig;
import com.vk.mail.auth.api.MailAuthFlowConfig;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.ui.toolbar.VkAuthToolbar;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.sl90;

/* compiled from: PasskeyCheckFragment.kt */
/* loaded from: classes15.dex */
public final class vl90 extends a66<tl90> implements ul90 {
    public xpu0 s;
    public TextView t;
    public TextView u;
    public Button v;
    public Button w;
    public Button x;
    public Button y;
    public final boolean z = true;
    public final Object A = msy.a(LazyThreadSafetyMode.NONE, new jz70(this, 3));
    public final sj20 B = new sj20(new ufk(this, 23), new wcj(this, 29));

    /* compiled from: PasskeyCheckFragment.kt */
    public static final class a {
        public static Bundle a(PasskeyCheckInfo passkeyCheckInfo) {
            return yfb.b(new Pair("passkey_check_info", passkeyCheckInfo));
        }
    }

    @Override // xsna.a66, xsna.x65
    public final void S(boolean z) {
        if (z) {
            xpu0 xpu0Var = this.s;
            (xpu0Var != null ? xpu0Var : null).show();
        } else {
            xpu0 xpu0Var2 = this.s;
            (xpu0Var2 != null ? xpu0Var2 : null).dismiss();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d4, code lost:
    
        if (r1.c == true) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d7, code lost:
    
        if (r0 != false) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ul90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Yl(sl90 sl90Var) {
        TextView textView = this.t;
        Bundle bundle = null;
        if (textView == null) {
            textView = null;
        }
        textView.setText(getString(sl90Var.a));
        TextView textView2 = this.u;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(getString(sl90Var.b));
        if (!(sl90Var instanceof sl90.a)) {
            Button button = this.v;
            if (button == null) {
                button = null;
            }
            f4m.j(button);
            Button button2 = this.x;
            if (button2 == null) {
                button2 = null;
            }
            f4m.j(button2);
            Button button3 = this.w;
            if (button3 == null) {
                button3 = null;
            }
            f4m.j(button3);
            Button button4 = this.y;
            f4m.j(button4 != null ? button4 : null);
            return;
        }
        Button button5 = this.v;
        if (button5 == null) {
            button5 = null;
        }
        int i = 0;
        button5.setVisibility(0);
        Button button6 = this.v;
        if (button6 == null) {
            button6 = null;
        }
        sl90.a aVar = (sl90.a) sl90Var;
        button6.setText(getString(R.string.vk_passkey_try_again));
        Button button7 = this.x;
        if (button7 == null) {
            button7 = null;
        }
        button7.setVisibility(0);
        Button button8 = this.x;
        if (button8 == null) {
            button8 = null;
        }
        button8.setText(getString(aVar.c));
        if (aVar instanceof sl90.a.b) {
            Integer num = ((sl90.a.b) sl90Var).d;
            if (num != null) {
                Button button9 = this.x;
                if (button9 == null) {
                    button9 = null;
                }
                button9.setOnClickListener(new n14(this, 4));
                Button button10 = this.w;
                if (button10 == null) {
                    button10 = null;
                }
                button10.setOnClickListener(new gi8(this, 9));
                Button button11 = this.w;
                if (button11 == null) {
                    button11 = null;
                }
                button11.setVisibility(0);
                Button button12 = this.w;
                if (button12 == null) {
                    button12 = null;
                }
                button12.setText(getString(num.intValue()));
            } else {
                Button button13 = this.w;
                if (button13 == null) {
                    button13 = null;
                }
                f4m.j(button13);
            }
        } else if (aVar instanceof sl90.a.C3673a) {
            Button button14 = this.x;
            if (button14 == null) {
                button14 = null;
            }
            button14.setOnClickListener(new z1q(this, 4));
        }
        Button button15 = this.y;
        if (button15 == null) {
            button15 = null;
        }
        try {
            q55 q55Var = q55.a;
            bundle = q55.c().a.K;
        } catch (Throwable unused) {
        }
        if (bundle != null) {
            VkEmailForwardingConfig d = m63.d(bundle);
            Object[] objArr = d != null && d.b;
            MailAuthFlowConfig e = m63.e(bundle);
            if (e != null) {
            }
        }
        i = 8;
        button15.setVisibility(i);
    }

    @Override // xsna.ul90
    public final void e() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ul90
    public final void i2() {
        PasskeyCheckInfo yn = yn();
        ((ek20) this.A.getValue()).a(kn().getSupportFragmentManager(), this.B, new mj20(yn.c, yn.b, VerificationMethodTypes.PASSKEY, false));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = LayoutInflater.from(mo2getContext()).inflate(R.layout.vk_auth_passkey_fragment, viewGroup, false);
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        this.s = new xpu0(superappUiRouterBridge.u(kn(), false));
        VkAuthToolbar vkAuthToolbar = (VkAuthToolbar) inflate.findViewById(R.id.toolbar);
        r55 r55Var = r55.a;
        vkAuthToolbar.setPicture(r55.i().b(requireContext()));
        this.j = vkAuthToolbar;
        this.t = (TextView) inflate.findViewById(R.id.passkey_failed_attempt_title);
        this.u = (TextView) inflate.findViewById(R.id.passkey_failed_attempt_subtitle);
        Button button = (Button) inflate.findViewById(R.id.passkey_failed_attempt_retry);
        sp.t(button);
        jjc.g(button, new h630(this, 12));
        this.v = button;
        Button button2 = (Button) inflate.findViewById(R.id.passkey_failed_attempt_restore_account);
        jjc.g(button2, new ba40(this, 8));
        this.x = button2;
        Button button3 = (Button) inflate.findViewById(R.id.passkey_secondary_button);
        sp.t(button3);
        this.w = button3;
        Button button4 = (Button) inflate.findViewById(R.id.vk_enter_by_mail);
        sp.t(button4);
        jjc.g(button4, new bjk(this, 26));
        this.y = button4;
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        ((tl90) obj).e();
        xpu0 xpu0Var = this.s;
        (xpu0Var != null ? xpu0Var : null).b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.help_button);
        if (findViewById != null) {
            un().getClass();
            findViewById.setVisibility(otu0.a() ? 0 : 8);
            findViewById.setOnClickListener(new d27(this, 8));
        }
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        ((tl90) obj).y0(this);
        Object obj2 = this.o;
        ((tl90) (obj2 != null ? obj2 : null)).W();
    }

    @Override // xsna.a66
    public final tl90 tn(Bundle bundle) {
        return new wl90(yn(), kn());
    }

    @Override // xsna.a66, xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        return SchemeStatSak$EventScreen.OTHER;
    }

    @Override // xsna.a66
    public final boolean vn() {
        return this.z;
    }

    public final PasskeyCheckInfo yn() {
        Object parcelable;
        if (Build.VERSION.SDK_INT < 33) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                return (PasskeyCheckInfo) arguments.getParcelable("passkey_check_info");
            }
            return null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null) {
            return null;
        }
        parcelable = arguments2.getParcelable("passkey_check_info", PasskeyCheckInfo.class);
        return (PasskeyCheckInfo) parcelable;
    }

    @Override // xsna.x65
    public final void wm(boolean z) {
    }
}
