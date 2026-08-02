package xsna;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.u13;

/* compiled from: VKWebChromeClient.kt */
/* loaded from: classes6.dex */
public class bir0 extends WebChromeClient {
    public igx0 a;
    public FrameLayout b;
    public View c;
    public WebChromeClient.CustomViewCallback d;

    /* compiled from: VKWebChromeClient.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
            try {
                iArr[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConsoleMessage.MessageLevel.TIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ConsoleMessage.MessageLevel.LOG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        if (defaultVideoPoster != null) {
            return defaultVideoPoster;
        }
        try {
            return BitmapFactory.decodeResource(jgn0.a().getResources(), R.drawable.vk_icon_video_36);
        } catch (Throwable unused) {
            return defaultVideoPoster;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.f("onCloseWindow");
        }
        super.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage != null) {
            ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
            String message = consoleMessage.message();
            int lineNumber = consoleMessage.lineNumber();
            int i = messageLevel == null ? -1 : a.$EnumSwitchMapping$0[messageLevel.ordinal()];
            if (i == 1) {
                String a2 = zil0.a(lineNumber, "js console: ", message, ": ");
                if (qex0.c) {
                    xgx0.a.getClass();
                    xgx0.g(a2);
                }
            } else if (i == 2) {
                String a3 = zil0.a(lineNumber, "js console: ", message, ": ");
                if (qex0.c) {
                    xgx0.a.getClass();
                    xgx0.a(a3);
                }
            } else if (i == 3) {
                String a4 = zil0.a(lineNumber, "js console: ", message, ": ");
                if (qex0.c) {
                    xgx0.a.getClass();
                    xgx0.f(a4);
                }
            } else if (i == 4) {
                String a5 = zil0.a(lineNumber, "js console: ", message, ": ");
                if (qex0.c) {
                    xgx0.a.getClass();
                    xgx0.b(a5);
                }
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                String a6 = zil0.a(lineNumber, "js console: ", message, ": ");
                if (qex0.c) {
                    xgx0.a.getClass();
                    xgx0.a(a6);
                }
            }
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        StringBuilder c = gp.c("onCreateWindow isDialog=", ", isUserGesture=", ", resultMsg=", z, z2);
        c.append(message);
        String sb = c.toString();
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.f(sb);
        }
        return super.onCreateWindow(webView, z, z2, message);
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        String b = go9.b("onExceededDatabaseQuota url=", str);
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a(b);
        }
        super.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a("onGeolocationPermissionsHidePrompt");
        }
        super.onGeolocationPermissionsHidePrompt();
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        String b = go9.b("onGeolocationPermissionsShowPrompt origin=", str);
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a(b);
        }
        super.onGeolocationPermissionsShowPrompt(str, callback);
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a("onHideCustomView");
        }
        super.onHideCustomView();
        FrameLayout frameLayout = this.b;
        if (frameLayout == null || this.d == null || this.c == null) {
            return;
        }
        cp2.d(frameLayout, 0L, new yr2(7, frameLayout, this), new hlq(), 19);
        igx0 igx0Var = this.a;
        if (igx0Var != null) {
            s93 s93Var = igx0Var.a;
            if (s93Var.p()) {
                s93Var.n(new u13.a(null, null));
                igx0Var.b.b();
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        StringBuilder a2 = xe9.a("onRequestFocus url=", str, ", message=", str2, ", result=");
        a2.append(jsResult);
        String sb = a2.toString();
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a(sb);
        }
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        StringBuilder a2 = xe9.a("onJsBeforeUnload url=", str, ", message=", str2, ", result=");
        a2.append(jsResult);
        String sb = a2.toString();
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a(sb);
        }
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        StringBuilder a2 = xe9.a("onJsConfirm url=", str, ", messgae=", str2, ", result=");
        a2.append(jsResult);
        String sb = a2.toString();
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a(sb);
        }
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        StringBuilder a2 = xe9.a("onJsPrompt url=", str, ", message=", str2, ", result=");
        a2.append(jsPromptResult);
        a2.append(", defaultValue=");
        a2.append(str3);
        String sb = a2.toString();
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a(sb);
        }
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsTimeout() {
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.b("onJsTimeout");
        }
        return super.onJsTimeout();
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a("onPermissionRequest");
        }
        super.onPermissionRequest(permissionRequest);
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a("onPermissionRequestCanceled");
        }
        super.onPermissionRequestCanceled(permissionRequest);
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        String a2 = lhg.a(i, "onProgressChanged newProgress=");
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a(a2);
        }
        super.onProgressChanged(webView, i);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str = "onReceivedIcon icon=" + bitmap;
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a(str);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        String b = go9.b("onReceivedTitle title=", str);
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a(b);
        }
        super.onReceivedTitle(webView, str);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        String str2 = "onReceivedTouchIconUrl url=" + str + ", precomposed=" + z;
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a(str2);
        }
        super.onReceivedTouchIconUrl(webView, str, z);
    }

    @Override // android.webkit.WebChromeClient
    public final void onRequestFocus(WebView webView) {
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a("onRequestFocus");
        }
        super.onRequestFocus(webView);
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        View view2;
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a("onShowCustomView");
        }
        super.onShowCustomView(view, customViewCallback);
        FrameLayout frameLayout = this.b;
        if (frameLayout == null) {
            return;
        }
        if (this.c != null || view == null) {
            view2 = view;
            if (customViewCallback != null) {
                customViewCallback.onCustomViewHidden();
            }
        } else {
            this.c = view;
            this.d = customViewCallback;
            frameLayout.setVisibility(0);
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            }
            frameLayout.addView(this.c, new FrameLayout.LayoutParams(-1, -1, 17));
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view2 = view;
            cp2.c(view2, 0L, 0L, null, new j8z(), 7);
        }
        igx0 igx0Var = this.a;
        if (igx0Var != null) {
            s93 s93Var = igx0Var.a;
            if (s93Var.p()) {
                s93Var.n(new u13.a(view2, customViewCallback));
                igx0Var.b.a();
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a("onShowFileChooser");
        }
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        String a2 = lhg.a(i, "onShowCustomView requestedOrientation=");
        if (qex0.c) {
            xgx0.a.getClass();
            xgx0.a(a2);
        }
        super.onShowCustomView(view, i, customViewCallback);
    }
}
