package xsna;

import android.content.Context;
import android.webkit.WebView;
import com.vkontakte.android.R;
import java.io.File;

/* compiled from: VkUiDynamicWebViewProvider.kt */
/* loaded from: classes6.dex */
public class xvv0 extends uvv0 {
    public final Context c;
    public final boolean d;
    public final boolean e;
    public final s1w0 f;

    static {
        mgn0 mgn0Var = jgn0.a;
        if (mgn0Var == null) {
            mgn0Var = null;
        }
        new File(mgn0Var.b, "/cache/vkapps");
    }

    public xvv0(Context context, boolean z, boolean z2, s1w0 s1w0Var) {
        super(context, s1w0Var);
        this.c = context;
        this.d = z;
        this.e = z2;
        this.f = s1w0Var;
    }

    @Override // xsna.v1w0
    public final WebView create() {
        if (this.d || this.e) {
            try {
                return this.f.c(this.c, fpf0.a(l6v0.class));
            } catch (Exception e) {
                xgx0.a.getClass();
                xgx0.d(e);
                return null;
            }
        }
        try {
            WebView c = this.b.c(this.a, fpf0.a(WebView.class));
            c.setId(R.id.vk_browser_web_view);
            c.setOverScrollMode(2);
            c.setBackgroundColor(0);
            return c;
        } catch (Exception e2) {
            xgx0.a.getClass();
            xgx0.d(e2);
            return null;
        }
    }
}
