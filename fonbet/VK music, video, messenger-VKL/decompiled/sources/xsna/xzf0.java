package xsna;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Reorderable.kt */
/* loaded from: classes17.dex */
public final class xzf0 implements PointerInputEventHandler {
    public final /* synthetic */ d0g0<?> a;

    /* compiled from: Reorderable.kt */
    @b6l(c = "com.vk.core.compose.reorder.ReorderableKt$reorderable$1$1", f = "Reorderable.kt", l = {20, 21, 28}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<dmb0, spj<? super s3q0>, Object> {
        final /* synthetic */ d0g0<?> $state;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* compiled from: Reorderable.kt */
        @b6l(c = "com.vk.core.compose.reorder.ReorderableKt$reorderable$1$1$down$1", f = "Reorderable.kt", l = {}, m = "invokeSuspend")
        /* renamed from: xsna.xzf0$a$a, reason: collision with other inner class name */
        public static final class C4060a extends RestrictedSuspendLambda implements wzs<eu5, spj<? super xlb0>, Object> {
            final /* synthetic */ cqk0 $dragStart;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4060a(cqk0 cqk0Var, spj<? super C4060a> spjVar) {
                super(2, spjVar);
                this.$dragStart = cqk0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                C4060a c4060a = new C4060a(this.$dragStart, spjVar);
                c4060a.L$0 = obj;
                return c4060a;
            }

            @Override // xsna.wzs
            public final Object invoke(eu5 eu5Var, spj<? super xlb0> spjVar) {
                return ((C4060a) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                eu5 eu5Var = (eu5) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                List<xlb0> list = eu5Var.z0().a;
                cqk0 cqk0Var = this.$dragStart;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    xlb0 xlb0Var = list.get(i);
                    if (wlb0.g(xlb0Var.a, cqk0Var.a)) {
                        return xlb0Var;
                    }
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(spj spjVar, d0g0 d0g0Var) {
            super(2, spjVar);
            this.$state = d0g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(spjVar, this.$state);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
            return ((a) create(dmb0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00b3, code lost:
        
            if (r15 == r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00b5, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
        
            if (r15 == r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
        
            if (r15 == r1) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            cqk0 cqk0Var;
            dmb0 dmb0Var = (dmb0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                nm8 nm8Var = this.$state.h;
                this.L$0 = dmb0Var;
                this.label = 1;
                obj = nm8Var.a(this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    cqk0Var = (cqk0) this.L$1;
                    kotlin.a.a(obj);
                    xlb0 xlb0Var = (xlb0) obj;
                    if (xlb0Var != null) {
                        long j = xlb0Var.c;
                        if (this.$state.y((int) Float.intBitsToFloat((int) (j >> 32)), (int) Float.intBitsToFloat((int) (j & 4294967295L)))) {
                            cqk0Var.getClass();
                            long j2 = xlb0Var.a;
                            d0g0<?> d0g0Var = this.$state;
                            wm80 wm80Var = new wm80(d0g0Var, 12);
                            c950 c950Var = new c950(d0g0Var, 27);
                            ncb ncbVar = new ncb(d0g0Var, 15);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 3;
                            Object Z0 = dmb0Var.Z0(new wzf0(j2, wm80Var, c950Var, ncbVar, null), this);
                            if (Z0 != coroutineSingletons) {
                                Z0 = s3q0.a;
                            }
                        }
                    }
                    return s3q0.a;
                }
                kotlin.a.a(obj);
            }
            cqk0Var = (cqk0) obj;
            C4060a c4060a = new C4060a(cqk0Var, null);
            this.L$0 = dmb0Var;
            this.L$1 = cqk0Var;
            this.label = 2;
            obj = dmb0Var.Z0(c4060a, this);
        }
    }

    public xzf0(d0g0<?> d0g0Var) {
        this.a = d0g0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        Object d = d7s.d(dmb0Var, new a(null, this.a), spjVar);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : s3q0.a;
    }
}
