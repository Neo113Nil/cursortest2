package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import com.google.android.gms.internal.fido.i;
import com.google.android.gms.internal.fido.zzcc;
import com.google.android.gms.internal.fido.zzcj;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzhf;
import com.google.android.gms.internal.fido.zzhj;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.geo.PolylineUtils;
import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import io.flutter.plugins.webviewflutter.WebViewProxyApi$WebViewPlatformView;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.WeakHashMap;
import ru.CryptoPro.reprov.array.DerValue;
import ru.yandex.taxi.map.utils.a;
import ru.yandex.taxi.map_common.map.k;

/* loaded from: classes11.dex */
public abstract class iwa1 {
    public static ArrayList a(List list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        Point point = (Point) arrayList.get(0);
        if (!a.z(point, (Point) unr0.k(1, arrayList))) {
            arrayList.add(new Point(point.getLatitude(), point.getLongitude()));
        }
        if (arrayList.size() >= 4 && k.h(arrayList) != null) {
            return arrayList;
        }
        return null;
    }

    public static Point b(Polyline polyline, PolylinePosition polylinePosition) {
        if (polylinePosition.getSegmentIndex() < 0) {
            xby.t(jst.e, "ROUTE_PROGRESS:INVALID_ROUTE_POSITION", null, oyr.j(polylinePosition.getSegmentIndex(), "lastRoutePosition segmentIndex ", " should be zero-based"), 6);
            return null;
        }
        double segmentPosition = polylinePosition.getSegmentPosition();
        if (0.0d <= segmentPosition && segmentPosition <= 1.0d) {
            if (polyline.getPoints().size() > polylinePosition.getSegmentIndex() + 1) {
                return PolylineUtils.pointByPolylinePosition(polyline, polylinePosition);
            }
            xby.t(jst.e, "ROUTE_PROGRESS:INVALID_ROUTE_POLYLINE", null, oyr.h(polyline.getPoints().size(), polylinePosition.getSegmentIndex(), "routePolyline has insufficient segments ", " for given lastRoutePosition "), 6);
            return null;
        }
        xby.t(jst.e, "ROUTE_PROGRESS:INVALID_ROUTE_POSITION", null, "lastRoutePosition segmentPosition " + polylinePosition.getSegmentPosition() + " not in range [0, 1]", 6);
        return null;
    }

    public static void c(tt5 tt5Var, final w4u w4uVar) {
        i3y i3yVar = pd2.b;
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", (rs10) i3yVar.getValue(), obj);
        if (w4uVar != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: od2
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    int i2 = i;
                    w4u w4uVar2 = w4uVar;
                    switch (i2) {
                        case 0:
                            Long l = (Long) ((List) obj2).get(0);
                            try {
                                Object m = w4uVar2.m(l.longValue());
                                if (m instanceof WebViewProxyApi$WebViewPlatformView) {
                                    ((WebViewProxyApi$WebViewPlatformView) m).destroy();
                                }
                                ((HashMap) w4uVar2.i).remove(l);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g2 = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g2 = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        default:
                            try {
                                ((WeakHashMap) w4uVar2.h).clear();
                                ((HashMap) w4uVar2.b).clear();
                                ((HashMap) w4uVar2.i).clear();
                                ((HashMap) w4uVar2.k).clear();
                                g = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.clear", (rs10) i3yVar.getValue(), obj);
        if (w4uVar == null) {
            m2vVar2.G(null);
        } else {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: od2
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    int i22 = i2;
                    w4u w4uVar2 = w4uVar;
                    switch (i22) {
                        case 0:
                            Long l = (Long) ((List) obj2).get(0);
                            try {
                                Object m = w4uVar2.m(l.longValue());
                                if (m instanceof WebViewProxyApi$WebViewPlatformView) {
                                    ((WebViewProxyApi$WebViewPlatformView) m).destroy();
                                }
                                ((HashMap) w4uVar2.i).remove(l);
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g2 = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g2 = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        default:
                            try {
                                ((WeakHashMap) w4uVar2.h).clear();
                                ((HashMap) w4uVar2.b).clear();
                                ((HashMap) w4uVar2.i).clear();
                                ((HashMap) w4uVar2.k).clear();
                                g = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                    }
                }
            });
        }
    }

    public static final s7a1 d(zr10 zr10Var) {
        try {
            e8a1 e = zr10Var.e();
            if (e == null) {
                throw new zzhj("Parser being asked to parse an empty input stream");
            }
            try {
                byte b = e.b;
                byte b2 = e.a;
                int i = 0;
                if (b2 == Byte.MIN_VALUE) {
                    long a = zr10Var.a();
                    if (a > 1000) {
                        throw new zzhj("Parser being asked to read a large CBOR array");
                    }
                    e(b, a);
                    s7a1[] s7a1VarArr = new s7a1[(int) a];
                    while (i < a) {
                        s7a1VarArr[i] = d(zr10Var);
                        i++;
                    }
                    return new h5a1(zzcc.l(s7a1VarArr));
                }
                if (b2 != -96) {
                    if (b2 == -64) {
                        throw new zzhj("Tags are currently unsupported");
                    }
                    if (b2 == -32) {
                        return new p5a1(zr10Var.k());
                    }
                    if (b2 == 0 || b2 == 32) {
                        long c = zr10Var.c();
                        e(b, c > 0 ? c : ~c);
                        return new h6a1(c);
                    }
                    if (b2 == 64) {
                        zr10Var.v(DerValue.TAG_APPLICATION);
                        byte[] B = zr10Var.B();
                        int length = B.length;
                        e(b, length);
                        return new i(zzgx.m(length, B));
                    }
                    if (b2 != 96) {
                        throw new zzhj("Unidentifiable major type: " + ((b2 >> 5) & 7));
                    }
                    zr10Var.v((byte) 96);
                    String str = new String(zr10Var.B(), StandardCharsets.UTF_8);
                    e(b, str.length());
                    return new d7a1(str);
                }
                long d = zr10Var.d();
                if (d > 1000) {
                    throw new zzhj("Parser being asked to read a large CBOR map");
                }
                e(b, d);
                int i2 = (int) d;
                gr81[] gr81VarArr = new gr81[i2];
                s7a1 s7a1Var = null;
                int i3 = 0;
                while (i3 < d) {
                    s7a1 d2 = d(zr10Var);
                    if (s7a1Var != null && d2.compareTo(s7a1Var) <= 0) {
                        throw new zzhf("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + s7a1Var.toString() + "\nCurrent key: " + d2.toString());
                    }
                    gr81VarArr[i3] = new gr81(9, d2, d(zr10Var));
                    i3++;
                    s7a1Var = d2;
                }
                TreeMap treeMap = new TreeMap();
                while (i < i2) {
                    gr81 gr81Var = gr81VarArr[i];
                    if (treeMap.containsKey((s7a1) gr81Var.b)) {
                        throw new zzhf("Attempted to add duplicate key to canonical CBOR Map.");
                    }
                    treeMap.put((s7a1) gr81Var.b, (s7a1) gr81Var.c);
                    i++;
                }
                return new w6a1(zzcj.b(treeMap));
            } catch (IOException | RuntimeException e2) {
                throw new zzhj(e2);
            }
        } catch (IOException e3) {
            throw new zzhj(e3);
        }
    }

    public static final void e(byte b, long j) {
        switch (b) {
            case 24:
                if (j < 24) {
                    throw new zzhf(qv10.k(j, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
                }
                return;
            case 25:
                if (j < 256) {
                    throw new zzhf(qv10.k(j, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                    throw new zzhf(qv10.k(j, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j < 4294967296L) {
                    throw new zzhf(qv10.k(j, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }
}
