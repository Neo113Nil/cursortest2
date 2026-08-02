package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import xsna.pzl;

/* loaded from: classes10.dex */
public abstract class wo extends WebView {
    public final LinkedHashMap a;

    public /* synthetic */ wo(Context context) {
        this(context, null);
    }

    public final String a(String str) {
        return pzl.b(str, b(), "<body style='margin:0; padding:0;'>");
    }

    @Override // android.webkit.WebView
    public final void addJavascriptInterface(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
        this.a.put(str, obj);
    }

    public String b() {
        return "";
    }

    public void c() {
        om3.a((ViewGroup) this);
        Iterator it = this.a.keySet().iterator();
        while (it.hasNext()) {
            removeJavascriptInterface((String) it.next());
        }
        this.a.clear();
        destroy();
        getClass().toString();
    }

    public final void d() {
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        if (ub.a(11)) {
            settings.setAllowContentAccess(false);
            if (ub.a(16)) {
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            }
        }
    }

    @Override // android.webkit.WebView
    public final void removeJavascriptInterface(String str) {
        if (ub.a(11)) {
            super.removeJavascriptInterface(str);
        }
    }

    public final void setDisplayZoomControls(boolean z) {
        if (ub.a(11)) {
            getSettings().setDisplayZoomControls(z);
        }
    }

    public wo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new LinkedHashMap();
        d();
    }
}
