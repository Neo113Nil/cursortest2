package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.dvw;
import defpackage.g6u;
import defpackage.gtq0;
import defpackage.j18;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {83}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements wls {
    final /* synthetic */ wls $block;
    final /* synthetic */ Lifecycle.State $state;
    final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {161}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ tse $$this$coroutineScope;
        final /* synthetic */ wls $block;
        final /* synthetic */ Lifecycle.State $state;
        final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, tse tseVar, wls wlsVar, Continuation continuation) {
            super(2, continuation);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$$this$coroutineScope = tseVar;
            this.$block = wlsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:25:? A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r5v1, types: [T, androidx.lifecycle.a0, oey] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ref$ObjectRef ref$ObjectRef;
            Throwable th;
            Ref$ObjectRef ref$ObjectRef2;
            l8x l8xVar;
            q qVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i == 0) {
                kotlin.b.b(obj);
                if (this.$this_repeatOnLifecycle.b() != Lifecycle.State.DESTROYED) {
                    Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                    ref$ObjectRef = new Ref$ObjectRef();
                    try {
                        Lifecycle.State state = this.$state;
                        Lifecycle lifecycle = this.$this_repeatOnLifecycle;
                        tse tseVar = this.$$this$coroutineScope;
                        wls wlsVar = this.$block;
                        this.L$0 = ref$ObjectRef3;
                        this.L$1 = ref$ObjectRef;
                        this.L$2 = state;
                        this.L$3 = lifecycle;
                        this.L$4 = tseVar;
                        this.L$5 = wlsVar;
                        this.label = 1;
                        j18 j18Var = new j18(1, dvw.b(this));
                        j18Var.u();
                        Lifecycle.Event.Companion.getClass();
                        ?? a0Var = new a0(l.c(state), ref$ObjectRef3, tseVar, l.a(state), j18Var, gtq0.a(), wlsVar);
                        ref$ObjectRef.element = a0Var;
                        lifecycle.a(a0Var);
                        if (j18Var.s() == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef2 = ref$ObjectRef3;
                    } catch (Throwable th2) {
                        th = th2;
                        ref$ObjectRef2 = ref$ObjectRef3;
                        l8xVar = (l8x) ref$ObjectRef2.element;
                        if (l8xVar != null) {
                            l8xVar.a(null);
                        }
                        qVar = (q) ref$ObjectRef.element;
                        if (qVar != null) {
                            throw th;
                        }
                        this.$this_repeatOnLifecycle.d(qVar);
                        throw th;
                    }
                }
                return zy11Var;
            }
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$ObjectRef = (Ref$ObjectRef) this.L$1;
            ref$ObjectRef2 = (Ref$ObjectRef) this.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th3) {
                th = th3;
                l8xVar = (l8x) ref$ObjectRef2.element;
                if (l8xVar != null) {
                }
                qVar = (q) ref$ObjectRef.element;
                if (qVar != null) {
                }
            }
            l8x l8xVar2 = (l8x) ref$ObjectRef2.element;
            if (l8xVar2 != null) {
                l8xVar2.a(null);
            }
            q qVar2 = (q) ref$ObjectRef.element;
            if (qVar2 != null) {
                this.$this_repeatOnLifecycle.d(qVar2);
            }
            return zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$this_repeatOnLifecycle = lifecycle;
        this.$state = state;
        this.$block = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$this_repeatOnLifecycle, this.$state, this.$block, continuation);
        repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tse tseVar = (tse) this.L$0;
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a.x;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, tseVar, this.$block, null);
            this.label = 1;
            if (tje.k0(g6uVar, anonymousClass1, this) == coroutineSingletons) {
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
