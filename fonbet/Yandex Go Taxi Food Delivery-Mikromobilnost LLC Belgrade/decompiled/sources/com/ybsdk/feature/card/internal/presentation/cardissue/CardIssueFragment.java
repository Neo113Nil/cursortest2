package com.ybsdk.feature.card.internal.presentation.cardissue;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.l;
import defpackage.dcs;
import defpackage.dzh0;
import defpackage.h661;
import defpackage.jl40;
import defpackage.k5;
import defpackage.lfx;
import defpackage.pc70;
import defpackage.qc70;
import defpackage.rk6;
import defpackage.th8;
import defpackage.w04;
import defpackage.w511;
import defpackage.wh8;
import defpackage.xh8;
import defpackage.y8f;
import defpackage.yh8;
import defpackage.yr31;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u001c*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u00020\u001c*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010$\u001a\u0004\u0018\u00010\u001c*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001eR\u0018\u0010(\u001a\u00020%*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/ybsdk/feature/card/internal/presentation/cardissue/CardIssueFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lh661;", "Lyh8;", "Lcom/ybsdk/feature/card/internal/presentation/cardissue/a;", "Lth8;", "presenterFactory", "<init>", "(Lth8;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "createViewModel", "()Lcom/ybsdk/feature/card/internal/presentation/cardissue/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lh661;", "viewState", "render", "(Lyh8;)V", "Lth8;", "", "getErrorDescription", "(Lyh8;)Ljava/lang/Integer;", "errorDescription", "getMessage", "(Lyh8;)I", Constants.KEY_MESSAGE, "getButtonText", "buttonText", "Lqc70;", "getOperationState", "(Lyh8;)Lqc70;", "operationState", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CardIssueFragment extends BaseMvvmFragment<h661, yh8, a> {
    private final th8 presenterFactory;

    public CardIssueFragment(th8 th8Var) {
        super(Boolean.FALSE, null, null, null, a.class, 14, null);
        this.presenterFactory = th8Var;
    }

    private final Integer getButtonText(yh8 yh8Var) {
        if (!jl40.l(yh8Var, xh8.a) && !jl40.l(yh8Var, xh8.b)) {
            if (jl40.l(yh8Var, xh8.c)) {
                return null;
            }
            if (jl40.l(yh8Var, xh8.d)) {
                return Integer.valueOf(dzh0.ybsdk_card_landing_great);
            }
            if (jl40.l(yh8Var, xh8.e)) {
                return Integer.valueOf(dzh0.ybsdk_deposit_deposit_processing_pending_action_title);
            }
            w511.b();
            return null;
        }
        return Integer.valueOf(dzh0.ybsdk_card_landing_try_again);
    }

    private final Integer getErrorDescription(yh8 yh8Var) {
        if (jl40.l(yh8Var, xh8.e)) {
            return Integer.valueOf(dzh0.ybsdk_deposit_deposit_processing_pending_description);
        }
        return null;
    }

    private final int getMessage(yh8 yh8Var) {
        if (!jl40.l(yh8Var, xh8.a) && !jl40.l(yh8Var, xh8.b)) {
            if (jl40.l(yh8Var, xh8.c)) {
                return dzh0.ybsdk_card_landing_issuing_card;
            }
            if (jl40.l(yh8Var, xh8.d)) {
                return dzh0.ybsdk_card_landing_card_issued;
            }
            if (jl40.l(yh8Var, xh8.e)) {
                return dzh0.ybsdk_deposit_deposit_processing_pending_title;
            }
            w511.b();
            return 0;
        }
        return dzh0.ybsdk_card_landing_card_cant_be_issued;
    }

    private final qc70 getOperationState(yh8 yh8Var) {
        if (jl40.l(yh8Var, xh8.a) || jl40.l(yh8Var, xh8.b)) {
            return new l(OperationProgressView.StatusIcon.ERROR);
        }
        if (jl40.l(yh8Var, xh8.c)) {
            return pc70.a;
        }
        if (jl40.l(yh8Var, xh8.d)) {
            return new l(OperationProgressView.StatusIcon.SUCCESS);
        }
        if (jl40.l(yh8Var, xh8.e)) {
            return new l(OperationProgressView.StatusIcon.TIMEOUT);
        }
        w511.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$0(CardIssueFragment cardIssueFragment) {
        cardIssueFragment.getViewModel().f0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YbButtonView.a render$lambda$7$lambda$4$lambda$2(CardIssueFragment cardIssueFragment, yh8 yh8Var, YbButtonView.a aVar) {
        Integer buttonText = cardIssueFragment.getButtonText(yh8Var);
        return new YbButtonView.a(buttonText != null ? new Text.Resource(buttonText.intValue()) : null, null, null, null, null, null, null, false, false, null, 4094);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$7$lambda$4$lambda$3(CardIssueFragment cardIssueFragment, yh8 yh8Var, View view) {
        cardIssueFragment.getViewModel().e0(yh8Var);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((wh8) this.presenterFactory).a((CardIssueScreenArguments) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public h661 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return h661.o(getLayoutInflater());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((h661) getBinding()).f.setOnCloseButtonClickListener(new rk6(23, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(yh8 viewState) {
        h661 h661Var = (h661) getBinding();
        YbButtonView ybButtonView = h661Var.b;
        ybButtonView.setVisibility(getButtonText(viewState) != null ? 0 : 8);
        ybButtonView.render(new w04(29, this, viewState));
        ybButtonView.setOnClickListener(new k5(16, this, viewState));
        h661Var.c.render(getOperationState(viewState));
        h661Var.e.setText(getMessage(viewState));
        TextView textView = h661Var.d;
        textView.setVisibility(getErrorDescription(viewState) != null ? 0 : 8);
        Integer errorDescription = getErrorDescription(viewState);
        if (errorDescription != null) {
            textView.setText(errorDescription.intValue());
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
