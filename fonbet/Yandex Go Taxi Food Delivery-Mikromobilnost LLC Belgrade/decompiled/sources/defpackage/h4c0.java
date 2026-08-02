package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.PlacemarkAnimation;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.map.TextStyle;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import com.yandex.runtime.image.AnimatedImageProvider;
import defpackage.tls;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandextaxi.flutter_yandex_mapkit.ReferenceType;
import ru.yandextaxi.flutter_yandex_mapkit.styles.models.PlacemarkStyleData;

/* loaded from: classes7.dex */
public final class h4c0 extends k45 implements j070 {
    public final ssr b;
    public final ini0 c;
    public final eu00 w;
    public final hdu x;

    public h4c0(ssr ssrVar, ini0 ini0Var, eu00 eu00Var, hdu hduVar) {
        super(ssrVar, "placemark_map_objects");
        this.b = ssrVar;
        this.c = ini0Var;
        this.w = eu00Var;
        this.x = hduVar;
    }

    public final PlacemarkMapObject b(String str) {
        PlacemarkMapObject placemarkMapObject = (PlacemarkMapObject) this.c.d(str, ReferenceType.MAP_OBJECT);
        if (placemarkMapObject == null || !placemarkMapObject.isValid()) {
            return null;
        }
        return placemarkMapObject;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        PlacemarkAnimation useAnimation;
        PlacemarkAnimation useAnimation2;
        TextStyle.Placement placement;
        PlacemarkAnimation useAnimation3;
        PlacemarkAnimation useAnimation4;
        Object obj = x920Var.b;
        String str = x920Var.a;
        if (str != null) {
            int hashCode = str.hashCode();
            ssr ssrVar = this.b;
            ini0 ini0Var = this.c;
            Double d = null;
            switch (hashCode) {
                case -1876181313:
                    if (str.equals("animatedSetGeometryPoint")) {
                        LinkedHashMap linkedHashMap = g4c0.a;
                        HashMap hashMap = obj instanceof HashMap ? (HashMap) obj : null;
                        if (hashMap == null) {
                            ny61.g("Required value was null.");
                            return;
                        }
                        Object obj2 = hashMap.get("duration");
                        Number number = obj2 instanceof Number ? (Number) obj2 : null;
                        long longValue = number != null ? number.longValue() : d4c0.a;
                        Object obj3 = hashMap.get(Constants.KEY_DATA);
                        HashMap hashMap2 = obj3 instanceof HashMap ? (HashMap) obj3 : null;
                        if (hashMap2 != null) {
                            for (Map.Entry entry : hashMap2.entrySet()) {
                                String str2 = (String) entry.getKey();
                                Object value = entry.getValue();
                                final PlacemarkMapObject placemarkMapObject = (PlacemarkMapObject) ini0Var.c(str2, ReferenceType.MAP_OBJECT);
                                Map map = (Map) value;
                                Object obj4 = map.get("lat");
                                Double d2 = obj4 instanceof Double ? (Double) obj4 : d;
                                Object obj5 = map.get("lon");
                                Double d3 = obj5 instanceof Double ? (Double) obj5 : d;
                                if (d2 == null) {
                                    ny61.g("Required value was null.");
                                    return;
                                }
                                if (d3 == null) {
                                    ny61.g("Required value was null.");
                                    return;
                                }
                                final Point point = new Point(d2.doubleValue(), d3.doubleValue());
                                final my30 my30Var = new my30(str2, 28);
                                LinearInterpolator linearInterpolator = d4c0.b;
                                final ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                final double latitude = placemarkMapObject.getGeometry().getLatitude();
                                final double longitude = placemarkMapObject.getGeometry().getLongitude();
                                ofFloat.setDuration(longValue);
                                ofFloat.setInterpolator(linearInterpolator);
                                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: e4c0
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        PlacemarkMapObject placemarkMapObject2 = PlacemarkMapObject.this;
                                        if (!placemarkMapObject2.isValid()) {
                                            ofFloat.cancel();
                                            return;
                                        }
                                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        double d4 = 1.0f - floatValue;
                                        double d5 = latitude * d4;
                                        Point point2 = point;
                                        double d6 = floatValue;
                                        placemarkMapObject2.setGeometry(new Point((point2.getLatitude() * d6) + d5, (point2.getLongitude() * d6) + (longitude * d4)));
                                    }
                                });
                                ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.yandextaxi.flutter_yandex_mapkit.helper.PlacemarkMapObjectAnimatorKt$animateGeometryTo$$inlined$doOnEnd$1
                                    @Override // android.animation.Animator.AnimatorListener
                                    public void onAnimationCancel(Animator animator) {
                                    }

                                    @Override // android.animation.Animator.AnimatorListener
                                    public void onAnimationEnd(Animator animator) {
                                        tls.this.invoke(ofFloat);
                                    }

                                    @Override // android.animation.Animator.AnimatorListener
                                    public void onAnimationRepeat(Animator animator) {
                                    }

                                    @Override // android.animation.Animator.AnimatorListener
                                    public void onAnimationStart(Animator animator) {
                                    }
                                });
                                ofFloat.start();
                                LinkedHashMap linkedHashMap2 = g4c0.a;
                                if (!linkedHashMap2.containsKey(str2)) {
                                    linkedHashMap2.put(str2, new ArrayList());
                                }
                                ((List) linkedHashMap2.get(str2)).add(ofFloat);
                                d = null;
                            }
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -1296995794:
                    if (str.equals("pauseAnimation")) {
                        List list = obj instanceof List ? (List) obj : null;
                        if (list == null) {
                            ny61.g("Required value was null.");
                            return;
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            PlacemarkMapObject b = b((String) it.next());
                            if (b != null && (useAnimation = b.useAnimation()) != null) {
                                useAnimation.pause();
                            }
                        }
                        return;
                    }
                    break;
                case -1086432640:
                    if (str.equals("animatedSetDirection")) {
                        LinkedHashMap linkedHashMap3 = g4c0.a;
                        HashMap hashMap3 = obj instanceof HashMap ? (HashMap) obj : null;
                        if (hashMap3 == null) {
                            ny61.g("Required value was null.");
                            return;
                        }
                        Object obj6 = hashMap3.get("duration");
                        Number number2 = obj6 instanceof Number ? (Number) obj6 : null;
                        long longValue2 = number2 != null ? number2.longValue() : d4c0.a;
                        Object obj7 = hashMap3.get(Constants.KEY_DATA);
                        HashMap hashMap4 = obj7 instanceof HashMap ? (HashMap) obj7 : null;
                        if (hashMap4 != null) {
                            for (Map.Entry entry2 : hashMap4.entrySet()) {
                                String str3 = (String) entry2.getKey();
                                Object value2 = entry2.getValue();
                                PlacemarkMapObject placemarkMapObject2 = (PlacemarkMapObject) ini0Var.c(str3, ReferenceType.MAP_OBJECT);
                                Double d4 = value2 instanceof Double ? (Double) value2 : null;
                                Float valueOf = d4 != null ? Float.valueOf((float) d4.doubleValue()) : null;
                                if (valueOf == null) {
                                    ny61.g("Required value was null.");
                                    return;
                                }
                                float floatValue = valueOf.floatValue();
                                final my30 my30Var2 = new my30(str3, 29);
                                LinearInterpolator linearInterpolator2 = d4c0.b;
                                placemarkMapObject2.setDirection(placemarkMapObject2.getDirection() % 360.0f);
                                float f = floatValue % 360.0f;
                                if (f > placemarkMapObject2.getDirection() + 180.0f) {
                                    f -= 360.0f;
                                } else if (f < placemarkMapObject2.getDirection() - 180.0f) {
                                    f += 360.0f;
                                }
                                final ValueAnimator ofFloat2 = ValueAnimator.ofFloat(placemarkMapObject2.getDirection(), f);
                                ofFloat2.setDuration(longValue2);
                                ofFloat2.setInterpolator(linearInterpolator2);
                                ofFloat2.addUpdateListener(new vf2(11, placemarkMapObject2, ofFloat2));
                                ofFloat2.addListener(new Animator.AnimatorListener() { // from class: ru.yandextaxi.flutter_yandex_mapkit.helper.PlacemarkMapObjectAnimatorKt$animateDirectionTo$$inlined$doOnEnd$1
                                    @Override // android.animation.Animator.AnimatorListener
                                    public void onAnimationCancel(Animator animator) {
                                    }

                                    @Override // android.animation.Animator.AnimatorListener
                                    public void onAnimationEnd(Animator animator) {
                                        tls.this.invoke(ofFloat2);
                                    }

                                    @Override // android.animation.Animator.AnimatorListener
                                    public void onAnimationRepeat(Animator animator) {
                                    }

                                    @Override // android.animation.Animator.AnimatorListener
                                    public void onAnimationStart(Animator animator) {
                                    }
                                });
                                ofFloat2.start();
                                LinkedHashMap linkedHashMap4 = g4c0.a;
                                if (!linkedHashMap4.containsKey(str3)) {
                                    linkedHashMap4.put(str3, new ArrayList());
                                }
                                ((List) linkedHashMap4.get(str3)).add(ofFloat2);
                            }
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -893184606:
                    if (str.equals("stopAnimation")) {
                        List list2 = obj instanceof List ? (List) obj : null;
                        if (list2 == null) {
                            ny61.g("Required value was null.");
                            return;
                        }
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            PlacemarkMapObject b2 = b((String) it2.next());
                            if (b2 != null && (useAnimation2 = b2.useAnimation()) != null) {
                                useAnimation2.stop();
                            }
                        }
                        return;
                    }
                    break;
                case -719915268:
                    if (str.equals("setGeometryPoint")) {
                        HashMap hashMap5 = obj instanceof HashMap ? (HashMap) obj : null;
                        if (hashMap5 == null) {
                            ny61.g("Required value was null.");
                            return;
                        }
                        for (Map.Entry entry3 : hashMap5.entrySet()) {
                            PlacemarkMapObject b3 = b((String) entry3.getKey());
                            if (b3 != null) {
                                Map map2 = (Map) entry3.getValue();
                                Object obj8 = map2.get("lat");
                                Double d5 = obj8 instanceof Double ? (Double) obj8 : null;
                                Object obj9 = map2.get("lon");
                                Double d6 = obj9 instanceof Double ? (Double) obj9 : null;
                                if (d5 == null) {
                                    ny61.g("Required value was null.");
                                    return;
                                } else {
                                    if (d6 == null) {
                                        ny61.g("Required value was null.");
                                        return;
                                    }
                                    b3.setGeometry(new Point(d5.doubleValue(), d6.doubleValue()));
                                }
                            }
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -709566914:
                    if (str.equals("setAnimatedIcon")) {
                        HashMap hashMap6 = obj instanceof HashMap ? (HashMap) obj : null;
                        if (hashMap6 == null) {
                            ny61.g("Required value was null.");
                            return;
                        }
                        for (Map.Entry entry4 : hashMap6.entrySet()) {
                            PlacemarkMapObject b4 = b((String) entry4.getKey());
                            if (b4 != null) {
                                Object value3 = entry4.getValue();
                                String str4 = value3 instanceof String ? (String) value3 : null;
                                if (str4 == null) {
                                    ny61.g("Required value was null.");
                                    return;
                                }
                                b4.useAnimation().setIcon(AnimatedImageProvider.fromAsset(ssrVar.a, ((psr) ssrVar.f.a).c(str4)), new IconStyle());
                            }
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -583367149:
                    if (str.equals("setAnimatedIconStyle")) {
                        HashMap hashMap7 = obj instanceof HashMap ? (HashMap) obj : null;
                        if (hashMap7 == null) {
                            ny61.g("Required value was null.");
                            return;
                        }
                        for (Map.Entry entry5 : hashMap7.entrySet()) {
                            PlacemarkMapObject b5 = b((String) entry5.getKey());
                            if (b5 != null) {
                                b5.useAnimation().setIconStyle(lyi.c((Map) entry5.getValue()));
                            }
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 137889398:
                    if (str.equals("setIconStyle")) {
                        HashMap hashMap8 = obj instanceof HashMap ? (HashMap) obj : null;
                        if (hashMap8 == null) {
                            ny61.g("Required value was null.");
                            return;
                        }
                        for (Map.Entry entry6 : hashMap8.entrySet()) {
                            PlacemarkMapObject b6 = b((String) entry6.getKey());
                            if (b6 != null) {
                                b6.setIconStyle(lyi.c((Map) entry6.getValue()));
                            }
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 412598636:
                    if (str.equals("setModels")) {
                        HashMap hashMap9 = obj instanceof HashMap ? (HashMap) obj : null;
                        if (hashMap9 == null) {
                            ny61.g("Required value was null.");
                            return;
                        }
                        for (Map.Entry entry7 : hashMap9.entrySet()) {
                            PlacemarkMapObject b7 = b((String) entry7.getKey());
                            if (b7 != null) {
                                float scaleFactor = ((au00) this.w.a).getMapWindow().getScaleFactor();
                                Map map3 = (Map) entry7.getValue();
                                u3u u3uVar = (u3u) w3u.a.getValue();
                                PlacemarkStyleData.PlacemarkStyle placemarkStyle = (PlacemarkStyleData.PlacemarkStyle) u3uVar.a(u3uVar.k(map3), PlacemarkStyleData.PlacemarkStyle.class);
                                if (placemarkStyle != null) {
                                    placemarkStyle.a(ssrVar, scaleFactor, new lbb0(2, b7), new i4b0(15, b7));
                                }
                            }
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 490753602:
                    if (str.equals("setTextStyle")) {
                        HashMap hashMap10 = obj instanceof HashMap ? (HashMap) obj : null;
                        if (hashMap10 == null) {
                            ny61.g("Required value was null.");
                            return;
                        }
                        for (Map.Entry entry8 : hashMap10.entrySet()) {
                            PlacemarkMapObject b8 = b((String) entry8.getKey());
                            if (b8 != null) {
                                Map map4 = (Map) entry8.getValue();
                                Object obj10 = map4.get("size");
                                Double d7 = obj10 instanceof Double ? (Double) obj10 : null;
                                float doubleValue = d7 != null ? (float) d7.doubleValue() : 8.0f;
                                Object obj11 = map4.get("color");
                                Number number3 = obj11 instanceof Number ? (Number) obj11 : null;
                                int intValue = number3 != null ? number3.intValue() : ModalContentViewContainer.BASE_SHADOW_COLOR;
                                Object obj12 = map4.get("outlineWidth");
                                Double d8 = obj12 instanceof Double ? (Double) obj12 : null;
                                float doubleValue2 = d8 != null ? (float) d8.doubleValue() : 1.0f;
                                Object obj13 = map4.get("outlineColor");
                                Number number4 = obj13 instanceof Number ? (Number) obj13 : null;
                                int intValue2 = number4 != null ? number4.intValue() : -1;
                                Object obj14 = map4.get("placement");
                                String str5 = obj14 instanceof String ? (String) obj14 : null;
                                if (str5 == null) {
                                    str5 = "center";
                                }
                                switch (str5.hashCode()) {
                                    case -1682792238:
                                        if (str5.equals("bottomLeft")) {
                                            placement = TextStyle.Placement.BOTTOM_LEFT;
                                            break;
                                        }
                                        break;
                                    case -1383228885:
                                        if (str5.equals("bottom")) {
                                            placement = TextStyle.Placement.BOTTOM;
                                            break;
                                        }
                                        break;
                                    case -1364013995:
                                        if (str5.equals("center")) {
                                            placement = TextStyle.Placement.CENTER;
                                            break;
                                        }
                                        break;
                                    case -1140120836:
                                        if (str5.equals("topLeft")) {
                                            placement = TextStyle.Placement.TOP_LEFT;
                                            break;
                                        }
                                        break;
                                    case -978346553:
                                        if (str5.equals("topRight")) {
                                            placement = TextStyle.Placement.TOP_RIGHT;
                                            break;
                                        }
                                        break;
                                    case -621290831:
                                        if (str5.equals("bottomRight")) {
                                            placement = TextStyle.Placement.BOTTOM_RIGHT;
                                            break;
                                        }
                                        break;
                                    case 115029:
                                        if (str5.equals("top")) {
                                            placement = TextStyle.Placement.TOP;
                                            break;
                                        }
                                        break;
                                    case 3317767:
                                        if (str5.equals("left")) {
                                            placement = TextStyle.Placement.LEFT;
                                            break;
                                        }
                                        break;
                                    case 108511772:
                                        if (str5.equals("right")) {
                                            placement = TextStyle.Placement.RIGHT;
                                            break;
                                        }
                                        break;
                                }
                                placement = TextStyle.Placement.CENTER;
                                TextStyle.Placement placement2 = placement;
                                Object obj15 = map4.get("offset");
                                Double d9 = obj15 instanceof Double ? (Double) obj15 : null;
                                float doubleValue3 = d9 != null ? (float) d9.doubleValue() : 0.0f;
                                Object obj16 = map4.get("offsetFromIcon");
                                Boolean bool = obj16 instanceof Boolean ? (Boolean) obj16 : null;
                                boolean booleanValue = bool != null ? bool.booleanValue() : true;
                                Object obj17 = map4.get("textOptional");
                                Boolean bool2 = obj17 instanceof Boolean ? (Boolean) obj17 : null;
                                b8.setTextStyle(new TextStyle(doubleValue, intValue, doubleValue2, intValue2, placement2, doubleValue3, booleanValue, bool2 != null ? bool2.booleanValue() : false));
                            }
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 576796989:
                    if (str.equals("setDirection")) {
                        HashMap hashMap11 = obj instanceof HashMap ? (HashMap) obj : null;
                        if (hashMap11 == null) {
                            ny61.g("Required value was null.");
                            return;
                        }
                        for (Map.Entry entry9 : hashMap11.entrySet()) {
                            PlacemarkMapObject b9 = b((String) entry9.getKey());
                            if (b9 != null) {
                                Object value4 = entry9.getValue();
                                Double d10 = value4 instanceof Double ? (Double) value4 : null;
                                Float valueOf2 = d10 != null ? Float.valueOf((float) d10.doubleValue()) : null;
                                if (valueOf2 == null) {
                                    ny61.g("Required value was null.");
                                    return;
                                }
                                b9.setDirection(valueOf2.floatValue());
                            }
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 764778076:
                    if (str.equals("unsubscribeCursorLocation")) {
                        return;
                    }
                    break;
                case 868223664:
                    if (str.equals("playAnimation")) {
                        List list3 = obj instanceof List ? (List) obj : null;
                        if (list3 == null) {
                            ny61.g("Required value was null.");
                            return;
                        }
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            PlacemarkMapObject b10 = b((String) it3.next());
                            if (b10 != null && (useAnimation3 = b10.useAnimation()) != null) {
                                useAnimation3.play();
                            }
                        }
                        return;
                    }
                    break;
                case 1111527560:
                    if (str.equals("getGeometryPoint")) {
                        String str6 = obj instanceof String ? (String) obj : null;
                        if (str6 == null) {
                            ny61.g("Required value was null.");
                            return;
                        } else {
                            Point geometry = ((PlacemarkMapObject) ini0Var.c(str6, ReferenceType.MAP_OBJECT)).getGeometry();
                            ((ba20) da20Var).success(b.i(new Pair("lat", Double.valueOf(geometry.getLatitude())), new Pair("lon", Double.valueOf(geometry.getLongitude()))));
                            return;
                        }
                    }
                    break;
                case 1236882903:
                    if (str.equals("resumeAnimation")) {
                        List list4 = obj instanceof List ? (List) obj : null;
                        if (list4 == null) {
                            ny61.g("Required value was null.");
                            return;
                        }
                        Iterator it4 = list4.iterator();
                        while (it4.hasNext()) {
                            PlacemarkMapObject b11 = b((String) it4.next());
                            if (b11 != null && (useAnimation4 = b11.useAnimation()) != null) {
                                useAnimation4.resume();
                            }
                        }
                        return;
                    }
                    break;
                case 1706459465:
                    if (str.equals("setOpacity")) {
                        HashMap hashMap12 = obj instanceof HashMap ? (HashMap) obj : null;
                        if (hashMap12 == null) {
                            ny61.g("Required value was null.");
                            return;
                        }
                        for (Map.Entry entry10 : hashMap12.entrySet()) {
                            PlacemarkMapObject b12 = b((String) entry10.getKey());
                            if (b12 != null) {
                                Object value5 = entry10.getValue();
                                Double d11 = value5 instanceof Double ? (Double) value5 : null;
                                Float valueOf3 = d11 != null ? Float.valueOf((float) d11.doubleValue()) : null;
                                if (valueOf3 == null) {
                                    ny61.g("Required value was null.");
                                    return;
                                }
                                b12.setOpacity(valueOf3.floatValue());
                            }
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1984654331:
                    if (str.equals("setIcon")) {
                        HashMap hashMap13 = obj instanceof HashMap ? (HashMap) obj : null;
                        if (hashMap13 == null) {
                            ny61.g("Required value was null.");
                            return;
                        }
                        for (Map.Entry entry11 : hashMap13.entrySet()) {
                            PlacemarkMapObject b13 = b((String) entry11.getKey());
                            if (b13 != null) {
                                b13.setIcon(lyi.e((Map) entry11.getValue(), this.x));
                            }
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1984984239:
                    if (str.equals("setText")) {
                        HashMap hashMap14 = obj instanceof HashMap ? (HashMap) obj : null;
                        if (hashMap14 == null) {
                            ny61.g("Required value was null.");
                            return;
                        }
                        for (Map.Entry entry12 : hashMap14.entrySet()) {
                            PlacemarkMapObject b14 = b((String) entry12.getKey());
                            if (b14 != null) {
                                Object value6 = entry12.getValue();
                                String str7 = value6 instanceof String ? (String) value6 : null;
                                if (str7 == null) {
                                    str7 = "";
                                }
                                b14.setText(str7);
                            }
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 2060910869:
                    if (str.equals("subscribeCursorLocation")) {
                        return;
                    }
                    break;
            }
        }
        ((ba20) da20Var).notImplemented();
    }
}
