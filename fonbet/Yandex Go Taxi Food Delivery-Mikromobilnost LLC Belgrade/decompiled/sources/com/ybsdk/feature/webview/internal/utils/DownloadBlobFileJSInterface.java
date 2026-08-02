package com.ybsdk.feature.webview.internal.utils;

import android.content.Context;
import android.webkit.JavascriptInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.p;
import defpackage.aj51;
import defpackage.b64;
import defpackage.boh;
import defpackage.dzh0;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.j0g;
import defpackage.mdh;
import defpackage.rje;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.uyj;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import ru.CryptoPro.JCP.tools.HexString;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/webview/internal/utils/DownloadBlobFileJSInterface;", "", "", "base64Data", "fileName", "mimetype", "Lzy11;", "saveBlobFile", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "feature-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DownloadBlobFileJSInterface {
    public final Context a;
    public final j0g b;
    public final p c;

    public DownloadBlobFileJSInterface(FragmentActivity fragmentActivity, j0g j0gVar, p pVar) {
        this.a = fragmentActivity;
        this.b = j0gVar;
        this.c = pVar;
    }

    public static void d(aj51 aj51Var) {
        ((boh) aj51Var).k("bank_sdk_web_view_android");
    }

    public final void a(aj51 aj51Var, String str, String str2, String str3) {
        ((boh) aj51Var).a.loadUrl(g8e.r(b64.v("\n            javascript:\n                var xhr = new XMLHttpRequest();\n                xhr.open('GET', '", str, "', true);\n                xhr.setRequestHeader('Content-type','", str3, "');\n                xhr.responseType = 'blob';\n                xhr.onload = function(e) {\n                    if (this.status == 200) {\n                        var blob = this.response;\n                        var reader = new FileReader();\n                        reader.readAsDataURL(blob);\n                        reader.onloadend = function() {\n                            base64data = reader.result;\n                            bank_sdk_web_view_android.saveBlobFile(base64data, \""), str2, "\", \"", str3, "\");\n                        }\n                    }\n                };\n                xhr.send();\n        "));
        j0g j0gVar = this.b;
        rje.l(dzh0.ybsdk_webview_documents_download_started, (Context) j0gVar.a);
        ((tls) j0gVar.b).invoke(str);
    }

    public final void b(String str, String str2, String str3) {
        Object failure;
        try {
            failure = (String) evu0.Y(str, new char[]{HexString.CHAR_COMMA}, 0, 6).get(1);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (!(failure instanceof Result.Failure)) {
            saveBlobFile((String) failure, str2, str3);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            String localizedMessage = a.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "Error for download from data URL";
            }
            j0g.y(this.b, localizedMessage, a, 2);
        }
    }

    public final void c(aj51 aj51Var) {
        ((boh) aj51Var).a(this, "bank_sdk_web_view_android");
    }

    @JavascriptInterface
    public final void saveBlobFile(String base64Data, String fileName, String mimetype) {
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
        sjh sjhVar = uyj.a;
        tje.N(this.c, mdh.b, null, new DownloadBlobFileJSInterface$saveBlobFile$1(this, format, fileName, mimetype, base64Data, null), 2);
    }
}
