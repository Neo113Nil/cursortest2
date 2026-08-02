package com.ybsdk.feature.card.internal.presentation.carddeletion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.api.CardManagementSettingStatus;
import com.ybsdk.feature.card.api.CardManagementSettingTextData;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$Request;
import com.ybsdk.feature.card.internal.presentation.carddeletion.CardDeletionFragment;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView$State$Type;
import com.ybsdk.widgets.common.l;
import defpackage.ad8;
import defpackage.bd8;
import defpackage.ce4;
import defpackage.cx7;
import defpackage.dcs;
import defpackage.dd8;
import defpackage.dzh0;
import defpackage.e48;
import defpackage.ed8;
import defpackage.f661;
import defpackage.jl40;
import defpackage.lfx;
import defpackage.mf8;
import defpackage.oc70;
import defpackage.pc70;
import defpackage.qas0;
import defpackage.qc70;
import defpackage.qn8;
import defpackage.rje;
import defpackage.srb1;
import defpackage.ung0;
import defpackage.unr0;
import defpackage.vc8;
import defpackage.vrc;
import defpackage.w511;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(¨\u0006)"}, d2 = {"Lcom/ybsdk/feature/card/internal/presentation/carddeletion/CardDeletionFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lf661;", "Led8;", "Lcom/ybsdk/feature/card/internal/presentation/carddeletion/a;", "Lce4;", "Lbd8;", "viewModelFactory", "Lqn8;", "secondFactorHelper", "<init>", "(Lbd8;Lqn8;)V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "", "onBackPressed", "()Z", "createViewModel", "()Lcom/ybsdk/feature/card/internal/presentation/carddeletion/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lf661;", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "viewState", "render", "(Led8;)V", "Lbd8;", "Lqn8;", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CardDeletionFragment extends BaseMvvmFragment<f661, ed8, a> implements ce4 {
    private final qn8 secondFactorHelper;
    private final bd8 viewModelFactory;

    public CardDeletionFragment(bd8 bd8Var, qn8 qn8Var) {
        super(Boolean.FALSE, null, null, null, a.class, 14, null);
        this.viewModelFactory = bd8Var;
        this.secondFactorHelper = qn8Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$3$lambda$1(CardDeletionFragment cardDeletionFragment) {
        cardDeletionFragment.getViewModel().f0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$3$lambda$2(CardDeletionFragment cardDeletionFragment) {
        cardDeletionFragment.getViewModel().d0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(CardDeletionFragment cardDeletionFragment, String str, Bundle bundle) {
        cardDeletionFragment.getViewModel().g0(((mf8) cardDeletionFragment.secondFactorHelper).a(bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$4(CardDeletionFragment cardDeletionFragment) {
        cardDeletionFragment.getViewModel().e0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vrc render$lambda$5(ed8 ed8Var, vrc vrcVar) {
        return vrc.a(vrcVar, ed8Var.a(), ed8Var.c(), null, false, false, 0, 0, null, false, -515);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$6(CardDeletionFragment cardDeletionFragment, View view) {
        cardDeletionFragment.getViewModel().f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$7(CardDeletionFragment cardDeletionFragment, View view) {
        cardDeletionFragment.getViewModel().h0();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof ad8) {
            if (((ad8) sideEffect).equals(ad8.a)) {
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
        return ((dd8) this.viewModelFactory).a((CardDeletionScreenParams) dcs.a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment
    public f661 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        Text h;
        Text h2;
        Text h3;
        Map<CardManagementSettingStatus, CardManagementSettingTextData> cardManagementSettingTextMap;
        ScreenParams a = dcs.a(this);
        CardManagementSettingTextData cardManagementSettingTextData = null;
        CardDeletionScreenParams cardDeletionScreenParams = a instanceof CardDeletionScreenParams ? (CardDeletionScreenParams) a : null;
        if (cardDeletionScreenParams != null && (cardManagementSettingTextMap = cardDeletionScreenParams.getCardManagementSettingTextMap()) != null) {
            cardManagementSettingTextData = cardManagementSettingTextMap.get(CardManagementSettingStatus.LANDING);
        }
        if (cardManagementSettingTextData == null || (h = cardManagementSettingTextData.getPrimaryButtonText()) == null) {
            h = unr0.h(Text.Companion, dzh0.ybsdk_card_deletion_delete_button_title);
        }
        Text text = h;
        if (cardManagementSettingTextData == null || (h2 = cardManagementSettingTextData.getSecondaryButtonText()) == null) {
            h2 = unr0.h(Text.Companion, dzh0.ybsdk_card_deletion_cancel_button_title);
        }
        if (cardManagementSettingTextData == null || (h3 = cardManagementSettingTextData.getDescription()) == null) {
            h3 = unr0.h(Text.Companion, dzh0.ybsdk_card_deletion_subtitle);
        }
        f661 o = f661.o(inflater, container);
        CommunicationFullScreenView communicationFullScreenView = o.b;
        CommunicationFullScreenView$State$Type communicationFullScreenView$State$Type = CommunicationFullScreenView$State$Type.DESCRIPTION;
        Integer valueOf = Integer.valueOf(rje.a(requireContext(), ung0.ybColor_fill_default_50));
        YbButtonViewGroup.Orientation orientation = YbButtonViewGroup.Orientation.VERTICAL;
        ColorModel colorModel = null;
        YbButtonView.a aVar = new YbButtonView.a(text, null, null, null, null, null, colorModel, false, false, null, 4094);
        ColorModel colorModel2 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        communicationFullScreenView.render(new vrc(communicationFullScreenView$State$Type, null, null, objArr5, h3, colorModel2, 0 == true ? 1 : 0, valueOf, null, objArr6, null, new YbButtonViewGroup.b(orientation, aVar, new YbButtonView.a(h2, objArr, objArr2, objArr3, colorModel, colorModel2, null, false, false, null, 4094), objArr4, 8), null, 0, 0, null, null, null, 0, false, null, null, null, null, null, null, -4242, 3));
        communicationFullScreenView.setPrimaryButtonOnClickListener(new vc8(this, 1));
        communicationFullScreenView.setSecondaryButtonClickListener(new vc8(this, 2));
        return o;
    }

    @Override // defpackage.ce4
    public boolean onBackPressed() {
        getViewModel().e0();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getParentFragmentManager().m0(CardSecondFactorHelper$Request.DELETION.getKey(), this, new e48(6, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((f661) getBinding()).e.setOnCloseButtonClickListener(new vc8(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(ed8 viewState) {
        ((f661) getBinding()).c.render(viewState.b());
        ((f661) getBinding()).b.render(new cx7(6, viewState));
        qc70 a = viewState.b().a();
        if (jl40.l(a, oc70.a)) {
            if (((f661) getBinding()).d.getCurrentView().getId() != ((f661) getBinding()).b.getId()) {
                ((f661) getBinding()).d.showNext();
            }
        } else if (!jl40.l(a, pc70.a) && !(a instanceof l)) {
            w511.b();
            return;
        } else if (((f661) getBinding()).d.getCurrentView().getId() != ((f661) getBinding()).c.getId()) {
            ((f661) getBinding()).d.showPrevious();
        }
        final int i = 0;
        ((f661) getBinding()).c.setPrimaryActionClickListener(new View.OnClickListener(this) { // from class: wc8
            public final /* synthetic */ CardDeletionFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                CardDeletionFragment cardDeletionFragment = this.b;
                switch (i2) {
                    case 0:
                        CardDeletionFragment.render$lambda$6(cardDeletionFragment, view);
                        break;
                    default:
                        CardDeletionFragment.render$lambda$7(cardDeletionFragment, view);
                        break;
                }
            }
        });
        final int i2 = 1;
        ((f661) getBinding()).c.setSubActionClickListener(new View.OnClickListener(this) { // from class: wc8
            public final /* synthetic */ CardDeletionFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                CardDeletionFragment cardDeletionFragment = this.b;
                switch (i22) {
                    case 0:
                        CardDeletionFragment.render$lambda$6(cardDeletionFragment, view);
                        break;
                    default:
                        CardDeletionFragment.render$lambda$7(cardDeletionFragment, view);
                        break;
                }
            }
        });
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
