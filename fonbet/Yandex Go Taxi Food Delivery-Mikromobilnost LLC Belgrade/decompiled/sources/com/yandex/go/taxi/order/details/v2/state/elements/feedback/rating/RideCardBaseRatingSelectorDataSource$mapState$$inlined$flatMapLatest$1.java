package com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CoherentRatingSelector;
import defpackage.g92;
import defpackage.kdc;
import defpackage.mck0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.v8i0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating.RideCardBaseRatingSelectorDataSource$mapState$$inlined$flatMapLatest$1", f = "RideCardBaseRatingSelectorDataSource.kt", l = {HProv.PP_AUTH_INFO, 219, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class RideCardBaseRatingSelectorDataSource$mapState$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ RideCardItemDto$CoherentRatingSelector.RatingItemDecorationState $dto$inlined;
    final /* synthetic */ kdc $mainColor$inlined;
    final /* synthetic */ RideCardItemDto$CoherentRatingSelector.DecorationStateType $state$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardBaseRatingSelectorDataSource$mapState$$inlined$flatMapLatest$1(Continuation continuation, e eVar, RideCardItemDto$CoherentRatingSelector.RatingItemDecorationState ratingItemDecorationState, RideCardItemDto$CoherentRatingSelector.DecorationStateType decorationStateType, kdc kdcVar) {
        super(3, continuation);
        this.this$0 = eVar;
        this.$dto$inlined = ratingItemDecorationState;
        this.$state$inlined = decorationStateType;
        this.$mainColor$inlined = kdcVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RideCardBaseRatingSelectorDataSource$mapState$$inlined$flatMapLatest$1 rideCardBaseRatingSelectorDataSource$mapState$$inlined$flatMapLatest$1 = new RideCardBaseRatingSelectorDataSource$mapState$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$dto$inlined, this.$state$inlined, this.$mainColor$inlined);
        rideCardBaseRatingSelectorDataSource$mapState$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        rideCardBaseRatingSelectorDataSource$mapState$$inlined$flatMapLatest$1.L$1 = obj2;
        return rideCardBaseRatingSelectorDataSource$mapState$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b4, code lost:
    
        if (kotlinx.coroutines.flow.e.u((defpackage.tpr) r1, r0, r8) != r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b6, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        if (r9 == r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        if (r9 == r2) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object g92Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String a = this.this$0.e.a(this.$dto$inlined.b);
            if (a == null) {
                g92Var = new g92(2, v8i0.c);
            } else {
                int i2 = mck0.a[this.$state$inlined.ordinal()];
                if (i2 == 1) {
                    e eVar = this.this$0;
                    kdc kdcVar = this.$mainColor$inlined;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = vprVar;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 1;
                    obj = e.c(eVar, a, kdcVar, this);
                } else if (i2 == 2) {
                    e eVar2 = this.this$0;
                    kdc kdcVar2 = this.$mainColor$inlined;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = vprVar;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 2;
                    obj = e.d(eVar2, a, kdcVar2, this);
                } else {
                    if (i2 != 3) {
                        w511.b();
                        return null;
                    }
                    g92Var = new g92(2, v8i0.c);
                }
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.label = 3;
        } else {
            if (i != 1 && i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
        }
        g92Var = obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.label = 3;
    }
}
