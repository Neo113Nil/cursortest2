package com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.transfer.utils.SimpleTextWatcher;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation.InternetPaymentFormInputFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation.InternetPaymentFormInputResult;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.presentation.InternetPaymentSelectProviderFragment;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.g;
import defpackage.ahq0;
import defpackage.atw;
import defpackage.ctw;
import defpackage.dcs;
import defpackage.f73;
import defpackage.gtw;
import defpackage.htw;
import defpackage.hua1;
import defpackage.i3y;
import defpackage.itw;
import defpackage.jtw;
import defpackage.lcb1;
import defpackage.lfx;
import defpackage.lrp0;
import defpackage.qas0;
import defpackage.r161;
import defpackage.r501;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.sls;
import defpackage.stz0;
import defpackage.t8j0;
import defpackage.tls;
import defpackage.u8j0;
import defpackage.w511;
import defpackage.x4c;
import defpackage.xuv;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zmg;
import defpackage.zsw;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 /2\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u00010B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\r2\u0010\u0010\"\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/forminput/presentation/InternetPaymentFormInputFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lr161;", "Lu8j0;", "Lgtw;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/forminput/presentation/InternetPaymentFormInputViewState;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/forminput/presentation/b;", "Lhtw;", "viewModelFactory", "<init>", "(Lhtw;)V", "Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/forminput/presentation/InternetPaymentFormInputResult;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "finishWithResult", "(Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/forminput/presentation/InternetPaymentFormInputResult;)V", "createViewModel", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/forminput/presentation/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lr161;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "()V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "viewState", "render", "(Lu8j0;)V", "Lhtw;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/forminput/presentation/InternetPaymentFormInputScreenParams;", "screenParams$delegate", "Li3y;", "getScreenParams", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/forminput/presentation/InternetPaymentFormInputScreenParams;", "screenParams", "Lcom/ybsdk/core/transfer/utils/SimpleTextWatcher;", "inputWatcher", "Lcom/ybsdk/core/transfer/utils/SimpleTextWatcher;", "Companion", "ctw", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InternetPaymentFormInputFragment extends BaseMvvmFragment<r161, u8j0, b> {
    public static final ctw Companion = new ctw();
    public static final String INTERNET_FORM_RESULT_KEY = "INTERNET_FORM_RESULT_KEY";
    private static final int MAX_INPUT_LENGTH = 50;
    private final SimpleTextWatcher inputWatcher;

    /* renamed from: screenParams$delegate, reason: from kotlin metadata */
    private final i3y screenParams;
    private final htw viewModelFactory;

    public InternetPaymentFormInputFragment(htw htwVar) {
        super(Boolean.FALSE, null, null, null, b.class, 14, null);
        this.viewModelFactory = htwVar;
        this.screenParams = dcs.c(this);
        this.inputWatcher = new SimpleTextWatcher(new zsw(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void consumeSideEffect$lambda$12$lambda$11(EditText editText) {
        lcb1.d(editText);
        editText.clearFocus();
    }

    private final void finishWithResult(InternetPaymentFormInputResult result) {
        Object failure;
        try {
            getParentFragmentManager().l0(result.toBundle(), INTERNET_FORM_RESULT_KEY);
            getRouter().e();
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            x4c.g("Failed to send INTERNET_FORM_RESULT_KEY result", a, null, Collections.singletonList(lrp0.n), 4);
        }
    }

    private final InternetPaymentFormInputScreenParams getScreenParams() {
        return (InternetPaymentFormInputScreenParams) this.screenParams.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$7$lambda$4$lambda$2(InternetPaymentFormInputFragment internetPaymentFormInputFragment) {
        internetPaymentFormInputFragment.getViewModel().f0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$7$lambda$4$lambda$3(InternetPaymentFormInputFragment internetPaymentFormInputFragment) {
        internetPaymentFormInputFragment.getViewModel().g0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$7$lambda$5(InternetPaymentFormInputFragment internetPaymentFormInputFragment, View view) {
        internetPaymentFormInputFragment.getViewModel().c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$7$lambda$6(InternetPaymentFormInputFragment internetPaymentFormInputFragment, View view) {
        internetPaymentFormInputFragment.getViewModel().b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 inputWatcher$lambda$0(InternetPaymentFormInputFragment internetPaymentFormInputFragment, Editable editable) {
        internetPaymentFormInputFragment.getViewModel().h0(String.valueOf(editable));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreate$lambda$8(InternetPaymentFormInputFragment internetPaymentFormInputFragment, String str) {
        internetPaymentFormInputFragment.getViewModel().e0(str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahq0 render$lambda$17$lambda$15$lambda$13(gtw gtwVar, ahq0 ahq0Var) {
        return gtwVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g render$lambda$17$lambda$15$lambda$14(gtw gtwVar, g gVar) {
        return gtwVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g render$lambda$17$lambda$16(g gVar) {
        return g.a(gVar, null, null, false, null, null, null, null, false, null, null, null, false, null, null, false, 0, false, 0, 0, null, null, null, 33552043);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof itw) {
            itw itwVar = (itw) sideEffect;
            finishWithResult(new InternetPaymentFormInputResult.Success(itwVar.b(), itwVar.a()));
        } else if (sideEffect.equals(zmg.c)) {
            EditText editText = ((r161) getBinding()).d.getEditText();
            editText.post(new atw(editText, 0));
        } else if (sideEffect.equals(zmg.b)) {
            EditText editText2 = ((r161) getBinding()).d.getEditText();
            editText2.post(new atw(editText2, 1));
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public b getFactoryOfViewModel() {
        return ((jtw) this.viewModelFactory).a(getScreenParams());
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public r161 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        r161 o = r161.o(inflater, container);
        EditText editText = o.d.getEditText();
        editText.addTextChangedListener(this.inputWatcher);
        editText.setFilters((InputFilter[]) f73.s(editText.getFilters(), new InputFilter.LengthFilter(50)));
        ErrorView errorView = o.c;
        final int i = 0;
        errorView.setChangeVisibilityWithDelay(false);
        errorView.setPrimaryButtonOnClickListener(new sls(this) { // from class: xsw
            public final /* synthetic */ InternetPaymentFormInputFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 viewBinding$lambda$7$lambda$4$lambda$2;
                zy11 viewBinding$lambda$7$lambda$4$lambda$3;
                int i2 = i;
                InternetPaymentFormInputFragment internetPaymentFormInputFragment = this.b;
                switch (i2) {
                    case 0:
                        viewBinding$lambda$7$lambda$4$lambda$2 = InternetPaymentFormInputFragment.getViewBinding$lambda$7$lambda$4$lambda$2(internetPaymentFormInputFragment);
                        return viewBinding$lambda$7$lambda$4$lambda$2;
                    default:
                        viewBinding$lambda$7$lambda$4$lambda$3 = InternetPaymentFormInputFragment.getViewBinding$lambda$7$lambda$4$lambda$3(internetPaymentFormInputFragment);
                        return viewBinding$lambda$7$lambda$4$lambda$3;
                }
            }
        });
        final int i2 = 1;
        errorView.setSecondaryButtonClickListener(new sls(this) { // from class: xsw
            public final /* synthetic */ InternetPaymentFormInputFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 viewBinding$lambda$7$lambda$4$lambda$2;
                zy11 viewBinding$lambda$7$lambda$4$lambda$3;
                int i22 = i2;
                InternetPaymentFormInputFragment internetPaymentFormInputFragment = this.b;
                switch (i22) {
                    case 0:
                        viewBinding$lambda$7$lambda$4$lambda$2 = InternetPaymentFormInputFragment.getViewBinding$lambda$7$lambda$4$lambda$2(internetPaymentFormInputFragment);
                        return viewBinding$lambda$7$lambda$4$lambda$2;
                    default:
                        viewBinding$lambda$7$lambda$4$lambda$3 = InternetPaymentFormInputFragment.getViewBinding$lambda$7$lambda$4$lambda$3(internetPaymentFormInputFragment);
                        return viewBinding$lambda$7$lambda$4$lambda$3;
                }
            }
        });
        o.e.setOnClickListener(new View.OnClickListener(this) { // from class: ysw
            public final /* synthetic */ InternetPaymentFormInputFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                InternetPaymentFormInputFragment internetPaymentFormInputFragment = this.b;
                switch (i3) {
                    case 0:
                        InternetPaymentFormInputFragment.getViewBinding$lambda$7$lambda$5(internetPaymentFormInputFragment, view);
                        break;
                    default:
                        InternetPaymentFormInputFragment.getViewBinding$lambda$7$lambda$6(internetPaymentFormInputFragment, view);
                        break;
                }
            }
        });
        o.g.setOnCloseButtonClickListener(new InternetPaymentFormInputFragment$getViewBinding$1$4(getViewModel()));
        o.b.setOnClickListener(new View.OnClickListener(this) { // from class: ysw
            public final /* synthetic */ InternetPaymentFormInputFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                InternetPaymentFormInputFragment internetPaymentFormInputFragment = this.b;
                switch (i3) {
                    case 0:
                        InternetPaymentFormInputFragment.getViewBinding$lambda$7$lambda$5(internetPaymentFormInputFragment, view);
                        break;
                    default:
                        InternetPaymentFormInputFragment.getViewBinding$lambda$7$lambda$6(internetPaymentFormInputFragment, view);
                        break;
                }
            }
        });
        return o;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hua1.g(this, InternetPaymentSelectProviderFragment.RESULT_KEY, new com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.presentation.a(new zsw(this, 0)));
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getViewModel().d0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(u8j0 viewState) {
        r161 r161Var = (r161) getBinding();
        ErrorView errorView = r161Var.c;
        LoadableInput loadableInput = r161Var.d;
        errorView.render(null);
        ToolbarView toolbarView = r161Var.g;
        toolbarView.render(new stz0(Text.Empty.INSTANCE, null, null, null, null, null, false, null, null, null, null, null, 32766));
        boolean z = viewState instanceof t8j0;
        final int i = 0;
        r161Var.f.p().setVisibility(z ? 0 : 8);
        r161Var.h.setVisibility(z ? 0 : 8);
        final int i2 = 1;
        if (viewState instanceof r8j0) {
            final gtw gtwVar = (gtw) ((r8j0) viewState).e();
            loadableInput.setCanShowSoftInputOnFocus(true);
            toolbarView.render(gtwVar.d());
            r161Var.e.render(new tls() { // from class: btw
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    ahq0 render$lambda$17$lambda$15$lambda$13;
                    g render$lambda$17$lambda$15$lambda$14;
                    int i3 = i;
                    gtw gtwVar2 = gtwVar;
                    switch (i3) {
                        case 0:
                            render$lambda$17$lambda$15$lambda$13 = InternetPaymentFormInputFragment.render$lambda$17$lambda$15$lambda$13(gtwVar2, (ahq0) obj);
                            return render$lambda$17$lambda$15$lambda$13;
                        default:
                            render$lambda$17$lambda$15$lambda$14 = InternetPaymentFormInputFragment.render$lambda$17$lambda$15$lambda$14(gtwVar2, (g) obj);
                            return render$lambda$17$lambda$15$lambda$14;
                    }
                }
            });
            LoadableInput.render$default(loadableInput, false, new tls() { // from class: btw
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    ahq0 render$lambda$17$lambda$15$lambda$13;
                    g render$lambda$17$lambda$15$lambda$14;
                    int i3 = i2;
                    gtw gtwVar2 = gtwVar;
                    switch (i3) {
                        case 0:
                            render$lambda$17$lambda$15$lambda$13 = InternetPaymentFormInputFragment.render$lambda$17$lambda$15$lambda$13(gtwVar2, (ahq0) obj);
                            return render$lambda$17$lambda$15$lambda$13;
                        default:
                            render$lambda$17$lambda$15$lambda$14 = InternetPaymentFormInputFragment.render$lambda$17$lambda$15$lambda$14(gtwVar2, (g) obj);
                            return render$lambda$17$lambda$15$lambda$14;
                    }
                }
            }, 1, null);
            loadableInput.getEditText().requestFocus();
            r161Var.b.render(gtwVar.a());
            return;
        }
        if (viewState instanceof s8j0) {
            r161Var.c.render(r501.a(((s8j0) viewState).d(), null, null, null, null, null, null, null, null, null, null, null, null, 65534));
        } else if (!z) {
            w511.b();
        } else {
            loadableInput.setCanShowSoftInputOnFocus(false);
            LoadableInput.render$default(loadableInput, false, new xuv(28), 1, null);
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
