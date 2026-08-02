package com.yandex.go.payments.paymentlist.details;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.n9a0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.details.PaymentMethodsBannersInfoInteractor$needHideBanner$2$1", f = "PaymentMethodsBannersInfoInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodsBannersInfoInteractor$needHideBanner$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $bannerId;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsBannersInfoInteractor$needHideBanner$2$1(d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$bannerId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodsBannersInfoInteractor$needHideBanner$2$1(this.this$0, this.$bannerId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodsBannersInfoInteractor$needHideBanner$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object obj2 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        n9a0 n9a0Var = this.this$0.b;
        String str = this.$bannerId;
        Set n = n9a0Var.b.n("FIELD_PAYMENT_BANNERS_INFO_SET");
        ArrayList arrayList = new ArrayList();
        Iterator it = n.iterator();
        while (it.hasNext()) {
            BannerIdInfo a = n9a0Var.a((String) it.next());
            if (a != null) {
                arrayList.add(a);
            }
        }
        Iterator it2 = kotlin.collections.a.M0(arrayList).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (jl40.l(((BannerIdInfo) next).a, str)) {
                obj2 = next;
                break;
            }
        }
        BannerIdInfo bannerIdInfo = (BannerIdInfo) obj2;
        return Boolean.valueOf((bannerIdInfo == null || (bool = bannerIdInfo.c) == null) ? false : bool.booleanValue());
    }
}
