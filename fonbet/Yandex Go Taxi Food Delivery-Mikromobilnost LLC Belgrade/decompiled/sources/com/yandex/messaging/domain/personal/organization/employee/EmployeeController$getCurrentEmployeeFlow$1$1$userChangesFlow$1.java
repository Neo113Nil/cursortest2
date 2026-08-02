package com.yandex.messaging.domain.personal.organization.employee;

import com.yandex.messaging.internal.storage.h;
import defpackage.fi9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.uun;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.personal.organization.employee.EmployeeController$getCurrentEmployeeFlow$1$1$userChangesFlow$1", f = "EmployeeController.kt", l = {61, 62}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class EmployeeController$getCurrentEmployeeFlow$1$1$userChangesFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $userId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ uun this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmployeeController$getCurrentEmployeeFlow$1$1$userChangesFlow$1(uun uunVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = uunVar;
        this.$userId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        EmployeeController$getCurrentEmployeeFlow$1$1$userChangesFlow$1 employeeController$getCurrentEmployeeFlow$1$1$userChangesFlow$1 = new EmployeeController$getCurrentEmployeeFlow$1$1$userChangesFlow$1(this.this$0, this.$userId, continuation);
        employeeController$getCurrentEmployeeFlow$1$1$userChangesFlow$1.L$0 = obj;
        return employeeController$getCurrentEmployeeFlow$1$1$userChangesFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EmployeeController$getCurrentEmployeeFlow$1$1$userChangesFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r1.emit(r3, r6) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            this.L$0 = vprVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$0;
            kotlin.b.b(obj);
        }
        fi9 i2 = h.i(this.this$0.a, this.$userId);
        this.L$0 = null;
        this.label = 2;
        return e.u(i2, vprVar, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
