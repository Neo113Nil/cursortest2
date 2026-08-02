package androidx.compose.foundation.text.input.internal;

import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class CursorAnimationState$snapToVisibleAndAnimate$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", l = {72, HProv.ALG_SID_SHA3_224, HProv.ALG_SID_SHA3_384, 81}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ l8x $oldJob;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l8x l8xVar, b bVar, Continuation continuation) {
            super(2, continuation);
            this.$oldJob = l8xVar;
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$oldJob, this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
        
            if (kotlinx.coroutines.a.i(500, r10) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x003d, code lost:
        
            if (kotlinx.coroutines.a.f(r11, r10) == r0) goto L35;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0072 -> B:9:0x0075). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    l8x l8xVar = this.$oldJob;
                    if (l8xVar != null) {
                        this.label = 1;
                    }
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        throw new KotlinNothingValueException();
                    }
                    if (i == 3) {
                        kotlin.b.b(obj);
                        this.this$0.c.setFloatValue(0.0f);
                        this.label = 4;
                    } else {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        this.this$0.c.setFloatValue(1.0f);
                        this.label = 3;
                        if (kotlinx.coroutines.a.i(500L, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        this.this$0.c.setFloatValue(0.0f);
                        this.label = 4;
                    }
                }
                this.this$0.c.setFloatValue(1.0f);
                if (!this.this$0.a) {
                    this.label = 2;
                    if (kotlinx.coroutines.a.d(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    throw new KotlinNothingValueException();
                }
                this.label = 3;
                if (kotlinx.coroutines.a.i(500L, this) == coroutineSingletons) {
                }
                this.this$0.c.setFloatValue(0.0f);
                this.label = 4;
            } catch (Throwable th) {
                this.this$0.c.setFloatValue(0.0f);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CursorAnimationState$snapToVisibleAndAnimate$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CursorAnimationState$snapToVisibleAndAnimate$2 cursorAnimationState$snapToVisibleAndAnimate$2 = new CursorAnimationState$snapToVisibleAndAnimate$2(this.this$0, continuation);
        cursorAnimationState$snapToVisibleAndAnimate$2.L$0 = obj;
        return cursorAnimationState$snapToVisibleAndAnimate$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CursorAnimationState$snapToVisibleAndAnimate$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tse tseVar = (tse) this.L$0;
        l8x l8xVar = (l8x) this.this$0.b.getAndSet(null);
        b bVar = this.this$0;
        AtomicReference atomicReference = bVar.b;
        pzt0 N = tje.N(tseVar, null, null, new AnonymousClass1(l8xVar, bVar, null), 3);
        while (true) {
            if (atomicReference.compareAndSet(null, N)) {
                z = true;
                break;
            }
            if (atomicReference.get() != null) {
                z = false;
                break;
            }
        }
        return Boolean.valueOf(z);
    }
}
