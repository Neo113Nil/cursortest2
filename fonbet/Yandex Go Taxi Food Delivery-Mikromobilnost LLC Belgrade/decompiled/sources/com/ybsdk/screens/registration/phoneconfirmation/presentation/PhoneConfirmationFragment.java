package com.ybsdk.screens.registration.phoneconfirmation.presentation;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.core.formatter.FormatTextWatcher;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.screens.registration.phoneconfirmation.presentation.PhoneConfirmationFragment;
import com.ybsdk.widgets.common.YbButtonView;
import defpackage.apu;
import defpackage.bmg0;
import defpackage.cg91;
import defpackage.czh0;
import defpackage.dcs;
import defpackage.dzh0;
import defpackage.eeb0;
import defpackage.f461;
import defpackage.feb0;
import defpackage.fx00;
import defpackage.geb0;
import defpackage.heb0;
import defpackage.i4b0;
import defpackage.jl40;
import defpackage.l76;
import defpackage.l9s;
import defpackage.leb0;
import defpackage.lfx;
import defpackage.m761;
import defpackage.neb0;
import defpackage.oeb0;
import defpackage.ohe0;
import defpackage.pk31;
import defpackage.pz40;
import defpackage.qas0;
import defpackage.qtb1;
import defpackage.rtu;
import defpackage.t9b0;
import defpackage.tqs;
import defpackage.ung0;
import defpackage.vez0;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 72\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0003-89B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b \u0010!J+\u0010\"\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010\u000bJ\u0017\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00105\u001a\b\u0012\u0004\u0012\u000204038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/ybsdk/screens/registration/phoneconfirmation/presentation/PhoneConfirmationFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lm761;", "Loeb0;", "Lcom/ybsdk/screens/registration/phoneconfirmation/presentation/a;", "Lleb0;", "viewModelFactory", "<init>", "(Lleb0;)V", "Lzy11;", "setupViews", "()V", "setupPhoneModeChangingAnimation", "Landroid/view/View;", "view", "", "isError", "", "getTextColor", "(Landroid/view/View;Z)I", "createViewModel", "()Lcom/ybsdk/screens/registration/phoneconfirmation/presentation/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lm761;", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onCreate", "(Landroid/os/Bundle;)V", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "viewState", "render", "(Loeb0;)V", "onDestroyView", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Lleb0;", "Lfeb0;", "phoneModeChangingAnimator", "Lfeb0;", "Ljava/lang/Runnable;", "phoneModeChangingRunnable", "Ljava/lang/Runnable;", "", "Lapu;", "predefinedPhoneFormatHolders", "Ljava/util/List;", "Companion", "tqs", "eeb0", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PhoneConfirmationFragment extends BaseMvvmFragment<m761, oeb0, a> {
    public static final eeb0 Companion = new eeb0();
    private static final long DELAY_BETWEEN_PHONE_ANIMATIONS = 250;
    private static final long DURATION_HEIGHT_ANIMATION = 300;
    private static final long DURATION_OPACITY_CHANGE_PHONE_BUTTON_ANIMATION = 150;
    private static final long DURATION_OPACITY_DEFAULT_ANIMATION = 300;
    private feb0 phoneModeChangingAnimator;
    private Runnable phoneModeChangingRunnable;
    private List<apu> predefinedPhoneFormatHolders;
    private final leb0 viewModelFactory;

    public PhoneConfirmationFragment(leb0 leb0Var) {
        super(null, null, null, null, a.class, 15, null);
        this.viewModelFactory = leb0Var;
    }

    private final int getTextColor(View view, boolean isError) {
        return vez0.w(isError ? ung0.ybColor_textIcon_negative : ung0.ybColor_textIcon_primary, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YbButtonView.a render$lambda$14$lambda$11(oeb0 oeb0Var, YbButtonView.a aVar) {
        return new YbButtonView.a(new Text.Resource(dzh0.ybsdk_authorization_button_confirm), null, null, null, null, null, null, false, oeb0Var.g(), null, 3070);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$14$lambda$13$lambda$12(PhoneConfirmationFragment phoneConfirmationFragment, String str) {
        phoneConfirmationFragment.getViewModel().d0(str);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupPhoneModeChangingAnimation() {
        f461 f461Var = ((m761) getBinding()).b;
        this.phoneModeChangingAnimator = new feb0(f461Var.j, f461Var.h, f461Var.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupViews() {
        f461 f461Var = ((m761) getBinding()).b;
        final int i = 0;
        f461Var.j.setOnClickListener(new View.OnClickListener(this) { // from class: deb0
            public final /* synthetic */ PhoneConfirmationFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                PhoneConfirmationFragment phoneConfirmationFragment = this.b;
                switch (i2) {
                    case 0:
                        PhoneConfirmationFragment.setupViews$lambda$5$lambda$1(phoneConfirmationFragment, view);
                        break;
                    default:
                        PhoneConfirmationFragment.setupViews$lambda$5$lambda$3(phoneConfirmationFragment, view);
                        break;
                }
            }
        });
        EditText editText = f461Var.h;
        editText.addTextChangedListener(new TextWatcher() { // from class: com.ybsdk.screens.registration.phoneconfirmation.presentation.PhoneConfirmationFragment$setupViews$lambda$5$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                a viewModel;
                r0 r0Var;
                Object value;
                viewModel = PhoneConfirmationFragment.this.getViewModel();
                String obj = s != null ? s.toString() : null;
                if (obj == null) {
                    obj = "";
                }
                String str = obj;
                pz40 Y = viewModel.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, heb0.a((heb0) value, null, null, null, false, str, false, 215)));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
        final int i2 = 1;
        f461Var.c.setOnClickListener(new View.OnClickListener(this) { // from class: deb0
            public final /* synthetic */ PhoneConfirmationFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                PhoneConfirmationFragment phoneConfirmationFragment = this.b;
                switch (i22) {
                    case 0:
                        PhoneConfirmationFragment.setupViews$lambda$5$lambda$1(phoneConfirmationFragment, view);
                        break;
                    default:
                        PhoneConfirmationFragment.setupViews$lambda$5$lambda$3(phoneConfirmationFragment, view);
                        break;
                }
            }
        });
        f461Var.d.setOnClickListener(new fx00(19, this, f461Var));
        new FormatTextWatcher(l76.j(qtb1.k().b(getString(czh0.ybsdk_phone_confirmation_phone_input_format))), editText, null, false, null, 28, null);
        f461Var.b.setMovementMethod(LinkMovementMethod.getInstance());
        ((m761) getBinding()).c.setPrimaryButtonOnClickListener(new t9b0(3, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViews$lambda$5$lambda$1(PhoneConfirmationFragment phoneConfirmationFragment, View view) {
        phoneConfirmationFragment.getViewModel().f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViews$lambda$5$lambda$3(PhoneConfirmationFragment phoneConfirmationFragment, View view) {
        phoneConfirmationFragment.getViewModel().f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViews$lambda$5$lambda$4(PhoneConfirmationFragment phoneConfirmationFragment, f461 f461Var, View view) {
        phoneConfirmationFragment.getViewModel().e0(f461Var.h.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupViews$lambda$6(PhoneConfirmationFragment phoneConfirmationFragment) {
        phoneConfirmationFragment.getViewModel().g0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        super.consumeSideEffect(sideEffect);
        if (sideEffect instanceof geb0) {
            f461 f461Var = ((m761) getBinding()).b;
            EditText editText = f461Var.h;
            editText.startAnimation(AnimationUtils.loadAnimation(getContext(), bmg0.ybsdk_animation_wiggle));
            f461Var.j.startAnimation(AnimationUtils.loadAnimation(getContext(), bmg0.ybsdk_animation_wiggle));
            cg91.c(editText, pk31.c);
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((neb0) this.viewModelFactory).a((PhoneConfirmationParams) dcs.a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.predefinedPhoneFormatHolders = new ohe0().b(getString(czh0.ybsdk_phone_confirmation_predefined_phone_format));
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, com.ybsdk.core.presentation.BindingFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View onCreateView = super.onCreateView(inflater, container, savedInstanceState);
        setupViews();
        setupPhoneModeChangingAnimation();
        return onCreateView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Runnable runnable = this.phoneModeChangingRunnable;
        if (runnable != null) {
            ((m761) getBinding()).o().removeCallbacks(runnable);
        }
        feb0 feb0Var = this.phoneModeChangingAnimator;
        if (feb0Var == null) {
            feb0Var = null;
        }
        feb0Var.b();
        super.onDestroyView();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getViewModel().b0();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(oeb0 viewState) {
        ((m761) getBinding()).c.render(viewState.c());
        if (viewState.c() != null) {
            return;
        }
        int i = 8;
        ((m761) getBinding()).d.setVisibility(viewState.j() ? 0 : 8);
        f461 f461Var = ((m761) getBinding()).b;
        TextView textView = f461Var.j;
        String f = viewState.f();
        if (f != null) {
            List<apu> list = this.predefinedPhoneFormatHolders;
            if (list == null) {
                list = null;
            }
            l9s k = l76.k(2, true, list);
            k.d(0, f);
            textView.setText(k.b());
        }
        YbButtonView ybButtonView = f461Var.d;
        TextView textView2 = f461Var.e;
        EditText editText = f461Var.h;
        textView.setTextColor(getTextColor(textView, viewState.i()));
        textView.setVisibility(viewState.f() != null ? 0 : 8);
        if (!jl40.l(editText.getText().toString(), viewState.b())) {
            editText.setText(viewState.b());
        }
        editText.setTextColor(getTextColor(editText, viewState.i()));
        editText.setVisibility((viewState.l() || viewState.b() == null) ? 4 : 0);
        f461Var.i.setVisibility(viewState.l() ? 0 : 8);
        f461Var.f.setVisibility(!viewState.h() ? 4 : 0);
        f461Var.g.setVisibility(viewState.l() ? 0 : 8);
        textView2.setVisibility(!viewState.i() ? 4 : 0);
        textView2.setText(d.a(requireContext(), viewState.e()));
        ybButtonView.setVisibility(viewState.l() ? 4 : 0);
        ybButtonView.render(new i4b0(5, viewState));
        f461Var.c.setEnabled(viewState.k());
        TextView textView3 = f461Var.b;
        textView3.setText(rtu.a(new i4b0(6, this), viewState.a()));
        if (!viewState.l() && viewState.a().length() > 0) {
            i = 0;
        }
        textView3.setVisibility(i);
        ConstraintLayout o = ((m761) getBinding()).o();
        Runnable runnable = this.phoneModeChangingRunnable;
        if (runnable != null) {
            o.removeCallbacks(runnable);
        }
        feb0 feb0Var = this.phoneModeChangingAnimator;
        tqs tqsVar = new tqs(12, feb0Var != null ? feb0Var : null, viewState.d());
        o.post(tqsVar);
        this.phoneModeChangingRunnable = tqsVar;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public m761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return m761.p(inflater, container);
    }
}
