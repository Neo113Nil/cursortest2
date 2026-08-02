package com.yandex.go.taxi.order.details.v1.elements.driver;

import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.w5j;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lx5j;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.driver.CommonDetailsCardDriverSectionStateMapper$mapCarIcon$1", f = "CommonDetailsCardDriverSectionStateMapper.kt", l = {22, 23, 24}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class CommonDetailsCardDriverSectionStateMapper$mapCarIcon$1 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiOrder $order;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonDetailsCardDriverSectionStateMapper$mapCarIcon$1(a aVar, TaxiOrder taxiOrder, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$order = taxiOrder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CommonDetailsCardDriverSectionStateMapper$mapCarIcon$1 commonDetailsCardDriverSectionStateMapper$mapCarIcon$1 = new CommonDetailsCardDriverSectionStateMapper$mapCarIcon$1(this.this$0, this.$order, continuation);
        commonDetailsCardDriverSectionStateMapper$mapCarIcon$1.L$0 = obj;
        return commonDetailsCardDriverSectionStateMapper$mapCarIcon$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CommonDetailsCardDriverSectionStateMapper$mapCarIcon$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        if (r0.emit(r2, r7) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (r8 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (r0.emit(defpackage.v5j.a, r7) == r1) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.L$0 = vprVar;
            this.label = 1;
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
            w5j w5jVar = new w5j((Drawable) obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        b bVar = this.this$0.b;
        TaxiOrder taxiOrder = this.$order;
        this.L$0 = vprVar;
        this.label = 2;
        bVar.e.getClass();
        sjh sjhVar = uyj.a;
        obj = tje.k0(mdh.b, new DetailsCarIconRepository$loadIcon$2(bVar, taxiOrder, null), this);
    }
}
