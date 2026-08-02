package com.yandex.messaging.domain.statuses;

import defpackage.au21;
import defpackage.cc7;
import defpackage.ey4;
import defpackage.g801;
import defpackage.gw00;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.kse;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv01;
import defpackage.r8c0;
import defpackage.rol0;
import defpackage.sb7;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.yt21;
import defpackage.z83;
import defpackage.zr01;
import defpackage.zt21;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Lit21;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.statuses.UserStatusController$subscribeOnUserStatus$1", f = "UserStatusController.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class UserStatusController$subscribeOnUserStatus$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $guid;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserStatusController$subscribeOnUserStatus$1(j jVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$guid = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UserStatusController$subscribeOnUserStatus$1 userStatusController$subscribeOnUserStatus$1 = new UserStatusController$subscribeOnUserStatus$1(this.this$0, this.$guid, continuation);
        userStatusController$subscribeOnUserStatus$1.L$0 = obj;
        return userStatusController$subscribeOnUserStatus$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserStatusController$subscribeOnUserStatus$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y6f0 y6f0Var = (y6f0) this.L$0;
            au21 au21Var = this.this$0.a;
            String str = this.$guid;
            kse.a(au21Var.e);
            ArrayList arrayList = au21Var.j;
            if (arrayList.size() >= 45.0d) {
                au21Var.g.a.reportEvent("status_subscription_limit", gw00.e(new Pair("subscriptionsCount", Integer.valueOf(arrayList.size()))));
            }
            if (arrayList.size() >= 50) {
                z83.i();
                ((zt21) kotlin.collections.a.P(arrayList)).cancel();
            }
            au21Var.c.getClass();
            zt21 zt21Var = new zt21(au21Var, str);
            yt21 yt21Var = this.this$0.b;
            String str2 = this.$guid;
            sb7 sb7Var = yt21Var.c;
            String str3 = yt21Var.i;
            int i2 = 2;
            int i3 = 0;
            r8c0 r8c0Var = new r8c0(this.this$0, this.$guid, zt21Var, kotlinx.coroutines.flow.e.H(y6f0Var, new jqr(jl40.l(str3, str2) ? new g801(6, new rol0(new UserStatusRepository$emitUserStatusFlow$1(new pv01(23, yt21Var), new mth(kotlinx.coroutines.flow.e.K(yt21Var.j, new ey4(new cc7(sb7Var.r, str3, i3), i2)), 6), null)), yt21Var) : new g801(6, new rol0(new UserStatusRepository$emitUserStatusFlow$1(new zr01(22, yt21Var, str2), new ey4(new cc7(sb7Var.r, str2, i3), i2), null)), yt21Var), new UserStatusController$subscribeOnUserStatus$1$job$1(this.this$0, this.$guid, y6f0Var, null), 3)), 17);
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, r8c0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
