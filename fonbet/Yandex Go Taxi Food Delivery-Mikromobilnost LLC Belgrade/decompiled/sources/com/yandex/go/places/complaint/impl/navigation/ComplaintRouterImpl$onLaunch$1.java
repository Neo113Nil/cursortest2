package com.yandex.go.places.complaint.impl.navigation;

import defpackage.an8;
import defpackage.bb0;
import defpackage.d3a;
import defpackage.f28;
import defpackage.f2b;
import defpackage.jxc;
import defpackage.mvg;
import defpackage.mxc;
import defpackage.n3w;
import defpackage.ny61;
import defpackage.oxc;
import defpackage.q5z;
import defpackage.qu;
import defpackage.qzb;
import defpackage.sk7;
import defpackage.srb;
import defpackage.st0;
import defpackage.tse;
import defpackage.w030;
import defpackage.wls;
import defpackage.yxf;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.complaint.impl.navigation.ComplaintRouterImpl$onLaunch$1", f = "ComplaintRouterImpl.kt", l = {20}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ComplaintRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ mxc $payload;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComplaintRouterImpl$onLaunch$1(a aVar, mxc mxcVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = mxcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ComplaintRouterImpl$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ComplaintRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            d3a d3aVar = this.this$0.D;
            this.label = 1;
            f = d3aVar.b.f(this);
            if (f == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            f = obj;
        }
        boolean booleanValue = ((Boolean) f).booleanValue();
        a aVar = this.this$0;
        if (booleanValue) {
            st0 st0Var = aVar.E;
            st0Var.getClass();
            yxf yxfVar = new yxf(st0Var, 2);
            yxf yxfVar2 = new yxf(st0Var, 7);
            yxf yxfVar3 = new yxf(st0Var, 5);
            n3w a = n3w.a(new jxc(new sk7(19, yxfVar, yxfVar2, yxfVar3)));
            n3w a2 = n3w.a(new oxc(new an8(new srb(new srb(new srb(new yxf(st0Var, 0), 6), 8), 7), new f2b(new qzb(new yxf(st0Var, 3), 21), new yxf(st0Var, 8), new yxf(st0Var, 9), 13), new yxf(st0Var, 4), new yxf(st0Var, 1), 22)));
            f2b f2bVar = new f2b(yxfVar, new yxf(st0Var, 6), yxfVar3, 12);
            a aVar2 = this.this$0;
            w030 w030Var = (w030) st0Var.b;
            q5z.h(w030Var);
            aVar2.A(new f28(a.a, a2.a, w030Var, (Object) f2bVar, 3), this.$payload, new bb0(this.this$0, 24));
        } else {
            aVar.r(new qu(9));
        }
        return zy11.a;
    }
}
