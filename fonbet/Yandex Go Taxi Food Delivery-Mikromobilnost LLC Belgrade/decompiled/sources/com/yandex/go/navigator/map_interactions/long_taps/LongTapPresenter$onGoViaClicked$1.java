package com.yandex.go.navigator.map_interactions.long_taps;

import com.yandex.go.address.models.Address;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tse;
import defpackage.wls;
import defpackage.yd0;
import defpackage.ynz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.map_interactions.long_taps.LongTapPresenter$onGoViaClicked$1", f = "LongTapPresenter.kt", l = {HProv.PP_VERSION_TIMESTAMP}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LongTapPresenter$onGoViaClicked$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ ynz this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongTapPresenter$onGoViaClicked$1(ynz ynzVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ynzVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LongTapPresenter$onGoViaClicked$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LongTapPresenter$onGoViaClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh qohVar = this.this$0.F;
            if (qohVar != null) {
                this.label = 1;
                obj = qohVar.s(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Address address = (Address) obj;
        if (address != null) {
            this.this$0.z.a.r(new yd0(address, 4));
        }
        return zy11.a;
    }
}
