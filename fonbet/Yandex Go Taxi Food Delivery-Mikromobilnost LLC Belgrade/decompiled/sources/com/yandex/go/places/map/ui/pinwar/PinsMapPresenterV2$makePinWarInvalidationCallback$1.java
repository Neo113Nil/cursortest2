package com.yandex.go.places.map.ui.pinwar;

import defpackage.fnb0;
import defpackage.h73;
import defpackage.kn00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pwb0;
import defpackage.qwb0;
import defpackage.tje;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqwb0;", "Lkn00;", "invalidationResult", "Lzy11;", "<anonymous>", "(Lqwb0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.map.ui.pinwar.PinsMapPresenterV2$makePinWarInvalidationCallback$1", f = "PinsMapPresenterV2.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PinsMapPresenterV2$makePinWarInvalidationCallback$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinsMapPresenterV2$makePinWarInvalidationCallback$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PinsMapPresenterV2$makePinWarInvalidationCallback$1 pinsMapPresenterV2$makePinWarInvalidationCallback$1 = new PinsMapPresenterV2$makePinWarInvalidationCallback$1(this.this$0, continuation);
        pinsMapPresenterV2$makePinWarInvalidationCallback$1.L$0 = obj;
        return pinsMapPresenterV2$makePinWarInvalidationCallback$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PinsMapPresenterV2$makePinWarInvalidationCallback$1 pinsMapPresenterV2$makePinWarInvalidationCallback$1 = (PinsMapPresenterV2$makePinWarInvalidationCallback$1) create((qwb0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        pinsMapPresenterV2$makePinWarInvalidationCallback$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qwb0 qwb0Var = (qwb0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List s = kotlin.sequences.b.s(kotlin.sequences.b.g(new h73(1, qwb0Var.b), new fnb0(9)));
        b bVar = this.this$0;
        Iterator it = s.iterator();
        while (it.hasNext()) {
            tje.N(bVar.Jg(), null, null, new PinsMapPresenterV2$handleOnOrganizationPinShown$1(bVar, ((kn00) ((pwb0) it.next()).a.a.a).getId(), null), 3);
        }
        return zy11.a;
    }
}
