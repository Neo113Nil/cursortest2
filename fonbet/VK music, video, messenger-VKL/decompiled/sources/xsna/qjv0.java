package xsna;

import android.content.Context;
import android.os.MessageQueue;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: VkSharedWebViewPool.kt */
/* loaded from: classes11.dex */
public final class qjv0 implements s1w0 {
    public final ExecutorService a;
    public final LinkedHashMap b = new LinkedHashMap();

    public qjv0(ExecutorService executorService) {
        this.a = executorService;
    }

    @Override // xsna.s1w0
    public final void a(Context context) {
        if (!i0q0.b()) {
            throw new IllegalStateException("Main thread required");
        }
        dou0 e = e(context);
        if (e != null) {
            e.b.execute(new igl0(e, 1));
        }
    }

    @Override // xsna.s1w0
    public final void b(WebView webView) {
        t1w0 f;
        if (!i0q0.b()) {
            throw new IllegalStateException("Main thread required");
        }
        Object context = webView.getContext();
        dou0 dou0Var = (dou0) this.b.get(context);
        if (dou0Var == null) {
            xgx0.a.getClass();
            xgx0.g("[VkSharedWebViewPool] - release unknown instance");
            rjv0.j(webView);
            return;
        }
        List list = (List) dou0Var.c.get(fpf0.a(webView.getClass()));
        if (list == null || (f = rjv0.f(list, webView)) == null) {
            xgx0.a.getClass();
            xgx0.g("[VkContextWebViewPool] - release unknown instance");
            rjv0.j(webView);
        } else {
            f.b(u1w0.DIRTY);
            rjv0.j(webView);
            dou0Var.b(dou0Var.f);
        }
        if ((context instanceof f5z) && ((f5z) context).getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            xgx0.a.getClass();
            xgx0.g("[VkSharedWebViewPool] - release instance with died context");
            d(webView.getContext(), dou0Var);
        }
    }

    @Override // xsna.s1w0
    public final WebView c(Context context, rfc rfcVar) {
        if (!i0q0.b()) {
            throw new IllegalStateException("Main thread required");
        }
        dou0 e = e(context);
        if (e != null) {
            LinkedHashMap linkedHashMap = e.c;
            Object obj = linkedHashMap.get(rfcVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(rfcVar, obj);
            }
            List<t1w0> list = (List) obj;
            t1w0 e2 = rjv0.e(list);
            if (e2 != null) {
                xgx0.a.getClass();
                xgx0.a("[VkContextWebViewPool] - receive slot from pool");
            } else {
                e2 = e.a(rfcVar, list);
                xgx0.a.getClass();
                xgx0.a("[VkContextWebViewPool] - receive new slot");
            }
            e2.b(u1w0.BUSY);
            e.b.execute(new vb(e, 20));
            WebView a2 = e2.a();
            if (a2 != null) {
                return a2;
            }
        }
        return rjv0.k(context, rfcVar);
    }

    public final void d(Context context, dou0 dou0Var) {
        LinkedHashMap linkedHashMap = dou0Var.c;
        ArrayList v = c5g.v(linkedHashMap.values());
        if (!rjv0.h(v)) {
            xgx0.a.getClass();
            xgx0.g("[VkContextWebViewPool] - clear not allowed while not all slots is free");
            xgx0.b("[VkSharedWebViewPool] - pool for died context can not be cleared");
            return;
        }
        dou0Var.g = true;
        MessageQueue messageQueue = dou0Var.d;
        messageQueue.removeIdleHandler(dou0Var.f);
        messageQueue.removeIdleHandler(dou0Var.e);
        rjv0.b(v);
        linkedHashMap.clear();
        this.b.remove(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dou0 e(Context context) {
        if (!(context instanceof f5z)) {
            xgx0.a.getClass();
            xgx0.g("[VkSharedWebViewPool] - context is not LifecycleOwner");
            return null;
        }
        LinkedHashMap linkedHashMap = this.b;
        Object obj = linkedHashMap.get(context);
        Object obj2 = obj;
        if (obj == null) {
            dou0 dou0Var = new dou0(context, this.a);
            Lifecycle lifecycle = ((f5z) context).getLifecycle();
            lifecycle.addObserver(new a(lifecycle, this, context, dou0Var));
            linkedHashMap.put(context, dou0Var);
            obj2 = dou0Var;
        }
        return (dou0) obj2;
    }

    /* compiled from: LifecycleExt.kt */
    public static final class a implements nhl {
        public final /* synthetic */ Lifecycle b;
        public final /* synthetic */ qjv0 c;
        public final /* synthetic */ Context d;
        public final /* synthetic */ dou0 e;

        public a(Lifecycle lifecycle, qjv0 qjv0Var, Context context, dou0 dou0Var) {
            this.b = lifecycle;
            this.c = qjv0Var;
            this.d = context;
            this.e = dou0Var;
        }

        @Override // xsna.nhl
        public final void onDestroy(f5z f5zVar) {
            this.c.d(this.d, this.e);
            this.b.removeObserver(this);
        }

        @Override // xsna.nhl
        public final void onCreate(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onPause(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onResume(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onStart(f5z f5zVar) {
        }

        @Override // xsna.nhl
        public final void onStop(f5z f5zVar) {
        }
    }
}
