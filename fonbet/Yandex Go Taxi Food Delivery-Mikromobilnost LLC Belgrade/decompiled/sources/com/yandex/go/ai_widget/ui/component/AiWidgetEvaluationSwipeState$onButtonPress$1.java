package com.yandex.go.ai_widget.ui.component;

import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationSwipeDirection;
import defpackage.bvf0;
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
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ai_widget.ui.component.AiWidgetEvaluationSwipeState$onButtonPress$1", f = "AiWidgetEvaluationSwipeState.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AiWidgetEvaluationSwipeState$onButtonPress$1 extends SuspendLambda implements wls {
    final /* synthetic */ AiWidgetEvaluationSwipeDirection $direction;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.ai_widget.ui.component.AiWidgetEvaluationSwipeState$onButtonPress$1$1", f = "AiWidgetEvaluationSwipeState.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.ai_widget.ui.component.AiWidgetEvaluationSwipeState$onButtonPress$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ AiWidgetEvaluationSwipeDirection $direction;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ b this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "com.yandex.go.ai_widget.ui.component.AiWidgetEvaluationSwipeState$onButtonPress$1$1$1", f = "AiWidgetEvaluationSwipeState.kt", l = {91}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.ai_widget.ui.component.AiWidgetEvaluationSwipeState$onButtonPress$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00401 extends SuspendLambda implements wls {
            final /* synthetic */ AiWidgetEvaluationSwipeDirection $direction;
            int label;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00401(b bVar, AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection, Continuation continuation) {
                super(2, continuation);
                this.this$0 = bVar;
                this.$direction = aiWidgetEvaluationSwipeDirection;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00401(this.this$0, this.$direction, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((C00401) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.b.b(obj);
                    b bVar = this.this$0;
                    androidx.compose.animation.core.a aVar = bVar.c;
                    AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection = this.$direction;
                    AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection2 = AiWidgetEvaluationSwipeDirection.RIGHT;
                    float f = bVar.f;
                    if (aiWidgetEvaluationSwipeDirection != aiWidgetEvaluationSwipeDirection2) {
                        f = -f;
                    }
                    Float f2 = new Float(f);
                    ck11 K = sb2.K(200, 0, null, 6);
                    this.label = 1;
                    if (androidx.compose.animation.core.a.d(aVar, f2, K, null, null, this, 12) == coroutineSingletons) {
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
        @mvg(c = "com.yandex.go.ai_widget.ui.component.AiWidgetEvaluationSwipeState$onButtonPress$1$1$2", f = "AiWidgetEvaluationSwipeState.kt", l = {HProv.PP_BIO_STATISTICA_LEN}, m = "invokeSuspend", v = 2)
        /* renamed from: com.yandex.go.ai_widget.ui.component.AiWidgetEvaluationSwipeState$onButtonPress$1$1$2, reason: invalid class name */
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
                    androidx.compose.animation.core.a aVar = this.this$0.g;
                    Float f = new Float(1.0f);
                    ck11 K = sb2.K(200, 0, null, 6);
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
        public AnonymousClass1(b bVar, AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$direction = aiWidgetEvaluationSwipeDirection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$direction, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
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
            tje.N(tseVar, null, null, new C00401(this.this$0, this.$direction, null), 3);
            tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, null), 3);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiWidgetEvaluationSwipeState$onButtonPress$1(b bVar, AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$direction = aiWidgetEvaluationSwipeDirection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiWidgetEvaluationSwipeState$onButtonPress$1(this.this$0, this.$direction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AiWidgetEvaluationSwipeState$onButtonPress$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$direction, null);
            this.label = 1;
            if (bvf0.n(anonymousClass1, this) == coroutineSingletons) {
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
