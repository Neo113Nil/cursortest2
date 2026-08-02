package sg.bigo.ads.core.mraid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.provider.CredentialEntry;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import sg.bigo.ads.core.mraid.h;
import sg.bigo.ads.core.mraid.p;
import sg.bigo.ads.cu.a;
import xsna.gp;
import xsna.gsi0;

/* loaded from: classes9.dex */
public final class c {

    @Nullable
    b a;

    @Nullable
    C2465c b;

    @Nullable
    sg.bigo.ads.cd.a c;
    boolean d;
    public boolean e;
    boolean f;

    @NonNull
    private final n g;

    @NonNull
    private final h h;
    private final WebViewClient i;

    /* renamed from: sg.bigo.ads.core.mraid.c$6, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.values().length];
            a = iArr;
            try {
                iArr[g.CLOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[g.RESIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[g.UNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[g.EXPAND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[g.USE_CUSTOM_CLOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[g.OPEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[g.SET_ORIENTATION_PROPERTIES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[g.PLAY_VIDEO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[g.STORE_PICTURE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[g.CREATE_CALENDAR_EVENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[g.UNSPECIFIED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public interface a extends b {
        void a(String str, String str2);
    }

    public interface b {
        void a();

        void a(int i, int i2, int i3, int i4, @NonNull a.EnumC2472a enumC2472a, boolean z);

        void a(WebView webView, int i);

        void a(String str);

        void a(String str, @Nullable sg.bigo.ads.an.i iVar);

        void a(String str, boolean z);

        void a(sg.bigo.ads.core.mraid.b bVar);

        void a(boolean z);

        void a(boolean z, i iVar);

        boolean a(@NonNull JsResult jsResult);

        void b();

        void b(boolean z);

        void c();

        boolean d();

        void e();

        void f();
    }

    /* renamed from: sg.bigo.ads.core.mraid.c$c, reason: collision with other inner class name */
    public static class C2465c extends sg.bigo.ads.dm.b {

        @Nullable
        p a;
        boolean b;

        @Nullable
        private a c;
        private sg.bigo.ads.an.i d;

        /* renamed from: sg.bigo.ads.core.mraid.c$c$a */
        public interface a {
            void a(sg.bigo.ads.core.mraid.b bVar);

            void a(boolean z);
        }

        private C2465c(Context context) {
            super(context);
            this.d = new sg.bigo.ads.an.i();
            this.a = new p(this);
            this.a.b = new p.b() { // from class: sg.bigo.ads.core.mraid.c.c.1
                @Override // sg.bigo.ads.core.mraid.p.b
                public final void a(boolean z, sg.bigo.ads.core.mraid.b bVar) {
                    C2465c.this.setMraidViewable(z);
                    C2465c.a(C2465c.this, bVar);
                }
            };
        }

        public static /* synthetic */ void a(C2465c c2465c, sg.bigo.ads.core.mraid.b bVar) {
            a aVar = c2465c.c;
            if (aVar != null) {
                aVar.a(bVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMraidViewable(boolean z) {
            if (this.b == z) {
                return;
            }
            this.b = z;
            a aVar = this.c;
            if (aVar != null) {
                aVar.a(z);
            }
        }

        @Override // sg.bigo.ads.dm.e, android.webkit.WebView
        public final void destroy() {
            super.destroy();
            setWebChromeClient(null);
            setWebViewClient(null);
            this.a = null;
            this.c = null;
        }

        @Nullable
        public final sg.bigo.ads.an.i getClickPoints() {
            return this.d;
        }

        @Override // android.webkit.WebView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 1) {
                this.d.b = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            }
            if (motionEvent.getActionMasked() == 0) {
                this.d.a = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override // android.webkit.WebView, android.view.View
        public final void onVisibilityChanged(@NonNull View view, int i) {
            super.onVisibilityChanged(view, i);
            if (this.a == null) {
                setMraidViewable(i == 0);
            } else if (i != 0) {
                setMraidViewable(false);
            }
        }

        public final void setVisibilityChangedListener(@Nullable a aVar) {
            this.c = aVar;
        }

        public /* synthetic */ C2465c(Context context, byte b) {
            this(context);
        }
    }

    public c(@Nullable n nVar) {
        this(nVar, new h());
    }

    private static int a(int i, int i2) {
        if (i < i2 || i > 100000) {
            throw new d("Integer parameter out of range: ".concat(String.valueOf(i)));
        }
        return i;
    }

    @NonNull
    private static String b(Rect rect) {
        return rect.width() + StringUtils.COMMA + rect.height();
    }

    private boolean d() {
        sg.bigo.ads.cd.a aVar = this.c;
        if (aVar != null) {
            return this.e ? aVar.a.a : aVar.a();
        }
        return false;
    }

    private static String e(String str) {
        if (str != null) {
            return str;
        }
        throw new d("Parameter cannot be null");
    }

    private static int f(@NonNull String str) {
        try {
            return Integer.parseInt(str, 10);
        } catch (NumberFormatException unused) {
            throw new d("Invalid numeric parameter: ".concat(String.valueOf(str)));
        }
    }

    private static boolean g(String str) {
        if ("true".equals(str)) {
            return true;
        }
        if (CredentialEntry.FALSE_STRING.equals(str)) {
            return false;
        }
        throw new d("Invalid boolean parameter: ".concat(String.valueOf(str)));
    }

    public final void c(@NonNull String str) {
        C2465c c2465c = this.b;
        if (c2465c == null) {
            sg.bigo.ads.bn.a.a(0, "MraidBridge", "Attempted to inject Javascript into MRAID WebView while was not attached:\n\t".concat(String.valueOf(str)));
        } else {
            c2465c.loadUrl("javascript:".concat(String.valueOf(str)));
        }
    }

    private c(@Nullable n nVar, @NonNull h hVar) {
        this.e = false;
        this.f = false;
        this.i = new k() { // from class: sg.bigo.ads.core.mraid.c.4
            @Override // sg.bigo.ads.core.mraid.k, sg.bigo.ads.dm.d
            public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                c cVar = c.this;
                sg.bigo.ads.bn.a.a(0, "MraidBridge", (renderProcessGoneDetail == null || !renderProcessGoneDetail.didCrash()) ? "Render process is gone" : "Render process has crashed");
                cVar.a();
                b bVar = cVar.a;
                if (bVar != null) {
                    bVar.c();
                }
            }

            @Override // sg.bigo.ads.dm.d, android.webkit.WebViewClient
            public final void onPageFinished(@NonNull WebView webView, @NonNull String str) {
                p pVar;
                super.onPageFinished(webView, str);
                c cVar = c.this;
                if (cVar.d) {
                    return;
                }
                cVar.d = true;
                C2465c c2465c = cVar.b;
                if (c2465c != null && (pVar = c2465c.a) != null) {
                    pVar.g = true;
                    pVar.a();
                }
                b bVar = cVar.a;
                if (bVar != null) {
                    bVar.a();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(@NonNull WebView webView, int i, @NonNull String str, @NonNull String str2) {
                sg.bigo.ads.bn.a.a(0, "MraidBridge", "Error: ".concat(String.valueOf(str)));
                super.onReceivedError(webView, i, str, str2);
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(@NonNull WebView webView, String str) {
                return c.this.d(str);
            }
        };
        this.g = nVar;
        this.h = hVar;
    }

    @NonNull
    private static String a(Rect rect) {
        return rect.left + StringUtils.COMMA + rect.top + StringUtils.COMMA + rect.width() + StringUtils.COMMA + rect.height();
    }

    public final void b(String str) {
        C2465c c2465c = this.b;
        if (c2465c == null) {
            sg.bigo.ads.bn.a.a(0, "MraidBridge", "MRAID bridge called setContentHtml while WebView was not attached");
        } else {
            this.d = false;
            c2465c.loadUrl(str);
        }
    }

    public final boolean c() {
        return this.b != null;
    }

    public final boolean d(String str) {
        Map<String, String> a2;
        i iVar;
        String str2;
        b bVar;
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return true;
            }
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if ("mopub".equals(scheme)) {
                if ("failLoad".equals(host) && this.g == n.INLINE && (bVar = this.a) != null) {
                    bVar.b();
                }
                return true;
            }
            if (d() && !CampaignEx.JSON_KEY_MRAID.equals(scheme)) {
                try {
                    StringBuilder sb = new StringBuilder("mraid://open?url=");
                    str2 = str;
                    try {
                        sb.append(URLEncoder.encode(str2, C.UTF8_NAME));
                        parse = Uri.parse(sb.toString());
                        host = parse.getHost();
                        scheme = parse.getScheme();
                    } catch (UnsupportedEncodingException unused) {
                        sg.bigo.ads.bn.a.a(0, "MraidBridge", "Invalid MRAID URL encoding: ".concat(String.valueOf(str2)));
                        a(g.OPEN, "Non-mraid URL is invalid");
                        return false;
                    }
                } catch (UnsupportedEncodingException unused2) {
                    str2 = str;
                }
            }
            if (!CampaignEx.JSON_KEY_MRAID.equals(scheme)) {
                sg.bigo.ads.cd.a aVar = this.c;
                return aVar != null && aVar.a();
            }
            final g a3 = g.a(host);
            try {
                a2 = a(parse);
                if (a3.a(this.g) && !d() && (a3 != g.OPEN || !this.f)) {
                    throw new d("Cannot execute this command unless the user clicks");
                }
            } catch (IllegalArgumentException e) {
                e = e;
                a(a3, e.getMessage());
                c("window.mraidbridge.nativeCallComplete(" + JSONObject.quote(a3.l) + ")");
                return true;
            } catch (d e2) {
                e = e2;
                a(a3, e.getMessage());
                c("window.mraidbridge.nativeCallComplete(" + JSONObject.quote(a3.l) + ")");
                return true;
            }
            if (this.a == null) {
                throw new d("Invalid state to execute this command");
            }
            if (this.b == null) {
                throw new d("The current WebView is being destroyed");
            }
            switch (AnonymousClass6.a[a3.ordinal()]) {
                case 1:
                    this.a.f();
                    break;
                case 2:
                    int a4 = a(f(a2.get("width")), 0);
                    int a5 = a(f(a2.get("height")), 0);
                    int a6 = a(f(a2.get("offsetX")), -100000);
                    int a7 = a(f(a2.get("offsetY")), -100000);
                    String str3 = a2.get("customClosePosition");
                    a.EnumC2472a enumC2472a = a.EnumC2472a.TOP_RIGHT;
                    if (!TextUtils.isEmpty(str3)) {
                        if (str3.equals(X3.e.c)) {
                            enumC2472a = a.EnumC2472a.TOP_LEFT;
                        } else if (!str3.equals(X3.e.b)) {
                            if (str3.equals(TtmlNode.CENTER)) {
                                enumC2472a = a.EnumC2472a.CENTER;
                            } else if (str3.equals(X3.e.e)) {
                                enumC2472a = a.EnumC2472a.BOTTOM_LEFT;
                            } else if (str3.equals(X3.e.d)) {
                                enumC2472a = a.EnumC2472a.BOTTOM_RIGHT;
                            } else if (str3.equals("top-center")) {
                                enumC2472a = a.EnumC2472a.TOP_CENTER;
                            } else {
                                if (!str3.equals("bottom-center")) {
                                    throw new d("Invalid close position: ".concat(str3));
                                }
                                enumC2472a = a.EnumC2472a.BOTTOM_CENTER;
                            }
                        }
                    }
                    this.a.a(a4, a5, a6, a7, enumC2472a, a(a2.get("allowOffscreen"), true));
                    this.a.b(false);
                    break;
                case 3:
                    this.a.e();
                    break;
                case 4:
                    this.a.a(a2.get("url"), a(a2));
                    break;
                case 5:
                    this.a.b(a(a2));
                    break;
                case 6:
                    this.a.a(e(a2.get("url")), this.b.getClickPoints());
                    break;
                case 7:
                    boolean g = g(a2.get("allowOrientationChange"));
                    String str4 = a2.get("forceOrientation");
                    if (X3.i.D.equals(str4)) {
                        iVar = i.PORTRAIT;
                    } else if (X3.i.C.equals(str4)) {
                        iVar = i.LANDSCAPE;
                    } else {
                        if (!"none".equals(str4)) {
                            throw new d("Invalid orientation: ".concat(String.valueOf(str4)));
                        }
                        iVar = i.NONE;
                    }
                    this.a.a(g, iVar);
                    break;
                case 8:
                    this.a.a(e(a2.get("uri")));
                    break;
                case 9:
                    String e3 = e(a2.get("uri"));
                    h hVar = this.h;
                    Context context = this.b.getContext();
                    h.c cVar = new h.c() { // from class: sg.bigo.ads.core.mraid.c.5
                        @Override // sg.bigo.ads.core.mraid.h.c
                        public final void a(d dVar) {
                            c.this.a(a3, dVar.getMessage());
                        }
                    };
                    if (!h.c(context)) {
                        sg.bigo.ads.bn.a.a(0, "MraidBridge", "Error downloading file - the device does not have an SD card mounted, or the Android permission is not granted.");
                        throw new d("Error downloading file  - the device does not have an SD card mounted, or the Android permission is not granted.");
                    }
                    if (!(context instanceof Activity)) {
                        Toast.makeText(context, "Downloading image", 0).show();
                        hVar.a(context, e3, cVar);
                        break;
                    } else {
                        new AlertDialog.Builder(context).setTitle("Save Image").setMessage("Download image to Picture gallery?").setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).setPositiveButton("Okay", new DialogInterface.OnClickListener() { // from class: sg.bigo.ads.core.mraid.h.3
                            final /* synthetic */ Context a;
                            final /* synthetic */ String b;
                            final /* synthetic */ c c;

                            public AnonymousClass3(Context context2, String e32, c cVar2) {
                                r2 = context2;
                                r3 = e32;
                                r4 = cVar2;
                            }

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                h.this.a(r2, r3, r4);
                            }
                        }).setCancelable(true).show();
                        break;
                    }
                case 10:
                    h.a(this.b.getContext(), a2);
                    break;
                case 11:
                    throw new d("Unspecified MRAID Javascript command");
            }
            c("window.mraidbridge.nativeCallComplete(" + JSONObject.quote(a3.l) + ")");
            return true;
        } catch (Exception unused3) {
            return true;
        }
    }

    @NonNull
    private static Map<String, String> a(@NonNull Uri uri) {
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            hashMap.put(str, TextUtils.join(StringUtils.COMMA, uri.getQueryParameters(str)));
        }
        return hashMap;
    }

    public final boolean b() {
        C2465c c2465c = this.b;
        return c2465c != null && c2465c.b;
    }

    @Nullable
    public static C2465c a(@NonNull Context context) {
        try {
            return new C2465c(context, (byte) 0);
        } catch (Exception e) {
            sg.bigo.ads.da.b.a(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, 10100, Log.getStackTraceString(e));
            return null;
        }
    }

    public final void a() {
        C2465c c2465c = this.b;
        if (c2465c != null) {
            c2465c.setOnTouchListener(null);
            this.b.setVisibilityChangedListener(null);
            this.b.destroy();
            this.b = null;
        }
    }

    public final void a(@NonNull String str) {
        C2465c c2465c = this.b;
        if (c2465c == null) {
            sg.bigo.ads.bn.a.a(0, "MraidBridge", "MRAID bridge called setContentHtml before WebView was attached");
        } else {
            this.d = false;
            c2465c.loadDataWithBaseURL("https://mraid.bigo.sg", str, "text/html", null, null);
        }
    }

    public final void a(sg.bigo.ads.core.mraid.b bVar) {
        StringBuilder sb = new StringBuilder("mraidbridge.notifyExposureChangeEvent(");
        sb.append(String.valueOf(bVar.a) + ", " + sg.bigo.ads.core.mraid.b.a(bVar.b) + ", " + sg.bigo.ads.core.mraid.b.a(bVar.c));
        sb.append(");");
        c(sb.toString());
    }

    public final void a(@NonNull C2465c c2465c) {
        this.b = c2465c;
        c2465c.getSettings().setJavaScriptEnabled(true);
        if (this.g == n.INTERSTITIAL) {
            c2465c.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        this.b.setScrollContainer(false);
        this.b.setVerticalScrollBarEnabled(false);
        this.b.setHorizontalScrollBarEnabled(false);
        this.b.setBackgroundColor(0);
        this.b.setWebViewClient(this.i);
        this.b.setWebChromeClient(new sg.bigo.ads.dm.c() { // from class: sg.bigo.ads.core.mraid.c.1
            @Override // sg.bigo.ads.dm.c
            public final void a(WebView webView, String str, String str2) {
                super.a(webView, str, str2);
                b bVar = c.this.a;
                if (bVar == null || !(bVar instanceof a)) {
                    return;
                }
                ((a) bVar).a(str, str2);
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onConsoleMessage(@NonNull ConsoleMessage consoleMessage) {
                b bVar = c.this.a;
                return bVar != null ? bVar.d() : super.onConsoleMessage(consoleMessage);
            }

            @Override // sg.bigo.ads.dm.c, android.webkit.WebChromeClient
            public final boolean onJsAlert(@NonNull WebView webView, @NonNull String str, @NonNull String str2, @NonNull JsResult jsResult) {
                b bVar = c.this.a;
                return bVar != null ? bVar.a(jsResult) : super.onJsAlert(webView, str, str2, jsResult);
            }

            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView, int i) {
                b bVar = c.this.a;
                if (bVar != null) {
                    bVar.a(webView, i);
                }
                super.onProgressChanged(webView, i);
            }

            @Override // android.webkit.WebChromeClient
            public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                super.onShowCustomView(view, customViewCallback);
            }
        });
        this.c = new sg.bigo.ads.cd.a(this.b.getContext());
        this.b.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.core.mraid.c.2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                c.this.c.onTouchEvent(motionEvent);
                int action = motionEvent.getAction();
                if ((action != 0 && action != 1) || view.hasFocus()) {
                    return false;
                }
                view.requestFocus();
                return false;
            }
        });
        this.b.setVisibilityChangedListener(new C2465c.a() { // from class: sg.bigo.ads.core.mraid.c.3
            @Override // sg.bigo.ads.core.mraid.c.C2465c.a
            public final void a(sg.bigo.ads.core.mraid.b bVar) {
                b bVar2 = c.this.a;
                if (bVar2 != null) {
                    bVar2.a(bVar);
                }
            }

            @Override // sg.bigo.ads.core.mraid.c.C2465c.a
            public final void a(boolean z) {
                b bVar = c.this.a;
                if (bVar != null) {
                    bVar.a(z);
                }
            }
        });
    }

    public final void a(@NonNull g gVar, @NonNull String str) {
        c("window.mraidbridge.notifyErrorEvent(" + JSONObject.quote(gVar.l) + ", " + JSONObject.quote(str) + ")");
    }

    public final void a(@NonNull j jVar) {
        String str;
        StringBuilder sb = new StringBuilder("mraidbridge.setScreenSize(");
        sb.append(b(jVar.b));
        sb.append(");mraidbridge.setMaxSize(");
        sb.append(b(jVar.d));
        sb.append(");mraidbridge.setCurrentPosition(");
        sb.append(a(jVar.f));
        sb.append(");mraidbridge.setDefaultPosition(");
        sb.append(a(jVar.h));
        sb.append(");mraidbridge.setCurrentAppOrientation(");
        C2465c c2465c = this.b;
        if (c2465c == null) {
            str = "";
        } else {
            Context context = c2465c.getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            String str2 = context.getResources().getConfiguration().orientation == 2 ? X3.i.C : X3.i.D;
            boolean z = false;
            if (activity != null && activity.getRequestedOrientation() != -1) {
                z = true;
            }
            str = "'" + str2 + "', " + z;
        }
        sb.append(str);
        sb.append(")");
        c(sb.toString());
        c("mraidbridge.notifySizeChangeEvent(" + b(jVar.f) + ")");
    }

    public final void a(n nVar) {
        c("mraidbridge.setPlacementType(" + JSONObject.quote(nVar.toString().toLowerCase(Locale.US)) + ")");
    }

    public final void a(o oVar) {
        c("mraidbridge.setState(" + JSONObject.quote(oVar.toString().toLowerCase(Locale.US)) + ")");
    }

    public final void a(boolean z) {
        c("mraidbridge.setIsViewable(" + z + ")");
    }

    public final void a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        StringBuilder c = gp.c("mraidbridge.setSupports(", StringUtils.COMMA, StringUtils.COMMA, z, z2);
        gsi0.c(c, z3, StringUtils.COMMA, z4, StringUtils.COMMA);
        c.append(z5);
        c.append(")");
        c(c.toString());
    }

    private static boolean a(@Nullable String str, boolean z) {
        return str == null ? z : g(str);
    }

    private static boolean a(@NonNull Map<String, String> map) {
        return a(map.get("shouldUseCustomClose"), false);
    }
}
