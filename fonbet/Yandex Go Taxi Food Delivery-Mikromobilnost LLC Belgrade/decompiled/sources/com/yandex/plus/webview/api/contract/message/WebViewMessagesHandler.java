package com.yandex.plus.webview.api.contract.message;

import android.webkit.JavascriptInterface;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import defpackage.ike;
import defpackage.jse;
import defpackage.ny61;
import defpackage.skd0;
import defpackage.tje;
import defpackage.tls;
import defpackage.ym11;
import defpackage.zs10;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class WebViewMessagesHandler {
    public final zs10 a;
    public final jse b;
    public final LinkedHashMap c = new LinkedHashMap();
    public ike d;

    public WebViewMessagesHandler(zs10 zs10Var, jse jseVar) {
        this.a = zs10Var;
        this.b = jseVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:21|22))(3:23|24|(1:26))|12|13|(1:15)|(1:17)|18))|33|6|7|(0)(0)|12|13|(0)|(0)|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003e, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        r7 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
    
        r7 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(WebViewMessagesHandler webViewMessagesHandler, String str, ContinuationImpl continuationImpl) {
        WebViewMessagesHandler$parseMessage$1 webViewMessagesHandler$parseMessage$1;
        Object obj;
        int i;
        webViewMessagesHandler.getClass();
        if (continuationImpl instanceof WebViewMessagesHandler$parseMessage$1) {
            webViewMessagesHandler$parseMessage$1 = (WebViewMessagesHandler$parseMessage$1) continuationImpl;
            int i2 = webViewMessagesHandler$parseMessage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewMessagesHandler$parseMessage$1.label = i2 - Integer.MIN_VALUE;
                obj = webViewMessagesHandler$parseMessage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewMessagesHandler$parseMessage$1.label;
                if (i != 0) {
                    b.b(obj);
                    jse jseVar = webViewMessagesHandler.b;
                    WebViewMessagesHandler$parseMessage$message$1$1 webViewMessagesHandler$parseMessage$message$1$1 = new WebViewMessagesHandler$parseMessage$message$1$1(webViewMessagesHandler, str, null);
                    webViewMessagesHandler$parseMessage$1.L$0 = str;
                    webViewMessagesHandler$parseMessage$1.L$1 = null;
                    webViewMessagesHandler$parseMessage$1.L$2 = null;
                    webViewMessagesHandler$parseMessage$1.L$3 = null;
                    webViewMessagesHandler$parseMessage$1.I$0 = 0;
                    webViewMessagesHandler$parseMessage$1.I$1 = 0;
                    webViewMessagesHandler$parseMessage$1.label = 1;
                    obj = tje.k0(jseVar, webViewMessagesHandler$parseMessage$message$1$1, webViewMessagesHandler$parseMessage$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) webViewMessagesHandler$parseMessage$1.L$0;
                    b.b(obj);
                }
                if (obj instanceof Result.Failure) {
                    obj = null;
                }
                if (obj == null) {
                    skd0.h(PlusLogTag.JS, "Message parsing error, message=" + str, null);
                }
                return obj;
            }
        }
        webViewMessagesHandler$parseMessage$1 = new WebViewMessagesHandler$parseMessage$1(webViewMessagesHandler, continuationImpl);
        obj = webViewMessagesHandler$parseMessage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webViewMessagesHandler$parseMessage$1.label;
        if (i != 0) {
        }
        if (obj instanceof Result.Failure) {
        }
        if (obj == null) {
        }
        return obj;
    }

    public final void b(Class cls, tls tlsVar) {
        if (!ym11.f(1, tlsVar)) {
            tlsVar = null;
        }
        if (tlsVar == null) {
            return;
        }
        this.c.put(cls, tlsVar);
    }

    @JavascriptInterface
    public void onMessage(String str) {
        ike ikeVar = this.d;
        if (ikeVar != null) {
            tje.N(ikeVar, null, null, new WebViewMessagesHandler$onMessage$1(this, str, null), 3);
        } else {
            ny61.r("Coroutine scope needs to be initialized");
        }
    }
}
