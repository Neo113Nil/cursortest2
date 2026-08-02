package xsna;

import android.app.Activity;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.ArrayList;
import org.json.JSONObject;
import xsna.rhz0;
import xsna.u7z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class qbz0 {
    public w4z0 c;
    public rhz0 d;
    public boolean e;
    public boolean f;
    public final a b = new a();
    public final String a = "interstitial";

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class b extends WebChromeClient {
        public b() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            gu8.c(null, "MraidBridge: JS console message - " + consoleMessage.message() + " - at line " + consoleMessage.lineNumber());
            if (qbz0.this.c == null) {
                return super.onConsoleMessage(consoleMessage);
            }
            gu8.c(null, "InterstitialMraidPresenter: Console message - " + consoleMessage.message());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            if (qbz0.this.c == null) {
                return super.onJsAlert(webView, str, str2, jsResult);
            }
            gu8.c(null, "InterstitialMraidPresenter: JS Alert - " + str2);
            jsResult.confirm();
            return true;
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class c implements rhz0.a {
        public c() {
        }
    }

    public static String a(Rect rect) {
        return rect.left + StringUtils.COMMA + rect.top + StringUtils.COMMA + rect.width() + StringUtils.COMMA + rect.height();
    }

    public static String g(Rect rect) {
        return rect.width() + StringUtils.COMMA + rect.height();
    }

    public final void b(Uri uri) {
        w4z0 w4z0Var;
        String scheme = uri.getScheme();
        String host = uri.getHost();
        JSONObject jSONObject = null;
        if ("mytarget".equals(scheme)) {
            if ("onloadmraidjs".equals(host)) {
                gu8.c(null, "MraidBridge: JS call onLoad");
            }
            gu8.c(null, "MraidBridge: Got mytarget scheme - " + uri);
            return;
        }
        if (!CampaignEx.JSON_KEY_MRAID.equals(scheme)) {
            try {
                new URI(uri.toString());
                rhz0 rhz0Var = this.d;
                if (rhz0Var == null || !rhz0Var.f || (w4z0Var = this.c) == null) {
                    return;
                }
                w4z0Var.b(uri);
                return;
            } catch (Throwable unused) {
                gu8.c(null, "MraidBridge: Invalid MRAID URL - " + uri);
                d("", "Mraid command sent an invalid URL");
                return;
            }
        }
        if (host.contains(StringUtils.COMMA)) {
            host = host.substring(0, host.indexOf(StringUtils.COMMA)).trim();
        }
        gu8.c(null, "MraidBridge: Got mraid command - " + uri);
        String uri2 = uri.toString();
        soj sojVar = new soj(host, this.a);
        StringBuilder sb = new StringBuilder("mraidbridge.nativeComplete(");
        String str = sojVar.d;
        sb.append(JSONObject.quote(str));
        sb.append(")");
        c(sb.toString());
        int indexOf = uri2.indexOf("{");
        int lastIndexOf = uri2.lastIndexOf("}") + 1;
        if (indexOf >= 0 && lastIndexOf > 0 && indexOf < lastIndexOf) {
            try {
                if (lastIndexOf <= uri2.length()) {
                    jSONObject = new JSONObject(uri2.substring(indexOf, lastIndexOf));
                }
            } catch (Throwable th) {
                d(str, th.getMessage());
                return;
            }
        }
        e(sojVar, jSONObject);
    }

    public final void c(String str) {
        if (this.d == null) {
            wga0.b("MraidBridge: Attempted to inject Javascript into MRAID WebView while was not attached - \n\t", str, null);
            return;
        }
        String a2 = zr.a("javascript:window.", str, ";");
        gu8.c(null, "MraidBridge: Injecting Javascript into MRAID WebView " + hashCode() + " - " + a2);
        this.d.b(a2);
    }

    public final void d(String str, String str2) {
        c("mraidbridge.fireErrorEvent(" + JSONObject.quote(str2) + ", " + JSONObject.quote(str) + ")");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void e(soj sojVar, JSONObject jSONObject) {
        char c2;
        boolean z;
        ycy ycyVar;
        int i;
        Integer num;
        String str;
        u7z0.a aVar;
        rhz0 rhz0Var;
        String str2 = sojVar.d;
        if (sojVar.c && (rhz0Var = this.d) != null && !rhz0Var.f) {
            d(str2, "Cannot execute this command unless the user clicks");
        }
        if (this.c == null) {
            d(str2, "Invalid state to execute this command");
            return;
        }
        if (this.d == null) {
            d(str2, "The current WebView is being destroyed");
            return;
        }
        str2.getClass();
        int i2 = -1;
        switch (str2.hashCode()) {
            case -1910759310:
                if (str2.equals("vpaidInit")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1886160473:
                if (str2.equals("playVideo")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1289167206:
                if (str2.equals("expand")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -934437708:
                if (str2.equals("resize")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -733616544:
                if (str2.equals("createCalendarEvent")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 0:
                if (str2.equals("")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 3417674:
                if (str2.equals("open")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 94756344:
                if (str2.equals(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 133423073:
                if (str2.equals("setOrientationProperties")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 459238621:
                if (str2.equals("storePicture")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 624734601:
                if (str2.equals("setResizeProperties")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 892543864:
                if (str2.equals("vpaidEvent")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 1797992422:
                if (str2.equals("playheadEvent")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                this.c.s = true;
                break;
            case 1:
                gu8.c(null, "MraidBridge: playVideo is currently unsupported");
                break;
            case 2:
                if (jSONObject != null) {
                    Uri.parse(jSONObject.getString("url"));
                }
                this.c.getClass();
                gu8.c(null, "InterstitialMraidPresenter: Expand method not used with interstitials");
                break;
            case 3:
                this.c.getClass();
                gu8.c(null, "InterstitialMraidPresenter: Resize method not used with interstitials");
                break;
            case 4:
                gu8.c(null, "MraidBridge: createCalendarEvent is currently unsupported");
                break;
            case 5:
                d(str2, "Unspecified MRAID Javascript command");
                break;
            case 6:
                if (jSONObject != null) {
                    this.c.b(Uri.parse(jSONObject.getString("url")));
                    break;
                } else {
                    d(str2, "open params cannot be null");
                    break;
                }
            case 7:
                this.c.h();
                break;
            case '\b':
                if (jSONObject != null) {
                    boolean z2 = jSONObject.getBoolean("allowOrientationChange");
                    String string = jSONObject.getString("forceOrientation");
                    string.getClass();
                    switch (string.hashCode()) {
                        case 3387192:
                            if (string.equals("none")) {
                                z = false;
                                break;
                            }
                            z = -1;
                            break;
                        case 729267099:
                            if (string.equals(X3.i.D)) {
                                z = true;
                                break;
                            }
                            z = -1;
                            break;
                        case 1430647483:
                            if (string.equals(X3.i.C)) {
                                z = 2;
                                break;
                            }
                            z = -1;
                            break;
                        default:
                            z = -1;
                            break;
                    }
                    switch (z) {
                        case false:
                            ycyVar = new ycy(string, i2);
                            break;
                        case true:
                            i2 = 1;
                            ycyVar = new ycy(string, i2);
                            break;
                        case true:
                            i2 = 0;
                            ycyVar = new ycy(string, i2);
                            break;
                        default:
                            ycyVar = null;
                            break;
                    }
                    if (ycyVar != null) {
                        w4z0 w4z0Var = this.c;
                        qbz0 qbz0Var = w4z0Var.f;
                        WeakReference weakReference = w4z0Var.g;
                        if (!w4z0Var.c(ycyVar)) {
                            qbz0Var.d("setOrientationProperties", "Unable to force orientation to " + ycyVar);
                            break;
                        } else {
                            w4z0Var.t = z2;
                            w4z0Var.u = ycyVar;
                            if (!"none".equals((String) ycyVar.d)) {
                                w4z0Var.f(w4z0Var.u.c);
                                break;
                            } else if (!w4z0Var.t) {
                                Activity activity = (Activity) weakReference.get();
                                if (activity != null) {
                                    int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
                                    int i3 = activity.getResources().getConfiguration().orientation;
                                    if (1 == i3) {
                                        if (rotation != 1 && rotation != 2) {
                                            i = 1;
                                        }
                                        i = 9;
                                    } else if (2 == i3) {
                                        i = (rotation == 2 || rotation == 3) ? 8 : 0;
                                    } else {
                                        gu8.c(null, "UiUtils: Unknown screen orientation. Defaulting to portrait");
                                        i = 9;
                                    }
                                    w4z0Var.f(i);
                                    break;
                                } else {
                                    qbz0Var.d("setOrientationProperties", "Unable to set MRAID expand orientation to 'none'; expected passed in Activity Context.");
                                    break;
                                }
                            } else {
                                Activity activity2 = (Activity) weakReference.get();
                                if (activity2 != null && (num = w4z0Var.k) != null) {
                                    activity2.setRequestedOrientation(num.intValue());
                                }
                                w4z0Var.k = null;
                                break;
                            }
                        }
                    } else {
                        d(str2, "wrong orientation ".concat(string));
                        break;
                    }
                } else {
                    d(str2, "setOrientationProperties params cannot be null");
                    break;
                }
                break;
            case '\t':
                gu8.c(null, "MraidBridge: storePicture is currently unsupported");
                break;
            case '\n':
                if (jSONObject != null) {
                    jSONObject.getInt("width");
                    jSONObject.getInt("height");
                    jSONObject.getInt("offsetX");
                    jSONObject.getInt("offsetY");
                    jSONObject.optBoolean("allowOffscreen", false);
                    String optString = jSONObject.optString("customClosePosition");
                    if (optString != null) {
                        switch (optString.hashCode()) {
                            case -1364013995:
                                str = TtmlNode.CENTER;
                                optString.equals(str);
                                break;
                            case -1314880604:
                                optString.equals(X3.e.b);
                                break;
                            case -1012429441:
                                str = X3.e.c;
                                optString.equals(str);
                                break;
                            case -655373719:
                                str = X3.e.e;
                                optString.equals(str);
                                break;
                            case 1163912186:
                                str = X3.e.d;
                                optString.equals(str);
                                break;
                            case 1288627767:
                                str = "bottom-center";
                                optString.equals(str);
                                break;
                            case 1755462605:
                                str = "top-center";
                                optString.equals(str);
                                break;
                        }
                    }
                    this.c.getClass();
                    gu8.c(null, "InterstitialMraidPresenter: SetResizeProperties method not used with interstitials");
                    break;
                } else {
                    d(str2, "setResizeProperties params cannot be null");
                    break;
                }
            case 11:
                if (jSONObject != null) {
                    String string2 = jSONObject.getString(NotificationCompat.CATEGORY_EVENT);
                    w4z0 w4z0Var2 = this.c;
                    if (!w4z0Var2.s) {
                        w4z0Var2.f.d("vpaidEvent", "Calling VPAID command before VPAID init");
                        break;
                    } else {
                        u7z0.a aVar2 = w4z0Var2.n;
                        boolean z3 = aVar2 != null;
                        nxy0 nxy0Var = w4z0Var2.o;
                        if (z3 & (nxy0Var != null)) {
                            aVar2.h(nxy0Var, string2);
                            break;
                        }
                    }
                } else {
                    d(str2, "vpaidEvent params cannot be null");
                    break;
                }
                break;
            case '\f':
                if (jSONObject != null) {
                    float f = (float) jSONObject.getDouble("remain");
                    float f2 = (float) jSONObject.getDouble("duration");
                    w4z0 w4z0Var3 = this.c;
                    if (!w4z0Var3.s) {
                        w4z0Var3.f.d("playheadEvent", "Calling VPAID command before VPAID init");
                        break;
                    } else if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (aVar = w4z0Var3.n) != null && w4z0Var3.o != null) {
                        aVar.a(f, f2);
                        break;
                    }
                } else {
                    d(str2, "playheadEvent params cannot be null");
                    break;
                }
                break;
        }
    }

    public final void f(boolean z) {
        if (z != this.f) {
            c("mraidbridge.setIsViewable(" + z + ")");
        }
        this.f = z;
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a extends uxy0 {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            rhz0 rhz0Var;
            nxy0 nxy0Var;
            View view;
            qbz0 qbz0Var = qbz0.this;
            if (qbz0Var.e || (rhz0Var = qbz0Var.d) == null) {
                return;
            }
            qbz0Var.e = true;
            w4z0 w4z0Var = qbz0Var.c;
            if (w4z0Var != null) {
                WebView webView2 = rhz0Var.getWebView();
                w4z0Var.j = BuildConfig.FLAVOR;
                w4z0Var.j();
                ArrayList arrayList = new ArrayList();
                Activity activity = (Activity) w4z0Var.g.get();
                if (activity != null && (view = w4z0Var.m) != null) {
                    while (true) {
                        if (!view.isHardwareAccelerated() || (view.getLayerType() & 1) != 0) {
                            break;
                        }
                        if (view.getParent() instanceof View) {
                            view = (View) view.getParent();
                        } else {
                            Window window = activity.getWindow();
                            if (window != null && (window.getAttributes().flags & C.DEFAULT_MUXED_BUFFER_SIZE) != 0) {
                                arrayList.add("'inlineVideo'");
                            }
                        }
                    }
                }
                arrayList.add("'vpaid'");
                qbz0Var.c("mraidbridge.setSupports(" + TextUtils.join(StringUtils.COMMA, arrayList) + ")");
                qbz0Var.c("mraidbridge.setPlacementType(" + JSONObject.quote("interstitial") + ")");
                rhz0 rhz0Var2 = qbz0Var.d;
                qbz0Var.f(rhz0Var2 != null && rhz0Var2.e);
                w4z0Var.g(BuildConfig.FLAVOR);
                qbz0Var.c("mraidbridge.fireReadyEvent()");
                mgz0 mgz0Var = w4z0Var.e;
                StringBuilder sb = new StringBuilder("mraidbridge.setScreenSize(");
                sb.append(qbz0.g(mgz0Var.b));
                sb.append(");window.mraidbridge.setMaxSize(");
                sb.append(qbz0.g(mgz0Var.h));
                sb.append(");window.mraidbridge.setCurrentPosition(");
                Rect rect = mgz0Var.d;
                sb.append(qbz0.a(rect));
                sb.append(");window.mraidbridge.setDefaultPosition(");
                sb.append(qbz0.a(mgz0Var.f));
                sb.append(")");
                qbz0Var.c(sb.toString());
                qbz0Var.c("mraidbridge.fireSizeChangeEvent(" + qbz0.g(rect) + ")");
                u7z0.a aVar = w4z0Var.n;
                if (aVar == null || (nxy0Var = w4z0Var.o) == null) {
                    return;
                }
                aVar.j(nxy0Var, w4z0Var.d);
                w4z0Var.n.a(webView2);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            wga0.b("MraidBridge: Error - ", str, null);
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            qbz0.this.b(Uri.parse(str));
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            qbz0.this.b(webResourceRequest.getUrl());
            return true;
        }
    }
}
