package com.ybsdk.feature.partnerselection.internal.screens.partners.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.core.transfer.utils.SimpleTextWatcher;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.partnerselection.api.PartnerSelectionFeature$Companion$Entry;
import com.ybsdk.feature.partnerselection.api.PartnerSelectionResult;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.FullscreenStatusView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.g;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.aw80;
import defpackage.b64;
import defpackage.bd90;
import defpackage.bm50;
import defpackage.ce4;
import defpackage.dcs;
import defpackage.f73;
import defpackage.g8e;
import defpackage.gao;
import defpackage.hj90;
import defpackage.i3y;
import defpackage.ij90;
import defpackage.j0t0;
import defpackage.jj90;
import defpackage.jl40;
import defpackage.kj90;
import defpackage.lcb1;
import defpackage.lfx;
import defpackage.lj90;
import defpackage.m861;
import defpackage.nj90;
import defpackage.od8;
import defpackage.oj90;
import defpackage.pj90;
import defpackage.pqy;
import defpackage.qa3;
import defpackage.qas0;
import defpackage.qj90;
import defpackage.rfb1;
import defpackage.rj90;
import defpackage.sc20;
import defpackage.sd30;
import defpackage.smw0;
import defpackage.stz0;
import defpackage.u290;
import defpackage.unr0;
import defpackage.uty;
import defpackage.w511;
import defpackage.x4c;
import defpackage.xi90;
import defpackage.xsy;
import defpackage.y8f;
import defpackage.yi90;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 32\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u000245B\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\"\u0010(\u001a\u0010\u0012\f\u0012\n '*\u0004\u0018\u00010&0&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/ybsdk/feature/partnerselection/internal/screens/partners/presentation/PartnersFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lm861;", "Lrj90;", "Lcom/ybsdk/feature/partnerselection/internal/screens/partners/presentation/c;", "Lce4;", "Lcom/ybsdk/feature/partnerselection/internal/screens/partners/presentation/b;", "viewModelFactory", "<init>", "(Lcom/ybsdk/feature/partnerselection/internal/screens/partners/presentation/b;)V", "Lzy11;", "scrollToTop", "()V", "Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionResult;", TarifficatorScenarioActivity.RESULT_KEY, "finishWithResult", "(Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionResult;)V", "", "onBackPressed", "()Z", "createViewModel", "()Lcom/ybsdk/feature/partnerselection/internal/screens/partners/presentation/c;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lm861;", "onResume", "viewState", "render", "(Lrj90;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Lcom/ybsdk/feature/partnerselection/internal/screens/partners/presentation/b;", "Lqa3;", "", "kotlin.jvm.PlatformType", "adapter", "Lqa3;", "Landroidx/recyclerview/widget/h;", "itemAnimator$delegate", "Li3y;", "getItemAnimator", "()Landroidx/recyclerview/widget/h;", "itemAnimator", "Lcom/ybsdk/core/transfer/utils/SimpleTextWatcher;", "inputWatcher", "Lcom/ybsdk/core/transfer/utils/SimpleTextWatcher;", "Companion", "yi90", "Arguments", "feature-partner-selection_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PartnersFragment extends BaseMvvmFragment<m861, rj90, c> implements ce4 {
    public static final yi90 Companion = new yi90();
    private static final int MAX_LENGTH = 100;
    private static final int ZERO_POSITION = 0;
    private final qa3 adapter;
    private final SimpleTextWatcher inputWatcher;

    /* renamed from: itemAnimator$delegate, reason: from kotlin metadata */
    private final i3y itemAnimator;
    private final b viewModelFactory;

    public PartnersFragment(b bVar) {
        super(Boolean.FALSE, null, null, null, c.class, 14, null);
        this.viewModelFactory = bVar;
        this.adapter = new qa3(xsy.a, pqy.b(new sc20(24, this)), rfb1.i());
        this.itemAnimator = kotlin.a.a(new aw80(21));
        this.inputWatcher = new SimpleTextWatcher(new u290(8, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter$lambda$0(PartnersFragment partnersFragment, uty utyVar, int i) {
        partnersFragment.getViewModel().k0(utyVar, i);
        return zy11.a;
    }

    private final void finishWithResult(PartnerSelectionResult result) {
        Object failure;
        try {
            getParentFragmentManager().l0(result.toBundle(), "SELECT_PARTNER_RESULT_KEY");
            getRouter().e();
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            x4c.g("Failed to send REQUEST_SELECT_PARTNER result", a, null, null, 12);
        }
    }

    private final h getItemAnimator() {
        return (h) this.itemAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$11$lambda$10$lambda$8(PartnersFragment partnersFragment) {
        partnersFragment.getViewModel().l0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$11$lambda$10$lambda$9(PartnersFragment partnersFragment) {
        partnersFragment.getViewModel().e0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$11$lambda$3(PartnersFragment partnersFragment) {
        partnersFragment.finishWithResult(PartnerSelectionResult.Close.INSTANCE);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$11$lambda$4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$11$lambda$5(PartnersFragment partnersFragment) {
        partnersFragment.getViewModel().g0();
        partnersFragment.finishWithResult(PartnerSelectionResult.BackPressed.INSTANCE);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$11$lambda$6(PartnersFragment partnersFragment) {
        partnersFragment.getViewModel().h0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$11$lambda$7(PartnersFragment partnersFragment) {
        partnersFragment.getViewModel().i0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 inputWatcher$lambda$2(PartnersFragment partnersFragment, Editable editable) {
        partnersFragment.getViewModel().f0(String.valueOf(editable));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h itemAnimator_delegate$lambda$1() {
        return new h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final stz0 render$lambda$19$lambda$12(rj90 rj90Var, stz0 stz0Var) {
        Text b = rj90Var.b();
        if (b == null) {
            b = stz0Var.d();
        }
        Text text = b;
        Text c = rj90Var.c();
        if (c == null) {
            c = stz0Var.c();
        }
        return stz0.a(stz0Var, text, c, null, null, null, rj90Var.a(), false, false, null, null, 0, 32732);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$19$lambda$17$lambda$15(m861 m861Var, qj90 qj90Var) {
        LoadableInput.render$default(m861Var.c, false, new u290(9, qj90Var), 1, null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g render$lambda$19$lambda$17$lambda$15$lambda$14(qj90 qj90Var, g gVar) {
        return g.a(gVar, qj90Var.e(), null, true, null, null, null, null, false, null, null, null, false, null, null, false, 0, false, 0, 0, null, null, null, 33554426);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$19$lambda$17$lambda$16(qj90 qj90Var, PartnersFragment partnersFragment) {
        if (qj90Var.g()) {
            partnersFragment.scrollToTop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g render$lambda$19$lambda$18(g gVar) {
        return g.a(gVar, null, null, false, null, null, null, null, false, null, null, null, false, null, null, false, 0, false, 0, 0, null, null, null, 33554427);
    }

    private final void scrollToTop() {
        safePost(new xi90(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 scrollToTop$lambda$20(PartnersFragment partnersFragment) {
        RecyclerView.e layoutManager = ((m861) partnersFragment.getBinding()).e.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.l1(0);
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof lj90) {
            lj90 lj90Var = (lj90) sideEffect;
            if (lj90Var instanceof ij90) {
                com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), gao.e(null, null, ((ij90) sideEffect).a(), 3), j0t0.c, 8);
                return;
            }
            if (lj90Var instanceof jj90) {
                finishWithResult(new PartnerSelectionResult.Success(((jj90) sideEffect).a()));
                return;
            }
            if (lj90Var.equals(kj90.a)) {
                ((m861) getBinding()).c.getEditText().requestFocus();
            } else if (!lj90Var.equals(hj90.a)) {
                w511.b();
            } else {
                lcb1.d(((m861) getBinding()).c.getEditText());
                ((m861) getBinding()).c.getEditText().clearFocus();
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
    public c getFactoryOfViewModel() {
        return ((e) this.viewModelFactory).a((Arguments) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public m861 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        m861 o = m861.o(inflater, container);
        FullscreenStatusView fullscreenStatusView = o.d;
        o.e.setAdapter(this.adapter);
        this.adapter.g(EmptyList.a);
        LoadableInput loadableInput = o.c;
        loadableInput.getEditText().setFilters(loadableInput.getEditText().getFilters() == null ? new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(100)} : (InputFilter[]) f73.s(loadableInput.getEditText().getFilters(), new InputFilter.LengthFilter(100)));
        loadableInput.getEditText().addTextChangedListener(this.inputWatcher);
        o.f.setOnCloseButtonClickListener(new xi90(this, 2));
        int i = 6;
        fullscreenStatusView.setOnClickListener(new od8(i));
        fullscreenStatusView.setCloseButtonAction(new xi90(this, 3));
        fullscreenStatusView.setPrimaryButtonAction(new xi90(this, 4));
        fullscreenStatusView.setSecondaryButtonAction(new xi90(this, 5));
        ErrorView errorView = o.b;
        errorView.setChangeVisibilityWithDelay(false);
        errorView.setPrimaryButtonOnClickListener(new xi90(this, i));
        errorView.setSecondaryButtonClickListener(new xi90(this, 0));
        return o;
    }

    @Override // defpackage.ce4
    public boolean onBackPressed() {
        if (getViewModel().d0()) {
            return true;
        }
        finishWithResult(PartnerSelectionResult.BackPressed.INSTANCE);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getViewModel().j0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(rj90 viewState) {
        m861 m861Var = (m861) getBinding();
        setBackButtonVisible(viewState.isBackButtonVisible());
        ErrorView errorView = m861Var.b;
        LoadableInput loadableInput = m861Var.c;
        errorView.render(null);
        FullscreenStatusView fullscreenStatusView = m861Var.d;
        boolean z = viewState instanceof oj90;
        fullscreenStatusView.setVisibility(z ? 0 : 8);
        m861Var.f.render(new u290(7, viewState));
        if (viewState instanceof qj90) {
            qj90 qj90Var = (qj90) viewState;
            RecyclerView recyclerView = m861Var.e;
            h itemAnimator = getItemAnimator();
            if (!qj90Var.d()) {
                itemAnimator = null;
            }
            recyclerView.setItemAnimator(itemAnimator);
            this.inputWatcher.ignoreEvents(new bm50(22, m861Var, qj90Var));
            loadableInput.getEditText().requestFocus();
            try {
                this.adapter.h(qj90Var.f(), new sd30(28, qj90Var, this));
                return;
            } catch (IllegalArgumentException unused) {
                x4c.g("Partners scrolling to top IllegalArgumentException", null, qj90Var.f(), null, 10);
                return;
            }
        }
        if (z) {
            fullscreenStatusView.render(((oj90) viewState).d());
            return;
        }
        if (viewState instanceof nj90) {
            m861Var.b.render(((nj90) viewState).d());
        } else if (!(viewState instanceof pj90)) {
            w511.b();
        } else {
            this.adapter.g(((pj90) viewState).d());
            LoadableInput.render$default(loadableInput, false, new bd90(3), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001fJ\u0010\u0010,\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b.\u0010-J\u0096\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u001fJ\u0010\u00102\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b2\u0010\u001dJ\u001a\u00105\u001a\u00020\u00102\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b9\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b;\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b=\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b>\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b?\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b@\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\bA\u0010\u001fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bC\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\bD\u0010\u001fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bF\u0010-R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bG\u0010-¨\u0006H"}, d2 = {"Lcom/ybsdk/feature/partnerselection/internal/screens/partners/presentation/PartnersFragment$Arguments;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "receiverPhone", "agreementId", "Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionFeature$Companion$Entry;", "entry", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "money", "comment", "transferType", "transferSessionId", "transferId", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "transferScenario", "destinationCountry", "", "backVisible", "skipPartnerCheck", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionFeature$Companion$Entry;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/transfer/utils/TransferScenario;Ljava/lang/String;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionFeature$Companion$Entry;", "component4", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component5", "component6", "component7", "component8", "component9", "()Lcom/ybsdk/core/transfer/utils/TransferScenario;", "component10", "component11", "()Z", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionFeature$Companion$Entry;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/transfer/utils/TransferScenario;Ljava/lang/String;ZZ)Lcom/ybsdk/feature/partnerselection/internal/screens/partners/presentation/PartnersFragment$Arguments;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getReceiverPhone", "getAgreementId", "Lcom/ybsdk/feature/partnerselection/api/PartnerSelectionFeature$Companion$Entry;", "getEntry", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getMoney", "getComment", "getTransferType", "getTransferSessionId", "getTransferId", "Lcom/ybsdk/core/transfer/utils/TransferScenario;", "getTransferScenario", "getDestinationCountry", "Z", "getBackVisible", "getSkipPartnerCheck", "feature-partner-selection_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Arguments implements ScreenParams {
        public static final Parcelable.Creator<Arguments> CREATOR = new Creator();
        private final String agreementId;
        private final boolean backVisible;
        private final String comment;
        private final String destinationCountry;
        private final PartnerSelectionFeature$Companion$Entry entry;
        private final MoneyEntity money;
        private final String receiverPhone;
        private final boolean skipPartnerCheck;
        private final String transferId;
        private final TransferScenario transferScenario;
        private final String transferSessionId;
        private final String transferType;

        public /* synthetic */ Arguments(String str, String str2, PartnerSelectionFeature$Companion$Entry partnerSelectionFeature$Companion$Entry, MoneyEntity moneyEntity, String str3, String str4, String str5, String str6, TransferScenario transferScenario, String str7, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, partnerSelectionFeature$Companion$Entry, moneyEntity, str3, str4, str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : transferScenario, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? true : z, (i & 2048) != 0 ? false : z2);
        }

        public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, String str2, PartnerSelectionFeature$Companion$Entry partnerSelectionFeature$Companion$Entry, MoneyEntity moneyEntity, String str3, String str4, String str5, String str6, TransferScenario transferScenario, String str7, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = arguments.receiverPhone;
            }
            if ((i & 2) != 0) {
                str2 = arguments.agreementId;
            }
            if ((i & 4) != 0) {
                partnerSelectionFeature$Companion$Entry = arguments.entry;
            }
            if ((i & 8) != 0) {
                moneyEntity = arguments.money;
            }
            if ((i & 16) != 0) {
                str3 = arguments.comment;
            }
            if ((i & 32) != 0) {
                str4 = arguments.transferType;
            }
            if ((i & 64) != 0) {
                str5 = arguments.transferSessionId;
            }
            if ((i & 128) != 0) {
                str6 = arguments.transferId;
            }
            if ((i & 256) != 0) {
                transferScenario = arguments.transferScenario;
            }
            if ((i & 512) != 0) {
                str7 = arguments.destinationCountry;
            }
            if ((i & 1024) != 0) {
                z = arguments.backVisible;
            }
            if ((i & 2048) != 0) {
                z2 = arguments.skipPartnerCheck;
            }
            boolean z3 = z;
            boolean z4 = z2;
            TransferScenario transferScenario2 = transferScenario;
            String str8 = str7;
            String str9 = str5;
            String str10 = str6;
            String str11 = str3;
            String str12 = str4;
            return arguments.copy(str, str2, partnerSelectionFeature$Companion$Entry, moneyEntity, str11, str12, str9, str10, transferScenario2, str8, z3, z4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getReceiverPhone() {
            return this.receiverPhone;
        }

        /* renamed from: component10, reason: from getter */
        public final String getDestinationCountry() {
            return this.destinationCountry;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getBackVisible() {
            return this.backVisible;
        }

        /* renamed from: component12, reason: from getter */
        public final boolean getSkipPartnerCheck() {
            return this.skipPartnerCheck;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAgreementId() {
            return this.agreementId;
        }

        /* renamed from: component3, reason: from getter */
        public final PartnerSelectionFeature$Companion$Entry getEntry() {
            return this.entry;
        }

        /* renamed from: component4, reason: from getter */
        public final MoneyEntity getMoney() {
            return this.money;
        }

        /* renamed from: component5, reason: from getter */
        public final String getComment() {
            return this.comment;
        }

        /* renamed from: component6, reason: from getter */
        public final String getTransferType() {
            return this.transferType;
        }

        /* renamed from: component7, reason: from getter */
        public final String getTransferSessionId() {
            return this.transferSessionId;
        }

        /* renamed from: component8, reason: from getter */
        public final String getTransferId() {
            return this.transferId;
        }

        /* renamed from: component9, reason: from getter */
        public final TransferScenario getTransferScenario() {
            return this.transferScenario;
        }

        public final Arguments copy(String receiverPhone, String agreementId, PartnerSelectionFeature$Companion$Entry entry, MoneyEntity money, String comment, String transferType, String transferSessionId, String transferId, TransferScenario transferScenario, String destinationCountry, boolean backVisible, boolean skipPartnerCheck) {
            return new Arguments(receiverPhone, agreementId, entry, money, comment, transferType, transferSessionId, transferId, transferScenario, destinationCountry, backVisible, skipPartnerCheck);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Arguments)) {
                return false;
            }
            Arguments arguments = (Arguments) other;
            return jl40.l(this.receiverPhone, arguments.receiverPhone) && jl40.l(this.agreementId, arguments.agreementId) && this.entry == arguments.entry && jl40.l(this.money, arguments.money) && jl40.l(this.comment, arguments.comment) && jl40.l(this.transferType, arguments.transferType) && jl40.l(this.transferSessionId, arguments.transferSessionId) && jl40.l(this.transferId, arguments.transferId) && this.transferScenario == arguments.transferScenario && jl40.l(this.destinationCountry, arguments.destinationCountry) && this.backVisible == arguments.backVisible && this.skipPartnerCheck == arguments.skipPartnerCheck;
        }

        public final String getAgreementId() {
            return this.agreementId;
        }

        public final boolean getBackVisible() {
            return this.backVisible;
        }

        public final String getComment() {
            return this.comment;
        }

        public final String getDestinationCountry() {
            return this.destinationCountry;
        }

        public final PartnerSelectionFeature$Companion$Entry getEntry() {
            return this.entry;
        }

        public final MoneyEntity getMoney() {
            return this.money;
        }

        public final String getReceiverPhone() {
            return this.receiverPhone;
        }

        public final boolean getSkipPartnerCheck() {
            return this.skipPartnerCheck;
        }

        public final String getTransferId() {
            return this.transferId;
        }

        public final TransferScenario getTransferScenario() {
            return this.transferScenario;
        }

        public final String getTransferSessionId() {
            return this.transferSessionId;
        }

        public final String getTransferType() {
            return this.transferType;
        }

        public int hashCode() {
            int hashCode = this.receiverPhone.hashCode() * 31;
            String str = this.agreementId;
            int hashCode2 = (this.entry.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            MoneyEntity moneyEntity = this.money;
            int hashCode3 = (hashCode2 + (moneyEntity == null ? 0 : moneyEntity.hashCode())) * 31;
            String str2 = this.comment;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.transferType;
            int b = unr0.b((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.transferSessionId);
            String str4 = this.transferId;
            int hashCode5 = (b + (str4 == null ? 0 : str4.hashCode())) * 31;
            TransferScenario transferScenario = this.transferScenario;
            int hashCode6 = (hashCode5 + (transferScenario == null ? 0 : transferScenario.hashCode())) * 31;
            String str5 = this.destinationCountry;
            return Boolean.hashCode(this.skipPartnerCheck) + unr0.e((hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.backVisible);
        }

        public String toString() {
            String str = this.receiverPhone;
            String str2 = this.agreementId;
            PartnerSelectionFeature$Companion$Entry partnerSelectionFeature$Companion$Entry = this.entry;
            MoneyEntity moneyEntity = this.money;
            String str3 = this.comment;
            String str4 = this.transferType;
            String str5 = this.transferSessionId;
            String str6 = this.transferId;
            TransferScenario transferScenario = this.transferScenario;
            String str7 = this.destinationCountry;
            boolean z = this.backVisible;
            boolean z2 = this.skipPartnerCheck;
            StringBuilder v = b64.v("Arguments(receiverPhone=", str, ", agreementId=", str2, ", entry=");
            v.append(partnerSelectionFeature$Companion$Entry);
            v.append(", money=");
            v.append(moneyEntity);
            v.append(", comment=");
            g8e.D(v, str3, ", transferType=", str4, ", transferSessionId=");
            g8e.D(v, str5, ", transferId=", str6, ", transferScenario=");
            v.append(transferScenario);
            v.append(", destinationCountry=");
            v.append(str7);
            v.append(", backVisible=");
            return smw0.k(", skipPartnerCheck=", Extension.C_BRAKE, v, z, z2);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.receiverPhone);
            dest.writeString(this.agreementId);
            dest.writeString(this.entry.name());
            dest.writeParcelable(this.money, flags);
            dest.writeString(this.comment);
            dest.writeString(this.transferType);
            dest.writeString(this.transferSessionId);
            dest.writeString(this.transferId);
            TransferScenario transferScenario = this.transferScenario;
            if (transferScenario == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(transferScenario.name());
            }
            dest.writeString(this.destinationCountry);
            dest.writeInt(this.backVisible ? 1 : 0);
            dest.writeInt(this.skipPartnerCheck ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Arguments> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Arguments createFromParcel(Parcel parcel) {
                boolean z;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                PartnerSelectionFeature$Companion$Entry valueOf = PartnerSelectionFeature$Companion$Entry.valueOf(parcel.readString());
                MoneyEntity moneyEntity = (MoneyEntity) parcel.readParcelable(Arguments.class.getClassLoader());
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                TransferScenario valueOf2 = parcel.readInt() == 0 ? null : TransferScenario.valueOf(parcel.readString());
                String readString7 = parcel.readString();
                boolean z2 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
                return new Arguments(readString, readString2, valueOf, moneyEntity, readString3, readString4, readString5, readString6, valueOf2, readString7, z2, parcel.readInt() == 0 ? z : true);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Arguments[] newArray(int i) {
                return new Arguments[i];
            }
        }

        public Arguments(String str, String str2, PartnerSelectionFeature$Companion$Entry partnerSelectionFeature$Companion$Entry, MoneyEntity moneyEntity, String str3, String str4, String str5, String str6, TransferScenario transferScenario, String str7, boolean z, boolean z2) {
            this.receiverPhone = str;
            this.agreementId = str2;
            this.entry = partnerSelectionFeature$Companion$Entry;
            this.money = moneyEntity;
            this.comment = str3;
            this.transferType = str4;
            this.transferSessionId = str5;
            this.transferId = str6;
            this.transferScenario = transferScenario;
            this.destinationCountry = str7;
            this.backVisible = z;
            this.skipPartnerCheck = z2;
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
