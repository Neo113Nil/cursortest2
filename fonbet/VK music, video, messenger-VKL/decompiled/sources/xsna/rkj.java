package xsna;

import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.metrics.performance.appstart.content_provider.Method;
import com.vk.stat.model.builders.aggregate.AggregateEventBuilder;
import com.vk.stat.model.builders.aggregate.AggregateEventKey;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.ky6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class rkj implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Collection values = com.vk.metrics.performance.appstart.content_provider.a.a.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj6 : values) {
            String b = ((qkj) obj6).b();
            Object obj7 = linkedHashMap.get(b);
            if (obj7 == null) {
                obj7 = s5a.a(b, linkedHashMap);
            }
            ((List) obj7).add(obj6);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((qkj) obj).d() == Method.CLINIT) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            qkj qkjVar = (qkj) obj;
            long c = qkjVar != null ? qkjVar.c() / 1000 : 0L;
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (((qkj) obj2).d() == Method.INIT) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            qkj qkjVar2 = (qkj) obj2;
            long c2 = qkjVar2 != null ? qkjVar2.c() / 1000 : 0L;
            Iterator it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj3 = it3.next();
                    if (((qkj) obj3).d() == Method.ATTACH_INFO) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            qkj qkjVar3 = (qkj) obj3;
            long c3 = qkjVar3 != null ? qkjVar3.c() / 1000 : 0L;
            Iterator it4 = list.iterator();
            while (true) {
                if (it4.hasNext()) {
                    obj4 = it4.next();
                    if (((qkj) obj4).d() == Method.QUERY) {
                        break;
                    }
                } else {
                    obj4 = null;
                    break;
                }
            }
            qkj qkjVar4 = (qkj) obj4;
            long c4 = qkjVar4 != null ? qkjVar4.c() / 1000 : 0L;
            Iterator it5 = list.iterator();
            while (true) {
                if (it5.hasNext()) {
                    obj5 = it5.next();
                    if (((qkj) obj5).d() == Method.ONCREATE) {
                        break;
                    }
                } else {
                    obj5 = null;
                    break;
                }
            }
            qkj qkjVar5 = (qkj) obj5;
            long c5 = qkjVar5 != null ? qkjVar5.c() / 1000 : 0L;
            Iterator it6 = list.iterator();
            long j = 0;
            while (it6.hasNext()) {
                j = ((qkj) it6.next()).c() + j;
            }
            AggregateEventBuilder aggregateEventBuilder = new AggregateEventBuilder(AggregateEventKey.CORE_CONTENT_PROVIDER_MEASURE);
            aggregateEventBuilder.w(0, str);
            aggregateEventBuilder.v(1, (int) c);
            aggregateEventBuilder.v(2, (int) c2);
            aggregateEventBuilder.v(3, (int) c3);
            aggregateEventBuilder.v(4, (int) c5);
            aggregateEventBuilder.v(5, (int) c4);
            aggregateEventBuilder.v(15, (int) (j / 1000));
            aggregateEventBuilder.q();
        }
        ky6.a aVar = (ky6.a) Preference.j().edit();
        aVar.putLong("content_provider_measure_key", System.currentTimeMillis());
        aVar.a();
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{"ContentProviderMeasureTask", "Measurements send"});
    }
}
