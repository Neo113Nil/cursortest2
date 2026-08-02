package com.yandex.go.chargers.error.data;

import com.yandex.go.chargers.error.api.ChargersErrorCode;
import defpackage.cy9;
import defpackage.ew9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oeu;
import defpackage.s8o;
import defpackage.tse;
import defpackage.vhb1;
import defpackage.wls;
import defpackage.zx9;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcy9;", "<anonymous>", "(Ltse;)Lcy9;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.error.data.ChargersErrorDetailsMapperImpl$mapToErrorDetails$2$1", f = "ChargersErrorDetailsMapperImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersErrorDetailsMapperImpl$mapToErrorDetails$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ Throwable $throwable;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersErrorDetailsMapperImpl$mapToErrorDetails$2$1(a aVar, Throwable th, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$throwable = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersErrorDetailsMapperImpl$mapToErrorDetails$2$1(this.this$0, this.$throwable, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersErrorDetailsMapperImpl$mapToErrorDetails$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        Throwable th = this.$throwable;
        zx9 zx9Var = new zx9(aVar.a);
        vhb1.c(vhb1.c(vhb1.c(vhb1.c(vhb1.c(zx9Var, ChargersErrorCode.NETWORK_ERROR, new ew9(6)), ChargersErrorCode.AUTH, new ew9(7)), ChargersErrorCode.FORBIDDEN, new ew9(8)), ChargersErrorCode.TIMEOUT, new ew9(9)), ChargersErrorCode.INTERNAL_ERROR, new ew9(10));
        cy9 a = zx9Var.a(th);
        if (a != null) {
            return a;
        }
        String stringValue = ChargersErrorCode.UNKNOWN.getStringValue();
        oeu O = s8o.O(th);
        return new cy9(6, stringValue, O != null ? O.a("X-YaTraceId") : null, null, null);
    }
}
