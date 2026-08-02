package com.yandex.go.navigator.safe;

import defpackage.cmt;
import defpackage.dj20;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.network.api.models.GoApiHttpException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.safe.MissionControlRepository$sendEvent$1", f = "MissionControlRepository.kt", l = {32}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MissionControlRepository$sendEvent$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ dj20 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissionControlRepository$sendEvent$1(dj20 dj20Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dj20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MissionControlRepository$sendEvent$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MissionControlRepository$sendEvent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                cmt<zy11> a = this.this$0.a.a(new SaveOneKilometerTripInMissionControlRequest(System.currentTimeMillis()));
                this.label = 1;
                if (ru.yandex.taxi.network.api.a.d(a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            this.this$0.d.set(true);
        } catch (GoApiHttpException e) {
            if (e.getCode() == 204) {
                this.this$0.d.set(true);
            } else {
                jst.e.i("NAVIGATOR", e);
            }
        } catch (Exception e2) {
            jst.e.i("NAVIGATOR", e2);
        }
        return zy11.a;
    }
}
