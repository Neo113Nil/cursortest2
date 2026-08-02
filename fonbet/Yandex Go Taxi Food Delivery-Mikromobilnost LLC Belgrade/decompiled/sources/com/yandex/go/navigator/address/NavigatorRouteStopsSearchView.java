package com.yandex.go.navigator.address;

import android.view.View;
import com.yandex.go.navigator.address.NavigatorRouteStopsSearchView;
import defpackage.eph0;
import defpackage.f51;
import defpackage.i3y;
import defpackage.qu;
import defpackage.sf30;
import defpackage.sls;
import defpackage.te50;
import defpackage.tje;
import defpackage.ue50;
import defpackage.x9v0;
import defpackage.zch0;
import defpackage.zf50;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.search.view.AddressSearchView;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0003\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0014\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010!\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/yandex/go/navigator/address/NavigatorRouteStopsSearchView;", "Lru/yandex/taxi/search/view/AddressSearchView;", "Lte50;", "builder", "<init>", "(Lte50;)V", "Lzy11;", "onAttachedToWindow", "()V", "Lx9v0;", "model", "onItemSelectedLongTap", "(Lx9v0;)V", "", "getContentViewLayoutRes", "()I", "", "title", "setTitle", "(Ljava/lang/String;)V", "onDismiss", "Lte50;", "Landroid/view/View;", "bottomShadowView$delegate", "Li3y;", "getBottomShadowView", "()Landroid/view/View;", "bottomShadowView", "Lru/yandex/taxi/design/ListItemComponent;", "kotlin.jvm.PlatformType", "sourceHeader$delegate", "getSourceHeader", "()Lru/yandex/taxi/design/ListItemComponent;", "sourceHeader", "Companion", "zf50", "ue50", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavigatorRouteStopsSearchView extends AddressSearchView {
    public static final int $stable = 8;
    public static final ue50 Companion = new ue50();

    /* renamed from: bottomShadowView$delegate, reason: from kotlin metadata */
    private final i3y bottomShadowView;
    private final te50 builder;

    /* renamed from: sourceHeader$delegate, reason: from kotlin metadata */
    private final i3y sourceHeader;

    public NavigatorRouteStopsSearchView(te50 te50Var) {
        super(te50Var);
        this.builder = te50Var;
        final int i = 0;
        sls slsVar = new sls(this) { // from class: se50
            public final /* synthetic */ NavigatorRouteStopsSearchView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                View bottomShadowView_delegate$lambda$0;
                ListItemComponent sourceHeader_delegate$lambda$0;
                int i2 = i;
                NavigatorRouteStopsSearchView navigatorRouteStopsSearchView = this.b;
                switch (i2) {
                    case 0:
                        bottomShadowView_delegate$lambda$0 = NavigatorRouteStopsSearchView.bottomShadowView_delegate$lambda$0(navigatorRouteStopsSearchView);
                        return bottomShadowView_delegate$lambda$0;
                    default:
                        sourceHeader_delegate$lambda$0 = NavigatorRouteStopsSearchView.sourceHeader_delegate$lambda$0(navigatorRouteStopsSearchView);
                        return sourceHeader_delegate$lambda$0;
                }
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.bottomShadowView = kotlin.a.b(lazyThreadSafetyMode, slsVar);
        final int i2 = 1;
        this.sourceHeader = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: se50
            public final /* synthetic */ NavigatorRouteStopsSearchView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                View bottomShadowView_delegate$lambda$0;
                ListItemComponent sourceHeader_delegate$lambda$0;
                int i22 = i2;
                NavigatorRouteStopsSearchView navigatorRouteStopsSearchView = this.b;
                switch (i22) {
                    case 0:
                        bottomShadowView_delegate$lambda$0 = NavigatorRouteStopsSearchView.bottomShadowView_delegate$lambda$0(navigatorRouteStopsSearchView);
                        return bottomShadowView_delegate$lambda$0;
                    default:
                        sourceHeader_delegate$lambda$0 = NavigatorRouteStopsSearchView.sourceHeader_delegate$lambda$0(navigatorRouteStopsSearchView);
                        return sourceHeader_delegate$lambda$0;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View bottomShadowView_delegate$lambda$0(NavigatorRouteStopsSearchView navigatorRouteStopsSearchView) {
        View findViewById = navigatorRouteStopsSearchView.findViewById(zch0.bottom_shadow);
        if (findViewById == null) {
            return null;
        }
        navigatorRouteStopsSearchView.presenter.ph(findViewById);
        findViewById.setVisibility(4);
        return findViewById;
    }

    public static final te50 builder(f51 f51Var) {
        Companion.getClass();
        return new te50(f51Var);
    }

    private final View getBottomShadowView() {
        return (View) this.bottomShadowView.getValue();
    }

    private final ListItemComponent getSourceHeader() {
        return (ListItemComponent) this.sourceHeader.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ListItemComponent sourceHeader_delegate$lambda$0(NavigatorRouteStopsSearchView navigatorRouteStopsSearchView) {
        return (ListItemComponent) navigatorRouteStopsSearchView.findViewById(zch0.source_header);
    }

    @Override // ru.yandex.taxi.search.view.AddressSearchView, ru.yandex.taxi.search.view.BaseAddressSearchView
    public int getContentViewLayoutRes() {
        return eph0.destination_search_view;
    }

    @Override // ru.yandex.taxi.search.view.AddressSearchView, ru.yandex.taxi.search.view.BaseAddressSearchView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ListItemComponent sourceHeader = getSourceHeader();
        if (sourceHeader != null) {
            sourceHeader.setTitleTextSizePx(tje.u(16, sourceHeader.getContext()));
            sourceHeader.setLeadContainerClickListener(new sf30(10, this));
            sourceHeader.setSubtitleSingleLine(true);
            sourceHeader.setSubTitleEllipsizeMode(2);
        }
        suggestsViewField().setTopPadding(0);
        this.addressInputHolder.a.setOnFocusChangeListener(null);
        addShadowScrollListener(getBottomShadowView());
        String str = this.builder.B;
        if (str != null) {
            setTitle(str);
        }
    }

    @Override // ru.yandex.taxi.search.view.AddressSearchView, ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onDismiss() {
        zf50 zf50Var = this.builder.A;
        if (zf50Var != null) {
            zf50Var.a.r(new qu(9));
        }
    }

    @Override // ru.yandex.taxi.search.view.AddressSearchView, ru.yandex.taxi.search.view.BaseAddressSearchView
    public void onItemSelectedLongTap(x9v0 model) {
    }

    @Override // ru.yandex.taxi.search.view.AddressSearchView
    public void setTitle(String title) {
        ListItemComponent sourceHeader = getSourceHeader();
        if (sourceHeader != null) {
            sourceHeader.setTitle(title);
        }
    }
}
