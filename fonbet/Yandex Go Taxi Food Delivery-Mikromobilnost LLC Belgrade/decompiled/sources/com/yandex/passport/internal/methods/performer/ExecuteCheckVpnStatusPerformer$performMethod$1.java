package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.entities.VpnStatus;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/passport/internal/entities/VpnStatus;", "<anonymous>", "(Ltse;)Lcom/yandex/passport/internal/entities/VpnStatus;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.ExecuteCheckVpnStatusPerformer$performMethod$1", f = "ExecuteCheckVpnStatusPerformer.kt", l = {19, 21}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ExecuteCheckVpnStatusPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.methods.n0 $method;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecuteCheckVpnStatusPerformer$performMethod$1(com.yandex.passport.internal.methods.n0 n0Var, m mVar, Continuation continuation) {
        super(2, continuation);
        this.$method = n0Var;
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExecuteCheckVpnStatusPerformer$performMethod$1(this.$method, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExecuteCheckVpnStatusPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r8 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r8.c(r7) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return (VpnStatus) obj;
            }
            if (i == 2) {
                kotlin.b.b(obj);
                return (VpnStatus) this.this$0.a.l.a.getValue();
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        com.yandex.passport.internal.methods.n0 n0Var = this.$method;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "forceCheck: " + ((Boolean) n0Var.b.c).booleanValue(), 8);
        }
        boolean booleanValue = ((Boolean) this.$method.b.c).booleanValue();
        m mVar = this.this$0;
        if (booleanValue) {
            com.yandex.passport.internal.usecase.vpn.b bVar = mVar.a;
            this.label = 1;
            obj = bVar.e("data_changed", this);
        } else {
            com.yandex.passport.internal.usecase.vpn.b bVar2 = mVar.a;
            this.label = 2;
        }
        return coroutineSingletons;
    }
}
