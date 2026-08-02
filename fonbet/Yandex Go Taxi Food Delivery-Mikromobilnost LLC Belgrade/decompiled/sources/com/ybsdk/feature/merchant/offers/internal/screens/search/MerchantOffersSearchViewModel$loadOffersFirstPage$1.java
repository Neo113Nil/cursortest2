package com.ybsdk.feature.merchant.offers.internal.screens.search;

import com.ybsdk.core.analytics.generated.delegates.OffersListEvents$MerchantOffersSearchInitiatedLoadType;
import com.ybsdk.core.analytics.generated.delegates.OffersListEvents$MerchantOffersSearchLoadedLoadType;
import com.ybsdk.core.analytics.generated.delegates.OffersListEvents$MerchantOffersSearchLoadedResult;
import defpackage.gq10;
import defpackage.iq10;
import defpackage.lp10;
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
@mvg(c = "com.ybsdk.feature.merchant.offers.internal.screens.search.MerchantOffersSearchViewModel$loadOffersFirstPage$1", f = "MerchantOffersSearchViewModel.kt", l = {196, 200}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MerchantOffersSearchViewModel$loadOffersFirstPage$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $debounceDurationMs;
    final /* synthetic */ String $query;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchantOffersSearchViewModel$loadOffersFirstPage$1(a aVar, long j, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$debounceDurationMs = j;
        this.$query = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MerchantOffersSearchViewModel$loadOffersFirstPage$1(this.this$0, this.$debounceDurationMs, this.$query, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MerchantOffersSearchViewModel$loadOffersFirstPage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        if (r13 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0051, code lost:
    
        if (kotlinx.coroutines.a.i(r5, r12) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object a;
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
            } while (!r0Var.k(value, gq10.a((gq10) value, null, new t8j0(), EmptyList.a, null, 9)));
            long j = this.$debounceDurationMs;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                a = ((Result) obj).getValue();
                a aVar = this.this$0;
                if (!(a instanceof Result.Failure)) {
                    lp10 lp10Var = (lp10) a;
                    pz40 Y2 = aVar.Y();
                    do {
                        r0Var3 = (r0) Y2;
                        value3 = r0Var3.getValue();
                    } while (!r0Var3.k(value3, gq10.a((gq10) value3, null, new r8j0(lp10Var, null, 14), null, null, 13)));
                    aVar.Z(iq10.a);
                    aVar.F.N.m(OffersListEvents$MerchantOffersSearchLoadedResult.OK, null, OffersListEvents$MerchantOffersSearchLoadedLoadType.SEARCH_INIT);
                }
                a aVar2 = this.this$0;
                Throwable a2 = Result.a(a);
                if (a2 != null) {
                    pz40 Y3 = aVar2.Y();
                    do {
                        r0Var2 = (r0) Y3;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, gq10.a((gq10) value2, null, new s8j0(a2), null, null, 13)));
                    aVar2.F.N.m(OffersListEvents$MerchantOffersSearchLoadedResult.ERROR, a2.getMessage(), OffersListEvents$MerchantOffersSearchLoadedLoadType.SEARCH_INIT);
                }
                return zy11.a;
            }
            b.b(obj);
        }
        this.this$0.F.N.l(OffersListEvents$MerchantOffersSearchInitiatedLoadType.SEARCH_INIT);
        com.ybsdk.feature.merchant.offers.internal.domain.interactor.b bVar = this.this$0.C;
        String str = this.$query;
        this.label = 2;
        a = bVar.a(str, this);
    }
}
