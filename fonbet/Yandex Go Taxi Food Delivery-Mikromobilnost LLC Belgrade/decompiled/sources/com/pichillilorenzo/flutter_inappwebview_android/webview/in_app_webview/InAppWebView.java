package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.print.PrintAttributes;
import android.print.PrintJob;
import android.print.PrintManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsoluteLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.a;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlocker;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerAction;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerTrigger;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionController;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.ConsoleLogJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.InterceptAjaxRequestJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.InterceptFetchRequestJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnLoadResourceJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnWindowBlurEventJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnWindowFocusEventJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PluginScriptsUtil;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PrintJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PromisePolyfillJS;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobController;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout;
import com.pichillilorenzo.flutter_inappwebview_android.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview_android.types.DownloadStartRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.HitTestResult;
import com.pichillilorenzo.flutter_inappwebview_android.types.MediaSizeExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.PreferredContentModeOptionType;
import com.pichillilorenzo.flutter_inappwebview_android.types.ResolutionExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessage;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebViewAssetLoaderExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.ContextMenuSettings;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.cya1;
import defpackage.da20;
import defpackage.di6;
import defpackage.dph0;
import defpackage.ea20;
import defpackage.eg01;
import defpackage.g8e;
import defpackage.hm91;
import defpackage.ns41;
import defpackage.oyr;
import defpackage.qm41;
import defpackage.qp41;
import defpackage.qv10;
import defpackage.rm41;
import defpackage.unr0;
import defpackage.vj41;
import defpackage.x4e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes11.dex */
public final class InAppWebView extends InputAwareWebView implements InAppWebViewInterface {
    protected static final String LOG_TAG = "InAppWebView";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_";
    static Handler mHandler = new Handler();
    public Map<String, ValueCallback<String>> callAsyncJavaScriptCallbacks;
    public WebViewChannelDelegate channelDelegate;
    public Runnable checkContextMenuShouldBeClosedTask;
    public Runnable checkScrollStoppedTask;
    public ContentBlockerHandler contentBlockerHandler;
    public Map<String, Object> contextMenu;
    private Point contextMenuPoint;
    public InAppWebViewSettings customSettings;
    public Map<String, ValueCallback<String>> evaluateJavaScriptContentWorldCallbacks;
    public FindInteractionController findInteractionController;
    public LinearLayout floatingContextMenu;
    public GestureDetector gestureDetector;
    public Object id;
    public InAppBrowserDelegate inAppBrowserDelegate;
    public InAppWebViewChromeClient inAppWebViewChromeClient;
    public InAppWebViewClient inAppWebViewClient;
    public InAppWebViewClientCompat inAppWebViewClientCompat;
    public InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient;
    private boolean inFullscreen;
    public int initialPositionScrollStoppedTask;
    private List<UserScript> initialUserOnlyScripts;
    private PluginScript interceptOnlyAsyncAjaxRequestsPluginScript;
    public boolean isLoading;
    public JavaScriptBridgeInterface javaScriptBridgeInterface;
    private Point lastTouch;
    public Handler mainLooperHandler;
    public int newCheckContextMenuShouldBeClosedTaskTask;
    public int newCheckScrollStoppedTask;
    public InAppWebViewFlutterPlugin plugin;
    public Pattern regexToCancelSubFramesLoadingCompiled;
    public UserContentController userContentController;
    public Map<String, WebMessageChannel> webMessageChannels;
    public List<WebMessageListener> webMessageListeners;
    public WebViewAssetLoaderExt webViewAssetLoaderExt;
    public Integer windowId;
    public float zoomScale;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView$21, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass21 {
        static final /* synthetic */ int[] $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$PreferredContentModeOptionType;

        static {
            int[] iArr = new int[PreferredContentModeOptionType.values().length];
            $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$PreferredContentModeOptionType = iArr;
            try {
                iArr[PreferredContentModeOptionType.DESKTOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$PreferredContentModeOptionType[PreferredContentModeOptionType.MOBILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$PreferredContentModeOptionType[PreferredContentModeOptionType.RECOMMENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class DownloadStartListener implements DownloadListener {
        public DownloadStartListener() {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            DownloadStartRequest downloadStartRequest = new DownloadStartRequest(str, str2, str3, str4, j, URLUtil.guessFileName(str, str3, str4), null);
            WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
            if (webViewChannelDelegate != null) {
                webViewChannelDelegate.onDownloadStartRequest(downloadStartRequest);
            }
        }
    }

    public InAppWebView(Context context, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, Object obj, Integer num, InAppWebViewSettings inAppWebViewSettings, Map<String, Object> map, View view, List<UserScript> list) {
        super(context, view, inAppWebViewSettings.useHybridComposition);
        this.customSettings = new InAppWebViewSettings();
        this.isLoading = false;
        this.inFullscreen = false;
        this.zoomScale = 1.0f;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.mainLooperHandler = new Handler(getWebViewLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController(this);
        this.callAsyncJavaScriptCallbacks = new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
        this.webMessageChannels = new HashMap();
        this.webMessageListeners = new ArrayList();
        this.initialUserOnlyScripts = new ArrayList();
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
        this.plugin = inAppWebViewFlutterPlugin;
        this.id = obj;
        this.channelDelegate = new WebViewChannelDelegate(this, new ea20(inAppWebViewFlutterPlugin.messenger, qv10.o(METHOD_CHANNEL_NAME_PREFIX, obj)));
        this.windowId = num;
        this.customSettings = inAppWebViewSettings;
        this.contextMenu = map;
        this.initialUserOnlyScripts = list;
        Activity activity = inAppWebViewFlutterPlugin.activity;
        if (activity != null) {
            activity.registerForContextMenu(this);
        }
    }

    @Deprecated
    private void clearCookies() {
        CookieManager.getInstance().removeAllCookies(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.7
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Boolean bool) {
            }
        });
    }

    private void sendOnCreateContextMenuEvent() {
        HitTestResult fromWebViewHitTestResult = HitTestResult.fromWebViewHitTestResult(getHitTestResult());
        WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onCreateContextMenu(fromWebViewHitTestResult);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void addWebMessageListener(WebMessageListener webMessageListener) {
        if (hm91.d("WEB_MESSAGE_LISTENER")) {
            String str = webMessageListener.jsObjectName;
            Set<String> set = webMessageListener.allowedOriginRules;
            qm41 qm41Var = webMessageListener.listener;
            Uri uri = rm41.a;
            if (!qp41.I.a()) {
                throw qp41.a();
            }
            ns41 c = rm41.c(this);
            c.a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new di6(new eg01(qm41Var)));
            this.webMessageListeners.add(webMessageListener);
        }
    }

    public void adjustFloatingContextMenuPosition() {
        evaluateJavascript("(function(){  var selection = window.getSelection();  var rangeY = null;  if (selection != null && selection.rangeCount > 0) {    var range = selection.getRangeAt(0);    var clientRect = range.getClientRects();    if (clientRect.length > 0) {      rangeY = clientRect[0].y;    } else if (document.activeElement != null && document.activeElement.tagName.toLowerCase() !== 'iframe') {      var boundingClientRect = document.activeElement.getBoundingClientRect();      rangeY = boundingClientRect.y;    }  }  return rangeY;})();", new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.16
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                if (InAppWebView.this.floatingContextMenu != null) {
                    if (str == null || str.equalsIgnoreCase("null")) {
                        InAppWebView.this.floatingContextMenu.setVisibility(0);
                        InAppWebView.this.floatingContextMenu.animate().alpha(1.0f).setDuration(100L).setListener(null);
                        InAppWebView inAppWebView = InAppWebView.this;
                        Point point = inAppWebView.contextMenuPoint;
                        inAppWebView.onFloatingActionGlobalLayout(point.x, point.y);
                        return;
                    }
                    int i = InAppWebView.this.contextMenuPoint.x;
                    int height = (int) ((InAppWebView.this.floatingContextMenu.getHeight() / 3.5d) + (Util.getPixelDensity(InAppWebView.this.getContext()) * Float.parseFloat(str)));
                    InAppWebView inAppWebView2 = InAppWebView.this;
                    inAppWebView2.contextMenuPoint.y = height;
                    inAppWebView2.onFloatingActionGlobalLayout(i, height);
                }
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void callAsyncJavaScript(String str, Map<String, Object> map, ContentWorld contentWorld, ValueCallback<String> valueCallback) {
        String uuid = UUID.randomUUID().toString();
        if (valueCallback != null) {
            this.callAsyncJavaScriptCallbacks.put(uuid, valueCallback);
        }
        Iterator<String> keys = new JSONObject(map).keys();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (keys.hasNext()) {
            String next = keys.next();
            arrayList.add(next);
            arrayList2.add("obj." + next);
        }
        String join = TextUtils.join(Extension.FIX_SPACE, arrayList);
        evaluateJavascript(this.userContentController.generateCodeForScriptEvaluation(PluginScriptsUtil.CALL_ASYNC_JAVA_SCRIPT_WRAPPER_JS_SOURCE.replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENT_NAMES, join).replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENT_VALUES, TextUtils.join(Extension.FIX_SPACE, arrayList2)).replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENTS_OBJ, Util.JSONStringify(map)).replace(PluginScriptsUtil.VAR_FUNCTION_BODY, str).replace(PluginScriptsUtil.VAR_RESULT_UUID, uuid).replace(PluginScriptsUtil.VAR_RESULT_UUID, uuid), contentWorld), null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public boolean canScrollHorizontally() {
        return computeHorizontalScrollRange() > computeHorizontalScrollExtent();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public boolean canScrollVertically() {
        return computeVerticalScrollRange() > computeVerticalScrollExtent();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    @Deprecated
    public void clearAllCache() {
        clearCache(true);
        clearCookies();
        clearFormData();
        WebStorage.getInstance().deleteAllData();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public WebMessageChannel createCompatWebMessageChannel() {
        String uuid = UUID.randomUUID().toString();
        WebMessageChannel webMessageChannel = new WebMessageChannel(uuid, this);
        this.webMessageChannels.put(uuid, webMessageChannel);
        return webMessageChannel;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public WebMessageChannel createWebMessageChannel(ValueCallback<WebMessageChannel> valueCallback) {
        WebMessageChannel createCompatWebMessageChannel = createCompatWebMessageChannel();
        valueCallback.onReceiveValue(createCompatWebMessageChannel);
        return createCompatWebMessageChannel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if ((r3.contains(ru.CryptoPro.JCP.tools.CertReader.Extension.DOT_CHAR) ? java.lang.Integer.parseInt(r3.split("\\.")[0]) : 0) >= 73) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WebViewClient createWebViewClient(InAppBrowserDelegate inAppBrowserDelegate) {
        PackageInfo b = rm41.b(getContext());
        if (b == null) {
            return new InAppWebViewClient(inAppBrowserDelegate);
        }
        boolean z = "com.android.webview".equals(b.packageName) || "com.google.android.webview".equals(b.packageName) || "com.android.chrome".equals(b.packageName);
        if (z) {
            String str = b.versionName;
            if (str == null) {
                str = "";
            }
        }
        if (z) {
            return new InAppWebViewClient(inAppBrowserDelegate);
        }
        return new InAppWebViewClientCompat(inAppBrowserDelegate);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        super.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InputAwareWebView
    public void dispose() {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        InAppWebViewManager inAppWebViewManager;
        WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        super.dispose();
        getSettings().setJavaScriptEnabled(false);
        removeJavascriptInterface(JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME);
        if (hm91.d("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE")) {
            Uri uri = rm41.a;
            qp41.C.getClass();
            cya1.b(this, null);
        }
        setWebChromeClient(new WebChromeClient());
        setWebViewClient(new WebViewClient() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.20
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                InAppWebView.this.destroy();
            }
        });
        this.interceptOnlyAsyncAjaxRequestsPluginScript = null;
        this.userContentController.dispose();
        FindInteractionController findInteractionController = this.findInteractionController;
        if (findInteractionController != null) {
            findInteractionController.dispose();
            this.findInteractionController = null;
        }
        WebViewAssetLoaderExt webViewAssetLoaderExt = this.webViewAssetLoaderExt;
        if (webViewAssetLoaderExt != null) {
            webViewAssetLoaderExt.dispose();
            this.webViewAssetLoaderExt = null;
        }
        Integer num = this.windowId;
        if (num != null && (inAppWebViewFlutterPlugin = this.plugin) != null && (inAppWebViewManager = inAppWebViewFlutterPlugin.inAppWebViewManager) != null) {
            inAppWebViewManager.windowWebViewMessages.remove(num);
        }
        this.mainLooperHandler.removeCallbacksAndMessages(null);
        mHandler.removeCallbacksAndMessages(null);
        disposeWebMessageChannels();
        disposeWebMessageListeners();
        removeAllViews();
        Runnable runnable = this.checkContextMenuShouldBeClosedTask;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.checkScrollStoppedTask;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.callAsyncJavaScriptCallbacks.clear();
        this.evaluateJavaScriptContentWorldCallbacks.clear();
        this.inAppBrowserDelegate = null;
        InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient = this.inAppWebViewRenderProcessClient;
        if (inAppWebViewRenderProcessClient != null) {
            inAppWebViewRenderProcessClient.dispose();
            this.inAppWebViewRenderProcessClient = null;
        }
        InAppWebViewChromeClient inAppWebViewChromeClient = this.inAppWebViewChromeClient;
        if (inAppWebViewChromeClient != null) {
            inAppWebViewChromeClient.dispose();
            this.inAppWebViewChromeClient = null;
        }
        InAppWebViewClientCompat inAppWebViewClientCompat = this.inAppWebViewClientCompat;
        if (inAppWebViewClientCompat != null) {
            inAppWebViewClientCompat.dispose();
            this.inAppWebViewClientCompat = null;
        }
        InAppWebViewClient inAppWebViewClient = this.inAppWebViewClient;
        if (inAppWebViewClient != null) {
            inAppWebViewClient.dispose();
            this.inAppWebViewClient = null;
        }
        JavaScriptBridgeInterface javaScriptBridgeInterface = this.javaScriptBridgeInterface;
        if (javaScriptBridgeInterface != null) {
            javaScriptBridgeInterface.dispose();
            this.javaScriptBridgeInterface = null;
        }
        this.plugin = null;
        loadUrl("about:blank");
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void disposeWebMessageChannels() {
        Iterator<WebMessageChannel> it = this.webMessageChannels.values().iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.webMessageChannels.clear();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void disposeWebMessageListeners() {
        Iterator<WebMessageListener> it = this.webMessageListeners.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.webMessageListeners.clear();
    }

    public void enablePluginScriptAtRuntime(final String str, final boolean z, final PluginScript pluginScript) {
        evaluateJavascript(g8e.o("window.", str), null, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.9
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str2) {
                if (str2 == null || str2.equalsIgnoreCase("null")) {
                    if (z) {
                        InAppWebView.this.evaluateJavascript(pluginScript.getSource(), null, null);
                        InAppWebView.this.userContentController.addPluginScript(pluginScript);
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder("window.");
                sb.append(str);
                sb.append(" = ");
                InAppWebView.this.evaluateJavascript(x4e.i(sb, z, ";"), null, null);
                if (z) {
                    return;
                }
                InAppWebView.this.userContentController.removePluginScript(pluginScript);
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void evaluateJavascript(String str, ContentWorld contentWorld, ValueCallback<String> valueCallback) {
        injectDeferredObject(str, contentWorld, null, valueCallback);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public WebViewChannelDelegate getChannelDelegate() {
        return this.channelDelegate;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void getContentHeight(ValueCallback<Integer> valueCallback) {
        valueCallback.onReceiveValue(Integer.valueOf(getContentHeight()));
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void getContentWidth(final ValueCallback<Integer> valueCallback) {
        evaluateJavascript("document.documentElement.scrollWidth;", new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.19
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                valueCallback.onReceiveValue((str == null || str.equalsIgnoreCase("null")) ? null : Integer.valueOf(Integer.parseInt(str)));
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public Map<String, Object> getContextMenu() {
        return this.contextMenu;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public HashMap<String, Object> getCopyBackForwardList() {
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        int size = copyBackForwardList.getSize();
        int currentIndex = copyBackForwardList.getCurrentIndex();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i);
            HashMap hashMap = new HashMap();
            hashMap.put("originalUrl", itemAtIndex.getOriginalUrl());
            hashMap.put("title", itemAtIndex.getTitle());
            hashMap.put("url", itemAtIndex.getUrl());
            arrayList.add(hashMap);
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("list", arrayList);
        hashMap2.put("currentIndex", Integer.valueOf(currentIndex));
        return hashMap2;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public Map<String, Object> getCustomSettings() {
        InAppWebViewSettings inAppWebViewSettings = this.customSettings;
        if (inAppWebViewSettings != null) {
            return inAppWebViewSettings.getRealSettings((InAppWebViewInterface) this);
        }
        return null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void getHitTestResult(ValueCallback<HitTestResult> valueCallback) {
        valueCallback.onReceiveValue(HitTestResult.fromWebViewHitTestResult(getHitTestResult()));
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public InAppBrowserDelegate getInAppBrowserDelegate() {
        return this.inAppBrowserDelegate;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public InAppWebViewFlutterPlugin getPlugin() {
        return this.plugin;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void getSelectedText(final ValueCallback<String> valueCallback) {
        evaluateJavascript(PluginScriptsUtil.GET_SELECTED_TEXT_JS_SOURCE, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.17
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                valueCallback.onReceiveValue((str == null || str.equalsIgnoreCase("null")) ? null : oyr.g(1, 1, str));
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public UserContentController getUserContentController() {
        return this.userContentController;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public Map<String, WebMessageChannel> getWebMessageChannels() {
        return this.webMessageChannels;
    }

    @Override // android.webkit.WebView, com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public Looper getWebViewLooper() {
        return super.getWebViewLooper();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void getZoomScale(ValueCallback<Float> valueCallback) {
        valueCallback.onReceiveValue(Float.valueOf(this.zoomScale));
    }

    public void hideContextMenu() {
        removeView(this.floatingContextMenu);
        this.floatingContextMenu = null;
        WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onHideContextMenu();
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void injectCSSCode(String str) {
        injectDeferredObject(str, null, "(function(d) { var style = d.createElement('style'); style.innerHTML = %s; if (d.head != null) { d.head.appendChild(style); } })(document);", null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void injectCSSFileFromUrl(String str, Map<String, Object> map) {
        String str2;
        String str3;
        String str4 = "";
        if (map != null) {
            String str5 = (String) map.get("id");
            if (str5 != null) {
                str3 = " link.id = '" + str5.replaceAll("'", "\\\\'") + "'; ";
            } else {
                str3 = "";
            }
            String str6 = (String) map.get("media");
            if (str6 != null) {
                StringBuilder a = a.a(str3, " link.media = '");
                a.append(str6.replaceAll("'", "\\\\'"));
                a.append("'; ");
                str3 = a.toString();
            }
            String str7 = (String) map.get("crossOrigin");
            if (str7 != null) {
                StringBuilder a2 = a.a(str3, " link.crossOrigin = '");
                a2.append(str7.replaceAll("'", "\\\\'"));
                a2.append("'; ");
                str3 = a2.toString();
            }
            String str8 = (String) map.get("integrity");
            if (str8 != null) {
                StringBuilder a3 = a.a(str3, " link.integrity = '");
                a3.append(str8.replaceAll("'", "\\\\'"));
                a3.append("'; ");
                str3 = a3.toString();
            }
            String str9 = (String) map.get("referrerPolicy");
            if (str9 != null) {
                StringBuilder a4 = a.a(str3, " link.referrerPolicy = '");
                a4.append(str9.replaceAll("'", "\\\\'"));
                a4.append("'; ");
                str3 = a4.toString();
            }
            Boolean bool = (Boolean) map.get(BackendConfig.Restrictions.DISABLED);
            if (bool != null && bool.booleanValue()) {
                str3 = str3.concat(" link.disabled = true; ");
            }
            Boolean bool2 = (Boolean) map.get("alternate");
            if (bool2 != null && bool2.booleanValue()) {
                str4 = "alternate ";
            }
            String str10 = (String) map.get("title");
            if (str10 != null) {
                StringBuilder a5 = a.a(str3, " link.title = '");
                a5.append(str10.replaceAll("'", "\\\\'"));
                a5.append("'; ");
                str2 = a5.toString();
            } else {
                str2 = str3;
            }
        } else {
            str2 = "";
        }
        injectDeferredObject(str, null, unr0.p("(function(d) { var link = d.createElement('link'); link.rel='", str4, "stylesheet'; link.type='text/css'; ", str2, " link.href = %s; if (d.head != null) { d.head.appendChild(link); } })(document);"), null);
    }

    public void injectDeferredObject(String str, final ContentWorld contentWorld, String str2, final ValueCallback<String> valueCallback) {
        String str3;
        final String uuid = (contentWorld == null || contentWorld.equals(ContentWorld.PAGE)) ? null : UUID.randomUUID().toString();
        if (str2 != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            str3 = String.format(str2, oyr.g(1, 1, jSONArray.toString()));
        } else {
            str3 = str;
        }
        if (uuid != null && valueCallback != null) {
            this.evaluateJavaScriptContentWorldCallbacks.put(uuid, valueCallback);
            str3 = Util.replaceAll(PluginScriptsUtil.EVALUATE_JAVASCRIPT_WITH_CONTENT_WORLD_WRAPPER_JS_SOURCE, PluginScriptsUtil.VAR_RANDOM_NAME, "_flutter_inappwebview_" + Math.round(Math.random() * 1000000.0d)).replace(PluginScriptsUtil.VAR_PLACEHOLDER_VALUE, UserContentController.escapeCode(str)).replace(PluginScriptsUtil.VAR_RESULT_UUID, uuid);
        }
        final String str4 = str3;
        this.mainLooperHandler.post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.10
            @Override // java.lang.Runnable
            public void run() {
                InAppWebView.this.evaluateJavascript(InAppWebView.this.userContentController.generateCodeForScriptEvaluation(str4, contentWorld), new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.10.1
                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(String str5) {
                        ValueCallback valueCallback2;
                        AnonymousClass10 anonymousClass10 = AnonymousClass10.this;
                        if (uuid != null || (valueCallback2 = valueCallback) == null) {
                            return;
                        }
                        valueCallback2.onReceiveValue(str5);
                    }
                });
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void injectJavascriptFileFromUrl(String str, Map<String, Object> map) {
        String str2 = "";
        if (map != null) {
            String str3 = (String) map.get("type");
            if (str3 != null) {
                str2 = " script.type = '" + str3.replaceAll("'", "\\\\'") + "'; ";
            }
            String str4 = (String) map.get("id");
            if (str4 != null) {
                String replaceAll = str4.replaceAll("'", "\\\\'");
                str2 = unr0.o(unr0.o(unr0.o(str2, " script.id = '", replaceAll, "'; "), " script.onload = function() {  if (window.flutter_inappwebview != null) {    window.flutter_inappwebview.callHandler('onInjectedScriptLoaded', '", replaceAll, "');  }};"), " script.onerror = function() {  if (window.flutter_inappwebview != null) {    window.flutter_inappwebview.callHandler('onInjectedScriptError', '", replaceAll, "');  }};");
            }
            Boolean bool = (Boolean) map.get("async");
            if (bool != null && bool.booleanValue()) {
                str2 = str2.concat(" script.async = true; ");
            }
            Boolean bool2 = (Boolean) map.get("defer");
            if (bool2 != null && bool2.booleanValue()) {
                str2 = str2.concat(" script.defer = true; ");
            }
            String str5 = (String) map.get("crossOrigin");
            if (str5 != null) {
                StringBuilder a = a.a(str2, " script.crossOrigin = '");
                a.append(str5.replaceAll("'", "\\\\'"));
                a.append("'; ");
                str2 = a.toString();
            }
            String str6 = (String) map.get("integrity");
            if (str6 != null) {
                StringBuilder a2 = a.a(str2, " script.integrity = '");
                a2.append(str6.replaceAll("'", "\\\\'"));
                a2.append("'; ");
                str2 = a2.toString();
            }
            Boolean bool3 = (Boolean) map.get("noModule");
            if (bool3 != null && bool3.booleanValue()) {
                str2 = str2.concat(" script.noModule = true; ");
            }
            String str7 = (String) map.get("nonce");
            if (str7 != null) {
                StringBuilder a3 = a.a(str2, " script.nonce = '");
                a3.append(str7.replaceAll("'", "\\\\'"));
                a3.append("'; ");
                str2 = a3.toString();
            }
            String str8 = (String) map.get("referrerPolicy");
            if (str8 != null) {
                StringBuilder a4 = a.a(str2, " script.referrerPolicy = '");
                a4.append(str8.replaceAll("'", "\\\\'"));
                a4.append("'; ");
                str2 = a4.toString();
            }
        }
        injectDeferredObject(str, null, oyr.p("(function(d) { var script = d.createElement('script'); ", str2, " script.src = %s; if (d.body != null) { d.body.appendChild(script); } })(document);"), null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public boolean isInFullscreen() {
        return this.inFullscreen;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public boolean isLoading() {
        return this.isLoading;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void isSecureContext(final ValueCallback<Boolean> valueCallback) {
        evaluateJavascript("window.isSecureContext", new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.18
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                if (str == null || str.isEmpty() || str.equalsIgnoreCase("null") || str.equalsIgnoreCase("false")) {
                    valueCallback.onReceiveValue(Boolean.FALSE);
                } else {
                    valueCallback.onReceiveValue(Boolean.TRUE);
                }
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void loadFile(String str) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null) {
            return;
        }
        loadUrl(Util.getUrlAsset(inAppWebViewFlutterPlugin, str));
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void loadUrl(URLRequest uRLRequest) {
        String url = uRLRequest.getUrl();
        String method = uRLRequest.getMethod();
        if (method != null && method.equals("POST")) {
            postUrl(url, uRLRequest.getBody());
            return;
        }
        Map<String, String> headers = uRLRequest.getHeaders();
        if (headers != null) {
            loadUrl(url, headers);
        } else {
            loadUrl(url);
        }
    }

    @Override // android.view.View
    public void onCreateContextMenu(ContextMenu contextMenu) {
        super.onCreateContextMenu(contextMenu);
        sendOnCreateContextMenuEvent();
    }

    @Override // android.webkit.WebView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        View view;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null && !this.customSettings.useHybridComposition.booleanValue() && (view = this.containerView) != null) {
            view.getHandler().postDelayed(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.11
                @Override // java.lang.Runnable
                public void run() {
                    boolean isAcceptingText;
                    View view2;
                    InputMethodManager inputMethodManager = (InputMethodManager) InAppWebView.this.getContext().getSystemService("input_method");
                    if (inputMethodManager != null) {
                        try {
                            isAcceptingText = inputMethodManager.isAcceptingText();
                        } catch (Exception unused) {
                        }
                        view2 = InAppWebView.this.containerView;
                        if (view2 != null || inputMethodManager == null || isAcceptingText) {
                            return;
                        }
                        inputMethodManager.hideSoftInputFromWindow(view2.getWindowToken(), 2);
                        return;
                    }
                    isAcceptingText = false;
                    view2 = InAppWebView.this.containerView;
                    if (view2 != null) {
                    }
                }
            }, 128L);
        }
        return onCreateInputConnection;
    }

    public void onFloatingActionGlobalLayout(int i, int i2) {
        int width = getWidth();
        getHeight();
        int width2 = this.floatingContextMenu.getWidth();
        int height = this.floatingContextMenu.getHeight();
        int i3 = i - (width2 / 2);
        if (i3 < 0) {
            i3 = 0;
        } else if (i3 + width2 > width) {
            i3 = width - width2;
        }
        float f = i2 - (height * 1.5f);
        if (f < 0.0f) {
            f = i2 + height;
        }
        updateViewLayout(this.floatingContextMenu, new AbsoluteLayout.LayoutParams(-2, -2, getScrollX() + i3, getScrollY() + ((int) f)));
        this.mainLooperHandler.post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.15
            @Override // java.lang.Runnable
            public void run() {
                LinearLayout linearLayout = InAppWebView.this.floatingContextMenu;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                    InAppWebView.this.floatingContextMenu.animate().alpha(1.0f).setDuration(100L).setListener(null);
                }
            }
        });
    }

    @Override // android.webkit.WebView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        WebViewChannelDelegate webViewChannelDelegate;
        super.onOverScrolled(i, i2, z, z2);
        boolean z3 = false;
        boolean z4 = canScrollHorizontally() && z;
        if (canScrollVertically() && z2) {
            z3 = true;
        }
        ViewParent parent = getParent();
        if ((parent instanceof PullToRefreshLayout) && z3 && i2 <= 10) {
            PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) parent;
            setOverScrollMode(2);
            pullToRefreshLayout.setEnabled(pullToRefreshLayout.settings.enabled.booleanValue());
            setOverScrollMode(this.customSettings.overScrollMode.intValue());
        }
        if ((z4 || z3) && (webViewChannelDelegate = this.channelDelegate) != null) {
            webViewChannelDelegate.onOverScrolled(i, i2, z4, z3);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        LinearLayout linearLayout = this.floatingContextMenu;
        if (linearLayout != null) {
            linearLayout.setAlpha(0.0f);
            this.floatingContextMenu.setVisibility(8);
        }
        WebViewChannelDelegate webViewChannelDelegate = this.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onScrollChanged(i, i2);
        }
    }

    public void onScrollStopped() {
        if (this.floatingContextMenu != null) {
            adjustFloatingContextMenuPosition();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.lastTouch = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        ViewParent parent = getParent();
        if (parent instanceof PullToRefreshLayout) {
            PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) parent;
            if (motionEvent.getActionMasked() == 0) {
                pullToRefreshLayout.setEnabled(false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onWindowVisibilityChanged(int i) {
        if (!this.customSettings.allowBackgroundAudioPlaying.booleanValue()) {
            super.onWindowVisibilityChanged(i);
        } else if (i != 8) {
            super.onWindowVisibilityChanged(0);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void postWebMessage(WebMessage webMessage, Uri uri, ValueCallback<String> valueCallback) {
        throw new UnsupportedOperationException();
    }

    public void prepare() {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            this.webViewAssetLoaderExt = WebViewAssetLoaderExt.fromMap(this.customSettings.webViewAssetLoader, inAppWebViewFlutterPlugin, getContext());
        }
        JavaScriptBridgeInterface javaScriptBridgeInterface = new JavaScriptBridgeInterface(this);
        this.javaScriptBridgeInterface = javaScriptBridgeInterface;
        addJavascriptInterface(javaScriptBridgeInterface, JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME);
        InAppWebViewChromeClient inAppWebViewChromeClient = new InAppWebViewChromeClient(this.plugin, this, this.inAppBrowserDelegate);
        this.inAppWebViewChromeClient = inAppWebViewChromeClient;
        setWebChromeClient(inAppWebViewChromeClient);
        WebViewClient createWebViewClient = createWebViewClient(this.inAppBrowserDelegate);
        if (createWebViewClient instanceof InAppWebViewClientCompat) {
            InAppWebViewClientCompat inAppWebViewClientCompat = (InAppWebViewClientCompat) createWebViewClient;
            this.inAppWebViewClientCompat = inAppWebViewClientCompat;
            setWebViewClient(inAppWebViewClientCompat);
        } else if (createWebViewClient instanceof InAppWebViewClient) {
            InAppWebViewClient inAppWebViewClient = (InAppWebViewClient) createWebViewClient;
            this.inAppWebViewClient = inAppWebViewClient;
            setWebViewClient(inAppWebViewClient);
        }
        if (hm91.d("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE")) {
            InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient = new InAppWebViewRenderProcessClient();
            this.inAppWebViewRenderProcessClient = inAppWebViewRenderProcessClient;
            Uri uri = rm41.a;
            qp41.C.getClass();
            cya1.b(this, inAppWebViewRenderProcessClient);
        }
        if (this.windowId == null || !hm91.d("DOCUMENT_START_SCRIPT")) {
            prepareAndAddUserScripts();
        }
        if (this.customSettings.useOnDownloadStart.booleanValue()) {
            setDownloadListener(new DownloadStartListener());
        }
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(this.customSettings.javaScriptEnabled.booleanValue());
        settings.setJavaScriptCanOpenWindowsAutomatically(this.customSettings.javaScriptCanOpenWindowsAutomatically.booleanValue());
        settings.setBuiltInZoomControls(this.customSettings.builtInZoomControls.booleanValue());
        settings.setDisplayZoomControls(this.customSettings.displayZoomControls.booleanValue());
        settings.setSupportMultipleWindows(this.customSettings.supportMultipleWindows.booleanValue());
        boolean d = hm91.d("SAFE_BROWSING_ENABLE");
        InAppWebViewSettings inAppWebViewSettings = this.customSettings;
        if (d) {
            boolean booleanValue = inAppWebViewSettings.safeBrowsingEnabled.booleanValue();
            qp41.b.getClass();
            settings.setSafeBrowsingEnabled(booleanValue);
        } else {
            settings.setSafeBrowsingEnabled(inAppWebViewSettings.safeBrowsingEnabled.booleanValue());
        }
        settings.setMediaPlaybackRequiresUserGesture(this.customSettings.mediaPlaybackRequiresUserGesture.booleanValue());
        settings.setDatabaseEnabled(this.customSettings.databaseEnabled.booleanValue());
        settings.setDomStorageEnabled(this.customSettings.domStorageEnabled.booleanValue());
        String str = this.customSettings.userAgent;
        if (str == null || str.isEmpty()) {
            settings.setUserAgentString(WebSettings.getDefaultUserAgent(getContext()));
        } else {
            settings.setUserAgentString(this.customSettings.userAgent);
        }
        String str2 = this.customSettings.applicationNameForUserAgent;
        if (str2 != null && !str2.isEmpty()) {
            String str3 = this.customSettings.userAgent;
            StringBuilder a = a.a((str3 == null || str3.isEmpty()) ? WebSettings.getDefaultUserAgent(getContext()) : this.customSettings.userAgent, " ");
            a.append(this.customSettings.applicationNameForUserAgent);
            settings.setUserAgentString(a.toString());
        }
        if (this.customSettings.clearCache.booleanValue()) {
            clearAllCache();
        } else if (this.customSettings.clearSessionCache.booleanValue()) {
            CookieManager.getInstance().removeSessionCookie();
        }
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, this.customSettings.thirdPartyCookiesEnabled.booleanValue());
        settings.setLoadWithOverviewMode(this.customSettings.loadWithOverviewMode.booleanValue());
        settings.setUseWideViewPort(this.customSettings.useWideViewPort.booleanValue());
        settings.setSupportZoom(this.customSettings.supportZoom.booleanValue());
        settings.setTextZoom(this.customSettings.textZoom.intValue());
        setVerticalScrollBarEnabled(!this.customSettings.disableVerticalScroll.booleanValue() && this.customSettings.verticalScrollBarEnabled.booleanValue());
        setHorizontalScrollBarEnabled(!this.customSettings.disableHorizontalScroll.booleanValue() && this.customSettings.horizontalScrollBarEnabled.booleanValue());
        if (this.customSettings.transparentBackground.booleanValue()) {
            setBackgroundColor(0);
        }
        Integer num = this.customSettings.mixedContentMode;
        if (num != null) {
            settings.setMixedContentMode(num.intValue());
        }
        settings.setAllowContentAccess(this.customSettings.allowContentAccess.booleanValue());
        settings.setAllowFileAccess(this.customSettings.allowFileAccess.booleanValue());
        settings.setAllowFileAccessFromFileURLs(this.customSettings.allowFileAccessFromFileURLs.booleanValue());
        settings.setAllowUniversalAccessFromFileURLs(this.customSettings.allowUniversalAccessFromFileURLs.booleanValue());
        setCacheEnabled(this.customSettings.cacheEnabled.booleanValue());
        String str4 = this.customSettings.appCachePath;
        if (str4 != null && !str4.isEmpty() && this.customSettings.cacheEnabled.booleanValue()) {
            Util.invokeMethodIfExists(settings, "setAppCachePath", this.customSettings.appCachePath);
        }
        settings.setBlockNetworkImage(this.customSettings.blockNetworkImage.booleanValue());
        settings.setBlockNetworkLoads(this.customSettings.blockNetworkLoads.booleanValue());
        Integer num2 = this.customSettings.cacheMode;
        if (num2 != null) {
            settings.setCacheMode(num2.intValue());
        }
        settings.setCursiveFontFamily(this.customSettings.cursiveFontFamily);
        settings.setDefaultFixedFontSize(this.customSettings.defaultFixedFontSize.intValue());
        settings.setDefaultFontSize(this.customSettings.defaultFontSize.intValue());
        settings.setDefaultTextEncodingName(this.customSettings.defaultTextEncodingName);
        if (this.customSettings.disabledActionModeMenuItems != null) {
            boolean d2 = hm91.d("DISABLED_ACTION_MODE_MENU_ITEMS");
            InAppWebViewSettings inAppWebViewSettings2 = this.customSettings;
            if (d2) {
                int intValue = inAppWebViewSettings2.disabledActionModeMenuItems.intValue();
                qp41.c.getClass();
                settings.setDisabledActionModeMenuItems(intValue);
            } else {
                settings.setDisabledActionModeMenuItems(inAppWebViewSettings2.disabledActionModeMenuItems.intValue());
            }
        }
        settings.setFantasyFontFamily(this.customSettings.fantasyFontFamily);
        settings.setFixedFontFamily(this.customSettings.fixedFontFamily);
        if (this.customSettings.forceDark != null) {
            boolean d3 = hm91.d("FORCE_DARK");
            InAppWebViewSettings inAppWebViewSettings3 = this.customSettings;
            if (d3) {
                int intValue2 = inAppWebViewSettings3.forceDark.intValue();
                qp41.G.getClass();
                settings.setForceDark(intValue2);
            } else {
                settings.setForceDark(inAppWebViewSettings3.forceDark.intValue());
            }
        }
        if (this.customSettings.forceDarkStrategy != null && hm91.d("FORCE_DARK_STRATEGY")) {
            vj41.c(settings, this.customSettings.forceDarkStrategy.intValue());
        }
        settings.setGeolocationEnabled(this.customSettings.geolocationEnabled.booleanValue());
        WebSettings.LayoutAlgorithm layoutAlgorithm = this.customSettings.layoutAlgorithm;
        if (layoutAlgorithm != null) {
            boolean equals = layoutAlgorithm.equals(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
            InAppWebViewSettings inAppWebViewSettings4 = this.customSettings;
            if (equals) {
                settings.setLayoutAlgorithm(inAppWebViewSettings4.layoutAlgorithm);
            } else {
                settings.setLayoutAlgorithm(inAppWebViewSettings4.layoutAlgorithm);
            }
        }
        settings.setLoadsImagesAutomatically(this.customSettings.loadsImagesAutomatically.booleanValue());
        settings.setMinimumFontSize(this.customSettings.minimumFontSize.intValue());
        settings.setMinimumLogicalFontSize(this.customSettings.minimumLogicalFontSize.intValue());
        setInitialScale(this.customSettings.initialScale.intValue());
        settings.setNeedInitialFocus(this.customSettings.needInitialFocus.booleanValue());
        boolean d4 = hm91.d("OFF_SCREEN_PRERASTER");
        InAppWebViewSettings inAppWebViewSettings5 = this.customSettings;
        if (d4) {
            boolean booleanValue2 = inAppWebViewSettings5.offscreenPreRaster.booleanValue();
            qp41.a.getClass();
            settings.setOffscreenPreRaster(booleanValue2);
        } else {
            settings.setOffscreenPreRaster(inAppWebViewSettings5.offscreenPreRaster.booleanValue());
        }
        settings.setSansSerifFontFamily(this.customSettings.sansSerifFontFamily);
        settings.setSerifFontFamily(this.customSettings.serifFontFamily);
        settings.setStandardFontFamily(this.customSettings.standardFontFamily);
        Integer num3 = this.customSettings.preferredContentMode;
        if (num3 != null && num3.intValue() == PreferredContentModeOptionType.DESKTOP.toValue()) {
            setDesktopMode(true);
        }
        settings.setSaveFormData(this.customSettings.saveFormData.booleanValue());
        if (this.customSettings.incognito.booleanValue()) {
            setIncognito(true);
        }
        if (this.customSettings.useHybridComposition.booleanValue()) {
            if (this.customSettings.hardwareAcceleration.booleanValue()) {
                setLayerType(2, null);
            } else {
                setLayerType(0, null);
            }
        }
        String str5 = this.customSettings.regexToCancelSubFramesLoading;
        if (str5 != null) {
            this.regexToCancelSubFramesLoadingCompiled = Pattern.compile(str5);
        }
        setScrollBarStyle(this.customSettings.scrollBarStyle.intValue());
        InAppWebViewSettings inAppWebViewSettings6 = this.customSettings;
        Integer num4 = inAppWebViewSettings6.scrollBarDefaultDelayBeforeFade;
        if (num4 != null) {
            setScrollBarDefaultDelayBeforeFade(num4.intValue());
        } else {
            inAppWebViewSettings6.scrollBarDefaultDelayBeforeFade = Integer.valueOf(getScrollBarDefaultDelayBeforeFade());
        }
        setScrollbarFadingEnabled(this.customSettings.scrollbarFadingEnabled.booleanValue());
        InAppWebViewSettings inAppWebViewSettings7 = this.customSettings;
        Integer num5 = inAppWebViewSettings7.scrollBarFadeDuration;
        if (num5 != null) {
            setScrollBarFadeDuration(num5.intValue());
        } else {
            inAppWebViewSettings7.scrollBarFadeDuration = Integer.valueOf(getScrollBarFadeDuration());
        }
        setVerticalScrollbarPosition(this.customSettings.verticalScrollbarPosition.intValue());
        if (this.customSettings.verticalScrollbarThumbColor != null) {
            setVerticalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(this.customSettings.verticalScrollbarThumbColor)));
        }
        if (this.customSettings.verticalScrollbarTrackColor != null) {
            setVerticalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(this.customSettings.verticalScrollbarTrackColor)));
        }
        if (this.customSettings.horizontalScrollbarThumbColor != null) {
            setHorizontalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(this.customSettings.horizontalScrollbarThumbColor)));
        }
        if (this.customSettings.horizontalScrollbarTrackColor != null) {
            setHorizontalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(this.customSettings.horizontalScrollbarTrackColor)));
        }
        setOverScrollMode(this.customSettings.overScrollMode.intValue());
        Boolean bool = this.customSettings.networkAvailable;
        if (bool != null) {
            setNetworkAvailable(bool.booleanValue());
        }
        Map<String, Object> map = this.customSettings.rendererPriorityPolicy;
        if (map != null && !map.isEmpty()) {
            setRendererPriorityPolicy(((Integer) this.customSettings.rendererPriorityPolicy.get("rendererRequestedPriority")).intValue(), ((Boolean) this.customSettings.rendererPriorityPolicy.get("waivedWhenNotVisible")).booleanValue());
        }
        if (hm91.d("ALGORITHMIC_DARKENING")) {
            vj41.b(settings, this.customSettings.algorithmicDarkeningAllowed.booleanValue());
        }
        if (hm91.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY")) {
            boolean booleanValue3 = this.customSettings.enterpriseAuthenticationAppLinkPolicyEnabled.booleanValue();
            if (!qp41.M.a()) {
                throw qp41.a();
            }
            vj41.a(settings).u(booleanValue3);
        }
        if (this.customSettings.requestedWithHeaderOriginAllowList != null && hm91.d("REQUESTED_WITH_HEADER_ALLOW_LIST")) {
            Set<String> set = this.customSettings.requestedWithHeaderOriginAllowList;
            if (!qp41.O.a()) {
                throw qp41.a();
            }
            vj41.a(settings).y(set);
        }
        this.contentBlockerHandler.getRuleList().clear();
        for (Map<String, Map<String, Object>> map2 : this.customSettings.contentBlockers) {
            this.contentBlockerHandler.getRuleList().add(new ContentBlocker(ContentBlockerTrigger.fromMap(map2.get("trigger")), ContentBlockerAction.fromMap(map2.get("action"))));
        }
        setFindListener(new WebView.FindListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.1
            @Override // android.webkit.WebView.FindListener
            public void onFindResultReceived(int i, int i2, boolean z) {
                FindInteractionChannelDelegate findInteractionChannelDelegate;
                FindInteractionController findInteractionController = InAppWebView.this.findInteractionController;
                if (findInteractionController != null && (findInteractionChannelDelegate = findInteractionController.channelDelegate) != null) {
                    findInteractionChannelDelegate.onFindResultReceived(i, i2, z);
                }
                WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
                if (webViewChannelDelegate != null) {
                    webViewChannelDelegate.onFindResultReceived(i, i2, z);
                }
            }
        });
        this.gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                InAppWebView inAppWebView = InAppWebView.this;
                if (inAppWebView.floatingContextMenu != null) {
                    inAppWebView.hideContextMenu();
                }
                return super.onSingleTapUp(motionEvent);
            }
        });
        this.checkScrollStoppedTask = new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.3
            @Override // java.lang.Runnable
            public void run() {
                int scrollY = InAppWebView.this.getScrollY();
                InAppWebView inAppWebView = InAppWebView.this;
                if (inAppWebView.initialPositionScrollStoppedTask - scrollY == 0) {
                    inAppWebView.onScrollStopped();
                    return;
                }
                inAppWebView.initialPositionScrollStoppedTask = inAppWebView.getScrollY();
                InAppWebView inAppWebView2 = InAppWebView.this;
                inAppWebView2.mainLooperHandler.postDelayed(inAppWebView2.checkScrollStoppedTask, inAppWebView2.newCheckScrollStoppedTask);
            }
        };
        if (!this.customSettings.useHybridComposition.booleanValue()) {
            this.checkContextMenuShouldBeClosedTask = new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.4
                @Override // java.lang.Runnable
                public void run() {
                    InAppWebView inAppWebView = InAppWebView.this;
                    if (inAppWebView.floatingContextMenu != null) {
                        inAppWebView.evaluateJavascript(PluginScriptsUtil.CHECK_CONTEXT_MENU_SHOULD_BE_HIDDEN_JS_SOURCE, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.4.1
                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(String str6) {
                                if (str6 != null && !str6.equals("true")) {
                                    InAppWebView inAppWebView2 = InAppWebView.this;
                                    inAppWebView2.mainLooperHandler.postDelayed(inAppWebView2.checkContextMenuShouldBeClosedTask, inAppWebView2.newCheckContextMenuShouldBeClosedTaskTask);
                                } else {
                                    InAppWebView inAppWebView3 = InAppWebView.this;
                                    if (inAppWebView3.floatingContextMenu != null) {
                                        inAppWebView3.hideContextMenu();
                                    }
                                }
                            }
                        });
                    }
                }
            };
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.5
            float m_downX;
            float m_downY;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                InAppWebView.this.gestureDetector.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1) {
                    InAppWebView.this.checkScrollStoppedTask.run();
                }
                if (InAppWebView.this.customSettings.disableHorizontalScroll.booleanValue() && InAppWebView.this.customSettings.disableVerticalScroll.booleanValue()) {
                    return motionEvent.getAction() == 2;
                }
                if (InAppWebView.this.customSettings.disableHorizontalScroll.booleanValue() || InAppWebView.this.customSettings.disableVerticalScroll.booleanValue()) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        this.m_downX = motionEvent.getX();
                        this.m_downY = motionEvent.getY();
                    } else if (action == 1 || action == 2 || action == 3) {
                        if (InAppWebView.this.customSettings.disableHorizontalScroll.booleanValue()) {
                            motionEvent.setLocation(this.m_downX, motionEvent.getY());
                        } else {
                            motionEvent.setLocation(motionEvent.getX(), this.m_downY);
                        }
                    }
                }
                return false;
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.6
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                HitTestResult fromWebViewHitTestResult = HitTestResult.fromWebViewHitTestResult(InAppWebView.this.getHitTestResult());
                WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
                if (webViewChannelDelegate == null) {
                    return false;
                }
                webViewChannelDelegate.onLongPressHitTestResult(fromWebViewHitTestResult);
                return false;
            }
        });
    }

    public void prepareAndAddUserScripts() {
        this.userContentController.addPluginScript(PromisePolyfillJS.PROMISE_POLYFILL_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(ConsoleLogJS.CONSOLE_LOG_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(PrintJS.PRINT_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(OnWindowBlurEventJS.ON_WINDOW_BLUR_EVENT_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(OnWindowFocusEventJS.ON_WINDOW_FOCUS_EVENT_JS_PLUGIN_SCRIPT);
        this.interceptOnlyAsyncAjaxRequestsPluginScript = InterceptAjaxRequestJS.createInterceptOnlyAsyncAjaxRequestsPluginScript(this.customSettings.interceptOnlyAsyncAjaxRequests.booleanValue());
        if (this.customSettings.useShouldInterceptAjaxRequest.booleanValue()) {
            this.userContentController.addPluginScript(this.interceptOnlyAsyncAjaxRequestsPluginScript);
            this.userContentController.addPluginScript(InterceptAjaxRequestJS.INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT);
        }
        if (this.customSettings.useShouldInterceptFetchRequest.booleanValue()) {
            this.userContentController.addPluginScript(InterceptFetchRequestJS.INTERCEPT_FETCH_REQUEST_JS_PLUGIN_SCRIPT);
        }
        if (this.customSettings.useOnLoadResource.booleanValue()) {
            this.userContentController.addPluginScript(OnLoadResourceJS.ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT);
        }
        if (!this.customSettings.useHybridComposition.booleanValue()) {
            this.userContentController.addPluginScript(PluginScriptsUtil.CHECK_GLOBAL_KEY_DOWN_EVENT_TO_HIDE_CONTEXT_MENU_JS_PLUGIN_SCRIPT);
        }
        this.userContentController.addUserOnlyScripts(this.initialUserOnlyScripts);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public String printCurrentPage(PrintJobSettings printJobSettings) {
        Activity activity;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null || (activity = inAppWebViewFlutterPlugin.activity) == null) {
            return null;
        }
        PrintManager printManager = (PrintManager) activity.getSystemService("print");
        if (printManager == null) {
            Log.e(LOG_TAG, "No PrintManager available");
            return null;
        }
        PrintAttributes.Builder builder = new PrintAttributes.Builder();
        String t = oyr.t(new StringBuilder(), getTitle() != null ? getTitle() : getUrl(), " Document");
        if (printJobSettings != null) {
            String str = printJobSettings.jobName;
            if (str != null && !str.isEmpty()) {
                t = printJobSettings.jobName;
            }
            Integer num = printJobSettings.orientation;
            if (num != null) {
                int intValue = num.intValue();
                if (intValue == 0) {
                    builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
                } else if (intValue == 1) {
                    builder.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
                }
            }
            MediaSizeExt mediaSizeExt = printJobSettings.mediaSize;
            if (mediaSizeExt != null) {
                builder.setMediaSize(mediaSizeExt.toMediaSize());
            }
            Integer num2 = printJobSettings.colorMode;
            if (num2 != null) {
                builder.setColorMode(num2.intValue());
            }
            Integer num3 = printJobSettings.duplexMode;
            if (num3 != null) {
                builder.setDuplexMode(num3.intValue());
            }
            ResolutionExt resolutionExt = printJobSettings.resolution;
            if (resolutionExt != null) {
                builder.setResolution(resolutionExt.toResolution());
            }
        }
        PrintJob print = printManager.print(t, createPrintDocumentAdapter(t), builder.build());
        if (printJobSettings == null || !printJobSettings.handledByClient.booleanValue() || this.plugin.printJobManager == null) {
            return null;
        }
        String uuid = UUID.randomUUID().toString();
        PrintJobController printJobController = new PrintJobController(uuid, print, printJobSettings, this.plugin);
        this.plugin.printJobManager.jobs.put(printJobController.id, printJobController);
        return uuid;
    }

    public ActionMode rebuildActionMode(ActionMode actionMode, final ActionMode.Callback callback) {
        boolean z;
        View view;
        final ActionMode actionMode2 = actionMode;
        if (!this.customSettings.useHybridComposition.booleanValue() && (view = this.containerView) != null) {
            onWindowFocusChanged(view.isFocused());
        }
        if (this.floatingContextMenu != null) {
            hideContextMenu();
            z = true;
        } else {
            z = false;
        }
        if (actionMode2 == null) {
            return null;
        }
        Menu menu = actionMode2.getMenu();
        actionMode2.hide(3000L);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        menu.clear();
        actionMode2.finish();
        if (!this.customSettings.disableContextMenu.booleanValue()) {
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(dph0.floating_action_mode, (ViewGroup) this, false);
            this.floatingContextMenu = linearLayout;
            LinearLayout linearLayout2 = (LinearLayout) ((HorizontalScrollView) linearLayout.getChildAt(0)).getChildAt(0);
            List arrayList2 = new ArrayList();
            ContextMenuSettings contextMenuSettings = new ContextMenuSettings();
            Map<String, Object> map = this.contextMenu;
            if (map != null) {
                arrayList2 = (List) map.get("menuItems");
                Map<String, Object> map2 = (Map) this.contextMenu.get("settings");
                if (map2 != null) {
                    contextMenuSettings.parse2(map2);
                }
            }
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            List<Map> list = arrayList2;
            Boolean bool = contextMenuSettings.hideDefaultSystemContextMenuItems;
            if (bool == null || !bool.booleanValue()) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    int i3 = i2 + 1;
                    final MenuItem menuItem = (MenuItem) arrayList.get(i2);
                    final int itemId = menuItem.getItemId();
                    final String charSequence = menuItem.getTitle().toString();
                    TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(dph0.floating_action_mode_item, (ViewGroup) this, false);
                    textView.setText(charSequence);
                    textView.setOnClickListener(new View.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.12
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            InAppWebView.this.hideContextMenu();
                            callback.onActionItemClicked(actionMode2, menuItem);
                            WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
                            if (webViewChannelDelegate != null) {
                                webViewChannelDelegate.onContextMenuActionItemClicked(itemId, charSequence);
                            }
                        }
                    });
                    if (this.floatingContextMenu != null) {
                        linearLayout2.addView(textView);
                    }
                    actionMode2 = actionMode;
                    i2 = i3;
                }
            }
            for (Map map3 : list) {
                final int intValue = ((Integer) map3.get("id")).intValue();
                final String str = (String) map3.get("title");
                TextView textView2 = (TextView) LayoutInflater.from(getContext()).inflate(dph0.floating_action_mode_item, (ViewGroup) this, false);
                textView2.setText(str);
                textView2.setOnClickListener(new View.OnClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.13
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        InAppWebView.this.hideContextMenu();
                        WebViewChannelDelegate webViewChannelDelegate = InAppWebView.this.channelDelegate;
                        if (webViewChannelDelegate != null) {
                            webViewChannelDelegate.onContextMenuActionItemClicked(intValue, str);
                        }
                    }
                });
                if (this.floatingContextMenu != null) {
                    linearLayout2.addView(textView2);
                }
            }
            Point point = this.lastTouch;
            final int i4 = point != null ? point.x : 0;
            final int i5 = point != null ? point.y : 0;
            this.contextMenuPoint = new Point(i4, i5);
            LinearLayout linearLayout3 = this.floatingContextMenu;
            if (linearLayout3 != null) {
                linearLayout3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.14
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        LinearLayout linearLayout4 = InAppWebView.this.floatingContextMenu;
                        if (linearLayout4 != null) {
                            linearLayout4.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            boolean javaScriptEnabled = InAppWebView.this.getSettings().getJavaScriptEnabled();
                            InAppWebView inAppWebView = InAppWebView.this;
                            if (javaScriptEnabled) {
                                inAppWebView.onScrollStopped();
                            } else {
                                inAppWebView.onFloatingActionGlobalLayout(i4, i5);
                            }
                        }
                    }
                });
                addView(this.floatingContextMenu, new AbsoluteLayout.LayoutParams(-2, -2, i4, i5));
                if (z) {
                    sendOnCreateContextMenuEvent();
                }
                Runnable runnable = this.checkContextMenuShouldBeClosedTask;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return actionMode;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public Map<String, Object> requestFocusNodeHref() {
        Message obtainMessage = mHandler.obtainMessage();
        requestFocusNodeHref(obtainMessage);
        Bundle peekData = obtainMessage.peekData();
        HashMap hashMap = new HashMap();
        hashMap.put("src", peekData.getString("src"));
        hashMap.put("url", peekData.getString("url"));
        hashMap.put("title", peekData.getString("title"));
        return hashMap;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public Map<String, Object> requestImageRef() {
        Message obtainMessage = mHandler.obtainMessage();
        requestImageRef(obtainMessage);
        Bundle peekData = obtainMessage.peekData();
        HashMap hashMap = new HashMap();
        hashMap.put("url", peekData.getString("url"));
        return hashMap;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void scrollBy(Integer num, Integer num2, Boolean bool) {
        if (!bool.booleanValue()) {
            scrollBy(num.intValue(), num2.intValue());
            return;
        }
        ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofInt("scrollX", num.intValue() + getScrollX()), PropertyValuesHolder.ofInt("scrollY", num2.intValue() + getScrollY())).setDuration(300L).start();
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void scrollTo(Integer num, Integer num2, Boolean bool) {
        if (bool.booleanValue()) {
            ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofInt("scrollX", num.intValue()), PropertyValuesHolder.ofInt("scrollY", num2.intValue())).setDuration(300L).start();
        } else {
            scrollTo(num.intValue(), num2.intValue());
        }
    }

    public void setCacheEnabled(boolean z) {
        WebSettings settings = getSettings();
        if (!z) {
            settings.setCacheMode(2);
            Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.FALSE);
            return;
        }
        Context context = getContext();
        if (context != null) {
            Util.invokeMethodIfExists(settings, "setAppCachePath", context.getCacheDir().getAbsolutePath());
            settings.setCacheMode(-1);
            Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.TRUE);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setChannelDelegate(WebViewChannelDelegate webViewChannelDelegate) {
        this.channelDelegate = webViewChannelDelegate;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setContextMenu(Map<String, Object> map) {
        this.contextMenu = map;
    }

    public void setDesktopMode(boolean z) {
        WebSettings settings = getSettings();
        settings.setUserAgentString(z ? settings.getUserAgentString().replace("Mobile", "eliboM").replace("Android", "diordnA") : settings.getUserAgentString().replace("eliboM", "Mobile").replace("diordnA", "Android"));
        settings.setUseWideViewPort(z);
        settings.setLoadWithOverviewMode(z);
        settings.setSupportZoom(z);
        settings.setBuiltInZoomControls(z);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setInAppBrowserDelegate(InAppBrowserDelegate inAppBrowserDelegate) {
        this.inAppBrowserDelegate = inAppBrowserDelegate;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setInFullscreen(boolean z) {
        this.inFullscreen = z;
    }

    public void setIncognito(boolean z) {
        WebSettings settings = getSettings();
        if (!z) {
            settings.setCacheMode(-1);
            Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.TRUE);
            settings.setSavePassword(true);
            settings.setSaveFormData(true);
            return;
        }
        CookieManager.getInstance().removeAllCookies(null);
        settings.setCacheMode(2);
        Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.FALSE);
        clearHistory();
        clearCache(true);
        clearFormData();
        settings.setSavePassword(false);
        settings.setSaveFormData(false);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setPlugin(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setSettings(InAppWebViewSettings inAppWebViewSettings, HashMap<String, Object> hashMap) {
        Map<String, Object> map;
        Integer num;
        Integer num2;
        String str;
        Integer num3;
        String str2;
        Integer num4;
        WebSettings settings = getSettings();
        if (hashMap.get("javaScriptEnabled") != null) {
            Boolean bool = this.customSettings.javaScriptEnabled;
            Boolean bool2 = inAppWebViewSettings.javaScriptEnabled;
            if (bool != bool2) {
                settings.setJavaScriptEnabled(bool2.booleanValue());
            }
        }
        if (hashMap.get("useShouldInterceptAjaxRequest") != null) {
            Boolean bool3 = this.customSettings.useShouldInterceptAjaxRequest;
            Boolean bool4 = inAppWebViewSettings.useShouldInterceptAjaxRequest;
            if (bool3 != bool4) {
                enablePluginScriptAtRuntime(InterceptAjaxRequestJS.FLAG_VARIABLE_FOR_SHOULD_INTERCEPT_AJAX_REQUEST_JS_SOURCE, bool4.booleanValue(), InterceptAjaxRequestJS.INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT);
            }
        }
        if (hashMap.get("interceptOnlyAsyncAjaxRequests") != null) {
            Boolean bool5 = this.customSettings.interceptOnlyAsyncAjaxRequests;
            Boolean bool6 = inAppWebViewSettings.interceptOnlyAsyncAjaxRequests;
            if (bool5 != bool6) {
                enablePluginScriptAtRuntime(InterceptAjaxRequestJS.FLAG_VARIABLE_FOR_INTERCEPT_ONLY_ASYNC_AJAX_REQUESTS_JS_SOURCE, bool6.booleanValue(), this.interceptOnlyAsyncAjaxRequestsPluginScript);
            }
        }
        if (hashMap.get("useShouldInterceptFetchRequest") != null) {
            Boolean bool7 = this.customSettings.useShouldInterceptFetchRequest;
            Boolean bool8 = inAppWebViewSettings.useShouldInterceptFetchRequest;
            if (bool7 != bool8) {
                enablePluginScriptAtRuntime(InterceptFetchRequestJS.FLAG_VARIABLE_FOR_SHOULD_INTERCEPT_FETCH_REQUEST_JS_SOURCE, bool8.booleanValue(), InterceptFetchRequestJS.INTERCEPT_FETCH_REQUEST_JS_PLUGIN_SCRIPT);
            }
        }
        if (hashMap.get("useOnLoadResource") != null) {
            Boolean bool9 = this.customSettings.useOnLoadResource;
            Boolean bool10 = inAppWebViewSettings.useOnLoadResource;
            if (bool9 != bool10) {
                enablePluginScriptAtRuntime(OnLoadResourceJS.FLAG_VARIABLE_FOR_ON_LOAD_RESOURCE_JS_SOURCE, bool10.booleanValue(), OnLoadResourceJS.ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT);
            }
        }
        if (hashMap.get("javaScriptCanOpenWindowsAutomatically") != null) {
            Boolean bool11 = this.customSettings.javaScriptCanOpenWindowsAutomatically;
            Boolean bool12 = inAppWebViewSettings.javaScriptCanOpenWindowsAutomatically;
            if (bool11 != bool12) {
                settings.setJavaScriptCanOpenWindowsAutomatically(bool12.booleanValue());
            }
        }
        if (hashMap.get("builtInZoomControls") != null) {
            Boolean bool13 = this.customSettings.builtInZoomControls;
            Boolean bool14 = inAppWebViewSettings.builtInZoomControls;
            if (bool13 != bool14) {
                settings.setBuiltInZoomControls(bool14.booleanValue());
            }
        }
        if (hashMap.get("displayZoomControls") != null) {
            Boolean bool15 = this.customSettings.displayZoomControls;
            Boolean bool16 = inAppWebViewSettings.displayZoomControls;
            if (bool15 != bool16) {
                settings.setDisplayZoomControls(bool16.booleanValue());
            }
        }
        if (hashMap.get("safeBrowsingEnabled") != null && this.customSettings.safeBrowsingEnabled != inAppWebViewSettings.safeBrowsingEnabled) {
            boolean d = hm91.d("SAFE_BROWSING_ENABLE");
            Boolean bool17 = inAppWebViewSettings.safeBrowsingEnabled;
            if (d) {
                boolean booleanValue = bool17.booleanValue();
                qp41.b.getClass();
                settings.setSafeBrowsingEnabled(booleanValue);
            } else {
                settings.setSafeBrowsingEnabled(bool17.booleanValue());
            }
        }
        if (hashMap.get("mediaPlaybackRequiresUserGesture") != null) {
            Boolean bool18 = this.customSettings.mediaPlaybackRequiresUserGesture;
            Boolean bool19 = inAppWebViewSettings.mediaPlaybackRequiresUserGesture;
            if (bool18 != bool19) {
                settings.setMediaPlaybackRequiresUserGesture(bool19.booleanValue());
            }
        }
        if (hashMap.get("databaseEnabled") != null) {
            Boolean bool20 = this.customSettings.databaseEnabled;
            Boolean bool21 = inAppWebViewSettings.databaseEnabled;
            if (bool20 != bool21) {
                settings.setDatabaseEnabled(bool21.booleanValue());
            }
        }
        if (hashMap.get("domStorageEnabled") != null) {
            Boolean bool22 = this.customSettings.domStorageEnabled;
            Boolean bool23 = inAppWebViewSettings.domStorageEnabled;
            if (bool22 != bool23) {
                settings.setDomStorageEnabled(bool23.booleanValue());
            }
        }
        if (hashMap.get("userAgent") != null && !this.customSettings.userAgent.equals(inAppWebViewSettings.userAgent) && !inAppWebViewSettings.userAgent.isEmpty()) {
            settings.setUserAgentString(inAppWebViewSettings.userAgent);
        }
        if (hashMap.get("applicationNameForUserAgent") != null && !this.customSettings.applicationNameForUserAgent.equals(inAppWebViewSettings.applicationNameForUserAgent) && !inAppWebViewSettings.applicationNameForUserAgent.isEmpty()) {
            String str3 = inAppWebViewSettings.userAgent;
            StringBuilder a = a.a((str3 == null || str3.isEmpty()) ? WebSettings.getDefaultUserAgent(getContext()) : inAppWebViewSettings.userAgent, " ");
            a.append(this.customSettings.applicationNameForUserAgent);
            settings.setUserAgentString(a.toString());
        }
        if (hashMap.get("clearCache") != null && inAppWebViewSettings.clearCache.booleanValue()) {
            clearAllCache();
        } else if (hashMap.get("clearSessionCache") != null && inAppWebViewSettings.clearSessionCache.booleanValue()) {
            CookieManager.getInstance().removeSessionCookie();
        }
        if (hashMap.get("thirdPartyCookiesEnabled") != null && this.customSettings.thirdPartyCookiesEnabled != inAppWebViewSettings.thirdPartyCookiesEnabled) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, inAppWebViewSettings.thirdPartyCookiesEnabled.booleanValue());
        }
        if (hashMap.get("useWideViewPort") != null) {
            Boolean bool24 = this.customSettings.useWideViewPort;
            Boolean bool25 = inAppWebViewSettings.useWideViewPort;
            if (bool24 != bool25) {
                settings.setUseWideViewPort(bool25.booleanValue());
            }
        }
        if (hashMap.get("supportZoom") != null) {
            Boolean bool26 = this.customSettings.supportZoom;
            Boolean bool27 = inAppWebViewSettings.supportZoom;
            if (bool26 != bool27) {
                settings.setSupportZoom(bool27.booleanValue());
            }
        }
        if (hashMap.get("textZoom") != null && !this.customSettings.textZoom.equals(inAppWebViewSettings.textZoom)) {
            settings.setTextZoom(inAppWebViewSettings.textZoom.intValue());
        }
        if (hashMap.get("verticalScrollBarEnabled") != null) {
            Boolean bool28 = this.customSettings.verticalScrollBarEnabled;
            Boolean bool29 = inAppWebViewSettings.verticalScrollBarEnabled;
            if (bool28 != bool29) {
                setVerticalScrollBarEnabled(bool29.booleanValue());
            }
        }
        if (hashMap.get("horizontalScrollBarEnabled") != null) {
            Boolean bool30 = this.customSettings.horizontalScrollBarEnabled;
            Boolean bool31 = inAppWebViewSettings.horizontalScrollBarEnabled;
            if (bool30 != bool31) {
                setHorizontalScrollBarEnabled(bool31.booleanValue());
            }
        }
        boolean z = false;
        if (hashMap.get("transparentBackground") != null) {
            Boolean bool32 = this.customSettings.transparentBackground;
            Boolean bool33 = inAppWebViewSettings.transparentBackground;
            if (bool32 != bool33) {
                if (bool33.booleanValue()) {
                    setBackgroundColor(0);
                } else {
                    setBackgroundColor(Color.parseColor("#FFFFFF"));
                }
            }
        }
        if (hashMap.get("mixedContentMode") != null && ((num4 = this.customSettings.mixedContentMode) == null || !num4.equals(inAppWebViewSettings.mixedContentMode))) {
            settings.setMixedContentMode(inAppWebViewSettings.mixedContentMode.intValue());
        }
        if (hashMap.get("supportMultipleWindows") != null) {
            Boolean bool34 = this.customSettings.supportMultipleWindows;
            Boolean bool35 = inAppWebViewSettings.supportMultipleWindows;
            if (bool34 != bool35) {
                settings.setSupportMultipleWindows(bool35.booleanValue());
            }
        }
        if (hashMap.get("useOnDownloadStart") != null) {
            Boolean bool36 = this.customSettings.useOnDownloadStart;
            Boolean bool37 = inAppWebViewSettings.useOnDownloadStart;
            if (bool36 != bool37) {
                if (bool37.booleanValue()) {
                    setDownloadListener(new DownloadStartListener());
                } else {
                    setDownloadListener(null);
                }
            }
        }
        if (hashMap.get("allowContentAccess") != null) {
            Boolean bool38 = this.customSettings.allowContentAccess;
            Boolean bool39 = inAppWebViewSettings.allowContentAccess;
            if (bool38 != bool39) {
                settings.setAllowContentAccess(bool39.booleanValue());
            }
        }
        if (hashMap.get("allowFileAccess") != null) {
            Boolean bool40 = this.customSettings.allowFileAccess;
            Boolean bool41 = inAppWebViewSettings.allowFileAccess;
            if (bool40 != bool41) {
                settings.setAllowFileAccess(bool41.booleanValue());
            }
        }
        if (hashMap.get("allowFileAccessFromFileURLs") != null) {
            Boolean bool42 = this.customSettings.allowFileAccessFromFileURLs;
            Boolean bool43 = inAppWebViewSettings.allowFileAccessFromFileURLs;
            if (bool42 != bool43) {
                settings.setAllowFileAccessFromFileURLs(bool43.booleanValue());
            }
        }
        if (hashMap.get("allowUniversalAccessFromFileURLs") != null) {
            Boolean bool44 = this.customSettings.allowUniversalAccessFromFileURLs;
            Boolean bool45 = inAppWebViewSettings.allowUniversalAccessFromFileURLs;
            if (bool44 != bool45) {
                settings.setAllowUniversalAccessFromFileURLs(bool45.booleanValue());
            }
        }
        if (hashMap.get("cacheEnabled") != null) {
            Boolean bool46 = this.customSettings.cacheEnabled;
            Boolean bool47 = inAppWebViewSettings.cacheEnabled;
            if (bool46 != bool47) {
                setCacheEnabled(bool47.booleanValue());
            }
        }
        if (hashMap.get("appCachePath") != null && ((str2 = this.customSettings.appCachePath) == null || !str2.equals(inAppWebViewSettings.appCachePath))) {
            Util.invokeMethodIfExists(settings, "setAppCachePath", inAppWebViewSettings.appCachePath);
        }
        if (hashMap.get("blockNetworkImage") != null) {
            Boolean bool48 = this.customSettings.blockNetworkImage;
            Boolean bool49 = inAppWebViewSettings.blockNetworkImage;
            if (bool48 != bool49) {
                settings.setBlockNetworkImage(bool49.booleanValue());
            }
        }
        if (hashMap.get("blockNetworkLoads") != null) {
            Boolean bool50 = this.customSettings.blockNetworkLoads;
            Boolean bool51 = inAppWebViewSettings.blockNetworkLoads;
            if (bool50 != bool51) {
                settings.setBlockNetworkLoads(bool51.booleanValue());
            }
        }
        if (hashMap.get("cacheMode") != null && !this.customSettings.cacheMode.equals(inAppWebViewSettings.cacheMode)) {
            settings.setCacheMode(inAppWebViewSettings.cacheMode.intValue());
        }
        if (hashMap.get("cursiveFontFamily") != null && !this.customSettings.cursiveFontFamily.equals(inAppWebViewSettings.cursiveFontFamily)) {
            settings.setCursiveFontFamily(inAppWebViewSettings.cursiveFontFamily);
        }
        if (hashMap.get("defaultFixedFontSize") != null && !this.customSettings.defaultFixedFontSize.equals(inAppWebViewSettings.defaultFixedFontSize)) {
            settings.setDefaultFixedFontSize(inAppWebViewSettings.defaultFixedFontSize.intValue());
        }
        if (hashMap.get("defaultFontSize") != null && !this.customSettings.defaultFontSize.equals(inAppWebViewSettings.defaultFontSize)) {
            settings.setDefaultFontSize(inAppWebViewSettings.defaultFontSize.intValue());
        }
        if (hashMap.get("defaultTextEncodingName") != null && !this.customSettings.defaultTextEncodingName.equals(inAppWebViewSettings.defaultTextEncodingName)) {
            settings.setDefaultTextEncodingName(inAppWebViewSettings.defaultTextEncodingName);
        }
        if (hashMap.get("disabledActionModeMenuItems") != null && ((num3 = this.customSettings.disabledActionModeMenuItems) == null || !num3.equals(inAppWebViewSettings.disabledActionModeMenuItems))) {
            if (hm91.d("DISABLED_ACTION_MODE_MENU_ITEMS")) {
                int intValue = inAppWebViewSettings.disabledActionModeMenuItems.intValue();
                qp41.c.getClass();
                settings.setDisabledActionModeMenuItems(intValue);
            } else {
                settings.setDisabledActionModeMenuItems(inAppWebViewSettings.disabledActionModeMenuItems.intValue());
            }
        }
        if (hashMap.get("fantasyFontFamily") != null && !this.customSettings.fantasyFontFamily.equals(inAppWebViewSettings.fantasyFontFamily)) {
            settings.setFantasyFontFamily(inAppWebViewSettings.fantasyFontFamily);
        }
        if (hashMap.get("fixedFontFamily") != null && !this.customSettings.fixedFontFamily.equals(inAppWebViewSettings.fixedFontFamily)) {
            settings.setFixedFontFamily(inAppWebViewSettings.fixedFontFamily);
        }
        if (hashMap.get("forceDark") != null && !this.customSettings.forceDark.equals(inAppWebViewSettings.forceDark)) {
            boolean d2 = hm91.d("FORCE_DARK");
            Integer num5 = inAppWebViewSettings.forceDark;
            if (d2) {
                int intValue2 = num5.intValue();
                qp41.G.getClass();
                settings.setForceDark(intValue2);
            } else {
                settings.setForceDark(num5.intValue());
            }
        }
        if (hashMap.get("forceDarkStrategy") != null && !this.customSettings.forceDarkStrategy.equals(inAppWebViewSettings.forceDarkStrategy) && hm91.d("FORCE_DARK_STRATEGY")) {
            vj41.c(settings, inAppWebViewSettings.forceDarkStrategy.intValue());
        }
        if (hashMap.get("geolocationEnabled") != null) {
            Boolean bool52 = this.customSettings.geolocationEnabled;
            Boolean bool53 = inAppWebViewSettings.geolocationEnabled;
            if (bool52 != bool53) {
                settings.setGeolocationEnabled(bool53.booleanValue());
            }
        }
        if (hashMap.get("layoutAlgorithm") != null) {
            WebSettings.LayoutAlgorithm layoutAlgorithm = this.customSettings.layoutAlgorithm;
            WebSettings.LayoutAlgorithm layoutAlgorithm2 = inAppWebViewSettings.layoutAlgorithm;
            if (layoutAlgorithm != layoutAlgorithm2) {
                boolean equals = layoutAlgorithm2.equals(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
                WebSettings.LayoutAlgorithm layoutAlgorithm3 = inAppWebViewSettings.layoutAlgorithm;
                if (equals) {
                    settings.setLayoutAlgorithm(layoutAlgorithm3);
                } else {
                    settings.setLayoutAlgorithm(layoutAlgorithm3);
                }
            }
        }
        if (hashMap.get("loadWithOverviewMode") != null) {
            Boolean bool54 = this.customSettings.loadWithOverviewMode;
            Boolean bool55 = inAppWebViewSettings.loadWithOverviewMode;
            if (bool54 != bool55) {
                settings.setLoadWithOverviewMode(bool55.booleanValue());
            }
        }
        if (hashMap.get("loadsImagesAutomatically") != null) {
            Boolean bool56 = this.customSettings.loadsImagesAutomatically;
            Boolean bool57 = inAppWebViewSettings.loadsImagesAutomatically;
            if (bool56 != bool57) {
                settings.setLoadsImagesAutomatically(bool57.booleanValue());
            }
        }
        if (hashMap.get("minimumFontSize") != null && !this.customSettings.minimumFontSize.equals(inAppWebViewSettings.minimumFontSize)) {
            settings.setMinimumFontSize(inAppWebViewSettings.minimumFontSize.intValue());
        }
        if (hashMap.get("minimumLogicalFontSize") != null && !this.customSettings.minimumLogicalFontSize.equals(inAppWebViewSettings.minimumLogicalFontSize)) {
            settings.setMinimumLogicalFontSize(inAppWebViewSettings.minimumLogicalFontSize.intValue());
        }
        if (hashMap.get("initialScale") != null && !this.customSettings.initialScale.equals(inAppWebViewSettings.initialScale)) {
            setInitialScale(inAppWebViewSettings.initialScale.intValue());
        }
        if (hashMap.get("needInitialFocus") != null) {
            Boolean bool58 = this.customSettings.needInitialFocus;
            Boolean bool59 = inAppWebViewSettings.needInitialFocus;
            if (bool58 != bool59) {
                settings.setNeedInitialFocus(bool59.booleanValue());
            }
        }
        if (hashMap.get("offscreenPreRaster") != null && this.customSettings.offscreenPreRaster != inAppWebViewSettings.offscreenPreRaster) {
            boolean d3 = hm91.d("OFF_SCREEN_PRERASTER");
            Boolean bool60 = inAppWebViewSettings.offscreenPreRaster;
            if (d3) {
                boolean booleanValue2 = bool60.booleanValue();
                qp41.a.getClass();
                settings.setOffscreenPreRaster(booleanValue2);
            } else {
                settings.setOffscreenPreRaster(bool60.booleanValue());
            }
        }
        if (hashMap.get("sansSerifFontFamily") != null && !this.customSettings.sansSerifFontFamily.equals(inAppWebViewSettings.sansSerifFontFamily)) {
            settings.setSansSerifFontFamily(inAppWebViewSettings.sansSerifFontFamily);
        }
        if (hashMap.get("serifFontFamily") != null && !this.customSettings.serifFontFamily.equals(inAppWebViewSettings.serifFontFamily)) {
            settings.setSerifFontFamily(inAppWebViewSettings.serifFontFamily);
        }
        if (hashMap.get("standardFontFamily") != null && !this.customSettings.standardFontFamily.equals(inAppWebViewSettings.standardFontFamily)) {
            settings.setStandardFontFamily(inAppWebViewSettings.standardFontFamily);
        }
        if (hashMap.get("preferredContentMode") != null && !this.customSettings.preferredContentMode.equals(inAppWebViewSettings.preferredContentMode)) {
            int i = AnonymousClass21.$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$PreferredContentModeOptionType[PreferredContentModeOptionType.fromValue(inAppWebViewSettings.preferredContentMode.intValue()).ordinal()];
            if (i == 1) {
                setDesktopMode(true);
            } else if (i == 2 || i == 3) {
                setDesktopMode(false);
            }
        }
        if (hashMap.get("saveFormData") != null) {
            Boolean bool61 = this.customSettings.saveFormData;
            Boolean bool62 = inAppWebViewSettings.saveFormData;
            if (bool61 != bool62) {
                settings.setSaveFormData(bool62.booleanValue());
            }
        }
        if (hashMap.get("incognito") != null) {
            Boolean bool63 = this.customSettings.incognito;
            Boolean bool64 = inAppWebViewSettings.incognito;
            if (bool63 != bool64) {
                setIncognito(bool64.booleanValue());
            }
        }
        if (this.customSettings.useHybridComposition.booleanValue() && hashMap.get("hardwareAcceleration") != null) {
            Boolean bool65 = this.customSettings.hardwareAcceleration;
            Boolean bool66 = inAppWebViewSettings.hardwareAcceleration;
            if (bool65 != bool66) {
                if (bool66.booleanValue()) {
                    setLayerType(2, null);
                } else {
                    setLayerType(0, null);
                }
            }
        }
        if (hashMap.get("regexToCancelSubFramesLoading") != null && ((str = this.customSettings.regexToCancelSubFramesLoading) == null || !str.equals(inAppWebViewSettings.regexToCancelSubFramesLoading))) {
            if (inAppWebViewSettings.regexToCancelSubFramesLoading == null) {
                this.regexToCancelSubFramesLoadingCompiled = null;
            } else {
                this.regexToCancelSubFramesLoadingCompiled = Pattern.compile(this.customSettings.regexToCancelSubFramesLoading);
            }
        }
        if (inAppWebViewSettings.contentBlockers != null) {
            this.contentBlockerHandler.getRuleList().clear();
            for (Map<String, Map<String, Object>> map2 : inAppWebViewSettings.contentBlockers) {
                this.contentBlockerHandler.getRuleList().add(new ContentBlocker(ContentBlockerTrigger.fromMap(map2.get("trigger")), ContentBlockerAction.fromMap(map2.get("action"))));
            }
        }
        if (hashMap.get("scrollBarStyle") != null && !this.customSettings.scrollBarStyle.equals(inAppWebViewSettings.scrollBarStyle)) {
            setScrollBarStyle(inAppWebViewSettings.scrollBarStyle.intValue());
        }
        if (hashMap.get("scrollBarDefaultDelayBeforeFade") != null && ((num2 = this.customSettings.scrollBarDefaultDelayBeforeFade) == null || !num2.equals(inAppWebViewSettings.scrollBarDefaultDelayBeforeFade))) {
            setScrollBarDefaultDelayBeforeFade(inAppWebViewSettings.scrollBarDefaultDelayBeforeFade.intValue());
        }
        if (hashMap.get("scrollbarFadingEnabled") != null && !this.customSettings.scrollbarFadingEnabled.equals(inAppWebViewSettings.scrollbarFadingEnabled)) {
            setScrollbarFadingEnabled(inAppWebViewSettings.scrollbarFadingEnabled.booleanValue());
        }
        if (hashMap.get("scrollBarFadeDuration") != null && ((num = this.customSettings.scrollBarFadeDuration) == null || !num.equals(inAppWebViewSettings.scrollBarFadeDuration))) {
            setScrollBarFadeDuration(inAppWebViewSettings.scrollBarFadeDuration.intValue());
        }
        if (hashMap.get("verticalScrollbarPosition") != null && !this.customSettings.verticalScrollbarPosition.equals(inAppWebViewSettings.verticalScrollbarPosition)) {
            setVerticalScrollbarPosition(inAppWebViewSettings.verticalScrollbarPosition.intValue());
        }
        if (hashMap.get("disableVerticalScroll") != null) {
            Boolean bool67 = this.customSettings.disableVerticalScroll;
            Boolean bool68 = inAppWebViewSettings.disableVerticalScroll;
            if (bool67 != bool68) {
                setVerticalScrollBarEnabled(!bool68.booleanValue() && inAppWebViewSettings.verticalScrollBarEnabled.booleanValue());
            }
        }
        if (hashMap.get("disableHorizontalScroll") != null) {
            Boolean bool69 = this.customSettings.disableHorizontalScroll;
            Boolean bool70 = inAppWebViewSettings.disableHorizontalScroll;
            if (bool69 != bool70) {
                if (!bool70.booleanValue() && inAppWebViewSettings.horizontalScrollBarEnabled.booleanValue()) {
                    z = true;
                }
                setHorizontalScrollBarEnabled(z);
            }
        }
        if (hashMap.get("overScrollMode") != null && !this.customSettings.overScrollMode.equals(inAppWebViewSettings.overScrollMode)) {
            setOverScrollMode(inAppWebViewSettings.overScrollMode.intValue());
        }
        if (hashMap.get("networkAvailable") != null) {
            Boolean bool71 = this.customSettings.networkAvailable;
            Boolean bool72 = inAppWebViewSettings.networkAvailable;
            if (bool71 != bool72) {
                setNetworkAvailable(bool72.booleanValue());
            }
        }
        if (hashMap.get("rendererPriorityPolicy") != null && ((map = this.customSettings.rendererPriorityPolicy) == null || map.get("rendererRequestedPriority") != inAppWebViewSettings.rendererPriorityPolicy.get("rendererRequestedPriority") || this.customSettings.rendererPriorityPolicy.get("waivedWhenNotVisible") != inAppWebViewSettings.rendererPriorityPolicy.get("waivedWhenNotVisible"))) {
            setRendererPriorityPolicy(((Integer) inAppWebViewSettings.rendererPriorityPolicy.get("rendererRequestedPriority")).intValue(), ((Boolean) inAppWebViewSettings.rendererPriorityPolicy.get("waivedWhenNotVisible")).booleanValue());
        }
        if (hashMap.get("verticalScrollbarThumbColor") != null && !Util.objEquals(this.customSettings.verticalScrollbarThumbColor, inAppWebViewSettings.verticalScrollbarThumbColor)) {
            setVerticalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.verticalScrollbarThumbColor)));
        }
        if (hashMap.get("verticalScrollbarTrackColor") != null && !Util.objEquals(this.customSettings.verticalScrollbarTrackColor, inAppWebViewSettings.verticalScrollbarTrackColor)) {
            setVerticalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.verticalScrollbarTrackColor)));
        }
        if (hashMap.get("horizontalScrollbarThumbColor") != null && !Util.objEquals(this.customSettings.horizontalScrollbarThumbColor, inAppWebViewSettings.horizontalScrollbarThumbColor)) {
            setHorizontalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.horizontalScrollbarThumbColor)));
        }
        if (hashMap.get("horizontalScrollbarTrackColor") != null && !Util.objEquals(this.customSettings.horizontalScrollbarTrackColor, inAppWebViewSettings.horizontalScrollbarTrackColor)) {
            setHorizontalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(inAppWebViewSettings.horizontalScrollbarTrackColor)));
        }
        if (hashMap.get("algorithmicDarkeningAllowed") != null && !Util.objEquals(this.customSettings.algorithmicDarkeningAllowed, inAppWebViewSettings.algorithmicDarkeningAllowed) && hm91.d("ALGORITHMIC_DARKENING")) {
            vj41.b(settings, inAppWebViewSettings.algorithmicDarkeningAllowed.booleanValue());
        }
        if (hashMap.get("enterpriseAuthenticationAppLinkPolicyEnabled") != null && !Util.objEquals(this.customSettings.enterpriseAuthenticationAppLinkPolicyEnabled, inAppWebViewSettings.enterpriseAuthenticationAppLinkPolicyEnabled) && hm91.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY")) {
            boolean booleanValue3 = inAppWebViewSettings.enterpriseAuthenticationAppLinkPolicyEnabled.booleanValue();
            if (!qp41.M.a()) {
                throw qp41.a();
            }
            vj41.a(settings).u(booleanValue3);
        }
        if (hashMap.get("requestedWithHeaderOriginAllowList") != null && !Util.objEquals(this.customSettings.requestedWithHeaderOriginAllowList, inAppWebViewSettings.requestedWithHeaderOriginAllowList) && hm91.d("REQUESTED_WITH_HEADER_ALLOW_LIST")) {
            Set<String> set = inAppWebViewSettings.requestedWithHeaderOriginAllowList;
            if (!qp41.O.a()) {
                throw qp41.a();
            }
            vj41.a(settings).y(set);
        }
        if (this.plugin != null) {
            WebViewAssetLoaderExt webViewAssetLoaderExt = this.webViewAssetLoaderExt;
            if (webViewAssetLoaderExt != null) {
                webViewAssetLoaderExt.dispose();
            }
            this.webViewAssetLoaderExt = WebViewAssetLoaderExt.fromMap(this.customSettings.webViewAssetLoader, this.plugin, getContext());
        }
        this.customSettings = inAppWebViewSettings;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setUserContentController(UserContentController userContentController) {
        this.userContentController = userContentController;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void setWebMessageChannels(Map<String, WebMessageChannel> map) {
        this.webMessageChannels = map;
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        Map<String, Object> map;
        return (this.customSettings.useHybridComposition.booleanValue() && !this.customSettings.disableContextMenu.booleanValue() && ((map = this.contextMenu) == null || map.keySet().size() == 0)) ? super.startActionMode(callback) : rebuildActionMode(super.startActionMode(callback), callback);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public void takeScreenshot(final Map<String, Object> map, final da20 da20Var) {
        final float pixelDensity = Util.getPixelDensity(getContext());
        this.mainLooperHandler.post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.8
            @Override // java.lang.Runnable
            public void run() {
                Bitmap bitmap;
                int i;
                double d;
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(InAppWebView.this.getMeasuredWidth(), InAppWebView.this.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.translate(-InAppWebView.this.getScrollX(), -InAppWebView.this.getScrollY());
                    InAppWebView.this.draw(canvas);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                    Map map2 = map;
                    if (map2 != null) {
                        Map map3 = (Map) map2.get("rect");
                        if (map3 != null) {
                            d = 0.5d;
                            createBitmap = Bitmap.createBitmap(createBitmap, (int) Math.floor((((Double) map3.get(RemoteBioParameters.X)).doubleValue() * pixelDensity) + 0.5d), (int) Math.floor((((Double) map3.get(RemoteBioParameters.Y)).doubleValue() * pixelDensity) + 0.5d), Math.min(createBitmap.getWidth(), (int) Math.floor((((Double) map3.get("width")).doubleValue() * pixelDensity) + 0.5d)), Math.min(createBitmap.getHeight(), (int) Math.floor((((Double) map3.get("height")).doubleValue() * pixelDensity) + 0.5d)));
                        } else {
                            d = 0.5d;
                        }
                        Double d2 = (Double) map.get("snapshotWidth");
                        if (d2 != null) {
                            int floor = (int) Math.floor((d2.doubleValue() * pixelDensity) + d);
                            createBitmap = Bitmap.createScaledBitmap(createBitmap, floor, (int) (floor / (createBitmap.getWidth() / createBitmap.getHeight())), true);
                        }
                        bitmap = createBitmap;
                        try {
                            compressFormat = Bitmap.CompressFormat.valueOf((String) map.get("compressFormat"));
                        } catch (IllegalArgumentException e) {
                            Log.e(InAppWebView.LOG_TAG, "", e);
                        }
                        i = ((Integer) map.get("quality")).intValue();
                    } else {
                        bitmap = createBitmap;
                        i = 100;
                    }
                    bitmap.compress(compressFormat, i, byteArrayOutputStream);
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        Log.e(InAppWebView.LOG_TAG, "", e2);
                    }
                    bitmap.recycle();
                    da20Var.success(byteArrayOutputStream.toByteArray());
                } catch (IllegalArgumentException e3) {
                    Log.e(InAppWebView.LOG_TAG, "", e3);
                    da20Var.success(null);
                }
            }
        });
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface
    public float getZoomScale() {
        return this.zoomScale;
    }

    @Override // android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        Map<String, Object> map;
        if (this.customSettings.useHybridComposition.booleanValue() && !this.customSettings.disableContextMenu.booleanValue() && ((map = this.contextMenu) == null || map.keySet().size() == 0)) {
            return super.startActionMode(callback, i);
        }
        return rebuildActionMode(super.startActionMode(callback, i), callback);
    }

    public InAppWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.customSettings = new InAppWebViewSettings();
        this.isLoading = false;
        this.inFullscreen = false;
        this.zoomScale = 1.0f;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.mainLooperHandler = new Handler(getWebViewLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController(this);
        this.callAsyncJavaScriptCallbacks = new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
        this.webMessageChannels = new HashMap();
        this.webMessageListeners = new ArrayList();
        this.initialUserOnlyScripts = new ArrayList();
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
    }

    public InAppWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.customSettings = new InAppWebViewSettings();
        this.isLoading = false;
        this.inFullscreen = false;
        this.zoomScale = 1.0f;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.mainLooperHandler = new Handler(getWebViewLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController(this);
        this.callAsyncJavaScriptCallbacks = new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
        this.webMessageChannels = new HashMap();
        this.webMessageListeners = new ArrayList();
        this.initialUserOnlyScripts = new ArrayList();
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
    }

    public InAppWebView(Context context) {
        super(context);
        this.customSettings = new InAppWebViewSettings();
        this.isLoading = false;
        this.inFullscreen = false;
        this.zoomScale = 1.0f;
        this.contentBlockerHandler = new ContentBlockerHandler();
        this.gestureDetector = null;
        this.floatingContextMenu = null;
        this.contextMenu = null;
        this.mainLooperHandler = new Handler(getWebViewLooper());
        this.newCheckScrollStoppedTask = 100;
        this.newCheckContextMenuShouldBeClosedTaskTask = 100;
        this.userContentController = new UserContentController(this);
        this.callAsyncJavaScriptCallbacks = new HashMap();
        this.evaluateJavaScriptContentWorldCallbacks = new HashMap();
        this.webMessageChannels = new HashMap();
        this.webMessageListeners = new ArrayList();
        this.initialUserOnlyScripts = new ArrayList();
        this.contextMenuPoint = new Point(0, 0);
        this.lastTouch = new Point(0, 0);
    }
}
