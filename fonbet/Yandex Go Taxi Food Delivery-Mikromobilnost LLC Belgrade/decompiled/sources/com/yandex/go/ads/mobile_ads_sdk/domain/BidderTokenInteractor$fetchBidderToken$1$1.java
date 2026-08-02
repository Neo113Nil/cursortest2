package com.yandex.go.ads.mobile_ads_sdk.domain;

import com.yandex.mobile.ads.common.BidderTokenLoader;
import com.yandex.mobile.ads.common.BidderTokenRequest;
import defpackage.bp5;
import defpackage.cne0;
import defpackage.cp5;
import defpackage.dvw;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v60;
import defpackage.w511;
import defpackage.w60;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ads.mobile_ads_sdk.domain.BidderTokenInteractor$fetchBidderToken$1$1", f = "BidderTokenInteractor.kt", l = {56}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class BidderTokenInteractor$fetchBidderToken$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ w60 $adType;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidderTokenInteractor$fetchBidderToken$1$1(a aVar, w60 w60Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$adType = w60Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BidderTokenInteractor$fetchBidderToken$1$1(this.this$0, this.$adType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BidderTokenInteractor$fetchBidderToken$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            cp5 cp5Var = this.this$0.b;
            w60 w60Var = this.$adType;
            this.label = 1;
            cp5Var.getClass();
            j18 j18Var = new j18(1, dvw.b(this));
            j18Var.u();
            bp5 bp5Var = new bp5(j18Var);
            BidderTokenLoader bidderTokenLoader = cp5Var.a;
            if (!(w60Var instanceof v60)) {
                w511.b();
                return null;
            }
            bidderTokenLoader.loadBidderToken(BidderTokenRequest.Companion.nativeAd$default(BidderTokenRequest.INSTANCE, null, kotlin.collections.b.f(), 1, null), bp5Var);
            obj = j18Var.s();
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        String str = (String) obj;
        if (str != null) {
            a aVar = this.this$0;
            w60 w60Var2 = this.$adType;
            aVar.d.a.clear();
            cne0 cne0Var = (cne0) aVar.c.b;
            w60Var2.getClass();
            cne0Var.r("native", str);
        }
        return zy11.a;
    }
}
