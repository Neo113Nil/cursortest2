package com.ybsdk.feature.dashboard.internal.ui.dashboard;

import com.ybsdk.feature.dashboard.api.model.ProductId;
import com.ybsdk.feature.dashboard.internal.domain.entities.NextPageLoadingStatus;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pig;
import defpackage.plg;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.tse;
import defpackage.wls;
import defpackage.x4c;
import defpackage.x5t;
import defpackage.zy11;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.dashboard.internal.ui.dashboard.DashboardViewModel$loadNextDivKitListPage$2", f = "DashboardViewModel.kt", l = {349}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DashboardViewModel$loadNextDivKitListPage$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardViewModel$loadNextDivKitListPage$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DashboardViewModel$loadNextDivKitListPage$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DashboardViewModel$loadNextDivKitListPage$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        x5t x5tVar;
        r0 r0Var;
        Object value;
        Collection collection;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            com.ybsdk.feature.dashboard.internal.domain.interactors.b bVar2 = bVar.B;
            ProductId f0 = bVar.f0();
            String productType = this.this$0.G.getProductType();
            String agreementId = this.this$0.G.getAgreementId();
            pig pigVar = (pig) ((plg) this.this$0.X()).d.a();
            String str = (pigVar == null || (x5tVar = pigVar.d) == null) ? null : x5tVar.g;
            this.label = 1;
            a = bVar2.a(f0, productType, agreementId, str, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        b bVar3 = this.this$0;
        if (!(a instanceof Result.Failure)) {
            x5t x5tVar2 = (x5t) a;
            pig pigVar2 = (pig) ((plg) bVar3.X()).d.a();
            if (pigVar2 != null) {
                x5t x5tVar3 = pigVar2.d;
                if (x5tVar3 == null || (collection = x5tVar3.a) == null) {
                    collection = EmptyList.a;
                }
                r8j0 r8j0Var = new r8j0(pig.a(pigVar2, x5t.a(x5tVar2, kotlin.collections.a.m0(x5tVar2.a, collection), null, null, 1022)), null, 14);
                pz40 Y = bVar3.Y();
                do {
                    r0Var2 = (r0) Y;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, plg.a((plg) value2, r8j0Var, null, null, null, 2039)));
            }
            return zy11.a;
        }
        b bVar4 = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            x4c.g("Error in time loading of page for dashboard DivKit list", a2, null, null, 12);
            pig pigVar3 = (pig) ((plg) bVar4.X()).d.a();
            if (pigVar3 != null) {
                x5t x5tVar4 = pigVar3.d;
                r8j0 r8j0Var2 = new r8j0(pig.a(pigVar3, x5tVar4 != null ? x5t.a(x5tVar4, null, null, NextPageLoadingStatus.ERROR, 895) : null), null, 14);
                pz40 Y2 = bVar4.Y();
                do {
                    r0Var = (r0) Y2;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, plg.a((plg) value, r8j0Var2, null, null, null, 2039)));
            }
        }
        return zy11.a;
    }
}
