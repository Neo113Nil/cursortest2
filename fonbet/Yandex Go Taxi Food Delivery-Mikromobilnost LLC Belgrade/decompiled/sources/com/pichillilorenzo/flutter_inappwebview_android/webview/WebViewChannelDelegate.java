package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.content.Context;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserSettings;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview_android.types.CreateWindowAction;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomSchemeResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.DownloadStartRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.GeolocationPermissionShowPromptResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.HitTestResult;
import com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthenticationChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsAlertResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsBeforeUnloadResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsConfirmResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsPromptResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction;
import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationActionPolicy;
import com.pichillilorenzo.flutter_inappwebview_android.types.PermissionResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.SafeBrowsingResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustAuthResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.SslCertificateExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePortCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceErrorExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener;
import defpackage.b64;
import defpackage.da20;
import defpackage.ea20;
import defpackage.g8e;
import defpackage.hm91;
import defpackage.ih41;
import defpackage.kh41;
import defpackage.oo31;
import defpackage.qp41;
import defpackage.rm41;
import defpackage.x4e;
import defpackage.x920;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes11.dex */
public class WebViewChannelDelegate extends ChannelDelegateImpl {
    static final String LOG_TAG = "WebViewChannelDelegate";
    private InAppWebView webView;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate$8, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass8 {
        static final /* synthetic */ int[] $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods;

        static {
            int[] iArr = new int[WebViewChannelDelegateMethods.values().length];
            $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods = iArr;
            try {
                iArr[WebViewChannelDelegateMethods.getUrl.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.getTitle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.getProgress.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.loadUrl.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.postUrl.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.loadData.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.loadFile.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.evaluateJavascript.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.injectJavascriptFileFromUrl.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.injectCSSCode.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.injectCSSFileFromUrl.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.reload.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.goBack.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.canGoBack.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.goForward.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.canGoForward.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.goBackOrForward.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.canGoBackOrForward.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.stopLoading.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.isLoading.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.takeScreenshot.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.setSettings.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.getSettings.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.close.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.show.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.hide.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.isHidden.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.getCopyBackForwardList.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.startSafeBrowsing.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.clearCache.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.clearSslPreferences.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.findAll.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.findNext.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.clearMatches.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.scrollTo.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.scrollBy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.pause.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.resume.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.pauseTimers.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.resumeTimers.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.printCurrentPage.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.getContentHeight.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.getContentWidth.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.zoomBy.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.getOriginalUrl.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.getZoomScale.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.getSelectedText.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.getHitTestResult.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.pageDown.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.pageUp.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.saveWebArchive.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.zoomIn.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.zoomOut.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.clearFocus.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.setContextMenu.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.requestFocusNodeHref.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.requestImageRef.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.getScrollX.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.getScrollY.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.getCertificate.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.clearHistory.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.addUserScript.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.removeUserScript.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.removeUserScriptsByGroupName.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.removeAllUserScripts.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.callAsyncJavaScript.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.isSecureContext.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.createWebMessageChannel.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.postWebMessage.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.addWebMessageListener.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.canScrollVertically.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.canScrollHorizontally.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.isInFullscreen.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.clearFormData.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
        }
    }

    public static class CallJsHandlerCallback extends BaseCallbackResultImpl<Object> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public Object decodeResult(Object obj) {
            return obj;
        }
    }

    public static class CreateWindowCallback extends BaseCallbackResultImpl<Boolean> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public Boolean decodeResult(Object obj) {
            return Boolean.valueOf((obj instanceof Boolean) && ((Boolean) obj).booleanValue());
        }
    }

    public static class FormResubmissionCallback extends BaseCallbackResultImpl<Integer> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public Integer decodeResult(Object obj) {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            return null;
        }
    }

    public static class GeolocationPermissionsShowPromptCallback extends BaseCallbackResultImpl<GeolocationPermissionShowPromptResponse> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public GeolocationPermissionShowPromptResponse decodeResult(Object obj) {
            return GeolocationPermissionShowPromptResponse.fromMap((Map) obj);
        }
    }

    public static class JsAlertCallback extends BaseCallbackResultImpl<JsAlertResponse> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public JsAlertResponse decodeResult(Object obj) {
            return JsAlertResponse.fromMap((Map) obj);
        }
    }

    public static class JsBeforeUnloadCallback extends BaseCallbackResultImpl<JsBeforeUnloadResponse> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public JsBeforeUnloadResponse decodeResult(Object obj) {
            return JsBeforeUnloadResponse.fromMap((Map) obj);
        }
    }

    public static class JsConfirmCallback extends BaseCallbackResultImpl<JsConfirmResponse> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public JsConfirmResponse decodeResult(Object obj) {
            return JsConfirmResponse.fromMap((Map) obj);
        }
    }

    public static class JsPromptCallback extends BaseCallbackResultImpl<JsPromptResponse> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public JsPromptResponse decodeResult(Object obj) {
            return JsPromptResponse.fromMap((Map) obj);
        }
    }

    public static class LoadResourceWithCustomSchemeCallback extends BaseCallbackResultImpl<CustomSchemeResponse> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public CustomSchemeResponse decodeResult(Object obj) {
            return CustomSchemeResponse.fromMap((Map) obj);
        }
    }

    public static class PermissionRequestCallback extends BaseCallbackResultImpl<PermissionResponse> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public PermissionResponse decodeResult(Object obj) {
            return PermissionResponse.fromMap((Map) obj);
        }
    }

    public static class PrintRequestCallback extends BaseCallbackResultImpl<Boolean> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public Boolean decodeResult(Object obj) {
            return Boolean.valueOf((obj instanceof Boolean) && ((Boolean) obj).booleanValue());
        }
    }

    public static class ReceivedClientCertRequestCallback extends BaseCallbackResultImpl<ClientCertResponse> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public ClientCertResponse decodeResult(Object obj) {
            return ClientCertResponse.fromMap((Map) obj);
        }
    }

    public static class ReceivedHttpAuthRequestCallback extends BaseCallbackResultImpl<HttpAuthResponse> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public HttpAuthResponse decodeResult(Object obj) {
            return HttpAuthResponse.fromMap((Map) obj);
        }
    }

    public static class ReceivedServerTrustAuthRequestCallback extends BaseCallbackResultImpl<ServerTrustAuthResponse> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public ServerTrustAuthResponse decodeResult(Object obj) {
            return ServerTrustAuthResponse.fromMap((Map) obj);
        }
    }

    public static class RenderProcessResponsiveCallback extends BaseCallbackResultImpl<Integer> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public Integer decodeResult(Object obj) {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            return null;
        }
    }

    public static class RenderProcessUnresponsiveCallback extends BaseCallbackResultImpl<Integer> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public Integer decodeResult(Object obj) {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            return null;
        }
    }

    public static class SafeBrowsingHitCallback extends BaseCallbackResultImpl<SafeBrowsingResponse> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public SafeBrowsingResponse decodeResult(Object obj) {
            return SafeBrowsingResponse.fromMap((Map) obj);
        }
    }

    public static class ShouldInterceptRequestCallback extends BaseCallbackResultImpl<WebResourceResponseExt> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public WebResourceResponseExt decodeResult(Object obj) {
            return WebResourceResponseExt.fromMap((Map) obj);
        }
    }

    public static class ShouldOverrideUrlLoadingCallback extends BaseCallbackResultImpl<NavigationActionPolicy> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public NavigationActionPolicy decodeResult(Object obj) {
            return NavigationActionPolicy.fromValue(obj instanceof Integer ? ((Integer) obj).intValue() : NavigationActionPolicy.CANCEL.rawValue());
        }
    }

    public static class SyncLoadResourceWithCustomSchemeCallback extends SyncBaseCallbackResultImpl<CustomSchemeResponse> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public CustomSchemeResponse decodeResult(Object obj) {
            return new LoadResourceWithCustomSchemeCallback().decodeResult(obj);
        }
    }

    public static class SyncShouldInterceptRequestCallback extends SyncBaseCallbackResultImpl<WebResourceResponseExt> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public WebResourceResponseExt decodeResult(Object obj) {
            return new ShouldInterceptRequestCallback().decodeResult(obj);
        }
    }

    public WebViewChannelDelegate(InAppWebView inAppWebView, ea20 ea20Var) {
        super(ea20Var);
        this.webView = inAppWebView;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.webView = null;
    }

    public void onCallJsHandler(String str, String str2, CallJsHandlerCallback callJsHandlerCallback) {
        ea20 channel = getChannel();
        if (channel == null) {
            callJsHandlerCallback.defaultBehaviour(null);
        } else {
            channel.a("onCallJsHandler", g8e.u("handlerName", str, "args", str2), callJsHandlerCallback);
        }
    }

    public void onCloseWindow() {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onCloseWindow", new HashMap(), null);
    }

    public void onConsoleMessage(String str, int i) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap p = x4e.p(Constants.KEY_MESSAGE, str);
        p.put("messageLevel", Integer.valueOf(i));
        channel.a("onConsoleMessage", p, null);
    }

    public void onContextMenuActionItemClicked(int i, String str) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        b64.B(i, hashMap, "id", i, "androidId");
        hashMap.put("iosId", null);
        hashMap.put("title", str);
        channel.a("onContextMenuActionItemClicked", hashMap, null);
    }

    public void onCreateContextMenu(HitTestResult hitTestResult) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onCreateContextMenu", hitTestResult.toMap(), null);
    }

    public void onCreateWindow(CreateWindowAction createWindowAction, CreateWindowCallback createWindowCallback) {
        ea20 channel = getChannel();
        if (channel == null) {
            createWindowCallback.defaultBehaviour(null);
        } else {
            channel.a("onCreateWindow", createWindowAction.toMap(), createWindowCallback);
        }
    }

    public void onDownloadStartRequest(DownloadStartRequest downloadStartRequest) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onDownloadStartRequest", downloadStartRequest.toMap(), null);
    }

    public void onEnterFullscreen() {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onEnterFullscreen", new HashMap(), null);
    }

    public void onExitFullscreen() {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onExitFullscreen", new HashMap(), null);
    }

    @Deprecated
    public void onFindResultReceived(int i, int i2, boolean z) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        b64.B(i, hashMap, "activeMatchOrdinal", i2, "numberOfMatches");
        hashMap.put("isDoneCounting", Boolean.valueOf(z));
        channel.a("onFindResultReceived", hashMap, null);
    }

    public void onFormResubmission(String str, FormResubmissionCallback formResubmissionCallback) {
        ea20 channel = getChannel();
        if (channel == null) {
            formResubmissionCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        channel.a("onFormResubmission", hashMap, formResubmissionCallback);
    }

    public void onGeolocationPermissionsHidePrompt() {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onGeolocationPermissionsHidePrompt", new HashMap(), null);
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissionsShowPromptCallback geolocationPermissionsShowPromptCallback) {
        ea20 channel = getChannel();
        if (channel == null) {
            geolocationPermissionsShowPromptCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("origin", str);
        channel.a("onGeolocationPermissionsShowPrompt", hashMap, geolocationPermissionsShowPromptCallback);
    }

    public void onHideContextMenu() {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onHideContextMenu", new HashMap(), null);
    }

    public void onJsAlert(String str, String str2, Boolean bool, JsAlertCallback jsAlertCallback) {
        ea20 channel = getChannel();
        if (channel == null) {
            jsAlertCallback.defaultBehaviour(null);
            return;
        }
        HashMap u = g8e.u("url", str, Constants.KEY_MESSAGE, str2);
        u.put("isMainFrame", bool);
        channel.a("onJsAlert", u, jsAlertCallback);
    }

    public void onJsBeforeUnload(String str, String str2, JsBeforeUnloadCallback jsBeforeUnloadCallback) {
        ea20 channel = getChannel();
        if (channel == null) {
            jsBeforeUnloadCallback.defaultBehaviour(null);
        } else {
            channel.a("onJsBeforeUnload", g8e.u("url", str, Constants.KEY_MESSAGE, str2), jsBeforeUnloadCallback);
        }
    }

    public void onJsConfirm(String str, String str2, Boolean bool, JsConfirmCallback jsConfirmCallback) {
        ea20 channel = getChannel();
        if (channel == null) {
            jsConfirmCallback.defaultBehaviour(null);
            return;
        }
        HashMap u = g8e.u("url", str, Constants.KEY_MESSAGE, str2);
        u.put("isMainFrame", bool);
        channel.a("onJsConfirm", u, jsConfirmCallback);
    }

    public void onJsPrompt(String str, String str2, String str3, Boolean bool, JsPromptCallback jsPromptCallback) {
        ea20 channel = getChannel();
        if (channel == null) {
            jsPromptCallback.defaultBehaviour(null);
            return;
        }
        HashMap u = g8e.u("url", str, Constants.KEY_MESSAGE, str2);
        u.put("defaultValue", str3);
        u.put("isMainFrame", bool);
        channel.a("onJsPrompt", u, jsPromptCallback);
    }

    public CustomSchemeResponse onLoadResourceWithCustomScheme(WebResourceRequestExt webResourceRequestExt) {
        ea20 channel = getChannel();
        if (channel == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("request", webResourceRequestExt.toMap());
        return (CustomSchemeResponse) Util.invokeMethodAndWaitResult(channel, "onLoadResourceWithCustomScheme", hashMap, new SyncLoadResourceWithCustomSchemeCallback());
    }

    public void onLoadStart(String str) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        channel.a("onLoadStart", hashMap, null);
    }

    public void onLoadStop(String str) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        channel.a("onLoadStop", hashMap, null);
    }

    public void onLongPressHitTestResult(HitTestResult hitTestResult) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onLongPressHitTestResult", hitTestResult.toMap(), null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, defpackage.ca20
    public void onMethodCall(x920 x920Var, final da20 da20Var) {
        try {
            switch (AnonymousClass8.$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.valueOf(x920Var.a).ordinal()]) {
                case 1:
                    InAppWebView inAppWebView = this.webView;
                    da20Var.success(inAppWebView != null ? inAppWebView.getUrl() : null);
                    break;
                case 2:
                    InAppWebView inAppWebView2 = this.webView;
                    da20Var.success(inAppWebView2 != null ? inAppWebView2.getTitle() : null);
                    break;
                case 3:
                    InAppWebView inAppWebView3 = this.webView;
                    da20Var.success(inAppWebView3 != null ? Integer.valueOf(inAppWebView3.getProgress()) : null);
                    break;
                case 4:
                    if (this.webView != null) {
                        this.webView.loadUrl(URLRequest.fromMap((Map) x920Var.a("urlRequest")));
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 5:
                    if (this.webView != null) {
                        this.webView.postUrl((String) x920Var.a("url"), (byte[]) x920Var.a("postData"));
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 6:
                    if (this.webView != null) {
                        this.webView.loadDataWithBaseURL((String) x920Var.a("baseUrl"), (String) x920Var.a(Constants.KEY_DATA), (String) x920Var.a("mimeType"), (String) x920Var.a("encoding"), (String) x920Var.a("historyUrl"));
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 7:
                    if (this.webView != null) {
                        try {
                            this.webView.loadFile((String) x920Var.a("assetFilePath"));
                        } catch (IOException e) {
                            da20Var.error(LOG_TAG, e.getMessage(), null);
                            return;
                        }
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 8:
                    if (this.webView != null) {
                        this.webView.evaluateJavascript((String) x920Var.a("source"), ContentWorld.fromMap((Map) x920Var.a("contentWorld")), new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.1
                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(String str) {
                                da20Var.success(str);
                            }
                        });
                        break;
                    } else {
                        da20Var.success(null);
                        break;
                    }
                case 9:
                    if (this.webView != null) {
                        this.webView.injectJavascriptFileFromUrl((String) x920Var.a("urlFile"), (Map) x920Var.a("scriptHtmlTagAttributes"));
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 10:
                    if (this.webView != null) {
                        this.webView.injectCSSCode((String) x920Var.a("source"));
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 11:
                    if (this.webView != null) {
                        this.webView.injectCSSFileFromUrl((String) x920Var.a("urlFile"), (Map) x920Var.a("cssLinkHtmlTagAttributes"));
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 12:
                    InAppWebView inAppWebView4 = this.webView;
                    if (inAppWebView4 != null) {
                        inAppWebView4.reload();
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 13:
                    InAppWebView inAppWebView5 = this.webView;
                    if (inAppWebView5 != null) {
                        inAppWebView5.goBack();
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 14:
                    InAppWebView inAppWebView6 = this.webView;
                    da20Var.success(Boolean.valueOf(inAppWebView6 != null && inAppWebView6.canGoBack()));
                    break;
                case 15:
                    InAppWebView inAppWebView7 = this.webView;
                    if (inAppWebView7 != null) {
                        inAppWebView7.goForward();
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 16:
                    InAppWebView inAppWebView8 = this.webView;
                    da20Var.success(Boolean.valueOf(inAppWebView8 != null && inAppWebView8.canGoForward()));
                    break;
                case 17:
                    InAppWebView inAppWebView9 = this.webView;
                    if (inAppWebView9 != null) {
                        inAppWebView9.goBackOrForward(((Integer) x920Var.a("steps")).intValue());
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 18:
                    InAppWebView inAppWebView10 = this.webView;
                    da20Var.success(Boolean.valueOf(inAppWebView10 != null && inAppWebView10.canGoBackOrForward(((Integer) x920Var.a("steps")).intValue())));
                    break;
                case 19:
                    InAppWebView inAppWebView11 = this.webView;
                    if (inAppWebView11 != null) {
                        inAppWebView11.stopLoading();
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 20:
                    InAppWebView inAppWebView12 = this.webView;
                    da20Var.success(Boolean.valueOf(inAppWebView12 != null && inAppWebView12.isLoading()));
                    break;
                case 21:
                    if (this.webView != null) {
                        this.webView.takeScreenshot((Map) x920Var.a("screenshotConfiguration"), da20Var);
                        break;
                    } else {
                        da20Var.success(null);
                        break;
                    }
                case 22:
                    InAppWebView inAppWebView13 = this.webView;
                    if (inAppWebView13 != null && (inAppWebView13.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                        InAppBrowserActivity inAppBrowserActivity = (InAppBrowserActivity) this.webView.getInAppBrowserDelegate();
                        InAppBrowserSettings inAppBrowserSettings = new InAppBrowserSettings();
                        HashMap<String, Object> hashMap = (HashMap) x920Var.a("settings");
                        inAppBrowserSettings.parse2((Map<String, Object>) hashMap);
                        inAppBrowserActivity.setSettings(inAppBrowserSettings, hashMap);
                    } else if (this.webView != null) {
                        InAppWebViewSettings inAppWebViewSettings = new InAppWebViewSettings();
                        HashMap<String, Object> hashMap2 = (HashMap) x920Var.a("settings");
                        inAppWebViewSettings.parse2((Map<String, Object>) hashMap2);
                        this.webView.setSettings(inAppWebViewSettings, hashMap2);
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 23:
                    InAppWebView inAppWebView14 = this.webView;
                    if (inAppWebView14 == null || !(inAppWebView14.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                        InAppWebView inAppWebView15 = this.webView;
                        da20Var.success(inAppWebView15 != null ? inAppWebView15.getCustomSettings() : null);
                        break;
                    } else {
                        da20Var.success(((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).getCustomSettings());
                        break;
                    }
                    break;
                case 24:
                    InAppWebView inAppWebView16 = this.webView;
                    if (inAppWebView16 == null || !(inAppWebView16.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                        da20Var.notImplemented();
                        break;
                    } else {
                        ((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).close(da20Var);
                        break;
                    }
                case 25:
                    InAppWebView inAppWebView17 = this.webView;
                    if (inAppWebView17 == null || !(inAppWebView17.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                        da20Var.notImplemented();
                        break;
                    } else {
                        ((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).show();
                        da20Var.success(Boolean.TRUE);
                        break;
                    }
                case 26:
                    InAppWebView inAppWebView18 = this.webView;
                    if (inAppWebView18 == null || !(inAppWebView18.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                        da20Var.notImplemented();
                        break;
                    } else {
                        ((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).hide();
                        da20Var.success(Boolean.TRUE);
                        break;
                    }
                case 27:
                    InAppWebView inAppWebView19 = this.webView;
                    if (inAppWebView19 == null || !(inAppWebView19.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                        da20Var.notImplemented();
                        break;
                    } else {
                        da20Var.success(Boolean.valueOf(((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).isHidden));
                        break;
                    }
                case 28:
                    InAppWebView inAppWebView20 = this.webView;
                    da20Var.success(inAppWebView20 != null ? inAppWebView20.getCopyBackForwardList() : null);
                    break;
                case 29:
                    if (this.webView == null || !hm91.d("START_SAFE_BROWSING")) {
                        da20Var.success(Boolean.FALSE);
                        break;
                    } else {
                        Context context = this.webView.getContext();
                        ValueCallback<Boolean> valueCallback = new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.2
                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(Boolean bool) {
                                da20Var.success(bool);
                            }
                        };
                        Uri uri = rm41.a;
                        qp41.d.getClass();
                        WebView.startSafeBrowsing(context, valueCallback);
                        break;
                    }
                    break;
                case 30:
                    InAppWebView inAppWebView21 = this.webView;
                    if (inAppWebView21 != null) {
                        inAppWebView21.clearAllCache();
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 31:
                    InAppWebView inAppWebView22 = this.webView;
                    if (inAppWebView22 != null) {
                        inAppWebView22.clearSslPreferences();
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 32:
                    if (this.webView != null) {
                        this.webView.findAllAsync((String) x920Var.a("find"));
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 33:
                    if (this.webView != null) {
                        this.webView.findNext(((Boolean) x920Var.a("forward")).booleanValue());
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 34:
                    InAppWebView inAppWebView23 = this.webView;
                    if (inAppWebView23 != null) {
                        inAppWebView23.clearMatches();
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 35:
                    if (this.webView != null) {
                        this.webView.scrollTo((Integer) x920Var.a(RemoteBioParameters.X), (Integer) x920Var.a(RemoteBioParameters.Y), (Boolean) x920Var.a("animated"));
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 36:
                    if (this.webView != null) {
                        this.webView.scrollBy((Integer) x920Var.a(RemoteBioParameters.X), (Integer) x920Var.a(RemoteBioParameters.Y), (Boolean) x920Var.a("animated"));
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 37:
                    InAppWebView inAppWebView24 = this.webView;
                    if (inAppWebView24 != null) {
                        inAppWebView24.onPause();
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 38:
                    InAppWebView inAppWebView25 = this.webView;
                    if (inAppWebView25 != null) {
                        inAppWebView25.onResume();
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 39:
                    InAppWebView inAppWebView26 = this.webView;
                    if (inAppWebView26 != null) {
                        inAppWebView26.pauseTimers();
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 40:
                    InAppWebView inAppWebView27 = this.webView;
                    if (inAppWebView27 != null) {
                        inAppWebView27.resumeTimers();
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 41:
                    if (this.webView != null) {
                        PrintJobSettings printJobSettings = new PrintJobSettings();
                        Map<String, Object> map = (Map) x920Var.a("settings");
                        if (map != null) {
                            printJobSettings.parse2(map);
                        }
                        da20Var.success(this.webView.printCurrentPage(printJobSettings));
                        break;
                    } else {
                        da20Var.success(null);
                        break;
                    }
                case 42:
                    InAppWebView inAppWebView28 = this.webView;
                    if (inAppWebView28 != null) {
                        da20Var.success(Integer.valueOf(inAppWebView28.getContentHeight()));
                        break;
                    } else {
                        da20Var.success(null);
                        break;
                    }
                case 43:
                    InAppWebView inAppWebView29 = this.webView;
                    if (inAppWebView29 != null) {
                        inAppWebView29.getContentWidth(new ValueCallback<Integer>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.3
                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(Integer num) {
                                da20Var.success(num);
                            }
                        });
                        break;
                    } else {
                        da20Var.success(null);
                        break;
                    }
                case 44:
                    if (this.webView != null) {
                        this.webView.zoomBy((float) ((Double) x920Var.a("zoomFactor")).doubleValue());
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 45:
                    InAppWebView inAppWebView30 = this.webView;
                    da20Var.success(inAppWebView30 != null ? inAppWebView30.getOriginalUrl() : null);
                    break;
                case 46:
                    InAppWebView inAppWebView31 = this.webView;
                    if (inAppWebView31 != null) {
                        da20Var.success(Float.valueOf(inAppWebView31.getZoomScale()));
                        break;
                    } else {
                        da20Var.success(null);
                        break;
                    }
                case 47:
                    InAppWebView inAppWebView32 = this.webView;
                    if (inAppWebView32 != null) {
                        inAppWebView32.getSelectedText(new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.4
                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(String str) {
                                da20Var.success(str);
                            }
                        });
                        break;
                    } else {
                        da20Var.success(null);
                        break;
                    }
                case 48:
                    InAppWebView inAppWebView33 = this.webView;
                    if (inAppWebView33 != null) {
                        da20Var.success(HitTestResult.fromWebViewHitTestResult(inAppWebView33.getHitTestResult()).toMap());
                        break;
                    } else {
                        da20Var.success(null);
                        break;
                    }
                case 49:
                    if (this.webView != null) {
                        da20Var.success(Boolean.valueOf(this.webView.pageDown(((Boolean) x920Var.a("bottom")).booleanValue())));
                        break;
                    } else {
                        da20Var.success(Boolean.FALSE);
                        break;
                    }
                case 50:
                    if (this.webView != null) {
                        da20Var.success(Boolean.valueOf(this.webView.pageUp(((Boolean) x920Var.a("top")).booleanValue())));
                        break;
                    } else {
                        da20Var.success(Boolean.FALSE);
                        break;
                    }
                case SAFETY_TIPS_VALUE:
                    if (this.webView != null) {
                        this.webView.saveWebArchive((String) x920Var.a("filePath"), ((Boolean) x920Var.a("autoname")).booleanValue(), new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.5
                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(String str) {
                                da20Var.success(str);
                            }
                        });
                        break;
                    } else {
                        da20Var.success(null);
                        break;
                    }
                case 52:
                    InAppWebView inAppWebView34 = this.webView;
                    if (inAppWebView34 != null) {
                        da20Var.success(Boolean.valueOf(inAppWebView34.zoomIn()));
                        break;
                    } else {
                        da20Var.success(Boolean.FALSE);
                        break;
                    }
                case 53:
                    InAppWebView inAppWebView35 = this.webView;
                    if (inAppWebView35 != null) {
                        da20Var.success(Boolean.valueOf(inAppWebView35.zoomOut()));
                        break;
                    } else {
                        da20Var.success(Boolean.FALSE);
                        break;
                    }
                case 54:
                    InAppWebView inAppWebView36 = this.webView;
                    if (inAppWebView36 != null) {
                        inAppWebView36.clearFocus();
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case SODA_DE_DE_VALUE:
                    if (this.webView != null) {
                        this.webView.setContextMenu((Map) x920Var.a("contextMenu"));
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 56:
                    InAppWebView inAppWebView37 = this.webView;
                    if (inAppWebView37 != null) {
                        da20Var.success(inAppWebView37.requestFocusNodeHref());
                        break;
                    } else {
                        da20Var.success(null);
                        break;
                    }
                case SODA_ES_ES_VALUE:
                    InAppWebView inAppWebView38 = this.webView;
                    if (inAppWebView38 != null) {
                        da20Var.success(inAppWebView38.requestImageRef());
                        break;
                    } else {
                        da20Var.success(null);
                        break;
                    }
                case 58:
                    InAppWebView inAppWebView39 = this.webView;
                    if (inAppWebView39 != null) {
                        da20Var.success(Integer.valueOf(inAppWebView39.getScrollX()));
                        break;
                    } else {
                        da20Var.success(null);
                        break;
                    }
                case 59:
                    InAppWebView inAppWebView40 = this.webView;
                    if (inAppWebView40 != null) {
                        da20Var.success(Integer.valueOf(inAppWebView40.getScrollY()));
                        break;
                    } else {
                        da20Var.success(null);
                        break;
                    }
                case 60:
                    InAppWebView inAppWebView41 = this.webView;
                    if (inAppWebView41 != null) {
                        da20Var.success(SslCertificateExt.toMap(inAppWebView41.getCertificate()));
                        break;
                    } else {
                        da20Var.success(null);
                        break;
                    }
                case 61:
                    InAppWebView inAppWebView42 = this.webView;
                    if (inAppWebView42 != null) {
                        inAppWebView42.clearHistory();
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 62:
                    InAppWebView inAppWebView43 = this.webView;
                    if (inAppWebView43 != null && inAppWebView43.getUserContentController() != null) {
                        da20Var.success(Boolean.valueOf(this.webView.getUserContentController().addUserOnlyScript(UserScript.fromMap((Map) x920Var.a("userScript")))));
                        break;
                    } else {
                        da20Var.success(Boolean.FALSE);
                        break;
                    }
                    break;
                case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                    InAppWebView inAppWebView44 = this.webView;
                    if (inAppWebView44 != null && inAppWebView44.getUserContentController() != null) {
                        da20Var.success(Boolean.valueOf(this.webView.getUserContentController().removeUserOnlyScriptAt(((Integer) x920Var.a("index")).intValue(), UserScript.fromMap((Map) x920Var.a("userScript")).getInjectionTime())));
                        break;
                    } else {
                        da20Var.success(Boolean.FALSE);
                        break;
                    }
                    break;
                case 64:
                    InAppWebView inAppWebView45 = this.webView;
                    if (inAppWebView45 != null && inAppWebView45.getUserContentController() != null) {
                        this.webView.getUserContentController().removeUserOnlyScriptsByGroupName((String) x920Var.a("groupName"));
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 65:
                    InAppWebView inAppWebView46 = this.webView;
                    if (inAppWebView46 != null && inAppWebView46.getUserContentController() != null) {
                        this.webView.getUserContentController().removeAllUserOnlyScripts();
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
                case 66:
                    if (this.webView != null) {
                        this.webView.callAsyncJavaScript((String) x920Var.a("functionBody"), (Map) x920Var.a("arguments"), ContentWorld.fromMap((Map) x920Var.a("contentWorld")), new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.6
                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(String str) {
                                da20Var.success(str);
                            }
                        });
                        break;
                    } else {
                        da20Var.success(null);
                        break;
                    }
                case 67:
                    InAppWebView inAppWebView47 = this.webView;
                    if (inAppWebView47 != null) {
                        inAppWebView47.isSecureContext(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.7
                            @Override // android.webkit.ValueCallback
                            public void onReceiveValue(Boolean bool) {
                                da20Var.success(bool);
                            }
                        });
                        break;
                    } else {
                        da20Var.success(Boolean.FALSE);
                        break;
                    }
                case TRANSLATE_KIT_VALUE:
                    if (this.webView != null) {
                        if (hm91.d("CREATE_WEB_MESSAGE_CHANNEL")) {
                            da20Var.success(this.webView.createCompatWebMessageChannel().toMap());
                            break;
                        } else {
                            da20Var.success(null);
                            break;
                        }
                    } else {
                        da20Var.success(null);
                        break;
                    }
                case 69:
                    if (this.webView == null || !hm91.d("POST_WEB_MESSAGE")) {
                        da20Var.success(Boolean.TRUE);
                        break;
                    } else {
                        WebMessageCompatExt fromMap = WebMessageCompatExt.fromMap((Map) x920Var.a(Constants.KEY_MESSAGE));
                        String str = (String) x920Var.a("targetOrigin");
                        ArrayList arrayList = new ArrayList();
                        List<WebMessagePortCompatExt> ports = fromMap.getPorts();
                        if (ports != null) {
                            for (WebMessagePortCompatExt webMessagePortCompatExt : ports) {
                                WebMessageChannel webMessageChannel = this.webView.getWebMessageChannels().get(webMessagePortCompatExt.getWebMessageChannelId());
                                if (webMessageChannel != null && this.webView != null) {
                                    arrayList.add(webMessageChannel.compatPorts.get(webMessagePortCompatExt.getIndex()));
                                }
                            }
                        }
                        Object data = fromMap.getData();
                        if (this.webView != null) {
                            try {
                                if (hm91.d("WEB_MESSAGE_ARRAY_BUFFER") && data != null && fromMap.getType() == 1) {
                                    rm41.d(this.webView, new ih41((byte[]) data, (kh41[]) arrayList.toArray(new kh41[0])), Uri.parse(str));
                                } else {
                                    rm41.d(this.webView, new ih41(data != null ? data.toString() : null, (kh41[]) arrayList.toArray(new kh41[0])), Uri.parse(str));
                                }
                                da20Var.success(Boolean.TRUE);
                                break;
                            } catch (Exception e2) {
                                da20Var.error(LOG_TAG, e2.getMessage(), null);
                                return;
                            }
                        }
                    }
                    break;
                case 70:
                    if (this.webView == null) {
                        da20Var.success(Boolean.TRUE);
                        break;
                    } else {
                        Map map2 = (Map) x920Var.a("webMessageListener");
                        InAppWebView inAppWebView48 = this.webView;
                        WebMessageListener fromMap2 = WebMessageListener.fromMap(inAppWebView48, inAppWebView48.getPlugin().messenger, map2);
                        if (this.webView == null || !hm91.d("WEB_MESSAGE_LISTENER")) {
                            da20Var.success(Boolean.TRUE);
                            break;
                        } else {
                            try {
                                this.webView.addWebMessageListener(fromMap2);
                                da20Var.success(Boolean.TRUE);
                                break;
                            } catch (Exception e3) {
                                da20Var.error(LOG_TAG, e3.getMessage(), null);
                                return;
                            }
                        }
                    }
                    break;
                case 71:
                    InAppWebView inAppWebView49 = this.webView;
                    if (inAppWebView49 != null) {
                        da20Var.success(Boolean.valueOf(inAppWebView49.canScrollVertically()));
                        break;
                    } else {
                        da20Var.success(Boolean.FALSE);
                        break;
                    }
                case 72:
                    InAppWebView inAppWebView50 = this.webView;
                    if (inAppWebView50 != null) {
                        da20Var.success(Boolean.valueOf(inAppWebView50.canScrollHorizontally()));
                        break;
                    } else {
                        da20Var.success(Boolean.FALSE);
                        break;
                    }
                case HProv.ALG_SID_GR3410_12_256 /* 73 */:
                    InAppWebView inAppWebView51 = this.webView;
                    if (inAppWebView51 != null) {
                        da20Var.success(Boolean.valueOf(inAppWebView51.isInFullscreen()));
                        break;
                    } else {
                        da20Var.success(Boolean.FALSE);
                        break;
                    }
                case 74:
                    InAppWebView inAppWebView52 = this.webView;
                    if (inAppWebView52 != null) {
                        inAppWebView52.clearFormData();
                    }
                    da20Var.success(Boolean.TRUE);
                    break;
            }
        } catch (IllegalArgumentException unused) {
            da20Var.notImplemented();
        }
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        b64.B(i, hashMap, RemoteBioParameters.X, i2, RemoteBioParameters.Y);
        oo31.q(z, hashMap, "clampedX", z2, "clampedY");
        channel.a("onOverScrolled", hashMap, null);
    }

    public void onPageCommitVisible(String str) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        channel.a("onPageCommitVisible", hashMap, null);
    }

    public void onPermissionRequest(String str, List<String> list, Object obj, PermissionRequestCallback permissionRequestCallback) {
        ea20 channel = getChannel();
        if (channel == null) {
            permissionRequestCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("origin", str);
        hashMap.put("resources", list);
        hashMap.put("frame", obj);
        channel.a("onPermissionRequest", hashMap, permissionRequestCallback);
    }

    public void onPermissionRequestCanceled(String str, List<String> list) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("origin", str);
        hashMap.put("resources", list);
        channel.a("onPermissionRequestCanceled", hashMap, null);
    }

    public void onPrintRequest(String str, String str2, PrintRequestCallback printRequestCallback) {
        ea20 channel = getChannel();
        if (channel == null) {
            printRequestCallback.defaultBehaviour(null);
        } else {
            channel.a("onPrintRequest", g8e.u("url", str, "printJobId", str2), printRequestCallback);
        }
    }

    public void onProgressChanged(int i) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("progress", Integer.valueOf(i));
        channel.a("onProgressChanged", hashMap, null);
    }

    public void onReceivedClientCertRequest(ClientCertChallenge clientCertChallenge, ReceivedClientCertRequestCallback receivedClientCertRequestCallback) {
        ea20 channel = getChannel();
        if (channel == null) {
            receivedClientCertRequestCallback.defaultBehaviour(null);
        } else {
            channel.a("onReceivedClientCertRequest", clientCertChallenge.toMap(), receivedClientCertRequestCallback);
        }
    }

    public void onReceivedError(WebResourceRequestExt webResourceRequestExt, WebResourceErrorExt webResourceErrorExt) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("request", webResourceRequestExt.toMap());
        hashMap.put("error", webResourceErrorExt.toMap());
        channel.a("onReceivedError", hashMap, null);
    }

    public void onReceivedHttpAuthRequest(HttpAuthenticationChallenge httpAuthenticationChallenge, ReceivedHttpAuthRequestCallback receivedHttpAuthRequestCallback) {
        ea20 channel = getChannel();
        if (channel == null) {
            receivedHttpAuthRequestCallback.defaultBehaviour(null);
        } else {
            channel.a("onReceivedHttpAuthRequest", httpAuthenticationChallenge.toMap(), receivedHttpAuthRequestCallback);
        }
    }

    public void onReceivedHttpError(WebResourceRequestExt webResourceRequestExt, WebResourceResponseExt webResourceResponseExt) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("request", webResourceRequestExt.toMap());
        hashMap.put("errorResponse", webResourceResponseExt.toMap());
        channel.a("onReceivedHttpError", hashMap, null);
    }

    public void onReceivedIcon(byte[] bArr) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("icon", bArr);
        channel.a("onReceivedIcon", hashMap, null);
    }

    public void onReceivedLoginRequest(String str, String str2, String str3) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap u = g8e.u(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM, str, "account", str2);
        u.put("args", str3);
        channel.a("onReceivedLoginRequest", u, null);
    }

    public void onReceivedServerTrustAuthRequest(ServerTrustChallenge serverTrustChallenge, ReceivedServerTrustAuthRequestCallback receivedServerTrustAuthRequestCallback) {
        ea20 channel = getChannel();
        if (channel == null) {
            receivedServerTrustAuthRequestCallback.defaultBehaviour(null);
        } else {
            channel.a("onReceivedServerTrustAuthRequest", serverTrustChallenge.toMap(), receivedServerTrustAuthRequestCallback);
        }
    }

    public void onReceivedTouchIconUrl(String str, boolean z) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap p = x4e.p("url", str);
        p.put("precomposed", Boolean.valueOf(z));
        channel.a("onReceivedTouchIconUrl", p, null);
    }

    public void onRenderProcessGone(boolean z, int i) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("didCrash", Boolean.valueOf(z));
        hashMap.put("rendererPriorityAtExit", Integer.valueOf(i));
        channel.a("onRenderProcessGone", hashMap, null);
    }

    public void onRenderProcessResponsive(String str, RenderProcessResponsiveCallback renderProcessResponsiveCallback) {
        ea20 channel = getChannel();
        if (channel == null) {
            renderProcessResponsiveCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        channel.a("onRenderProcessResponsive", hashMap, renderProcessResponsiveCallback);
    }

    public void onRenderProcessUnresponsive(String str, RenderProcessUnresponsiveCallback renderProcessUnresponsiveCallback) {
        ea20 channel = getChannel();
        if (channel == null) {
            renderProcessUnresponsiveCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        channel.a("onRenderProcessUnresponsive", hashMap, renderProcessUnresponsiveCallback);
    }

    public void onRequestFocus() {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.a("onRequestFocus", new HashMap(), null);
    }

    public void onSafeBrowsingHit(String str, int i, SafeBrowsingHitCallback safeBrowsingHitCallback) {
        ea20 channel = getChannel();
        if (channel == null) {
            safeBrowsingHitCallback.defaultBehaviour(null);
            return;
        }
        HashMap p = x4e.p("url", str);
        p.put("threatType", Integer.valueOf(i));
        channel.a("onSafeBrowsingHit", p, safeBrowsingHitCallback);
    }

    public void onScrollChanged(int i, int i2) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        b64.B(i, hashMap, RemoteBioParameters.X, i2, RemoteBioParameters.Y);
        channel.a("onScrollChanged", hashMap, null);
    }

    public void onTitleChanged(String str) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("title", str);
        channel.a("onTitleChanged", hashMap, null);
    }

    public void onUpdateVisitedHistory(String str, boolean z) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap p = x4e.p("url", str);
        p.put("isReload", Boolean.valueOf(z));
        channel.a("onUpdateVisitedHistory", p, null);
    }

    public void onZoomScaleChanged(float f, float f2) {
        ea20 channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("oldScale", Float.valueOf(f));
        hashMap.put("newScale", Float.valueOf(f2));
        channel.a("onZoomScaleChanged", hashMap, null);
    }

    public WebResourceResponseExt shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt) {
        ea20 channel = getChannel();
        if (channel == null) {
            return null;
        }
        return (WebResourceResponseExt) Util.invokeMethodAndWaitResult(channel, "shouldInterceptRequest", webResourceRequestExt.toMap(), new SyncShouldInterceptRequestCallback());
    }

    public void shouldOverrideUrlLoading(NavigationAction navigationAction, ShouldOverrideUrlLoadingCallback shouldOverrideUrlLoadingCallback) {
        ea20 channel = getChannel();
        if (channel == null) {
            shouldOverrideUrlLoadingCallback.defaultBehaviour(null);
        } else {
            channel.a("shouldOverrideUrlLoading", navigationAction.toMap(), shouldOverrideUrlLoadingCallback);
        }
    }

    public void shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt, ShouldInterceptRequestCallback shouldInterceptRequestCallback) {
        ea20 channel = getChannel();
        if (channel == null) {
            shouldInterceptRequestCallback.defaultBehaviour(null);
        } else {
            channel.a("shouldInterceptRequest", webResourceRequestExt.toMap(), shouldInterceptRequestCallback);
        }
    }

    public void onLoadResourceWithCustomScheme(WebResourceRequestExt webResourceRequestExt, LoadResourceWithCustomSchemeCallback loadResourceWithCustomSchemeCallback) {
        ea20 channel = getChannel();
        if (channel == null) {
            loadResourceWithCustomSchemeCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("request", webResourceRequestExt.toMap());
        channel.a("onLoadResourceWithCustomScheme", hashMap, loadResourceWithCustomSchemeCallback);
    }
}
