package com.yandex.messaging.internal.view.timeline;

import defpackage.c720;
import defpackage.gm50;
import defpackage.hm50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sfl0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhm50;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lzy11;", "<anonymous>", "(Lhm50;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.timeline.NeophonishUpgradeDialogObserver$start$1", f = "NeophonishUpgradeDialogObserver.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class NeophonishUpgradeDialogObserver$start$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeophonishUpgradeDialogObserver$start$1(o oVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NeophonishUpgradeDialogObserver$start$1 neophonishUpgradeDialogObserver$start$1 = new NeophonishUpgradeDialogObserver$start$1(this.this$0, continuation);
        neophonishUpgradeDialogObserver$start$1.L$0 = obj;
        return neophonishUpgradeDialogObserver$start$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        NeophonishUpgradeDialogObserver$start$1 neophonishUpgradeDialogObserver$start$1 = (NeophonishUpgradeDialogObserver$start$1) create((hm50) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        neophonishUpgradeDialogObserver$start$1.invokeSuspend(zy11Var);
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
        hm50 hm50Var = (hm50) this.L$0;
        o oVar = this.this$0;
        sfl0 sfl0Var = oVar.c;
        new gm50(c720.d, hm50Var.a, oVar.b);
        sfl0Var.getClass();
        return zy11.a;
    }
}
