package com.yandex.messaging.domain.statuses;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p9g0;
import defpackage.sls;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lit21;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.statuses.UserStatusRepository$emitUserStatusFlow$1", f = "UserStatusRepository.kt", l = {67, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class UserStatusRepository$emitUserStatusFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $emitBlock;
    final /* synthetic */ tpr $observeFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserStatusRepository$emitUserStatusFlow$1(sls slsVar, tpr tprVar, Continuation continuation) {
        super(2, continuation);
        this.$emitBlock = slsVar;
        this.$observeFlow = tprVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UserStatusRepository$emitUserStatusFlow$1 userStatusRepository$emitUserStatusFlow$1 = new UserStatusRepository$emitUserStatusFlow$1(this.$emitBlock, this.$observeFlow, continuation);
        userStatusRepository$emitUserStatusFlow$1.L$0 = obj;
        return userStatusRepository$emitUserStatusFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserStatusRepository$emitUserStatusFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r8.collect(r4, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r1.emit(r8, r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            Object invoke = this.$emitBlock.invoke();
            this.L$0 = vprVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$0;
            kotlin.b.b(obj);
        }
        tpr tprVar = this.$observeFlow;
        p9g0 p9g0Var = new p9g0(29, vprVar, this.$emitBlock);
        this.L$0 = null;
        this.label = 2;
    }
}
