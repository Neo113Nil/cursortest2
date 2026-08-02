package com.yandex.go.taxi.order.rate;

import defpackage.hze0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.v7s;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lv7s;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.rate.RatePresenter$showPriceDetails$1$priceDetails$1", f = "RatePresenter.kt", l = {185}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RatePresenter$showPriceDetails$1$priceDetails$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<hze0> $details;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatePresenter$showPriceDetails$1$priceDetails$1(c cVar, List list, Continuation continuation) {
        super(2, continuation);
        this.$details = list;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RatePresenter$showPriceDetails$1$priceDetails$1(this.this$0, this.$details, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RatePresenter$showPriceDetails$1$priceDetails$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0070 -> B:5:0x0071). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        Collection arrayList;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List<hze0> list = this.$details;
            c cVar2 = this.this$0;
            cVar = cVar2;
            arrayList = new ArrayList(tcc.n(list, 10));
            it = list.iterator();
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = (Collection) this.L$7;
            it = (Iterator) this.L$4;
            Collection collection = (Collection) this.L$3;
            cVar = (c) this.L$1;
            kotlin.b.b(obj);
            arrayList.add((v7s) obj);
            arrayList = collection;
            if (it.hasNext()) {
                hze0 hze0Var = (hze0) it.next();
                this.L$0 = null;
                this.L$1 = cVar;
                this.L$2 = null;
                this.L$3 = arrayList;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = arrayList;
                this.label = 1;
                obj = c.Kg(cVar, hze0Var, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                collection = arrayList;
                arrayList.add((v7s) obj);
                arrayList = collection;
                if (it.hasNext()) {
                    return (List) arrayList;
                }
            }
        }
    }
}
