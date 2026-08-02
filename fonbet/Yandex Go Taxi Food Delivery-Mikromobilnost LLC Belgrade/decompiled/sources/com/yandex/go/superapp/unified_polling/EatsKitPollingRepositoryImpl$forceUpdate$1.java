package com.yandex.go.superapp.unified_polling;

import defpackage.dzm;
import defpackage.m2e0;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.tse;
import defpackage.wls;
import defpackage.zp1;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import retrofit2.Call;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.unified_polling.EatsKitPollingRepositoryImpl$forceUpdate$1", f = "EatsKitPollingRepositoryImpl.kt", l = {189, 191}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class EatsKitPollingRepositoryImpl$forceUpdate$1 extends SuspendLambda implements wls {
    final /* synthetic */ m2e0 $pollingServerConfig;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EatsKitPollingRepositoryImpl$forceUpdate$1(a aVar, m2e0 m2e0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$pollingServerConfig = m2e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EatsKitPollingRepositoryImpl$forceUpdate$1(this.this$0, this.$pollingServerConfig, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EatsKitPollingRepositoryImpl$forceUpdate$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r11 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r11 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            po21 po21Var = (po21) this.this$0.b.get();
            this.label = 1;
            obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                zp1 zp1Var = new zp1((Call) obj, new dzm(4, this.this$0), new EatsKitPollingRepositoryImpl$forceUpdate$1$newCall$2(1, this.this$0, a.class, "processResponse", "processResponse(Lretrofit2/Response;)V", 0));
                ((Call) zp1Var.b).k0(zp1Var);
                this.this$0.q = zp1Var;
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        zzs a = ((mo21) obj).a();
        a aVar = this.this$0;
        m2e0 m2e0Var = this.$pollingServerConfig;
        this.L$0 = null;
        this.label = 2;
        obj = a.g(aVar, m2e0Var, a, this);
    }
}
