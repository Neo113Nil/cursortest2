package defpackage;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.GeoObjectSelectionMetadata;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapMode;
import com.yandex.mapkit.map.MapType;
import java.util.HashMap;
import java.util.Locale;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;
import ru.yandextaxi.flutter_yandex_mapkit.ReferenceType;

/* loaded from: classes15.dex */
public final class cm00 extends k45 {
    public final eu00 b;
    public final jr7 c;
    public final z08 w;
    public final ini0 x;
    public pm5 y;
    public ba20 z;

    public cm00(ssr ssrVar, eu00 eu00Var, jr7 jr7Var, z08 z08Var, ini0 ini0Var) {
        super(ssrVar, PolicyMappingsExtension.MAP);
        this.b = eu00Var;
        this.c = jr7Var;
        this.w = z08Var;
        this.x = ini0Var;
    }

    public final Map b() {
        return ((au00) this.b.a).getMapWindow().getMap();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        Object obj = x920Var.b;
        String str = x920Var.a;
        if (str != null) {
            switch (str.hashCode()) {
                case -2137645001:
                    if (str.equals("setMapStyle")) {
                        ((ba20) da20Var).success(Boolean.valueOf(b().setMapStyle((String) obj)));
                        return;
                    }
                    break;
                case -1974085289:
                    if (str.equals("addMapObjectLayer")) {
                        String str2 = (String) obj;
                        this.x.b(str2, ReferenceType.MAP_OBJECTS_COLLECTION, b().addMapObjectLayer(str2));
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -1169278343:
                    if (str.equals("getCameraPositionFromBoundingBox")) {
                        HashMap hashMap = (HashMap) obj;
                        BoundingBox a = lyi.a((java.util.Map) hashMap.get("boundingBox"));
                        Object obj2 = hashMap.get("focusRect");
                        java.util.Map map = obj2 instanceof java.util.Map ? (java.util.Map) obj2 : null;
                        ScreenRect k = map != null ? lyi.k(map) : null;
                        Geometry fromBoundingBox = Geometry.fromBoundingBox(a);
                        if (k != null) {
                            ((ba20) da20Var).success(rsq0.b(b().cameraPosition(fromBoundingBox, k)));
                            return;
                        } else {
                            ((ba20) da20Var).success(rsq0.b(b().cameraPosition(fromBoundingBox)));
                            return;
                        }
                    }
                    break;
                case -899224198:
                    if (str.equals("setRotateGesturesEnabled")) {
                        b().setRotateGesturesEnabled(((Boolean) obj).booleanValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -858571620:
                    if (str.equals("setFastTapEnabled")) {
                        b().setFastTapEnabled(((Boolean) obj).booleanValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -756049820:
                    if (str.equals("getCameraPosition")) {
                        ((ba20) da20Var).success(rsq0.b(b().getCameraPosition()));
                        return;
                    }
                    break;
                case -716086208:
                    if (str.equals("setHdModeEnabled")) {
                        b().setHdModeEnabled(((Boolean) obj).booleanValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -654269659:
                    if (str.equals("setCameraThrottleDuration")) {
                        this.c.d.a = ((Number) obj).longValue();
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -484782499:
                    if (str.equals("setMapMode")) {
                        b().setMode(MapMode.valueOf(((String) obj).toUpperCase(Locale.ROOT)));
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -484563980:
                    if (str.equals("setMapType")) {
                        b().setMapType(MapType.valueOf(((String) obj).toUpperCase(Locale.ROOT)));
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -477006699:
                    if (str.equals("setMaxZoom")) {
                        b().getCameraBounds().setMaxZoomPreference((float) ((Double) obj).doubleValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -400775689:
                    if (str.equals("set2DMode")) {
                        b().set2DMode(((Boolean) obj).booleanValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -265215408:
                    if (str.equals("getVisibleRegion")) {
                        ((ba20) da20Var).success(rsq0.q(b().getVisibleRegion()));
                        return;
                    }
                    break;
                case -251795416:
                    if (str.equals("getVisibleRegionFromCameraPosition")) {
                        ((ba20) da20Var).success(rsq0.q(b().visibleRegion(lyi.b((java.util.Map) obj))));
                        return;
                    }
                    break;
                case -202203800:
                    if (str.equals("setNightModeEnabled")) {
                        b().setNightModeEnabled(((Boolean) obj).booleanValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -73946398:
                    if (str.equals("setDebugInfoEnabled")) {
                        b().setDebugInfoEnabled(((Boolean) obj).booleanValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -13540268:
                    if (str.equals("selectGeoObject")) {
                        java.util.Map map2 = (java.util.Map) obj;
                        if (map2 == null) {
                            b().deselectGeoObject();
                            ((ba20) da20Var).success(null);
                            return;
                        }
                        String str3 = (String) map2.get("objectId");
                        String str4 = (String) map2.get("dataSourceName");
                        String str5 = (String) map2.get("layerId");
                        Object obj3 = map2.get("groupId");
                        Number number = obj3 instanceof Number ? (Number) obj3 : null;
                        b().selectGeoObject(new GeoObjectSelectionMetadata(str3, str4, str5, number != null ? Long.valueOf(number.longValue()) : null));
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 3357649:
                    if (str.equals("move")) {
                        HashMap hashMap2 = (HashMap) obj;
                        CameraPosition b = lyi.b((java.util.Map) hashMap2.get("cameraPosition"));
                        Object obj4 = hashMap2.get("animation");
                        HashMap hashMap3 = obj4 instanceof HashMap ? (HashMap) obj4 : null;
                        boolean booleanValue = ((Boolean) hashMap2.get("waitAnimation")).booleanValue();
                        if (hashMap3 == null) {
                            b().move(b);
                            ((ba20) da20Var).success(null);
                            return;
                        }
                        Animation animation = new Animation(Animation.Type.valueOf(((String) hashMap3.get("animationType")).toUpperCase(Locale.ROOT)), (float) ((Double) hashMap3.get("durationSec")).doubleValue());
                        if (!booleanValue) {
                            b().move(b, animation, null);
                            ((ba20) da20Var).success(null);
                            return;
                        }
                        pm5 pm5Var = this.y;
                        if (pm5Var != null) {
                            ((xyz) pm5Var.b).invoke();
                        }
                        this.z = (ba20) da20Var;
                        y08 y08Var = (y08) this.w.a;
                        xyz xyzVar = new xyz(12, this);
                        ((au00) y08Var.a.a).getMapWindow().getMap().move(b, animation, new mx0(3, xyzVar));
                        this.y = new pm5(18, xyzVar);
                        return;
                    }
                    break;
                case 106600568:
                    if (str.equals("isHdModeEnabled")) {
                        ((ba20) da20Var).success(Boolean.valueOf(b().isHdModeEnabled()));
                        return;
                    }
                    break;
                case 380697644:
                    if (str.equals("setIndoorEnabled")) {
                        b().setIndoorEnabled(((Boolean) obj).booleanValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1084440783:
                    if (str.equals("resetMapStyles")) {
                        b().resetMapStyles();
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1203384420:
                    if (str.equals("isIndoorEnabled")) {
                        ((ba20) da20Var).success(Boolean.valueOf(b().isIndoorEnabled()));
                        return;
                    }
                    break;
                case 1621090136:
                    if (str.equals("setTiltGesturesEnabled")) {
                        b().setTiltGesturesEnabled(((Boolean) obj).booleanValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1655842254:
                    if (str.equals("setLiteModeEnabled")) {
                        b().setModelsEnabled(!((Boolean) obj).booleanValue());
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1881155361:
                    if (str.equals("getMaxZoom")) {
                        ((ba20) da20Var).success(Double.valueOf(b().getCameraBounds().getMaxZoom()));
                        return;
                    }
                    break;
                case 1888424299:
                    if (str.equals("cancelMove")) {
                        pm5 pm5Var2 = this.y;
                        if (pm5Var2 != null) {
                            ((xyz) pm5Var2.b).invoke();
                        }
                        this.z = null;
                        this.y = null;
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 2100953359:
                    if (str.equals("getMinZoom")) {
                        ((ba20) da20Var).success(Double.valueOf(b().getCameraBounds().getMinZoom()));
                        return;
                    }
                    break;
            }
        }
        ((ba20) da20Var).notImplemented();
    }
}
