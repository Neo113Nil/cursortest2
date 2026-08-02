package com.yandex.messaging.input.bricks.writing;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.nqq0;
import defpackage.ny61;
import defpackage.oqq0;
import defpackage.pqq0;
import defpackage.qqq0;
import defpackage.rqq0;
import defpackage.sqq0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsqq0;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lzy11;", "<anonymous>", "(Lsqq0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.input.bricks.writing.InputWritingBrick$onBrickAttach$7", f = "InputWritingBrick.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class InputWritingBrick$onBrickAttach$7 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputWritingBrick$onBrickAttach$7(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InputWritingBrick$onBrickAttach$7 inputWritingBrick$onBrickAttach$7 = new InputWritingBrick$onBrickAttach$7(this.this$0, continuation);
        inputWritingBrick$onBrickAttach$7.L$0 = obj;
        return inputWritingBrick$onBrickAttach$7;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        InputWritingBrick$onBrickAttach$7 inputWritingBrick$onBrickAttach$7 = (InputWritingBrick$onBrickAttach$7) create((sqq0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        inputWritingBrick$onBrickAttach$7.invokeSuspend(zy11Var);
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
        sqq0 sqq0Var = (sqq0) this.L$0;
        if (jl40.l(sqq0Var, qqq0.a)) {
            this.this$0.L.f.d();
        } else if (jl40.l(sqq0Var, nqq0.a)) {
            e eVar = this.this$0.w;
            eVar.g();
            eVar.d();
        } else if (jl40.l(sqq0Var, rqq0.a)) {
            d.r(this.this$0);
        } else if (jl40.l(sqq0Var, pqq0.a)) {
            ((com.yandex.messaging.internal.view.input.e) this.this$0.O.get()).a().c.a(false);
            com.yandex.messaging.input.b bVar = this.this$0.L;
            bVar.k = false;
            bVar.b();
        } else {
            if (!jl40.l(sqq0Var, oqq0.a)) {
                w511.b();
                return null;
            }
            d dVar = this.this$0;
            com.yandex.messaging.input.b bVar2 = dVar.L;
            bVar2.k = dVar.I.d;
            bVar2.b();
        }
        return zy11.a;
    }
}
