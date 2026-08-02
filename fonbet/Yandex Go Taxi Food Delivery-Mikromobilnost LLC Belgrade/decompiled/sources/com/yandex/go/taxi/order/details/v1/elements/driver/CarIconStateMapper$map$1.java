package com.yandex.go.taxi.order.details.v1.elements.driver;

import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.d58;
import defpackage.m6j;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.n6j;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.v5j;
import defpackage.vpr;
import defpackage.w5j;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lx5j;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.driver.CarIconStateMapper$map$1", f = "CarIconStateMapper.kt", l = {15, 17, 19, 20, 22}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class CarIconStateMapper$map$1 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiOrder $order;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d58 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarIconStateMapper$map$1(d58 d58Var, TaxiOrder taxiOrder, Continuation continuation) {
        super(2, continuation);
        this.this$0 = d58Var;
        this.$order = taxiOrder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CarIconStateMapper$map$1 carIconStateMapper$map$1 = new CarIconStateMapper$map$1(this.this$0, this.$order, continuation);
        carIconStateMapper$map$1.L$0 = obj;
        return carIconStateMapper$map$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CarIconStateMapper$map$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d9, code lost:
    
        if (r0.emit(r2, r10) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        if (r11 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r0.emit(r2, r10) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r0.emit(r11, r10) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        if (r11 == r1) goto L35;
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
            n6j n6jVar = this.this$0.b;
            TaxiOrder taxiOrder = this.$order;
            this.L$0 = vprVar;
            this.label = 1;
            n6jVar.a.getClass();
            sjh sjhVar = uyj.a;
            obj = tje.k0(mdh.b, new DetailsCardIconCacheRepository$takeCachedIcon$2(n6jVar, taxiOrder, null), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        kotlin.b.b(obj);
                        b bVar = this.this$0.a;
                        TaxiOrder taxiOrder2 = this.$order;
                        this.L$0 = vprVar;
                        this.L$1 = null;
                        this.label = 4;
                        bVar.e.getClass();
                        sjh sjhVar2 = uyj.a;
                        obj = tje.k0(mdh.b, new DetailsCarIconRepository$loadIcon$2(bVar, taxiOrder2, null), this);
                    } else if (i == 4) {
                        kotlin.b.b(obj);
                        Drawable drawable = (Drawable) obj;
                        n6j n6jVar2 = this.this$0.b;
                        TaxiOrder taxiOrder3 = this.$order;
                        n6jVar2.b.getClass();
                        String c = b.c(taxiOrder3);
                        if (c == null) {
                            c = "";
                        }
                        n6jVar2.c = new m6j(c, drawable);
                        w5j w5jVar = new w5j(drawable);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                    } else {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        Drawable drawable2 = (Drawable) obj;
        if (drawable2 != null) {
            w5j w5jVar2 = new w5j(drawable2);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        } else {
            v5j v5jVar = v5j.a;
            this.L$0 = vprVar;
            this.L$1 = null;
            this.label = 3;
        }
        return coroutineSingletons;
    }
}
