package com.yandex.delivery.utils.dialogmanager;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.qej;
import defpackage.rxh0;
import defpackage.vej;
import defpackage.wej;
import defpackage.yej;
import defpackage.yuj0;
import defpackage.z1k0;
import defpackage.zej;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class b {
    public final com.yandex.delivery.utils.dialogmanager.impl.b a;
    public final yuj0 b;

    public b(yuj0 yuj0Var, com.yandex.delivery.utils.dialogmanager.impl.b bVar) {
        this.a = bVar;
        this.b = yuj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        StandardDialogs$requestNoInternetDialog$1 standardDialogs$requestNoInternetDialog$1;
        int i;
        zej zejVar;
        z1k0 z1k0Var = z1k0.a;
        if (continuationImpl instanceof StandardDialogs$requestNoInternetDialog$1) {
            standardDialogs$requestNoInternetDialog$1 = (StandardDialogs$requestNoInternetDialog$1) continuationImpl;
            int i2 = standardDialogs$requestNoInternetDialog$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                standardDialogs$requestNoInternetDialog$1.label = i2 - Integer.MIN_VALUE;
                Object obj = standardDialogs$requestNoInternetDialog$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = standardDialogs$requestNoInternetDialog$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    yuj0 yuj0Var = this.b;
                    qej qejVar = new qej(yuj0Var.a(rxh0.logistics_no_internet_dialog_title, new Object[0]), yuj0Var.a(rxh0.logistics_no_internet_dialog_message, new Object[0]), yuj0Var.a(rxh0.logistics_retry_button, new Object[0]), yuj0Var.a(rxh0.logistics_cancel_button, new Object[0]), null, false, null, null, 208);
                    standardDialogs$requestNoInternetDialog$1.L$0 = null;
                    standardDialogs$requestNoInternetDialog$1.label = 1;
                    obj = this.a.a(qejVar, standardDialogs$requestNoInternetDialog$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                zejVar = (zej) obj;
                if (!jl40.l(zejVar, yej.a)) {
                    return z1k0.b;
                }
                if (jl40.l(zejVar, vej.a) || jl40.l(zejVar, wej.a)) {
                    return z1k0Var;
                }
                ny61.r("Unsupported dialog response");
                return null;
            }
        }
        standardDialogs$requestNoInternetDialog$1 = new StandardDialogs$requestNoInternetDialog$1(this, continuationImpl);
        Object obj2 = standardDialogs$requestNoInternetDialog$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = standardDialogs$requestNoInternetDialog$1.label;
        if (i != 0) {
        }
        zejVar = (zej) obj2;
        if (!jl40.l(zejVar, yej.a)) {
        }
    }
}
