package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.ui.bouncer.model.r2;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import com.yandex.passport.internal.ui.bouncer.model.t2;
import com.yandex.passport.internal.ui.bouncer.model.y1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/model/x;", "<unused var>", "Lcom/yandex/passport/internal/ui/bouncer/model/s1;", "currentState", "Lcom/yandex/passport/internal/ui/bouncer/model/n0;", "<anonymous>", "(Lcom/yandex/passport/internal/ui/bouncer/model/x;Lcom/yandex/passport/internal/ui/bouncer/model/s1;)Lcom/yandex/passport/internal/ui/bouncer/model/n0;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.model.middleware.RestartActor$act$1", f = "RestartActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RestartActor$act$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ m0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestartActor$act$1(m0 m0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = m0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RestartActor$act$1 restartActor$act$1 = new RestartActor$act$1(this.this$0, (Continuation) obj3);
        restartActor$act$1.L$0 = (s1) obj2;
        return restartActor$act$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<t2> list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        s1 s1Var = (s1) this.L$0;
        this.this$0.getClass();
        com.yandex.passport.internal.ui.bouncer.model.g1 g1Var = s1Var.d;
        if (g1Var == null || (list = g1Var.b) == null) {
            LoginProperties loginProperties = s1Var.c;
            return loginProperties != null ? new com.yandex.passport.internal.ui.bouncer.model.r(loginProperties) : new com.yandex.passport.internal.ui.bouncer.model.o("RestartActor", "No bouncer parameters in current state", null);
        }
        boolean isEmpty = list.isEmpty();
        LoginProperties loginProperties2 = g1Var.a;
        if (!isEmpty) {
            return new com.yandex.passport.internal.ui.bouncer.model.e0(new y1(loginProperties2, list));
        }
        ArrayList arrayList = new ArrayList();
        for (t2 t2Var : list) {
            if (t2Var instanceof r2) {
                arrayList.add(((r2) t2Var).a);
            }
        }
        return new com.yandex.passport.internal.ui.bouncer.model.d0(loginProperties2, arrayList, null, g1Var.e, g1Var.f, false, null, null, 192);
    }
}
