package com.ybsdk.feature.merchant.offers.internal.screens.search;

import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.ext.ViewState;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.merchant.offers.internal.screens.search.MerchantOffersSearchFragment;
import com.ybsdk.widgets.common.ErrorView;
import defpackage.a10;
import defpackage.aq10;
import defpackage.bns;
import defpackage.bq10;
import defpackage.cob1;
import defpackage.cq10;
import defpackage.dq10;
import defpackage.e7n;
import defpackage.eal;
import defpackage.eq10;
import defpackage.er31;
import defpackage.ff2;
import defpackage.fq10;
import defpackage.gsx;
import defpackage.i3y;
import defpackage.iq10;
import defpackage.j161;
import defpackage.jq10;
import defpackage.kq10;
import defpackage.lcb1;
import defpackage.lfx;
import defpackage.lq10;
import defpackage.lum;
import defpackage.o70;
import defpackage.ola1;
import defpackage.qas0;
import defpackage.si91;
import defpackage.spl;
import defpackage.tja1;
import defpackage.ung0;
import defpackage.we6;
import defpackage.y8f;
import defpackage.yp10;
import defpackage.yr31;
import defpackage.yvf0;
import defpackage.zgv;
import defpackage.zij;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001.\b\u0000\u0018\u0000 82\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00019B\u0017\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0003H\u0017¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010\u000bJ\u0017\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R!\u00107\u001a\b\u0012\u0004\u0012\u000202018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/ybsdk/feature/merchant/offers/internal/screens/search/MerchantOffersSearchFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lj161;", "Llq10;", "Lcom/ybsdk/feature/merchant/offers/internal/screens/search/a;", "Lyvf0;", "viewModelProvider", "<init>", "(Lyvf0;)V", "Lzy11;", "scrollToTop", "()V", "", "query", "setNewQuery", "(Ljava/lang/String;)V", "onInputChanged", "setFocusWhenScreenIsFirstOpened", "setFocusAndShowKeyboard", "clearFocusAndHideKeyboard", "createViewModel", "()Lcom/ybsdk/feature/merchant/offers/internal/screens/search/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lj161;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "viewState", "render", "(Llq10;)V", "onDestroyView", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Lyvf0;", "Lgsx;", "lastItemScrollListener", "Lgsx;", "bq10", "customScrollListener", "Lbq10;", "Le7n;", "Lgc5;", "adapter$delegate", "Li3y;", "getAdapter", "()Le7n;", "adapter", "Companion", "aq10", "feature-merchant-offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MerchantOffersSearchFragment extends BaseDivContextMvvmFragment<j161, lq10, a> {

    @Deprecated
    public static final float ALPHA_FADE_PERCENT = 0.5f;

    @Deprecated
    public static final int MAX_RECYCLER_POSITION_FOR_SMOOTH_SCROLLING = 10;

    @Deprecated
    public static final int ZERO_POSITION = 0;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final i3y adapter;
    private final bq10 customScrollListener;
    private final gsx lastItemScrollListener;
    private final yvf0 viewModelProvider;
    private static final aq10 Companion = new aq10();
    private static final zij merchantOffersItemsDiffCallback = new a10(7);

    public MerchantOffersSearchFragment(yvf0 yvf0Var) {
        super(Boolean.FALSE, null, null, null, a.class, 14, null);
        this.viewModelProvider = yvf0Var;
        this.lastItemScrollListener = new gsx(new yp10(this, 0));
        this.customScrollListener = new bq10(this);
        this.adapter = kotlin.a.b(LazyThreadSafetyMode.NONE, new yp10(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e7n adapter_delegate$lambda$3(MerchantOffersSearchFragment merchantOffersSearchFragment) {
        lum b;
        zij zijVar = merchantOffersItemsDiffCallback;
        o70 c = ola1.c(new bns(28, merchantOffersSearchFragment));
        lum j = si91.j();
        b = er31.b(new yp10(merchantOffersSearchFragment, 2), false);
        return new e7n(zijVar, c, j, b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean adapter_delegate$lambda$3$lambda$1(MerchantOffersSearchFragment merchantOffersSearchFragment, Uri uri, spl splVar) {
        return ((a) merchantOffersSearchFragment.getViewModel()).k0(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 adapter_delegate$lambda$3$lambda$2(MerchantOffersSearchFragment merchantOffersSearchFragment) {
        ((a) merchantOffersSearchFragment.getViewModel()).h0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void clearFocusAndHideKeyboard() {
        AppCompatEditText appCompatEditText = ((j161) getBinding()).f;
        lcb1.d(appCompatEditText);
        if (appCompatEditText.hasFocus()) {
            appCompatEditText.clearFocus();
        }
    }

    private final e7n getAdapter() {
        return (e7n) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 lastItemScrollListener$lambda$0(MerchantOffersSearchFragment merchantOffersSearchFragment) {
        ((a) merchantOffersSearchFragment.getViewModel()).g0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onInputChanged(String query) {
        setFocusAndShowKeyboard();
        ((a) getViewModel()).i0(query);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$9$lambda$4(MerchantOffersSearchFragment merchantOffersSearchFragment, View view) {
        ((a) merchantOffersSearchFragment.getViewModel()).f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$9$lambda$5(MerchantOffersSearchFragment merchantOffersSearchFragment, View view) {
        ((a) merchantOffersSearchFragment.getViewModel()).j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$9$lambda$6(j161 j161Var, View view) {
        Editable text = j161Var.f.getText();
        if (text != null) {
            text.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onViewCreated$lambda$9$lambda$8(MerchantOffersSearchFragment merchantOffersSearchFragment, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        merchantOffersSearchFragment.clearFocusAndHideKeyboard();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void scrollToTop() {
        RecyclerView recyclerView = ((j161) getBinding()).g;
        if (((LinearLayoutManager) recyclerView.getLayoutManager()).K1() > 10) {
            recyclerView.scrollToPosition(10);
        }
        recyclerView.smoothScrollToPosition(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setFocusAndShowKeyboard() {
        AppCompatEditText appCompatEditText = ((j161) getBinding()).f;
        if (!appCompatEditText.hasFocus()) {
            appCompatEditText.requestFocus();
        }
        lcb1.f(appCompatEditText);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setFocusWhenScreenIsFirstOpened() {
        setFocusAndShowKeyboard();
        ((a) getViewModel()).j0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setNewQuery(String query) {
        AppCompatEditText appCompatEditText = ((j161) getBinding()).f;
        appCompatEditText.setText(query);
        appCompatEditText.setSelection(query.length());
        lcb1.d(appCompatEditText);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof iq10) {
            scrollToTop();
        } else if (sideEffect instanceof kq10) {
            setNewQuery(((kq10) sideEffect).a());
        } else if (sideEffect instanceof jq10) {
            setFocusAndShowKeyboard();
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return (a) this.viewModelProvider.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        j161 j161Var = (j161) getBinding();
        j161Var.g.removeOnScrollListener(this.lastItemScrollListener);
        RecyclerView recyclerView = j161Var.g;
        recyclerView.removeOnScrollListener(this.customScrollListener);
        recyclerView.setAdapter(null);
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [uc5] */
    /* JADX WARN: Type inference failed for: r2v6, types: [uc5] */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final int i = 1;
        ColorStateList b = cob1.b(new we6(cob1.a(new ColorModel.Attr(ung0.ybColor_textIcon_primary).get(requireContext()), 0.5f), new ViewState[]{ViewState.PRESSED}, i), new we6(new ColorModel.Attr(ung0.ybColor_textIcon_primary).get(requireContext()), new ViewState[]{ViewState.UNPRESSED}, i));
        final j161 j161Var = (j161) getBinding();
        final int i2 = 0;
        j161Var.b.setOnClickListener(new View.OnClickListener(this) { // from class: zp10
            public final /* synthetic */ MerchantOffersSearchFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i2;
                MerchantOffersSearchFragment merchantOffersSearchFragment = this.b;
                switch (i3) {
                    case 0:
                        MerchantOffersSearchFragment.onViewCreated$lambda$9$lambda$4(merchantOffersSearchFragment, view2);
                        break;
                    default:
                        MerchantOffersSearchFragment.onViewCreated$lambda$9$lambda$5(merchantOffersSearchFragment, view2);
                        break;
                }
            }
        });
        TextView textView = j161Var.b;
        textView.setTextColor(b);
        tja1.b(textView);
        ErrorView errorView = j161Var.e;
        errorView.setPrimaryButtonOnClickListener(new MerchantOffersSearchFragment$onViewCreated$1$2(getViewModel()));
        errorView.setCloseButtonClickListener(new MerchantOffersSearchFragment$onViewCreated$1$3(getViewModel()));
        RecyclerView recyclerView = j161Var.g;
        recyclerView.setAdapter(getAdapter());
        recyclerView.addOnScrollListener(this.lastItemScrollListener);
        recyclerView.addOnScrollListener(this.customScrollListener);
        AppCompatEditText appCompatEditText = j161Var.f;
        appCompatEditText.setOnClickListener(new View.OnClickListener(this) { // from class: zp10
            public final /* synthetic */ MerchantOffersSearchFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i;
                MerchantOffersSearchFragment merchantOffersSearchFragment = this.b;
                switch (i3) {
                    case 0:
                        MerchantOffersSearchFragment.onViewCreated$lambda$9$lambda$4(merchantOffersSearchFragment, view2);
                        break;
                    default:
                        MerchantOffersSearchFragment.onViewCreated$lambda$9$lambda$5(merchantOffersSearchFragment, view2);
                        break;
                }
            }
        });
        j161Var.c.setOnClickListener(new zgv(12, j161Var));
        appCompatEditText.addTextChangedListener(new TextWatcher() { // from class: com.ybsdk.feature.merchant.offers.internal.screens.search.MerchantOffersSearchFragment$onViewCreated$lambda$9$$inlined$doOnTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
                MerchantOffersSearchFragment.this.onInputChanged(text != null ? text.toString() : null);
                j161Var.c.setVisibility((text == null || text.length() == 0) ? 8 : 0);
            }
        });
        appCompatEditText.setOnEditorActionListener(new ff2(13, this));
        setFocusWhenScreenIsFirstOpened();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(lq10 viewState) {
        e7n adapter = getAdapter();
        fq10 a = viewState.a();
        cq10 cq10Var = a instanceof cq10 ? (cq10) a : null;
        adapter.g(cq10Var != null ? cq10Var.a() : null);
        getAdapter().notifyDataSetChanged();
        ((j161) getBinding()).d.setVisibility(viewState.a() instanceof eq10 ? 0 : 8);
        ((j161) getBinding()).g.setVisibility(!(viewState.a() instanceof eq10) ? 0 : 8);
        fq10 a2 = viewState.a();
        eq10 eq10Var = a2 instanceof eq10 ? (eq10) a2 : null;
        if (eq10Var != null) {
            ((j161) getBinding()).d.render(new eal(eq10Var.a(), false, null, 6));
        }
        ((j161) getBinding()).e.setVisibility(viewState.a() instanceof dq10 ? 0 : 8);
        fq10 a3 = viewState.a();
        dq10 dq10Var = a3 instanceof dq10 ? (dq10) a3 : null;
        if (dq10Var != null) {
            ((j161) getBinding()).e.render(dq10Var.a());
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public j161 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return j161.o(inflater, container);
    }
}
