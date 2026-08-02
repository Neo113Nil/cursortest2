package com.yandex.go.taxi.order.delegates;

import com.yandex.go.taxi.order.api.ChangeOrderApi;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import defpackage.a20;
import defpackage.cmt;
import defpackage.ef9;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class c extends a20 {
    public final ChangeOrderApi c;

    public c(ChangeOrderApi changeOrderApi) {
        this.c = changeOrderApi;
    }

    @Override // defpackage.a20
    public final String a() {
        return "porch";
    }

    @Override // defpackage.a20
    public final /* bridge */ /* synthetic */ Object d(String str, Object obj, Continuation continuation) {
        return e((ef9) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ef9 ef9Var, ContinuationImpl continuationImpl) {
        PorchDelegate$update$1 porchDelegate$update$1;
        int i;
        if (continuationImpl instanceof PorchDelegate$update$1) {
            porchDelegate$update$1 = (PorchDelegate$update$1) continuationImpl;
            int i2 = porchDelegate$update$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                porchDelegate$update$1.label = i2 - Integer.MIN_VALUE;
                Object obj = porchDelegate$update$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = porchDelegate$update$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cmt<OrderChangesDto.PendingChangeDto> f = this.c.f(ef9Var);
                    porchDelegate$update$1.L$0 = null;
                    porchDelegate$update$1.L$1 = null;
                    porchDelegate$update$1.label = 1;
                    if (ru.yandex.taxi.network.api.a.a(f, null, porchDelegate$update$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        porchDelegate$update$1 = new PorchDelegate$update$1(this, continuationImpl);
        Object obj2 = porchDelegate$update$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = porchDelegate$update$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
