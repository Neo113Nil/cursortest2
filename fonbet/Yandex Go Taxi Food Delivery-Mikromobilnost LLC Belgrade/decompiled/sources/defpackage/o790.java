package defpackage;

import android.webkit.WebView;
import com.yandex.go.platform.ui.components.SpinnerProgressView;
import com.yandex.go.platform.ui.components.errordialog.LoadErrorDialog;
import com.yandex.go.platform.web_view_client.a;
import java.util.Objects;

/* loaded from: classes13.dex */
public final class o790 extends x3 {
    public final n790 c;

    public o790(w040 w040Var, n790 n790Var) {
        super(12, w040Var);
        this.c = n790Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    @Override // defpackage.x3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final x3 Qg() {
        ujf0 ujf0Var;
        LoadErrorDialog loadErrorDialog;
        String url;
        n790 n790Var = this.c;
        Objects.toString(n790Var);
        w040 w040Var = (w040) this.b;
        tt41 g = ((a) w040Var.e).g();
        WebView webView = g.a;
        try {
            url = webView.getUrl();
        } catch (Exception unused) {
        }
        if (url != null && url.length() != 0) {
            webView.reload();
            ujf0Var = (ujf0) w040Var.c;
            if (ujf0Var instanceof rjf0) {
                if (ujf0Var instanceof tjf0) {
                    SpinnerProgressView spinnerProgressView = ((tjf0) ujf0Var).a;
                    spinnerProgressView.getSpinner().setAlpha(1.0f);
                    oj91.a(spinnerProgressView, 0L);
                }
            } else if (n790Var instanceof j790) {
                oj91.a(((rjf0) ujf0Var).a, 0L);
            } else if (n790Var instanceof l790) {
                SpinnerProgressView spinnerProgressView2 = ((rjf0) ujf0Var).b;
                spinnerProgressView2.getSpinner().setAlpha(1.0f);
                oj91.a(spinnerProgressView2, 0L);
            }
            h7o h7oVar = (h7o) w040Var.g;
            h7oVar.e.removeCallbacksAndMessages(null);
            loadErrorDialog = h7oVar.b;
            if (loadErrorDialog != null) {
                oj91.b(loadErrorDialog);
            }
            return new r790(w040Var, true);
        }
        webView.loadUrl(g.b);
        ujf0Var = (ujf0) w040Var.c;
        if (ujf0Var instanceof rjf0) {
        }
        h7o h7oVar2 = (h7o) w040Var.g;
        h7oVar2.e.removeCallbacksAndMessages(null);
        loadErrorDialog = h7oVar2.b;
        if (loadErrorDialog != null) {
        }
        return new r790(w040Var, true);
    }
}
