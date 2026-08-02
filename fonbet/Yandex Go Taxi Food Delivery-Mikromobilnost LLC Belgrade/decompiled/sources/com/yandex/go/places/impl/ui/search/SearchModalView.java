package com.yandex.go.places.impl.ui.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.places.base.ui.modals.BasePlacesModalView;
import com.yandex.go.places.impl.ui.search.SearchModalView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.arm0;
import defpackage.b0b;
import defpackage.bvp0;
import defpackage.bz20;
import defpackage.c230;
import defpackage.c2x0;
import defpackage.ca1;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.czo0;
import defpackage.dug0;
import defpackage.eaj0;
import defpackage.evp0;
import defpackage.f1h0;
import defpackage.g0c;
import defpackage.gtp0;
import defpackage.hbp0;
import defpackage.he7;
import defpackage.htp0;
import defpackage.i3y;
import defpackage.ier;
import defpackage.ii30;
import defpackage.ike;
import defpackage.jl40;
import defpackage.kup0;
import defpackage.l76;
import defpackage.lj1;
import defpackage.lse;
import defpackage.lup0;
import defpackage.lx4;
import defpackage.mmp0;
import defpackage.ny61;
import defpackage.o3v;
import defpackage.o6h0;
import defpackage.ovp0;
import defpackage.pgk0;
import defpackage.px6;
import defpackage.qoi0;
import defpackage.qu;
import defpackage.r;
import defpackage.ru8;
import defpackage.scc;
import defpackage.sls;
import defpackage.tje;
import defpackage.tt2;
import defpackage.u370;
import defpackage.uuh0;
import defpackage.vvb1;
import defpackage.w511;
import defpackage.wbc0;
import defpackage.wls;
import defpackage.wtp0;
import defpackage.xd2;
import defpackage.xup0;
import defpackage.xvq;
import defpackage.y5e;
import defpackage.ycm0;
import defpackage.yup0;
import defpackage.zup0;
import defpackage.zxs;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\u0099\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007*\u0001O\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001TB?\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001dH\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u001dH\u0014¢\u0006\u0004\b-\u0010,J\u0017\u00100\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u001dH\u0014¢\u0006\u0004\b2\u0010,J\u000f\u00103\u001a\u00020\u001dH\u0016¢\u0006\u0004\b3\u0010,J\u000f\u00104\u001a\u00020\u001dH\u0016¢\u0006\u0004\b4\u0010,J\u001f\u00108\u001a\u00020\u001d2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u000205H\u0014¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020\u001d2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u000205H\u0014¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u00020\u001dH\u0002¢\u0006\u0004\b;\u0010,J\u000f\u0010<\u001a\u00020\u001dH\u0002¢\u0006\u0004\b<\u0010,J\u000f\u0010=\u001a\u00020\u001dH\u0002¢\u0006\u0004\b=\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010>R\u001a\u0010\r\u001a\u00020\f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010BR\u001b\u0010F\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010!R\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020\u001b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bR\u0010!¨\u0006U"}, d2 = {"Lcom/yandex/go/places/impl/ui/search/SearchModalView;", "Lcom/yandex/go/places/base/ui/modals/BasePlacesModalView;", "Lhtp0;", "Lo3v;", "Lru/yandex/taxi/widget/utils/e;", "mediaInfoConverter", "Ltt2;", "appDispatchers", "Lc2x0;", "systemBarsCoordinator", "Landroid/content/Context;", "activityContext", "Lcom/yandex/go/places/impl/ui/search/f;", "presenter", "Lu370;", "openAnimationType", "<init>", "(Lru/yandex/taxi/widget/utils/e;Ltt2;Lc2x0;Landroid/content/Context;Lcom/yandex/go/places/impl/ui/search/f;Lu370;)V", "Lc230;", "insetsType", "()Lc230;", "", "screenName", "()Ljava/lang/String;", "Landroid/view/View;", "getCardContainer", "()Landroid/view/View;", "", "newState", "Lzy11;", "onBottomSheetStateChanged", "(I)V", "getTopPadding", "()I", "", "isArrowsPermanentlyHidden", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lhtp0;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onBackPressed", "onHide", "onShow", "Ljava/lang/Runnable;", "startAction", "endAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "animateDismiss", "processRecyclerViewScrollState", "showKeyboard", "hideKeyboard", "Landroid/content/Context;", "Lcom/yandex/go/places/impl/ui/search/f;", "getPresenter", "()Lcom/yandex/go/places/impl/ui/search/f;", "Lu370;", "searchHeaderPx$delegate", "Li3y;", "getSearchHeaderPx", "searchHeaderPx", "Lhbp0;", "scopeDelegate", "Lhbp0;", "isHideInputShadow", "Z", "Lgtp0;", "adapter", "Lgtp0;", "zup0", "scrollListener", "Lzup0;", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "xup0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchModalView extends BasePlacesModalView<htp0> implements o3v {
    public static final int $stable = 8;
    private final Context activityContext;
    private final gtp0 adapter;
    private boolean isHideInputShadow;
    private final u370 openAnimationType;
    private final f presenter;
    private final hbp0 scopeDelegate;
    private final zup0 scrollListener;

    /* renamed from: searchHeaderPx$delegate, reason: from kotlin metadata */
    private final i3y searchHeaderPx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchModalView(final ru.yandex.taxi.widget.utils.e eVar, final tt2 tt2Var, c2x0 c2x0Var, Context context, f fVar, u370 u370Var) {
        super(context, new bz20(true), c2x0Var, fVar);
        final int i = 1;
        this.activityContext = context;
        this.presenter = fVar;
        this.openAnimationType = u370Var;
        final int i2 = 0;
        this.searchHeaderPx = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls(this) { // from class: wup0
            public final /* synthetic */ SearchModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int searchHeaderPx_delegate$lambda$0;
                zy11 _init_$lambda$0;
                zy11 _init_$lambda$1;
                int i3 = i2;
                SearchModalView searchModalView = this.b;
                switch (i3) {
                    case 0:
                        searchHeaderPx_delegate$lambda$0 = SearchModalView.searchHeaderPx_delegate$lambda$0(searchModalView);
                        return Integer.valueOf(searchHeaderPx_delegate$lambda$0);
                    case 1:
                        _init_$lambda$0 = SearchModalView._init_$lambda$0(searchModalView);
                        return _init_$lambda$0;
                    default:
                        _init_$lambda$1 = SearchModalView._init_$lambda$1(searchModalView);
                        return _init_$lambda$1;
                }
            }
        });
        final hbp0 hbp0Var = new hbp0(new czo0(14), "SearchModalView", new ru8(lse.a, 6));
        this.scopeDelegate = hbp0Var;
        Context context2 = getContext();
        pgk0 pgk0Var = new pgk0(16, this);
        final yup0 yup0Var = new yup0(getPresenter());
        int i3 = com.yandex.go.places.impl.ui.search.viewholder.a.b0;
        g0c a = qoi0.a(kup0.class);
        lj1 lj1Var = new lj1(context2, 27);
        ycm0 ycm0Var = new ycm0(eVar, hbp0Var, pgk0Var, tt2Var, 3);
        Class a2 = a.a();
        he7 he7Var = new he7(i, ycm0Var);
        EmptyList emptyList = EmptyList.a;
        zxs zxsVar = new zxs(a2, 0, lj1Var, emptyList, he7Var, null);
        int i4 = b0b.e0;
        g0c a3 = qoi0.a(lup0.class);
        zxs zxsVar2 = new zxs(a3.a(), 0, null, emptyList, null, new arm0(17));
        int i5 = com.yandex.go.places.impl.ui.search.viewholder.d.c0;
        g0c a4 = qoi0.a(evp0.class);
        zxs zxsVar3 = new zxs(a4.a(), 0, null, emptyList, null, new wls() { // from class: com.yandex.go.places.impl.ui.search.viewholder.c
            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                View inflate = ((LayoutInflater) obj).inflate(uuh0.search_organization_no_items_container, (ViewGroup) obj2, false);
                int i6 = o6h0.search_organization_no_items_button;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i6, inflate);
                if (buttonComponent != null) {
                    i6 = o6h0.search_organization_no_items_icon;
                    GoImageView goImageView = (GoImageView) cma1.O(i6, inflate);
                    if (goImageView != null) {
                        i6 = o6h0.search_organization_no_items_subtitle;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i6, inflate);
                        if (robotoTextView != null) {
                            i6 = o6h0.search_organization_no_items_title;
                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i6, inflate);
                            if (robotoTextView2 != null) {
                                return new d(new ovp0(goImageView, (GoLinearLayout) inflate, buttonComponent, robotoTextView, robotoTextView2), e.this, hbp0Var, tt2Var, new SearchNoItemsViewHolder$Companion$itemType$1$1(1, yup0Var, yup0.class, "onClick", "onClick(Lcom/yandex/go/places/impl/ui/search/viewholder/SearchActionType;)V", 0));
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                return null;
            }
        });
        int i6 = ca1.g0;
        g0c a5 = qoi0.a(ier.class);
        this.adapter = new gtp0(scc.g(zxsVar, zxsVar2, zxsVar3, new zxs(a5.a(), 0, new lj1(context2, 13), emptyList, new he7(i, new xvq(7)), null)));
        this.scrollListener = new zup0(this);
        ru.yandex.taxi.design.utils.c.z(new sls(this) { // from class: wup0
            public final /* synthetic */ SearchModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int searchHeaderPx_delegate$lambda$0;
                zy11 _init_$lambda$0;
                zy11 _init_$lambda$1;
                int i32 = i;
                SearchModalView searchModalView = this.b;
                switch (i32) {
                    case 0:
                        searchHeaderPx_delegate$lambda$0 = SearchModalView.searchHeaderPx_delegate$lambda$0(searchModalView);
                        return Integer.valueOf(searchHeaderPx_delegate$lambda$0);
                    case 1:
                        _init_$lambda$0 = SearchModalView._init_$lambda$0(searchModalView);
                        return _init_$lambda$0;
                    default:
                        _init_$lambda$1 = SearchModalView._init_$lambda$1(searchModalView);
                        return _init_$lambda$1;
                }
            }
        }, ((htp0) getBinding()).b);
        final int i7 = 2;
        ru.yandex.taxi.design.utils.c.z(new sls(this) { // from class: wup0
            public final /* synthetic */ SearchModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int searchHeaderPx_delegate$lambda$0;
                zy11 _init_$lambda$0;
                zy11 _init_$lambda$1;
                int i32 = i7;
                SearchModalView searchModalView = this.b;
                switch (i32) {
                    case 0:
                        searchHeaderPx_delegate$lambda$0 = SearchModalView.searchHeaderPx_delegate$lambda$0(searchModalView);
                        return Integer.valueOf(searchHeaderPx_delegate$lambda$0);
                    case 1:
                        _init_$lambda$0 = SearchModalView._init_$lambda$0(searchModalView);
                        return _init_$lambda$0;
                    default:
                        _init_$lambda$1 = SearchModalView._init_$lambda$1(searchModalView);
                        return _init_$lambda$1;
                }
            }
        }, ((htp0) getBinding()).c.b);
        ((htp0) getBinding()).e.getInput().setOnClickListener(new eaj0(10, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 _init_$lambda$0(SearchModalView searchModalView) {
        f presenter = searchModalView.getPresenter();
        String valueOf = String.valueOf(((htp0) searchModalView.getBinding()).e.getInput().getText());
        presenter.x.a.r(new qu(9));
        com.yandex.go.places.impl.analytics.a aVar = presenter.F;
        aVar.getClass();
        aVar.k(new r(com.yandex.go.places.impl.analytics.a.n(valueOf), valueOf, 10), "Discovery.PlacesSearch.Tapped");
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$1(SearchModalView searchModalView) {
        com.yandex.go.places.impl.ui.search.data.repositories.c cVar = searchModalView.getPresenter().E;
        wtp0 wtp0Var = cVar.e;
        if (wtp0Var != null) {
            cVar.f.g(wtp0Var);
            com.yandex.go.places.impl.analytics.a aVar = cVar.b;
            String a = wtp0Var.a();
            aVar.getClass();
            String n = com.yandex.go.places.impl.analytics.a.n(a);
            i d = ((j) ((lx4) aVar.a)).d("Discovery.PlacesSearch.RetryTapped");
            d.d("type", n);
            d.d("search_query", a);
            d.d("source", ((wbc0) aVar.b).a().a());
            d.m();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$2(SearchModalView searchModalView, View view) {
        f presenter = searchModalView.getPresenter();
        String valueOf = String.valueOf(((htp0) searchModalView.getBinding()).e.getInput().getText());
        com.yandex.go.places.impl.analytics.a aVar = presenter.F;
        aVar.getClass();
        aVar.k(new r(com.yandex.go.places.impl.analytics.a.n(valueOf), valueOf, 11), "Discovery.PlacesSearch.Tapped");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ htp0 access$getBinding(SearchModalView searchModalView) {
        return (htp0) searchModalView.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSearchHeaderPx() {
        return ((Number) this.searchHeaderPx.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void hideKeyboard() {
        ListItemInputComponent listItemInputComponent = ((htp0) getBinding()).e;
        listItemInputComponent.post(new ce0(listItemInputComponent, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void processRecyclerViewScrollState() {
        boolean canScrollVertically = ((htp0) getBinding()).f.canScrollVertically(-1);
        boolean z = this.isHideInputShadow;
        if (canScrollVertically) {
            if (z) {
                cma1.J(((htp0) getBinding()).d);
                this.isHideInputShadow = false;
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        cma1.M(((htp0) getBinding()).d);
        this.isHideInputShadow = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int searchHeaderPx_delegate$lambda$0(SearchModalView searchModalView) {
        return ru.yandex.taxi.design.utils.c.d(dug0.discovery_organizations_search_header, searchModalView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void showKeyboard() {
        ((htp0) getBinding()).e.post(new mmp0(3, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showKeyboard$lambda$0(SearchModalView searchModalView) {
        ListItemInputComponent listItemInputComponent = ((htp0) searchModalView.getBinding()).e;
        listItemInputComponent.getInput().requestFocus();
        listItemInputComponent.post(new xd2(listItemInputComponent, 1));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        u370 u370Var = this.openAnimationType;
        if (jl40.l(u370Var, l76.I)) {
            y5e.c(this, startAction, endAction, null, 8);
            animateDismissBackground();
        } else if (jl40.l(u370Var, vvb1.H)) {
            super.animateDismiss(startAction, endAction);
        } else {
            w511.b();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable startAction, Runnable endAction) {
        u370 u370Var = this.openAnimationType;
        if (jl40.l(u370Var, l76.I)) {
            y5e.d(this, startAction, endAction, null, 8);
            animateShowBackground(200L);
        } else if (jl40.l(u370Var, vvb1.H)) {
            super.animateShow(startAction, endAction);
        } else {
            w511.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        ((htp0) getBinding()).f.setAdapter(this.adapter);
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public htp0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View inflate = inflater.inflate(uuh0.search_card_modal_view, parent, false);
        int i = o6h0.back_button;
        GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
        if (goImageView != null && (O = cma1.O((i = o6h0.error_loading_container), inflate)) != null) {
            px6 o = px6.o(O);
            i = o6h0.header_container;
            if (((GoLinearLayout) cma1.O(i, inflate)) != null) {
                i = o6h0.input_bottom_shadow;
                GoView goView = (GoView) cma1.O(i, inflate);
                if (goView != null) {
                    i = o6h0.input_component;
                    ListItemInputComponent listItemInputComponent = (ListItemInputComponent) cma1.O(i, inflate);
                    if (listItemInputComponent != null) {
                        i = o6h0.organization_item_search_list;
                        RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                        if (recyclerView != null) {
                            return new htp0((GoConstraintLayout) inflate, goImageView, o, goView, listItemInputComponent, recyclerView);
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public View getCardContainer() {
        return ((htp0) getBinding()).a;
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return tje.r(dug0.discovery_organizations_search_header_radius, getContext());
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        return this.topSystemWindowInset;
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(4);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getRouteSummaryIsVisible() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f presenter = getPresenter();
        xup0 xup0Var = new xup0(this);
        presenter.Bg(xup0Var);
        xup0Var.y(presenter.y, false);
        presenter.E.a((ike) presenter.Jg(), kotlinx.coroutines.flow.e.t(new c(access$getBinding(this).e.textValueFlow())), new SearchPresenter$attachView$1(1, xup0Var, bvp0.class, "render", "render(Ljava/lang/Object;)V", 0), new SearchPresenter$attachView$2(1, xup0Var, bvp0.class, "setInputText", "setInputText(Ljava/lang/CharSequence;Z)V", 0), presenter.y);
        tje.N(presenter.Jg(), null, null, new SearchPresenter$attachView$$inlined$safeCollectIn$1(new e(presenter.D.a(), presenter), null, xup0Var), 3);
        this.scopeDelegate.a();
        ((htp0) getBinding()).f.setLayoutManager(new LinearLayoutManager(this.activityContext));
        ((htp0) getBinding()).f.setAdapter(this.adapter);
        ((htp0) getBinding()).f.addOnScrollListener(this.scrollListener);
        ((htp0) getBinding()).e.setTrailImage(f1h0.ic_cross_m_text_main_24);
        OneShotPreDrawListener.add(((htp0) getBinding()).e, new ii30(28, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        f presenter = getPresenter();
        String valueOf = String.valueOf(((htp0) getBinding()).e.getInput().getText());
        com.yandex.go.places.impl.analytics.a aVar = presenter.F;
        aVar.getClass();
        aVar.k(new r(com.yandex.go.places.impl.analytics.a.n(valueOf), valueOf, 10), "Discovery.PlacesSearch.Tapped");
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public void onBottomSheetStateChanged(int newState) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((htp0) getBinding()).f.removeOnScrollListener(this.scrollListener);
        ((htp0) getBinding()).f.setAdapter(null);
        this.scopeDelegate.b();
    }

    @Override // defpackage.o3v
    public void onHide() {
        hideKeyboard();
    }

    @Override // defpackage.o3v
    public void onShow() {
        showKeyboard();
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView, ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "SearchModalView";
    }

    @Override // com.yandex.go.places.base.ui.modals.BasePlacesModalView
    public f getPresenter() {
        return this.presenter;
    }
}
