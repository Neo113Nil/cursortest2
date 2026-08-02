package xsna;

import androidx.concurrent.futures.DirectExecutor;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Lambda;

/* compiled from: ListenableFuture.kt */
/* loaded from: classes11.dex */
public final class ygz {

    /* compiled from: ListenableFuture.kt */
    public static final class a extends Lambda implements izs<Throwable, s3q0> {
        final /* synthetic */ ugz<T> $this_await;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ugz<T> ugzVar) {
            super(1);
            this.$this_await = ugzVar;
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            this.$this_await.cancel(false);
            return s3q0.a;
        }
    }

    public static final <T> Object a(ugz<T> ugzVar, spj<? super T> spjVar) {
        try {
            if (ugzVar.isDone()) {
                return kh.g(ugzVar);
            }
            lq9 lq9Var = new lq9(1, s7s0.c(spjVar));
            lq9Var.o();
            ugzVar.addListener(new e0p0(ugzVar, lq9Var), DirectExecutor.INSTANCE);
            lq9Var.r(new a(ugzVar));
            Object n = lq9Var.n();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return n;
        } catch (ExecutionException e) {
            throw e.getCause();
        }
    }
}
