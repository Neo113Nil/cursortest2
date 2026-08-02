package com.yandex.plus.home.feature.webviews.internal.uri;

import defpackage.ny61;
import defpackage.tg21;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class b implements tg21 {
    public final com.yandex.plus.home.auth.b a;

    public b(com.yandex.plus.home.auth.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r5.f(r7) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.tg21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Map map, Continuation continuation) {
        JsWebViewAuthorizedUrlCreator$create$1 jsWebViewAuthorizedUrlCreator$create$1;
        int i;
        if (continuation instanceof JsWebViewAuthorizedUrlCreator$create$1) {
            jsWebViewAuthorizedUrlCreator$create$1 = (JsWebViewAuthorizedUrlCreator$create$1) continuation;
            int i2 = jsWebViewAuthorizedUrlCreator$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jsWebViewAuthorizedUrlCreator$create$1.label = i2 - Integer.MIN_VALUE;
                Object obj = jsWebViewAuthorizedUrlCreator$create$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jsWebViewAuthorizedUrlCreator$create$1.label;
                com.yandex.plus.home.auth.b bVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jsWebViewAuthorizedUrlCreator$create$1.L$0 = str;
                    jsWebViewAuthorizedUrlCreator$create$1.L$1 = null;
                    jsWebViewAuthorizedUrlCreator$create$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        String str2 = (String) jsWebViewAuthorizedUrlCreator$create$1.L$0;
                        kotlin.b.b(obj);
                        return str2;
                    }
                    str = (String) jsWebViewAuthorizedUrlCreator$create$1.L$0;
                    kotlin.b.b(obj);
                }
                jsWebViewAuthorizedUrlCreator$create$1.L$0 = str;
                jsWebViewAuthorizedUrlCreator$create$1.L$1 = null;
                jsWebViewAuthorizedUrlCreator$create$1.label = 2;
                return bVar.b(str, jsWebViewAuthorizedUrlCreator$create$1) != coroutineSingletons ? coroutineSingletons : str;
            }
        }
        jsWebViewAuthorizedUrlCreator$create$1 = new JsWebViewAuthorizedUrlCreator$create$1(this, (ContinuationImpl) continuation);
        Object obj2 = jsWebViewAuthorizedUrlCreator$create$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jsWebViewAuthorizedUrlCreator$create$1.label;
        com.yandex.plus.home.auth.b bVar2 = this.a;
        if (i != 0) {
        }
        jsWebViewAuthorizedUrlCreator$create$1.L$0 = str;
        jsWebViewAuthorizedUrlCreator$create$1.L$1 = null;
        jsWebViewAuthorizedUrlCreator$create$1.label = 2;
        if (bVar2.b(str, jsWebViewAuthorizedUrlCreator$create$1) != coroutineSingletons2) {
        }
    }
}
