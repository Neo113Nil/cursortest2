package com.yandex.go.superapp.order.multi.old.provider;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lvpr;", "", "", "e", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.order.multi.old.provider.MultiOrderProvider$safeWrapOrders$1", f = "MultiOrderProvider.kt", l = {397}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class MultiOrderProvider$safeWrapOrders$1 extends SuspendLambda implements zls {
    final /* synthetic */ String $orderType;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiOrderProvider$safeWrapOrders$1(String str, Continuation continuation) {
        super(3, continuation);
        this.$orderType = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MultiOrderProvider$safeWrapOrders$1 multiOrderProvider$safeWrapOrders$1 = new MultiOrderProvider$safeWrapOrders$1(this.$orderType, (Continuation) obj3);
        multiOrderProvider$safeWrapOrders$1.L$0 = (vpr) obj;
        multiOrderProvider$safeWrapOrders$1.L$1 = (Throwable) obj2;
        return multiOrderProvider$safeWrapOrders$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Throwable th = (Throwable) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            jst.e.h("MultiOrderProvider", String.format("Error getting orders: %s", Arrays.copyOf(new Object[]{this.$orderType}, 1)), th);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(EmptyList.a, this) == coroutineSingletons) {
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
