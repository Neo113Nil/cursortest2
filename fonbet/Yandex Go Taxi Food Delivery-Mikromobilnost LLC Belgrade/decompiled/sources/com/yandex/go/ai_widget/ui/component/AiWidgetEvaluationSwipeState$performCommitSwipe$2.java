package com.yandex.go.ai_widget.ui.component;

import defpackage.ck11;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sb2;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ai_widget.ui.component.AiWidgetEvaluationSwipeState$performCommitSwipe$2", f = "AiWidgetEvaluationSwipeState.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AiWidgetEvaluationSwipeState$performCommitSwipe$2 extends SuspendLambda implements wls {
    final /* synthetic */ float $flyAwayOffset;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.ai_widget.ui.component.AiWidgetEvaluationSwipeState$performCommitSwipe$2$1", f = "AiWidgetEvaluationSwipeState.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.ai_widget.ui.component.AiWidgetEvaluationSwipeState$performCommitSwipe$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ float $flyAwayOffset;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, float f, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$flyAwayOffset = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$flyAwayOffset, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                androidx.compose.animation.core.a aVar = this.this$0.l;
                Float f = new Float(this.$flyAwayOffset);
                ck11 K = sb2.K(300, 0, null, 6);
                this.label = 1;
                if (androidx.compose.animation.core.a.d(aVar, f, K, null, null, this, 12) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.ai_widget.ui.component.AiWidgetEvaluationSwipeState$performCommitSwipe$2$2", f = "AiWidgetEvaluationSwipeState.kt", l = {237}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.ai_widget.ui.component.AiWidgetEvaluationSwipeState$performCommitSwipe$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                androidx.compose.animation.core.a aVar = this.this$0.m;
                Float f = new Float(0.0f);
                ck11 K = sb2.K(300, 0, null, 6);
                this.label = 1;
                if (androidx.compose.animation.core.a.d(aVar, f, K, null, null, this, 12) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.ai_widget.ui.component.AiWidgetEvaluationSwipeState$performCommitSwipe$2$3", f = "AiWidgetEvaluationSwipeState.kt", l = {PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.ai_widget.ui.component.AiWidgetEvaluationSwipeState$performCommitSwipe$2$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                androidx.compose.animation.core.a aVar = this.this$0.g;
                Float f = new Float(0.0f);
                ck11 K = sb2.K(300, 0, null, 6);
                this.label = 1;
                if (androidx.compose.animation.core.a.d(aVar, f, K, null, null, this, 12) == coroutineSingletons) {
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
    public AiWidgetEvaluationSwipeState$performCommitSwipe$2(b bVar, float f, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$flyAwayOffset = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AiWidgetEvaluationSwipeState$performCommitSwipe$2 aiWidgetEvaluationSwipeState$performCommitSwipe$2 = new AiWidgetEvaluationSwipeState$performCommitSwipe$2(this.this$0, this.$flyAwayOffset, continuation);
        aiWidgetEvaluationSwipeState$performCommitSwipe$2.L$0 = obj;
        return aiWidgetEvaluationSwipeState$performCommitSwipe$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AiWidgetEvaluationSwipeState$performCommitSwipe$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, this.$flyAwayOffset, null), 3);
        tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, null), 3);
        return tje.N(tseVar, null, null, new AnonymousClass3(this.this$0, null), 3);
    }
}
