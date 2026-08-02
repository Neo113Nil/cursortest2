package com.yandex.go.summary.ui.compose.common.animation;

import androidx.compose.runtime.f;
import defpackage.l8x;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.rol0;
import defpackage.tje;
import defpackage.tse;
import defpackage.w6y;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.ui.compose.common.animation.LazyListScrollKt$ObserveFirstItemAndTargetItemScrollEffect$1$1", f = "LazyListScroll.kt", l = {120}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class LazyListScrollKt$ObserveFirstItemAndTargetItemScrollEffect$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ float $centeringSpeed;
    final /* synthetic */ oz40 $isInitialScrollDone;
    final /* synthetic */ m3u0 $isUserDragging;
    final /* synthetic */ androidx.compose.foundation.lazy.b $lazyListState;
    final /* synthetic */ int $targetIndex;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @mvg(c = "com.yandex.go.summary.ui.compose.common.animation.LazyListScrollKt$ObserveFirstItemAndTargetItemScrollEffect$1$1$2", f = "LazyListScroll.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.ui.compose.common.animation.LazyListScrollKt$ObserveFirstItemAndTargetItemScrollEffect$1$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, continuation);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return ((AnonymousClass2) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return Boolean.valueOf(z);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListScrollKt$ObserveFirstItemAndTargetItemScrollEffect$1$1(oz40 oz40Var, androidx.compose.foundation.lazy.b bVar, int i, float f, m3u0 m3u0Var, Continuation continuation) {
        super(2, continuation);
        this.$isInitialScrollDone = oz40Var;
        this.$lazyListState = bVar;
        this.$targetIndex = i;
        this.$centeringSpeed = f;
        this.$isUserDragging = m3u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LazyListScrollKt$ObserveFirstItemAndTargetItemScrollEffect$1$1 lazyListScrollKt$ObserveFirstItemAndTargetItemScrollEffect$1$1 = new LazyListScrollKt$ObserveFirstItemAndTargetItemScrollEffect$1$1(this.$isInitialScrollDone, this.$lazyListState, this.$targetIndex, this.$centeringSpeed, this.$isUserDragging, continuation);
        lazyListScrollKt$ObserveFirstItemAndTargetItemScrollEffect$1$1.L$0 = obj;
        return lazyListScrollKt$ObserveFirstItemAndTargetItemScrollEffect$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyListScrollKt$ObserveFirstItemAndTargetItemScrollEffect$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l8x N;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            oz40 j = f.j(Boolean.FALSE);
            N = tje.N(tseVar, null, null, new LazyListScrollKt$ObserveFirstItemAndTargetItemScrollEffect$1$1$autoCenteringJob$1(this.$isInitialScrollDone, j, this.$lazyListState, this.$targetIndex, this.$centeringSpeed, null), 3);
            rol0 o = f.o(new w6y(0, j, this.$isUserDragging, this.$lazyListState));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = N;
            this.label = 1;
            if (e.x(o, anonymousClass2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            N = (l8x) this.L$2;
            kotlin.b.b(obj);
        }
        N.a(null);
        return zy11.a;
    }
}
