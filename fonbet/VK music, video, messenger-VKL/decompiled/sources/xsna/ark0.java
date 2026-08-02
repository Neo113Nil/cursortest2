package xsna;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.SharingCommand;

/* compiled from: SharingStarted.kt */
/* loaded from: classes8.dex */
public final class ark0 implements hcj0 {

    /* compiled from: SharingStarted.kt */
    @b6l(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {151}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<lsr<? super SharingCommand>, spj<? super s3q0>, Object> {
        final /* synthetic */ ttk0<Integer> $subscriptionCount;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: SharingStarted.kt */
        /* renamed from: xsna.ark0$a$a, reason: collision with other inner class name */
        public static final class C2565a<T> implements lsr {
            public final /* synthetic */ Ref$BooleanRef b;
            public final /* synthetic */ lsr<SharingCommand> c;

            /* compiled from: SharingStarted.kt */
            @b6l(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {154}, m = "emit")
            /* renamed from: xsna.ark0$a$a$a, reason: collision with other inner class name */
            public static final class C2566a extends ContinuationImpl {
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C2565a<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C2566a(C2565a<? super T> c2565a, spj<? super C2566a> spjVar) {
                    super(spjVar);
                    this.this$0 = c2565a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C2565a(Ref$BooleanRef ref$BooleanRef, lsr<? super SharingCommand> lsrVar) {
                this.b = ref$BooleanRef;
                this.c = lsrVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object a(int i, spj<? super s3q0> spjVar) {
                C2566a c2566a;
                int i2;
                if (spjVar instanceof C2566a) {
                    c2566a = (C2566a) spjVar;
                    int i3 = c2566a.label;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c2566a.label = i3 - Integer.MIN_VALUE;
                        Object obj = c2566a.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = c2566a.label;
                        if (i2 != 0) {
                            kotlin.a.a(obj);
                            if (i > 0) {
                                Ref$BooleanRef ref$BooleanRef = this.b;
                                if (!ref$BooleanRef.element) {
                                    ref$BooleanRef.element = true;
                                    SharingCommand sharingCommand = SharingCommand.START;
                                    c2566a.label = 1;
                                    if (this.c.emit(sharingCommand, c2566a) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            }
                            return s3q0.a;
                        }
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                }
                c2566a = new C2566a(this, spjVar);
                Object obj2 = c2566a.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = c2566a.label;
                if (i2 != 0) {
                }
                return s3q0.a;
            }

            @Override // xsna.lsr
            public final /* bridge */ /* synthetic */ Object emit(Object obj, spj spjVar) {
                return a(((Number) obj).intValue(), spjVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ttk0<Integer> ttk0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$subscriptionCount = ttk0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$subscriptionCount, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(lsr<? super SharingCommand> lsrVar, spj<? super s3q0> spjVar) {
            return ((a) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                lsr lsrVar = (lsr) this.L$0;
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                ttk0<Integer> ttk0Var = this.$subscriptionCount;
                C2565a c2565a = new C2565a(ref$BooleanRef, lsrVar);
                this.label = 1;
                if (ttk0Var.collect(c2565a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // xsna.hcj0
    public final ksr<SharingCommand> i(ttk0<Integer> ttk0Var) {
        return new izg0(new a(ttk0Var, null));
    }

    public final String toString() {
        return "SharingStarted.Lazily";
    }
}
