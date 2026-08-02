package xsna;

import android.content.Context;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rustore.sdk.pushclient.l.h$a;

/* loaded from: classes9.dex */
public final class nyy0 {
    public final h7l0 a;
    public final ru.rustore.sdk.pushclient.m.l b;
    public final ru.rustore.sdk.pushclient.m.m c;
    public final hpj d;
    public final Logger e;
    public volatile asl f;
    public final wi50 g;

    public nyy0(h7l0 h7l0Var, ru.rustore.sdk.pushclient.m.l lVar, ru.rustore.sdk.pushclient.m.m mVar, Logger logger) {
        bdn bdnVar = bdn.a;
        hpj a = zvj.a(wgl.c);
        this.a = h7l0Var;
        this.b = lVar;
        this.c = mVar;
        this.d = a;
        this.e = logger.createLogger("IPCClientsDataSource");
        this.g = bay.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(nyy0 nyy0Var, ContinuationImpl continuationImpl) {
        ru.rustore.sdk.pushclient.l.i iVar;
        int i;
        nyy0Var.getClass();
        if (continuationImpl instanceof ru.rustore.sdk.pushclient.l.i) {
            iVar = (ru.rustore.sdk.pushclient.l.i) continuationImpl;
            int i2 = iVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.d = i2 - Integer.MIN_VALUE;
                Object obj = iVar.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = iVar.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ru.rustore.sdk.pushclient.m.l lVar = nyy0Var.b;
                    iVar.a = nyy0Var;
                    iVar.d = 1;
                    obj = lVar.invoke(iVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nyy0Var = iVar.a;
                    kotlin.a.a(obj);
                }
                AppInfo appInfo = (AppInfo) obj;
                Logger.DefaultImpls.info$default(nyy0Var.e, "Client works with host: " + appInfo.getPackageName(), null, 2, null);
                h7l0 h7l0Var = nyy0Var.a;
                ru.rustore.sdk.pushclient.l.k kVar = new ru.rustore.sdk.pushclient.l.k(nyy0Var);
                h7l0Var.getClass();
                List singletonList = Collections.singletonList(appInfo);
                Context context = (Context) h7l0Var.a;
                Logger logger = (Logger) h7l0Var.c;
                return new eay0(new hfy0(context, singletonList, logger, new ru.rustore.sdk.pushclient.p.b(kVar)), new lfy0((String) h7l0Var.b, context, singletonList, logger, new ru.rustore.sdk.pushclient.p.c(kVar)), null);
            }
        }
        iVar = new ru.rustore.sdk.pushclient.l.i(nyy0Var, continuationImpl);
        Object obj2 = iVar.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = iVar.d;
        if (i != 0) {
        }
        AppInfo appInfo2 = (AppInfo) obj2;
        Logger.DefaultImpls.info$default(nyy0Var.e, "Client works with host: " + appInfo2.getPackageName(), null, 2, null);
        h7l0 h7l0Var2 = nyy0Var.a;
        ru.rustore.sdk.pushclient.l.k kVar2 = new ru.rustore.sdk.pushclient.l.k(nyy0Var);
        h7l0Var2.getClass();
        List singletonList2 = Collections.singletonList(appInfo2);
        Context context2 = (Context) h7l0Var2.a;
        Logger logger2 = (Logger) h7l0Var2.c;
        return new eay0(new hfy0(context2, singletonList2, logger2, new ru.rustore.sdk.pushclient.p.b(kVar2)), new lfy0((String) h7l0Var2.b, context2, singletonList2, logger2, new ru.rustore.sdk.pushclient.p.c(kVar2)), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v3, types: [xsna.ui50] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        h$a h_a;
        CoroutineSingletons coroutineSingletons;
        int i;
        wi50 wi50Var;
        nyy0 nyy0Var;
        ui50 ui50Var;
        Throwable th;
        ru.rustore.sdk.pushclient.m.m mVar;
        nyy0 nyy0Var2;
        try {
            if (continuationImpl instanceof h$a) {
                h_a = (h$a) continuationImpl;
                int i2 = h_a.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    h_a.e = i2 - Integer.MIN_VALUE;
                    Object obj = h_a.c;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = h_a.e;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        wi50Var = this.g;
                        h_a.a = this;
                        h_a.b = wi50Var;
                        h_a.e = 1;
                        if (wi50Var.b(h_a) != coroutineSingletons) {
                            nyy0Var = this;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ui50Var = h_a.b;
                        nyy0Var2 = h_a.a;
                        try {
                            kotlin.a.a(obj);
                            nyy0Var2.f = null;
                            s3q0 s3q0Var = s3q0.a;
                            ui50Var.c(null);
                            return s3q0Var;
                        } catch (Throwable th2) {
                            th = th2;
                            ui50Var.c(null);
                            throw th;
                        }
                    }
                    ?? r2 = h_a.b;
                    nyy0Var = h_a.a;
                    kotlin.a.a(obj);
                    wi50Var = r2;
                    mVar = nyy0Var.c;
                    h_a.a = nyy0Var;
                    h_a.b = wi50Var;
                    h_a.e = 2;
                    if (mVar.invoke(h_a) != coroutineSingletons) {
                        ui50Var = wi50Var;
                        nyy0Var2 = nyy0Var;
                        nyy0Var2.f = null;
                        s3q0 s3q0Var2 = s3q0.a;
                        ui50Var.c(null);
                        return s3q0Var2;
                    }
                    return coroutineSingletons;
                }
            }
            mVar = nyy0Var.c;
            h_a.a = nyy0Var;
            h_a.b = wi50Var;
            h_a.e = 2;
            if (mVar.invoke(h_a) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            ui50Var = wi50Var;
            th = th3;
            ui50Var.c(null);
            throw th;
        }
        h_a = new h$a(this, continuationImpl);
        Object obj2 = h_a.c;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = h_a.e;
        if (i != 0) {
        }
    }
}
