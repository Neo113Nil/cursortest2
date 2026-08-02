package com.yandex.messaging.internal.authorized.online;

import android.os.Looper;
import defpackage.b700;
import defpackage.bh11;
import defpackage.f370;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sp21;
import defpackage.tp21;
import defpackage.uhx;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.z83;
import defpackage.zq60;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Le370;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.online.OnlineStatusController$onlineStatusFlow$1", f = "OnlineStatusController.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class OnlineStatusController$onlineStatusFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $addresseeId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnlineStatusController$onlineStatusFlow$1(String str, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$addresseeId = str;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OnlineStatusController$onlineStatusFlow$1 onlineStatusController$onlineStatusFlow$1 = new OnlineStatusController$onlineStatusFlow$1(this.$addresseeId, this.this$0, continuation);
        onlineStatusController$onlineStatusFlow$1.L$0 = obj;
        return onlineStatusController$onlineStatusFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OnlineStatusController$onlineStatusFlow$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y6f0 y6f0Var = (y6f0) this.L$0;
            String str = this.$addresseeId;
            f370 f370Var = new f370(str, new uhx(25, y6f0Var));
            tp21 tp21Var = (tp21) this.this$0.a.get();
            z83.g(null, tp21Var.a.getLooper(), Looper.myLooper());
            HashMap hashMap = tp21Var.b;
            sp21 sp21Var = (sp21) hashMap.get(str);
            if (sp21Var == null) {
                sp21Var = new sp21(tp21Var, str);
                hashMap.put(str, sp21Var);
            }
            zq60 zq60Var = sp21Var.a;
            tp21 tp21Var2 = sp21Var.A;
            tp21Var2.x.c(sp21Var.b, 1, sp21Var.x, sp21Var.D(sp21Var.x));
            f370Var.a(sp21Var.x, sp21Var.D(sp21Var.x));
            zq60Var.b(f370Var);
            if (sp21Var.c == null && sp21Var.z == null) {
                tp21Var2.c.getClass();
                long max = Math.max(0L, 25000 - (System.currentTimeMillis() - sp21Var.w));
                bh11 bh11Var = new bh11(11, sp21Var);
                sp21Var.z = bh11Var;
                tp21Var2.a.postDelayed(bh11Var, max);
            }
            this.this$0.c.d(zq60Var.c, this.$addresseeId);
            b700 b700Var = new b700(12, this.this$0, f370Var, this.$addresseeId);
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, b700Var, this) == coroutineSingletons) {
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
