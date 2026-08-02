package com.yandex.go.scooters.tariff_fix.selection;

import com.yandex.go.scooters.domain.d;
import com.yandex.go.scooters.domain.model.ScootersBookingFailedException;
import defpackage.con0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.n2n0;
import defpackage.ny61;
import defpackage.t4p0;
import defpackage.tse;
import defpackage.vbn0;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.tariff_fix.selection.ScootersTariffFixSelectionPresenter$book$1", f = "ScootersTariffFixSelectionPresenter.kt", l = {176}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersTariffFixSelectionPresenter$book$1 extends SuspendLambda implements wls {
    final /* synthetic */ con0 $scootersFixPointTariffOffer;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersTariffFixSelectionPresenter$book$1(b bVar, con0 con0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$scootersFixPointTariffOffer = con0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersTariffFixSelectionPresenter$book$1(this.this$0, this.$scootersFixPointTariffOffer, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersTariffFixSelectionPresenter$book$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e A[Catch: all -> 0x0086, TryCatch #1 {all -> 0x0086, blocks: (B:16:0x006a, B:18:0x006e, B:19:0x0089, B:33:0x0094, B:7:0x001b, B:8:0x0056, B:24:0x0034), top: B:2:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089 A[Catch: all -> 0x0086, TRY_LEAVE, TryCatch #1 {all -> 0x0086, blocks: (B:16:0x006a, B:18:0x006e, B:19:0x0089, B:33:0x0094, B:7:0x001b, B:8:0x0056, B:24:0x0034), top: B:2:0x0005, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [zc5] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.yandex.go.scooters.tariff_fix.selection.b] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ScootersBookingFailedException scootersBookingFailedException;
        b bVar;
        con0 con0Var;
        b bVar2;
        b bVar3;
        b bVar4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
            try {
                if (r1 == 0) {
                    kotlin.b.b(obj);
                    b bVar5 = this.this$0;
                    con0 con0Var2 = this.$scootersFixPointTariffOffer;
                    try {
                        ((t4p0) bVar5.Dg()).z0();
                        d dVar = bVar5.C;
                        vbn0 vbn0Var = con0Var2.c;
                        this.L$0 = bVar5;
                        this.L$1 = con0Var2;
                        this.L$2 = bVar5;
                        this.L$3 = bVar5;
                        this.label = 1;
                        Object b = dVar.b(vbn0Var, this);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        con0Var = con0Var2;
                        bVar = bVar5;
                        obj = b;
                        bVar2 = bVar;
                        r1 = bVar5;
                    } catch (Throwable th) {
                        scootersBookingFailedException = th;
                        bVar = bVar5;
                        bVar3 = bVar5;
                        if (scootersBookingFailedException instanceof ScootersBookingFailedException) {
                            jst.e.k(scootersBookingFailedException, "Error while scooter booking");
                            bVar4 = bVar3;
                        } else {
                            ((t4p0) bVar.Dg()).t5(scootersBookingFailedException);
                            xby.l(jst.e, "Scooters.Book: fix", null, scootersBookingFailedException, "Error occurred when trying to book a scooter in the Fix Tariff", 2);
                            bVar4 = bVar3;
                        }
                        ((t4p0) bVar4.Dg()).r0();
                        return zy11.a;
                    }
                } else {
                    if (r1 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r1 = (b) this.L$3;
                    bVar = (b) this.L$2;
                    con0Var = (con0) this.L$1;
                    bVar2 = (b) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        r1 = r1;
                    } catch (Throwable th2) {
                        scootersBookingFailedException = th2;
                        bVar3 = r1;
                        if (scootersBookingFailedException instanceof ScootersBookingFailedException) {
                        }
                        ((t4p0) bVar4.Dg()).r0();
                        return zy11.a;
                    }
                }
                b.Kg(bVar2, (n2n0) obj, con0Var.a);
                bVar4 = r1;
                ((t4p0) bVar4.Dg()).r0();
                return zy11.a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th3) {
            ((t4p0) r1.Dg()).r0();
            throw th3;
        }
    }
}
