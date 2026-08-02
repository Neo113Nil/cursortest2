package com.ybsdk.feature.merchant.offers.internal.screens.testSearch;

import defpackage.lp10;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pq10;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.merchant.offers.internal.screens.testSearch.MerchantOffersTestSearchViewModel$loadSearchResults$2", f = "MerchantOffersTestSearchViewModel.kt", l = {47, 48}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MerchantOffersTestSearchViewModel$loadSearchResults$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $query;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchantOffersTestSearchViewModel$loadSearchResults$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$query = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MerchantOffersTestSearchViewModel$loadSearchResults$2(this.this$0, this.$query, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MerchantOffersTestSearchViewModel$loadSearchResults$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003b, code lost:
    
        if (r9 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002c, code lost:
    
        if (kotlinx.coroutines.a.i(500, r8) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object d;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                d = ((Result) obj).getValue();
                a aVar = this.this$0;
                if (!(d instanceof Result.Failure)) {
                    lp10 lp10Var = (lp10) d;
                    pz40 Y = aVar.Y();
                    do {
                        r0Var2 = (r0) Y;
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, pq10.a((pq10) value2, new r8j0(lp10Var, null, 14))));
                }
                a aVar2 = this.this$0;
                Throwable a = Result.a(d);
                if (a != null) {
                    pz40 Y2 = aVar2.Y();
                    do {
                        r0Var = (r0) Y2;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, pq10.a((pq10) value, new s8j0(a))));
                }
                return zy11.a;
            }
            b.b(obj);
        }
        com.ybsdk.feature.merchant.offers.internal.domain.interactor.a aVar3 = this.this$0.C;
        String str = this.$query;
        this.label = 2;
        d = aVar3.d(str, this);
    }
}
