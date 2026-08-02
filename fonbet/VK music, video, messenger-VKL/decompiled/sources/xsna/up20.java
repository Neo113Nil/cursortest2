package xsna;

import com.unity3d.services.core.di.ServiceProvider;
import java.io.File;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ow8;
import xsna.ox8;

/* compiled from: MiniAppLocalStorageCache.kt */
@b6l(c = "com.vk.local.storage.impl.MiniAppLocalStorageCache$getAppCacheState$2", f = "MiniAppLocalStorageCache.kt", l = {293}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class up20 extends SuspendLambda implements wzs<yvj, spj<? super ox8<? extends v13>>, Object> {
    final /* synthetic */ long $appId;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up20(long j, spj<? super up20> spjVar) {
        super(2, spjVar);
        this.$appId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        up20 up20Var = new up20(this.$appId, spjVar);
        up20Var.L$0 = obj;
        return up20Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super ox8<? extends v13>> spjVar) {
        return ((up20) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ui50 g;
        long j;
        Object failure;
        long j2;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            g = yp20.g(yp20.b, this.$appId);
            long j3 = this.$appId;
            this.L$0 = yvjVar;
            this.L$1 = g;
            this.J$0 = j3;
            this.I$0 = 0;
            this.label = 1;
            if (g.b(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            j = j3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            g = (ui50) this.L$1;
            kotlin.a.a(obj);
        }
        try {
            try {
                yp20.b.getClass();
                File[] listFiles = yp20.j(j).listFiles(new qp20());
                long j4 = 0;
                if (listFiles != null) {
                    j2 = 0;
                    for (File file : listFiles) {
                        yp20.b.getClass();
                        Object l = yp20.l(file);
                        if (l instanceof Result.Failure) {
                            l = null;
                        }
                        nw8 nw8Var = (nw8) l;
                        if (nw8Var != null) {
                            j2 += nw8Var.b;
                        }
                    }
                } else {
                    j2 = 0;
                }
                yp20.b.getClass();
                File[] listFiles2 = yp20.j(j).listFiles(new tp20());
                int length = listFiles2 != null ? listFiles2.length : 0;
                long j5 = ServiceProvider.HTTP_CACHE_DISK_SIZE - j2;
                if (j5 >= 0) {
                    j4 = j5;
                }
                failure = new v13(j4, length);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            Object bVar = a == null ? new ox8.b((v13) failure) : new ox8.a(ow8.c.a, a);
            g.c(null);
            return bVar;
        } catch (Throwable th2) {
            g.c(null);
            throw th2;
        }
    }
}
