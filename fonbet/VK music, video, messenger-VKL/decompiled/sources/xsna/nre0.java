package xsna;

import com.ironsource.X3;
import com.vk.queue.sync.models.QueueAccessException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: QueueObserver.kt */
/* loaded from: classes5.dex */
public final class nre0 {
    public final zqe0 a;
    public final ExecutorService b;
    public final wuj c;

    public nre0(zqe0 zqe0Var, ExecutorService executorService, wuj wujVar) {
        this.a = zqe0Var;
        this.b = executorService;
        this.c = wujVar;
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final void a(String str, acc accVar, izs<? super Map<xqe0, ? extends List<? extends JSONObject>>, s3q0> izsVar, izs<? super Map<xqe0, xqe0>, s3q0> izsVar2) {
        wuj wujVar = this.c;
        try {
            wujVar.e(X3.j.d + str + "] loop started");
            Collection<xqe0> collection = accVar.b;
            while (true) {
                sdy.j(true);
                cre0 b = this.a.b(TimeUnit.SECONDS.toMillis(25L), accVar.a, collection);
                sdy.j(true);
                ?? r3 = b.c;
                ?? r4 = b.b;
                if (!r3.isEmpty()) {
                    throw new QueueAccessException(b.c);
                }
                ?? r2 = b.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : r2.entrySet()) {
                    if (!((Collection) entry.getValue()).isEmpty()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    izsVar.invoke(linkedHashMap);
                }
                izsVar2.invoke(r4);
                collection = r4.values();
            }
        } catch (Exception e) {
            wujVar.e(X3.j.d + str + "] loop stopped by reason: " + e);
            throw e;
        }
    }
}
