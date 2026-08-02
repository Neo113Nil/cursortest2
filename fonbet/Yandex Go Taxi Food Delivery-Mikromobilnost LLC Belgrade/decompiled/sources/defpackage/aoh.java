package defpackage;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.Toast;
import com.ybsdk.core.permissions.a;
import defpackage.ynh;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.net.URLDecoder;
import java.util.regex.Matcher;
import kotlin.Result;
import ru.yandex.taxi.analytics.j;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes11.dex */
public final /* synthetic */ class aoh implements DownloadListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aoh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:35|(1:37)(1:78)|38|(3:(3:72|73|(8:75|(1:42)|43|44|45|(1:47)|48|49))|48|49)|40|(0)|43|44|45|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0113, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0114, code lost:
    
        defpackage.x4c.g("Failed to get CookieManager instance", r0, null, null, 12);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011e  */
    @Override // android.webkit.DownloadListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        Matcher matcher;
        String decode;
        String str5;
        Object failure;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                mo41 mo41Var = (mo41) obj;
                ((a) mo41Var.b).a();
                String str6 = str4 == null ? "" : str4;
                j0g j0gVar = mo41Var.w;
                Context context = (Context) j0gVar.a;
                try {
                    if (str3 != null) {
                        try {
                            matcher = mo41.A.matcher(str3);
                        } catch (Exception unused) {
                            i5z0.a.j("failed decode filename", new Object[0]);
                        }
                        if (matcher.find()) {
                            decode = URLDecoder.decode(matcher.group(2), matcher.group(1));
                            if (decode == null) {
                                decode = URLUtil.guessFileName(str, str3, str6);
                            }
                            str5 = decode;
                            ((ynh.a) mo41Var.c).getClass();
                            CookieManager cookieManager = CookieManager.getInstance();
                            ((DownloadManager) mo41Var.z.getValue()).enqueue(new DownloadManager.Request(Uri.parse(str)).setMimeType(str6).setTitle(str5).setDescription(str3).setNotificationVisibility(1).addRequestHeader("Cookie", cookieManager != null ? cookieManager.getCookie(str) : null).addRequestHeader(ExtFunctionsKt.HEADER_USER_AGENT, str2).setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str5));
                            rje.l(dzh0.ybsdk_webview_documents_download_started, context);
                            ((tls) j0gVar.b).invoke(str);
                            break;
                        }
                    }
                    ((DownloadManager) mo41Var.z.getValue()).enqueue(new DownloadManager.Request(Uri.parse(str)).setMimeType(str6).setTitle(str5).setDescription(str3).setNotificationVisibility(1).addRequestHeader("Cookie", cookieManager != null ? cookieManager.getCookie(str) : null).addRequestHeader(ExtFunctionsKt.HEADER_USER_AGENT, str2).setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str5));
                    rje.l(dzh0.ybsdk_webview_documents_download_started, context);
                    ((tls) j0gVar.b).invoke(str);
                } catch (RuntimeException e) {
                    if (str != null && cvu0.x(str, Constants.KEY_DATA, false)) {
                        mo41Var.y.invoke(str, str5, str6);
                        return;
                    }
                    if (str != null && cvu0.x(str, "blob", false)) {
                        mo41Var.x.invoke(str, str5, str6);
                        return;
                    }
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Failed to enqueue a new download";
                    }
                    rje.l(dzh0.ybsdk_webview_documents_download_failed, context);
                    nl91.g(str, null, "Download failed", null, e, message, null, null, null, null, 1992);
                    return;
                }
                decode = null;
                if (decode == null) {
                }
                str5 = decode;
                ((ynh.a) mo41Var.c).getClass();
                CookieManager cookieManager2 = CookieManager.getInstance();
                break;
            case 1:
                xjg xjgVar = (xjg) obj;
                try {
                    Uri parse = Uri.parse(str);
                    DownloadManager.Request request = new DownloadManager.Request(parse);
                    request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(str));
                    request.addRequestHeader(ExtFunctionsKt.HEADER_USER_AGENT, str2);
                    request.setNotificationVisibility(1);
                    String lastPathSegment = parse != null ? parse.getLastPathSegment() : null;
                    if (lastPathSegment == null) {
                        ((j) ((lx4) xjgVar.c)).n("WEB_VIEW.ANALYTICS_EVENT_TOKEN.empty file name");
                    } else {
                        ((j) ((lx4) xjgVar.c)).n("WEB_VIEW.ANALYTICS_EVENT_TOKEN.file download started");
                        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, lastPathSegment);
                        ((DownloadManager) ((Context) xjgVar.b).getSystemService(DownloadManager.class)).enqueue(request);
                    }
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (!(failure instanceof Result.Failure)) {
                    Toast.makeText((Context) xjgVar.b, kyh0.common_loading, 1).show();
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    xby.l(jst.e, "WEB_VIEW.ERROR_TOKEN:DOWNLOAD_LISTENER_WEB_VIEW", null, a, "download listener error", 2);
                    break;
                }
                break;
            default:
                WebView webView = (WebView) obj;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    if (intent.resolveActivity(webView.getContext().getPackageManager()) != null) {
                        webView.getContext().startActivity(intent);
                        break;
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }
}
