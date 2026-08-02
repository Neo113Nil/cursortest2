package com.yandex.messaging.ui.pollinfo;

import defpackage.bcg;
import defpackage.c4c;
import defpackage.ccg;
import defpackage.cta0;
import defpackage.f9t;
import defpackage.i5m;
import defpackage.j40;
import defpackage.kse;
import defpackage.kt11;
import defpackage.mvg;
import defpackage.n3w;
import defpackage.ny61;
import defpackage.p4t;
import defpackage.p6f;
import defpackage.p8g;
import defpackage.ps11;
import defpackage.q5z;
import defpackage.r770;
import defpackage.rs0;
import defpackage.ubt;
import defpackage.v8c0;
import defpackage.vbb;
import defpackage.wls;
import defpackage.wwd0;
import defpackage.xvf0;
import defpackage.y4t;
import defpackage.ywd0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkt11;", "profileComponent", "Lzy11;", "<anonymous>", "(Lkt11;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.pollinfo.PollInfoActivity$onCreate$1", f = "PollInfoActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class PollInfoActivity$onCreate$1 extends SuspendLambda implements wls {
    final /* synthetic */ wwd0 $args;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PollInfoActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollInfoActivity$onCreate$1(PollInfoActivity pollInfoActivity, wwd0 wwd0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pollInfoActivity;
        this.$args = wwd0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PollInfoActivity$onCreate$1 pollInfoActivity$onCreate$1 = new PollInfoActivity$onCreate$1(this.this$0, this.$args, continuation);
        pollInfoActivity$onCreate$1.L$0 = obj;
        return pollInfoActivity$onCreate$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PollInfoActivity$onCreate$1 pollInfoActivity$onCreate$1 = (PollInfoActivity$onCreate$1) create((kt11) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        pollInfoActivity$onCreate$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        j40 permissionManager;
        ps11 ui;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ccg ccgVar = ((ccg) ((kt11) this.L$0)).b;
        PollInfoActivity pollInfoActivity = this.this$0;
        pollInfoActivity.getClass();
        permissionManager = this.this$0.getPermissionManager();
        permissionManager.getClass();
        r770 r770Var = new r770(this.this$0);
        wwd0 wwd0Var = this.$args;
        wwd0Var.getClass();
        xvf0 b = i5m.b(new v8c0(n3w.a(pollInfoActivity), 1));
        bcg bcgVar = ccgVar.G;
        vbb vbbVar = ccgVar.a;
        xvf0 b2 = i5m.b(new f9t(bcgVar, ccgVar.j, 5));
        xvf0 b3 = i5m.b(new rs0(ccgVar.L, ccgVar.j, ccgVar.Z, c4c.a, i5m.b(new p6f(ccgVar.L, 10)), 24));
        xvf0 b4 = i5m.b(new cta0(ccgVar.U, ccgVar.B, n3w.a(r770Var), n3w.a(wwd0Var), ccgVar.b0));
        ui = this.this$0.getUi();
        com.yandex.bricks.c cVar = ui.c;
        ywd0 ywd0Var = (ywd0) b.get();
        ubt ubtVar = (ubt) b2.get();
        com.yandex.messaging.domain.poll.a aVar = (com.yandex.messaging.domain.poll.a) b3.get();
        a aVar2 = (a) b4.get();
        p4t a = ((p8g) vbbVar.b).a();
        kse B = vbbVar.B();
        q5z.h(B);
        cVar.a(new c(pollInfoActivity, ywd0Var, ubtVar, aVar, wwd0Var, aVar2, permissionManager, new y4t(B, a), vbbVar.C()));
        return zy11.a;
    }
}
