package defpackage;

import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.geometry.BoundingBoxHelper;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.runtime.config.ExternalExperimentalParameter;
import com.yandex.runtime.i18n.I18nManagerFactory;
import com.yandex.runtime.i18n.SystemOfMeasurement;
import com.yandex.runtime.recording.EventLoggingFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.a;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;

/* loaded from: classes15.dex */
public final class gi6 extends k45 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gi6(ssr ssrVar, String str, int i) {
        super(ssrVar, str);
        this.b = i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        switch (this.b) {
            case 0:
                Object obj = x920Var.b;
                String str = x920Var.a;
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -402922880) {
                        if (hashCode != -83101483) {
                            if (hashCode == 274409349 && str.equals("getBoundsFromPolygon")) {
                                ((ba20) da20Var).success(rsq0.a(BoundingBoxHelper.getBounds(lyi.i((Map) obj))));
                                break;
                            }
                        } else if (str.equals("getBoundsFromPolyline")) {
                            List<Map> list = (List) ((Map) obj).get(CRLDistributionPointsExtension.POINTS);
                            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                            for (Map map : list) {
                                Object obj2 = map.get("lat");
                                Double d = obj2 instanceof Double ? (Double) obj2 : null;
                                Object obj3 = map.get("lon");
                                Double d2 = obj3 instanceof Double ? (Double) obj3 : null;
                                if (d == null) {
                                    ny61.g("Required value was null.");
                                    break;
                                } else if (d2 == null) {
                                    ny61.g("Required value was null.");
                                    break;
                                } else {
                                    arrayList.add(new Point(d.doubleValue(), d2.doubleValue()));
                                }
                            }
                            ((ba20) da20Var).success(rsq0.a(BoundingBoxHelper.getBounds(new Polyline(arrayList))));
                            break;
                        }
                    } else if (str.equals("getBoundsFromBoundingBoxes")) {
                        Map map2 = (Map) obj;
                        ((ba20) da20Var).success(rsq0.a(BoundingBoxHelper.getBounds(lyi.a((Map) map2.get("first")), lyi.a((Map) map2.get("second")))));
                        break;
                    }
                }
                ((ba20) da20Var).notImplemented();
                break;
            case 1:
                Object obj4 = x920Var.b;
                String str2 = x920Var.a;
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -1623835858:
                            if (str2.equals("setMetricsEventWhitelist")) {
                                gv00 gv00Var = gv00.a;
                                gv00.d = a.N0((List) obj4);
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case -1422566693:
                            if (str2.equals("setBlacklist")) {
                                gv00 gv00Var2 = gv00.a;
                                gv00.c = a.N0((List) obj4);
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case -1298848381:
                            if (str2.equals("enable")) {
                                gv00 gv00Var3 = gv00.a;
                                if (!gv00.b) {
                                    gv00.b = true;
                                    EventLoggingFactory.getEventLogging().subscribe(gv00Var3);
                                }
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case 1671308008:
                            if (str2.equals("disable")) {
                                gv00 gv00Var4 = gv00.a;
                                gv00.b = false;
                                EventLoggingFactory.getEventLogging().unsubscribe(gv00Var4);
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                    }
                }
                ((ba20) da20Var).notImplemented();
                break;
            case 2:
                if (jl40.l(x920Var.a, "setValues")) {
                    List<Map> list2 = (List) x920Var.b;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                    for (Map map3 : list2) {
                        arrayList2.add(new ExternalExperimentalParameter((String) map3.get("serviceId"), (String) map3.get("parameter"), (String) map3.get("value")));
                    }
                    MapKitFactory.getInstance().getExternalExperimentsManager().setValues(arrayList2);
                    ((ba20) da20Var).success(null);
                    break;
                } else {
                    ((ba20) da20Var).notImplemented();
                    break;
                }
            default:
                Object obj5 = x920Var.b;
                String str3 = x920Var.a;
                if (str3 != null) {
                    int hashCode2 = str3.hashCode();
                    if (hashCode2 != -1611360579) {
                        if (hashCode2 != -905800241) {
                            if (hashCode2 == 669111582 && str3.equals("localizeDistance")) {
                                ((ba20) da20Var).success(I18nManagerFactory.getI18nManagerInstance().localizeDistance(((Integer) obj5).intValue()));
                                break;
                            }
                        } else if (str3.equals("setSom")) {
                            I18nManagerFactory.getI18nManagerInstance().setSom(SystemOfMeasurement.valueOf(((String) obj5).toUpperCase(Locale.ROOT)));
                            ((ba20) da20Var).success(null);
                            break;
                        }
                    } else if (str3.equals("localizeDuration")) {
                        ((ba20) da20Var).success(I18nManagerFactory.getI18nManagerInstance().localizeDuration(((Integer) obj5).intValue()));
                        break;
                    }
                }
                ((ba20) da20Var).notImplemented();
                break;
        }
    }
}
