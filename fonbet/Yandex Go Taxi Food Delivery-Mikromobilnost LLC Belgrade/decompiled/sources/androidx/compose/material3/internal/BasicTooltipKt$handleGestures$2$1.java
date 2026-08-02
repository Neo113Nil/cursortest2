package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.a0;
import defpackage.hwd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.svz0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1", f = "BasicTooltip.kt", l = {263}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class BasicTooltipKt$handleGestures$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ svz0 $state;
    final /* synthetic */ hwd0 $this_pointerInput;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1", f = "BasicTooltip.kt", l = {267}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1, reason: invalid class name */
    final class AnonymousClass1 extends RestrictedSuspendLambda implements wls {
        final /* synthetic */ tse $$this$coroutineScope;
        final /* synthetic */ svz0 $state;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
        @mvg(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1", f = "BasicTooltip.kt", l = {272}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00051 extends SuspendLambda implements wls {
            final /* synthetic */ svz0 $state;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00051(svz0 svz0Var, Continuation continuation) {
                super(2, continuation);
                this.$state = svz0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C00051(this.$state, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((C00051) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.b.b(obj);
                    svz0 svz0Var = this.$state;
                    MutatePriority mutatePriority = MutatePriority.UserInput;
                    this.label = 1;
                    if (((a0) svz0Var).c(mutatePriority, this) == coroutineSingletons) {
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
        public AnonymousClass1(tse tseVar, svz0 svz0Var, Continuation continuation) {
            super(2, continuation);
            this.$$this$coroutineScope = tseVar;
            this.$state = svz0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$state, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((androidx.compose.ui.input.pointer.f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0030 -> B:5:0x0033). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r7.label
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 != r3) goto L16
                java.lang.Object r1 = r7.L$1
                androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.ui.input.pointer.PointerEventPass) r1
                java.lang.Object r4 = r7.L$0
                androidx.compose.ui.input.pointer.f r4 = (androidx.compose.ui.input.pointer.f) r4
                kotlin.b.b(r8)
                goto L33
            L16:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ny61.r(r7)
                return r2
            L1c:
                kotlin.b.b(r8)
                java.lang.Object r8 = r7.L$0
                androidx.compose.ui.input.pointer.f r8 = (androidx.compose.ui.input.pointer.f) r8
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Main
                r4 = r8
            L26:
                r7.L$0 = r4
                r7.L$1 = r1
                r7.label = r3
                java.lang.Object r8 = r4.a(r1, r7)
                if (r8 != r0) goto L33
                return r0
            L33:
                tvd0 r8 = (defpackage.tvd0) r8
                java.util.List r5 = r8.a
                r6 = 0
                java.lang.Object r5 = r5.get(r6)
                zvd0 r5 = (defpackage.zvd0) r5
                int r5 = r5.i
                r6 = 2
                if (r5 != r6) goto L26
                int r8 = r8.f
                r5 = 4
                if (r8 != r5) goto L56
                tse r8 = r7.$$this$coroutineScope
                androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1 r5 = new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1
                svz0 r6 = r7.$state
                r5.<init>(r6, r2)
                r6 = 3
                defpackage.tje.N(r8, r2, r2, r5, r6)
                goto L26
            L56:
                r5 = 5
                if (r8 != r5) goto L26
                svz0 r8 = r7.$state
                androidx.compose.material3.a0 r8 = (androidx.compose.material3.a0) r8
                r8.getClass()
                r8.a()
                goto L26
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$handleGestures$2$1(hwd0 hwd0Var, svz0 svz0Var, Continuation continuation) {
        super(2, continuation);
        this.$this_pointerInput = hwd0Var;
        this.$state = svz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BasicTooltipKt$handleGestures$2$1 basicTooltipKt$handleGestures$2$1 = new BasicTooltipKt$handleGestures$2$1(this.$this_pointerInput, this.$state, continuation);
        basicTooltipKt$handleGestures$2$1.L$0 = obj;
        return basicTooltipKt$handleGestures$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BasicTooltipKt$handleGestures$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tse tseVar = (tse) this.L$0;
            hwd0 hwd0Var = this.$this_pointerInput;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(tseVar, this.$state, null);
            this.label = 1;
            if (((androidx.compose.ui.input.pointer.g) hwd0Var).E0(anonymousClass1, this) == coroutineSingletons) {
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
