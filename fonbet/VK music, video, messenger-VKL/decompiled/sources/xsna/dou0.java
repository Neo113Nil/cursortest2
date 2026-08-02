package xsna;

import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: VkSharedWebViewPool.kt */
/* loaded from: classes11.dex */
public final class dou0 {
    public final Context a;
    public final ExecutorService b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final MessageQueue d = Looper.getMainLooper().getQueue();
    public final bou0 e = new MessageQueue.IdleHandler() { // from class: xsna.bou0
        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            List list;
            dou0 dou0Var = dou0.this;
            LinkedHashMap linkedHashMap = dou0Var.c;
            list = rjv0.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                List list2 = (List) linkedHashMap.get((dcy) obj);
                ArrayList d = list2 != null ? rjv0.d(list2) : null;
                if (d == null || d.isEmpty()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                dcy<? extends WebView> dcyVar = (dcy) it.next();
                xgx0.a.getClass();
                xgx0.a("[VkContextWebViewPool] - prepare slot for " + dcyVar);
                Object obj2 = linkedHashMap.get(dcyVar);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(dcyVar, obj2);
                }
                dou0Var.a(dcyVar, (List) obj2);
            }
            return false;
        }
    };
    public final cou0 f = new MessageQueue.IdleHandler() { // from class: xsna.cou0
        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            ArrayList c = rjv0.c(c5g.v(dou0.this.c.values()));
            xgx0 xgx0Var = xgx0.a;
            String str = "[VkContextWebViewPool] - refresh " + c.size() + " dirty slot(s)";
            xgx0Var.getClass();
            xgx0.a(str);
            Iterator it = c.iterator();
            while (it.hasNext()) {
                rjv0.i((t1w0) it.next());
            }
            return false;
        }
    };
    public boolean g;

    /* JADX WARN: Type inference failed for: r1v4, types: [xsna.bou0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [xsna.cou0] */
    public dou0(Context context, ExecutorService executorService) {
        this.a = context;
        this.b = executorService;
    }

    public final t1w0 a(dcy<? extends WebView> dcyVar, List<t1w0> list) {
        t1w0 t1w0Var = new t1w0(rjv0.k(this.a, dcyVar));
        if (list.size() < 4) {
            list.add(t1w0Var);
            return t1w0Var;
        }
        xgx0.a.getClass();
        xgx0.b("[VkContextWebViewPool] - pool for " + dcyVar + " is oversize");
        return t1w0Var;
    }

    public final void b(MessageQueue.IdleHandler idleHandler) {
        if (this.g) {
            return;
        }
        qro0.e(1000L, new xm6(18, this, idleHandler));
    }
}
