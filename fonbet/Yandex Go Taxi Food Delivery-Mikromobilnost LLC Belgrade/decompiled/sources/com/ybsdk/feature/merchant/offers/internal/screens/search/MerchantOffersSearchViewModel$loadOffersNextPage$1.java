package com.ybsdk.feature.merchant.offers.internal.screens.search;

import com.ybsdk.core.analytics.generated.delegates.OffersListEvents$MerchantOffersSearchLoadedLoadType;
import com.ybsdk.core.analytics.generated.delegates.OffersListEvents$MerchantOffersSearchLoadedResult;
import defpackage.gq10;
import defpackage.lp10;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.tse;
import defpackage.u8j0;
import defpackage.wls;
import defpackage.ws00;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.merchant.offers.internal.screens.search.MerchantOffersSearchViewModel$loadOffersNextPage$1", f = "MerchantOffersSearchViewModel.kt", l = {248}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MerchantOffersSearchViewModel$loadOffersNextPage$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<String> $remainingOfferIds;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchantOffersSearchViewModel$loadOffersNextPage$1(a aVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$remainingOfferIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MerchantOffersSearchViewModel$loadOffersNextPage$1(this.this$0, this.$remainingOfferIds, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MerchantOffersSearchViewModel$loadOffersNextPage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        lp10 lp10Var;
        Object b;
        lp10 lp10Var2;
        r0 r0Var;
        Object value;
        gq10 gq10Var;
        r0 r0Var2;
        Object value2;
        gq10 gq10Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.this$0.a0(new ws00(24));
            a aVar = this.this$0;
            com.ybsdk.feature.merchant.offers.internal.domain.interactor.b bVar = aVar.C;
            u8j0 u8j0Var = (u8j0) kotlin.collections.a.b0(((gq10) aVar.X()).c);
            if (u8j0Var == null || (lp10Var2 = (lp10) u8j0Var.a()) == null || (str = lp10Var2.c) == null) {
                u8j0 u8j0Var2 = ((gq10) aVar.X()).b;
                str = (u8j0Var2 == null || (lp10Var = (lp10) u8j0Var2.a()) == null) ? null : lp10Var.c;
            }
            List<String> list = this.$remainingOfferIds;
            String str2 = ((gq10) this.this$0.X()).d;
            this.label = 1;
            b = bVar.b(str, str2, list, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            b = ((Result) obj).getValue();
        }
        a aVar2 = this.this$0;
        if (!(b instanceof Result.Failure)) {
            lp10 lp10Var3 = (lp10) b;
            pz40 Y = aVar2.Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
                gq10Var2 = (gq10) value2;
            } while (!r0Var2.k(value2, gq10.a(gq10Var2, null, null, kotlin.collections.a.o0(kotlin.collections.a.K(gq10Var2.c), new r8j0(lp10Var3, null, 14)), null, 11)));
            aVar2.F.N.m(OffersListEvents$MerchantOffersSearchLoadedResult.OK, null, OffersListEvents$MerchantOffersSearchLoadedLoadType.SEARCH_NEXT);
        }
        a aVar3 = this.this$0;
        Throwable a = Result.a(b);
        if (a != null) {
            pz40 Y2 = aVar3.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
                gq10Var = (gq10) value;
            } while (!r0Var.k(value, gq10.a(gq10Var, null, null, kotlin.collections.a.o0(kotlin.collections.a.K(gq10Var.c), new s8j0(a)), null, 11)));
            aVar3.F.N.m(OffersListEvents$MerchantOffersSearchLoadedResult.ERROR, a.getMessage(), OffersListEvents$MerchantOffersSearchLoadedLoadType.SEARCH_NEXT);
        }
        return zy11.a;
    }
}
