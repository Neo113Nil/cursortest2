package com.ybsdk.feature.main.internal.screens.sbpPartners;

import com.ybsdk.feature.main.internal.domain.entities.sbpPartners.Status;
import defpackage.c6g;
import defpackage.ds31;
import defpackage.mvg;
import defpackage.n3w;
import defpackage.ny61;
import defpackage.p8g0;
import defpackage.phm0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.y4a0;
import defpackage.zy11;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.main.internal.screens.sbpPartners.SbpPartnersViewModel$onListItemClick$3", f = "SbpPartnersViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SbpPartnersViewModel$onListItemClick$3 extends SuspendLambda implements wls {
    final /* synthetic */ phm0 $item;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbpPartnersViewModel$onListItemClick$3(a aVar, phm0 phm0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$item = phm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SbpPartnersViewModel$onListItemClick$3(this.this$0, this.$item, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SbpPartnersViewModel$onListItemClick$3 sbpPartnersViewModel$onListItemClick$3 = (SbpPartnersViewModel$onListItemClick$3) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        sbpPartnersViewModel$onListItemClick$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        phm0 phm0Var = this.$item;
        aVar.getClass();
        String str = "QrcScanId_" + UUID.randomUUID();
        y4a0 y4a0Var = aVar.E.c.a;
        com.ybsdk.feature.qr.payments.internal.domain.b bVar = new com.ybsdk.feature.qr.payments.internal.domain.b((p8g0) ((n3w) y4a0Var.b).a, (com.ybsdk.utils.poller.b) ((c6g) y4a0Var.c).get(), str);
        pzt0 pzt0Var = aVar.K;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        aVar.J.b(phm0Var.h, Status.BINDING);
        aVar.K = tje.N(ds31.a(aVar), null, null, new SbpPartnersViewModel$bindYBAccountWithPayCard$1(aVar, phm0Var, bVar, str, null), 3);
        return zy11.a;
    }
}
