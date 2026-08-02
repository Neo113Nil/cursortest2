package com.yandex.go.yb.main_menu.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.yb.main_menu.data.YbWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$start$1", f = "YbWalletMenuItemRepositoryImpl.kt", l = {67}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
public final class YbWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$start$1 extends SuspendLambda implements wls {
    final /* synthetic */ Object $value$inlined;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YbWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$start$1(Object obj, Continuation continuation) {
        super(2, continuation);
        this.$value$inlined = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        YbWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$start$1 ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$start$1 = new YbWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$start$1(this.$value$inlined, continuation);
        ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$start$1.L$0 = obj;
        return ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$start$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((YbWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$start$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = this.$value$inlined;
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(obj2, this) == coroutineSingletons) {
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
