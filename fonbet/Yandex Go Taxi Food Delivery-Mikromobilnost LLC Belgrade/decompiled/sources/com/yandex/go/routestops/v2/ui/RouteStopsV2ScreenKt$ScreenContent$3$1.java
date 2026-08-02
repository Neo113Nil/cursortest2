package com.yandex.go.routestops.v2.ui;

import androidx.compose.runtime.f;
import defpackage.hr5;
import defpackage.lx40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oq5;
import defpackage.rol0;
import defpackage.tse;
import defpackage.twt0;
import defpackage.tx40;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.routestops.v2.ui.RouteStopsV2ScreenKt$ScreenContent$3$1", f = "RouteStopsV2Screen.kt", l = {145}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class RouteStopsV2ScreenKt$ScreenContent$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ tx40 $anchorHeightState;
    final /* synthetic */ lx40 $defaultAnchor;
    int label;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "<anonymous>", "(F)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.routestops.v2.ui.RouteStopsV2ScreenKt$ScreenContent$3$1$2", f = "RouteStopsV2Screen.kt", l = {147, 149}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.routestops.v2.ui.RouteStopsV2ScreenKt$ScreenContent$3$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ lx40 $defaultAnchor;
        /* synthetic */ float F$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(lx40 lx40Var, Continuation continuation) {
            super(2, continuation);
            this.$defaultAnchor = lx40Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$defaultAnchor, continuation);
            anonymousClass2.F$0 = ((Number) obj).floatValue();
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
        
            if (androidx.compose.animation.core.e.c(r0, r1, r2, r3, r7, 4) == r6) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
        
            if (kotlinx.coroutines.a.i(500, r7) == r6) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            float f = this.F$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                if (this.$defaultAnchor.c.getFloatValue() > f) {
                    this.F$0 = f;
                    this.label = 1;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            float floatValue = this.$defaultAnchor.c.getFloatValue();
            twt0 twt0Var = com.yandex.go.design.compose.modal.bottomsheet.b.a;
            hr5 hr5Var = new hr5(this.$defaultAnchor, 1);
            this.F$0 = f;
            this.label = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteStopsV2ScreenKt$ScreenContent$3$1(tx40 tx40Var, lx40 lx40Var, Continuation continuation) {
        super(2, continuation);
        this.$anchorHeightState = tx40Var;
        this.$defaultAnchor = lx40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RouteStopsV2ScreenKt$ScreenContent$3$1(this.$anchorHeightState, this.$defaultAnchor, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RouteStopsV2ScreenKt$ScreenContent$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            rol0 o = f.o(new oq5(this.$anchorHeightState, 1));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$defaultAnchor, null);
            this.label = 1;
            if (e.k(o, anonymousClass2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
