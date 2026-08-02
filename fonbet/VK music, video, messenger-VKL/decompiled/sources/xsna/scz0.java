package xsna;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.my.target.common.views.Html5View;
import java.lang.ref.WeakReference;
import xsna.c9z0;
import xsna.shv;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class scz0 {
    public WeakReference a;
    public c9z0.a b;
    public WeakReference c;
    public final tbz0 d;
    public final izy0 e;
    public phv f;
    public b g;
    public long h;
    public final a i = new a();

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a extends Html5View.a {
        public a() {
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class b extends shv {
        public final shv a;

        public b(shv shvVar) {
            this.a = shvVar;
        }

        @Override // xsna.shv
        public final void a(WebView webView, shv.a aVar, String str) {
            String concat = "NativeAdHtmlController: Content JS error - ".concat(aVar.b);
            tbz0 tbz0Var = scz0.this.d;
            if (tbz0Var != null) {
                tbz0Var.T.c(999, 3009, concat);
            }
            gu8.c(null, concat);
            this.a.a(webView, aVar, str);
        }

        @Override // xsna.shv
        public final void b(WebView webView) {
            this.a.b(webView);
        }

        @Override // xsna.shv
        public final void c(WebView webView, String str, Bitmap bitmap) {
            this.a.c(webView, str, bitmap);
        }
    }

    public scz0(tbz0 tbz0Var) {
        this.d = tbz0Var;
        this.e = izy0.b(tbz0Var.b, tbz0Var.a, null);
    }
}
