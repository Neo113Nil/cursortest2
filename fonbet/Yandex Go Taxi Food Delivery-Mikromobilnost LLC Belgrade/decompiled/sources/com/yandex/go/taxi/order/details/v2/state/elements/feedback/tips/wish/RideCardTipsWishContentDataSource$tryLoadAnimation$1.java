package com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips.wish;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.gpk0;
import defpackage.hpk0;
import defpackage.ipk0;
import defpackage.mvg;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.ytz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lkpk0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.feedback.tips.wish.RideCardTipsWishContentDataSource$tryLoadAnimation$1", f = "RideCardTipsWishContentDataSource.kt", l = {64, 65, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE, 72}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardTipsWishContentDataSource$tryLoadAnimation$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ gpk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardTipsWishContentDataSource$tryLoadAnimation$1(gpk0 gpk0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gpk0Var;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardTipsWishContentDataSource$tryLoadAnimation$1 rideCardTipsWishContentDataSource$tryLoadAnimation$1 = new RideCardTipsWishContentDataSource$tryLoadAnimation$1(this.this$0, this.$url, continuation);
        rideCardTipsWishContentDataSource$tryLoadAnimation$1.L$0 = obj;
        return rideCardTipsWishContentDataSource$tryLoadAnimation$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardTipsWishContentDataSource$tryLoadAnimation$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (r0.emit(r4, r9) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r10 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r0.emit(r4, r9) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        if (r10 == r1) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj2 = ipk0.a;
        if (i == 0) {
            b.b(obj);
            ytz ytzVar = this.this$0.c;
            String str = this.$url;
            this.L$0 = vprVar;
            this.label = 1;
            obj = ((com.yandex.go.lottie_loader.a) ytzVar).a.a(str, this);
        } else if (i == 1) {
            b.b(obj);
        } else if (i == 2) {
            b.b(obj);
            ytz ytzVar2 = this.this$0.c;
            String str2 = this.$url;
            this.L$0 = vprVar;
            this.label = 3;
            obj = ((com.yandex.go.lottie_loader.a) ytzVar2).a(str2, this);
        } else {
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            b.b(obj);
            nsz nszVar = (nsz) obj;
            if (nszVar != null) {
                obj2 = new hpk0(nszVar);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 4;
        }
        if (!((Boolean) obj).booleanValue()) {
            this.L$0 = vprVar;
            this.label = 2;
        }
        ytz ytzVar22 = this.this$0.c;
        String str22 = this.$url;
        this.L$0 = vprVar;
        this.label = 3;
        obj = ((com.yandex.go.lottie_loader.a) ytzVar22).a(str22, this);
    }
}
