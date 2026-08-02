package com.yandex.go.taxi.tariffs.internal.routestats.interactor;

import com.yandex.go.taxi.order.models.api.preorder.Transfer;
import defpackage.gqe0;
import defpackage.hqe0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzy11;", "<unused var>", "", "forceMode", "Lgqe0;", "<anonymous>", "(VZ)Lcom/yandex/go/taxi/tariffs/internal/routestats/models/PreorderInfo;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.tariffs.internal.routestats.interactor.PreorderInfoInteractor$preorderInfoFlow$1", f = "PreorderInfoInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class PreorderInfoInteractor$preorderInfoFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ hqe0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreorderInfoInteractor$preorderInfoFlow$1(hqe0 hqe0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = hqe0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        PreorderInfoInteractor$preorderInfoFlow$1 preorderInfoInteractor$preorderInfoFlow$1 = new PreorderInfoInteractor$preorderInfoFlow$1(this.this$0, (Continuation) obj3);
        preorderInfoInteractor$preorderInfoFlow$1.Z$0 = booleanValue;
        return preorderInfoInteractor$preorderInfoFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean c = this.this$0.b.c();
        hqe0 hqe0Var = this.this$0;
        if (!c) {
            Transfer transfer = hqe0Var.a.a.T;
            return new gqe0(transfer != null ? transfer.getA() : null, null, null, z, null, null);
        }
        Calendar b = hqe0Var.b.b();
        String str = this.this$0.b.a.a.S.c;
        String str2 = this.this$0.b.a.a.R;
        Calendar calendar = this.this$0.b.a.a.S.b;
        if (calendar != null) {
            r1 = Calendar.getInstance();
            r1.setTimeZone(calendar.getTimeZone());
            r1.setTimeInMillis(calendar.getTimeInMillis());
        }
        return new gqe0(b, str, str2, z, r1, this.this$0.b.a.a.S.e);
    }
}
