package xsna;

import com.vk.core.preference.Preference;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import xsna.egl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class cgl implements izs {
    public final /* synthetic */ egl b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        egl.b bVar;
        Map map = (Map) obj;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Preference.F(((Number) r1.getValue()).intValue(), "image_cache_stat", (String) ((Map.Entry) it.next()).getKey());
        }
        for (String str : map.keySet()) {
            ConcurrentHashMap<String, egl.a> concurrentHashMap = this.b.d;
            if (epx.f(str, "sum_hit_rate")) {
                Iterator it2 = j5g.S0(concurrentHashMap.values()).iterator();
                int i = 0;
                while (it2.hasNext()) {
                    i += (int) egl.e(new File(((egl.a) it2.next()).a));
                }
                Iterator it3 = j5g.S0(concurrentHashMap.values()).iterator();
                int i2 = 0;
                while (it3.hasNext()) {
                    i2 += (int) ((egl.a) it3.next()).b;
                }
                long j = i2;
                bVar = new egl.b(j != 0 ? (int) ((i / j) * 1000) : 0, i / 1024, i2 / 1024);
            } else {
                egl.a aVar = concurrentHashMap.get(str);
                if (aVar == null) {
                    bVar = null;
                } else {
                    long j2 = aVar.b;
                    long e = egl.e(new File(aVar.a));
                    long j3 = 1024;
                    bVar = new egl.b(j2 != 0 ? (int) ((e / j2) * 1000) : 0, (int) (e / j3), (int) (j2 / j3));
                }
            }
            if (bVar == null) {
                Preference.C("image_cache_load_stat_v1", str);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(bVar.b());
                sb.append(':');
                sb.append(bVar.a());
                sb.append(':');
                sb.append(bVar.c());
                Preference.H("image_cache_load_stat_v1", str, sb.toString());
            }
        }
        return s3q0.a;
    }
}
