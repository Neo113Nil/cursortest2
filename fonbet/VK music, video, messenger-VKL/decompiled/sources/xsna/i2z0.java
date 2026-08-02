package xsna;

import com.vk.push.common.AppInfo;
import com.vk.push.core.base.exception.HostIsNotMasterException;
import com.vk.push.core.domain.model.CallingAppIds;
import com.vk.push.core.domain.repository.PackagesRepository;
import com.vk.push.core.domain.usecase.GetCallingAppInfoUseCase;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rustore.sdk.pushclient.u.k$a;

/* loaded from: classes9.dex */
public final class i2z0 {
    public final GetCallingAppInfoUseCase a;
    public final PackagesRepository b;
    public final ru.rustore.sdk.pushclient.k.b c;

    public i2z0(GetCallingAppInfoUseCase getCallingAppInfoUseCase, PackagesRepository packagesRepository, ru.rustore.sdk.pushclient.k.b bVar) {
        this.a = getCallingAppInfoUseCase;
        this.b = packagesRepository;
        this.c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0050, B:14:0x005c, B:16:0x006d, B:19:0x007e, B:22:0x008d, B:23:0x00b2, B:25:0x00b3, B:26:0x00d4, B:27:0x00d5, B:29:0x00db, B:31:0x00de, B:32:0x00ef, B:36:0x003f), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00db A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0050, B:14:0x005c, B:16:0x006d, B:19:0x007e, B:22:0x008d, B:23:0x00b2, B:25:0x00b3, B:26:0x00d4, B:27:0x00d5, B:29:0x00db, B:31:0x00de, B:32:0x00ef, B:36:0x003f), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0050, B:14:0x005c, B:16:0x006d, B:19:0x007e, B:22:0x008d, B:23:0x00b2, B:25:0x00b3, B:26:0x00d4, B:27:0x00d5, B:29:0x00db, B:31:0x00de, B:32:0x00ef, B:36:0x003f), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(CallingAppIds callingAppIds, ContinuationImpl continuationImpl) {
        k$a k_a;
        int i;
        CallingAppIds callingAppIds2;
        i2z0 i2z0Var;
        Object m97invokeIoAF18A;
        Throwable a;
        try {
            if (continuationImpl instanceof k$a) {
                k_a = (k$a) continuationImpl;
                int i2 = k_a.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    k_a.e = i2 - Integer.MIN_VALUE;
                    Object obj = k_a.c;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = k_a.e;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        ru.rustore.sdk.pushclient.k.b bVar = this.c;
                        k_a.a = callingAppIds;
                        k_a.b = this;
                        k_a.e = 1;
                        obj = bVar.e(k_a);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        callingAppIds2 = callingAppIds;
                        i2z0Var = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i2z0Var = k_a.b;
                        callingAppIds2 = k_a.a;
                        kotlin.a.a(obj);
                    }
                    AppInfo appInfo = (AppInfo) obj;
                    m97invokeIoAF18A = i2z0Var.a.m97invokeIoAF18A(callingAppIds2);
                    if (!(m97invokeIoAF18A instanceof Result.Failure)) {
                        AppInfo appInfo2 = (AppInfo) m97invokeIoAF18A;
                        if (!epx.f(appInfo.getPackageName(), appInfo2.getPackageName())) {
                            throw new HostIsNotMasterException("Package names mismatch! Saved host: " + appInfo.getPackageName() + ", caller: " + appInfo2.getPackageName());
                        }
                        if (!epx.f(i2z0Var.b.getPackageName(), appInfo2.getPackageName()) && !brm0.w(appInfo.getPubKey(), appInfo2.getPubKey(), true)) {
                            throw new IllegalStateException(("Saved host public key differs from caller public key. Expected: " + appInfo.getPubKey() + ", actual: " + appInfo2.getPubKey()).toString());
                        }
                    }
                    a = Result.a(m97invokeIoAF18A);
                    if (a != null) {
                        return s3q0.a;
                    }
                    throw new IllegalStateException("Could not get calling host app info: " + callingAppIds2, a);
                }
            }
            if (i != 0) {
            }
            AppInfo appInfo3 = (AppInfo) obj;
            m97invokeIoAF18A = i2z0Var.a.m97invokeIoAF18A(callingAppIds2);
            if (!(m97invokeIoAF18A instanceof Result.Failure)) {
            }
            a = Result.a(m97invokeIoAF18A);
            if (a != null) {
            }
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        k_a = new k$a(this, continuationImpl);
        Object obj2 = k_a.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = k_a.e;
    }
}
