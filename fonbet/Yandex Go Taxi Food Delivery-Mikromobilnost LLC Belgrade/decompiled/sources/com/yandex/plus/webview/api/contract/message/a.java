package com.yandex.plus.webview.api.contract.message;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import defpackage.a441;
import defpackage.gov;
import defpackage.ike;
import defpackage.jse;
import defpackage.m6;
import defpackage.ny61;
import defpackage.skd0;
import defpackage.tje;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final a441 a;
    public final jse b;
    public ike c;
    public m6 d;

    public a(a441 a441Var, jse jseVar) {
        this.a = a441Var;
        this.b = jseVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(1:(2:10|11)(2:22|23))(3:24|25|(1:27))|12|13|(1:15)|16|(1:18)|19))|34|6|7|(0)(0)|12|13|(0)|16|(0)|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003b, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        r7 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0039, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        r7 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, Object obj, ContinuationImpl continuationImpl) {
        WebViewContractMessagesSender$serializeMessageToJson$1 webViewContractMessagesSender$serializeMessageToJson$1;
        Object obj2;
        int i;
        String str;
        aVar.getClass();
        if (continuationImpl instanceof WebViewContractMessagesSender$serializeMessageToJson$1) {
            webViewContractMessagesSender$serializeMessageToJson$1 = (WebViewContractMessagesSender$serializeMessageToJson$1) continuationImpl;
            int i2 = webViewContractMessagesSender$serializeMessageToJson$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webViewContractMessagesSender$serializeMessageToJson$1.label = i2 - Integer.MIN_VALUE;
                obj2 = webViewContractMessagesSender$serializeMessageToJson$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webViewContractMessagesSender$serializeMessageToJson$1.label;
                if (i != 0) {
                    b.b(obj2);
                    jse jseVar = aVar.b;
                    WebViewContractMessagesSender$serializeMessageToJson$jsonMessage$1$1 webViewContractMessagesSender$serializeMessageToJson$jsonMessage$1$1 = new WebViewContractMessagesSender$serializeMessageToJson$jsonMessage$1$1(aVar, obj, null);
                    webViewContractMessagesSender$serializeMessageToJson$1.L$0 = obj;
                    webViewContractMessagesSender$serializeMessageToJson$1.L$1 = null;
                    webViewContractMessagesSender$serializeMessageToJson$1.L$2 = null;
                    webViewContractMessagesSender$serializeMessageToJson$1.L$3 = null;
                    webViewContractMessagesSender$serializeMessageToJson$1.I$0 = 0;
                    webViewContractMessagesSender$serializeMessageToJson$1.I$1 = 0;
                    webViewContractMessagesSender$serializeMessageToJson$1.label = 1;
                    obj2 = tje.k0(jseVar, webViewContractMessagesSender$serializeMessageToJson$jsonMessage$1$1, webViewContractMessagesSender$serializeMessageToJson$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = webViewContractMessagesSender$serializeMessageToJson$1.L$0;
                    b.b(obj2);
                }
                if (obj2 instanceof Result.Failure) {
                    obj2 = null;
                }
                str = (String) obj2;
                if (str == null) {
                    skd0.h(PlusLogTag.JS, "Message to json serialization error, message=" + obj, null);
                }
                return str;
            }
        }
        webViewContractMessagesSender$serializeMessageToJson$1 = new WebViewContractMessagesSender$serializeMessageToJson$1(aVar, continuationImpl);
        obj2 = webViewContractMessagesSender$serializeMessageToJson$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webViewContractMessagesSender$serializeMessageToJson$1.label;
        if (i != 0) {
        }
        if (obj2 instanceof Result.Failure) {
        }
        str = (String) obj2;
        if (str == null) {
        }
        return str;
    }

    public final void b(gov govVar) {
        ike ikeVar = this.c;
        if (ikeVar == null) {
            ny61.r("Coroutine scope needs to be initialized");
            return;
        }
        m6 m6Var = this.d;
        if (m6Var != null) {
            tje.N(ikeVar, null, null, new WebViewContractMessagesSender$sendMessage$1(this, govVar, m6Var, null), 3);
        } else {
            ny61.r("JSEvaluator needs to be initialized");
        }
    }
}
