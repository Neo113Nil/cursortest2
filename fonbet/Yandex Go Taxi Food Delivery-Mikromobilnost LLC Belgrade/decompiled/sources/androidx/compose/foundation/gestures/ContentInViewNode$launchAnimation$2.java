package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.clp0;
import defpackage.f89;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sb0;
import defpackage.tse;
import defpackage.vk6;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", l = {212}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class ContentInViewNode$launchAnimation$2 extends SuspendLambda implements wls {
    final /* synthetic */ b0 $animationState;
    final /* synthetic */ vk6 $bringIntoViewSpec;
    final /* synthetic */ long $viewportAdjustmentForReverseScroll;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lclp0;", "Lzy11;", "<anonymous>", "(Lclp0;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", l = {219}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ l8x $animationJob;
        final /* synthetic */ b0 $animationState;
        final /* synthetic */ vk6 $bringIntoViewSpec;
        final /* synthetic */ long $viewportAdjustmentForReverseScroll;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b0 b0Var, f fVar, vk6 vk6Var, long j, l8x l8xVar, Continuation continuation) {
            super(2, continuation);
            this.$animationState = b0Var;
            this.this$0 = fVar;
            this.$bringIntoViewSpec = vk6Var;
            this.$viewportAdjustmentForReverseScroll = j;
            this.$animationJob = l8xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, this.this$0, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, this.$animationJob, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((clp0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                clp0 clp0Var = (clp0) this.L$0;
                this.$animationState.e = f.E0(this.this$0, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll);
                b0 b0Var = this.$animationState;
                f fVar = this.this$0;
                f89 f89Var = new f89(fVar, b0Var, this.$animationJob, clp0Var);
                sb0 sb0Var = new sb0(20, fVar, b0Var, this.$bringIntoViewSpec);
                this.label = 1;
                if (b0Var.a(f89Var, sb0Var, this) == coroutineSingletons) {
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
    public ContentInViewNode$launchAnimation$2(f fVar, b0 b0Var, vk6 vk6Var, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$animationState = b0Var;
        this.$bringIntoViewSpec = vk6Var;
        this.$viewportAdjustmentForReverseScroll = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new ContentInViewNode$launchAnimation$2(this.this$0, this.$animationState, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, continuation);
        contentInViewNode$launchAnimation$2.L$0 = obj;
        return contentInViewNode$launchAnimation$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ContentInViewNode$launchAnimation$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        CancellationException cancellationException = null;
        try {
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    l8x n = kotlinx.coroutines.a.n(((tse) this.L$0).getCoroutineContext());
                    f fVar = this.this$0;
                    fVar.B = true;
                    y yVar = fVar.b;
                    MutatePriority mutatePriority = MutatePriority.Default;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, fVar, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, n, null);
                    this.label = 1;
                    if (yVar.f(mutatePriority, anonymousClass1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                this.this$0.y.b();
                f fVar2 = this.this$0;
                fVar2.B = false;
                fVar2.y.a(null);
                this.this$0.z = false;
                return zy11.a;
            } catch (CancellationException e) {
                cancellationException = e;
                throw cancellationException;
            }
        } catch (Throwable th) {
            f fVar3 = this.this$0;
            fVar3.B = false;
            fVar3.y.a(cancellationException);
            this.this$0.z = false;
            throw th;
        }
    }
}
