package com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips.wish;

import android.graphics.drawable.BitmapDrawable;
import defpackage.gpk0;
import defpackage.jpk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lkpk0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips.wish.RideCardTipsWishContentDataSource$loadImage$1", f = "RideCardTipsWishContentDataSource.kt", l = {47, 49, 50}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardTipsWishContentDataSource$loadImage$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $imageTag;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ gpk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardTipsWishContentDataSource$loadImage$1(gpk0 gpk0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gpk0Var;
        this.$imageTag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardTipsWishContentDataSource$loadImage$1 rideCardTipsWishContentDataSource$loadImage$1 = new RideCardTipsWishContentDataSource$loadImage$1(this.this$0, this.$imageTag, continuation);
        rideCardTipsWishContentDataSource$loadImage$1.L$0 = obj;
        return rideCardTipsWishContentDataSource$loadImage$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardTipsWishContentDataSource$loadImage$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (r0.emit(r4, r7) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0037, code lost:
    
        if (r0.emit(defpackage.ipk0.a, r7) == r1) goto L22;
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
            b.b(obj);
            this.L$0 = vprVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11.a;
                }
                b.b(obj);
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable != null) {
                    jpk0 jpk0Var = new jpk0(pkf.g(bitmapDrawable, this.$imageTag, null));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                }
                return zy11.a;
            }
            b.b(obj);
        }
        e eVar = this.this$0.b;
        String str = this.$imageTag;
        this.L$0 = vprVar;
        this.label = 2;
        obj = e.f(eVar, str, null, this, 6);
    }
}
