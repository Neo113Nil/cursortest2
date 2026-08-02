package com.ybsdk.feature.qr.api.domain;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.qr.api.data.QrResolvingRulesApi;
import defpackage.cpp0;
import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final QrResolvingRulesApi a;
    public final cpp0 b;

    public a(QrResolvingRulesApi qrResolvingRulesApi, cpp0 cpp0Var) {
        this.a = qrResolvingRulesApi;
        this.b = cpp0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(QrResolvingRulesSource qrResolvingRulesSource, ContinuationImpl continuationImpl) {
        QrResolvingRulesInteractor$getQrResolvingRules$1 qrResolvingRulesInteractor$getQrResolvingRules$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof QrResolvingRulesInteractor$getQrResolvingRules$1) {
            qrResolvingRulesInteractor$getQrResolvingRules$1 = (QrResolvingRulesInteractor$getQrResolvingRules$1) continuationImpl;
            int i2 = qrResolvingRulesInteractor$getQrResolvingRules$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrResolvingRulesInteractor$getQrResolvingRules$1.label = i2 - Integer.MIN_VALUE;
                Object obj = qrResolvingRulesInteractor$getQrResolvingRules$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrResolvingRulesInteractor$getQrResolvingRules$1.label;
                if (i != 0) {
                    b.b(obj);
                    QrResolvingRulesInteractor$getQrResolvingRules$2 qrResolvingRulesInteractor$getQrResolvingRules$2 = new QrResolvingRulesInteractor$getQrResolvingRules$2(qrResolvingRulesSource, this, null);
                    qrResolvingRulesInteractor$getQrResolvingRules$1.label = 1;
                    c = c.c(qrResolvingRulesInteractor$getQrResolvingRules$2, qrResolvingRulesInteractor$getQrResolvingRules$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                QrResolvingRulesInteractor$getQrResolvingRules$3$1 qrResolvingRulesInteractor$getQrResolvingRules$3$1 = new QrResolvingRulesInteractor$getQrResolvingRules$3$1(this, null);
                qrResolvingRulesInteractor$getQrResolvingRules$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, qrResolvingRulesInteractor$getQrResolvingRules$3$1, qrResolvingRulesInteractor$getQrResolvingRules$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        qrResolvingRulesInteractor$getQrResolvingRules$1 = new QrResolvingRulesInteractor$getQrResolvingRules$1(this, continuationImpl);
        Object obj2 = qrResolvingRulesInteractor$getQrResolvingRules$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrResolvingRulesInteractor$getQrResolvingRules$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
