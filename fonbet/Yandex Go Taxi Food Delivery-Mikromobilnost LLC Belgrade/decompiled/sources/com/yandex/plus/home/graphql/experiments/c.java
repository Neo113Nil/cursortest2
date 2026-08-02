package com.yandex.plus.home.graphql.experiments;

import com.yandex.plus.home.datasource.openapi.apis.CommonExperimentsControllerApi;
import defpackage.e6d0;
import defpackage.evu0;
import defpackage.i6d0;
import defpackage.j73;
import defpackage.k2d0;
import defpackage.l2d0;
import defpackage.l6d0;
import defpackage.m6d0;
import defpackage.ny61;
import defpackage.pt50;
import defpackage.sls;
import defpackage.st50;
import defpackage.tcc;
import defpackage.tms;
import defpackage.v4r0;
import defpackage.vt50;
import defpackage.w511;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class c implements l2d0 {
    public final CommonExperimentsControllerApi a;
    public final sls b;
    public final sls c;
    public final m6d0 d;
    public final Map e;
    public final tms f = new tms(9);

    public c(CommonExperimentsControllerApi commonExperimentsControllerApi, sls slsVar, sls slsVar2, m6d0 m6d0Var, Map map) {
        this.a = commonExperimentsControllerApi;
        this.b = slsVar;
        this.c = slsVar2;
        this.d = m6d0Var;
        this.e = map;
    }

    public static String b(String str, String str2) {
        List W;
        List W2;
        W = evu0.W(str, new String[]{";"}, (r2 & 4) != 0 ? 0 : 2);
        W2 = evu0.W(str2, new String[]{";"}, (r2 & 4) != 0 ? 0 : 2);
        return kotlin.collections.a.X(kotlin.collections.a.I(tcc.o(j73.A(new List[]{W, W2}))), ";", null, null, null, 62);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|(1:(1:(13:10|11|12|13|(2:15|(1:17)(2:49|50))(2:51|(1:53)(2:54|55))|18|(1:20)(2:45|(2:47|48))|21|(1:23)(1:44)|24|(1:26)|27|(1:(1:43)(3:(3:37|(1:41)|42)|35|36))(2:30|31))(2:59|60))(1:61))(3:90|(1:92)|74)|62|63|64|(2:66|(1:68)(2:80|81))(2:82|(1:84)(2:85|86))|69|(1:71)(2:76|(2:78|79))|72|(14:75|11|12|13|(0)(0)|18|(0)(0)|21|(0)(0)|24|(0)|27|(0)|(0)(0))|74))|93|6|(0)(0)|62|63|64|(0)(0)|69|(0)(0)|72|(0)|74) */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0098, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00ab, code lost:
    
        r13 = new e6d0.a.c(r13.getB(), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fc A[Catch: all -> 0x0113, TryCatch #0 {all -> 0x0113, blocks: (B:13:0x00f8, B:15:0x00fc, B:17:0x0107, B:49:0x0115, B:50:0x011a, B:51:0x011b, B:54:0x0120, B:55:0x0125), top: B:12:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b A[Catch: all -> 0x0113, TryCatch #0 {all -> 0x0113, blocks: (B:13:0x00f8, B:15:0x00fc, B:17:0x0107, B:49:0x0115, B:50:0x011a, B:51:0x011b, B:54:0x0120, B:55:0x0125), top: B:12:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0081 A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:64:0x007d, B:66:0x0081, B:68:0x008c, B:80:0x009a, B:81:0x009f, B:82:0x00a0, B:85:0x00a5, B:86:0x00aa), top: B:63:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a0 A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:64:0x007d, B:66:0x0081, B:68:0x008c, B:80:0x009a, B:81:0x009f, B:82:0x00a0, B:85:0x00a5, B:86:0x00aa), top: B:63:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0057  */
    @Override // defpackage.l2d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PlusHomeRestExperimentsDataSource$getExperiments$1 plusHomeRestExperimentsDataSource$getExperiments$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        st50 st50Var;
        l6d0 l6d0Var;
        e6d0 e6d0Var;
        Object a;
        Object obj;
        e6d0 e6d0Var2;
        boolean z;
        k2d0 k2d0Var;
        if (continuationImpl instanceof PlusHomeRestExperimentsDataSource$getExperiments$1) {
            plusHomeRestExperimentsDataSource$getExperiments$1 = (PlusHomeRestExperimentsDataSource$getExperiments$1) continuationImpl;
            int i2 = plusHomeRestExperimentsDataSource$getExperiments$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusHomeRestExperimentsDataSource$getExperiments$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = plusHomeRestExperimentsDataSource$getExperiments$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusHomeRestExperimentsDataSource$getExperiments$1.label;
                tms tmsVar = this.f;
                m6d0 m6d0Var = this.d;
                CommonExperimentsControllerApi commonExperimentsControllerApi = this.a;
                l6d0 l6d0Var2 = l6d0.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    st50 st50Var2 = new st50(this.e);
                    String str = (String) this.b.invoke();
                    plusHomeRestExperimentsDataSource$getExperiments$1.L$0 = st50Var2;
                    plusHomeRestExperimentsDataSource$getExperiments$1.L$1 = l6d0Var2;
                    plusHomeRestExperimentsDataSource$getExperiments$1.label = 1;
                    Object a2 = commonExperimentsControllerApi.a(str, st50Var2, plusHomeRestExperimentsDataSource$getExperiments$1);
                    if (a2 != coroutineSingletons) {
                        st50Var = st50Var2;
                        obj2 = a2;
                        l6d0Var = l6d0Var2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l6d0Var2 = (l6d0) plusHomeRestExperimentsDataSource$getExperiments$1.L$2;
                    obj = plusHomeRestExperimentsDataSource$getExperiments$1.L$1;
                    kotlin.b.b(obj2);
                    e6d0Var2 = (e6d0) obj2;
                    try {
                        if (!(e6d0Var2 instanceof e6d0.b)) {
                            pt50 pt50Var = ((vt50) ((e6d0.b) e6d0Var2).a).b;
                            if (pt50Var == null) {
                                throw new IllegalArgumentException("mapNotNullCatching failed!");
                            }
                            e6d0Var2 = new e6d0.b(pt50Var, ((e6d0.b) e6d0Var2).b);
                        } else if (!(e6d0Var2 instanceof e6d0.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } catch (Throwable th) {
                        e6d0Var2 = new e6d0.a.c(e6d0Var2.getB(), th);
                    }
                    l6d0Var2.getClass();
                    m6d0Var.a(e6d0Var2);
                    if (!(e6d0Var2 instanceof e6d0.b)) {
                        e6d0.b bVar = (e6d0.b) e6d0Var2;
                        e6d0Var2 = new e6d0.b(tmsVar.j((pt50) bVar.a), bVar.b);
                    } else if (!(e6d0Var2 instanceof e6d0.a)) {
                        w511.b();
                        return null;
                    }
                    Object a3 = i6d0.a(e6d0Var2);
                    z = obj instanceof Result.Failure;
                    k2d0Var = (k2d0) (!z ? null : obj);
                    boolean z2 = a3 instanceof Result.Failure;
                    k2d0 k2d0Var2 = (k2d0) (z2 ? null : a3);
                    if (k2d0Var == null && k2d0Var2 != null) {
                        return new k2d0(b(k2d0Var.a, k2d0Var2.a), b(k2d0Var.b, k2d0Var2.b), kotlin.collections.a.I(kotlin.collections.a.m0(k2d0Var2.c, k2d0Var.c)), v4r0.h(k2d0Var.d, k2d0Var2.d));
                    }
                    if (z) {
                        return obj;
                    }
                    if (z2) {
                        Throwable a4 = Result.a(obj);
                        if (a4 == null && (a4 = Result.a(a3)) == null) {
                            a4 = new IllegalStateException("Failed to load experiments");
                        }
                        a3 = new Result.Failure(a4);
                    }
                    return a3;
                }
                l6d0Var = (l6d0) plusHomeRestExperimentsDataSource$getExperiments$1.L$1;
                st50Var = (st50) plusHomeRestExperimentsDataSource$getExperiments$1.L$0;
                kotlin.b.b(obj2);
                e6d0Var = (e6d0) obj2;
                if (!(e6d0Var instanceof e6d0.b)) {
                    pt50 pt50Var2 = ((vt50) ((e6d0.b) e6d0Var).a).b;
                    if (pt50Var2 == null) {
                        throw new IllegalArgumentException("mapNotNullCatching failed!");
                    }
                    e6d0Var = new e6d0.b(pt50Var2, ((e6d0.b) e6d0Var).b);
                } else if (!(e6d0Var instanceof e6d0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                l6d0Var.getClass();
                m6d0Var.a(e6d0Var);
                if (!(e6d0Var instanceof e6d0.b)) {
                    e6d0.b bVar2 = (e6d0.b) e6d0Var;
                    e6d0Var = new e6d0.b(tmsVar.j((pt50) bVar2.a), bVar2.b);
                } else if (!(e6d0Var instanceof e6d0.a)) {
                    w511.b();
                    return null;
                }
                Object a5 = i6d0.a(e6d0Var);
                String str2 = (String) this.c.invoke();
                plusHomeRestExperimentsDataSource$getExperiments$1.L$0 = null;
                plusHomeRestExperimentsDataSource$getExperiments$1.L$1 = a5;
                plusHomeRestExperimentsDataSource$getExperiments$1.L$2 = l6d0Var2;
                plusHomeRestExperimentsDataSource$getExperiments$1.label = 2;
                a = commonExperimentsControllerApi.a(str2, st50Var, plusHomeRestExperimentsDataSource$getExperiments$1);
                if (a != coroutineSingletons) {
                    obj = a5;
                    obj2 = a;
                    e6d0Var2 = (e6d0) obj2;
                    if (!(e6d0Var2 instanceof e6d0.b)) {
                    }
                    l6d0Var2.getClass();
                    m6d0Var.a(e6d0Var2);
                    if (!(e6d0Var2 instanceof e6d0.b)) {
                    }
                    Object a32 = i6d0.a(e6d0Var2);
                    z = obj instanceof Result.Failure;
                    k2d0Var = (k2d0) (!z ? null : obj);
                    boolean z22 = a32 instanceof Result.Failure;
                    k2d0 k2d0Var22 = (k2d0) (z22 ? null : a32);
                    if (k2d0Var == null) {
                    }
                    if (z) {
                    }
                }
                return coroutineSingletons;
            }
        }
        plusHomeRestExperimentsDataSource$getExperiments$1 = new PlusHomeRestExperimentsDataSource$getExperiments$1(this, continuationImpl);
        Object obj22 = plusHomeRestExperimentsDataSource$getExperiments$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusHomeRestExperimentsDataSource$getExperiments$1.label;
        tms tmsVar2 = this.f;
        m6d0 m6d0Var2 = this.d;
        CommonExperimentsControllerApi commonExperimentsControllerApi2 = this.a;
        l6d0 l6d0Var22 = l6d0.a;
        if (i != 0) {
        }
        e6d0Var = (e6d0) obj22;
        if (!(e6d0Var instanceof e6d0.b)) {
        }
        l6d0Var.getClass();
        m6d0Var2.a(e6d0Var);
        if (!(e6d0Var instanceof e6d0.b)) {
        }
        Object a52 = i6d0.a(e6d0Var);
        String str22 = (String) this.c.invoke();
        plusHomeRestExperimentsDataSource$getExperiments$1.L$0 = null;
        plusHomeRestExperimentsDataSource$getExperiments$1.L$1 = a52;
        plusHomeRestExperimentsDataSource$getExperiments$1.L$2 = l6d0Var22;
        plusHomeRestExperimentsDataSource$getExperiments$1.label = 2;
        a = commonExperimentsControllerApi2.a(str22, st50Var, plusHomeRestExperimentsDataSource$getExperiments$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
