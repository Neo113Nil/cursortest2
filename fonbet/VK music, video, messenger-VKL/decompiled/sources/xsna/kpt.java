package xsna;

import com.vk.push.common.Logger;
import com.vk.push.core.domain.repository.PackagesRepository;
import com.vk.push.core.network.data.source.MasterHostApi;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetAllInstalledHostsUseCase.kt */
/* loaded from: classes5.dex */
public final class kpt {
    public final MasterHostApi a;
    public final PackagesRepository b;
    public final Logger c;

    public kpt(MasterHostApi masterHostApi, PackagesRepository packagesRepository, Logger logger) {
        this.a = masterHostApi;
        this.b = packagesRepository;
        this.c = logger.createLogger(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        jpt jptVar;
        int i;
        Object m105getHostListgIAlus;
        kpt kptVar;
        Throwable a;
        if (continuationImpl instanceof jpt) {
            jptVar = (jpt) continuationImpl;
            int i2 = jptVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jptVar.label = i2 - Integer.MIN_VALUE;
                Object obj = jptVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = jptVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    List<String> initializedHostPackages = this.b.getInitializedHostPackages();
                    jptVar.L$0 = this;
                    jptVar.label = 1;
                    m105getHostListgIAlus = this.a.m105getHostListgIAlus(initializedHostPackages, jptVar);
                    if (m105getHostListgIAlus == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    kptVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kptVar = (kpt) jptVar.L$0;
                    kotlin.a.a(obj);
                    m105getHostListgIAlus = ((Result) obj).d();
                }
                a = Result.a(m105getHostListgIAlus);
                if (a != null) {
                    kptVar.c.error("Unable to getHostList", a);
                }
                return m105getHostListgIAlus;
            }
        }
        jptVar = new jpt(this, continuationImpl);
        Object obj2 = jptVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jptVar.label;
        if (i != 0) {
        }
        a = Result.a(m105getHostListgIAlus);
        if (a != null) {
        }
        return m105getHostListgIAlus;
    }
}
