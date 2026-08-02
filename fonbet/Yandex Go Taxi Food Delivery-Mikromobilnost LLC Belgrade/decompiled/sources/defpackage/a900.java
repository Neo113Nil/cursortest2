package defpackage;

import com.yandex.div.core.expression.variables.a;
import com.yandex.go.flex.main_screen.data.DocumentSourceVariableFactory$Companion$DocumentSource;
import com.yandex.go.flex.main_screen.presentation.feed.FeedState;
import com.yandex.go.flex.main_screen.presentation.feed.e;
import core.network.mapi.exception.MapiClientException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.r0;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes.dex */
public final class a900 implements i3m {
    public final yzv0 a;
    public final qcw0 b;
    public final q0z c;
    public final t2m d;
    public final a e;
    public final e f;
    public final lzy g;

    public a900(yzv0 yzv0Var, qcw0 qcw0Var, q0z q0zVar, t2m t2mVar, a aVar, e eVar, lzy lzyVar) {
        this.a = yzv0Var;
        this.b = qcw0Var;
        this.c = q0zVar;
        this.d = t2mVar;
        this.e = aVar;
        this.f = eVar;
        this.g = lzyVar;
    }

    public static String a(u1m u1mVar) {
        Object obj;
        Map map = u1mVar.c;
        if (map == null || (obj = map.get("client_request_id")) == null) {
            return null;
        }
        return obj.toString();
    }

    @Override // defpackage.i3m
    public final void dispose() {
    }

    @Override // defpackage.i3m
    public final void onDocumentLoadingFailed(l1o l1oVar, u1m u1mVar, Throwable th, List list) {
        Object value;
        pcw0 pcw0Var;
        Throwable th2;
        r0 r0Var = this.b.a;
        do {
            value = r0Var.getValue();
            pcw0Var = (pcw0) value;
            th2 = th;
            while (th2 instanceof MapiClientException) {
                th2 = ((MapiClientException) th2).getCause();
            }
        } while (!r0Var.k(value, pcw0.a(pcw0Var, s8o.A(th2) ? jcw0.a : kcw0.a, 2)));
        this.a.l("RequestFailed", a(u1mVar));
    }

    @Override // defpackage.i3m
    public final void onDocumentLoadingFinished(l1o l1oVar, u1m u1mVar, xzl xzlVar, List list) {
        Object value;
        l2z l2zVar = new l2z(3, this, u1mVar);
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int hashCode = str.hashCode();
            yzv0 yzv0Var = this.a;
            zy11 zy11Var = zy11.a;
            if (hashCode == -1663772500) {
                if (str.equals("fromFallback")) {
                    yzv0Var.l("RequestFallbackLoaded", a(u1mVar));
                }
                zy11Var = null;
            } else if (hashCode != 54256120) {
                if (hashCode == 1903806244 && str.equals("fromNetwork")) {
                    l2zVar.invoke();
                }
                zy11Var = null;
            } else {
                if (str.equals("fromCache")) {
                    r0 r0Var = this.b.a;
                    do {
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, new pcw0(mcw0.a, fcw0.a)));
                    yzv0Var.l("RequestCacheLoaded", a(u1mVar));
                    this.d.a.l(DocumentSourceVariableFactory$Companion$DocumentSource.CACHE);
                }
                zy11Var = null;
            }
            if (zy11Var != null) {
                return;
            }
        }
    }

    @Override // defpackage.i3m
    public final void onDocumentLoadingStarted(l1o l1oVar, u1m u1mVar, List list) {
        Object value;
        Object value2;
        String a = a(u1mVar);
        yzv0 yzv0Var = this.a;
        fva0.f(yzv0Var.a, "LayoutSuperappRequested", null, 0L, 6);
        yzv0Var.l("RequestSend", a);
        r0 r0Var = this.b.a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, pcw0.a((pcw0) value, ncw0.a, 2)));
        r0 r0Var2 = this.f.f;
        do {
            value2 = r0Var2.getValue();
        } while (!r0Var2.k(value2, FeedState.LOADING));
    }

    @Override // defpackage.i3m
    public final void onRenderingFinished(l1o l1oVar, u1m u1mVar, xzl xzlVar, long j, List list) {
        boolean z;
        Object value;
        p6q0 p6q0Var = (p6q0) xzlVar.a.c.b(qoi0.a(p6q0.class));
        if (p6q0Var == null) {
            return;
        }
        Collection values = p6q0Var.a.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                b bVar = (b) ((c) it.next()).get("type");
                Object d = bVar != null ? xsq0.d(bVar) : null;
                if (jl40.l(d instanceof String ? (String) d : null, "GoFeedSection")) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        this.e.i(new u131("is_feed_go_loading", false), new u131("is_feed_go_available", z));
        if (z) {
            r0 r0Var = this.f.f;
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, FeedState.LOADING_FINISHED));
        }
    }

    @Override // defpackage.i3m
    public final void onRenderingStarted(l1o l1oVar, u1m u1mVar, xzl xzlVar, List list) {
        Object value;
        if (xzlVar.c == q5z.d) {
            r0 r0Var = this.b.a;
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, pcw0.a((pcw0) value, null, 1)));
            this.d.a.l(DocumentSourceVariableFactory$Companion$DocumentSource.CACHE);
        }
        this.e.i(new u131("is_feed_go_loading", true));
    }
}
