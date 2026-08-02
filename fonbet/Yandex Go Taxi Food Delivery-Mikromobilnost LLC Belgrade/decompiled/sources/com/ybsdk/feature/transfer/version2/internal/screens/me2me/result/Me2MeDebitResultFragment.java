package com.ybsdk.feature.transfer.version2.internal.screens.me2me.result;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.feature.transfer.version2.api.TransferTwoFactorScreenProvider$Request;
import com.ybsdk.feature.transfer.version2.api.TransferTwoFactorScreenProvider$TwoFactorResult;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.Me2MeDebitResultFragment;
import com.ybsdk.widgets.common.WidgetWithSwitchView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.aa61;
import defpackage.dcs;
import defpackage.hu01;
import defpackage.hua1;
import defpackage.jl40;
import defpackage.k200;
import defpackage.l910;
import defpackage.lfx;
import defpackage.m910;
import defpackage.p910;
import defpackage.q910;
import defpackage.qas0;
import defpackage.s451;
import defpackage.tu01;
import defpackage.v4b1;
import defpackage.w511;
import defpackage.wls;
import defpackage.xyz;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zgv;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"¨\u0006#"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/result/Me2MeDebitResultFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Laa61;", "Lq910;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/result/a;", "Ll910;", "viewModelFactory", "Lhu01;", "twoFactorScreenProvider", "<init>", "(Ll910;Lhu01;)V", "createViewModel", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/me2me/result/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Laa61;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "viewState", "render", "(Lq910;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Ll910;", "Lhu01;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Me2MeDebitResultFragment extends BaseMvvmFragment<aa61, q910, a> {
    private final hu01 twoFactorScreenProvider;
    private final l910 viewModelFactory;

    public Me2MeDebitResultFragment(l910 l910Var, hu01 hu01Var) {
        super(Boolean.FALSE, null, null, null, a.class, 14, null);
        this.viewModelFactory = l910Var;
        this.twoFactorScreenProvider = hu01Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$3$lambda$0(Me2MeDebitResultFragment me2MeDebitResultFragment) {
        me2MeDebitResultFragment.getViewModel().h0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$3$lambda$1(Me2MeDebitResultFragment me2MeDebitResultFragment, View view) {
        me2MeDebitResultFragment.getViewModel().g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$3$lambda$2(Me2MeDebitResultFragment me2MeDebitResultFragment, boolean z) {
        me2MeDebitResultFragment.getViewModel().j0(null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$4(Me2MeDebitResultFragment me2MeDebitResultFragment, String str, Bundle bundle) {
        TransferTwoFactorScreenProvider$TwoFactorResult a = ((tu01) me2MeDebitResultFragment.twoFactorScreenProvider).a(bundle);
        if (a instanceof TransferTwoFactorScreenProvider$TwoFactorResult.VerificationToken) {
            me2MeDebitResultFragment.getViewModel().f0(((TransferTwoFactorScreenProvider$TwoFactorResult.VerificationToken) a).getVerificationToken());
        } else {
            if (!jl40.l(a, TransferTwoFactorScreenProvider$TwoFactorResult.Cancel.INSTANCE) && a != null) {
                w511.b();
                return null;
            }
            me2MeDebitResultFragment.getViewModel().i0();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$5(Me2MeDebitResultFragment me2MeDebitResultFragment, String str, Bundle bundle) {
        TransferTwoFactorScreenProvider$TwoFactorResult a = ((tu01) me2MeDebitResultFragment.twoFactorScreenProvider).a(bundle);
        if (a instanceof TransferTwoFactorScreenProvider$TwoFactorResult.VerificationToken) {
            me2MeDebitResultFragment.getViewModel().j0(((TransferTwoFactorScreenProvider$TwoFactorResult.VerificationToken) a).getVerificationToken());
        } else if (!jl40.l(a, TransferTwoFactorScreenProvider$TwoFactorResult.Cancel.INSTANCE) && a != null) {
            w511.b();
            return null;
        }
        return zy11.a;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof m910) {
            com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((m910) sideEffect).a(), null, 12);
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
        return ((p910) this.viewModelFactory).a((Me2MeDebitResultScreenParams) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public aa61 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        aa61 p = aa61.p(getLayoutInflater(), container);
        p.h.setOnCloseButtonClickListener(new xyz(16, this));
        p.c.setOnClickListener(new zgv(10, this));
        p.i.setListener(new k200(17, this));
        return p;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final int i = 0;
        hua1.g(this, TransferTwoFactorScreenProvider$Request.CONFIRM_ME2ME_DEBIT.getKey(), new wls(this) { // from class: i910
            public final /* synthetic */ Me2MeDebitResultFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                zy11 onViewCreated$lambda$4;
                zy11 onViewCreated$lambda$5;
                int i2 = i;
                Me2MeDebitResultFragment me2MeDebitResultFragment = this.b;
                String str = (String) obj;
                Bundle bundle = (Bundle) obj2;
                switch (i2) {
                    case 0:
                        onViewCreated$lambda$4 = Me2MeDebitResultFragment.onViewCreated$lambda$4(me2MeDebitResultFragment, str, bundle);
                        return onViewCreated$lambda$4;
                    default:
                        onViewCreated$lambda$5 = Me2MeDebitResultFragment.onViewCreated$lambda$5(me2MeDebitResultFragment, str, bundle);
                        return onViewCreated$lambda$5;
                }
            }
        });
        final int i2 = 1;
        hua1.g(this, TransferTwoFactorScreenProvider$Request.CONFIRM_ME2ME_AUTO_PULL.getKey(), new wls(this) { // from class: i910
            public final /* synthetic */ Me2MeDebitResultFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                zy11 onViewCreated$lambda$4;
                zy11 onViewCreated$lambda$5;
                int i22 = i2;
                Me2MeDebitResultFragment me2MeDebitResultFragment = this.b;
                String str = (String) obj;
                Bundle bundle = (Bundle) obj2;
                switch (i22) {
                    case 0:
                        onViewCreated$lambda$4 = Me2MeDebitResultFragment.onViewCreated$lambda$4(me2MeDebitResultFragment, str, bundle);
                        return onViewCreated$lambda$4;
                    default:
                        onViewCreated$lambda$5 = Me2MeDebitResultFragment.onViewCreated$lambda$5(me2MeDebitResultFragment, str, bundle);
                        return onViewCreated$lambda$5;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(q910 viewState) {
        aa61 aa61Var = (aa61) getBinding();
        ConstraintLayout o = aa61Var.o();
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.d0(0);
        TextView textView = aa61Var.d;
        autoTransition.u(textView);
        TransitionManager.a(autoTransition, o);
        aa61Var.h.render(viewState.g());
        v4b1.k(viewState.d(), aa61Var.e, null, null, 6);
        aa61Var.f.render(viewState.e());
        TextView textView2 = aa61Var.g;
        textView2.setVisibility(viewState.f() != null ? 0 : 8);
        textView2.setText(viewState.f());
        TextView textView3 = aa61Var.b;
        textView3.setVisibility(viewState.a() != null ? 0 : 8);
        textView3.setText(viewState.a());
        textView.setText(viewState.c());
        WidgetWithSwitchView widgetWithSwitchView = aa61Var.i;
        widgetWithSwitchView.setVisibility(viewState.h() != null ? 0 : 8);
        s451 h = viewState.h();
        if (h != null) {
            widgetWithSwitchView.render(h);
        }
        YbButtonView ybButtonView = aa61Var.c;
        ybButtonView.setVisibility(viewState.b() == null ? 8 : 0);
        YbButtonView.a b = viewState.b();
        if (b != null) {
            ybButtonView.render(b);
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
