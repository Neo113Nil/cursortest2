package xsna;

import android.annotation.SuppressLint;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MusicClearStorageInteractorImpl.kt */
@SuppressLint({"UnsafeOptInUsageError"})
/* loaded from: classes3.dex */
public final class if40 implements ef40 {
    public final lq40 a;
    public final df5 b;
    public final wa40 c;
    public final ovj d;
    public final bpn0 e;

    /* compiled from: MusicClearStorageInteractorImpl.kt */
    @b6l(c = "com.vk.music.offline.impl.domain.interactor.MusicClearStorageInteractorImpl$downloadsSizeInBytes$2", f = "MusicClearStorageInteractorImpl.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super Long>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return if40.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Long> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            String valueOf = String.valueOf(((b25) if40.this.e.getValue()).c().b);
            return new Long(if40.this.b.k(valueOf) + if40.this.a.m(new dam(19)));
        }
    }

    public if40(lq40 lq40Var, df5 df5Var, wa40 wa40Var, bpn0 bpn0Var) {
        ovj b = hqu0.b();
        this.a = lq40Var;
        this.b = df5Var;
        this.c = wa40Var;
        this.d = b;
        this.e = bpn0Var;
    }

    public static Object c(io.reactivex.rxjava3.core.a aVar, SuspendLambda suspendLambda) {
        lq9 lq9Var = new lq9(1, s7s0.c(suspendLambda));
        lq9Var.o();
        aVar.subscribe(new ff40(lq9Var));
        Object n = lq9Var.n();
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : s3q0.a;
    }

    @Override // xsna.ef40
    public final Object a(spj<? super Long> spjVar) {
        return myc0.k(this.d, new a(null), spjVar);
    }

    @Override // xsna.ef40
    public final Object b(bj40 bj40Var) {
        return myc0.k(this.d, new gf40(this, null), bj40Var);
    }
}
