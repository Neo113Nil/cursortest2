package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: PendingRequestsRegistry.kt */
/* loaded from: classes3.dex */
public final class bv90 {
    public final ConcurrentHashMap<Long, a> a = new ConcurrentHashMap<>();

    /* compiled from: PendingRequestsRegistry.kt */
    public static final class a {
        public final o7i a;
        public final xy2<?> b;

        public a(o7i o7iVar, xy2 xy2Var) {
            this.a = o7iVar;
            this.b = xy2Var;
        }
    }

    public final void a(long j, JSONObject jSONObject) {
        a remove = this.a.remove(Long.valueOf(j));
        if (remove != null) {
            remove.a.i0(jSONObject);
            return;
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.w, new Object[]{"PendingRequestsRegistry", qlb0.a(j, "No pending request found for id=", " on complete")});
    }

    public final void b(long j, VKApiExecutionException vKApiExecutionException) {
        a remove = this.a.remove(Long.valueOf(j));
        if (remove != null) {
            remove.a.A(vKApiExecutionException);
            return;
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.w, new Object[]{"PendingRequestsRegistry", qlb0.a(j, "No pending request found for id=", " on fail")});
    }

    public final void c(VKApiExecutionException vKApiExecutionException) {
        ConcurrentHashMap<Long, a> concurrentHashMap = this.a;
        Iterator it = j5g.O0(concurrentHashMap.keySet()).iterator();
        while (it.hasNext()) {
            a remove = concurrentHashMap.remove(Long.valueOf(((Number) it.next()).longValue()));
            if (remove != null) {
                remove.a.A(vKApiExecutionException);
            }
        }
    }
}
