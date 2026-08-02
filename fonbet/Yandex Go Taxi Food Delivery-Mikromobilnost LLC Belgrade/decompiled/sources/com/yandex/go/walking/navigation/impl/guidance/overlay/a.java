package com.yandex.go.walking.navigation.impl.guidance.overlay;

import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.navigation.guidance_camera.Camera;
import com.yandex.mapkit.navigation.transport.Navigation;
import com.yandex.mapkit.navigation.transport.layer.NavigationLayer;
import com.yandex.mapkit.navigation.transport.layer.NavigationLayerSettings;
import defpackage.ah00;
import defpackage.d241;
import defpackage.el00;
import defpackage.gh00;
import defpackage.h441;
import defpackage.i311;
import defpackage.j311;
import defpackage.ny61;
import defpackage.ocg;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.map_common.map.TaxiMapView;

/* loaded from: classes14.dex */
public final class a implements d241 {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // defpackage.d241
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G4(Navigation navigation, ContinuationImpl continuationImpl) {
        WalkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1 walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        TaxiMapView taxiMapView;
        Navigation navigation2;
        MapWindow mapWindow;
        Map map;
        MapWindow mapWindow2;
        Map map2;
        b bVar;
        NavigationLayer navigationLayer;
        Camera camera;
        b bVar2 = this.a;
        ah00 ah00Var = (ah00) bVar2.b;
        if (continuationImpl instanceof WalkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1) {
            walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1 = (WalkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1) continuationImpl;
            int i2 = walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.label = i2 - Integer.MIN_VALUE;
                obj = walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    TaxiMapView h = ((gh00) ah00Var).h();
                    if (h != null) {
                        kotlinx.coroutines.a.k(walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.get_context());
                        TaxiMapView h2 = ((gh00) ah00Var).h();
                        bVar2.B = (h2 == null || (mapWindow2 = h2.getMapWindow()) == null || (map2 = mapWindow2.getMap()) == null) ? false : map2.isIndoorEnabled();
                        TaxiMapView h3 = ((gh00) ah00Var).h();
                        if (h3 != null && (mapWindow = h3.getMapWindow()) != null && (map = mapWindow.getMap()) != null) {
                            map.setIndoorEnabled(true);
                        }
                        com.yandex.go.walking.navigation.impl.guidance.overlay.style.a aVar = new com.yandex.go.walking.navigation.impl.guidance.overlay.style.a((el00) ((ocg) bVar2.z.a.b).get(), h.getContext());
                        walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.L$0 = navigation;
                        walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.L$1 = h;
                        walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.label = 1;
                        Object a = aVar.a(walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1);
                        if (a != coroutineSingletons) {
                            taxiMapView = h;
                            obj = a;
                            navigation2 = navigation;
                        }
                        return coroutineSingletons;
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar = (b) walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.L$4;
                    kotlin.b.b(obj);
                    bVar.A = (NavigationLayer) obj;
                    if (!bVar2.c && (navigationLayer = bVar2.A) != null && (camera = navigationLayer.getCamera()) != null) {
                        bVar2.x.b(camera);
                    }
                    return zy11Var;
                }
                taxiMapView = (TaxiMapView) walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.L$1;
                navigation2 = (Navigation) walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.L$0;
                kotlin.b.b(obj);
                NavigationLayerSettings navigationLayerSettings = new NavigationLayerSettings();
                navigationLayerSettings.setUseLayerManoeuvres(true);
                navigationLayerSettings.setUseLayerBalloons(false);
                navigationLayerSettings.setUseLayerCursor(false);
                j311 j311Var = bVar2.y;
                MapWindow mapWindow3 = taxiMapView.getMapWindow();
                j311Var.a.getClass();
                i311 i311Var = new i311(mapWindow3, (h441) obj, navigation2, navigationLayerSettings);
                walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.L$0 = null;
                walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.L$1 = null;
                walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.L$2 = null;
                walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.L$3 = null;
                walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.L$4 = bVar2;
                walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.label = 2;
                obj = i311Var.a(walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1);
                if (obj != coroutineSingletons) {
                    bVar = bVar2;
                    bVar.A = (NavigationLayer) obj;
                    if (!bVar2.c) {
                        bVar2.x.b(camera);
                    }
                    return zy11Var;
                }
                return coroutineSingletons;
            }
        }
        walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1 = new WalkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1(this, continuationImpl);
        obj = walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        NavigationLayerSettings navigationLayerSettings2 = new NavigationLayerSettings();
        navigationLayerSettings2.setUseLayerManoeuvres(true);
        navigationLayerSettings2.setUseLayerBalloons(false);
        navigationLayerSettings2.setUseLayerCursor(false);
        j311 j311Var2 = bVar2.y;
        MapWindow mapWindow32 = taxiMapView.getMapWindow();
        j311Var2.a.getClass();
        i311 i311Var2 = new i311(mapWindow32, (h441) obj, navigation2, navigationLayerSettings2);
        walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.L$0 = null;
        walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.L$1 = null;
        walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.L$2 = null;
        walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.L$3 = null;
        walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.L$4 = bVar2;
        walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1.label = 2;
        obj = i311Var2.a(walkNavGuidanceOverlay$MvpViewImpl$showNavigationLayer$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
