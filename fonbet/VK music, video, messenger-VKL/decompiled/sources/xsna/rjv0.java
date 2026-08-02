package xsna;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: VkSharedWebViewPool.kt */
/* loaded from: classes6.dex */
public final class rjv0 {
    public static final List<dcy<WebView>> a = Collections.singletonList(fpf0.a(WebView.class));

    public static final void b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j(((t1w0) it.next()).a);
        }
    }

    public static final ArrayList c(ArrayList arrayList) {
        return l(arrayList, u1w0.DIRTY);
    }

    public static final ArrayList d(Collection collection) {
        return l(collection, u1w0.READY);
    }

    public static final t1w0 e(Collection collection) {
        return (t1w0) j5g.Z(l(collection, u1w0.READY));
    }

    public static final t1w0 f(Collection collection, WebView webView) {
        Object obj;
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((t1w0) obj).a == webView) {
                break;
            }
        }
        return (t1w0) obj;
    }

    public static final boolean h(ArrayList arrayList) {
        return l(arrayList, u1w0.READY).size() == arrayList.size();
    }

    public static final void i(t1w0 t1w0Var) {
        t1w0Var.a = k(t1w0Var.a.getContext(), fpf0.a(t1w0Var.a.getClass()));
        t1w0Var.b = u1w0.READY;
    }

    public static final void j(WebView webView) {
        webView.clearCache(true);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(null);
        webView.destroy();
    }

    public static final WebView k(Context context, dcy<? extends WebView> dcyVar) {
        return dcyVar.equals(fpf0.a(l6v0.class)) ? new l6v0(context) : new WebView(context);
    }

    public static final ArrayList l(Collection collection, u1w0 u1w0Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (((t1w0) obj).b == u1w0Var) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
