package xsna;

import android.webkit.WebView;
import com.my.target.common.views.Html5View;
import com.vk.dto.common.id.UserId;
import ru.ok.tracer.opentelemetry.export.TracerOpenTelemetrySpanProcessor;
import xsna.shv;
import xsna.wuk0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class hhv implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hhv(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Html5View.g gVar = (Html5View.g) this.d;
                WebView webView = (WebView) this.e;
                String str = (String) this.c;
                Html5View html5View = Html5View.this;
                if (html5View.e == 1) {
                    html5View.e = 3;
                    gVar.a.a(webView, new shv.a(-8, "Html5 content loading timeout"), str);
                    break;
                }
                break;
            case 1:
                nke0 nke0Var = (nke0) this.d;
                String str2 = (String) this.c;
                gzs gzsVar = (gzs) this.e;
                nke0Var.i(str2);
                if (gzsVar != null) {
                    i0q0.f(gzsVar);
                    break;
                }
                break;
            case 2:
                fsk0 fsk0Var = (fsk0) this.d;
                eta0 eta0Var = (eta0) this.e;
                UserId userId = (UserId) this.c;
                try {
                    wwk wwkVar = fsk0Var.g;
                    if (wwkVar != null) {
                        m0q m0qVar = fsk0Var.e.get();
                        m0qVar.getClass();
                        qyp qypVar = new qyp(wuk0.a.b(new wuk0(m0qVar.b, m0qVar.c)), eta0Var);
                        String k = wwk.k(true);
                        wwkVar.h(k);
                        wwkVar.n(k, qypVar, userId);
                    }
                } catch (Throwable unused) {
                }
                try {
                    wwk wwkVar2 = fsk0Var.g;
                    if (wwkVar2 != null) {
                        m0q m0qVar2 = fsk0Var.f.get();
                        m0qVar2.getClass();
                        qyp qypVar2 = new qyp(wuk0.a.b(new wuk0(m0qVar2.b, m0qVar2.c)), eta0Var);
                        String k2 = wwk.k(false);
                        wwkVar2.h(k2);
                        wwkVar2.n(k2, qypVar2, userId);
                        break;
                    }
                } catch (Throwable unused2) {
                    String str3 = fsk0Var.c;
                    return;
                }
                break;
            default:
                TracerOpenTelemetrySpanProcessor.shutdown$lambda$3$lambda$2((v7i) this.d, (v7i) this.e, (v7i) this.c);
                break;
        }
    }

    public /* synthetic */ hhv(nke0 nke0Var, String str, gzs gzsVar) {
        this.b = 1;
        this.d = nke0Var;
        this.c = str;
        this.e = gzsVar;
    }
}
