package com.ybsdk.feature.qr.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.qr.api.data.QrApi;
import defpackage.a3h;
import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final QrApi a;
    public final a3h b;

    public a(QrApi qrApi, a3h a3hVar) {
        this.a = qrApi;
        this.b = a3hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        ResolveQrRepository$resolveQr$1 resolveQrRepository$resolveQr$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof ResolveQrRepository$resolveQr$1) {
            resolveQrRepository$resolveQr$1 = (ResolveQrRepository$resolveQr$1) continuationImpl;
            int i2 = resolveQrRepository$resolveQr$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                resolveQrRepository$resolveQr$1.label = i2 - Integer.MIN_VALUE;
                Object obj = resolveQrRepository$resolveQr$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = resolveQrRepository$resolveQr$1.label;
                if (i != 0) {
                    b.b(obj);
                    ResolveQrRepository$resolveQr$2 resolveQrRepository$resolveQr$2 = new ResolveQrRepository$resolveQr$2(this, str, str2, null);
                    resolveQrRepository$resolveQr$1.L$0 = str;
                    resolveQrRepository$resolveQr$1.label = 1;
                    c = c.c(resolveQrRepository$resolveQr$2, resolveQrRepository$resolveQr$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) resolveQrRepository$resolveQr$1.L$0;
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                ResolveQrRepository$resolveQr$3$1 resolveQrRepository$resolveQr$3$1 = new ResolveQrRepository$resolveQr$3$1(this, str, null);
                resolveQrRepository$resolveQr$1.L$0 = null;
                resolveQrRepository$resolveQr$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, resolveQrRepository$resolveQr$3$1, resolveQrRepository$resolveQr$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        resolveQrRepository$resolveQr$1 = new ResolveQrRepository$resolveQr$1(this, continuationImpl);
        Object obj2 = resolveQrRepository$resolveQr$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = resolveQrRepository$resolveQr$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
