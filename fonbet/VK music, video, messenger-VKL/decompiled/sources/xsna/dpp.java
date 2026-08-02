package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.vk.auth.enterphone.EnterPhonePresenterInfo;
import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.auth.ui.VkAuthPhoneView;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.registration.funnels.RegistrationElementsTracker;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.registration.funnels.TrackingElement;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: EnterPhoneFragment.kt */
/* loaded from: classes15.dex */
public class dpp extends a66<com.vk.auth.enterphone.a> implements cpp {
    public boolean A;
    public final b B;
    public e68 C;
    public View s;
    public VkAuthPhoneView t;
    public TextView u;
    public TextView v;
    public mg6 w;
    public final pao0 x = new pao0(R.string.vk_auth_sign_up_terms_new_custom, R.string.vk_auth_sign_up_terms_new_custom_single, R.string.vk_auth_sign_up_terms_new);
    public EnterPhonePresenterInfo y;
    public final com.vk.registration.funnels.d z;

    /* compiled from: EnterPhoneFragment.kt */
    public static final class a {
        public static Bundle a(EnterPhonePresenterInfo enterPhonePresenterInfo) {
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("presenterInfo", enterPhonePresenterInfo);
            return bundle;
        }
    }

    /* compiled from: EnterPhoneFragment.kt */
    public static final class b extends xsj0 {
        public b() {
        }

        @Override // xsna.xsj0, android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (i3 > 0 || i2 > 0) {
                dpp dppVar = dpp.this;
                if (dppVar.A) {
                    return;
                }
                com.vk.registration.funnels.b.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.INPUT_NUMBER_INTERACTION, null, null, null, null, null, null, 254);
                dppVar.A = true;
            }
        }
    }

    public dpp() {
        TrackingElement.Registration registration = TrackingElement.Registration.PHONE_NUMBER;
        RegistrationElementsTracker registrationElementsTracker = RegistrationElementsTracker.a;
        this.z = new com.vk.registration.funnels.d(registration);
        this.B = new b();
    }

    @Override // xsna.cpp
    public final void W0(boolean z) {
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            vkLoadingButton.setEnabled(!z);
        }
    }

    @Override // xsna.a66, com.vk.registration.funnels.c
    public final List<Pair<TrackingElement.Registration, gzs<String>>> aa() {
        if (this.t == null) {
            return EmptyList.b;
        }
        EnterPhonePresenterInfo enterPhonePresenterInfo = this.y;
        if (enterPhonePresenterInfo == null) {
            enterPhonePresenterInfo = null;
        }
        return enterPhonePresenterInfo instanceof EnterPhonePresenterInfo.SignUp ? e43.l(new Pair(TrackingElement.Registration.PHONE_NUMBER, new k6k(this, 7)), new Pair(TrackingElement.Registration.PHONE_COUNTRY, new odm(this, 4))) : EmptyList.b;
    }

    @Override // xsna.cpp
    public final void bj(Country country) {
        VkAuthPhoneView vkAuthPhoneView = this.t;
        if (vkAuthPhoneView == null) {
            vkAuthPhoneView = null;
        }
        vkAuthPhoneView.b(country);
    }

    @Override // xsna.cpp
    public final void cj() {
        VkAuthPhoneView vkAuthPhoneView = this.t;
        if (vkAuthPhoneView == null) {
            vkAuthPhoneView = null;
        }
        vkAuthPhoneView.p = false;
        vkAuthPhoneView.c(vkAuthPhoneView.f.hasFocus());
        TextView textView = this.u;
        f4m.j(textView != null ? textView : null);
    }

    @Override // xsna.cpp
    public final void m2(String str) {
        TextView textView = this.u;
        if (textView == null) {
            textView = null;
        }
        textView.setText(str);
        VkAuthPhoneView vkAuthPhoneView = this.t;
        if (vkAuthPhoneView == null) {
            vkAuthPhoneView = null;
        }
        vkAuthPhoneView.p = true;
        vkAuthPhoneView.c(vkAuthPhoneView.f.hasFocus());
        TextView textView2 = this.u;
        (textView2 != null ? textView2 : null).setVisibility(0);
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        Bundle requireArguments = requireArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = requireArguments.getParcelable("presenterInfo", EnterPhonePresenterInfo.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = requireArguments.getParcelable("presenterInfo");
            if (!(parcelable3 instanceof EnterPhonePresenterInfo)) {
                parcelable3 = null;
            }
            parcelable = (EnterPhonePresenterInfo) parcelable3;
        }
        this.y = (EnterPhonePresenterInfo) parcelable;
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return wn(R.layout.vk_auth_enter_phone_fragment, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        e68 e68Var = this.C;
        if (e68Var != null) {
            efy.b(e68Var);
        }
        mg6 mg6Var = this.w;
        if (mg6Var == null) {
            mg6Var = null;
        }
        ((oao0) mg6Var.e).b();
        Object obj = this.o;
        ((com.vk.auth.enterphone.a) (obj != null ? obj : null)).e();
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        CharSequence text;
        super.onViewCreated(view, bundle);
        this.s = view.findViewById(R.id.enter_phone_container);
        this.t = (VkAuthPhoneView) view.findViewById(R.id.phone);
        this.u = (TextView) view.findViewById(R.id.phone_error);
        this.v = (TextView) view.findViewById(R.id.enter_phone_legal_notes);
        VkAuthPhoneView vkAuthPhoneView = this.t;
        if (vkAuthPhoneView == null) {
            vkAuthPhoneView = null;
        }
        ycu0 ycu0Var = this.p;
        if (ycu0Var == null) {
            ycu0Var = null;
        }
        ycu0Var.getClass();
        vkAuthPhoneView.setHideCountryField(ycu0Var instanceof ycu0);
        Object obj = this.o;
        Object obj2 = obj;
        if (obj == null) {
            obj2 = null;
        }
        nao0 nao0Var = (nao0) obj2;
        TextView textView = this.v;
        TextView textView2 = textView != null ? textView : null;
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton == null || (text = vkLoadingButton.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        this.w = new mg6(nao0Var, textView2, str, krv0.m(R.attr.vk_ui_text_subhead, requireContext()), new wcj(this, 10), 32);
        VkAuthPhoneView vkAuthPhoneView2 = this.t;
        if (vkAuthPhoneView2 == null) {
            vkAuthPhoneView2 = null;
        }
        vkAuthPhoneView2.setChooseCountryClickListener(new akh(this, 12));
        VkLoadingButton vkLoadingButton2 = this.k;
        if (vkLoadingButton2 != null) {
            jjc.g(vkLoadingButton2, new gmj(this, 7));
        }
        Object obj3 = this.o;
        Object obj4 = obj3;
        if (obj3 == null) {
            obj4 = null;
        }
        com.vk.auth.enterphone.a aVar = (com.vk.auth.enterphone.a) obj4;
        aVar.y0(this);
        bj(aVar.C);
        boolean z = ((Boolean) aVar.A.getValue()).booleanValue() || ((Boolean) aVar.B.getValue()).booleanValue();
        if (!aVar.E && aVar.D.length() == 0 && z) {
            qcv0 qcv0Var = aVar.y;
            if (qcv0Var != null) {
                new wi3(1, aVar, com.vk.auth.enterphone.a.class, "onPhoneSelected", "onPhoneSelected$common_release(Ljava/lang/String;)V", 0, 9);
                qcv0Var.b(18375);
            } else {
                com.vk.registration.funnels.b.a.getClass();
                com.vk.registration.funnels.b.m();
            }
            aVar.E = true;
        }
        xl(aVar.D);
        aVar.i0(kbc.a.a.subscribe(new y50(new ae8(1, aVar, com.vk.auth.enterphone.a.class, "onCountryChosen", "onCountryChosen(Lcom/vk/auth/enterphone/choosecountry/Country;)V", 0, 4), 22)));
        VkAuthPhoneView vkAuthPhoneView3 = this.t;
        if (vkAuthPhoneView3 == null) {
            vkAuthPhoneView3 = null;
        }
        aVar.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(new qno0(vkAuthPhoneView3.f), new e4t(new r6i0(vkAuthPhoneView3, 22), 21)).U(new hl30(new ykt0(vkAuthPhoneView3, 2), 20)).subscribe(new st0(new com.vk.im.engine.commands.messages.a(18, aVar, this), 16)));
        VkAuthPhoneView vkAuthPhoneView4 = this.t;
        if (vkAuthPhoneView4 == null) {
            vkAuthPhoneView4 = null;
        }
        aVar.i0(vkAuthPhoneView4.l.subscribe(new el6(new k0j(aVar, 10), 22)));
        VkAuthPhoneView vkAuthPhoneView5 = this.t;
        if (vkAuthPhoneView5 == null) {
            vkAuthPhoneView5 = null;
        }
        vkAuthPhoneView5.getClass();
        bpn0 bpn0Var = t65.a;
        t65.a(vkAuthPhoneView5.f);
        aVar.t.b(mnh0.B(aVar.c.i(), aVar.s, new s6k(aVar, 13), new u6k(aVar, 6), null));
        view.post(new nx3(this, 3));
        View view2 = this.s;
        e68 e68Var = new e68(view2 != null ? view2 : null);
        efy.a(e68Var);
        this.C = e68Var;
        View findViewById = view.findViewById(R.id.help_button);
        if (findViewById != null) {
            un().getClass();
            findViewById.setVisibility(otu0.a() ? 0 : 8);
            findViewById.setOnClickListener(new be6(this, 5));
        }
    }

    @Override // xsna.cpp
    public final void rb() {
        new mbc().Td(getParentFragmentManager(), "ChooseCountry");
    }

    @Override // xsna.cpp
    public final void setChooseCountryEnable(boolean z) {
        VkAuthPhoneView vkAuthPhoneView = this.t;
        if (vkAuthPhoneView == null) {
            vkAuthPhoneView = null;
        }
        vkAuthPhoneView.setChooseCountryEnable(z);
    }

    @Override // xsna.a66
    public final com.vk.auth.enterphone.a tn(Bundle bundle) {
        EnterPhonePresenterInfo enterPhonePresenterInfo = this.y;
        if (enterPhonePresenterInfo == null) {
            enterPhonePresenterInfo = null;
        }
        ycu0 ycu0Var = this.p;
        return new com.vk.auth.enterphone.a(enterPhonePresenterInfo, (ycu0Var != null ? ycu0Var : null).a(this), bundle);
    }

    @Override // xsna.a66, xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        Parcelable parcelable;
        Object parcelable2;
        EnterPhonePresenterInfo enterPhonePresenterInfo = this.y;
        if (enterPhonePresenterInfo == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = arguments.getParcelable("presenterInfo", EnterPhonePresenterInfo.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = arguments.getParcelable("presenterInfo");
                    if (!(parcelable3 instanceof EnterPhonePresenterInfo)) {
                        parcelable3 = null;
                    }
                    parcelable = (EnterPhonePresenterInfo) parcelable3;
                }
                enterPhonePresenterInfo = (EnterPhonePresenterInfo) parcelable;
                if (enterPhonePresenterInfo != null) {
                    this.y = enterPhonePresenterInfo;
                }
            }
            return SchemeStatSak$EventScreen.NOWHERE;
        }
        return enterPhonePresenterInfo instanceof EnterPhonePresenterInfo.Validate ? SchemeStatSak$EventScreen.VERIFICATION_ENTER_NUMBER : enterPhonePresenterInfo instanceof EnterPhonePresenterInfo.SignUp ? SchemeStatSak$EventScreen.REGISTRATION_PHONE : SchemeStatSak$EventScreen.NOWHERE;
    }

    @Override // xsna.x65
    public final void wm(boolean z) {
        VkAuthPhoneView vkAuthPhoneView = this.t;
        if (vkAuthPhoneView == null) {
            vkAuthPhoneView = null;
        }
        vkAuthPhoneView.setEnabled(!z);
    }

    @Override // xsna.cpp
    public final void xd() {
        TextView textView = this.u;
        if (textView == null) {
            textView = null;
        }
        textView.setText(getString(R.string.vk_auth_sign_up_incorrect_phone));
        VkAuthPhoneView vkAuthPhoneView = this.t;
        if (vkAuthPhoneView == null) {
            vkAuthPhoneView = null;
        }
        vkAuthPhoneView.p = true;
        vkAuthPhoneView.c(vkAuthPhoneView.f.hasFocus());
        TextView textView2 = this.u;
        (textView2 != null ? textView2 : null).setVisibility(0);
    }

    @Override // xsna.cpp
    public final void xl(String str) {
        VkAuthPhoneView vkAuthPhoneView = this.t;
        if (vkAuthPhoneView == null) {
            vkAuthPhoneView = null;
        }
        EditText editText = vkAuthPhoneView.f;
        if (!epx.f(vkAuthPhoneView.getPhoneWithoutCode(), str)) {
            editText.setText(str);
        }
        editText.setSelection(editText.getText().length());
    }

    @Override // xsna.a66
    public final void xn() {
        EnterPhonePresenterInfo enterPhonePresenterInfo = this.y;
        if (enterPhonePresenterInfo == null) {
            enterPhonePresenterInfo = null;
        }
        if (enterPhonePresenterInfo instanceof EnterPhonePresenterInfo.SignUp) {
            VkAuthPhoneView vkAuthPhoneView = this.t;
            if (vkAuthPhoneView == null) {
                vkAuthPhoneView = null;
            }
            vkAuthPhoneView.f.removeTextChangedListener(this.z);
        }
        VkAuthPhoneView vkAuthPhoneView2 = this.t;
        (vkAuthPhoneView2 != null ? vkAuthPhoneView2 : null).f.removeTextChangedListener(this.B);
    }
}
