package com.ybsdk.common.repositiories.applications;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.common.entities.ApplicationTypeEntity;
import com.ybsdk.common.entities.SessionApplicationEntity;
import com.ybsdk.core.utils.dto.common.ApplicationType;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.network.Api;
import com.ybsdk.network.dto.ApplicationResponse;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.jqr;
import defpackage.k03;
import defpackage.l03;
import defpackage.n13;
import defpackage.ny61;
import defpackage.q1e0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.v5;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class b implements k03 {
    public final Api a;
    public final tse b;
    public final com.ybsdk.utils.poller.b c;
    public final HashMap d = new HashMap();
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final kotlinx.coroutines.sync.a f = gtq0.a();

    public b(Api api, tse tseVar, com.ybsdk.utils.poller.b bVar) {
        this.a = api;
        this.b = tseVar;
        this.c = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0059 A[Catch: all -> 0x008a, TryCatch #0 {all -> 0x008a, blocks: (B:11:0x0051, B:13:0x0059, B:14:0x0063, B:15:0x0066, B:16:0x006b, B:18:0x006c, B:19:0x007d, B:23:0x006f, B:24:0x0072, B:25:0x0075, B:26:0x0078, B:27:0x007b, B:28:0x008c), top: B:10:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v12, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ApplicationType applicationType, String str, ContinuationImpl continuationImpl) {
        ApplicationRepositoryImpl$addToApplicationsMap$1 applicationRepositoryImpl$addToApplicationsMap$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        Object obj;
        ApplicationTypeEntity applicationTypeEntity;
        try {
            if (continuationImpl instanceof ApplicationRepositoryImpl$addToApplicationsMap$1) {
                applicationRepositoryImpl$addToApplicationsMap$1 = (ApplicationRepositoryImpl$addToApplicationsMap$1) continuationImpl;
                int i2 = applicationRepositoryImpl$addToApplicationsMap$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    applicationRepositoryImpl$addToApplicationsMap$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = applicationRepositoryImpl$addToApplicationsMap$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = applicationRepositoryImpl$addToApplicationsMap$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        applicationRepositoryImpl$addToApplicationsMap$1.L$0 = str;
                        applicationRepositoryImpl$addToApplicationsMap$1.L$1 = applicationType;
                        aVar = this.f;
                        applicationRepositoryImpl$addToApplicationsMap$1.L$2 = aVar;
                        applicationRepositoryImpl$addToApplicationsMap$1.label = 1;
                        if (aVar.a(applicationRepositoryImpl$addToApplicationsMap$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) applicationRepositoryImpl$addToApplicationsMap$1.L$2;
                        ApplicationType applicationType2 = (ApplicationType) applicationRepositoryImpl$addToApplicationsMap$1.L$1;
                        String str2 = (String) applicationRepositoryImpl$addToApplicationsMap$1.L$0;
                        kotlin.b.b(obj2);
                        aVar = r6;
                        applicationType = applicationType2;
                        str = str2;
                    }
                    ConcurrentHashMap concurrentHashMap = this.e;
                    obj = concurrentHashMap.get(str);
                    if (obj == null) {
                        switch (l03.a[applicationType.ordinal()]) {
                            case 1:
                                applicationTypeEntity = ApplicationTypeEntity.UNKNOWN;
                                break;
                            case 2:
                                applicationTypeEntity = ApplicationTypeEntity.PRODUCT;
                                break;
                            case 3:
                                applicationTypeEntity = ApplicationTypeEntity.REGISTRATION;
                                break;
                            case 4:
                                applicationTypeEntity = ApplicationTypeEntity.SIMPLIFIED_IDENTIFICATION;
                                break;
                            case 5:
                                applicationTypeEntity = ApplicationTypeEntity.DIGITAL_CARD_ISSUE;
                                break;
                            case 6:
                                applicationTypeEntity = ApplicationTypeEntity.CHANGE_PHONE;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        obj = new SessionApplicationEntity(str, applicationTypeEntity, false);
                        Object putIfAbsent = concurrentHashMap.putIfAbsent(str, obj);
                        if (putIfAbsent != null) {
                            obj = putIfAbsent;
                        }
                    }
                    aVar.d(null);
                    return zy11.a;
                }
            }
            ConcurrentHashMap concurrentHashMap2 = this.e;
            obj = concurrentHashMap2.get(str);
            if (obj == null) {
            }
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        applicationRepositoryImpl$addToApplicationsMap$1 = new ApplicationRepositoryImpl$addToApplicationsMap$1(this, continuationImpl);
        Object obj22 = applicationRepositoryImpl$addToApplicationsMap$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = applicationRepositoryImpl$addToApplicationsMap$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ApplicationType applicationType, String str, ContinuationImpl continuationImpl) {
        ApplicationRepositoryImpl$create$1 applicationRepositoryImpl$create$1;
        int i;
        Object c;
        Object obj;
        if (continuationImpl instanceof ApplicationRepositoryImpl$create$1) {
            applicationRepositoryImpl$create$1 = (ApplicationRepositoryImpl$create$1) continuationImpl;
            int i2 = applicationRepositoryImpl$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                applicationRepositoryImpl$create$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = applicationRepositoryImpl$create$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = applicationRepositoryImpl$create$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ApplicationRepositoryImpl$create$2 applicationRepositoryImpl$create$2 = new ApplicationRepositoryImpl$create$2(this, applicationType, str, null);
                    applicationRepositoryImpl$create$1.L$0 = applicationType;
                    applicationRepositoryImpl$create$1.label = 1;
                    c = c.c(applicationRepositoryImpl$create$2, applicationRepositoryImpl$create$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = applicationRepositoryImpl$create$1.L$0;
                        kotlin.b.b(obj2);
                        c = obj;
                        return !(c instanceof Result.Failure) ? n13.b((ApplicationResponse) c) : c;
                    }
                    applicationType = (ApplicationType) applicationRepositoryImpl$create$1.L$0;
                    kotlin.b.b(obj2);
                    c = ((Result) obj2).getValue();
                }
                if (!(c instanceof Result.Failure)) {
                    ApplicationResponse applicationResponse = (ApplicationResponse) c;
                    if (applicationType != ApplicationType.SIMPLIFIED_IDENTIFICATION) {
                        String applicationId = applicationResponse.getApplicationId();
                        applicationRepositoryImpl$create$1.L$0 = c;
                        applicationRepositoryImpl$create$1.label = 2;
                        if (a(applicationType, applicationId, applicationRepositoryImpl$create$1) != obj3) {
                            obj = c;
                            c = obj;
                        }
                        return obj3;
                    }
                }
                if (!(c instanceof Result.Failure)) {
                }
            }
        }
        applicationRepositoryImpl$create$1 = new ApplicationRepositoryImpl$create$1(this, continuationImpl);
        Object obj22 = applicationRepositoryImpl$create$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = applicationRepositoryImpl$create$1.label;
        if (i != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
        if (!(c instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(YBProduct yBProduct, Map map, ContinuationImpl continuationImpl) {
        ApplicationRepositoryImpl$createRegistration$1 applicationRepositoryImpl$createRegistration$1;
        int i;
        Object c;
        if (continuationImpl instanceof ApplicationRepositoryImpl$createRegistration$1) {
            applicationRepositoryImpl$createRegistration$1 = (ApplicationRepositoryImpl$createRegistration$1) continuationImpl;
            int i2 = applicationRepositoryImpl$createRegistration$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                applicationRepositoryImpl$createRegistration$1.label = i2 - Integer.MIN_VALUE;
                Object obj = applicationRepositoryImpl$createRegistration$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = applicationRepositoryImpl$createRegistration$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ApplicationRepositoryImpl$createRegistration$2 applicationRepositoryImpl$createRegistration$2 = new ApplicationRepositoryImpl$createRegistration$2(this, null, yBProduct, map, null);
                    applicationRepositoryImpl$createRegistration$1.label = 1;
                    c = c.c(applicationRepositoryImpl$createRegistration$2, applicationRepositoryImpl$createRegistration$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                return c instanceof Result.Failure ? n13.b((ApplicationResponse) c) : c;
            }
        }
        applicationRepositoryImpl$createRegistration$1 = new ApplicationRepositoryImpl$createRegistration$1(this, continuationImpl);
        Object obj2 = applicationRepositoryImpl$createRegistration$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = applicationRepositoryImpl$createRegistration$1.label;
        if (i != 0) {
        }
        if (c instanceof Result.Failure) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054 A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #0 {all -> 0x0059, blocks: (B:11:0x004a, B:13:0x0054), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        ApplicationRepositoryImpl$removeFromApplicationsMap$1 applicationRepositoryImpl$removeFromApplicationsMap$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuationImpl instanceof ApplicationRepositoryImpl$removeFromApplicationsMap$1) {
                applicationRepositoryImpl$removeFromApplicationsMap$1 = (ApplicationRepositoryImpl$removeFromApplicationsMap$1) continuationImpl;
                int i2 = applicationRepositoryImpl$removeFromApplicationsMap$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    applicationRepositoryImpl$removeFromApplicationsMap$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = applicationRepositoryImpl$removeFromApplicationsMap$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = applicationRepositoryImpl$removeFromApplicationsMap$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        applicationRepositoryImpl$removeFromApplicationsMap$1.L$0 = str;
                        aVar = this.f;
                        applicationRepositoryImpl$removeFromApplicationsMap$1.L$1 = aVar;
                        applicationRepositoryImpl$removeFromApplicationsMap$1.label = 1;
                        if (aVar.a(applicationRepositoryImpl$removeFromApplicationsMap$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) applicationRepositoryImpl$removeFromApplicationsMap$1.L$1;
                        String str2 = (String) applicationRepositoryImpl$removeFromApplicationsMap$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r6;
                        str = str2;
                    }
                    SessionApplicationEntity sessionApplicationEntity = (SessionApplicationEntity) this.e.remove(str);
                    return sessionApplicationEntity == null ? sessionApplicationEntity.getApplicationId() : null;
                }
            }
            SessionApplicationEntity sessionApplicationEntity2 = (SessionApplicationEntity) this.e.remove(str);
            return sessionApplicationEntity2 == null ? sessionApplicationEntity2.getApplicationId() : null;
        } finally {
            aVar.d(null);
        }
        applicationRepositoryImpl$removeFromApplicationsMap$1 = new ApplicationRepositoryImpl$removeFromApplicationsMap$1(this, continuationImpl);
        Object obj2 = applicationRepositoryImpl$removeFromApplicationsMap$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = applicationRepositoryImpl$removeFromApplicationsMap$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:11:0x004a, B:12:0x0055, B:14:0x005b, B:17:0x006a, B:22:0x0070, B:23:0x0074, B:25:0x007a, B:28:0x008a), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:11:0x004a, B:12:0x0055, B:14:0x005b, B:17:0x006a, B:22:0x0070, B:23:0x0074, B:25:0x007a, B:28:0x008a), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(List list, ContinuationImpl continuationImpl) {
        ApplicationRepositoryImpl$setApplications$1 applicationRepositoryImpl$setApplications$1;
        int i;
        g050 g050Var;
        Iterator it;
        ConcurrentHashMap concurrentHashMap = this.e;
        try {
            if (continuationImpl instanceof ApplicationRepositoryImpl$setApplications$1) {
                applicationRepositoryImpl$setApplications$1 = (ApplicationRepositoryImpl$setApplications$1) continuationImpl;
                int i2 = applicationRepositoryImpl$setApplications$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    applicationRepositoryImpl$setApplications$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = applicationRepositoryImpl$setApplications$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = applicationRepositoryImpl$setApplications$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        applicationRepositoryImpl$setApplications$1.L$0 = list;
                        g050Var = this.f;
                        applicationRepositoryImpl$setApplications$1.L$1 = g050Var;
                        applicationRepositoryImpl$setApplications$1.label = 1;
                        if (g050Var.a(applicationRepositoryImpl$setApplications$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) applicationRepositoryImpl$setApplications$1.L$1;
                        list = (List) applicationRepositoryImpl$setApplications$1.L$0;
                        kotlin.b.b(obj);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((SessionApplicationEntity) obj2).getType() != ApplicationTypeEntity.UNKNOWN) {
                            arrayList.add(obj2);
                        }
                    }
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        SessionApplicationEntity sessionApplicationEntity = (SessionApplicationEntity) it.next();
                        if (!concurrentHashMap.containsKey(sessionApplicationEntity.getApplicationId())) {
                            concurrentHashMap.put(sessionApplicationEntity.getApplicationId(), sessionApplicationEntity);
                        }
                    }
                    g050Var.d(null);
                    return zy11.a;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            while (r7.hasNext()) {
            }
            it = arrayList2.iterator();
            while (it.hasNext()) {
            }
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        applicationRepositoryImpl$setApplications$1 = new ApplicationRepositoryImpl$setApplications$1(this, continuationImpl);
        Object obj3 = applicationRepositoryImpl$setApplications$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = applicationRepositoryImpl$setApplications$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
    
        if (r12.a(r0) == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b A[Catch: all -> 0x007f, TryCatch #1 {all -> 0x007f, blocks: (B:25:0x0063, B:27:0x006b, B:28:0x0082), top: B:24:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r10v8, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, q1e0 q1e0Var, ContinuationImpl continuationImpl) {
        ApplicationRepositoryImpl$startPolling$1 applicationRepositoryImpl$startPolling$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar;
        g050 g050Var;
        Object obj;
        Object d;
        String str2;
        try {
            if (continuationImpl instanceof ApplicationRepositoryImpl$startPolling$1) {
                applicationRepositoryImpl$startPolling$1 = (ApplicationRepositoryImpl$startPolling$1) continuationImpl;
                int i2 = applicationRepositoryImpl$startPolling$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    applicationRepositoryImpl$startPolling$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = applicationRepositoryImpl$startPolling$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = applicationRepositoryImpl$startPolling$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        applicationRepositoryImpl$startPolling$1.L$0 = str;
                        applicationRepositoryImpl$startPolling$1.L$1 = q1e0Var;
                        aVar = this.f;
                        applicationRepositoryImpl$startPolling$1.L$2 = aVar;
                        applicationRepositoryImpl$startPolling$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) applicationRepositoryImpl$startPolling$1.L$1;
                            str2 = (String) applicationRepositoryImpl$startPolling$1.L$0;
                            try {
                                kotlin.b.b(obj2);
                                jqr jqrVar = new jqr((tpr) obj2, new ApplicationRepositoryImpl$startPolling$2$2(this, str2, null), 3);
                                g050Var.d(null);
                                return jqrVar;
                            } catch (Throwable th) {
                                th = th;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        ?? r10 = (g050) applicationRepositoryImpl$startPolling$1.L$2;
                        q1e0Var = (q1e0) applicationRepositoryImpl$startPolling$1.L$1;
                        String str3 = (String) applicationRepositoryImpl$startPolling$1.L$0;
                        kotlin.b.b(obj2);
                        aVar = r10;
                        str = str3;
                    }
                    HashMap hashMap = this.d;
                    obj = hashMap.get(str);
                    if (obj == null) {
                        obj = com.ybsdk.core.utils.poller.a.a(this.c, q1e0Var, new ApplicationRepositoryImpl$createPoller$1(2, null), new ApplicationRepositoryImpl$createPoller$2(this, str, null));
                        hashMap.put(str, obj);
                    }
                    v5 v5Var = new v5(17, this, str);
                    applicationRepositoryImpl$startPolling$1.L$0 = str;
                    applicationRepositoryImpl$startPolling$1.L$1 = aVar;
                    applicationRepositoryImpl$startPolling$1.L$2 = null;
                    applicationRepositoryImpl$startPolling$1.label = 2;
                    d = ((com.ybsdk.utils.poller.c) obj).d(v5Var, applicationRepositoryImpl$startPolling$1);
                    if (d != coroutineSingletons) {
                        str2 = str;
                        g050Var = aVar;
                        obj2 = d;
                        jqr jqrVar2 = new jqr((tpr) obj2, new ApplicationRepositoryImpl$startPolling$2$2(this, str2, null), 3);
                        g050Var.d(null);
                        return jqrVar2;
                    }
                    return coroutineSingletons;
                }
            }
            HashMap hashMap2 = this.d;
            obj = hashMap2.get(str);
            if (obj == null) {
            }
            v5 v5Var2 = new v5(17, this, str);
            applicationRepositoryImpl$startPolling$1.L$0 = str;
            applicationRepositoryImpl$startPolling$1.L$1 = aVar;
            applicationRepositoryImpl$startPolling$1.L$2 = null;
            applicationRepositoryImpl$startPolling$1.label = 2;
            d = ((com.ybsdk.utils.poller.c) obj).d(v5Var2, applicationRepositoryImpl$startPolling$1);
            if (d != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            g050Var = aVar;
            g050Var.d(null);
            throw th;
        }
        applicationRepositoryImpl$startPolling$1 = new ApplicationRepositoryImpl$startPolling$1(this, continuationImpl);
        Object obj22 = applicationRepositoryImpl$startPolling$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = applicationRepositoryImpl$startPolling$1.label;
        if (i != 0) {
        }
    }
}
