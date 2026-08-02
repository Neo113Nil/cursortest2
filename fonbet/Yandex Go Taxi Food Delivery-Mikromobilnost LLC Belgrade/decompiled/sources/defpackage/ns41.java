package defpackage;

import android.net.Uri;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes10.dex */
public final class ns41 {
    public final WebViewProviderBoundaryInterface a;

    public ns41(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.a = webViewProviderBoundaryInterface;
    }

    public final ygp0 a(String str, String[] strArr) {
        return new ygp0((ScriptHandlerBoundaryInterface) ei6.a(ScriptHandlerBoundaryInterface.class, this.a.addDocumentStartJavaScript(str, strArr)));
    }

    public final void b(ih41 ih41Var, Uri uri) {
        this.a.postMessageToMainFrame(new di6(new gh41(ih41Var)), uri);
    }
}
