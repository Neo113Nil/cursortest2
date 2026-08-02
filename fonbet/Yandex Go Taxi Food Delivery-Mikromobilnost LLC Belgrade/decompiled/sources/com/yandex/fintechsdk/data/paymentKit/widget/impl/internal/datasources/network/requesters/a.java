package com.yandex.fintechsdk.data.paymentKit.widget.impl.internal.datasources.network.requesters;

import defpackage.an11;
import defpackage.cgt;
import defpackage.fgt;
import defpackage.igt;
import defpackage.jgs;
import defpackage.ny61;
import defpackage.qoi0;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class a extends com.yandex.fintechsdk.core.network.api.request.a {
    public final jgs b;

    public a(jgs jgsVar) {
        super(0);
        this.b = jgsVar;
    }

    @Override // com.yandex.fintechsdk.core.network.api.request.a
    public final Object a(Object obj) {
        fgt fgtVar = (fgt) obj;
        return new cgt(fgtVar.b, fgtVar.c, fgtVar.a);
    }

    @Override // com.yandex.fintechsdk.core.network.api.request.a
    public final Object d(Object obj) {
        return new JSONObject(((igt) obj).a.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.fintechsdk.core.network.api.request.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cgt cgtVar, ContinuationImpl continuationImpl) {
        GetWidgetRequester$executeRequest$1 getWidgetRequester$executeRequest$1;
        int i;
        if (continuationImpl instanceof GetWidgetRequester$executeRequest$1) {
            getWidgetRequester$executeRequest$1 = (GetWidgetRequester$executeRequest$1) continuationImpl;
            int i2 = getWidgetRequester$executeRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getWidgetRequester$executeRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getWidgetRequester$executeRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getWidgetRequester$executeRequest$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                an11 e = qoi0.e(igt.class);
                getWidgetRequester$executeRequest$1.label = 1;
                jgs jgsVar = this.b;
                jgsVar.getClass();
                Object d = com.yandex.fintechsdk.core.network.impl.internal.network.a.d(jgsVar, cgtVar, e, getWidgetRequester$executeRequest$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        getWidgetRequester$executeRequest$1 = new GetWidgetRequester$executeRequest$1(this, continuationImpl);
        Object obj2 = getWidgetRequester$executeRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getWidgetRequester$executeRequest$1.label;
        if (i == 0) {
        }
    }
}
