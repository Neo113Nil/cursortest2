package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes10.dex */
public final class xt2 extends r63 {
    public long b;
    public long[] c;
    public long[] d;

    public xt2() {
        super(new bl0());
        this.b = C.TIME_UNSET;
        this.c = new long[0];
        this.d = new long[0];
    }

    public static String b(kc2 kc2Var) {
        int r = kc2Var.r();
        int i = kc2Var.b;
        kc2Var.e(i + r);
        return new String(kc2Var.a, i, r);
    }

    public final boolean a(long j, kc2 kc2Var) {
        if (kc2Var.m() != 2 || !"onMetaData".equals(b(kc2Var)) || kc2Var.c - kc2Var.b == 0 || kc2Var.m() != 8) {
            return false;
        }
        HashMap a = a(kc2Var);
        Object obj = a.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                this.b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = a.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.c = new long[size];
                this.d = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.c = new long[0];
                        this.d = new long[0];
                        break;
                    }
                    this.c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.d[i] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    public static Serializable a(int i, kc2 kc2Var) {
        if (i == 8) {
            return a(kc2Var);
        }
        if (i == 10) {
            int p = kc2Var.p();
            ArrayList arrayList = new ArrayList(p);
            for (int i2 = 0; i2 < p; i2++) {
                Serializable a = a(kc2Var.m(), kc2Var);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return arrayList;
        }
        if (i == 11) {
            Date date = new Date((long) Double.longBitsToDouble(kc2Var.i()));
            kc2Var.e(kc2Var.b + 2);
            return date;
        }
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(kc2Var.i()));
        }
        if (i == 1) {
            return Boolean.valueOf(kc2Var.m() == 1);
        }
        if (i == 2) {
            return b(kc2Var);
        }
        if (i != 3) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String b = b(kc2Var);
            int m = kc2Var.m();
            if (m == 9) {
                return hashMap;
            }
            Serializable a2 = a(m, kc2Var);
            if (a2 != null) {
                hashMap.put(b, a2);
            }
        }
    }

    public static HashMap a(kc2 kc2Var) {
        int p = kc2Var.p();
        HashMap hashMap = new HashMap(p);
        for (int i = 0; i < p; i++) {
            String b = b(kc2Var);
            Serializable a = a(kc2Var.m(), kc2Var);
            if (a != null) {
                hashMap.put(b, a);
            }
        }
        return hashMap;
    }
}
