package com.yandex.fintechsdk.data.payment.method.impl.internal.card.datasources.network.requesters.bininfo;

import defpackage.an11;
import defpackage.et5;
import defpackage.ft5;
import defpackage.gt5;
import defpackage.jt5;
import defpackage.nt5;
import defpackage.ny61;
import defpackage.phj;
import defpackage.qoi0;
import defpackage.vi8;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a extends com.yandex.fintechsdk.core.network.api.request.a {
    public final phj b;

    public a(phj phjVar) {
        super(0);
        this.b = phjVar;
    }

    @Override // com.yandex.fintechsdk.core.network.api.request.a
    public final Object a(Object obj) {
        ft5 ft5Var = (ft5) obj;
        return new gt5(ft5Var.a, new jt5(ft5Var.b));
    }

    @Override // com.yandex.fintechsdk.core.network.api.request.a
    public final Object d(Object obj) {
        vi8 vi8Var = ((nt5) obj).b;
        return new et5(vi8Var.a, vi8Var.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.fintechsdk.core.network.api.request.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(gt5 gt5Var, ContinuationImpl continuationImpl) {
        BinInfoRequester$executeRequest$1 binInfoRequester$executeRequest$1;
        int i;
        if (continuationImpl instanceof BinInfoRequester$executeRequest$1) {
            binInfoRequester$executeRequest$1 = (BinInfoRequester$executeRequest$1) continuationImpl;
            int i2 = binInfoRequester$executeRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                binInfoRequester$executeRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = binInfoRequester$executeRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = binInfoRequester$executeRequest$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                an11 e = qoi0.e(nt5.class);
                binInfoRequester$executeRequest$1.label = 1;
                com.yandex.fintechsdk.core.network.impl.internal.network.a aVar = (com.yandex.fintechsdk.core.network.impl.internal.network.a) this.b;
                aVar.getClass();
                Object d = com.yandex.fintechsdk.core.network.impl.internal.network.a.d(aVar, gt5Var, e, binInfoRequester$executeRequest$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        binInfoRequester$executeRequest$1 = new BinInfoRequester$executeRequest$1(this, continuationImpl);
        Object obj2 = binInfoRequester$executeRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = binInfoRequester$executeRequest$1.label;
        if (i == 0) {
        }
    }
}
