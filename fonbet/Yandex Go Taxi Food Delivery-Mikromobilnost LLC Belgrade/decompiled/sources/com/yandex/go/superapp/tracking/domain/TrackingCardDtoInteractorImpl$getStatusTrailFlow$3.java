package com.yandex.go.superapp.tracking.domain;

import com.yandex.go.superapp.tracking.models.dto.TrackingCardButtonDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusTrailButtonDto;
import defpackage.b501;
import defpackage.h401;
import defpackage.k301;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lt401;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.tracking.domain.TrackingCardDtoInteractorImpl$getStatusTrailFlow$3", f = "TrackingCardDtoInteractorImpl.kt", l = {206, 206, 207}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TrackingCardDtoInteractorImpl$getStatusTrailFlow$3 extends SuspendLambda implements wls {
    final /* synthetic */ b501 $trail;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingCardDtoInteractorImpl$getStatusTrailFlow$3(b501 b501Var, e eVar, Continuation continuation) {
        super(2, continuation);
        this.$trail = b501Var;
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TrackingCardDtoInteractorImpl$getStatusTrailFlow$3 trackingCardDtoInteractorImpl$getStatusTrailFlow$3 = new TrackingCardDtoInteractorImpl$getStatusTrailFlow$3(this.$trail, this.this$0, continuation);
        trackingCardDtoInteractorImpl$getStatusTrailFlow$3.L$0 = obj;
        return trackingCardDtoInteractorImpl$getStatusTrailFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackingCardDtoInteractorImpl$getStatusTrailFlow$3) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r0.emit(r2, r7) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[RETURN] */
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
            TrackingCardButtonDto trackingCardButtonDto = ((TrackingCardStatusTrailButtonDto) this.$trail).a;
            if (trackingCardButtonDto != null) {
                e eVar = this.this$0;
                this.L$0 = vprVar;
                this.label = 1;
                obj = e.a(eVar, trackingCardButtonDto, this);
            }
            this.L$0 = null;
            this.label = 2;
            Object emit = vprVar.emit(null, this);
            return emit != coroutineSingletons ? coroutineSingletons : emit;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                return obj;
            }
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11.a;
        }
        kotlin.b.b(obj);
        k301 k301Var = (k301) obj;
        if (k301Var != null) {
            h401 h401Var = new h401(k301Var);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        this.L$0 = null;
        this.label = 2;
        Object emit2 = vprVar.emit(null, this);
        if (emit2 != coroutineSingletons) {
        }
    }
}
