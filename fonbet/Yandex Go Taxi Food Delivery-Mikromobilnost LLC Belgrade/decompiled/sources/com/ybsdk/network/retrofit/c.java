package com.ybsdk.network.retrofit;

import defpackage.g95;
import defpackage.ny61;
import defpackage.qda0;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class c extends g95 {
    @Override // com.ybsdk.network.retrofit.a
    public final Call a(Call call) {
        return new c(call, this.w, this.x);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.ybsdk.network.retrofit.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(ContinuationImpl continuationImpl) {
        PollableResultCall$executeCall$1 pollableResultCall$executeCall$1;
        int i;
        Object b;
        if (continuationImpl instanceof PollableResultCall$executeCall$1) {
            pollableResultCall$executeCall$1 = (PollableResultCall$executeCall$1) continuationImpl;
            int i2 = pollableResultCall$executeCall$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pollableResultCall$executeCall$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pollableResultCall$executeCall$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pollableResultCall$executeCall$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pollableResultCall$executeCall$1.label = 1;
                    b = this.w.b(this.c, this.x, new qda0(26), pollableResultCall$executeCall$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                return new Result(b);
            }
        }
        pollableResultCall$executeCall$1 = new PollableResultCall$executeCall$1(this, continuationImpl);
        Object obj2 = pollableResultCall$executeCall$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pollableResultCall$executeCall$1.label;
        if (i != 0) {
        }
        return new Result(b);
    }
}
