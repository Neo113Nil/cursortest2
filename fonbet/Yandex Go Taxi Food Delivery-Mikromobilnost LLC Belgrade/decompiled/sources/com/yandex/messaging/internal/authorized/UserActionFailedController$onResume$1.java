package com.yandex.messaging.internal.authorized;

import android.content.Context;
import defpackage.el11;
import defpackage.iep0;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p8g;
import defpackage.qj21;
import defpackage.qp3;
import defpackage.rj21;
import defpackage.v320;
import defpackage.vr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv320;", "profile", "Lzy11;", "<anonymous>", "(Lv320;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.UserActionFailedController$onResume$1", f = "UserActionFailedController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class UserActionFailedController$onResume$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserActionFailedController$onResume$1(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UserActionFailedController$onResume$1 userActionFailedController$onResume$1 = new UserActionFailedController$onResume$1(this.this$0, continuation);
        userActionFailedController$onResume$1.L$0 = obj;
        return userActionFailedController$onResume$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        UserActionFailedController$onResume$1 userActionFailedController$onResume$1 = (UserActionFailedController$onResume$1) create((v320) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        userActionFailedController$onResume$1.invokeSuspend(zy11Var);
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
        v320 v320Var = (v320) this.L$0;
        h hVar = this.this$0;
        p8g p8gVar = (p8g) v320Var;
        qj21 b = ((rj21) p8gVar.a0.get()).b(new iep0(this.this$0.a, 1), 19);
        qp3 qp3Var = hVar.c;
        kgx[] kgxVarArr = h.g;
        kgx kgxVar = kgxVarArr[0];
        qp3Var.b(b);
        h hVar2 = this.this$0;
        qj21 b2 = ((rj21) p8gVar.a0.get()).b(new iep0(this.this$0.a, 2), 20);
        qp3 qp3Var2 = hVar2.d;
        kgx kgxVar2 = kgxVarArr[1];
        qp3Var2.b(b2);
        h hVar3 = this.this$0;
        qj21 b3 = ((rj21) p8gVar.a0.get()).b(new el11(6, this.this$0), 22);
        qp3 qp3Var3 = hVar3.e;
        kgx kgxVar3 = kgxVarArr[2];
        qp3Var3.b(b3);
        h hVar4 = this.this$0;
        qj21 b4 = ((rj21) p8gVar.a0.get()).b(new vr((Context) this.this$0.a, (char) 0), 25);
        qp3 qp3Var4 = hVar4.f;
        kgx kgxVar4 = kgxVarArr[3];
        qp3Var4.b(b4);
        return zy11.a;
    }
}
