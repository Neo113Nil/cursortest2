package com.yandex.go.chargers.multiorder.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.r4a;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.multiorder.ui.ChargersMultiOrderPresenter$locationClicked$1", f = "ChargersMultiOrderPresenter.kt", l = {HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersMultiOrderPresenter$locationClicked$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ r4a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersMultiOrderPresenter$locationClicked$1(r4a r4aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = r4aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersMultiOrderPresenter$locationClicked$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersMultiOrderPresenter$locationClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.chargers.domain.b bVar = this.this$0.z;
            this.label = 1;
            if (bVar.a(this) == coroutineSingletons) {
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
