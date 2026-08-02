package com.yandex.go.delivery.rental_duration_selector.requirement;

import com.yandex.go.delivery.rental_duration_selector.experiment.BadgeDto;
import com.yandex.go.delivery.rental_duration_selector.experiment.SummaryListItemDto;
import defpackage.ati;
import defpackage.bdc;
import defpackage.bzi0;
import defpackage.d6z;
import defpackage.dzg0;
import defpackage.fmi;
import defpackage.fnx0;
import defpackage.jl40;
import defpackage.kzi0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.rj4;
import defpackage.x0f;
import defpackage.xng0;
import defpackage.zli;
import defpackage.zls;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkzi0;", "selectedRental", "Lfnx0;", "tariffSelection", "Lzli;", "<anonymous>", "(Lkzi0;Lfnx0;)Lzli;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.delivery.rental_duration_selector.requirement.DeliveryRentSummaryInteractor$summaryRequirementModelFlow$1", f = "DeliveryRentSummaryInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DeliveryRentSummaryInteractor$summaryRequirementModelFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryRentSummaryInteractor$summaryRequirementModelFlow$1(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DeliveryRentSummaryInteractor$summaryRequirementModelFlow$1 deliveryRentSummaryInteractor$summaryRequirementModelFlow$1 = new DeliveryRentSummaryInteractor$summaryRequirementModelFlow$1(this.this$0, (Continuation) obj3);
        deliveryRentSummaryInteractor$summaryRequirementModelFlow$1.L$0 = (kzi0) obj;
        deliveryRentSummaryInteractor$summaryRequirementModelFlow$1.L$1 = (fnx0) obj2;
        return deliveryRentSummaryInteractor$summaryRequirementModelFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fmi fmiVar;
        x0f x0fVar;
        fmi fmiVar2;
        Object obj2;
        kzi0 kzi0Var = (kzi0) this.L$0;
        fnx0 fnx0Var = (fnx0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        pex0 pex0Var = fnx0Var.c;
        this.this$0.getClass();
        if (kzi0Var != null) {
            ati atiVar = pex0Var.Z;
            if (atiVar == null || (fmiVar2 = atiVar.i) == null) {
                x0fVar = null;
            } else {
                Iterator it = fmiVar2.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    x0f x0fVar2 = (x0f) obj2;
                    if (x0fVar2.a == kzi0Var.a && jl40.l(x0fVar2.b, kzi0Var.b)) {
                        break;
                    }
                }
                x0fVar = (x0f) obj2;
            }
            if (x0fVar == null) {
                this.this$0.a.a.l(null);
            }
        }
        bzi0 bzi0Var = this.this$0.c;
        SummaryListItemDto summaryListItemDto = bzi0Var.b().f;
        BadgeDto badgeDto = summaryListItemDto.a;
        rj4 rj4Var = badgeDto != null ? new rj4(d6z.Y(bzi0Var.b(), badgeDto.a), badgeDto.b, badgeDto.c) : null;
        String Y = d6z.Y(bzi0Var.b(), summaryListItemDto.b);
        String str2 = summaryListItemDto.c;
        String Y2 = str2 != null ? d6z.Y(bzi0Var.b(), str2) : null;
        String str3 = summaryListItemDto.d;
        String str4 = summaryListItemDto.e;
        String Y3 = str4 != null ? d6z.Y(bzi0Var.b(), str4) : null;
        if (kzi0Var != null) {
            return new zli(null, Y, Y3, str3, kzi0Var.a, kzi0Var.b, dzg0.ic_cross_close, new bdc(xng0.textMain), DeliveryRentRequirementTrailAction.REMOVE);
        }
        ati atiVar2 = pex0Var.Z;
        if (atiVar2 != null && (fmiVar = atiVar2.i) != null) {
            str = fmiVar.d;
        }
        return new zli(rj4Var, Y, Y2, str3, 0, str, dzg0.chevron_next, new bdc(xng0.textMinor), DeliveryRentRequirementTrailAction.NO_ACTION);
    }
}
