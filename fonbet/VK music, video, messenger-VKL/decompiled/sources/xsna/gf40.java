package xsna;

import com.vk.dto.music.Playlist;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MusicClearStorageInteractorImpl.kt */
@b6l(c = "com.vk.music.offline.impl.domain.interactor.MusicClearStorageInteractorImpl$clearDownloads$2", f = "MusicClearStorageInteractorImpl.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class gf40 extends SuspendLambda implements wzs<yvj, spj<? super ksr<? extends Long>>, Object> {
    int label;
    final /* synthetic */ if40 this$0;

    /* compiled from: MusicClearStorageInteractorImpl.kt */
    @b6l(c = "com.vk.music.offline.impl.domain.interactor.MusicClearStorageInteractorImpl$clearDownloads$2$1", f = "MusicClearStorageInteractorImpl.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super ksr<? extends Long>>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ if40 this$0;

        /* compiled from: MusicClearStorageInteractorImpl.kt */
        @b6l(c = "com.vk.music.offline.impl.domain.interactor.MusicClearStorageInteractorImpl$clearDownloads$2$1$1", f = "MusicClearStorageInteractorImpl.kt", l = {}, m = "invokeSuspend")
        /* renamed from: xsna.gf40$a$a, reason: collision with other inner class name */
        public static final class C2937a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            int label;
            final /* synthetic */ if40 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2937a(if40 if40Var, spj<? super C2937a> spjVar) {
                super(2, spjVar);
                this.this$0 = if40Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C2937a(this.this$0, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C2937a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                lq40 lq40Var = this.this$0.a;
                Iterator<T> it = lq40Var.j().iterator();
                while (it.hasNext()) {
                    lq40Var.G((Playlist) it.next(), false);
                }
                return s3q0.a;
            }
        }

        /* compiled from: MusicClearStorageInteractorImpl.kt */
        @b6l(c = "com.vk.music.offline.impl.domain.interactor.MusicClearStorageInteractorImpl$clearDownloads$2$1$2", f = "MusicClearStorageInteractorImpl.kt", l = {41}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            int label;
            final /* synthetic */ if40 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(if40 if40Var, spj<? super b> spjVar) {
                super(2, spjVar);
                this.this$0 = if40Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new b(this.this$0, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    if40 if40Var = this.this$0;
                    this.label = 1;
                    if40Var.getClass();
                    gzg0 gzg0Var = new gzg0(s7s0.c(this));
                    if40Var.a.W(new Playlist(-1, null, 0, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, false, 0, 0, 0L, null, null, null, null, null, false, false, false, null, null, null, 0, false, null, null, false, null, 0, -2, 255, null), new icz(gzg0Var, 1));
                    Object a = gzg0Var.a();
                    if (a != coroutineSingletons) {
                        a = s3q0.a;
                    }
                    if (a == coroutineSingletons) {
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

        /* compiled from: MusicClearStorageInteractorImpl.kt */
        @b6l(c = "com.vk.music.offline.impl.domain.interactor.MusicClearStorageInteractorImpl$clearDownloads$2$1$3", f = "MusicClearStorageInteractorImpl.kt", l = {42}, m = "invokeSuspend")
        public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            int label;
            final /* synthetic */ if40 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(if40 if40Var, spj<? super c> spjVar) {
                super(2, spjVar);
                this.this$0 = if40Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new c(this.this$0, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    if40 if40Var = this.this$0;
                    this.label = 1;
                    Object c = if40.c(if40Var.a.B(), this);
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

        /* compiled from: MusicClearStorageInteractorImpl.kt */
        @b6l(c = "com.vk.music.offline.impl.domain.interactor.MusicClearStorageInteractorImpl$clearDownloads$2$1$4", f = "MusicClearStorageInteractorImpl.kt", l = {43}, m = "invokeSuspend")
        public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            int label;
            final /* synthetic */ if40 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(if40 if40Var, spj<? super d> spjVar) {
                super(2, spjVar);
                this.this$0 = if40Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new d(this.this$0, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    if40 if40Var = this.this$0;
                    this.label = 1;
                    Object c = if40.c(if40Var.a.t(), this);
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

        /* compiled from: MusicClearStorageInteractorImpl.kt */
        @b6l(c = "com.vk.music.offline.impl.domain.interactor.MusicClearStorageInteractorImpl$clearDownloads$2$1$5", f = "MusicClearStorageInteractorImpl.kt", l = {44}, m = "invokeSuspend")
        public static final class e extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            int label;
            final /* synthetic */ if40 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(if40 if40Var, spj<? super e> spjVar) {
                super(2, spjVar);
                this.this$0 = if40Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new e(this.this$0, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((e) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    if40 if40Var = this.this$0;
                    this.label = 1;
                    io.reactivex.rxjava3.core.x<List<String>> i2 = if40Var.b.i(String.valueOf(((b25) if40Var.e.getValue()).c().b));
                    v34 v34Var = new v34(new ayo(if40Var, 22), 13);
                    i2.getClass();
                    Object c = if40.c(new io.reactivex.rxjava3.internal.operators.single.s(i2, v34Var), this);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(if40 if40Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = if40Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.this$0, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super ksr<? extends Long>> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            yvj yvjVar = (yvj) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            myc0.h(yvjVar, null, null, new C2937a(this.this$0, null), 3);
            myc0.h(yvjVar, null, null, new b(this.this$0, null), 3);
            myc0.h(yvjVar, null, null, new c(this.this$0, null), 3);
            myc0.h(yvjVar, null, null, new d(this.this$0, null), 3);
            myc0.h(yvjVar, null, null, new e(this.this$0, null), 3);
            if40 if40Var = this.this$0;
            if40Var.getClass();
            return new izg0(new hf40(if40Var, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf40(if40 if40Var, spj<? super gf40> spjVar) {
        super(2, spjVar);
        this.this$0 = if40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new gf40(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super ksr<? extends Long>> spjVar) {
        return ((gf40) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
        a aVar = new a(this.this$0, null);
        this.label = 1;
        Object c = whn0.c(aVar, this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
