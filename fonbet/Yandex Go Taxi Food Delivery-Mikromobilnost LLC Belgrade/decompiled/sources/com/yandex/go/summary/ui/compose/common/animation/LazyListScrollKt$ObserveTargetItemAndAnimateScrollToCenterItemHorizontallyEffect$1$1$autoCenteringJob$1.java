package com.yandex.go.summary.ui.compose.common.animation;

import androidx.compose.runtime.f;
import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.rol0;
import defpackage.tls;
import defpackage.tse;
import defpackage.vs9;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.ui.compose.common.animation.LazyListScrollKt$ObserveTargetItemAndAnimateScrollToCenterItemHorizontallyEffect$1$1$autoCenteringJob$1", f = "LazyListScroll.kt", l = {43, 46, 52, 53}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class LazyListScrollKt$ObserveTargetItemAndAnimateScrollToCenterItemHorizontallyEffect$1$1$autoCenteringJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ float $centeringSpeed;
    final /* synthetic */ oz40 $isAutoScrollingState;
    final /* synthetic */ androidx.compose.foundation.lazy.b $lazyListState;
    final /* synthetic */ int $targetIndex;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
    @mvg(c = "com.yandex.go.summary.ui.compose.common.animation.LazyListScrollKt$ObserveTargetItemAndAnimateScrollToCenterItemHorizontallyEffect$1$1$autoCenteringJob$1$2", f = "LazyListScroll.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.ui.compose.common.animation.LazyListScrollKt$ObserveTargetItemAndAnimateScrollToCenterItemHorizontallyEffect$1$1$autoCenteringJob$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ int $targetIndex;
        /* synthetic */ int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, Continuation continuation) {
            super(2, continuation);
            this.$targetIndex = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$targetIndex, continuation);
            anonymousClass2.I$0 = ((Number) obj).intValue();
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.I$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return Boolean.valueOf(i > this.$targetIndex);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.summary.ui.compose.common.animation.LazyListScrollKt$ObserveTargetItemAndAnimateScrollToCenterItemHorizontallyEffect$1$1$autoCenteringJob$1$3", f = "LazyListScroll.kt", l = {47}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.ui.compose.common.animation.LazyListScrollKt$ObserveTargetItemAndAnimateScrollToCenterItemHorizontallyEffect$1$1$autoCenteringJob$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements tls {
        final /* synthetic */ androidx.compose.foundation.lazy.b $lazyListState;
        final /* synthetic */ int $targetIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i, androidx.compose.foundation.lazy.b bVar, Continuation continuation) {
            super(1, continuation);
            this.$lazyListState = bVar;
            this.$targetIndex = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass3(this.$targetIndex, this.$lazyListState, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass3) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                androidx.compose.foundation.lazy.b bVar = this.$lazyListState;
                int i2 = this.$targetIndex;
                this.label = 1;
                if (c.c(bVar, i2, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.summary.ui.compose.common.animation.LazyListScrollKt$ObserveTargetItemAndAnimateScrollToCenterItemHorizontallyEffect$1$1$autoCenteringJob$1$4", f = "LazyListScroll.kt", l = {54}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.summary.ui.compose.common.animation.LazyListScrollKt$ObserveTargetItemAndAnimateScrollToCenterItemHorizontallyEffect$1$1$autoCenteringJob$1$4, reason: invalid class name */
    final class AnonymousClass4 extends SuspendLambda implements tls {
        final /* synthetic */ float $centeringSpeed;
        final /* synthetic */ androidx.compose.foundation.lazy.b $lazyListState;
        final /* synthetic */ int $targetIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(androidx.compose.foundation.lazy.b bVar, int i, float f, Continuation continuation) {
            super(1, continuation);
            this.$lazyListState = bVar;
            this.$targetIndex = i;
            this.$centeringSpeed = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass4(this.$lazyListState, this.$targetIndex, this.$centeringSpeed, continuation);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            return ((AnonymousClass4) create((Continuation) obj)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                androidx.compose.foundation.lazy.b bVar = this.$lazyListState;
                int i2 = this.$targetIndex;
                float f = this.$centeringSpeed;
                this.label = 1;
                if (c.d(bVar, i2, f, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListScrollKt$ObserveTargetItemAndAnimateScrollToCenterItemHorizontallyEffect$1$1$autoCenteringJob$1(androidx.compose.foundation.lazy.b bVar, int i, oz40 oz40Var, float f, Continuation continuation) {
        super(2, continuation);
        this.$lazyListState = bVar;
        this.$targetIndex = i;
        this.$isAutoScrollingState = oz40Var;
        this.$centeringSpeed = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LazyListScrollKt$ObserveTargetItemAndAnimateScrollToCenterItemHorizontallyEffect$1$1$autoCenteringJob$1 lazyListScrollKt$ObserveTargetItemAndAnimateScrollToCenterItemHorizontallyEffect$1$1$autoCenteringJob$1 = new LazyListScrollKt$ObserveTargetItemAndAnimateScrollToCenterItemHorizontallyEffect$1$1$autoCenteringJob$1(this.$lazyListState, this.$targetIndex, this.$isAutoScrollingState, this.$centeringSpeed, continuation);
        lazyListScrollKt$ObserveTargetItemAndAnimateScrollToCenterItemHorizontallyEffect$1$1$autoCenteringJob$1.L$0 = obj;
        return lazyListScrollKt$ObserveTargetItemAndAnimateScrollToCenterItemHorizontallyEffect$1$1$autoCenteringJob$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyListScrollKt$ObserveTargetItemAndAnimateScrollToCenterItemHorizontallyEffect$1$1$autoCenteringJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0096, code lost:
    
        if (com.yandex.go.summary.ui.compose.common.animation.c.g(r10, r2, r9) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (com.yandex.go.summary.ui.compose.common.animation.c.e(r10, r2, r9) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0098, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (com.yandex.go.summary.ui.compose.common.animation.c.g(r10, r2, r9) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
    
        if (kotlinx.coroutines.flow.e.x(r10, r2, r9) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0096 -> B:13:0x006c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            rol0 o = f.o(new vs9(this.$lazyListState, 8));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$targetIndex, null);
            this.L$0 = tseVar;
            this.label = 1;
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    oz40 oz40Var = this.$isAutoScrollingState;
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$lazyListState, this.$targetIndex, this.$centeringSpeed, null);
                    this.L$0 = tseVar;
                    this.label = 4;
                } else if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            kotlin.b.b(obj);
            if (bvf0.D(tseVar)) {
                return zy11.a;
            }
            androidx.compose.foundation.lazy.b bVar = this.$lazyListState;
            int i2 = this.$targetIndex;
            this.L$0 = tseVar;
            this.label = 3;
        } else {
            kotlin.b.b(obj);
        }
        if (!c.f(this.$targetIndex, this.$lazyListState)) {
            oz40 oz40Var2 = this.$isAutoScrollingState;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$targetIndex, this.$lazyListState, null);
            this.L$0 = tseVar;
            this.label = 2;
        }
        if (bvf0.D(tseVar)) {
        }
    }
}
