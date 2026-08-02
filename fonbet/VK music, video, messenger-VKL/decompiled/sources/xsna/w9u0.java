package xsna;

import com.vk.im.engine.models.EngineWatchdogConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;

/* compiled from: VkAppExperiments.kt */
/* loaded from: classes11.dex */
public final /* synthetic */ class w9u0 extends FunctionReferenceImpl implements izs<String, EngineWatchdogConfig> {
    @Override // xsna.izs
    public final EngineWatchdogConfig invoke(String str) {
        Object failure;
        String str2 = str;
        ((xlp) this.receiver).getClass();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            EngineWatchdogConfig.WatchdogName[] values = EngineWatchdogConfig.WatchdogName.values();
            ArrayList arrayList = new ArrayList();
            for (EngineWatchdogConfig.WatchdogName watchdogName : values) {
                if (jSONObject.has(watchdogName.h())) {
                    arrayList.add(watchdogName);
                }
            }
            int e = on00.e(c5g.u(arrayList, 10));
            if (e < 16) {
                e = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(e);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                EngineWatchdogConfig.WatchdogName watchdogName2 = (EngineWatchdogConfig.WatchdogName) next;
                JSONObject jSONObject2 = jSONObject.getJSONObject(((EngineWatchdogConfig.WatchdogName) next).h());
                long optLong = jSONObject2.optLong("stuckTimeout", Long.MAX_VALUE);
                long optLong2 = jSONObject2.optLong("hangTimeout", Long.MAX_VALUE);
                if (optLong >= Long.MAX_VALUE && optLong2 >= Long.MAX_VALUE) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                linkedHashMap.put(watchdogName2, new EngineWatchdogConfig.a(optLong2, optLong));
            }
            failure = new EngineWatchdogConfig(linkedHashMap);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        Throwable a = Result.a(failure);
        if (a != null) {
            bVar.a(a);
        }
        if (Result.a(failure) != null) {
            failure = EngineWatchdogConfig.b;
        }
        return (EngineWatchdogConfig) failure;
    }
}
