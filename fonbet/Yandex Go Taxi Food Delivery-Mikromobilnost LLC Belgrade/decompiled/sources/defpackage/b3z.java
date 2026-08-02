package defpackage;

import android.net.Uri;
import com.ybsdk.core.analytics.generated.delegates.DeeplinkEvents$DeeplinkOpenHandler;
import com.ybsdk.feature.deeplink.api.Deeplink;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class b3z {
    public final epf a;
    public final a3h b;
    public final xjg c;
    public final ArrayList d = new ArrayList();

    public b3z(epf epfVar, a3h a3hVar, xjg xjgVar) {
        this.a = epfVar;
        this.b = a3hVar;
        this.c = xjgVar;
    }

    public final void a(a3z a3zVar) {
        this.d.add(a3zVar);
    }

    public final z2z b(Deeplink deeplink) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            y0h a = ((a3z) it.next()).a(deeplink);
            if (a instanceof v0h) {
                this.c.j(deeplink, DeeplinkEvents$DeeplinkOpenHandler.LOCAL);
                return new z2z(a, true);
            }
        }
        y0h d = ((l3h) ((j3h) this.a.get())).d(deeplink);
        if (d instanceof v0h) {
            return new z2z(d, false);
        }
        Deeplink fallback = deeplink.getFallback();
        return fallback != null ? b(fallback) : new z2z(x0h.a, false);
    }

    public final z2z c(String str) {
        x0h x0hVar = x0h.a;
        if (str == null) {
            return new z2z(x0hVar, false);
        }
        Deeplink e = w691.e(this.b, Uri.parse(str), true, null, false, 12);
        return e == null ? new z2z(x0hVar, false) : b(e);
    }
}
