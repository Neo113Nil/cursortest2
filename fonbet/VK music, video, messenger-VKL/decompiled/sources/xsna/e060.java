package xsna;

import android.content.Context;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.domain.repository.PackagesRepository;
import com.vk.push.core.network.data.source.MasterHostApi;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: NeedToInitiateElectionsByDeletedAppUseCase.kt */
/* loaded from: classes5.dex */
public final class e060 {
    public final Context a;
    public final MasterHostApi b;
    public final PackagesRepository c;
    public final Logger d;

    public e060(Context context, MasterHostApi masterHostApi, PackagesRepository packagesRepository, Logger logger) {
        this.a = context;
        this.b = masterHostApi;
        this.c = packagesRepository;
        this.d = logger.createLogger(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        c060 c060Var;
        int i;
        Object m105getHostListgIAlus;
        if (continuationImpl instanceof c060) {
            c060Var = (c060) continuationImpl;
            int i2 = c060Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c060Var.label = i2 - Integer.MIN_VALUE;
                Object obj = c060Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c060Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    c060Var.label = 1;
                    m105getHostListgIAlus = this.b.m105getHostListgIAlus(list, c060Var);
                    if (m105getHostListgIAlus == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    m105getHostListgIAlus = ((Result) obj).d();
                }
                kotlin.a.a(m105getHostListgIAlus);
                return j5g.Y((List) m105getHostListgIAlus);
            }
        }
        c060Var = new c060(this, continuationImpl);
        Object obj2 = c060Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = c060Var.label;
        if (i != 0) {
        }
        kotlin.a.a(m105getHostListgIAlus);
        return j5g.Y((List) m105getHostListgIAlus);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b3, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v11, types: [xsna.e060] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(String str, ContinuationImpl continuationImpl) {
        d060 d060Var;
        int i;
        e060 e060Var;
        Object obj;
        String str2;
        e060 e060Var2;
        List list;
        Iterator it;
        try {
            try {
                if (continuationImpl instanceof d060) {
                    d060Var = (d060) continuationImpl;
                    int i2 = d060Var.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        d060Var.label = i2 - Integer.MIN_VALUE;
                        Object obj2 = d060Var.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = d060Var.label;
                        if (i != 0) {
                            kotlin.a.a(obj2);
                            try {
                                MasterHostApi masterHostApi = this.b;
                                d060Var.L$0 = this;
                                d060Var.L$1 = str;
                                d060Var.label = 1;
                                Object m104getAllExistingHostListIoAF18A = masterHostApi.m104getAllExistingHostListIoAF18A(d060Var);
                                if (m104getAllExistingHostListIoAF18A != coroutineSingletons) {
                                    obj = m104getAllExistingHostListIoAF18A;
                                    str2 = str;
                                    e060Var2 = this;
                                }
                                return coroutineSingletons;
                            } catch (Exception e) {
                                e = e;
                                e060Var = this;
                                e060Var.d.error("Unable to getAllExistingHostList", e);
                                return new Result.Failure(e);
                            }
                        }
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            e060 e060Var3 = (e060) d060Var.L$0;
                            kotlin.a.a(obj2);
                            str = e060Var3;
                            String packageName = ((AppInfo) obj2).getPackageName();
                            Context context = str.a;
                            Logger logger = str.d;
                            if (epx.f(packageName, context.getPackageName())) {
                                Logger.DefaultImpls.info$default(logger, "This host is arbiter. Need to start elections", null, 2, null);
                                return Boolean.TRUE;
                            }
                            Logger.DefaultImpls.info$default(logger, "This host not an arbiter", null, 2, null);
                            return Boolean.FALSE;
                        }
                        String str3 = (String) d060Var.L$1;
                        e060Var = (e060) d060Var.L$0;
                        try {
                            kotlin.a.a(obj2);
                            Object d = ((Result) obj2).d();
                            str2 = str3;
                            e060Var2 = e060Var;
                            obj = d;
                        } catch (Exception e2) {
                            e = e2;
                            e060Var.d.error("Unable to getAllExistingHostList", e);
                            return new Result.Failure(e);
                        }
                        kotlin.a.a(obj);
                        List list2 = (List) obj;
                        Logger.DefaultImpls.info$default(e060Var2.d, go9.b("Check deleted app: ", str2), null, 2, null);
                        list = list2;
                        if ((list instanceof Collection) || !list.isEmpty()) {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (epx.f(((AppInfo) it.next()).getPackageName(), str2)) {
                                    List<String> initializedHostPackages = e060Var2.c.getInitializedHostPackages();
                                    d060Var.L$0 = e060Var2;
                                    d060Var.L$1 = null;
                                    d060Var.label = 2;
                                    obj2 = e060Var2.a(initializedHostPackages, d060Var);
                                    str = e060Var2;
                                }
                            }
                        }
                        Logger.DefaultImpls.info$default(e060Var2.d, "Deleted app is not a host", null, 2, null);
                        return Boolean.FALSE;
                    }
                }
                kotlin.a.a(obj);
                List list22 = (List) obj;
                Logger.DefaultImpls.info$default(e060Var2.d, go9.b("Check deleted app: ", str2), null, 2, null);
                list = list22;
                if (list instanceof Collection) {
                }
                it = list.iterator();
                while (it.hasNext()) {
                }
                Logger.DefaultImpls.info$default(e060Var2.d, "Deleted app is not a host", null, 2, null);
                return Boolean.FALSE;
            } catch (Exception e3) {
                e060Var = e060Var2;
                e = e3;
                e060Var.d.error("Unable to getAllExistingHostList", e);
                return new Result.Failure(e);
            }
            if (i != 0) {
            }
        } catch (Exception e4) {
            str.d.error("Unable to getArbiter", e4);
            return new Result.Failure(e4);
        }
        d060Var = new d060(this, continuationImpl);
        Object obj22 = d060Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = d060Var.label;
    }
}
