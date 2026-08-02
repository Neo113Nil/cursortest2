package xsna;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.utils.PackageExtenstionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rustore.sdk.pushclient.messaging.exception.RuStorePushClientException;

/* loaded from: classes9.dex */
public final class uoy0 {
    public final iay0 a;
    public final ru.rustore.sdk.pushclient.m.a b;
    public final Logger c;

    public uoy0(iay0 iay0Var, ru.rustore.sdk.pushclient.m.a aVar, Logger logger) {
        this.a = iay0Var;
        this.b = aVar;
        this.c = logger.createLogger("ValidationComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x01a2, code lost:
    
        if (r7.invoke(r2) != r3) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01cb, code lost:
    
        if (r1.c(r4, r2) == r3) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Application application, gzs gzsVar, izs izsVar, ContinuationImpl continuationImpl) {
        ru.rustore.sdk.pushclient.a.b bVar;
        Application application2;
        gzs gzsVar2;
        izs izsVar2;
        Object invoke;
        uoy0 uoy0Var;
        Iterator it;
        Object obj;
        gzs gzsVar3;
        Object a;
        uoy0 uoy0Var2;
        List list;
        Throwable a2;
        izs izsVar3;
        Iterator it2;
        if (continuationImpl instanceof ru.rustore.sdk.pushclient.a.b) {
            bVar = (ru.rustore.sdk.pushclient.a.b) continuationImpl;
            int i = bVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.g = i - Integer.MIN_VALUE;
                Object obj2 = bVar.e;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (bVar.g) {
                    case 0:
                        kotlin.a.a(obj2);
                        bVar.a = this;
                        application2 = application;
                        bVar.b = application2;
                        gzsVar2 = gzsVar;
                        bVar.c = gzsVar2;
                        izsVar2 = izsVar;
                        bVar.d = izsVar2;
                        bVar.g = 1;
                        invoke = this.b.invoke(bVar);
                        if (invoke != coroutineSingletons) {
                            uoy0Var = this;
                            z9y0 z9y0Var = (z9y0) invoke;
                            ArrayList arrayList = new ArrayList();
                            PackageManager packageManager = application2.getPackageManager();
                            uoy0Var.getClass();
                            Logger logger = uoy0Var.c;
                            it = z9y0Var.a().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = null;
                                } else {
                                    obj = it.next();
                                    if (PackageExtenstionsKt.isHostPackageInstalled(packageManager, ((AppInfo) obj).getPackageName())) {
                                    }
                                }
                            }
                            if (obj == null) {
                                List<AppInfo> a3 = z9y0Var.a();
                                if (!(a3 instanceof Collection) || !a3.isEmpty()) {
                                    for (AppInfo appInfo : a3) {
                                        if (epx.f(appInfo.getPackageName(), "ru.vk.store.qa") || epx.f(appInfo.getPackageName(), "ru.vk.store")) {
                                            if (PackageExtenstionsKt.isIgnoringBatteryOptimizations(application2, appInfo.getPackageName())) {
                                                bVar.a = uoy0Var;
                                                bVar.b = izsVar2;
                                                bVar.c = arrayList;
                                                bVar.d = null;
                                                bVar.g = 3;
                                                a = z9y0Var.a(bVar);
                                                if (a != coroutineSingletons) {
                                                    uoy0Var2 = uoy0Var;
                                                    list = arrayList;
                                                    a2 = Result.a(a);
                                                    if (a2 != null) {
                                                        boolean booleanValue = ((Boolean) a).booleanValue();
                                                        Logger.DefaultImpls.info$default(uoy0Var2.c, zhy0.a("User is authorized: ", booleanValue), null, 2, null);
                                                        if (!booleanValue) {
                                                            list.add(new RuStorePushClientException.UnauthorizedException("User is not authorized!"));
                                                        }
                                                        if (!list.isEmpty()) {
                                                            iay0 iay0Var = uoy0Var2.a;
                                                            bVar.a = izsVar2;
                                                            bVar.b = list;
                                                            bVar.c = null;
                                                            bVar.g = 4;
                                                            if (iay0Var.c(list, bVar) != coroutineSingletons) {
                                                                izsVar3 = izsVar2;
                                                                if ((list instanceof Collection) || !list.isEmpty()) {
                                                                    it2 = list.iterator();
                                                                    while (it2.hasNext()) {
                                                                        if (((RuStorePushClientException) it2.next()).d()) {
                                                                            return s3q0.a;
                                                                        }
                                                                    }
                                                                }
                                                                izsVar2 = izsVar3;
                                                            }
                                                        }
                                                        bVar.a = null;
                                                        bVar.b = null;
                                                        bVar.c = null;
                                                        bVar.g = 5;
                                                        break;
                                                    } else {
                                                        uoy0Var2.c.warn("Request of user's authorization is failed", a2);
                                                        String message = a2.getMessage();
                                                        if (message == null) {
                                                            message = "";
                                                        }
                                                        list.add(new RuStorePushClientException.UnauthorizedException(message));
                                                        iay0 iay0Var2 = uoy0Var2.a;
                                                        bVar.a = null;
                                                        bVar.b = null;
                                                        bVar.c = null;
                                                        bVar.g = 6;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                Logger.DefaultImpls.error$default(logger, "Work in background is not allowed!", null, 2, null);
                                arrayList.add(new RuStorePushClientException.HostAppBackgroundWorkPermissionNotGranted("Need to allow work in background"));
                                bVar.a = uoy0Var;
                                bVar.b = izsVar2;
                                bVar.c = arrayList;
                                bVar.d = null;
                                bVar.g = 3;
                                a = z9y0Var.a(bVar);
                                if (a != coroutineSingletons) {
                                }
                            } else {
                                Logger.DefaultImpls.error$default(logger, "Host push app is not installed!", null, 2, null);
                                arrayList.add(new RuStorePushClientException.HostAppNotInstalledException("Need to install host push app"));
                                iay0 iay0Var3 = uoy0Var.a;
                                bVar.a = gzsVar2;
                                bVar.b = null;
                                bVar.c = null;
                                bVar.d = null;
                                bVar.g = 2;
                                if (iay0Var3.c(arrayList, bVar) != coroutineSingletons) {
                                    gzsVar3 = gzsVar2;
                                    gzsVar3.invoke();
                                    return s3q0.a;
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        izs izsVar4 = bVar.d;
                        gzs gzsVar4 = (gzs) bVar.c;
                        ?? r8 = (Context) bVar.b;
                        uoy0Var = (uoy0) bVar.a;
                        kotlin.a.a(obj2);
                        invoke = obj2;
                        application2 = r8;
                        izsVar2 = izsVar4;
                        gzsVar2 = gzsVar4;
                        z9y0 z9y0Var2 = (z9y0) invoke;
                        ArrayList arrayList2 = new ArrayList();
                        PackageManager packageManager2 = application2.getPackageManager();
                        uoy0Var.getClass();
                        Logger logger2 = uoy0Var.c;
                        it = z9y0Var2.a().iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        if (obj == null) {
                        }
                        return coroutineSingletons;
                    case 2:
                        gzsVar3 = (gzs) bVar.a;
                        kotlin.a.a(obj2);
                        gzsVar3.invoke();
                        return s3q0.a;
                    case 3:
                        list = (List) bVar.c;
                        izsVar2 = (izs) bVar.b;
                        uoy0Var2 = (uoy0) bVar.a;
                        kotlin.a.a(obj2);
                        a = ((Result) obj2).d();
                        a2 = Result.a(a);
                        if (a2 != null) {
                        }
                        return coroutineSingletons;
                    case 4:
                        list = (List) bVar.b;
                        izsVar3 = (izs) bVar.a;
                        kotlin.a.a(obj2);
                        if (list instanceof Collection) {
                            break;
                        }
                        it2 = list.iterator();
                        while (it2.hasNext()) {
                        }
                        izsVar2 = izsVar3;
                        bVar.a = null;
                        bVar.b = null;
                        bVar.c = null;
                        bVar.g = 5;
                        break;
                    case 5:
                    case 6:
                        kotlin.a.a(obj2);
                        return s3q0.a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        bVar = new ru.rustore.sdk.pushclient.a.b(this, continuationImpl);
        Object obj22 = bVar.e;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (bVar.g) {
        }
    }
}
