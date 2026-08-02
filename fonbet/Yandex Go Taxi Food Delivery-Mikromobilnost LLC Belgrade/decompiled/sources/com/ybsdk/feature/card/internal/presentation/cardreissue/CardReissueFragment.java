package com.ybsdk.feature.card.internal.presentation.cardreissue;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.feature.card.api.CardReissueScreenParams;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$Request;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$SecondFactorResult;
import com.ybsdk.feature.card.internal.presentation.cardreissue.CardReissueFragment;
import com.ybsdk.widgets.common.OperationProgressOverlayDialog;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import defpackage.ce4;
import defpackage.cm8;
import defpackage.dcs;
import defpackage.e48;
import defpackage.hua1;
import defpackage.j661;
import defpackage.jl40;
import defpackage.lfx;
import defpackage.lm8;
import defpackage.mf8;
import defpackage.mm8;
import defpackage.nm8;
import defpackage.om8;
import defpackage.qas0;
import defpackage.qn8;
import defpackage.rm8;
import defpackage.sls;
import defpackage.sm8;
import defpackage.srb1;
import defpackage.tm8;
import defpackage.um8;
import defpackage.w511;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 '2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001(B\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&¨\u0006)"}, d2 = {"Lcom/ybsdk/feature/card/internal/presentation/cardreissue/CardReissueFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lj661;", "Lum8;", "Lcom/ybsdk/feature/card/internal/presentation/cardreissue/a;", "Lce4;", "Lom8;", "viewModelFactory", "Lqn8;", "secondFactorHelper", "<init>", "(Lom8;Lqn8;)V", "createViewModel", "()Lcom/ybsdk/feature/card/internal/presentation/cardreissue/a;", "", "onBackPressed", "()Z", "Lqas0;", "sideEffect", "Lzy11;", "consumeSideEffect", "(Lqas0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lj661;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "viewState", "render", "(Lum8;)V", "Lom8;", "Lqn8;", "Companion", "cm8", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CardReissueFragment extends BaseMvvmFragment<j661, um8, a> implements ce4 {
    private static final String CARD_ID_KEY = "CARD_ID_KEY";
    public static final String CARD_REISSUE_RESULT_KEY = "CARD_REISSUE_RESULT_KEY";
    public static final cm8 Companion = new cm8();
    private final qn8 secondFactorHelper;
    private final om8 viewModelFactory;

    public CardReissueFragment(om8 om8Var, qn8 qn8Var) {
        super(Boolean.FALSE, null, null, null, a.class, 14, null);
        this.viewModelFactory = om8Var;
        this.secondFactorHelper = qn8Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$6$lambda$1(CardReissueFragment cardReissueFragment, View view) {
        cardReissueFragment.getViewModel().b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$6$lambda$2(CardReissueFragment cardReissueFragment, View view) {
        cardReissueFragment.getViewModel().g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$6$lambda$3(CardReissueFragment cardReissueFragment) {
        cardReissueFragment.getViewModel().f0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$6$lambda$4(CardReissueFragment cardReissueFragment) {
        cardReissueFragment.getViewModel().e0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$6$lambda$5(CardReissueFragment cardReissueFragment) {
        cardReissueFragment.getViewModel().e0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7(CardReissueFragment cardReissueFragment, String str, Bundle bundle) {
        CardSecondFactorHelper$SecondFactorResult a = ((mf8) cardReissueFragment.secondFactorHelper).a(bundle);
        if (a instanceof CardSecondFactorHelper$SecondFactorResult.VerificationToken) {
            cardReissueFragment.getViewModel().d0(((CardSecondFactorHelper$SecondFactorResult.VerificationToken) a).getVerificationToken());
        } else if (jl40.l(a, CardSecondFactorHelper$SecondFactorResult.Cancel.INSTANCE) || a == null) {
            cardReissueFragment.getViewModel().c0();
        } else {
            w511.b();
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof nm8) {
            nm8 nm8Var = (nm8) sideEffect;
            if (nm8Var instanceof mm8) {
                Bundle bundle = new Bundle();
                bundle.putString(CARD_ID_KEY, ((mm8) sideEffect).a());
                hua1.f(bundle, this, CARD_REISSUE_RESULT_KEY);
            } else if (nm8Var.equals(lm8.a)) {
                srb1.g(this);
            } else {
                w511.b();
            }
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
        return ((rm8) this.viewModelFactory).a((CardReissueScreenParams) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public j661 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        j661 o = j661.o(inflater, container);
        OperationProgressOverlayDialog operationProgressOverlayDialog = o.c;
        final int i = 0;
        operationProgressOverlayDialog.setPrimaryActionClickListener(new View.OnClickListener(this) { // from class: am8
            public final /* synthetic */ CardReissueFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                CardReissueFragment cardReissueFragment = this.b;
                switch (i2) {
                    case 0:
                        CardReissueFragment.getViewBinding$lambda$6$lambda$1(cardReissueFragment, view);
                        break;
                    default:
                        CardReissueFragment.getViewBinding$lambda$6$lambda$2(cardReissueFragment, view);
                        break;
                }
            }
        });
        final int i2 = 1;
        operationProgressOverlayDialog.setSubActionClickListener(new View.OnClickListener(this) { // from class: am8
            public final /* synthetic */ CardReissueFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                CardReissueFragment cardReissueFragment = this.b;
                switch (i22) {
                    case 0:
                        CardReissueFragment.getViewBinding$lambda$6$lambda$1(cardReissueFragment, view);
                        break;
                    default:
                        CardReissueFragment.getViewBinding$lambda$6$lambda$2(cardReissueFragment, view);
                        break;
                }
            }
        });
        CommunicationFullScreenView communicationFullScreenView = o.b;
        communicationFullScreenView.setPrimaryButtonOnClickListener(new sls(this) { // from class: bm8
            public final /* synthetic */ CardReissueFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 viewBinding$lambda$6$lambda$3;
                zy11 viewBinding$lambda$6$lambda$4;
                zy11 viewBinding$lambda$6$lambda$5;
                int i3 = i;
                CardReissueFragment cardReissueFragment = this.b;
                switch (i3) {
                    case 0:
                        viewBinding$lambda$6$lambda$3 = CardReissueFragment.getViewBinding$lambda$6$lambda$3(cardReissueFragment);
                        return viewBinding$lambda$6$lambda$3;
                    case 1:
                        viewBinding$lambda$6$lambda$4 = CardReissueFragment.getViewBinding$lambda$6$lambda$4(cardReissueFragment);
                        return viewBinding$lambda$6$lambda$4;
                    default:
                        viewBinding$lambda$6$lambda$5 = CardReissueFragment.getViewBinding$lambda$6$lambda$5(cardReissueFragment);
                        return viewBinding$lambda$6$lambda$5;
                }
            }
        });
        communicationFullScreenView.setSecondaryButtonClickListener(new sls(this) { // from class: bm8
            public final /* synthetic */ CardReissueFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 viewBinding$lambda$6$lambda$3;
                zy11 viewBinding$lambda$6$lambda$4;
                zy11 viewBinding$lambda$6$lambda$5;
                int i3 = i2;
                CardReissueFragment cardReissueFragment = this.b;
                switch (i3) {
                    case 0:
                        viewBinding$lambda$6$lambda$3 = CardReissueFragment.getViewBinding$lambda$6$lambda$3(cardReissueFragment);
                        return viewBinding$lambda$6$lambda$3;
                    case 1:
                        viewBinding$lambda$6$lambda$4 = CardReissueFragment.getViewBinding$lambda$6$lambda$4(cardReissueFragment);
                        return viewBinding$lambda$6$lambda$4;
                    default:
                        viewBinding$lambda$6$lambda$5 = CardReissueFragment.getViewBinding$lambda$6$lambda$5(cardReissueFragment);
                        return viewBinding$lambda$6$lambda$5;
                }
            }
        });
        final int i3 = 2;
        o.e.setOnCloseButtonClickListener(new sls(this) { // from class: bm8
            public final /* synthetic */ CardReissueFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 viewBinding$lambda$6$lambda$3;
                zy11 viewBinding$lambda$6$lambda$4;
                zy11 viewBinding$lambda$6$lambda$5;
                int i32 = i3;
                CardReissueFragment cardReissueFragment = this.b;
                switch (i32) {
                    case 0:
                        viewBinding$lambda$6$lambda$3 = CardReissueFragment.getViewBinding$lambda$6$lambda$3(cardReissueFragment);
                        return viewBinding$lambda$6$lambda$3;
                    case 1:
                        viewBinding$lambda$6$lambda$4 = CardReissueFragment.getViewBinding$lambda$6$lambda$4(cardReissueFragment);
                        return viewBinding$lambda$6$lambda$4;
                    default:
                        viewBinding$lambda$6$lambda$5 = CardReissueFragment.getViewBinding$lambda$6$lambda$5(cardReissueFragment);
                        return viewBinding$lambda$6$lambda$5;
                }
            }
        });
        return o;
    }

    @Override // defpackage.ce4
    public boolean onBackPressed() {
        getViewModel().b0();
        return true;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getParentFragmentManager().m0(CardSecondFactorHelper$Request.REISSUE.getKey(), this, new e48(10, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(um8 viewState) {
        j661 j661Var = (j661) getBinding();
        ShimmerFrameLayout shimmerFrameLayout = j661Var.d;
        OperationProgressOverlayDialog operationProgressOverlayDialog = j661Var.c;
        CommunicationFullScreenView communicationFullScreenView = j661Var.b;
        shimmerFrameLayout.stopShimmer();
        j661Var.d.setVisibility(8);
        if (viewState instanceof sm8) {
            communicationFullScreenView.setVisibility(0);
            operationProgressOverlayDialog.setVisibility(8);
            communicationFullScreenView.render(((sm8) viewState).a());
        } else if (viewState instanceof tm8) {
            communicationFullScreenView.setVisibility(8);
            operationProgressOverlayDialog.setVisibility(0);
            operationProgressOverlayDialog.render(((tm8) viewState).a());
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
