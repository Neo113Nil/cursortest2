package com.yandex.passport.internal.network;

import com.yandex.passport.internal.report.reporters.c1;
import com.yandex.passport.internal.report.ub;
import com.yandex.passport.internal.report.vb;
import defpackage.kme0;
import defpackage.ny61;
import defpackage.zy11;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class n implements com.yandex.passport.data.network.core.o {
    public final com.yandex.passport.internal.storage.datastore.a a;
    public final com.yandex.passport.common.common.a b;
    public final c1 c;

    public n(com.yandex.passport.internal.storage.datastore.a aVar, com.yandex.passport.common.common.a aVar2, c1 c1Var) {
        this.a = aVar;
        this.b = aVar2;
        this.c = c1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r2 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        MasterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1 masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        com.yandex.passport.internal.storage.datastore.b bVar;
        Object c;
        Set M0;
        com.yandex.passport.internal.storage.datastore.a aVar;
        kme0 a;
        n nVar;
        String str3;
        if (continuationImpl instanceof MasterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1) {
            masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1 = (MasterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1) continuationImpl;
            int i2 = masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str != null) {
                        bVar = new com.yandex.passport.internal.storage.datastore.b(new kme0(str));
                        masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.L$0 = this;
                        masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.L$1 = str;
                        masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.L$2 = str2;
                        masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.L$3 = bVar;
                        masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.label = 1;
                        c = this.a.c(bVar, masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1);
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = (String) masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.L$2;
                    str = (String) masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.L$1;
                    nVar = (n) masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.L$0;
                    kotlin.b.b(obj);
                    c1 c1Var = nVar.c;
                    c1Var.getClass();
                    c1Var.f(ub.w, new com.yandex.passport.internal.report.f("source", str3), new com.yandex.passport.internal.report.i(str, 26));
                    return zy11Var;
                }
                com.yandex.passport.internal.storage.datastore.b bVar2 = (com.yandex.passport.internal.storage.datastore.b) masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.L$3;
                str2 = (String) masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.L$2;
                str = (String) masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.L$1;
                n nVar2 = (n) masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.L$0;
                kotlin.b.b(obj);
                bVar = bVar2;
                this = nVar2;
                c = obj;
                M0 = kotlin.collections.a.M0((Iterable) c);
                M0.add(((com.yandex.passport.internal.common.e) this.b).a());
                aVar = this.a;
                a = bVar.a();
                masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.L$0 = this;
                masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.L$1 = str;
                masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.L$2 = str2;
                masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.L$3 = null;
                masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.label = 2;
                if (aVar.b(a, M0, masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1) != coroutineSingletons) {
                    String str4 = str2;
                    nVar = this;
                    str3 = str4;
                    c1 c1Var2 = nVar.c;
                    c1Var2.getClass();
                    c1Var2.f(ub.w, new com.yandex.passport.internal.report.f("source", str3), new com.yandex.passport.internal.report.i(str, 26));
                    return zy11Var;
                }
                return coroutineSingletons;
            }
        }
        masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1 = new MasterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1(this, continuationImpl);
        Object obj2 = masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        M0 = kotlin.collections.a.M0((Iterable) c);
        M0.add(((com.yandex.passport.internal.common.e) this.b).a());
        aVar = this.a;
        a = bVar.a();
        masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.L$0 = this;
        masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.L$1 = str;
        masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.L$2 = str2;
        masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.L$3 = null;
        masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1.label = 2;
        if (aVar.b(a, M0, masterTokenTombstoneManagerImpl$addHostWithInvalidMasterToken$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r10 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, ContinuationImpl continuationImpl) {
        MasterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1 masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1;
        Object obj;
        int i;
        n nVar;
        String str3;
        if (continuationImpl instanceof MasterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1) {
            masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1 = (MasterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1) continuationImpl;
            int i2 = masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1.label = i2 - Integer.MIN_VALUE;
                obj = masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str != null) {
                        com.yandex.passport.internal.storage.datastore.b bVar = new com.yandex.passport.internal.storage.datastore.b(new kme0(str));
                        masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1.L$0 = this;
                        masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1.L$1 = str;
                        masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1.L$2 = str2;
                        masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1.label = 1;
                        obj = this.a.c(bVar, masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1);
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = (String) masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1.L$2;
                    str = (String) masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1.L$1;
                    nVar = (n) masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1.L$0;
                    kotlin.b.b(obj);
                    c1 c1Var = nVar.c;
                    c1Var.getClass();
                    c1Var.f(vb.w, new com.yandex.passport.internal.report.f("source", str3), new com.yandex.passport.internal.report.i(str, 26));
                    return zy11Var;
                }
                str2 = (String) masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1.L$2;
                str = (String) masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1.L$1;
                this = (n) masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1.L$0;
                kotlin.b.b(obj);
                if (!((Set) obj).isEmpty()) {
                    kme0 kme0Var = new kme0(str);
                    com.yandex.passport.internal.storage.datastore.a aVar = this.a;
                    masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1.L$0 = this;
                    masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1.L$1 = str;
                    masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1.L$2 = str2;
                    masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1.label = 2;
                    if (aVar.a(kme0Var, masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1) != coroutineSingletons) {
                        String str4 = str2;
                        nVar = this;
                        str3 = str4;
                        c1 c1Var2 = nVar.c;
                        c1Var2.getClass();
                        c1Var2.f(vb.w, new com.yandex.passport.internal.report.f("source", str3), new com.yandex.passport.internal.report.i(str, 26));
                    }
                    return coroutineSingletons;
                }
                return zy11Var;
            }
        }
        masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1 = new MasterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1(this, continuationImpl);
        obj = masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masterTokenTombstoneManagerImpl$deleteMasterTokenInfo$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        if (!((Set) obj).isEmpty()) {
        }
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        MasterTokenTombstoneManagerImpl$isMasterTokenValid$1 masterTokenTombstoneManagerImpl$isMasterTokenValid$1;
        int i;
        if (continuationImpl instanceof MasterTokenTombstoneManagerImpl$isMasterTokenValid$1) {
            masterTokenTombstoneManagerImpl$isMasterTokenValid$1 = (MasterTokenTombstoneManagerImpl$isMasterTokenValid$1) continuationImpl;
            int i2 = masterTokenTombstoneManagerImpl$isMasterTokenValid$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masterTokenTombstoneManagerImpl$isMasterTokenValid$1.label = i2 - Integer.MIN_VALUE;
                Object obj = masterTokenTombstoneManagerImpl$isMasterTokenValid$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masterTokenTombstoneManagerImpl$isMasterTokenValid$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str == null) {
                        return Boolean.FALSE;
                    }
                    com.yandex.passport.internal.storage.datastore.b bVar = new com.yandex.passport.internal.storage.datastore.b(new kme0(str));
                    masterTokenTombstoneManagerImpl$isMasterTokenValid$1.L$0 = this;
                    masterTokenTombstoneManagerImpl$isMasterTokenValid$1.label = 1;
                    obj = this.a.c(bVar, masterTokenTombstoneManagerImpl$isMasterTokenValid$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (n) masterTokenTombstoneManagerImpl$isMasterTokenValid$1.L$0;
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(!((Set) obj).contains(((com.yandex.passport.internal.common.e) this.b).a()));
            }
        }
        masterTokenTombstoneManagerImpl$isMasterTokenValid$1 = new MasterTokenTombstoneManagerImpl$isMasterTokenValid$1(this, continuationImpl);
        Object obj2 = masterTokenTombstoneManagerImpl$isMasterTokenValid$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masterTokenTombstoneManagerImpl$isMasterTokenValid$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(!((Set) obj2).contains(((com.yandex.passport.internal.common.e) this.b).a()));
    }
}
