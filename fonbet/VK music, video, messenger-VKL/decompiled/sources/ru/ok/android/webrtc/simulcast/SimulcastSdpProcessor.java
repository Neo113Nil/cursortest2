package ru.ok.android.webrtc.simulcast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Result;
import kotlin.jvm.internal.Ref$IntRef;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.brm0;
import xsna.c5g;
import xsna.drm0;
import xsna.epx;
import xsna.g5g;
import xsna.ggb0;
import xsna.j5g;
import xsna.n6j;

/* loaded from: classes9.dex */
public final class SimulcastSdpProcessor {
    public static final SimulcastSdpProcessor INSTANCE = new SimulcastSdpProcessor();

    public static SimulcastLayerInfo a(String str) {
        String obj = drm0.p0(drm0.U(str, "a=rid:")).toString();
        if (drm0.N(obj)) {
            return null;
        }
        List a = n6j.a(3, "\\s+", obj);
        return new SimulcastLayerInfo((String) a.get(0), a.size() > 1 ? SimulcastDirection.Companion.fromString((String) a.get(1)) : SimulcastDirection.RECV, false, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 0, 0, 0, null, 0, 0, 1020, null);
    }

    public static /* synthetic */ String addSimulcastLayers$default(SimulcastSdpProcessor simulcastSdpProcessor, String str, SimulcastConfig simulcastConfig, RTCLog rTCLog, int i, Object obj) {
        if ((i & 4) != 0) {
            rTCLog = new RTCLog.NoOp();
        }
        return simulcastSdpProcessor.addSimulcastLayers(str, simulcastConfig, rTCLog);
    }

    public static /* synthetic */ SimulcastConfig parseSimulcastInfo$default(SimulcastSdpProcessor simulcastSdpProcessor, String str, RTCLog rTCLog, int i, Object obj) {
        if ((i & 2) != 0) {
            rTCLog = new RTCLog.NoOp();
        }
        return simulcastSdpProcessor.parseSimulcastInfo(str, rTCLog);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.Result$Failure] */
    public final String addSimulcastLayers(String str, SimulcastConfig simulcastConfig, RTCLog rTCLog) {
        int i;
        int i2;
        String str2;
        if (simulcastConfig == null) {
            str2 = str;
        } else {
            try {
                ArrayList arrayList = new ArrayList(drm0.c0(drm0.p0(str).toString(), new String[]{"\r\n"}, 0, 6));
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    i = -1;
                    if (!listIterator.hasPrevious()) {
                        i2 = -1;
                        break;
                    }
                    String str3 = (String) listIterator.previous();
                    if (brm0.B(str3, "a=mid:", false) && epx.f(drm0.p0(str3.substring(6)).toString(), simulcastConfig.getMid())) {
                        i2 = listIterator.nextIndex();
                        break;
                    }
                }
                if (i2 < 0) {
                    return str;
                }
                int i3 = i2 + 1;
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                int i4 = 0;
                for (String str4 : arrayList.subList(i3, arrayList.size())) {
                    if (!brm0.B(str4, "a=mid:", false) && !brm0.B(str4, "m=", false)) {
                        i4++;
                    }
                    i = i4;
                }
                Integer valueOf = Integer.valueOf(i);
                if (i < 0 || i == i3) {
                    valueOf = null;
                }
                int intValue = (valueOf != null ? valueOf.intValue() : arrayList.size() - i3) + i3;
                g5g.D(arrayList.subList(i3, intValue), true, new ggb0(ref$IntRef, 11));
                List<SimulcastLayerInfo> layers = simulcastConfig.getLayers();
                ArrayList arrayList2 = new ArrayList(c5g.u(layers, 10));
                Iterator it = layers.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((SimulcastLayerInfo) it.next()).toAridLine());
                }
                arrayList.addAll(intValue - ref$IntRef.element, arrayList2);
                arrayList.addAll((intValue - ref$IntRef.element) + arrayList2.size(), simulcastConfig.toSdpSimulcastLine());
                return j5g.g0(arrayList, "\r\n", null, null, 0, null, 62) + "\r\n";
            } catch (Throwable th) {
                str2 = new Result.Failure(th);
            }
        }
        Throwable a = Result.a(str2);
        if (a != null) {
            String message = a.getMessage();
            if (message == null) {
                message = "";
            }
            rTCLog.reportException("SimulcastSdpProcessor", message, a);
        }
        if (Result.a(str2) == null) {
            str = str2;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ad, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SimulcastConfig parseSimulcastInfo(String str, RTCLog rTCLog) {
        SimulcastLayerInfo a;
        try {
            List<String> c0 = drm0.c0(drm0.p0(str).toString(), new String[]{"\r\n"}, 0, 6);
            ArrayList arrayList = new ArrayList();
            while (true) {
                String str2 = null;
                boolean z = false;
                for (String str3 : c0) {
                    if (brm0.B(str3, "m=", false)) {
                        if (z && str2 != null && !arrayList.isEmpty()) {
                            return new SimulcastConfig(str2, j5g.O0(arrayList));
                        }
                        arrayList.clear();
                    } else if (brm0.B(str3, "a=mid:", false)) {
                        str2 = drm0.p0(drm0.U(str3, "a=mid:")).toString();
                    } else if (brm0.B(str3, "a=simulcast:", false)) {
                        z = true;
                    } else if (brm0.B(str3, "a=rid:", false) && str2 != null && (a = a(str3)) != null) {
                        arrayList.add(a);
                    }
                }
                if (z && str2 != null && !arrayList.isEmpty()) {
                    return new SimulcastConfig(str2, j5g.O0(arrayList));
                }
            }
        } catch (Throwable th) {
            Throwable a2 = Result.a(new Result.Failure(th));
            if (a2 != null) {
                String message = a2.getMessage();
                if (message == null) {
                    message = "";
                }
                rTCLog.reportException("SimulcastSdpProcessor", message, a2);
            }
        }
    }

    public static final boolean a(Ref$IntRef ref$IntRef, String str) {
        boolean z = brm0.B(str, "a=rid:", false) || brm0.B(str, "a=simulcast:", false);
        if (z) {
            ref$IntRef.element++;
        }
        return z;
    }
}
