package xsna;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;
import xsna.ckp0;

/* compiled from: Transformable.kt */
/* loaded from: classes11.dex */
public final class ykp0 implements PointerInputEventHandler {
    public final /* synthetic */ xkp0 a;

    /* compiled from: Transformable.kt */
    @b6l(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1", f = "Transformable.kt", l = {199}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ dmb0 $this_SuspendingPointerInputModifierNode;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ xkp0 this$0;

        /* compiled from: Transformable.kt */
        @b6l(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1", f = "Transformable.kt", l = {177, 180}, m = "invokeSuspend", v = 1)
        /* renamed from: xsna.ykp0$a$a, reason: collision with other inner class name */
        public static final class C4108a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ xkp0 this$0;

            /* compiled from: Transformable.kt */
            @b6l(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1", f = "Transformable.kt", l = {190}, m = "invokeSuspend", v = 1)
            /* renamed from: xsna.ykp0$a$a$a, reason: collision with other inner class name */
            public static final class C4109a extends SuspendLambda implements wzs<mkp0, spj<? super s3q0>, Object> {
                final /* synthetic */ Ref$ObjectRef<ckp0> $event;
                private /* synthetic */ Object L$0;
                Object L$1;
                int label;
                final /* synthetic */ xkp0 this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4109a(Ref$ObjectRef<ckp0> ref$ObjectRef, xkp0 xkp0Var, spj<? super C4109a> spjVar) {
                    super(2, spjVar);
                    this.$event = ref$ObjectRef;
                    this.this$0 = xkp0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                    C4109a c4109a = new C4109a(this.$event, this.this$0, spjVar);
                    c4109a.L$0 = obj;
                    return c4109a;
                }

                @Override // xsna.wzs
                public final Object invoke(mkp0 mkp0Var, spj<? super s3q0> spjVar) {
                    return ((C4109a) create(mkp0Var, spjVar)).invokeSuspend(s3q0.a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0052 -> B:5:0x0055). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    mkp0 mkp0Var;
                    ckp0 ckp0Var;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        kotlin.a.a(obj);
                        mkp0Var = (mkp0) this.L$0;
                        ckp0Var = this.$event.element;
                        if (ckp0Var instanceof ckp0.c) {
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Ref$ObjectRef<ckp0> ref$ObjectRef = (Ref$ObjectRef) this.L$1;
                        mkp0Var = (mkp0) this.L$0;
                        kotlin.a.a(obj);
                        T t = obj;
                        ref$ObjectRef.element = t;
                        ckp0Var = this.$event.element;
                        if (ckp0Var instanceof ckp0.c) {
                            return s3q0.a;
                        }
                        ckp0.a aVar = ckp0Var instanceof ckp0.a ? (ckp0.a) ckp0Var : null;
                        if (aVar != null) {
                            mkp0Var.b(aVar.a, aVar.c, aVar.b, aVar.d);
                        }
                        ref$ObjectRef = this.$event;
                        nm8 nm8Var = this.this$0.v;
                        this.L$0 = mkp0Var;
                        this.L$1 = ref$ObjectRef;
                        this.label = 1;
                        Object a = nm8Var.a(this);
                        t = a;
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef.element = t;
                        ckp0Var = this.$event.element;
                        if (ckp0Var instanceof ckp0.c) {
                        }
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4108a(xkp0 xkp0Var, spj<? super C4108a> spjVar) {
                super(2, spjVar);
                this.this$0 = xkp0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                C4108a c4108a = new C4108a(this.this$0, spjVar);
                c4108a.L$0 = obj;
                return c4108a;
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C4108a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
            
                if (r1.a(r6, r7, r9) == r0) goto L23;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0078 -> B:9:0x0034). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                yvj yvjVar;
                T t;
                yvj yvjVar2;
                Ref$ObjectRef ref$ObjectRef;
                Ref$ObjectRef ref$ObjectRef2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    yvjVar = (yvj) this.L$0;
                } else if (i == 1) {
                    ref$ObjectRef2 = (Ref$ObjectRef) this.L$2;
                    ref$ObjectRef = (Ref$ObjectRef) this.L$1;
                    yvjVar2 = (yvj) this.L$0;
                    kotlin.a.a(obj);
                    t = obj;
                    ref$ObjectRef2.element = t;
                    if (ref$ObjectRef.element instanceof ckp0.b) {
                        xkp0 xkp0Var = this.this$0;
                        alp0 alp0Var = xkp0Var.r;
                        MutatePriority mutatePriority = MutatePriority.UserInput;
                        C4109a c4109a = new C4109a(ref$ObjectRef, xkp0Var, null);
                        this.L$0 = yvjVar2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 2;
                    }
                    yvjVar = yvjVar2;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yvj yvjVar3 = (yvj) this.L$0;
                    try {
                        kotlin.a.a(obj);
                    } catch (CancellationException unused) {
                    }
                    yvjVar = yvjVar3;
                }
                if (!zvj.f(yvjVar)) {
                    ref$ObjectRef2 = new Ref$ObjectRef();
                    nm8 nm8Var = this.this$0.v;
                    this.L$0 = yvjVar;
                    this.L$1 = ref$ObjectRef2;
                    this.L$2 = ref$ObjectRef2;
                    this.label = 1;
                    Object a = nm8Var.a(this);
                    if (a != coroutineSingletons) {
                        yvjVar2 = yvjVar;
                        t = a;
                        ref$ObjectRef = ref$ObjectRef2;
                        ref$ObjectRef2.element = t;
                        if (ref$ObjectRef.element instanceof ckp0.b) {
                        }
                        yvjVar = yvjVar2;
                        if (!zvj.f(yvjVar)) {
                            return s3q0.a;
                        }
                    }
                    return coroutineSingletons;
                }
            }
        }

        /* compiled from: Transformable.kt */
        @b6l(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2", f = "Transformable.kt", l = {201}, m = "invokeSuspend", v = 1)
        public static final class b extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
            final /* synthetic */ yvj $$this$coroutineScope;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ xkp0 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(xkp0 xkp0Var, yvj yvjVar, spj<? super b> spjVar) {
                super(2, spjVar);
                this.this$0 = xkp0Var;
                this.$$this$coroutineScope = yvjVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                b bVar = new b(this.this$0, this.$$this$coroutineScope, spjVar);
                bVar.L$0 = obj;
                return bVar;
            }

            @Override // xsna.wzs
            public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
                return ((b) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                ckp0.c cVar = ckp0.c.a;
                try {
                    try {
                        if (i == 0) {
                            kotlin.a.a(obj);
                            eu5 eu5Var = (eu5) this.L$0;
                            xkp0 xkp0Var = this.this$0;
                            xkp0Var.getClass();
                            nm8 nm8Var = xkp0Var.v;
                            gj80 gj80Var = xkp0Var.u;
                            this.label = 1;
                            if (wkp0.d(eu5Var, nm8Var, gj80Var, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(obj);
                        }
                    } catch (CancellationException e) {
                        if (!zvj.f(this.$$this$coroutineScope)) {
                            throw e;
                        }
                    }
                    return s3q0.a;
                } finally {
                    this.this$0.v.f(cVar);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dmb0 dmb0Var, xkp0 xkp0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$this_SuspendingPointerInputModifierNode = dmb0Var;
            this.this$0 = xkp0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$this_SuspendingPointerInputModifierNode, this.this$0, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                yvj yvjVar = (yvj) this.L$0;
                myc0.h(yvjVar, null, CoroutineStart.UNDISPATCHED, new C4108a(this.this$0, null), 1);
                dmb0 dmb0Var = this.$this_SuspendingPointerInputModifierNode;
                b bVar = new b(this.this$0, yvjVar, null);
                this.label = 1;
                if (d7s.c(dmb0Var, bVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public ykp0(xkp0 xkp0Var) {
        this.a = xkp0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        xkp0 xkp0Var = this.a;
        if (!xkp0Var.t) {
            return s3q0.a;
        }
        Object d = zvj.d(new a(dmb0Var, xkp0Var, null), spjVar);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : s3q0.a;
    }
}
