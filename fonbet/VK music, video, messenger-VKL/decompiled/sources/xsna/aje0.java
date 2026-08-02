package xsna;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.utils.PackageExtenstionsKt;
import com.vk.push.pushsdk.client.ipc.AppNotInstalledException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PushIPCClientInteractorImpl.kt */
/* loaded from: classes5.dex */
public final class aje0 implements vie0 {
    public final Context a;
    public final PackageManager b;
    public final Logger c;
    public final ConcurrentHashMap<AppInfo, zhe0> d;

    public aje0() {
        throw null;
    }

    public aje0(Context context, Logger logger) {
        PackageManager packageManager = context.getPackageManager();
        ConcurrentHashMap<AppInfo, zhe0> concurrentHashMap = new ConcurrentHashMap<>();
        this.a = context;
        this.b = packageManager;
        this.c = logger;
        this.d = concurrentHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.vie0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AppInfo appInfo, List list, ContinuationImpl continuationImpl) {
        zie0 zie0Var;
        int i;
        Object e;
        aje0 aje0Var;
        if (continuationImpl instanceof zie0) {
            zie0Var = (zie0) continuationImpl;
            int i2 = zie0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zie0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = zie0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zie0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    zhe0 f = f(appInfo);
                    zie0Var.L$0 = this;
                    zie0Var.L$1 = appInfo;
                    zie0Var.label = 1;
                    e = f.e(list, zie0Var);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aje0Var = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    appInfo = (AppInfo) zie0Var.L$1;
                    aje0Var = (aje0) zie0Var.L$0;
                    kotlin.a.a(obj);
                    e = ((Result) obj).d();
                }
                return aje0Var.e(e, appInfo.getPackageName());
            }
        }
        zie0Var = new zie0(this, continuationImpl);
        Object obj2 = zie0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zie0Var.label;
        if (i != 0) {
        }
        return aje0Var.e(e, appInfo.getPackageName());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.vie0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AppInfo appInfo, String str, ContinuationImpl continuationImpl) {
        wie0 wie0Var;
        int i;
        Object d;
        aje0 aje0Var;
        if (continuationImpl instanceof wie0) {
            wie0Var = (wie0) continuationImpl;
            int i2 = wie0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wie0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = wie0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = wie0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    zhe0 f = f(appInfo);
                    wie0Var.L$0 = this;
                    wie0Var.L$1 = appInfo;
                    wie0Var.label = 1;
                    d = f.d(str, wie0Var);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aje0Var = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    appInfo = (AppInfo) wie0Var.L$1;
                    aje0Var = (aje0) wie0Var.L$0;
                    kotlin.a.a(obj);
                    d = ((Result) obj).d();
                }
                return aje0Var.e(d, appInfo.getPackageName());
            }
        }
        wie0Var = new wie0(this, continuationImpl);
        Object obj2 = wie0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wie0Var.label;
        if (i != 0) {
        }
        return aje0Var.e(d, appInfo.getPackageName());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.vie0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(AppInfo appInfo, ContinuationImpl continuationImpl) {
        xie0 xie0Var;
        int i;
        Object f;
        aje0 aje0Var;
        if (continuationImpl instanceof xie0) {
            xie0Var = (xie0) continuationImpl;
            int i2 = xie0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xie0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = xie0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = xie0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    zhe0 f2 = f(appInfo);
                    xie0Var.L$0 = this;
                    xie0Var.L$1 = appInfo;
                    xie0Var.label = 1;
                    f = f2.f(xie0Var);
                    if (f == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aje0Var = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    appInfo = (AppInfo) xie0Var.L$1;
                    aje0Var = (aje0) xie0Var.L$0;
                    kotlin.a.a(obj);
                    f = ((Result) obj).d();
                }
                return aje0Var.e(f, appInfo.getPackageName());
            }
        }
        xie0Var = new xie0(this, continuationImpl);
        Object obj2 = xie0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = xie0Var.label;
        if (i != 0) {
        }
        return aje0Var.e(f, appInfo.getPackageName());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.vie0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(AppInfo appInfo, ContinuationImpl continuationImpl) {
        yie0 yie0Var;
        int i;
        Object g;
        aje0 aje0Var;
        if (continuationImpl instanceof yie0) {
            yie0Var = (yie0) continuationImpl;
            int i2 = yie0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yie0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = yie0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yie0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    zhe0 f = f(appInfo);
                    yie0Var.L$0 = this;
                    yie0Var.L$1 = appInfo;
                    yie0Var.label = 1;
                    g = f.g(yie0Var);
                    if (g == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aje0Var = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    appInfo = (AppInfo) yie0Var.L$1;
                    aje0Var = (aje0) yie0Var.L$0;
                    kotlin.a.a(obj);
                    g = ((Result) obj).d();
                }
                return aje0Var.e(g, appInfo.getPackageName());
            }
        }
        yie0Var = new yie0(this, continuationImpl);
        Object obj2 = yie0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yie0Var.label;
        if (i != 0) {
        }
        return aje0Var.e(g, appInfo.getPackageName());
    }

    public final <T> Object e(Object obj, String str) {
        return (!(Result.a(obj) instanceof RemoteException) || PackageExtenstionsKt.isClientPackageInstalled(this.b, str)) ? obj : new Result.Failure(new AppNotInstalledException(fo8.a(str, " is uninstalled, unable to to perform IPC request")));
    }

    public final zhe0 f(AppInfo appInfo) {
        uie0 uie0Var = new uie0(this.a, appInfo, this.c);
        zhe0 putIfAbsent = this.d.putIfAbsent(appInfo, uie0Var);
        return putIfAbsent == null ? uie0Var : putIfAbsent;
    }
}
