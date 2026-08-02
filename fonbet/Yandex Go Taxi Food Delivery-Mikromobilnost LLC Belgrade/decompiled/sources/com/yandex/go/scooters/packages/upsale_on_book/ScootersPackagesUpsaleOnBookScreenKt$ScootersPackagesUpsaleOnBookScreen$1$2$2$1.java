package com.yandex.go.scooters.packages.upsale_on_book;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.vao0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.packages.upsale_on_book.ScootersPackagesUpsaleOnBookScreenKt$ScootersPackagesUpsaleOnBookScreen$1$2$2$1", f = "ScootersPackagesUpsaleOnBookScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPackagesUpsaleOnBookScreenKt$ScootersPackagesUpsaleOnBookScreen$1$2$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPackagesUpsaleOnBookScreenKt$ScootersPackagesUpsaleOnBookScreen$1$2$2$1(tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$action = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPackagesUpsaleOnBookScreenKt$ScootersPackagesUpsaleOnBookScreen$1$2$2$1(this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersPackagesUpsaleOnBookScreenKt$ScootersPackagesUpsaleOnBookScreen$1$2$2$1 scootersPackagesUpsaleOnBookScreenKt$ScootersPackagesUpsaleOnBookScreen$1$2$2$1 = (ScootersPackagesUpsaleOnBookScreenKt$ScootersPackagesUpsaleOnBookScreen$1$2$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersPackagesUpsaleOnBookScreenKt$ScootersPackagesUpsaleOnBookScreen$1$2$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$action.invoke(vao0.a);
        return zy11.a;
    }
}
