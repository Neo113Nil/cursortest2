package com.yandex.go.payments.data;

import defpackage.bvf0;
import defpackage.ffx;
import defpackage.ny61;
import defpackage.tls;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class c {
    public final n0 a = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    public final r0 b;
    public final r0 c;
    public String d;
    public tls e;
    public final AtomicReference f;

    public c() {
        EmptyList emptyList = EmptyList.a;
        this.b = bvf0.c(emptyList);
        this.c = bvf0.c(emptyList);
        this.d = "";
        this.f = new AtomicReference(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ListPaymentMethodsRepository$runAction$1 listPaymentMethodsRepository$runAction$1;
        int i;
        if (continuationImpl instanceof ListPaymentMethodsRepository$runAction$1) {
            listPaymentMethodsRepository$runAction$1 = (ListPaymentMethodsRepository$runAction$1) continuationImpl;
            int i2 = listPaymentMethodsRepository$runAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                listPaymentMethodsRepository$runAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = listPaymentMethodsRepository$runAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = listPaymentMethodsRepository$runAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tls tlsVar = this.e;
                    if (tlsVar == null) {
                        return Boolean.FALSE;
                    }
                    listPaymentMethodsRepository$runAction$1.L$0 = null;
                    listPaymentMethodsRepository$runAction$1.label = 1;
                    if (tlsVar.invoke(listPaymentMethodsRepository$runAction$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.TRUE;
            }
        }
        listPaymentMethodsRepository$runAction$1 = new ListPaymentMethodsRepository$runAction$1(this, continuationImpl);
        Object obj2 = listPaymentMethodsRepository$runAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = listPaymentMethodsRepository$runAction$1.label;
        if (i != 0) {
        }
        return Boolean.TRUE;
    }
}
