package xsna;

import android.animation.LayoutTransition;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.vk.auth.ui.VkAuthIncorrectLoginView;
import com.vk.auth.ui.VkAuthPasswordView;
import com.vk.registration.funnels.RegistrationElementsTracker;
import com.vk.registration.funnels.TrackingElement;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.ui.toolbar.VkAuthToolbar;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.eeu0;
import xsna.ft1;
import xsna.oou0;

/* compiled from: EnterLoginPasswordFragment.kt */
/* loaded from: classes15.dex */
public class pop extends mly<qop> implements o200 {
    public VkAuthIncorrectLoginView A;
    public final com.vk.registration.funnels.d B;
    public final com.vk.registration.funnels.d C;
    public final b D;
    public final c E;
    public boolean F;
    public final bpn0 G;
    public final bpn0 H;
    public ConstraintLayout t;
    public TextView u;
    public ViewGroup v;
    public EditText w;
    public EditText x;
    public View y;
    public VkAuthPasswordView z;

    /* compiled from: EnterLoginPasswordFragment.kt */
    public static final class a {
        public static Bundle a(String str) {
            Bundle bundle = new Bundle(2);
            bundle.putBoolean("WITH_CLOSE_BUTTON", true);
            bundle.putString("LOGIN", str);
            return bundle;
        }
    }

    public pop() {
        TrackingElement.Registration registration = TrackingElement.Registration.PHONE_NUMBER;
        RegistrationElementsTracker registrationElementsTracker = RegistrationElementsTracker.a;
        this.B = new com.vk.registration.funnels.d(registration, SchemeStatSak$TypeRegistrationItem.EventType.LOGIN_TAP);
        this.C = new com.vk.registration.funnels.d(TrackingElement.Registration.PASSWORD, SchemeStatSak$TypeRegistrationItem.EventType.PASSW_TAP);
        this.D = new b();
        this.E = new c();
        this.G = new bpn0(new jcg(this, 14));
        this.H = new bpn0(new g4g(this, 12));
    }

    @Override // xsna.o200
    public final void J1() {
        VkAuthIncorrectLoginView vkAuthIncorrectLoginView = this.A;
        if (vkAuthIncorrectLoginView == null) {
            vkAuthIncorrectLoginView = null;
        }
        vkAuthIncorrectLoginView.setVisibility(0);
    }

    @Override // xsna.o200
    public final void X2() {
        bpn0 bpn0Var = t65.a;
        EditText editText = this.w;
        if (editText == null) {
            editText = null;
        }
        t65.a(editText);
    }

    @Override // xsna.a66, com.vk.registration.funnels.c
    public final List<Pair<TrackingElement.Registration, gzs<String>>> aa() {
        return e43.l(new Pair(TrackingElement.Registration.PHONE_NUMBER, new nef(this, 9)), new Pair(TrackingElement.Registration.PASSWORD, new tbh(this, 11)));
    }

    @Override // xsna.q200
    public final void i3(boolean z) {
        View view = this.y;
        if (view == null) {
            view = null;
        }
        view.setEnabled(!z);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LinkedHashMap linkedHashMap = ft1.a;
        ViewGroup viewGroup = (ViewGroup) getView();
        LinkedHashMap linkedHashMap2 = ft1.a;
        int i = efy.b;
        int i2 = efy.a;
        if (i <= i2) {
            ft1.a aVar = (ft1.a) linkedHashMap2.get(viewGroup);
            if (aVar != null) {
                aVar.c.invoke();
                return;
            }
            return;
        }
        ft1.a aVar2 = (ft1.a) linkedHashMap2.get(viewGroup);
        if (aVar2 != null) {
            oce oceVar = aVar2.b;
            int i3 = efy.b;
            if (i3 != 0) {
                i2 = i3;
            }
            oceVar.invoke(Integer.valueOf(i2));
        }
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle arguments = getArguments();
        this.F = arguments != null ? arguments.getBoolean("WITH_CLOSE_BUTTON") : false;
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return wn(R.layout.vk_auth_enter_login_password, layoutInflater, viewGroup);
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        EditText editText = this.w;
        if (editText == null) {
            editText = null;
        }
        editText.removeTextChangedListener(this.D);
        EditText editText2 = this.x;
        if (editText2 == null) {
            editText2 = null;
        }
        editText2.removeTextChangedListener(this.E);
        EditText editText3 = this.w;
        if (editText3 == null) {
            editText3 = null;
        }
        editText3.removeTextChangedListener(this.B);
        EditText editText4 = this.x;
        (editText4 != null ? editText4 : null).removeTextChangedListener(this.C);
        LinkedHashMap linkedHashMap = ft1.a;
        ViewGroup viewGroup = (ViewGroup) getView();
        LinkedHashMap linkedHashMap2 = ft1.a;
        ft1.a aVar = (ft1.a) linkedHashMap2.get(viewGroup);
        if (aVar != null) {
            efy.b(aVar);
        }
        linkedHashMap2.remove(viewGroup);
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.mly, xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        LayoutTransition layoutTransition;
        super.onViewCreated(view, bundle);
        this.m = (NestedScrollView) view.findViewById(R.id.base_auth_scrollable_content_container);
        this.t = (ConstraintLayout) view.findViewById(R.id.constraint_layout);
        this.u = (TextView) view.findViewById(R.id.title);
        this.v = (ViewGroup) view.findViewById(R.id.login_password_container);
        this.w = (EditText) view.findViewById(R.id.email_or_phone);
        this.x = (EditText) view.findViewById(R.id.vk_password);
        this.y = view.findViewById(R.id.continue_btn);
        this.z = (VkAuthPasswordView) view.findViewById(R.id.password_container);
        VkAuthIncorrectLoginView vkAuthIncorrectLoginView = (VkAuthIncorrectLoginView) view.findViewById(R.id.incorrect_login_view);
        this.A = vkAuthIncorrectLoginView;
        int i = 5;
        vkAuthIncorrectLoginView.setResetClickListener(new s1m(this, i));
        EditText editText = this.x;
        if (editText == null) {
            editText = null;
        }
        int i2 = 0;
        editText.setImportantForAutofill(0);
        EditText editText2 = this.x;
        if (editText2 == null) {
            editText2 = null;
        }
        editText2.setAutofillHints(LoginApiConstants.PARAM_NAME_PASSWORD);
        r55 r55Var = r55.a;
        umu0 umu0Var = r55.g;
        if (umu0Var == null) {
            umu0Var = null;
        }
        umu0Var.getClass();
        TextView textView = this.u;
        if (textView == null) {
            textView = null;
        }
        f4m.j(textView);
        EditText editText3 = this.w;
        if (editText3 == null) {
            editText3 = null;
        }
        editText3.addTextChangedListener(this.D);
        EditText editText4 = this.x;
        if (editText4 == null) {
            editText4 = null;
        }
        editText4.addTextChangedListener(this.E);
        EditText editText5 = this.x;
        if (editText5 == null) {
            editText5 = null;
        }
        editText5.setOnEditorActionListener(new oop(this, i2));
        EditText editText6 = this.w;
        if (editText6 == null) {
            editText6 = null;
        }
        editText6.addTextChangedListener(this.B);
        EditText editText7 = this.x;
        if (editText7 == null) {
            editText7 = null;
        }
        editText7.addTextChangedListener(this.C);
        View view2 = this.y;
        if (view2 == null) {
            view2 = null;
        }
        view2.setOnClickListener(new hn2(this, i));
        VkAuthPasswordView vkAuthPasswordView = this.z;
        if (vkAuthPasswordView == null) {
            vkAuthPasswordView = null;
        }
        int i3 = 9;
        jjc.g(vkAuthPasswordView.e, new efr0(new v3o(this, 1), i3));
        boolean z = this.F;
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("LOGIN")) == null) {
            str = "";
        }
        VkAuthToolbar vkAuthToolbar = this.j;
        if (vkAuthToolbar != null) {
            vkAuthToolbar.setNavigationIconVisible(z);
        }
        w8(str, "");
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null && (layoutTransition = viewGroup.getLayoutTransition()) != null) {
            layoutTransition.enableTransitionType(4);
        }
        LinkedHashMap linkedHashMap = ft1.a;
        ViewGroup viewGroup2 = (ViewGroup) view;
        ft1.a aVar = new ft1.a(viewGroup2, new oce(this, 20), new n5i(this, i3));
        ft1.a.put(viewGroup2, aVar);
        efy.a(aVar);
        ycu0 ycu0Var = this.p;
        if (ycu0Var == null) {
            ycu0Var = null;
        }
        requireContext();
        ycu0Var.getClass();
        VkAuthToolbar vkAuthToolbar2 = this.j;
        if (vkAuthToolbar2 != null) {
            vkAuthToolbar2.setPicture(null);
        }
        Object obj = this.o;
        qop qopVar = (qop) (obj != null ? obj : null);
        qopVar.y0(this);
        qopVar.A0(true);
        if (qopVar.B) {
            return;
        }
        oou0.a aVar2 = qopVar.y;
        if (aVar2 != null) {
            aVar2.a(new t1e(qopVar, 16), new m4g(qopVar, 17));
        }
        qopVar.B = true;
    }

    @Override // xsna.a66
    public final z55 tn(Bundle bundle) {
        r55 r55Var = r55.a;
        oou0 oou0Var = (oou0) r55.c.getValue();
        return new qop(oou0Var != null ? oou0Var.a(kn(), g5z.a(this)) : null);
    }

    @Override // xsna.a66, xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        return SchemeStatSak$EventScreen.HAVE_ACCOUNT_CREDENTIALS;
    }

    @Override // xsna.q200
    public final void w8(String str, String str2) {
        EditText editText = this.w;
        if (editText == null) {
            editText = null;
        }
        editText.setText(str);
        EditText editText2 = this.w;
        if (editText2 == null) {
            editText2 = null;
        }
        editText2.setSelection(str.length());
        if (str2 == null) {
            EditText editText3 = this.x;
            (editText3 != null ? editText3 : null).setText("");
            return;
        }
        EditText editText4 = this.x;
        if (editText4 == null) {
            editText4 = null;
        }
        editText4.setText(str2);
        EditText editText5 = this.x;
        (editText5 != null ? editText5 : null).setSelection(str2.length());
    }

    @Override // xsna.x65
    public final void wm(boolean z) {
        EditText editText = this.w;
        if (editText == null) {
            editText = null;
        }
        editText.setEnabled(!z);
        EditText editText2 = this.x;
        (editText2 != null ? editText2 : null).setEnabled(!z);
    }

    @Override // xsna.o200
    public final void x1(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        eeu0.a aVar = new eeu0.a(hnj.a(requireContext()), R.style.VkAlertDialogNewTheme);
        aVar.q(R.string.vk_auth_use_smart_lock_data);
        final k4 k4Var = (k4) gzsVar;
        aVar.setPositiveButton(R.string.vk_auth_use_smart_lock_data_positive, new DialogInterface.OnClickListener() { // from class: xsna.lop
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                k4.this.invoke();
            }
        });
        dof dofVar = (dof) gzsVar2;
        aVar.setNegativeButton(R.string.vk_auth_use_smart_lock_data_negative, new mop(dofVar, 0));
        aVar.a.n = new nop(dofVar, 0);
        aVar.a(true);
        aVar.create().show();
    }

    public final void yn(String str) {
        Bundle arguments = getArguments();
        boolean z = this.F;
        if (arguments != null) {
            arguments.putBoolean("WITH_CLOSE_BUTTON", z);
        }
        if (arguments != null) {
            arguments.putString("LOGIN", str);
        }
        boolean z2 = this.F;
        VkAuthToolbar vkAuthToolbar = this.j;
        if (vkAuthToolbar != null) {
            vkAuthToolbar.setNavigationIconVisible(z2);
        }
        w8(str, "");
    }

    public final void zn(float f) {
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        ConstraintLayout constraintLayout = this.t;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        bVar.i(constraintLayout);
        bVar.I(f, R.id.login_password_container);
        ConstraintLayout constraintLayout2 = this.t;
        if (constraintLayout2 == null) {
            constraintLayout2 = null;
        }
        bVar.b(constraintLayout2);
        ConstraintLayout constraintLayout3 = this.t;
        (constraintLayout3 != null ? constraintLayout3 : null).requestLayout();
    }

    /* compiled from: EnterLoginPasswordFragment.kt */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            Object obj = pop.this.o;
            if (obj == null) {
                obj = null;
            }
            qop qopVar = (qop) obj;
            qopVar.z = editable.toString();
            qopVar.A0(false);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: EnterLoginPasswordFragment.kt */
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            Object obj = pop.this.o;
            if (obj == null) {
                obj = null;
            }
            qop qopVar = (qop) obj;
            qopVar.A = editable.toString();
            qopVar.A0(false);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
