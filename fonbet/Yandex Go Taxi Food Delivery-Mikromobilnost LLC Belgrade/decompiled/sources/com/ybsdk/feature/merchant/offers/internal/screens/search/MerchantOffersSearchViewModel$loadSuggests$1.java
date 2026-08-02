package com.ybsdk.feature.merchant.offers.internal.screens.search;

import com.ybsdk.core.analytics.generated.delegates.OffersListEvents$MerchantOffersSearchLoadedLoadType;
import com.ybsdk.core.analytics.generated.delegates.OffersListEvents$MerchantOffersSearchLoadedResult;
import defpackage.gq10;
import defpackage.hq10;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.t8j0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.merchant.offers.internal.screens.search.MerchantOffersSearchViewModel$loadSuggests$1", f = "MerchantOffersSearchViewModel.kt", l = {164}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MerchantOffersSearchViewModel$loadSuggests$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchantOffersSearchViewModel$loadSuggests$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MerchantOffersSearchViewModel$loadSuggests$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MerchantOffersSearchViewModel$loadSuggests$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object c;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, gq10.a((gq10) value, new t8j0(), null, EmptyList.a, null, 8)));
            com.ybsdk.feature.merchant.offers.internal.domain.interactor.b bVar = this.this$0.C;
            this.label = 1;
            c = bVar.c(this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            c = ((Result) obj).getValue();
        }
        a aVar = this.this$0;
        if (!(c instanceof Result.Failure)) {
            hq10 hq10Var = (hq10) c;
            pz40 Y2 = aVar.Y();
            do {
                r0Var3 = (r0) Y2;
                value3 = r0Var3.getValue();
            } while (!r0Var3.k(value3, gq10.a((gq10) value3, new r8j0(hq10Var, null, 14), null, null, null, 14)));
            aVar.F.N.m(OffersListEvents$MerchantOffersSearchLoadedResult.OK, null, OffersListEvents$MerchantOffersSearchLoadedLoadType.START);
        }
        a aVar2 = this.this$0;
        Throwable a = Result.a(c);
        if (a != null) {
            pz40 Y3 = aVar2.Y();
            do {
                r0Var2 = (r0) Y3;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, gq10.a((gq10) value2, new s8j0(a), null, null, null, 14)));
            aVar2.F.N.m(OffersListEvents$MerchantOffersSearchLoadedResult.ERROR, a.getMessage(), OffersListEvents$MerchantOffersSearchLoadedLoadType.START);
        }
        return zy11.a;
    }
}
