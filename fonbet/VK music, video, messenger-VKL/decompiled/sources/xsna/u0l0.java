package xsna;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: StepsGrouperUtils.kt */
/* loaded from: classes6.dex */
public final class u0l0 {
    public static final long a = TimeUnit.MINUTES.toMillis(30);
    public static final /* synthetic */ int b = 0;

    public static s0l0 a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            m0l0 m0l0Var = (m0l0) it.next();
            i += m0l0Var.h() ? m0l0Var.d : m0l0Var.a;
        }
        Iterator it2 = arrayList.iterator();
        double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        while (it2.hasNext()) {
            d += ((m0l0) it2.next()).h() ? r4.e : r4.b;
        }
        Pair pair = new Pair(Integer.valueOf(i), Float.valueOf((float) d));
        return new s0l0(((Number) pair.d()).intValue(), ((Number) pair.g()).floatValue(), ((m0l0) j5g.i0(arrayList)).f, ((m0l0) j5g.i0(arrayList)).h(), ((m0l0) j5g.Y(arrayList)).c, ((m0l0) j5g.i0(arrayList)).c);
    }

    public static ArrayList b(List list, ChronoUnit chronoUnit) {
        Iterator it;
        Iterator it2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Long valueOf = Long.valueOf(ZonedDateTime.ofInstant(Instant.ofEpochMilli(((m0l0) obj).c), ZoneId.systemDefault()).truncatedTo(chronoUnit).toInstant().toEpochMilli());
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it3 = linkedHashMap.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            long longValue = ((Number) entry.getKey()).longValue();
            List list2 = (List) entry.getValue();
            Iterator it4 = list2.iterator();
            int i = 0;
            int i2 = 0;
            while (it4.hasNext()) {
                i2 += ((m0l0) it4.next()).a;
            }
            Iterator it5 = list2.iterator();
            double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            double d2 = 0.0d;
            while (it5.hasNext()) {
                d2 += ((m0l0) it5.next()).b;
            }
            float f = (float) d2;
            Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                i += ((m0l0) it6.next()).d;
            }
            while (list2.iterator().hasNext()) {
                d += ((m0l0) r3.next()).e;
            }
            float f2 = (float) d;
            int i3 = i;
            List D0 = j5g.D0(new t0l0(), list2);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Iterator it7 = D0.iterator(); it7.hasNext(); it7 = it2) {
                m0l0 m0l0Var = (m0l0) it7.next();
                if (arrayList3.isEmpty()) {
                    it = it3;
                    it2 = it7;
                } else {
                    m0l0 m0l0Var2 = (m0l0) j5g.Y(arrayList3);
                    m0l0 m0l0Var3 = (m0l0) j5g.i0(arrayList3);
                    it = it3;
                    it2 = it7;
                    if (epx.f(m0l0Var3.f, m0l0Var.f) && m0l0Var.c - m0l0Var2.c <= a && m0l0Var3.h() == m0l0Var.h()) {
                        arrayList3.add(m0l0Var);
                        it3 = it;
                    }
                }
                if (!arrayList3.isEmpty()) {
                    arrayList2.add(a(arrayList3));
                    arrayList3.clear();
                }
                arrayList3.add(m0l0Var);
                it3 = it;
            }
            Iterator it8 = it3;
            if (!arrayList3.isEmpty()) {
                arrayList2.add(a(arrayList3));
            }
            arrayList.add(new m0l0(i2, f, longValue, i3, f2, (String) null, arrayList2));
            it3 = it8;
        }
        return arrayList;
    }
}
