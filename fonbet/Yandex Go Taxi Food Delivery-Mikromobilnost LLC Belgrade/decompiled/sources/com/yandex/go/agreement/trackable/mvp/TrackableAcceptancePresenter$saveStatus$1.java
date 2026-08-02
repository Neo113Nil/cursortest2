package com.yandex.go.agreement.trackable.mvp;

import com.yandex.go.agreement.api.trackable.network.CachedTrackableAcceptance;
import com.yandex.go.agreement.api.trackable.network.TrackableAcceptanceActionParam;
import defpackage.cd;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.u101;
import defpackage.wls;
import defpackage.zqg;
import defpackage.zy11;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.agreement.trackable.mvp.TrackableAcceptancePresenter$saveStatus$1", f = "TrackableAcceptancePresenter.kt", l = {HProv.PP_DELETE_SAVED_PASSWD}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TrackableAcceptancePresenter$saveStatus$1 extends SuspendLambda implements wls {
    final /* synthetic */ TrackableAcceptanceActionParam.Status $status;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackableAcceptancePresenter$saveStatus$1(b bVar, TrackableAcceptanceActionParam.Status status, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$status = status;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrackableAcceptancePresenter$saveStatus$1(this.this$0, this.$status, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackableAcceptancePresenter$saveStatus$1) create((Throwable) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            TrackableAcceptanceActionParam.Status status = this.$status;
            this.label = 1;
            u101 u101Var = bVar.x;
            cd cdVar = u101Var.a;
            Calendar a = bVar.E.a(cdVar.i);
            bVar.F.getClass();
            String a2 = zqg.a(a);
            if (a2 == null) {
                a2 = "";
            }
            if (bVar.D.d(new CachedTrackableAcceptance(status, u101Var.a.a, a2, cdVar.h), this) == coroutineSingletons) {
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
