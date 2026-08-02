package xsna;

import android.webkit.WebView;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import xsna.ce3;

/* compiled from: AppsLruCache.kt */
/* loaded from: classes11.dex */
public final class jf3 extends m900<Long, u13> {
    public final /* synthetic */ ce3.a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf3(ce3.a aVar) {
        super(2);
        this.a = aVar;
    }

    @Override // xsna.m900
    public final void entryRemoved(boolean z, Long l, u13 u13Var, u13 u13Var2) {
        final long longValue = l.longValue();
        final u13 u13Var3 = u13Var;
        u13 u13Var4 = u13Var2;
        final ce3.a aVar = this.a;
        if (u13Var4 != null) {
            if (u13Var3.b() != u13Var4.b()) {
                WebView b = u13Var3.b();
                u13Var3.a().getClass();
                if (b == null) {
                    return;
                }
                qro0.c(new eo2(b, "AndroidBridge", aVar, 1));
                return;
            }
            return;
        }
        final ce3 ce3Var = ce3.this;
        HashMap<Long, Collection<gzs<s3q0>>> hashMap = ce3Var.d;
        gzs<s3q0> gzsVar = new gzs() { // from class: xsna.be3
            @Override // xsna.gzs
            public final Object invoke() {
                u13 u13Var5 = u13Var3;
                WebView webView = u13Var5.a;
                u13Var5.b.getClass();
                if (webView != null) {
                    qro0.c(new eo2(webView, "AndroidBridge", ce3.a.this, 1));
                }
                ce3Var.f.removeMessages(0, Long.valueOf(longValue));
                return s3q0.a;
            }
        };
        if (!ce3Var.e(longValue)) {
            gzsVar.invoke();
            return;
        }
        Collection<gzs<s3q0>> collection = hashMap.get(Long.valueOf(longValue));
        if (collection == null) {
            collection = new LinkedHashSet<>();
            hashMap.put(Long.valueOf(longValue), collection);
        }
        collection.add(gzsVar);
    }
}
