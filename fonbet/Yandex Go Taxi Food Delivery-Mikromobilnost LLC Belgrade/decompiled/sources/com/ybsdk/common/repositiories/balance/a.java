package com.ybsdk.common.repositiories.balance;

import android.content.Context;
import com.ybsdk.network.Api;
import defpackage.ny61;
import defpackage.w530;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class a {
    public final Context a;
    public final w530 b;
    public final Api c;
    public final com.ybsdk.core.common.data.a d;
    public final r0 e;

    public a(Context context, w530 w530Var, Api api) {
        this.a = context;
        this.b = w530Var;
        this.c = api;
        com.ybsdk.core.common.data.a aVar = new com.ybsdk.core.common.data.a();
        this.d = aVar;
        this.e = aVar.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl, boolean z) {
        BalanceRepositoryImpl$request$1 balanceRepositoryImpl$request$1;
        int i;
        if (continuationImpl instanceof BalanceRepositoryImpl$request$1) {
            balanceRepositoryImpl$request$1 = (BalanceRepositoryImpl$request$1) continuationImpl;
            int i2 = balanceRepositoryImpl$request$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                balanceRepositoryImpl$request$1.label = i2 - Integer.MIN_VALUE;
                Object obj = balanceRepositoryImpl$request$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = balanceRepositoryImpl$request$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                BalanceRepositoryImpl$request$2 balanceRepositoryImpl$request$2 = new BalanceRepositoryImpl$request$2(this, str, null);
                balanceRepositoryImpl$request$1.label = 1;
                Object a = this.d.a(z, balanceRepositoryImpl$request$2, balanceRepositoryImpl$request$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        balanceRepositoryImpl$request$1 = new BalanceRepositoryImpl$request$1(this, continuationImpl);
        Object obj2 = balanceRepositoryImpl$request$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = balanceRepositoryImpl$request$1.label;
        if (i == 0) {
        }
    }
}
