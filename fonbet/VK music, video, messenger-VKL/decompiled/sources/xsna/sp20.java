package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.io.File;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ow8;
import xsna.ox8;

/* compiled from: MiniAppLocalStorageCache.kt */
@b6l(c = "com.vk.local.storage.impl.MiniAppLocalStorageCache$get$2", f = "MiniAppLocalStorageCache.kt", l = {293}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class sp20 extends SuspendLambda implements wzs<yvj, spj<? super ox8<? extends String>>, Object> {
    final /* synthetic */ long $appId;
    final /* synthetic */ String $key;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp20(long j, String str, spj<? super sp20> spjVar) {
        super(2, spjVar);
        this.$appId = j;
        this.$key = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        sp20 sp20Var = new sp20(this.$appId, this.$key, spjVar);
        sp20Var.L$0 = obj;
        return sp20Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super ox8<? extends String>> spjVar) {
        return ((sp20) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ui50 g;
        String str;
        long j;
        ui50 ui50Var;
        ui50 ui50Var2;
        Object failure;
        File file;
        String str2;
        String str3;
        Object failure2;
        Object bVar;
        ui50 ui50Var3;
        Object failure3;
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            g = yp20.g(yp20.b, this.$appId);
            long j2 = this.$appId;
            String str4 = this.$key;
            this.L$0 = yvjVar;
            this.L$1 = g;
            this.L$2 = str4;
            this.J$0 = j2;
            this.I$0 = 0;
            this.label = 1;
            if (g.b(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = str4;
            j = j2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            String str5 = (String) this.L$2;
            g = (ui50) this.L$1;
            kotlin.a.a(obj);
            str = str5;
        }
        try {
            File file2 = yp20.h(yp20.b, j).get(str);
            if (file2 == null) {
                bVar = ox8.c.a;
            } else if (file2.exists()) {
                File file3 = new File(file2.getParentFile(), file2.getName() + ".rec");
                long currentTimeMillis = System.currentTimeMillis();
                Object l = yp20.l(file3);
                Throwable a = Result.a(l);
                if (a != null) {
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l2, L.LogType.w, new Object[]{"MiniAppLocalStorageCache.get record read failed appId=" + j + " key=" + str + ": " + a.getMessage()});
                    }
                    l = null;
                }
                nw8 nw8Var = (nw8) l;
                ui50 ui50Var4 = g;
                try {
                    if (nw8Var == null) {
                        try {
                            failure = new Long(file2.length());
                        } catch (Throwable th) {
                            failure = new Result.Failure(th);
                        }
                        ui50Var2 = ui50Var4;
                        try {
                            Object l3 = new Long(0L);
                            if (failure instanceof Result.Failure) {
                                failure = l3;
                            }
                            file = file3;
                            str2 = ": ";
                            str3 = " key=";
                            nw8Var = new nw8(str, ((Number) failure).longValue(), currentTimeMillis, currentTimeMillis, 0, new Long(currentTimeMillis));
                        } catch (Throwable th2) {
                            th = th2;
                            ui50Var = ui50Var2;
                            ui50Var.c(null);
                            throw th;
                        }
                    } else {
                        ui50Var2 = ui50Var4;
                        file = file3;
                        str2 = ": ";
                        str3 = " key=";
                    }
                    nw8Var.e++;
                    Long l4 = nw8Var.f;
                    if (currentTimeMillis - (l4 != null ? l4.longValue() : 0L) >= 1000) {
                        nw8Var.f = new Long(currentTimeMillis);
                        try {
                            yp20.i(yp20.b, file, j8y.d.b(nw8.Companion.serializer(), nw8Var));
                            failure3 = s3q0.a;
                        } catch (Throwable th3) {
                            failure3 = new Result.Failure(th3);
                        }
                        Throwable a2 = Result.a(failure3);
                        if (a2 != null) {
                            L l5 = L.a;
                            l5.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l5, L.LogType.w, new Object[]{"MiniAppLocalStorageCache.get record write fail appId=" + j + str3 + str + str2 + a2.getMessage()});
                            }
                        }
                    }
                    try {
                        failure2 = nbr.r(file2, yp20.e);
                    } catch (Throwable th4) {
                        try {
                            failure2 = new Result.Failure(th4);
                        } catch (Throwable th5) {
                            th = th5;
                            ui50Var = ui50Var2;
                            ui50Var.c(null);
                            throw th;
                        }
                    }
                    Throwable a3 = Result.a(failure2);
                    bVar = a3 == null ? new ox8.b((String) failure2) : new ox8.a(ow8.b.a, a3);
                    ui50Var3 = ui50Var2;
                    ui50Var3.c(null);
                    return bVar;
                } catch (Throwable th6) {
                    th = th6;
                    ui50Var2 = ui50Var4;
                }
            } else {
                bVar = ox8.c.a;
            }
            ui50Var3 = g;
            ui50Var3.c(null);
            return bVar;
        } catch (Throwable th7) {
            th = th7;
            ui50Var = g;
        }
    }
}
