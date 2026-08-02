package xsna;

import android.database.sqlite.SQLiteException;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.base.exception.HostIsNotMasterException;
import com.vk.push.core.domain.model.CallingAppIds;
import com.vk.push.core.domain.usecase.GetCallingAppInfoUseCase;
import com.vk.push.core.push.RegisterForPushesResult;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: InsertPushTokenByProjectIdInteractor.kt */
/* loaded from: classes5.dex */
public final class t3x {
    public final xip0 a;
    public final w790 b;
    public final ctx c;
    public final bm01 d;
    public final u3x e;
    public final GetCallingAppInfoUseCase f;
    public final Logger g;

    public t3x(xip0 xip0Var, w790 w790Var, ctx ctxVar, bm01 bm01Var, u3x u3xVar, GetCallingAppInfoUseCase getCallingAppInfoUseCase, Logger logger) {
        this.a = xip0Var;
        this.b = w790Var;
        this.c = ctxVar;
        this.d = bm01Var;
        this.e = u3xVar;
        this.f = getCallingAppInfoUseCase;
        this.g = logger.createLogger("InsertPushTokenByProjectId");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cc, code lost:
    
        if (r1 != r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0099, code lost:
    
        if (r1 == r3) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(t3x t3xVar, CallingAppIds callingAppIds, ContinuationImpl continuationImpl) {
        p3x p3xVar;
        int i;
        AppInfo appInfo;
        e790 e790Var;
        e790 e790Var2;
        e790 e790Var3;
        t3x t3xVar2;
        e790 e790Var4;
        t3x t3xVar3 = t3xVar;
        t3xVar3.getClass();
        if (continuationImpl instanceof p3x) {
            p3xVar = (p3x) continuationImpl;
            int i2 = p3xVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p3xVar.label = i2 - Integer.MIN_VALUE;
                Object obj = p3xVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = p3xVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Object m97invokeIoAF18A = t3xVar3.f.m97invokeIoAF18A(callingAppIds);
                    kotlin.a.a(m97invokeIoAF18A);
                    appInfo = (AppInfo) m97invokeIoAF18A;
                    String packageName = appInfo.getPackageName();
                    e790Var = new e790(packageName, 0L, appInfo.getPubKey(), null);
                    w790 w790Var = t3xVar3.b;
                    p3xVar.L$0 = t3xVar3;
                    p3xVar.L$1 = appInfo;
                    p3xVar.L$2 = e790Var;
                    p3xVar.label = 1;
                    obj = w790Var.a.e(packageName, p3xVar);
                } else if (i == 1) {
                    e790 e790Var5 = (e790) p3xVar.L$2;
                    appInfo = (AppInfo) p3xVar.L$1;
                    t3x t3xVar4 = (t3x) p3xVar.L$0;
                    kotlin.a.a(obj);
                    e790Var = e790Var5;
                    t3xVar3 = t3xVar4;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            e790Var3 = (e790) p3xVar.L$0;
                            kotlin.a.a(obj);
                            return new Long(e790Var3.a);
                        }
                        kotlin.a.a(obj);
                        e790 e790Var6 = (e790) obj;
                        Long l = e790Var6 != null ? new Long(e790Var6.a) : null;
                        if (l != null) {
                            return l;
                        }
                        throw new IllegalStateException("Insert package info was failed");
                    }
                    e790Var4 = (e790) p3xVar.L$1;
                    t3xVar2 = (t3x) p3xVar.L$0;
                    kotlin.a.a(obj);
                    w790 w790Var2 = t3xVar2.b;
                    String str = e790Var4.b;
                    p3xVar.L$0 = null;
                    p3xVar.L$1 = null;
                    p3xVar.label = 3;
                    obj = w790Var2.a.e(str, p3xVar);
                }
                e790Var2 = (e790) obj;
                if (e790Var2 != null) {
                    w790 w790Var3 = t3xVar3.b;
                    p3xVar.L$0 = t3xVar3;
                    p3xVar.L$1 = e790Var;
                    p3xVar.L$2 = null;
                    p3xVar.label = 2;
                    Object h = w790Var3.a.h(e790Var, p3xVar);
                    if (h != coroutineSingletons) {
                        h = s3q0.a;
                    }
                    if (h != coroutineSingletons) {
                        t3xVar2 = t3xVar3;
                        e790Var4 = e790Var;
                        w790 w790Var22 = t3xVar2.b;
                        String str2 = e790Var4.b;
                        p3xVar.L$0 = null;
                        p3xVar.L$1 = null;
                        p3xVar.label = 3;
                        obj = w790Var22.a.e(str2, p3xVar);
                    }
                } else {
                    ctx ctxVar = t3xVar3.c;
                    Long l2 = e790Var2.d;
                    if (l2 != null && System.currentTimeMillis() - l2.longValue() < ctxVar.a) {
                        throw new IllegalStateException("Caller has been rejected");
                    }
                    String pubKey = appInfo.getPubKey();
                    p3xVar.L$0 = e790Var2;
                    p3xVar.L$1 = null;
                    p3xVar.L$2 = null;
                    p3xVar.label = 4;
                    Logger.DefaultImpls.info$default(t3xVar3.g, "Updating package info for client " + e790Var2.b, null, 2, null);
                    Object f = t3xVar3.b.a.f(e790.a(e790Var2, pubKey, 3), p3xVar);
                    if (f != coroutineSingletons) {
                        f = s3q0.a;
                    }
                    if (f != coroutineSingletons) {
                        f = s3q0.a;
                    }
                    if (f != coroutineSingletons) {
                        e790Var3 = e790Var2;
                        return new Long(e790Var3.a);
                    }
                }
                return coroutineSingletons;
            }
        }
        p3xVar = new p3x(t3xVar3, continuationImpl);
        Object obj2 = p3xVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = p3xVar.label;
        if (i != 0) {
        }
        e790Var2 = (e790) obj2;
        if (e790Var2 != null) {
        }
        return coroutineSingletons2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
    
        if (r0.a(r8, r3) == r4) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Enum b(t3x t3xVar, long j, String str, String str2, ContinuationImpl continuationImpl) {
        s3x s3xVar;
        Object obj;
        int i;
        String str3;
        String str4;
        long j2;
        t3x t3xVar2 = t3xVar;
        t3xVar2.getClass();
        try {
            if (continuationImpl instanceof s3x) {
                s3xVar = (s3x) continuationImpl;
                int i2 = s3xVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    s3xVar.label = i2 - Integer.MIN_VALUE;
                    obj = s3xVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = s3xVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        bm01 bm01Var = t3xVar2.d;
                        s3xVar.L$0 = t3xVar2;
                        s3xVar.L$1 = str;
                        str3 = str2;
                        s3xVar.L$2 = str3;
                        s3xVar.J$0 = j;
                        s3xVar.label = 1;
                        obj = ((qle0) bm01Var.b).d(str, s3xVar);
                        if (obj != coroutineSingletons) {
                            str4 = str;
                            j2 = j;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return RegisterForPushesResult.OK;
                    }
                    long j3 = s3xVar.J$0;
                    str3 = (String) s3xVar.L$2;
                    String str5 = (String) s3xVar.L$1;
                    t3x t3xVar3 = (t3x) s3xVar.L$0;
                    kotlin.a.a(obj);
                    j2 = j3;
                    str4 = str5;
                    t3xVar2 = t3xVar3;
                    String str6 = str3;
                    if (!((Boolean) obj).booleanValue()) {
                        Logger.DefaultImpls.info$default(t3xVar2.g, "Current push token is already registered", null, 2, null);
                        return RegisterForPushesResult.ALREADY_REGISTERED;
                    }
                    pke0 pke0Var = new pke0(j2, str4, str6, System.currentTimeMillis(), null, false);
                    u3x u3xVar = t3xVar2.e;
                    s3xVar.L$0 = null;
                    s3xVar.L$1 = null;
                    s3xVar.L$2 = null;
                    s3xVar.label = 2;
                }
            }
            if (i != 0) {
            }
            String str62 = str3;
            if (!((Boolean) obj).booleanValue()) {
            }
        } catch (SQLiteException e) {
            throw new HostIsNotMasterException("Unable to register push token", e);
        }
        s3xVar = new s3x(t3xVar2, continuationImpl);
        obj = s3xVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = s3xVar.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(CallingAppIds callingAppIds, String str, String str2, ContinuationImpl continuationImpl) {
        q3x q3xVar;
        int i;
        if (continuationImpl instanceof q3x) {
            q3xVar = (q3x) continuationImpl;
            int i2 = q3xVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q3xVar.label = i2 - Integer.MIN_VALUE;
                Object obj = q3xVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = q3xVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    r3x r3xVar = new r3x(this, callingAppIds, str, str2, null);
                    q3xVar.label = 1;
                    obj = this.a.a(r3xVar, q3xVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        q3xVar = new q3x(this, continuationImpl);
        Object obj2 = q3xVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = q3xVar.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }
}
