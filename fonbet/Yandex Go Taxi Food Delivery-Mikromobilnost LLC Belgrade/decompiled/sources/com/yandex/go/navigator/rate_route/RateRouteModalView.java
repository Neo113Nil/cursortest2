package com.yandex.go.navigator.rate_route;

import android.content.Context;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.widget.NestedScrollView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.navigator.analitycs.RouteCompletionType;
import com.yandex.go.navigator.rate_route.RateRouteModalView;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.VisibleRegionUtils;
import defpackage.agc0;
import defpackage.as00;
import defpackage.bl00;
import defpackage.c230;
import defpackage.cbg0;
import defpackage.cm21;
import defpackage.cma1;
import defpackage.e230;
import defpackage.f4c0;
import defpackage.f83;
import defpackage.fi6;
import defpackage.fuh0;
import defpackage.hkg0;
import defpackage.i3y;
import defpackage.i650;
import defpackage.ii30;
import defpackage.ip11;
import defpackage.jl40;
import defpackage.js00;
import defpackage.k7i0;
import defpackage.mth;
import defpackage.n;
import defpackage.n751;
import defpackage.ny61;
import defpackage.o8l0;
import defpackage.oar;
import defpackage.ofp0;
import defpackage.op31;
import defpackage.oxe0;
import defpackage.p7i0;
import defpackage.par;
import defpackage.q8l0;
import defpackage.r7i0;
import defpackage.scc;
import defpackage.sl00;
import defpackage.t1w;
import defpackage.tje;
import defpackage.u550;
import defpackage.vl6;
import defpackage.vog0;
import defpackage.w4e0;
import defpackage.x95;
import defpackage.ya50;
import defpackage.z5h0;
import defpackage.zmh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.builders.SetBuilder;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.map_common.map.k;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.RoundedCornersFrameLayout;
import ru.yandex.taxi.widget.ShimmeringBar;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001FB%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001b\u0010\u0010J\u000f\u0010\u001c\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001c\u0010\u0010J\u000f\u0010\u001d\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001d\u0010\u0010J\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u0010J\u000f\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u0010J\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010'\u001a\u00020\u000e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002¢\u0006\u0004\b'\u0010(J%\u0010+\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002¢\u0006\u0004\b+\u0010,J'\u00101\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u001d\u00105\u001a\u00020\u000e2\f\u00104\u001a\b\u0012\u0004\u0012\u0002030$H\u0002¢\u0006\u0004\b5\u0010(J!\u00107\u001a\u0004\u0018\u00010/2\u0006\u0010*\u001a\u00020)2\u0006\u00106\u001a\u00020-H\u0002¢\u0006\u0004\b7\u00108R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00109R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010:R\u001b\u0010@\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010=\u001a\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lcom/yandex/go/navigator/rate_route/RateRouteModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lr7i0;", "Landroid/content/Context;", "context", "Lp7i0;", "presenter", "Lip11;", "typefaceDelegate", "<init>", "(Landroid/content/Context;Lp7i0;Lip11;)V", "Le230;", "insetsType", "()Le230;", "Lzy11;", "onDismissManually", "()V", "Lt1w;", "insets", "onInsetsHandled", "(Lt1w;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lr7i0;", "onAttachedToWindow", "onBackPressed", "onDetachedFromWindow", "scrollDown", "addShadowScrollListener", "Las00;", "mapState", "renderMapView", "(Las00;)V", "", "Lcom/yandex/mapkit/geometry/Point;", "routePoints", "addRoutePoints", "(Ljava/util/List;)V", "Lcom/yandex/mapkit/map/Map;", PolicyMappingsExtension.MAP, "focusOnRoute", "(Lcom/yandex/mapkit/map/Map;Ljava/util/List;)V", "Lcom/yandex/mapkit/geometry/BoundingBox;", "pointsBoundingBox", "Lcom/yandex/mapkit/map/CameraPosition;", "cameraPosition", "adjustZoom", "(Lcom/yandex/mapkit/map/Map;Lcom/yandex/mapkit/geometry/BoundingBox;Lcom/yandex/mapkit/map/CameraPosition;)V", "Lo8l0;", "requestedPoints", "addRequestedPoints", "boundingBox", "calculateCameraPosition", "(Lcom/yandex/mapkit/map/Map;Lcom/yandex/mapkit/geometry/BoundingBox;)Lcom/yandex/mapkit/map/CameraPosition;", "Lp7i0;", "Lip11;", "Lu550;", "rootLayer$delegate", "Li3y;", "getRootLayer", "()Lu550;", "rootLayer", "Lru/yandex/taxi/map_common/map/TaxiMapView;", "taxiMapView$delegate", "getTaxiMapView", "()Lru/yandex/taxi/map_common/map/TaxiMapView;", "taxiMapView", "k7i0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RateRouteModalView extends SlideableBindingModalView<r7i0> {
    public static final int $stable = 8;
    private final p7i0 presenter;

    /* renamed from: rootLayer$delegate, reason: from kotlin metadata */
    private final i3y rootLayer;

    /* renamed from: taxiMapView$delegate, reason: from kotlin metadata */
    private final i3y taxiMapView;
    private final ip11 typefaceDelegate;

    public RateRouteModalView(Context context, p7i0 p7i0Var, ip11 ip11Var) {
        super(context);
        this.presenter = p7i0Var;
        this.typefaceDelegate = ip11Var;
        hkg0 hkg0Var = new hkg0(5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.rootLayer = kotlin.a.b(lazyThreadSafetyMode, hkg0Var);
        int i = 18;
        this.taxiMapView = kotlin.a.b(lazyThreadSafetyMode, new agc0(i, context, this));
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        setDismissOnBackPressed(false);
        setDismissOnTouchOutside(false);
        final r7i0 binding = getBinding();
        binding.f.disallowParentInterceptTouchEventsOnScroll();
        NestedScrollViewAdvanced nestedScrollViewAdvanced = binding.q;
        ViewGroup.LayoutParams layoutParams = nestedScrollViewAdvanced.getLayoutParams();
        if (layoutParams == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = ofp0.c;
        nestedScrollViewAdvanced.setLayoutParams(layoutParams);
        binding.m.setOnBubbleClickListener(new vl6() { // from class: j7i0
            @Override // defpackage.vl6
            public final void c(String str, boolean z) {
                RateRouteModalView.lambda$0$1(RateRouteModalView.this, binding, str, z);
            }
        });
        binding.h.setDebounceClickListener(new oxe0(i, p7i0Var));
        addShadowScrollListener();
        binding.e.setTypeface(((zmh) ip11Var).d());
    }

    private final void addRequestedPoints(List<o8l0> requestedPoints) {
        for (o8l0 o8l0Var : requestedPoints) {
            u550 rootLayer = getRootLayer();
            Point point = o8l0Var.a;
            rootLayer.getClass();
            f4c0 f4c0Var = new f4c0(point, null, 6);
            f4c0Var.b(rootLayer);
            bl00 bl00Var = o8l0Var.b;
            IconStyle iconStyle = bl00Var.b;
            iconStyle.setAnchor(new PointF(0.5f, 0.5f));
            iconStyle.setScale(Float.valueOf(0.6f));
            f4c0Var.D(iconStyle);
            f4c0Var.y(bl00Var.a);
        }
    }

    private final void addRoutePoints(List<? extends Point> routePoints) {
        Polyline l = k.l(routePoints);
        if (l == null) {
            return;
        }
        w4e0 w4e0Var = new w4e0(l);
        w4e0Var.b(getRootLayer());
        int color = getContext().getColor(vog0.jams_free);
        int i = 0;
        for (Object obj : routePoints) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            w4e0Var.A(i, color);
            i = i2;
        }
    }

    private final void addShadowScrollListener() {
        getBinding().q.addScrollChangeListener(new x95(8, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addShadowScrollListener$lambda$0(RateRouteModalView rateRouteModalView, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        p7i0 p7i0Var = rateRouteModalView.presenter;
        tje.N(p7i0Var.Jg(), null, null, new RateRoutePresenter$onInsetsChanged$1(p7i0Var, null), 3);
    }

    private final void adjustZoom(Map map, BoundingBox pointsBoundingBox, CameraPosition cameraPosition) {
        if (ru.yandex.taxi.map.utils.a.s(pointsBoundingBox, VisibleRegionUtils.getBounds(map.getVisibleRegion()))) {
            map.move(cameraPosition, new Animation(Animation.Type.SMOOTH, 1.0f), new sl00(1));
            return;
        }
        CameraPosition cameraPosition2 = new CameraPosition(cameraPosition.getTarget(), cameraPosition.getZoom() - 0.5f, cameraPosition.getAzimuth(), cameraPosition.getTilt());
        map.move(cameraPosition2);
        adjustZoom(map, pointsBoundingBox, cameraPosition2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void adjustZoom$lambda$0(boolean z) {
    }

    private final CameraPosition calculateCameraPosition(Map map, BoundingBox boundingBox) {
        try {
            CameraPosition cameraPosition = map.cameraPosition(Geometry.fromBoundingBox(boundingBox));
            return new CameraPosition(cameraPosition.getTarget(), cameraPosition.getZoom() - 1.0f, cameraPosition.getTilt(), cameraPosition.getAzimuth());
        } catch (Exception unused) {
            return null;
        }
    }

    private final void focusOnRoute(Map map, List<? extends Point> routePoints) {
        fi6 fi6Var = new fi6();
        fi6Var.e(routePoints);
        BoundingBox g = fi6Var.g();
        CameraPosition calculateCameraPosition = calculateCameraPosition(map, g);
        if (calculateCameraPosition != null) {
            map.move(calculateCameraPosition);
            adjustZoom(map, g, calculateCameraPosition);
        }
    }

    private final u550 getRootLayer() {
        return (u550) this.rootLayer.getValue();
    }

    private final TaxiMapView getTaxiMapView() {
        return (TaxiMapView) this.taxiMapView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$1(RateRouteModalView rateRouteModalView, r7i0 r7i0Var, String str, boolean z) {
        p7i0 p7i0Var = rateRouteModalView.presenter;
        p7i0Var.getClass();
        SetBuilder setBuilder = new SetBuilder();
        r0 r0Var = p7i0Var.J;
        if (z) {
            setBuilder.addAll(((cm21) r0Var.getValue()).b);
            setBuilder.add(str);
        } else {
            Set set = ((cm21) r0Var.getValue()).b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (!jl40.l(str, (String) obj)) {
                    arrayList.add(obj);
                }
            }
            setBuilder.addAll(arrayList);
        }
        r0Var.m(null, cm21.a((cm21) r0Var.getValue(), null, setBuilder.b(), null, 5));
        if (r7i0Var.f.getVisibility() == 0) {
            return;
        }
        cma1.J(r7i0Var.f);
        rateRouteModalView.scrollDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$0$onDoneClicked(p7i0 p7i0Var) {
        i650 i650Var = p7i0Var.A.a;
        i650Var.a.a("navigation.route_complete.route_feedback.submit", n.u(i650Var), 1, new HashMap());
        p7i0Var.Kg();
        par parVar = p7i0Var.B;
        oar oarVar = parVar.c;
        oarVar.a = 0;
        oarVar.b = 0.0d;
        parVar.d.clear();
        parVar.f = 0L;
        parVar.b.q(0L, "NAVIGATOR_ROUTE_STATS_START_TIME");
        parVar.e = "";
        ((e) p7i0Var.x.b).r(new cbg0(17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderMapView(as00 mapState) {
        RateRouteModalView rateRouteModalView;
        List list = mapState.a;
        List list2 = mapState.e;
        List list3 = list2;
        if (list3 == null || list3.isEmpty()) {
            cma1.L(getBinding().k);
            return;
        }
        getBinding().o.setText(mapState.b);
        getBinding().s.setText(mapState.c);
        getBinding().b.setText(mapState.d);
        js00 js00Var = mapState.f;
        if (getBinding().j.getChildCount() == 0) {
            getBinding().j.addView(getTaxiMapView());
        }
        if (jl40.l(getTaxiMapView().getMapStyleConfig(), js00Var)) {
            rateRouteModalView = this;
        } else {
            TaxiMapView taxiMapView = getTaxiMapView();
            taxiMapView.setMapStyleConfig(js00Var);
            taxiMapView.applyMapStyle(js00Var.b);
            taxiMapView.forceDriveMode();
            getRootLayer().m();
            rateRouteModalView = this;
            taxiMapView.getMapWindow().getMap().setMapReadyCallback(new f83(rateRouteModalView, list, list2, taxiMapView, 10));
        }
        cma1.J(rateRouteModalView.getBinding().k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderMapView$lambda$0$0(RateRouteModalView rateRouteModalView, List list, List list2, TaxiMapView taxiMapView) {
        rateRouteModalView.addRequestedPoints(list);
        rateRouteModalView.addRoutePoints(list2);
        rateRouteModalView.focusOnRoute(taxiMapView.getMapWindow().getMap(), list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u550 rootLayer_delegate$lambda$0() {
        return new u550();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollDown() {
        OneShotPreDrawListener.add(this, new ii30(18, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaxiMapView taxiMapView_delegate$lambda$0(Context context, RateRouteModalView rateRouteModalView) {
        TaxiMapView taxiMapView = new TaxiMapView(context, null, 0, 6, null);
        taxiMapView.setEnabled(false);
        rateRouteModalView.getRootLayer().l(taxiMapView.getMapWindow().getMap().getMapObjects());
        return taxiMapView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public r7i0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(fuh0.rate_route_view, parent, false);
        int i = z5h0.average_speed_title;
        if (((RobotoTextView) cma1.O(i, inflate)) != null) {
            i = z5h0.average_speed_value;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView != null) {
                i = z5h0.bottom_container;
                GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, inflate);
                if (goFrameLayout != null) {
                    i = z5h0.center_subtitle;
                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView2 != null) {
                        i = z5h0.center_subtitle_shimmer;
                        if (((ShimmeringBar) cma1.O(i, inflate)) != null) {
                            i = z5h0.center_title;
                            RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i, inflate);
                            if (robotoTextView3 != null) {
                                i = z5h0.center_title_shimmer;
                                if (((ShimmeringBar) cma1.O(i, inflate)) != null) {
                                    i = z5h0.comment_view;
                                    ListItemInputComponent listItemInputComponent = (ListItemInputComponent) cma1.O(i, inflate);
                                    if (listItemInputComponent != null) {
                                        i = z5h0.content;
                                        Group group = (Group) cma1.O(i, inflate);
                                        if (group != null) {
                                            i = z5h0.done;
                                            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                                            if (buttonComponent != null) {
                                                i = z5h0.icons_container;
                                                GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, inflate);
                                                if (goLinearLayout != null) {
                                                    i = z5h0.icons_container_barrier;
                                                    if (((Barrier) cma1.O(i, inflate)) != null) {
                                                        i = z5h0.map_barrier;
                                                        if (((Barrier) cma1.O(i, inflate)) != null) {
                                                            i = z5h0.map_shimmer;
                                                            if (((ShimmeringBar) cma1.O(i, inflate)) != null) {
                                                                i = z5h0.map_view;
                                                                RoundedCornersFrameLayout roundedCornersFrameLayout = (RoundedCornersFrameLayout) cma1.O(i, inflate);
                                                                if (roundedCornersFrameLayout != null) {
                                                                    i = z5h0.map_view_container;
                                                                    GoConstraintLayout goConstraintLayout = (GoConstraintLayout) cma1.O(i, inflate);
                                                                    if (goConstraintLayout != null) {
                                                                        i = z5h0.rate_title_text;
                                                                        RobotoTextView robotoTextView4 = (RobotoTextView) cma1.O(i, inflate);
                                                                        if (robotoTextView4 != null) {
                                                                            i = z5h0.rating_reason;
                                                                            RatingReasonsView ratingReasonsView = (RatingReasonsView) cma1.O(i, inflate);
                                                                            if (ratingReasonsView != null) {
                                                                                i = z5h0.rating_subtitle_text;
                                                                                RobotoTextView robotoTextView5 = (RobotoTextView) cma1.O(i, inflate);
                                                                                if (robotoTextView5 != null) {
                                                                                    i = z5h0.route_title;
                                                                                    if (((RobotoTextView) cma1.O(i, inflate)) != null) {
                                                                                        i = z5h0.route_value;
                                                                                        RobotoTextView robotoTextView6 = (RobotoTextView) cma1.O(i, inflate);
                                                                                        if (robotoTextView6 != null) {
                                                                                            i = z5h0.scroll_child;
                                                                                            GoConstraintLayout goConstraintLayout2 = (GoConstraintLayout) cma1.O(i, inflate);
                                                                                            if (goConstraintLayout2 != null) {
                                                                                                i = z5h0.scroll_view;
                                                                                                NestedScrollViewAdvanced nestedScrollViewAdvanced = (NestedScrollViewAdvanced) cma1.O(i, inflate);
                                                                                                if (nestedScrollViewAdvanced != null) {
                                                                                                    i = z5h0.shimmer_icon_1;
                                                                                                    if (((ShimmeringBar) cma1.O(i, inflate)) != null) {
                                                                                                        i = z5h0.shimmer_icon_2;
                                                                                                        if (((ShimmeringBar) cma1.O(i, inflate)) != null) {
                                                                                                            i = z5h0.shimmers;
                                                                                                            Group group2 = (Group) cma1.O(i, inflate);
                                                                                                            if (group2 != null) {
                                                                                                                i = z5h0.subtitle_shimmer;
                                                                                                                if (((ShimmeringBar) cma1.O(i, inflate)) != null) {
                                                                                                                    i = z5h0.time_title;
                                                                                                                    if (((RobotoTextView) cma1.O(i, inflate)) != null) {
                                                                                                                        i = z5h0.time_value;
                                                                                                                        RobotoTextView robotoTextView7 = (RobotoTextView) cma1.O(i, inflate);
                                                                                                                        if (robotoTextView7 != null) {
                                                                                                                            i = z5h0.title_shimmer;
                                                                                                                            if (((ShimmeringBar) cma1.O(i, inflate)) != null) {
                                                                                                                                return new r7i0((GoLinearLayout) inflate, robotoTextView, goFrameLayout, robotoTextView2, robotoTextView3, listItemInputComponent, group, buttonComponent, goLinearLayout, roundedCornersFrameLayout, goConstraintLayout, robotoTextView4, ratingReasonsView, robotoTextView5, robotoTextView6, goConstraintLayout2, nestedScrollViewAdvanced, group2, robotoTextView7);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        p7i0 p7i0Var = this.presenter;
        k7i0 k7i0Var = new k7i0(this);
        p7i0Var.Bg(k7i0Var);
        k7i0Var.render(q8l0.a);
        ya50 ya50Var = p7i0Var.A;
        RouteCompletionType routeCompletionType = p7i0Var.y;
        i650 i650Var = ya50Var.a;
        String value = routeCompletionType.getValue();
        HashMap u = n.u(i650Var);
        if (value != null) {
            u.put("route_completion_type", value);
        }
        i650Var.a.a("navigation.route_complete.show", u, 1, new HashMap());
        tje.N(p7i0Var.Jg(), null, null, new RateRoutePresenter$attachView$$inlined$safeCollectIn$1(new o(new mth(kotlinx.coroutines.flow.e.m(p7i0Var.F.b, p7i0Var.E.a(), p7i0Var.J, p7i0Var.I.a(), new RateRoutePresenter$attachView$1(p7i0Var, tje.h(p7i0Var.Jg(), null, null, new RateRoutePresenter$attachView$streetAddressDeferred$1(p7i0Var, null), 3), null)), 6), new RateRoutePresenter$attachView$2(p7i0Var, null)), null, k7i0Var), 3);
        p7i0 p7i0Var2 = this.presenter;
        p7i0Var2.K = tje.N(p7i0Var2.Jg(), null, null, new RateRoutePresenter$setTextValueFlow$$inlined$safeCollectIn$1(getBinding().f.textValueFlow(), null, p7i0Var2), 3);
        requestApplyInsets();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        p7i0 p7i0Var = this.presenter;
        p7i0Var.Kg();
        par parVar = p7i0Var.B;
        oar oarVar = parVar.c;
        oarVar.a = 0;
        oarVar.b = 0.0d;
        parVar.d.clear();
        parVar.f = 0L;
        parVar.b.q(0L, "NAVIGATOR_ROUTE_STATS_START_TIME");
        parVar.e = "";
        ((e) p7i0Var.x.b).r(new cbg0(17));
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        super.onDismissManually();
        this.presenter.Kg();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onInsetsHandled(t1w insets) {
        super.onInsetsHandled(insets);
        p7i0 p7i0Var = this.presenter;
        tje.N(p7i0Var.Jg(), null, null, new RateRoutePresenter$onInsetsChanged$1(p7i0Var, null), 3);
        ListItemInputComponent listItemInputComponent = getBinding().f;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        n751 a = op31.a(listItemInputComponent);
        if (a == null ? false : a.a.q(8)) {
            scrollDown();
        }
    }
}
