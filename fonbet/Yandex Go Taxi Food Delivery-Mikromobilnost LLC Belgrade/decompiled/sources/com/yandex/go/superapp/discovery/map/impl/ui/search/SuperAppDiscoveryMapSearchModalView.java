package com.yandex.go.superapp.discovery.map.impl.ui.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.Constants;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.superapp.discovery.map.impl.analytics.generated.SuperMapAnalytics$SuperMapSearchActionType;
import com.yandex.go.superapp.discovery.map.impl.analytics.generated.SuperMapAnalytics$SuperMapSearchType;
import com.yandex.go.superapp.discovery.map.impl.ui.base.SuperAppDiscoveryMapLifecycleAwareModalView;
import com.yandex.go.superapp.discovery.map.impl.ui.search.SuperAppDiscoveryMapSearchModalView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.axv0;
import defpackage.b0b;
import defpackage.bxv0;
import defpackage.c230;
import defpackage.ca1;
import defpackage.cma1;
import defpackage.co40;
import defpackage.cxv0;
import defpackage.czo0;
import defpackage.dab1;
import defpackage.duv0;
import defpackage.exv0;
import defpackage.f1h0;
import defpackage.fxv0;
import defpackage.g0c;
import defpackage.gxv0;
import defpackage.h2b1;
import defpackage.hbp0;
import defpackage.he7;
import defpackage.i3y;
import defpackage.i8h0;
import defpackage.ike;
import defpackage.ixv0;
import defpackage.jl40;
import defpackage.jxv0;
import defpackage.lse;
import defpackage.n2v0;
import defpackage.nxv0;
import defpackage.ny61;
import defpackage.omu0;
import defpackage.pjv0;
import defpackage.puv0;
import defpackage.px6;
import defpackage.qoi0;
import defpackage.qu;
import defpackage.ru8;
import defpackage.scc;
import defpackage.skh0;
import defpackage.sls;
import defpackage.stv0;
import defpackage.sug0;
import defpackage.swv0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uwv0;
import defpackage.uy;
import defpackage.vmu0;
import defpackage.vvv0;
import defpackage.vwv0;
import defpackage.w511;
import defpackage.wls;
import defpackage.xw31;
import defpackage.y5e;
import defpackage.ycm0;
import defpackage.ygs;
import defpackage.ywv0;
import defpackage.z2v0;
import defpackage.zxs;
import defpackage.zy11;
import java.util.HashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.utils.e;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u0093\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007*\u0001J\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001OB7\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020%H\u0014¢\u0006\u0004\b+\u0010'J\u000f\u0010,\u001a\u00020%H\u0014¢\u0006\u0004\b,\u0010'J\u0017\u0010/\u001a\u00020%2\u0006\u0010.\u001a\u00020-H\u0017¢\u0006\u0004\b/\u00100J\u001f\u00104\u001a\u00020\u00182\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u000201H\u0014¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u00020\u00182\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u000201H\u0014¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u00020\"H\u0002¢\u0006\u0004\b7\u0010$J\u000f\u00108\u001a\u00020\u0018H\u0002¢\u0006\u0004\b8\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010=R\u001b\u0010A\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010*R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020(8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bM\u0010*¨\u0006P"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/ui/search/SuperAppDiscoveryMapSearchModalView;", "Lpuv0;", "Lcom/yandex/go/superapp/discovery/map/impl/ui/base/SuperAppDiscoveryMapLifecycleAwareModalView;", "Lvwv0;", "Lru/yandex/taxi/widget/utils/e;", "mediaInfoConverter", "Ltt2;", "appDispatchers", "Landroid/content/Context;", "activityContext", "Lcom/yandex/go/superapp/discovery/map/impl/ui/search/f;", "presenter", "Lvvv0;", "openAnimationType", "<init>", "(Lru/yandex/taxi/widget/utils/e;Ltt2;Landroid/content/Context;Lcom/yandex/go/superapp/discovery/map/impl/ui/search/f;Lvvv0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lvwv0;", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lzy11;", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "onBackPressed", "Lc230;", "insetsType", "()Lc230;", "", "screenName", "()Ljava/lang/String;", "", "canHandleScreenTracking", "()Z", "", "getTopPadding", "()I", "isArrowsPermanentlyHidden", "isApplyShadow", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Ljava/lang/Runnable;", "startAction", "endAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "animateDismiss", "getUserInput", "processRecyclerViewScrollState", "Landroid/content/Context;", "Lcom/yandex/go/superapp/discovery/map/impl/ui/search/f;", "getPresenter", "()Lcom/yandex/go/superapp/discovery/map/impl/ui/search/f;", "Lvvv0;", "searchHeaderPx$delegate", "Li3y;", "getSearchHeaderPx", "searchHeaderPx", "Lhbp0;", "scopeDelegate", "Lhbp0;", "isHideInputShadow", "Z", "Luwv0;", "adapter", "Luwv0;", "gxv0", "scrollListener", "Lgxv0;", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "exv0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperAppDiscoveryMapSearchModalView extends SuperAppDiscoveryMapLifecycleAwareModalView<vwv0> implements puv0 {
    private final Context activityContext;
    private final uwv0 adapter;
    private boolean isHideInputShadow;
    private final vvv0 openAnimationType;
    private final f presenter;
    private final hbp0 scopeDelegate;
    private final gxv0 scrollListener;

    /* renamed from: searchHeaderPx$delegate, reason: from kotlin metadata */
    private final i3y searchHeaderPx;

    /* JADX WARN: Multi-variable type inference failed */
    public SuperAppDiscoveryMapSearchModalView(final ru.yandex.taxi.widget.utils.e eVar, final tt2 tt2Var, Context context, f fVar, vvv0 vvv0Var) {
        super(context);
        this.activityContext = context;
        this.presenter = fVar;
        this.openAnimationType = vvv0Var;
        final int i = 0;
        this.searchHeaderPx = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls(this) { // from class: dxv0
            public final /* synthetic */ SuperAppDiscoveryMapSearchModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int searchHeaderPx_delegate$lambda$0;
                zy11 _init_$lambda$0;
                zy11 _init_$lambda$1;
                int i2 = i;
                SuperAppDiscoveryMapSearchModalView superAppDiscoveryMapSearchModalView = this.b;
                switch (i2) {
                    case 0:
                        searchHeaderPx_delegate$lambda$0 = SuperAppDiscoveryMapSearchModalView.searchHeaderPx_delegate$lambda$0(superAppDiscoveryMapSearchModalView);
                        return Integer.valueOf(searchHeaderPx_delegate$lambda$0);
                    case 1:
                        _init_$lambda$0 = SuperAppDiscoveryMapSearchModalView._init_$lambda$0(superAppDiscoveryMapSearchModalView);
                        return _init_$lambda$0;
                    default:
                        _init_$lambda$1 = SuperAppDiscoveryMapSearchModalView._init_$lambda$1(superAppDiscoveryMapSearchModalView);
                        return _init_$lambda$1;
                }
            }
        });
        final hbp0 hbp0Var = new hbp0(new czo0(14), "SearchModalView", new ru8(lse.a, 7));
        this.scopeDelegate = hbp0Var;
        final int i2 = 2;
        n2v0 n2v0Var = new n2v0(i2, this);
        final fxv0 fxv0Var = new fxv0(fVar);
        int i3 = com.yandex.go.superapp.discovery.map.impl.ui.search.viewholder.a.b0;
        g0c a = qoi0.a(bxv0.class);
        z2v0 z2v0Var = new z2v0(context, i2);
        ycm0 ycm0Var = new ycm0(eVar, hbp0Var, n2v0Var, tt2Var, 6);
        Class a2 = a.a();
        final int i4 = 1;
        he7 he7Var = new he7(i4, ycm0Var);
        EmptyList emptyList = EmptyList.a;
        zxs zxsVar = new zxs(a2, 0, z2v0Var, emptyList, he7Var, null);
        int i5 = b0b.e0;
        g0c a3 = qoi0.a(cxv0.class);
        zxs zxsVar2 = new zxs(a3.a(), 0, null, emptyList, null, new pjv0(i4));
        int i6 = com.yandex.go.superapp.discovery.map.impl.ui.search.viewholder.d.c0;
        g0c a4 = qoi0.a(jxv0.class);
        zxs zxsVar3 = new zxs(a4.a(), 0, null, emptyList, null, new wls() { // from class: com.yandex.go.superapp.discovery.map.impl.ui.search.viewholder.c
            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                View inflate = ((LayoutInflater) obj).inflate(skh0.super_app_discovery_map_search_organization_no_items_container, (ViewGroup) obj2, false);
                int i7 = i8h0.search_organization_no_items_button;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i7, inflate);
                if (buttonComponent != null) {
                    i7 = i8h0.search_organization_no_items_icon;
                    GoImageView goImageView = (GoImageView) cma1.O(i7, inflate);
                    if (goImageView != null) {
                        i7 = i8h0.search_organization_no_items_subtitle;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i7, inflate);
                        if (robotoTextView != null) {
                            i7 = i8h0.search_organization_no_items_title;
                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i7, inflate);
                            if (robotoTextView2 != null) {
                                return new d(new nxv0(goImageView, (GoLinearLayout) inflate, buttonComponent, robotoTextView, robotoTextView2), e.this, hbp0Var, tt2Var, new SuperAppDiscoveryMapSearchNoItemsViewHolder$Companion$itemType$1$1(1, fxv0Var, fxv0.class, "onClick", "onClick(Lcom/yandex/go/superapp/discovery/map/impl/ui/search/viewholder/SuperAppDiscoveryMapSearchActionType;)V", 0));
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i7)));
                return null;
            }
        });
        int i7 = ca1.g0;
        g0c a5 = qoi0.a(duv0.class);
        this.adapter = new uwv0(scc.g(zxsVar, zxsVar2, zxsVar3, new zxs(a5.a(), 0, new z2v0(context, i4), emptyList, new he7(i4, new omu0(26)), null)));
        this.scrollListener = new gxv0(this);
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        ru.yandex.taxi.design.utils.c.z(new sls(this) { // from class: dxv0
            public final /* synthetic */ SuperAppDiscoveryMapSearchModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int searchHeaderPx_delegate$lambda$0;
                zy11 _init_$lambda$0;
                zy11 _init_$lambda$1;
                int i22 = i4;
                SuperAppDiscoveryMapSearchModalView superAppDiscoveryMapSearchModalView = this.b;
                switch (i22) {
                    case 0:
                        searchHeaderPx_delegate$lambda$0 = SuperAppDiscoveryMapSearchModalView.searchHeaderPx_delegate$lambda$0(superAppDiscoveryMapSearchModalView);
                        return Integer.valueOf(searchHeaderPx_delegate$lambda$0);
                    case 1:
                        _init_$lambda$0 = SuperAppDiscoveryMapSearchModalView._init_$lambda$0(superAppDiscoveryMapSearchModalView);
                        return _init_$lambda$0;
                    default:
                        _init_$lambda$1 = SuperAppDiscoveryMapSearchModalView._init_$lambda$1(superAppDiscoveryMapSearchModalView);
                        return _init_$lambda$1;
                }
            }
        }, ((vwv0) getBinding()).b);
        ru.yandex.taxi.design.utils.c.z(new sls(this) { // from class: dxv0
            public final /* synthetic */ SuperAppDiscoveryMapSearchModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int searchHeaderPx_delegate$lambda$0;
                zy11 _init_$lambda$0;
                zy11 _init_$lambda$1;
                int i22 = i2;
                SuperAppDiscoveryMapSearchModalView superAppDiscoveryMapSearchModalView = this.b;
                switch (i22) {
                    case 0:
                        searchHeaderPx_delegate$lambda$0 = SuperAppDiscoveryMapSearchModalView.searchHeaderPx_delegate$lambda$0(superAppDiscoveryMapSearchModalView);
                        return Integer.valueOf(searchHeaderPx_delegate$lambda$0);
                    case 1:
                        _init_$lambda$0 = SuperAppDiscoveryMapSearchModalView._init_$lambda$0(superAppDiscoveryMapSearchModalView);
                        return _init_$lambda$0;
                    default:
                        _init_$lambda$1 = SuperAppDiscoveryMapSearchModalView._init_$lambda$1(superAppDiscoveryMapSearchModalView);
                        return _init_$lambda$1;
                }
            }
        }, ((vwv0) getBinding()).c.b);
        ((vwv0) getBinding()).e.getInput().setOnClickListener(new vmu0(3, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(SuperAppDiscoveryMapSearchModalView superAppDiscoveryMapSearchModalView) {
        f fVar = superAppDiscoveryMapSearchModalView.presenter;
        String userInput = superAppDiscoveryMapSearchModalView.getUserInput();
        ((ygs) fVar.x.a).r(new qu(9));
        stv0 stv0Var = fVar.F;
        stv0Var.getClass();
        stv0Var.c(SuperMapAnalytics$SuperMapSearchActionType.Back, userInput);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$1(SuperAppDiscoveryMapSearchModalView superAppDiscoveryMapSearchModalView) {
        com.yandex.go.superapp.discovery.map.impl.ui.search.data.repositories.c cVar = superAppDiscoveryMapSearchModalView.presenter.C;
        ywv0 ywv0Var = cVar.e;
        if (ywv0Var != null) {
            cVar.f.g(ywv0Var);
            stv0 stv0Var = cVar.b;
            String a = ywv0Var.a();
            co40 co40Var = stv0Var.b;
            SuperMapAnalytics$SuperMapSearchType a2 = stv0.a(a);
            co40Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("type", a2.getEventValue());
            if (a != null) {
                hashMap.put("search_query", a);
            }
            co40Var.a.a("SuperMap.Search.RetryTapped", hashMap, 1, new HashMap());
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(SuperAppDiscoveryMapSearchModalView superAppDiscoveryMapSearchModalView, View view) {
        f fVar = superAppDiscoveryMapSearchModalView.presenter;
        String userInput = superAppDiscoveryMapSearchModalView.getUserInput();
        stv0 stv0Var = fVar.F;
        stv0Var.getClass();
        stv0Var.c(SuperMapAnalytics$SuperMapSearchActionType.Search, userInput);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ vwv0 access$getBinding(SuperAppDiscoveryMapSearchModalView superAppDiscoveryMapSearchModalView) {
        return (vwv0) superAppDiscoveryMapSearchModalView.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void adapter$lambda$0(SuperAppDiscoveryMapSearchModalView superAppDiscoveryMapSearchModalView, bxv0 bxv0Var) {
        f fVar = superAppDiscoveryMapSearchModalView.presenter;
        String userInput = superAppDiscoveryMapSearchModalView.getUserInput();
        stv0 stv0Var = fVar.F;
        swv0 swv0Var = bxv0Var.d;
        stv0Var.a.getClass();
        axv0 a = uy.a(swv0Var);
        if (a != null) {
            co40 co40Var = stv0Var.b;
            SuperMapAnalytics$SuperMapSearchType a2 = stv0.a(userInput);
            SuperMapAnalytics$SuperMapSearchActionType superMapAnalytics$SuperMapSearchActionType = a.a;
            String str = a.b;
            String str2 = a.c;
            String str3 = a.d;
            String str4 = a.e;
            String str5 = a.f;
            String str6 = a.g;
            List list = a.h;
            String str7 = a.i;
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put("type", superMapAnalytics$SuperMapSearchActionType.getEventValue());
            if (str != null) {
                mapBuilder.put(Constants.DEEPLINK, str);
            }
            if (str2 != null) {
                mapBuilder.put("oid", str2);
            }
            if (str3 != null) {
                mapBuilder.put(LaunchBrowserActivity.KEY_URI, str3);
            }
            if (str4 != null) {
                mapBuilder.put("query", str4);
            }
            if (str5 != null) {
                mapBuilder.put("stop_id", str5);
            }
            if (str6 != null) {
                mapBuilder.put("stop_name", str6);
            }
            if (list != null) {
                mapBuilder.put("position", list);
            }
            if (str7 != null) {
                mapBuilder.put("line_id", str7);
            }
            MapBuilder j = mapBuilder.j();
            co40Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("type", a2.getEventValue());
            hashMap.put("action", j);
            if (userInput != null) {
                hashMap.put("search_query", userInput);
            }
            co40Var.a.a("SuperMap.Search.Tapped", hashMap, 1, new HashMap());
        }
        fVar.Kg(bxv0Var.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSearchHeaderPx() {
        return ((Number) this.searchHeaderPx.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String getUserInput() {
        return String.valueOf(((vwv0) getBinding()).e.getInput().getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void processRecyclerViewScrollState() {
        boolean canScrollVertically = ((vwv0) getBinding()).f.canScrollVertically(-1);
        boolean z = this.isHideInputShadow;
        if (canScrollVertically) {
            if (z) {
                cma1.J(((vwv0) getBinding()).d);
                this.isHideInputShadow = false;
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        cma1.M(((vwv0) getBinding()).d);
        this.isHideInputShadow = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int searchHeaderPx_delegate$lambda$0(SuperAppDiscoveryMapSearchModalView superAppDiscoveryMapSearchModalView) {
        return ru.yandex.taxi.design.utils.c.d(sug0.super_app_discovery_map_organizations_search_header, superAppDiscoveryMapSearchModalView);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        vvv0 vvv0Var = this.openAnimationType;
        if (jl40.l(vvv0Var, dab1.R)) {
            y5e.c(this, startAction, endAction, null, 8);
            animateDismissBackground();
        } else if (jl40.l(vvv0Var, h2b1.S)) {
            super.animateDismiss(startAction, endAction);
        } else {
            w511.b();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable startAction, Runnable endAction) {
        vvv0 vvv0Var = this.openAnimationType;
        if (jl40.l(vvv0Var, dab1.R)) {
            y5e.d(this, startAction, endAction, null, 8);
            animateShowBackground(200L);
        } else if (jl40.l(vvv0Var, h2b1.S)) {
            super.animateShow(startAction, endAction);
        } else {
            w511.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        ((vwv0) getBinding()).f.setAdapter(this.adapter);
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public vwv0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View inflate = inflater.inflate(skh0.super_app_discovery_map_search_card_modal_view, parent, false);
        int i = i8h0.back_button;
        GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
        if (goImageView != null && (O = cma1.O((i = i8h0.error_loading_container), inflate)) != null) {
            int i2 = i8h0.error_icon;
            if (((GoImageView) cma1.O(i2, O)) != null) {
                LinearLayout linearLayout = (LinearLayout) O;
                int i3 = i8h0.error_subtitle;
                if (((RobotoTextView) cma1.O(i3, O)) != null) {
                    i3 = i8h0.error_title;
                    if (((RobotoTextView) cma1.O(i3, O)) != null) {
                        px6 px6Var = new px6(linearLayout, 6);
                        i = i8h0.header_container;
                        if (((GoLinearLayout) cma1.O(i, inflate)) != null) {
                            i = i8h0.input_bottom_shadow;
                            GoView goView = (GoView) cma1.O(i, inflate);
                            if (goView != null) {
                                i = i8h0.input_component;
                                ListItemInputComponent listItemInputComponent = (ListItemInputComponent) cma1.O(i, inflate);
                                if (listItemInputComponent != null) {
                                    i = i8h0.organization_item_search_list;
                                    RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                                    if (recyclerView != null) {
                                        return new vwv0((GoConstraintLayout) inflate, goImageView, px6Var, goView, listItemInputComponent, recyclerView);
                                    }
                                }
                            }
                        }
                    }
                }
                i2 = i3;
            }
            ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i2)));
            return null;
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public boolean canHandleScreenTracking() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return tje.r(sug0.super_app_discovery_map_organizations_search_header_radius, getContext());
    }

    public final f getPresenter() {
        return this.presenter;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        return this.topSystemWindowInset;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(4);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isApplyShadow */
    public boolean getIsCollapsable() {
        return false;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getRouteSummaryIsVisible() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.superapp.discovery.map.impl.ui.base.SuperAppDiscoveryMapLifecycleAwareModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f fVar = this.presenter;
        exv0 exv0Var = new exv0(this);
        fVar.Bg(exv0Var);
        exv0Var.y(fVar.y, false);
        fVar.C.a((ike) fVar.Jg(), kotlinx.coroutines.flow.e.t(new c(access$getBinding(this).e.textValueFlow())), new SuperAppDiscoveryMapSearchPresenter$attachView$1(1, exv0Var, ixv0.class, "render", "render(Ljava/lang/Object;)V", 0), new SuperAppDiscoveryMapSearchPresenter$attachView$2(1, exv0Var, ixv0.class, "setInputText", "setInputText(Ljava/lang/CharSequence;Z)V", 0), fVar.y);
        tje.N(fVar.Jg(), null, null, new SuperAppDiscoveryMapSearchPresenter$attachView$$inlined$safeCollectIn$1(new e(fVar.B.a(), fVar), null, exv0Var), 3);
        this.scopeDelegate.a();
        ((vwv0) getBinding()).f.setLayoutManager(new LinearLayoutManager(this.activityContext));
        ((vwv0) getBinding()).f.setAdapter(this.adapter);
        ((vwv0) getBinding()).f.addOnScrollListener(this.scrollListener);
        ((vwv0) getBinding()).e.setTrailImage(f1h0.ic_cross_m_text_main_24);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        f fVar = this.presenter;
        String userInput = getUserInput();
        stv0 stv0Var = fVar.F;
        stv0Var.getClass();
        stv0Var.c(SuperMapAnalytics$SuperMapSearchActionType.Back, userInput);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.go.superapp.discovery.map.impl.ui.base.SuperAppDiscoveryMapLifecycleAwareModalView, ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((vwv0) getBinding()).f.removeOnScrollListener(this.scrollListener);
        ((vwv0) getBinding()).f.setAdapter(null);
        this.scopeDelegate.b();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.o(getRootView(), getCardContentView(), event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "SearchModalView";
    }
}
