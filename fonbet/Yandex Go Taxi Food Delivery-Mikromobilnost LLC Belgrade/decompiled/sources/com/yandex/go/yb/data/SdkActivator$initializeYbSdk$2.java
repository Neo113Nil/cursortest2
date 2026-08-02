package com.yandex.go.yb.data;

import com.ybsdk.api.YBSdk;
import com.ybsdk.api.exceptions.AlreadyInitializedException;
import defpackage.fva0;
import defpackage.hh51;
import defpackage.jst;
import defpackage.kg51;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)J"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.yb.data.SdkActivator$initializeYbSdk$2", f = "SdkActivator.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class SdkActivator$initializeYbSdk$2 extends SuspendLambda implements wls {
    final /* synthetic */ kg51 $additional;
    final /* synthetic */ hh51 $initDependencies;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkActivator$initializeYbSdk$2(e eVar, hh51 hh51Var, kg51 kg51Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$initDependencies = hh51Var;
        this.$additional = kg51Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SdkActivator$initializeYbSdk$2(this.this$0, this.$initDependencies, this.$additional, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SdkActivator$initializeYbSdk$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        fva0.f(this.this$0.k, "BankSDK", PerformanceAnalytics$Type.Creating, 0L, 4);
        try {
            YBSdk.init(this.$initDependencies, this.$additional);
        } catch (AlreadyInitializedException e) {
            jst.e.k(e, "Try initialize yb twice");
        }
        return new Long(fva0.b(this.this$0.k, "BankSDK", PerformanceAnalytics$Type.Creating, null, 4));
    }
}
