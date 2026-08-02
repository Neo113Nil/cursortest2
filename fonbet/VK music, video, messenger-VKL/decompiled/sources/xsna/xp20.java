package xsna;

import com.unity3d.services.core.di.ServiceProvider;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.io.File;
import java.io.OutputStream;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.l9r;
import xsna.ow8;
import xsna.ox8;

/* compiled from: MiniAppLocalStorageCache.kt */
@b6l(c = "com.vk.local.storage.impl.MiniAppLocalStorageCache$put$2", f = "MiniAppLocalStorageCache.kt", l = {293}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class xp20 extends SuspendLambda implements wzs<yvj, spj<? super ox8<? extends Boolean>>, Object> {
    final /* synthetic */ long $appId;
    final /* synthetic */ String $data;
    final /* synthetic */ String $key;
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp20(long j, String str, String str2, spj<? super xp20> spjVar) {
        super(2, spjVar);
        this.$appId = j;
        this.$data = str;
        this.$key = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xp20(this.$appId, this.$data, this.$key, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super ox8<? extends Boolean>> spjVar) {
        return ((xp20) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ui50 g;
        long j;
        String str;
        String str2;
        Object obj2;
        Object aVar;
        Object obj3;
        nw8 nw8Var;
        ui50 ui50Var;
        long j2;
        ox8.a aVar2;
        kbr a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            g = yp20.g(yp20.b, this.$appId);
            j = this.$appId;
            str = this.$data;
            String str3 = this.$key;
            this.L$0 = g;
            this.L$1 = str;
            this.L$2 = str3;
            this.J$0 = j;
            this.I$0 = 0;
            this.label = 1;
            if (g.b(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            str2 = str3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            String str4 = (String) this.L$2;
            str = (String) this.L$1;
            g = (ui50) this.L$0;
            kotlin.a.a(obj);
            str2 = str4;
        }
        try {
            yp20 yp20Var = yp20.b;
            l9r h = yp20.h(yp20Var, j);
            byte[] bytes = str.getBytes(yp20.e);
            long length = bytes.length;
            if (length > ServiceProvider.HTTP_CACHE_DISK_SIZE) {
                try {
                    aVar = new ox8.a(ow8.e.a, null);
                    obj3 = null;
                } catch (Throwable th) {
                    th = th;
                    obj2 = null;
                    g.c(obj2);
                    throw th;
                }
            } else {
                File file = h.get(str2);
                if (file != null) {
                    Object l = yp20.l(new File(file.getParentFile(), file.getName() + ".rec"));
                    if (l instanceof Result.Failure) {
                        l = null;
                    }
                    nw8Var = (nw8) l;
                } else {
                    nw8Var = null;
                }
                boolean z = nw8Var == null;
                long currentTimeMillis = System.currentTimeMillis();
                if (nw8Var != null) {
                    ui50Var = g;
                    try {
                        j2 = nw8Var.c;
                    } catch (Throwable th2) {
                        th = th2;
                        g = ui50Var;
                        obj2 = null;
                        g.c(obj2);
                        throw th;
                    }
                } else {
                    ui50Var = g;
                    j2 = currentTimeMillis;
                }
                int i2 = nw8Var != null ? nw8Var.e : 0;
                try {
                    a = h.a(str2);
                } catch (Exception e) {
                    try {
                        L l2 = L.a;
                        l2.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l2, L.LogType.w, new Object[]{"MiniAppLocalStorageCache.put manager IO appId=" + j + " key=" + str2 + ": " + e.getMessage()});
                        }
                        aVar2 = new ox8.a(ow8.b.a, e);
                    } catch (Throwable th3) {
                        th = th3;
                        g = ui50Var;
                        obj2 = null;
                        g.c(obj2);
                        throw th;
                    }
                }
                try {
                    boolean z2 = z;
                    OutputStream c = ((l9r.a) a).e.c(0);
                    try {
                        c.write(bytes);
                        s3q0 s3q0Var = s3q0.a;
                        c.close();
                        l9r.a aVar3 = (l9r.a) a;
                        aVar3.commit();
                        aVar3.close();
                        File file2 = h.get(str2);
                        if (file2 == null) {
                            aVar = new ox8.a(ow8.b.a, new IllegalStateException("Data file missing after commit"));
                        } else {
                            try {
                                yp20.i(yp20Var, new File(file2.getParentFile(), file2.getName() + ".rec"), j8y.d.b(nw8.Companion.serializer(), new nw8(str2, length, j2, currentTimeMillis, i2, new Long(currentTimeMillis))));
                                aVar = new ox8.b(Boolean.valueOf(z2));
                            } catch (IllegalStateException e2) {
                                L l3 = L.a;
                                l3.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.u(l3, L.LogType.w, new Object[]{"MiniAppLocalStorageCache.put atomic rename failed appId=" + j + " key=" + str2 + ": " + e2.getMessage()});
                                }
                                aVar2 = new ox8.a(ow8.a.a, e2);
                                aVar = aVar2;
                                g = ui50Var;
                                obj3 = null;
                                g.c(obj3);
                                return aVar;
                            } catch (Exception e3) {
                                L l4 = L.a;
                                l4.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.u(l4, L.LogType.w, new Object[]{"MiniAppLocalStorageCache.put record write IO appId=" + j + " key=" + str2 + ": " + e3.getMessage()});
                                }
                                aVar2 = new ox8.a(ow8.d.a, e3);
                                aVar = aVar2;
                                g = ui50Var;
                                obj3 = null;
                                g.c(obj3);
                                return aVar;
                            }
                        }
                        g = ui50Var;
                        obj3 = null;
                    } finally {
                    }
                } finally {
                }
            }
            g.c(obj3);
            return aVar;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
