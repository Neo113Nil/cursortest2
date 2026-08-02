package com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating;

import defpackage.kdc;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.uyj;
import defpackage.v8i0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lv8i0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating.RideCardBaseRatingSelectorDataSource$decorationFlow$1", f = "RideCardBaseRatingSelectorDataSource.kt", l = {199, 200, 201}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardBaseRatingSelectorDataSource$decorationFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $loadImage;
    final /* synthetic */ kdc $mainColor;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardBaseRatingSelectorDataSource$decorationFlow$1(e eVar, kdc kdcVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$mainColor = kdcVar;
        this.$loadImage = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardBaseRatingSelectorDataSource$decorationFlow$1 rideCardBaseRatingSelectorDataSource$decorationFlow$1 = new RideCardBaseRatingSelectorDataSource$decorationFlow$1(this.this$0, this.$mainColor, this.$loadImage, continuation);
        rideCardBaseRatingSelectorDataSource$decorationFlow$1.L$0 = obj;
        return rideCardBaseRatingSelectorDataSource$decorationFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardBaseRatingSelectorDataSource$decorationFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            v8i0 v8i0Var = v8i0.c;
            v8i0 v8i0Var2 = v8i0.c;
            this.L$0 = vprVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        kotlin.b.b(obj);
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                UiStateDrawableWrapper uiStateDrawableWrapper = (UiStateDrawableWrapper) obj;
                if (uiStateDrawableWrapper == null) {
                    return zy11Var;
                }
                v8i0 v8i0Var3 = new v8i0(uiStateDrawableWrapper, this.$mainColor);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                return vprVar.emit(v8i0Var3, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            kotlin.b.b(obj);
        }
        this.this$0.f.getClass();
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        RideCardBaseRatingSelectorDataSource$decorationFlow$1$image$1 rideCardBaseRatingSelectorDataSource$decorationFlow$1$image$1 = new RideCardBaseRatingSelectorDataSource$decorationFlow$1$image$1(this.$loadImage, null);
        this.L$0 = vprVar;
        this.label = 2;
        obj = tje.k0(mdhVar, rideCardBaseRatingSelectorDataSource$decorationFlow$1$image$1, this);
    }
}
