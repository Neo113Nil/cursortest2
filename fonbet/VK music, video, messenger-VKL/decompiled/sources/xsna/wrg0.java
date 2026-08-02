package xsna;

import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: RunBlockingUninterruptible.android.kt */
/* loaded from: classes.dex */
public final class wrg0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: RunBlockingUninterruptible.android.kt */
    @b6l(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", f = "RunBlockingUninterruptible.android.kt", l = {}, m = "invokeSuspend")
    public static final class a<T> extends SuspendLambda implements wzs<yvj, spj<? super T>, Object> {
        final /* synthetic */ wzs<yvj, spj<? super T>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: RunBlockingUninterruptible.android.kt */
        @b6l(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", f = "RunBlockingUninterruptible.android.kt", l = {52}, m = "invokeSuspend")
        /* renamed from: xsna.wrg0$a$a, reason: collision with other inner class name */
        public static final class C3955a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ wzs<yvj, spj<? super T>, Object> $block;
            final /* synthetic */ n7i<T> $deferred;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3955a(n7i<T> n7iVar, wzs<? super yvj, ? super spj<? super T>, ? extends Object> wzsVar, spj<? super C3955a> spjVar) {
                super(2, spjVar);
                this.$deferred = n7iVar;
                this.$block = wzsVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                C3955a c3955a = new C3955a(this.$deferred, this.$block, spjVar);
                c3955a.L$0 = obj;
                return c3955a;
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C3955a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                n7i<T> n7iVar;
                n7i n7iVar2;
                Throwable a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    yvj yvjVar = (yvj) this.L$0;
                    n7i<T> n7iVar3 = this.$deferred;
                    wzs<yvj, spj<? super T>, Object> wzsVar = this.$block;
                    try {
                        this.L$0 = n7iVar3;
                        this.label = 1;
                        obj = wzsVar.invoke(yvjVar, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        n7iVar2 = n7iVar3;
                    } catch (Throwable th) {
                        th = th;
                        n7iVar = n7iVar3;
                        obj = new Result.Failure(th);
                        n7iVar2 = n7iVar;
                        a = Result.a(obj);
                        if (a == null) {
                        }
                        return s3q0.a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n7iVar = (n7i) this.L$0;
                    try {
                        kotlin.a.a(obj);
                        n7iVar2 = n7iVar;
                    } catch (Throwable th2) {
                        th = th2;
                        obj = new Result.Failure(th);
                        n7iVar2 = n7iVar;
                        a = Result.a(obj);
                        if (a == null) {
                        }
                        return s3q0.a;
                    }
                }
                a = Result.a(obj);
                if (a == null) {
                    n7iVar2.h(obj);
                } else {
                    n7iVar2.A(a);
                }
                return s3q0.a;
            }
        }

        /* compiled from: RunBlockingUninterruptible.android.kt */
        @b6l(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", f = "RunBlockingUninterruptible.android.kt", l = {58}, m = "invokeSuspend")
        /* loaded from: classes12.dex */
        public static final class b extends SuspendLambda implements wzs<yvj, spj<? super T>, Object> {
            final /* synthetic */ n7i<T> $deferred;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(n7i<T> n7iVar, spj<? super b> spjVar) {
                super(2, spjVar);
                this.$deferred = n7iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new b(this.$deferred, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, Object obj) {
                return ((b) create(yvjVar, (spj) obj)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return obj;
                }
                kotlin.a.a(obj);
                n7i<T> n7iVar = this.$deferred;
                this.label = 1;
                Object H = n7iVar.H(this);
                return H == coroutineSingletons ? coroutineSingletons : H;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(wzs<? super yvj, ? super spj<? super T>, ? extends Object> wzsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$block = wzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$block, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, Object obj) {
            return ((a) create(yvjVar, (spj) obj)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            kotlin.coroutines.c cVar = (kotlin.coroutines.c) ((yvj) this.L$0).getCoroutineContext().get(c.a.b);
            o7i a = p7i.a();
            myc0.g(q1u.b, cVar, CoroutineStart.UNDISPATCHED, new C3955a(a, this.$block, null));
            while (!a.m()) {
                try {
                    return myc0.i(cVar, new b(a, null));
                } catch (InterruptedException unused) {
                }
            }
            return a.X();
        }
    }

    public static final <T> T a(wzs<? super yvj, ? super spj<? super T>, ? extends Object> wzsVar) {
        Thread.interrupted();
        return (T) myc0.i(EmptyCoroutineContext.b, new a(wzsVar, null));
    }
}
