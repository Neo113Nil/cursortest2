package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.z;
import androidx.compose.material3.a0;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import defpackage.bvf0;
import defpackage.hwd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.svz0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zvd0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1", f = "BasicTooltip.kt", l = {217}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class BasicTooltipKt$handleGestures$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ svz0 $state;
    final /* synthetic */ hwd0 $this_pointerInput;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1", f = "BasicTooltip.kt", l = {224, 230, 252}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends RestrictedSuspendLambda implements wls {
        final /* synthetic */ tse $$this$coroutineScope;
        final /* synthetic */ svz0 $state;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzvd0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)Lzvd0;"}, k = 3, mv = {2, 0, 0})
        @mvg(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$1", f = "BasicTooltip.kt", l = {231}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00031 extends RestrictedSuspendLambda implements wls {
            final /* synthetic */ PointerEventPass $pass;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00031(PointerEventPass pointerEventPass, Continuation continuation) {
                super(2, continuation);
                this.$pass = pointerEventPass;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C00031 c00031 = new C00031(this.$pass, continuation);
                c00031.L$0 = obj;
                return c00031;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((C00031) create((androidx.compose.ui.input.pointer.f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return obj;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                androidx.compose.ui.input.pointer.f fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
                PointerEventPass pointerEventPass = this.$pass;
                this.label = 1;
                Object k = z.k(fVar, pointerEventPass, this);
                return k == coroutineSingletons ? coroutineSingletons : k;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
        @mvg(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3", f = "BasicTooltip.kt", l = {238, 241, 241}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3, reason: invalid class name */
        final class AnonymousClass3 extends SuspendLambda implements wls {
            final /* synthetic */ pz40 $isLongPressedFlow;
            final /* synthetic */ svz0 $state;
            Object L$0;
            int label;

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isLongPressed", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 0, 0})
            @mvg(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1", f = "BasicTooltip.kt", l = {}, m = "invokeSuspend", v = 1)
            /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1, reason: invalid class name and collision with other inner class name */
            final class C00041 extends SuspendLambda implements wls {
                final /* synthetic */ svz0 $state;
                /* synthetic */ boolean Z$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00041(svz0 svz0Var, Continuation continuation) {
                    super(2, continuation);
                    this.$state = svz0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    C00041 c00041 = new C00041(this.$state, continuation);
                    c00041.Z$0 = ((Boolean) obj).booleanValue();
                    return c00041;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    Boolean bool = (Boolean) obj;
                    bool.booleanValue();
                    C00041 c00041 = (C00041) create(bool, (Continuation) obj2);
                    zy11 zy11Var = zy11.a;
                    c00041.invokeSuspend(zy11Var);
                    return zy11Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    if (!this.Z$0) {
                        ((a0) this.$state).a();
                    }
                    return zy11.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(pz40 pz40Var, svz0 svz0Var, Continuation continuation) {
                super(2, continuation);
                this.$isLongPressedFlow = pz40Var;
                this.$state = svz0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass3(this.$isLongPressedFlow, this.$state, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
            
                if (kotlinx.coroutines.flow.e.k(r7, r1, r6) == r0) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
            
                if (((androidx.compose.material3.a0) r7).c(r1, r6) == r0) goto L30;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Throwable th;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                try {
                } catch (Throwable th2) {
                    if (!((a0) this.$state).b()) {
                        throw th2;
                    }
                    pz40 pz40Var = this.$isLongPressedFlow;
                    C00041 c00041 = new C00041(this.$state, null);
                    this.L$0 = th2;
                    this.label = 3;
                    if (kotlinx.coroutines.flow.e.k(pz40Var, c00041, this) != coroutineSingletons) {
                        th = th2;
                    }
                    return coroutineSingletons;
                }
                if (i == 0) {
                    kotlin.b.b(obj);
                    pz40 pz40Var2 = this.$isLongPressedFlow;
                    Boolean bool = Boolean.TRUE;
                    r0 r0Var = (r0) pz40Var2;
                    r0Var.getClass();
                    r0Var.m(null, bool);
                    svz0 svz0Var = this.$state;
                    MutatePriority mutatePriority = MutatePriority.PreventUserInput;
                    this.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return zy11.a;
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = (Throwable) this.L$0;
                        kotlin.b.b(obj);
                        throw th;
                    }
                    kotlin.b.b(obj);
                }
                if (((a0) this.$state).b()) {
                    pz40 pz40Var3 = this.$isLongPressedFlow;
                    C00041 c000412 = new C00041(this.$state, null);
                    this.label = 2;
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

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x00cd A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #4 {all -> 0x0019, blocks: (B:8:0x0014, B:9:0x00c9, B:11:0x00cd), top: B:7:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
        /* JADX WARN: Type inference failed for: r2v6, types: [pz40] */
        /* JADX WARN: Type inference failed for: r8v4, types: [pz40] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            r0 c;
            PointerEventPass pointerEventPass;
            long j;
            androidx.compose.ui.input.pointer.f fVar;
            r0 r0Var;
            pz40 pz40Var;
            zvd0 zvd0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                androidx.compose.ui.input.pointer.f fVar2 = (androidx.compose.ui.input.pointer.f) this.L$0;
                c = bvf0.c(Boolean.FALSE);
                long f = fVar2.g().f();
                pointerEventPass = PointerEventPass.Initial;
                this.L$0 = fVar2;
                this.L$1 = c;
                this.L$2 = pointerEventPass;
                this.J$0 = f;
                this.label = 1;
                Object b = z.b(fVar2, pointerEventPass, this, 1);
                if (b != coroutineSingletons) {
                    j = f;
                    fVar = fVar2;
                    obj = b;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pz40Var = (pz40) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        zvd0Var = (zvd0) obj;
                        if (zvd0Var != null) {
                            zvd0Var.a();
                        }
                        Boolean bool = Boolean.FALSE;
                        r0 r0Var2 = (r0) pz40Var;
                        r0Var2.getClass();
                        r0Var2.m(null, bool);
                        return zy11.a;
                    } catch (Throwable th) {
                        th = th;
                        Boolean bool2 = Boolean.FALSE;
                        r0 r0Var3 = (r0) pz40Var;
                        r0Var3.getClass();
                        r0Var3.m(null, bool2);
                        throw th;
                    }
                }
                PointerEventPass pointerEventPass2 = (PointerEventPass) this.L$2;
                ?? r2 = (pz40) this.L$1;
                fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
                try {
                    kotlin.b.b(obj);
                    r0Var = r2;
                    Boolean bool3 = Boolean.FALSE;
                    r0 r0Var4 = r0Var;
                    r0Var4.getClass();
                    r0Var4.m(null, bool3);
                } catch (PointerEventTimeoutCancellationException unused) {
                    pointerEventPass = pointerEventPass2;
                    c = r2;
                    tje.N(this.$$this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass3(c, this.$state, null), 1);
                    this.L$0 = c;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    obj = z.k(fVar, pointerEventPass, this);
                    if (obj != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                } catch (Throwable th2) {
                    th = th2;
                    pz40Var = r2;
                    Boolean bool22 = Boolean.FALSE;
                    r0 r0Var32 = (r0) pz40Var;
                    r0Var32.getClass();
                    r0Var32.m(null, bool22);
                    throw th;
                }
                return zy11.a;
            }
            long j2 = this.J$0;
            PointerEventPass pointerEventPass3 = (PointerEventPass) this.L$2;
            ?? r8 = (pz40) this.L$1;
            androidx.compose.ui.input.pointer.f fVar3 = (androidx.compose.ui.input.pointer.f) this.L$0;
            kotlin.b.b(obj);
            pointerEventPass = pointerEventPass3;
            c = r8;
            j = j2;
            fVar = fVar3;
            long j3 = j;
            int i2 = ((zvd0) obj).i;
            if (i2 == 1 || i2 == 3) {
                try {
                    try {
                        C00031 c00031 = new C00031(pointerEventPass, null);
                        this.L$0 = fVar;
                        this.L$1 = c;
                        this.L$2 = pointerEventPass;
                        this.label = 2;
                        if (fVar.o(j3, c00031, this) != coroutineSingletons) {
                            r0Var = c;
                            Boolean bool32 = Boolean.FALSE;
                            r0 r0Var42 = r0Var;
                            r0Var42.getClass();
                            r0Var42.m(null, bool32);
                        }
                    } catch (PointerEventTimeoutCancellationException unused2) {
                        tje.N(this.$$this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass3(c, this.$state, null), 1);
                        this.L$0 = c;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 3;
                        obj = z.k(fVar, pointerEventPass, this);
                        if (obj != coroutineSingletons) {
                            pz40Var = c;
                            zvd0Var = (zvd0) obj;
                            if (zvd0Var != null) {
                            }
                            Boolean bool4 = Boolean.FALSE;
                            r0 r0Var22 = (r0) pz40Var;
                            r0Var22.getClass();
                            r0Var22.m(null, bool4);
                            return zy11.a;
                        }
                        return coroutineSingletons;
                    }
                    return coroutineSingletons;
                } catch (Throwable th3) {
                    th = th3;
                    pz40Var = c;
                    Boolean bool222 = Boolean.FALSE;
                    r0 r0Var322 = (r0) pz40Var;
                    r0Var322.getClass();
                    r0Var322.m(null, bool222);
                    throw th;
                }
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$handleGestures$1$1(hwd0 hwd0Var, svz0 svz0Var, Continuation continuation) {
        super(2, continuation);
        this.$this_pointerInput = hwd0Var;
        this.$state = svz0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BasicTooltipKt$handleGestures$1$1 basicTooltipKt$handleGestures$1$1 = new BasicTooltipKt$handleGestures$1$1(this.$this_pointerInput, this.$state, continuation);
        basicTooltipKt$handleGestures$1$1.L$0 = obj;
        return basicTooltipKt$handleGestures$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BasicTooltipKt$handleGestures$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
            if (androidx.compose.foundation.gestures.c.l(hwd0Var, anonymousClass1, this) == coroutineSingletons) {
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
