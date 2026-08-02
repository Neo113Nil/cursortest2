package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: LongPressTextDragObserver.kt */
/* loaded from: classes11.dex */
public final class m500 {

    /* compiled from: LongPressTextDragObserver.kt */
    @b6l(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super eyx>, Object> {
        final /* synthetic */ zdo0 $observer;
        final /* synthetic */ dmb0 $this_detectDownAndDragGesturesWithObserver;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: LongPressTextDragObserver.kt */
        @b6l(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", l = {67}, m = "invokeSuspend", v = 1)
        /* renamed from: xsna.m500$a$a, reason: collision with other inner class name */
        public static final class C3322a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ zdo0 $observer;
            final /* synthetic */ dmb0 $this_detectDownAndDragGesturesWithObserver;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3322a(dmb0 dmb0Var, zdo0 zdo0Var, spj<? super C3322a> spjVar) {
                super(2, spjVar);
                this.$this_detectDownAndDragGesturesWithObserver = dmb0Var;
                this.$observer = zdo0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C3322a(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C3322a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    dmb0 dmb0Var = this.$this_detectDownAndDragGesturesWithObserver;
                    zdo0 zdo0Var = this.$observer;
                    this.label = 1;
                    Object c = d7s.c(dmb0Var, new n500(zdo0Var, null), this);
                    if (c != obj2) {
                        c = s3q0.a;
                    }
                    if (c == obj2) {
                        return obj2;
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

        /* compiled from: LongPressTextDragObserver.kt */
        @b6l(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", l = {68}, m = "invokeSuspend", v = 1)
        public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ zdo0 $observer;
            final /* synthetic */ dmb0 $this_detectDownAndDragGesturesWithObserver;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(dmb0 dmb0Var, zdo0 zdo0Var, spj<? super b> spjVar) {
                super(2, spjVar);
                this.$this_detectDownAndDragGesturesWithObserver = dmb0Var;
                this.$observer = zdo0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new b(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    dmb0 dmb0Var = this.$this_detectDownAndDragGesturesWithObserver;
                    zdo0 zdo0Var = this.$observer;
                    this.label = 1;
                    Object f = lgo.f(dmb0Var, new pwk(zdo0Var, 29), new l500(zdo0Var, 0), new jrh(zdo0Var, 22), new o85(zdo0Var, 7), this);
                    if (f != obj2) {
                        f = s3q0.a;
                    }
                    if (f == obj2) {
                        return obj2;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dmb0 dmb0Var, zdo0 zdo0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$this_detectDownAndDragGesturesWithObserver = dmb0Var;
            this.$observer = zdo0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super eyx> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) this.L$0;
            CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
            myc0.h(yvjVar, null, coroutineStart, new C3322a(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 1);
            return myc0.h(yvjVar, null, coroutineStart, new b(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 1);
        }
    }

    public static final Object a(dmb0 dmb0Var, zdo0 zdo0Var, spj<? super s3q0> spjVar) {
        Object d = zvj.d(new a(dmb0Var, zdo0Var, null), spjVar);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : s3q0.a;
    }
}
