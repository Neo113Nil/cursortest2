package com.ybsdk.screens.registration.codeconfirmation.presentation;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationFragment;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.SignOutButton;
import com.ybsdk.widgets.common.SmsCodeEditText;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.bmg0;
import defpackage.ce4;
import defpackage.dcs;
import defpackage.ds31;
import defpackage.dzh0;
import defpackage.e9c;
import defpackage.f89;
import defpackage.fj3;
import defpackage.g9c;
import defpackage.h9c;
import defpackage.i3y;
import defpackage.j9c;
import defpackage.jbs0;
import defpackage.jl40;
import defpackage.k5;
import defpackage.lfx;
import defpackage.n9c;
import defpackage.o9c;
import defpackage.p661;
import defpackage.p9c;
import defpackage.pz40;
import defpackage.q9c;
import defpackage.qas0;
import defpackage.r8j0;
import defpackage.r9c;
import defpackage.rje;
import defpackage.rtu;
import defpackage.s9c;
import defpackage.sb0;
import defpackage.sls;
import defpackage.sm91;
import defpackage.t8j0;
import defpackage.t9c;
import defpackage.tje;
import defpackage.txg0;
import defpackage.u8j0;
import defpackage.u9c;
import defpackage.ung0;
import defpackage.unr0;
import defpackage.utb1;
import defpackage.v9c;
import defpackage.vqb;
import defpackage.vr80;
import defpackage.w511;
import defpackage.wr80;
import defpackage.x4c;
import defpackage.xty0;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 :2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002:\u0001;B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\u001e\u001a\u00020\u000e*\u00020\u0003H\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010$J\u001b\u0010#\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\"\u001a\u00020\u0004H\u0000¢\u0006\u0004\b%\u0010&J!\u0010+\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)H\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000eH\u0016¢\u0006\u0004\b0\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006<"}, d2 = {"Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationFragment;", "Lce4;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lp661;", "Lv9c;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/c;", "Lt9c;", "viewModelFactory", "Lj9c;", "codeConfirmationInteractorFactory", "Lfj3;", "authLandingFeature", "<init>", "(Lt9c;Lj9c;Lfj3;)V", "Lzy11;", "showLogoutDialog", "()V", "renderErrorSideEffect", "createViewModel", "()Lcom/ybsdk/screens/registration/codeconfirmation/presentation/c;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onViewCreated$yb_sdk_sdkRelease", "(Lp661;)V", "viewState", "render", "(Lv9c;)V", "render$yb_sdk_sdkRelease", "(Lp661;Lv9c;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lp661;", "", "onBackPressed", "()Z", "onDestroyView", "Lt9c;", "Lj9c;", "Lfj3;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams;", "arguments$delegate", "Li3y;", "getArguments", "()Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams;", "arguments", "Companion", "g9c", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CodeConfirmationFragment extends BaseMvvmFragment<p661, v9c, c> implements ce4 {
    public static final g9c Companion = new g9c();
    private static final int MAX_DIGITS = 6;

    /* renamed from: arguments$delegate, reason: from kotlin metadata */
    private final i3y arguments;
    private final fj3 authLandingFeature;
    private final j9c codeConfirmationInteractorFactory;
    private final t9c viewModelFactory;

    public CodeConfirmationFragment(t9c t9cVar, j9c j9cVar, fj3 fj3Var) {
        super(null, 48, null, null, c.class, 13, null);
        this.viewModelFactory = t9cVar;
        this.codeConfirmationInteractorFactory = j9cVar;
        this.authLandingFeature = fj3Var;
        this.arguments = dcs.c(this);
    }

    private final CodeConfirmationParams getArguments() {
        return (CodeConfirmationParams) this.arguments.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(CodeConfirmationFragment codeConfirmationFragment, View view) {
        codeConfirmationFragment.getViewModel().e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$4(CodeConfirmationFragment codeConfirmationFragment) {
        codeConfirmationFragment.getViewModel().c0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$5(CodeConfirmationFragment codeConfirmationFragment) {
        codeConfirmationFragment.getViewModel().c0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$10$lambda$9(v9c v9cVar, CodeConfirmationFragment codeConfirmationFragment, View view) {
        if (v9cVar.k()) {
            codeConfirmationFragment.getViewModel().c0();
        } else {
            codeConfirmationFragment.getViewModel().f0(v9cVar.q());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 render$lambda$15(CodeConfirmationFragment codeConfirmationFragment, v9c v9cVar, p661 p661Var) {
        CharSequence a;
        sm91.h(bmg0.ybsdk_animation_wiggle_not_replace, ((p661) codeConfirmationFragment.getBinding()).g);
        Text g = v9cVar.g();
        if (g != null && (a = d.a(sm91.c(p661Var), g)) != null) {
            androidx.core.view.b.r(((p661) codeConfirmationFragment.getBinding()).o(), a);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 render$lambda$17(CodeConfirmationFragment codeConfirmationFragment, v9c v9cVar, p661 p661Var, char c) {
        CharSequence a;
        sm91.h(bmg0.ybsdk_animation_wiggle_not_replace, ((p661) codeConfirmationFragment.getBinding()).g);
        Text g = v9cVar.g();
        if (g != null && (a = d.a(sm91.c(p661Var), g)) != null) {
            androidx.core.view.b.r(((p661) codeConfirmationFragment.getBinding()).o(), a);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$8(CodeConfirmationFragment codeConfirmationFragment, String str) {
        codeConfirmationFragment.getViewModel().g0(str);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderErrorSideEffect() {
        sm91.h(bmg0.ybsdk_animation_wiggle_not_replace, ((p661) getBinding()).j);
        androidx.core.view.b.r(((p661) getBinding()).o(), requireContext().getText(dzh0.ybsdk_common_accessibility_sms_invalid_code));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLogoutDialog() {
        this.authLandingFeature.getClass();
    }

    private static final zy11 showLogoutDialog$lambda$18(CodeConfirmationFragment codeConfirmationFragment) {
        try {
            FragmentManager parentFragmentManager = codeConfirmationFragment.getParentFragmentManager();
            parentFragmentManager.m.remove(codeConfirmationFragment.getArguments().getRequestKey());
            FragmentManager.O(2);
        } catch (IllegalStateException e) {
            x4c.g("clearFragmentResult error", e, null, null, 12);
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        s9c s9cVar = sideEffect instanceof s9c ? (s9c) sideEffect : null;
        if (s9cVar instanceof p9c) {
            getParentFragmentManager().l0(((p9c) s9cVar).a(), getArguments().getRequestKey());
            return;
        }
        if (s9cVar instanceof o9c) {
            int i = h9c.a[((o9c) s9cVar).a().ordinal()];
            if (i == 1) {
                renderErrorSideEffect();
                return;
            } else {
                if (i == 2 || i == 3) {
                    return;
                }
                w511.b();
                return;
            }
        }
        if (s9cVar instanceof n9c) {
            androidx.core.view.b.r(((p661) getBinding()).o(), d.a(requireContext(), ((n9c) s9cVar).a()));
            return;
        }
        if (jl40.l(s9cVar, q9c.a)) {
            showLogoutDialog();
            return;
        }
        if (s9cVar instanceof r9c) {
            com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((r9c) s9cVar).a(), null, 12);
        } else if (s9cVar == null) {
            super.consumeSideEffect(sideEffect);
        } else {
            w511.b();
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public c getFactoryOfViewModel() {
        return ((u9c) this.viewModelFactory).a(this.codeConfirmationInteractorFactory.a(getArguments()));
    }

    @Override // defpackage.ce4
    public boolean onBackPressed() {
        getViewModel().c0();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getViewModel().d0();
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getViewModel().getClass();
        setBackButtonEnabled(true);
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((p661) getBinding()).q.setOnClickListener(new e9c(this, 0));
        ((p661) getBinding()).i.setOnClickListener(new e9c(this, 1));
        onViewCreated$yb_sdk_sdkRelease((p661) getBinding());
    }

    public final void onViewCreated$yb_sdk_sdkRelease(final p661 p661Var) {
        ToolbarView toolbarView = p661Var.o;
        ErrorView errorView = p661Var.b;
        SmsCodeEditText smsCodeEditText = p661Var.c;
        smsCodeEditText.addTextChangedListener(new TextWatcher() { // from class: com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationFragment$onViewCreated$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                c viewModel;
                r0 r0Var;
                Object value;
                c viewModel2;
                r0 r0Var2;
                Object value2;
                a aVar;
                String valueOf = String.valueOf(s);
                InputFilter[] filters = p661.this.c.getFilters();
                ArrayList arrayList = new ArrayList();
                for (InputFilter inputFilter : filters) {
                    if (inputFilter instanceof InputFilter.LengthFilter) {
                        arrayList.add(inputFilter);
                    }
                }
                InputFilter.LengthFilter lengthFilter = (InputFilter.LengthFilter) kotlin.collections.a.b0(arrayList);
                Integer valueOf2 = lengthFilter != null ? Integer.valueOf(lengthFilter.getMax()) : null;
                int length = valueOf.length();
                if (valueOf2 == null || valueOf2.intValue() != length) {
                    xty0.f(p661.this.c, ung0.ybColor_textIcon_primary);
                    viewModel = this.getViewModel();
                    if (valueOf.equals(((a) viewModel.X()).i)) {
                        return;
                    }
                    pz40 Y = viewModel.Y();
                    do {
                        r0Var = (r0) Y;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, a.a((a) value, null, 0L, 0L, 0, null, valueOf, null, false, null, 16127)));
                    return;
                }
                viewModel2 = this.getViewModel();
                if (((a) viewModel2.X()).h instanceof t8j0) {
                    return;
                }
                u8j0 u8j0Var = ((a) viewModel2.X()).h;
                r8j0 r8j0Var = u8j0Var instanceof r8j0 ? (r8j0) u8j0Var : null;
                if ((r8j0Var != null ? (wr80) r8j0Var.a : null) instanceof vr80) {
                    return;
                }
                viewModel2.K.h();
                viewModel2.Z(new n9c(unr0.h(Text.Companion, dzh0.ybsdk_transfer_accessibility_loading_text)));
                pz40 Y2 = viewModel2.Y();
                do {
                    r0Var2 = (r0) Y2;
                    value2 = r0Var2.getValue();
                    aVar = (a) value2;
                } while (!r0Var2.k(value2, a.a(aVar, null, 0L, 0L, aVar.g + 1, new t8j0(), null, null, false, null, 16191)));
                tje.N(ds31.a(viewModel2), null, null, new CodeConfirmationViewModel$onCodeReady$2(viewModel2, valueOf, null), 3);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
        p661Var.e.setOnClickListener(new e9c(this, 2));
        p661Var.j.getLayoutParams().width = smsCodeEditText.getWidthForDigits(6);
        if (!((a) getViewModel().X()).b()) {
            utb1.d(p661Var.h, smsCodeEditText);
        }
        p661Var.n.setMovementMethod(LinkMovementMethod.getInstance());
        final int i = 0;
        toolbarView.setOnCloseButtonClickListener(new sls(this) { // from class: f9c
            public final /* synthetic */ CodeConfirmationFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$4;
                zy11 onViewCreated$lambda$5;
                int i2 = i;
                CodeConfirmationFragment codeConfirmationFragment = this.b;
                switch (i2) {
                    case 0:
                        onViewCreated$lambda$4 = CodeConfirmationFragment.onViewCreated$lambda$4(codeConfirmationFragment);
                        return onViewCreated$lambda$4;
                    default:
                        onViewCreated$lambda$5 = CodeConfirmationFragment.onViewCreated$lambda$5(codeConfirmationFragment);
                        return onViewCreated$lambda$5;
                }
            }
        });
        final int i2 = 1;
        toolbarView.setOnImageClickListener(new sls(this) { // from class: f9c
            public final /* synthetic */ CodeConfirmationFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 onViewCreated$lambda$4;
                zy11 onViewCreated$lambda$5;
                int i22 = i2;
                CodeConfirmationFragment codeConfirmationFragment = this.b;
                switch (i22) {
                    case 0:
                        onViewCreated$lambda$4 = CodeConfirmationFragment.onViewCreated$lambda$4(codeConfirmationFragment);
                        return onViewCreated$lambda$4;
                    default:
                        onViewCreated$lambda$5 = CodeConfirmationFragment.onViewCreated$lambda$5(codeConfirmationFragment);
                        return onViewCreated$lambda$5;
                }
            }
        });
        errorView.setChangeVisibilityWithDelay(false);
        errorView.setPrimaryButtonOnClickListener(new CodeConfirmationFragment$onViewCreated$7(getViewModel()));
        errorView.setSecondaryButtonClickListener(new CodeConfirmationFragment$onViewCreated$8(getViewModel()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(v9c viewState) {
        setBackButtonEnabled(viewState.z());
        setBackButtonVisible(!viewState.f());
        ColorModel v = viewState.v();
        setBackButtonColor(v != null ? Integer.valueOf(v.get(requireContext())) : null);
        p661 p661Var = (p661) getBinding();
        ToolbarView toolbarView = p661Var.o;
        SignOutButton signOutButton = p661Var.i;
        toolbarView.render(viewState.u());
        int i = 8;
        p661Var.p.setVisibility(viewState.j() ? 0 : 8);
        p661Var.b.render(viewState.d());
        if (viewState.p() != null && viewState.w()) {
            i = 0;
        }
        signOutButton.setVisibility(i);
        jbs0 p = viewState.p();
        if (p != null) {
            signOutButton.render(p);
        }
        render$yb_sdk_sdkRelease(p661Var, viewState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void render$yb_sdk_sdkRelease(p661 p661Var, v9c v9cVar) {
        TextView textView = p661Var.e;
        TextView textView2 = p661Var.n;
        NumberKeyboardView numberKeyboardView = p661Var.h;
        SmsCodeEditText smsCodeEditText = p661Var.c;
        CharSequence a = d.a(sm91.c(p661Var), v9cVar.e());
        TextView textView3 = p661Var.f;
        if (!jl40.l(a, textView3.getText())) {
            textView3.setText(a);
        }
        CharSequence a2 = d.a(sm91.c(p661Var), v9cVar.t());
        if (!jl40.l(textView2.getText(), a2)) {
            textView2.setText(rtu.a(new vqb(r6, this), a2.toString()));
        }
        smsCodeEditText.setCodeLength(v9cVar.a());
        boolean x = v9cVar.x();
        ShimmerFrameLayout shimmerFrameLayout = p661Var.j;
        if (x) {
            shimmerFrameLayout.startShimmer();
        } else {
            shimmerFrameLayout.stopShimmer();
        }
        p661Var.l.setVisibility(v9cVar.g() == null ? 0 : 8);
        textView.setVisibility((v9cVar.m() && v9cVar.g() == null) ? 0 : 8);
        boolean o = v9cVar.o();
        ShimmerFrameLayout shimmerFrameLayout2 = p661Var.k;
        if (o) {
            shimmerFrameLayout2.startShimmer();
        } else {
            shimmerFrameLayout2.stopShimmer();
        }
        textView.setText(com.ybsdk.core.utils.text.a.a(SpannableString.valueOf(sm91.c(p661Var).getString(dzh0.ybsdk_sms_code_confirmation_request_another_code_sms)), rje.j(txg0.ybsdk_ic_arrow_short_forward, sm91.c(p661Var))));
        YbButtonView ybButtonView = p661Var.d;
        ybButtonView.setVisibility((v9cVar.n() || v9cVar.k()) ? 0 : 8);
        ybButtonView.setText(d.a(ybButtonView.getContext(), v9cVar.c()).toString());
        ybButtonView.setOnClickListener(new k5(20, v9cVar, this));
        TextView textView4 = p661Var.g;
        textView4.setVisibility(v9cVar.g() != null ? 0 : 8);
        Text g = v9cVar.g();
        textView4.setText(g != null ? d.a(textView4.getContext(), g) : null);
        Integer h = v9cVar.h();
        if (h != null) {
            xty0.f(textView4, h.intValue());
        }
        TextView textView5 = p661Var.m;
        textView5.setVisibility(v9cVar.s() != null ? 0 : 8);
        Text s = v9cVar.s();
        textView5.setText(s != null ? d.a(textView5.getContext(), s) : null);
        p661Var.q.setVisibility(v9cVar.l() ? 0 : 8);
        if (v9cVar.i()) {
            smsCodeEditText.clearFocus();
        } else {
            smsCodeEditText.requestFocus();
            smsCodeEditText.setTextColor(v9cVar.b().getTextColor().get(requireContext()));
            if (v9cVar.r().length() == 0) {
                smsCodeEditText.setText(v9cVar.r());
            }
        }
        numberKeyboardView.setEnabled(v9cVar.y());
        if (v9cVar.i()) {
            xty0.f(((p661) getBinding()).c, ung0.ybColor_textIcon_negative);
            numberKeyboardView.setOnKeyBackspacePressed(new sb0(17, this, v9cVar, p661Var));
            numberKeyboardView.setOnCharPressed(new f89(9, this, v9cVar, p661Var));
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public p661 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return p661.p(inflater, container);
    }
}
