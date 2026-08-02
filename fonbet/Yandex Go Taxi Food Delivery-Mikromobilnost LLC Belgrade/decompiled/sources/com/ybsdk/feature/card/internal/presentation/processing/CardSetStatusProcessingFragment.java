package com.ybsdk.feature.card.internal.presentation.processing;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$Request;
import com.ybsdk.feature.card.internal.presentation.processing.CardSetStatusProcessingFragment;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.OperationProgressOverlayDialog;
import defpackage.ce4;
import defpackage.co8;
import defpackage.dcs;
import defpackage.do8;
import defpackage.e48;
import defpackage.eo8;
import defpackage.fo8;
import defpackage.go8;
import defpackage.ho8;
import defpackage.io8;
import defpackage.jo8;
import defpackage.k661;
import defpackage.lfx;
import defpackage.mf8;
import defpackage.qas0;
import defpackage.qn8;
import defpackage.sls;
import defpackage.w511;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(¨\u0006)"}, d2 = {"Lcom/ybsdk/feature/card/internal/presentation/processing/CardSetStatusProcessingFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lk661;", "Ljo8;", "Lcom/ybsdk/feature/card/internal/presentation/processing/a;", "Lce4;", "Ldo8;", "viewModelFactory", "Lqn8;", "secondFactorHelper", "<init>", "(Ldo8;Lqn8;)V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "onBackPressed", "()Z", "createViewModel", "()Lcom/ybsdk/feature/card/internal/presentation/processing/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lk661;", "viewState", "render", "(Ljo8;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Ldo8;", "Lqn8;", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CardSetStatusProcessingFragment extends BaseDivContextMvvmFragment<k661, jo8, a> implements ce4 {
    private final qn8 secondFactorHelper;
    private final do8 viewModelFactory;

    public CardSetStatusProcessingFragment(do8 do8Var, qn8 qn8Var) {
        super(Boolean.FALSE, null, null, null, a.class, 14, null);
        this.viewModelFactory = do8Var;
        this.secondFactorHelper = qn8Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$5$lambda$1(CardSetStatusProcessingFragment cardSetStatusProcessingFragment) {
        ((a) cardSetStatusProcessingFragment.getViewModel()).f0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$5$lambda$2(CardSetStatusProcessingFragment cardSetStatusProcessingFragment) {
        ((a) cardSetStatusProcessingFragment.getViewModel()).c0(false);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$5$lambda$3(CardSetStatusProcessingFragment cardSetStatusProcessingFragment, View view) {
        ((a) cardSetStatusProcessingFragment.getViewModel()).e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$5$lambda$4(CardSetStatusProcessingFragment cardSetStatusProcessingFragment, View view) {
        ((a) cardSetStatusProcessingFragment.getViewModel()).h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onCreate$lambda$0(CardSetStatusProcessingFragment cardSetStatusProcessingFragment, String str, Bundle bundle) {
        ((a) cardSetStatusProcessingFragment.getViewModel()).g0(((mf8) cardSetStatusProcessingFragment.secondFactorHelper).a(bundle));
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof co8) {
            qn8 qn8Var = this.secondFactorHelper;
            Text.Empty empty = Text.Empty.INSTANCE;
            getRouter().h(((mf8) qn8Var).b(((co8) sideEffect).a(), CardSecondFactorHelper$Request.SET_STATUS_SCREEN));
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((eo8) this.viewModelFactory).a((CardSetStatusScreenParams) dcs.a(this));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [uc5] */
    @Override // com.ybsdk.core.presentation.BindingFragment
    public k661 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        k661 o = k661.o(inflater, container);
        o.b.setActionHandler(new CardSetStatusProcessingFragment$getViewBinding$1$1(getViewModel()));
        ErrorView errorView = o.c;
        final int i = 0;
        errorView.setChangeVisibilityWithDelay(false);
        errorView.setPrimaryButtonOnClickListener(new sls(this) { // from class: zn8
            public final /* synthetic */ CardSetStatusProcessingFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 viewBinding$lambda$5$lambda$1;
                zy11 viewBinding$lambda$5$lambda$2;
                int i2 = i;
                CardSetStatusProcessingFragment cardSetStatusProcessingFragment = this.b;
                switch (i2) {
                    case 0:
                        viewBinding$lambda$5$lambda$1 = CardSetStatusProcessingFragment.getViewBinding$lambda$5$lambda$1(cardSetStatusProcessingFragment);
                        return viewBinding$lambda$5$lambda$1;
                    default:
                        viewBinding$lambda$5$lambda$2 = CardSetStatusProcessingFragment.getViewBinding$lambda$5$lambda$2(cardSetStatusProcessingFragment);
                        return viewBinding$lambda$5$lambda$2;
                }
            }
        });
        final int i2 = 1;
        o.e.setOnCloseButtonClickListener(new sls(this) { // from class: zn8
            public final /* synthetic */ CardSetStatusProcessingFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 viewBinding$lambda$5$lambda$1;
                zy11 viewBinding$lambda$5$lambda$2;
                int i22 = i2;
                CardSetStatusProcessingFragment cardSetStatusProcessingFragment = this.b;
                switch (i22) {
                    case 0:
                        viewBinding$lambda$5$lambda$1 = CardSetStatusProcessingFragment.getViewBinding$lambda$5$lambda$1(cardSetStatusProcessingFragment);
                        return viewBinding$lambda$5$lambda$1;
                    default:
                        viewBinding$lambda$5$lambda$2 = CardSetStatusProcessingFragment.getViewBinding$lambda$5$lambda$2(cardSetStatusProcessingFragment);
                        return viewBinding$lambda$5$lambda$2;
                }
            }
        });
        OperationProgressOverlayDialog operationProgressOverlayDialog = o.d;
        operationProgressOverlayDialog.setPrimaryActionClickListener(new View.OnClickListener(this) { // from class: ao8
            public final /* synthetic */ CardSetStatusProcessingFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                CardSetStatusProcessingFragment cardSetStatusProcessingFragment = this.b;
                switch (i3) {
                    case 0:
                        CardSetStatusProcessingFragment.getViewBinding$lambda$5$lambda$3(cardSetStatusProcessingFragment, view);
                        break;
                    default:
                        CardSetStatusProcessingFragment.getViewBinding$lambda$5$lambda$4(cardSetStatusProcessingFragment, view);
                        break;
                }
            }
        });
        operationProgressOverlayDialog.setSubActionClickListener(new View.OnClickListener(this) { // from class: ao8
            public final /* synthetic */ CardSetStatusProcessingFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                CardSetStatusProcessingFragment cardSetStatusProcessingFragment = this.b;
                switch (i3) {
                    case 0:
                        CardSetStatusProcessingFragment.getViewBinding$lambda$5$lambda$3(cardSetStatusProcessingFragment, view);
                        break;
                    default:
                        CardSetStatusProcessingFragment.getViewBinding$lambda$5$lambda$4(cardSetStatusProcessingFragment, view);
                        break;
                }
            }
        });
        return o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce4
    public boolean onBackPressed() {
        ((a) getViewModel()).c0(false);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getParentFragmentManager().m0(CardSecondFactorHelper$Request.SET_STATUS_SCREEN.getKey(), this, new e48(11, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((a) getViewModel()).i0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(jo8 viewState) {
        k661 k661Var = (k661) getBinding();
        OperationProgressOverlayDialog operationProgressOverlayDialog = k661Var.d;
        YbDivView ybDivView = k661Var.b;
        boolean z = viewState instanceof ho8;
        operationProgressOverlayDialog.setVisibility((z || (viewState instanceof io8)) ? 0 : 8);
        boolean z2 = viewState instanceof fo8;
        ybDivView.setVisibility(z2 ? 0 : 8);
        ErrorView errorView = k661Var.c;
        boolean z3 = viewState instanceof go8;
        go8 go8Var = z3 ? (go8) viewState : null;
        errorView.render(go8Var != null ? go8Var.a() : null);
        if (z) {
            operationProgressOverlayDialog.render(((ho8) viewState).a());
            return;
        }
        if (viewState instanceof io8) {
            operationProgressOverlayDialog.render(((io8) viewState).a());
        } else if (z2) {
            YbDivView.setData$default(ybDivView, ((fo8) viewState).a(), null, null, false, 14, null);
        } else {
            if (z3) {
                return;
            }
            w511.b();
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
