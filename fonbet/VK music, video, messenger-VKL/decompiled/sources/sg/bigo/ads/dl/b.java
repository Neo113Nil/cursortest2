package sg.bigo.ads.dl;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import sg.bigo.ads.an.i;
import sg.bigo.ads.api.core.u;
import sg.bigo.ads.dk.d;
import sg.bigo.ads.dk.e;
import sg.bigo.ads.dk.f;

/* loaded from: classes9.dex */
public final class b extends sg.bigo.ads.dm.b implements sg.bigo.ads.dk.a {

    @Nullable
    e a;

    @Nullable
    a b;
    Runnable c;
    public u d;

    @Nullable
    sg.bigo.ads.cd.a e;
    AtomicBoolean f;
    private final String k;
    private final f l;
    private final String m;
    private final int n;
    private final int o;
    private final int p;

    @NonNull
    private final i q;
    private final AtomicBoolean r;
    private boolean s;

    public interface a {
        void a();
    }

    public b(Context context, String str, int i, int i2, @NonNull f fVar, @Nullable String str2, int i3, u uVar) {
        super(context);
        this.q = new i();
        this.f = new AtomicBoolean(false);
        this.s = true;
        this.k = str;
        this.o = i;
        this.p = i2;
        this.l = fVar;
        this.m = str2;
        this.n = i3;
        this.d = uVar;
        this.r = new AtomicBoolean(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setMediaPlaybackRequiresUserGesture(true);
        setScrollContainer(false);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setBackgroundColor(0);
        this.e = new sg.bigo.ads.cd.a(getContext());
        setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.dl.b.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                b.this.f.set(false);
                b.this.e.onTouchEvent(motionEvent);
                return false;
            }
        });
        setWebViewClient(new c(str) { // from class: sg.bigo.ads.dl.b.2
            @Override // sg.bigo.ads.dl.c, sg.bigo.ads.dm.d
            public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                b bVar = b.this;
                sg.bigo.ads.bn.a.a(0, "VPAIDWebView", (renderProcessGoneDetail == null || !renderProcessGoneDetail.didCrash()) ? "Render process is gone" : "Render process has crashed");
                a aVar = bVar.b;
                if (aVar != null) {
                    aVar.a();
                }
            }

            @Override // sg.bigo.ads.dm.d, android.webkit.WebViewClient
            public final void onPageFinished(@NonNull WebView webView, @NonNull String str3) {
                super.onPageFinished(webView, str3);
                sg.bigo.ads.bn.a.a(0, "VPAIDWebView", "onPageFinished: ".concat(String.valueOf(str3)));
                if (b.this.r.compareAndSet(false, true)) {
                    final b bVar = b.this;
                    final ValueCallback<String> valueCallback = new ValueCallback<String>() { // from class: sg.bigo.ads.dl.b.2.1
                        @Override // android.webkit.ValueCallback
                        public final /* synthetic */ void onReceiveValue(String str4) {
                            String str5 = str4;
                            b.this.d.b(1);
                            u uVar2 = b.this.d;
                            if (str5 == null) {
                                str5 = "";
                            }
                            uVar2.a = str5;
                        }
                    };
                    bVar.d.a(1);
                    bVar.evaluateJavascript("window.vpaidwrapper.handshakeVersion('2.0')", new ValueCallback<String>() { // from class: sg.bigo.ads.dl.b.6
                        @Override // android.webkit.ValueCallback
                        public final /* bridge */ /* synthetic */ void onReceiveValue(String str4) {
                            valueCallback.onReceiveValue(str4);
                        }
                    });
                    b.this.b();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(@NonNull WebView webView, int i4, @NonNull String str3, @NonNull String str4) {
                sg.bigo.ads.bn.a.a(0, "VPAIDWebView", "Error: ".concat(String.valueOf(str3)));
                super.onReceivedError(webView, i4, str3, str4);
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(@NonNull WebView webView, String str3) {
                HashMap hashMap;
                String str4;
                sg.bigo.ads.cd.a aVar;
                b bVar = b.this;
                try {
                    Uri parse = Uri.parse(str3);
                    if (parse != null) {
                        String scheme = parse.getScheme();
                        String host = parse.getHost();
                        if (host != null) {
                            if ("vpaid".equals(scheme) || (aVar = bVar.e) == null || !aVar.a.a) {
                                hashMap = new HashMap();
                                for (String str5 : parse.getQueryParameterNames()) {
                                    hashMap.put(str5, TextUtils.join(StringUtils.COMMA, parse.getQueryParameters(str5)));
                                }
                                switch (host) {
                                    case "onAdSkippableStateChange":
                                    case "onAdUserAcceptInvitation":
                                    case "onAdUserMinimize":
                                        e eVar = bVar.a;
                                        break;
                                    case "onAdVideoStart":
                                        bVar.d.b(3);
                                        e eVar2 = bVar.a;
                                        if (eVar2 != null) {
                                            eVar2.b();
                                            break;
                                        }
                                        break;
                                    case "onAdLog":
                                        if (bVar.a != null) {
                                            hashMap.get("message");
                                            break;
                                        }
                                        break;
                                    case "onAdVideoMidpoint":
                                        e eVar3 = bVar.a;
                                        if (eVar3 != null) {
                                            eVar3.d();
                                            break;
                                        }
                                        break;
                                    case "onAdExpandedChange":
                                        if (bVar.a != null) {
                                            str4 = "expanded";
                                            d.c((String) hashMap.get(str4));
                                            break;
                                        }
                                        break;
                                    case "onAdVideoFirstQuartile":
                                        e eVar4 = bVar.a;
                                        if (eVar4 != null) {
                                            eVar4.c();
                                            break;
                                        }
                                        break;
                                    case "onAdDurationChange":
                                        e eVar5 = bVar.a;
                                        if (eVar5 != null) {
                                            eVar5.a((int) d.b((String) hashMap.get("duration")));
                                            break;
                                        }
                                        break;
                                    case "onStartAd":
                                        e eVar6 = bVar.a;
                                        if (eVar6 != null) {
                                            eVar6.i();
                                            break;
                                        }
                                        break;
                                    case "onAdVideoComplete":
                                        e eVar7 = bVar.a;
                                        if (eVar7 != null) {
                                            eVar7.f();
                                            break;
                                        }
                                        break;
                                    case "onAdClickThru":
                                        bVar.d.a((String) hashMap.get("url"), (String) hashMap.get("id"), d.c((String) hashMap.get("playerHandles")));
                                        if (bVar.a != null && bVar.f.compareAndSet(false, true)) {
                                            bVar.a.a((String) hashMap.get("url"), (String) hashMap.get("id"), d.c((String) hashMap.get("playerHandles")));
                                            break;
                                        }
                                        break;
                                    case "onAdPlaying":
                                        e eVar8 = bVar.a;
                                        if (eVar8 != null) {
                                            eVar8.h();
                                            break;
                                        }
                                        break;
                                    case "onAdImpression":
                                        bVar.d.b(4);
                                        e eVar9 = bVar.a;
                                        if (eVar9 != null) {
                                            eVar9.a();
                                            break;
                                        }
                                        break;
                                    case "onAdError":
                                        sg.bigo.ads.bh.d.a(bVar.c);
                                        e eVar10 = bVar.a;
                                        if (eVar10 != null) {
                                            eVar10.a((String) hashMap.get("message"));
                                            break;
                                        }
                                        break;
                                    case "onAdLinearChange":
                                        if (bVar.a != null) {
                                            str4 = "adLinear";
                                            d.c((String) hashMap.get(str4));
                                            break;
                                        }
                                        break;
                                    case "VPAIDCreativeError":
                                        sg.bigo.ads.bn.a.a(0, "VPAIDWebView", "VPAID error, command=" + ((String) hashMap.get("command")) + ", message=" + ((String) hashMap.get(NotificationCompat.CATEGORY_MESSAGE)) + ", try to rePrepareAd.");
                                        bVar.b();
                                        break;
                                    case "onAdLoaded":
                                        sg.bigo.ads.bh.d.a(bVar.c);
                                        bVar.d.b(2);
                                        e eVar11 = bVar.a;
                                        if (eVar11 != null) {
                                            eVar11.g();
                                            break;
                                        }
                                        break;
                                    case "onAdPaused":
                                        e eVar12 = bVar.a;
                                        if (eVar12 != null) {
                                            eVar12.l();
                                            break;
                                        }
                                        break;
                                    case "onSkipAd":
                                        e eVar13 = bVar.a;
                                        if (eVar13 != null) {
                                            eVar13.k();
                                            break;
                                        }
                                        break;
                                    case "onStopAd":
                                        e eVar14 = bVar.a;
                                        if (eVar14 != null) {
                                            eVar14.j();
                                            break;
                                        }
                                        break;
                                    case "onAdRemainingTimeChange":
                                        if (bVar.a != null) {
                                            d.b((String) hashMap.get("remaining"));
                                            break;
                                        }
                                        break;
                                    case "onAdVideoThirdQuartile":
                                        e eVar15 = bVar.a;
                                        if (eVar15 != null) {
                                            eVar15.e();
                                            break;
                                        }
                                        break;
                                    case "onAdSizeChange":
                                        e eVar16 = bVar.a;
                                        if (eVar16 != null) {
                                            eVar16.a(d.a((String) hashMap.get(Logger.METHOD_W)), d.a((String) hashMap.get("h")));
                                            break;
                                        }
                                        break;
                                    case "onAdInteraction":
                                        if (bVar.a != null) {
                                            hashMap.get("id");
                                            break;
                                        }
                                        break;
                                    case "onAdVolumeChange":
                                        e eVar17 = bVar.a;
                                        if (eVar17 != null) {
                                            eVar17.a(d.a((String) hashMap.get("volume")));
                                            break;
                                        }
                                        break;
                                    case "onAdUserClose":
                                        e eVar18 = bVar.a;
                                        if (eVar18 != null) {
                                            eVar18.m();
                                            break;
                                        }
                                        break;
                                }
                                bVar.a("window.vpaidwrapper.nativeCallComplete(" + JSONObject.quote(host) + ")");
                            } else if (bVar.a != null && bVar.f.compareAndSet(false, true)) {
                                bVar.d.a(str3, "", false);
                                bVar.a.a(str3, "", false);
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                return true;
            }
        });
        setWebChromeClient(new sg.bigo.ads.dm.c() { // from class: sg.bigo.ads.dl.b.3
            @Override // android.webkit.WebChromeClient
            public final boolean onConsoleMessage(@NonNull ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }
        });
        sg.bigo.ads.bh.d.a(this.c);
        if (this.c == null) {
            this.c = new Runnable() { // from class: sg.bigo.ads.dl.b.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (b.this.a != null) {
                        b.this.a.a("vpaid prepare timeout");
                    }
                }
            };
        }
        sg.bigo.ads.bh.d.a(3, this.c, 15000L);
        loadDataWithBaseURL("http://127.0.0.1/", "<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title>VPAID AD</title>\n    <script>\n        window.onload = function() {\n            tryToPrepareAd();\n        }\n\n        document.onreadystatechange = function() {\n            tryToPrepareAd();\n        }\n\n        function tryToPrepareAd() {\n            if (document.readyState != \"complete\") {\n                return;\n            }\n\n            if (window.vpaidwrapper && window.vpaidwrapper.isVPAIDCreativeReady()) {\n                return;\n            }\n\n            window.vpaidframe = document.getElementById(\"vpaid-iframe\");\n            if (window.vpaidframe) {\n                var fn = window.vpaidframe.contentWindow['getVPAIDAd'];\n                var vpaidDiv = document.getElementById(\"vpaid-container\");\n                var vpaidframeDoc = window.vpaidframe.contentDocument || window.vpaidframe.contentWindow.document;\n                var slot = vpaidframeDoc.getElementById(\"slot\");\n                var videoSlot = document.getElementById(\"video-slot\");\n                var vpaidwrapper;\n                if (fn && typeof fn == 'function') {\n                    vpaidwrapper = new VPAIDWrapper(fn(), vpaidDiv, slot, videoSlot)\n                } else {\n                    vpaidwrapper = new VPAIDWrapper();\n                }\n                window.vpaidwrapper = vpaidwrapper;\n            }\n        }\n    </script>\n    <script src=\"vpaid.js\" type=\"text/javascript\"></script>\n</head>\n\n<body style=\"display: flex; justify-content: center; align-items: center;\">\n<div id=\"ad-container\">\n    <video height=\"100%\" id=\"video-slot\" muted playsinline width=\"100%\"></video>\n</div>\n<div id=\"vpaid-container\"\n     style=\"position: absolute; width: 100%; height: 100%; margin: 0px; padding: 0px; border: none;\">\n    <iframe frameborder=\"0\" height=\"100%\" id=\"vpaid-iframe\" marginheight=\"0\" marginwidth=\"0\"\n            scrolling=\"no\"\n            src=\"vpaid_iframe.html\"\n            style=\"margin: 0px; padding: 0px; border: none;\"\n            width=\"100%\"></iframe>\n</div>\n</body>\n</html>", "text/html", C.UTF8_NAME, null);
        setLayoutParams((i3 == 1 || i3 == 4) ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-1, -2, 17));
    }

    @Nullable
    private String b(@NonNull String str) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final String[] strArr = new String[1];
        evaluateJavascript(str, new ValueCallback<String>() { // from class: sg.bigo.ads.dl.b.5
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(String str2) {
                countDownLatch.countDown();
                strArr[0] = str2;
            }
        });
        try {
            countDownLatch.await(1L, TimeUnit.SECONDS);
        } catch (Exception unused) {
        }
        return strArr[0];
    }

    @Override // sg.bigo.ads.dm.e, android.webkit.WebView
    public final void destroy() {
        super.destroy();
        setWebChromeClient(null);
        setWebViewClient(null);
    }

    @Override // sg.bigo.ads.dm.e, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            this.q.b = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (motionEvent.getActionMasked() == 0) {
            this.q.a = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        return this.s && super.dispatchTouchEvent(motionEvent);
    }

    public final String getAdCompanions() {
        return b("window.vpaidwrapper.getAdCompanions()");
    }

    public final int getAdDuration() {
        return (int) d.b(b("window.vpaidwrapper.getAdDuration()"));
    }

    public final boolean getAdExpanded() {
        return d.c(b("window.vpaidwrapper.getAdExpanded()"));
    }

    public final int getAdHeight() {
        return d.a(b("window.vpaidwrapper.getAdHeight()"));
    }

    public final boolean getAdIcons() {
        return d.c(b("window.vpaidwrapper.getAdIcons()"));
    }

    public final boolean getAdLinear() {
        return d.c(b("window.vpaidwrapper.getAdLinear()"));
    }

    public final int getAdRemainingTime() {
        return (int) d.b(b("window.vpaidwrapper.getAdRemainingTime()"));
    }

    public final boolean getAdSkippableState() {
        return d.c(b("window.vpaidwrapper.getAdSkippableState()"));
    }

    public final float getAdVolume() {
        return d.b(b("window.vpaidwrapper.getAdVolume()"));
    }

    public final int getAdWidth() {
        return d.a(b("window.vpaidwrapper.getAdWidth()"));
    }

    @NonNull
    public final i getClickPoints() {
        return this.q;
    }

    @Nullable
    public final e getVPAIDEvenListener() {
        return this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (r0 != 4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        if (r1 < (r3 * r5)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        r7 = (r3 * r5) / r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        if (r1 >= (r3 * r5)) goto L34;
     */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.o <= 0 || this.p <= 0) {
            sg.bigo.ads.bn.a.a(0, "VPAIDWebView", "video width or height is invalidate");
            return;
        }
        sg.bigo.ads.bn.a.a(0, "VPAIDWebView", "onMeasure，mVideoWidth=" + this.o + ", mVideoHeight=" + this.p);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 0 || mode == 1073741824) {
            int i5 = this.n;
            if (i5 == 1 || i5 == 2 || i5 == 4) {
                double measuredWidth = getMeasuredWidth();
                double measuredHeight = getMeasuredHeight();
                sg.bigo.ads.common.utils.f.c(getContext());
                if (measuredWidth > ConnectivityTracker.DEFAULT_UPLINK_BITRATE || measuredHeight > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    if (measuredWidth > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        if (measuredHeight <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            measuredHeight = (this.p * measuredWidth) / this.o;
                        } else {
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    i3 = this.o;
                                    double d = i3 * measuredHeight;
                                    i4 = this.p;
                                }
                            }
                            i3 = this.o;
                            double d2 = i3 * measuredHeight;
                            i4 = this.p;
                        }
                    }
                    measuredWidth = (this.o * measuredHeight) / this.p;
                } else {
                    measuredWidth = this.o;
                    measuredHeight = this.p;
                }
                b((int) measuredWidth, (int) measuredHeight);
            } else {
                b(size, (int) (((this.p * 1.0f) * size) / this.o));
            }
            super.onMeasure(i, i2);
        }
    }

    public final void setAdVolume(float f) {
        a("window.vpaidwrapper.setAdVolume(" + f + ")");
    }

    public final void setOnRenderProcessGoneListener(@Nullable a aVar) {
        this.b = aVar;
    }

    public final void setVPAIDClickable(boolean z) {
        this.s = z;
    }

    public final void setVPAIDEvenListener(@Nullable e eVar) {
        this.a = eVar;
    }

    @Override // sg.bigo.ads.ak.a
    public final void a() {
        a("window.vpaidwrapper.pauseAd()");
    }

    private void a(int i, int i2) {
        u uVar = this.d;
        if (uVar == null || !uVar.j) {
            return;
        }
        a("window.vpaidwrapper.resizeAd(" + sg.bigo.ads.common.utils.f.c(getContext(), i) + ", " + sg.bigo.ads.common.utils.f.c(getContext(), i2) + ", " + JSONObject.quote(this.l.d) + ")");
    }

    public final void b() {
        a("tryToPrepareAd()");
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.m;
            if (str == null) {
                str = "";
            }
            jSONObject.putOpt("AdParameters", str);
        } catch (JSONException unused) {
        }
        this.d.a(2);
        a("window.vpaidwrapper.initAd(" + sg.bigo.ads.common.utils.f.c(getContext(), measuredWidth) + ", " + sg.bigo.ads.common.utils.f.c(getContext(), measuredHeight) + ", " + JSONObject.quote(this.l.d) + ", -1, " + jSONObject + ")");
    }

    private void b(int i, int i2) {
        setMeasuredDimension(i, i2);
        a(i, i2);
    }

    public final void a(@NonNull String str) {
        if (this.r.get()) {
            loadUrl("javascript:".concat(String.valueOf(str)));
        } else {
            sg.bigo.ads.bn.a.a(0, "VPAIDWebView", "Injecting Javascript into VPAID WebView error, creative no ready:\n\t".concat(String.valueOf(str)));
        }
    }
}
