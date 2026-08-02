package com.yandex.go.taxi.summary.mobilityhub.mapper;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.yandex.go.coroutines.h;
import com.yandex.go.pin.api.v2.PinV2Component;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$Animation;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$AnimationType;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$BezierRoute;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.image.ImageProvider;
import defpackage.bdc;
import defpackage.bl00;
import defpackage.c0c0;
import defpackage.f1h0;
import defpackage.gtq0;
import defpackage.hgr0;
import defpackage.i1c0;
import defpackage.mo5;
import defpackage.ny61;
import defpackage.oo5;
import defpackage.p4h0;
import defpackage.q6l0;
import defpackage.qje;
import defpackage.s8o;
import defpackage.scc;
import defpackage.tje;
import defpackage.tv20;
import defpackage.u8b1;
import defpackage.uq00;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.zzs;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.points.MapPointWithDrawableFrameLayout;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes14.dex */
public final class a {
    public final Context a;
    public final mo5 b;
    public final ru.yandex.taxi.design.utils.a c;
    public final h d;
    public final bdc e = new bdc(xng0.textOnControl);
    public final bdc f = new bdc(xng0.controlMain);
    public final Float[] g = {Float.valueOf(0.5f), Float.valueOf(0.18f)};

    public a(Context context, mo5 mo5Var, ru.yandex.taxi.design.utils.a aVar, ru.yandex.taxi.design.utils.b bVar) {
        this.a = context;
        this.b = mo5Var;
        this.c = aVar;
        this.d = new h(new MobilityHubOverlayUiStateMapper$pinComponent$1(this, bVar, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r9 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zzs zzsVar, zzs zzsVar2, ContinuationImpl continuationImpl) {
        MobilityHubOverlayUiStateMapper$mapIcons$1 mobilityHubOverlayUiStateMapper$mapIcons$1;
        int i;
        if (continuationImpl instanceof MobilityHubOverlayUiStateMapper$mapIcons$1) {
            mobilityHubOverlayUiStateMapper$mapIcons$1 = (MobilityHubOverlayUiStateMapper$mapIcons$1) continuationImpl;
            int i2 = mobilityHubOverlayUiStateMapper$mapIcons$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobilityHubOverlayUiStateMapper$mapIcons$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobilityHubOverlayUiStateMapper$mapIcons$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobilityHubOverlayUiStateMapper$mapIcons$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (zzsVar != null && zzsVar2 != null) {
                        mobilityHubOverlayUiStateMapper$mapIcons$1.L$0 = null;
                        mobilityHubOverlayUiStateMapper$mapIcons$1.L$1 = zzsVar2;
                        mobilityHubOverlayUiStateMapper$mapIcons$1.label = 1;
                        obj = b(zzsVar, mobilityHubOverlayUiStateMapper$mapIcons$1);
                    } else {
                        if (zzsVar == null) {
                            return EmptyList.a;
                        }
                        mobilityHubOverlayUiStateMapper$mapIcons$1.L$0 = null;
                        mobilityHubOverlayUiStateMapper$mapIcons$1.L$1 = null;
                        mobilityHubOverlayUiStateMapper$mapIcons$1.label = 2;
                        Object b = b(zzsVar, mobilityHubOverlayUiStateMapper$mapIcons$1);
                        if (b != obj2) {
                            return b;
                        }
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                zzsVar2 = (zzs) mobilityHubOverlayUiStateMapper$mapIcons$1.L$1;
                kotlin.b.b(obj);
                Context context = this.a;
                MapPointWithDrawableFrameLayout mapPointWithDrawableFrameLayout = new MapPointWithDrawableFrameLayout(context, gtq0.v(this.c, context, tje.u(10, context), new hgr0(0.0f, tje.w(8, context), tje.w(20, context), qje.u(context.getTheme(), xng0.effectShadowBottom)), 0, 24));
                mapPointWithDrawableFrameLayout.render(tje.y(f1h0.ic_destination_pin_two_flag_24, context), new bdc(xng0.textOnControlMinor), new bdc(xng0.controlMinor));
                xw31.r(mapPointWithDrawableFrameLayout);
                return kotlin.collections.a.o0((List) obj, new uq00(zzsVar2, new bl00(ImageProvider.fromBitmap(xw31.t(mapPointWithDrawableFrameLayout)), new IconStyle())));
            }
        }
        mobilityHubOverlayUiStateMapper$mapIcons$1 = new MobilityHubOverlayUiStateMapper$mapIcons$1(this, continuationImpl);
        Object obj3 = mobilityHubOverlayUiStateMapper$mapIcons$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobilityHubOverlayUiStateMapper$mapIcons$1.label;
        if (i != 0) {
        }
        Context context2 = this.a;
        MapPointWithDrawableFrameLayout mapPointWithDrawableFrameLayout2 = new MapPointWithDrawableFrameLayout(context2, gtq0.v(this.c, context2, tje.u(10, context2), new hgr0(0.0f, tje.w(8, context2), tje.w(20, context2), qje.u(context2.getTheme(), xng0.effectShadowBottom)), 0, 24));
        mapPointWithDrawableFrameLayout2.render(tje.y(f1h0.ic_destination_pin_two_flag_24, context2), new bdc(xng0.textOnControlMinor), new bdc(xng0.controlMinor));
        xw31.r(mapPointWithDrawableFrameLayout2);
        return kotlin.collections.a.o0((List) obj3, new uq00(zzsVar2, new bl00(ImageProvider.fromBitmap(xw31.t(mapPointWithDrawableFrameLayout2)), new IconStyle())));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(zzs zzsVar, ContinuationImpl continuationImpl) {
        MobilityHubOverlayUiStateMapper$mapSource$1 mobilityHubOverlayUiStateMapper$mapSource$1;
        int i;
        uq00 uq00Var;
        if (continuationImpl instanceof MobilityHubOverlayUiStateMapper$mapSource$1) {
            mobilityHubOverlayUiStateMapper$mapSource$1 = (MobilityHubOverlayUiStateMapper$mapSource$1) continuationImpl;
            int i2 = mobilityHubOverlayUiStateMapper$mapSource$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobilityHubOverlayUiStateMapper$mapSource$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobilityHubOverlayUiStateMapper$mapSource$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobilityHubOverlayUiStateMapper$mapSource$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    uq00 uq00Var2 = new uq00(zzsVar, new bl00(ImageProvider.fromBitmap(u8b1.g(tje.y(f1h0.route_end_point, this.a))), new IconStyle()));
                    mobilityHubOverlayUiStateMapper$mapSource$1.L$0 = zzsVar;
                    mobilityHubOverlayUiStateMapper$mapSource$1.L$1 = null;
                    mobilityHubOverlayUiStateMapper$mapSource$1.L$2 = uq00Var2;
                    mobilityHubOverlayUiStateMapper$mapSource$1.label = 1;
                    Object c = c(mobilityHubOverlayUiStateMapper$mapSource$1);
                    if (c == obj2) {
                        return obj2;
                    }
                    obj = c;
                    uq00Var = uq00Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uq00Var = (uq00) mobilityHubOverlayUiStateMapper$mapSource$1.L$2;
                    zzsVar = (zzs) mobilityHubOverlayUiStateMapper$mapSource$1.L$0;
                    kotlin.b.b(obj);
                }
                return scc.g(new uq00(zzsVar, (bl00) obj), uq00Var);
            }
        }
        mobilityHubOverlayUiStateMapper$mapSource$1 = new MobilityHubOverlayUiStateMapper$mapSource$1(this, continuationImpl);
        Object obj3 = mobilityHubOverlayUiStateMapper$mapSource$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobilityHubOverlayUiStateMapper$mapSource$1.label;
        if (i != 0) {
        }
        return scc.g(new uq00(zzsVar, (bl00) obj3), uq00Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        MobilityHubOverlayUiStateMapper$mapSourcePinImage$1 mobilityHubOverlayUiStateMapper$mapSourcePinImage$1;
        int i;
        i1c0 i1c0Var;
        SourceOnMapControl.a aVar;
        if (continuationImpl instanceof MobilityHubOverlayUiStateMapper$mapSourcePinImage$1) {
            mobilityHubOverlayUiStateMapper$mapSourcePinImage$1 = (MobilityHubOverlayUiStateMapper$mapSourcePinImage$1) continuationImpl;
            int i2 = mobilityHubOverlayUiStateMapper$mapSourcePinImage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobilityHubOverlayUiStateMapper$mapSourcePinImage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobilityHubOverlayUiStateMapper$mapSourcePinImage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobilityHubOverlayUiStateMapper$mapSourcePinImage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = p4h0.ic_mobility_source_icon;
                    Context context = this.a;
                    Drawable y = tje.y(i3, context);
                    i1c0 i1c0Var2 = new i1c0(s8o.m(this.e, context), s8o.m(this.f, context));
                    SourceOnMapControl.a aVar2 = new SourceOnMapControl.a(new c0c0(y), null, null, false, false, null, null, 2046);
                    mobilityHubOverlayUiStateMapper$mapSourcePinImage$1.L$0 = null;
                    mobilityHubOverlayUiStateMapper$mapSourcePinImage$1.L$1 = i1c0Var2;
                    mobilityHubOverlayUiStateMapper$mapSourcePinImage$1.L$2 = null;
                    mobilityHubOverlayUiStateMapper$mapSourcePinImage$1.L$3 = aVar2;
                    mobilityHubOverlayUiStateMapper$mapSourcePinImage$1.label = 1;
                    obj = this.d.a(mobilityHubOverlayUiStateMapper$mapSourcePinImage$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i1c0Var = i1c0Var2;
                    aVar = aVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = (SourceOnMapControl.a) mobilityHubOverlayUiStateMapper$mapSourcePinImage$1.L$3;
                    i1c0Var = (i1c0) mobilityHubOverlayUiStateMapper$mapSourcePinImage$1.L$1;
                    kotlin.b.b(obj);
                }
                return com.yandex.go.pin.api.v2.d.a((PinV2Component) obj, i1c0Var, PinV2Component.Position.ANCHORED, aVar);
            }
        }
        mobilityHubOverlayUiStateMapper$mapSourcePinImage$1 = new MobilityHubOverlayUiStateMapper$mapSourcePinImage$1(this, continuationImpl);
        Object obj2 = mobilityHubOverlayUiStateMapper$mapSourcePinImage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobilityHubOverlayUiStateMapper$mapSourcePinImage$1.label;
        if (i != 0) {
        }
        return com.yandex.go.pin.api.v2.d.a((PinV2Component) obj2, i1c0Var, PinV2Component.Position.ANCHORED, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(zzs zzsVar, zzs zzsVar2, ContinuationImpl continuationImpl) {
        MobilityHubOverlayUiStateMapper$mapUiState$1 mobilityHubOverlayUiStateMapper$mapUiState$1;
        int i;
        q6l0 q6l0Var;
        q6l0 c;
        if (continuationImpl instanceof MobilityHubOverlayUiStateMapper$mapUiState$1) {
            mobilityHubOverlayUiStateMapper$mapUiState$1 = (MobilityHubOverlayUiStateMapper$mapUiState$1) continuationImpl;
            int i2 = mobilityHubOverlayUiStateMapper$mapUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobilityHubOverlayUiStateMapper$mapUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobilityHubOverlayUiStateMapper$mapUiState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobilityHubOverlayUiStateMapper$mapUiState$1.label;
                q6l0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobilityHubOverlayUiStateMapper$mapUiState$1.L$0 = zzsVar;
                    mobilityHubOverlayUiStateMapper$mapUiState$1.L$1 = zzsVar2;
                    mobilityHubOverlayUiStateMapper$mapUiState$1.label = 1;
                    obj = a(zzsVar, zzsVar2, mobilityHubOverlayUiStateMapper$mapUiState$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zzsVar2 = (zzs) mobilityHubOverlayUiStateMapper$mapUiState$1.L$1;
                    zzsVar = (zzs) mobilityHubOverlayUiStateMapper$mapUiState$1.L$0;
                    kotlin.b.b(obj);
                }
                List list = (List) obj;
                if (zzsVar != null && zzsVar2 != null) {
                    c = ((oo5) this.b).c(zzsVar, zzsVar2, new MapRouteAppearance$BezierRoute(Collections.singletonList(this.g), "l:#5C5A57;d:#E8EBED", Float.valueOf(3.0f), 64, Float.valueOf(1.0f), new MapRouteAppearance$Animation(MapRouteAppearance$AnimationType.EASY_BOTH, 600L), Float.valueOf(100.0f)));
                    if (c != null && c.a.size() >= 2) {
                        q6l0Var = c;
                    }
                }
                return new tv20(list, q6l0Var);
            }
        }
        mobilityHubOverlayUiStateMapper$mapUiState$1 = new MobilityHubOverlayUiStateMapper$mapUiState$1(this, continuationImpl);
        Object obj3 = mobilityHubOverlayUiStateMapper$mapUiState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobilityHubOverlayUiStateMapper$mapUiState$1.label;
        q6l0Var = null;
        if (i != 0) {
        }
        List list2 = (List) obj3;
        if (zzsVar != null) {
            c = ((oo5) this.b).c(zzsVar, zzsVar2, new MapRouteAppearance$BezierRoute(Collections.singletonList(this.g), "l:#5C5A57;d:#E8EBED", Float.valueOf(3.0f), 64, Float.valueOf(1.0f), new MapRouteAppearance$Animation(MapRouteAppearance$AnimationType.EASY_BOTH, 600L), Float.valueOf(100.0f)));
            if (c != null) {
                q6l0Var = c;
            }
        }
        return new tv20(list2, q6l0Var);
    }
}
