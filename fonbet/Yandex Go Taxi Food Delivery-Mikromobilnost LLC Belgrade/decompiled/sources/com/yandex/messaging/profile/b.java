package com.yandex.messaging.profile;

import android.os.SystemClock;
import defpackage.at2;
import defpackage.bb1;
import defpackage.fsh;
import defpackage.n0c;
import defpackage.ny61;
import defpackage.o5e;
import defpackage.sls;
import defpackage.tfx;
import defpackage.w3c;
import defpackage.x22;
import defpackage.xdf0;
import defpackage.ys2;
import defpackage.z83;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes15.dex */
public final class b {
    public final at2 a;
    public final w3c b;
    public final x22 c;
    public final xdf0 d;
    public final o5e e;
    public final com.yandex.messaging.utils.b f;
    public final n0c g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;

    public b(at2 at2Var, w3c w3cVar, x22 x22Var, xdf0 xdf0Var, o5e o5eVar, com.yandex.messaging.utils.b bVar, n0c n0cVar) {
        this.a = at2Var;
        this.b = w3cVar;
        this.c = x22Var;
        this.d = xdf0Var;
        this.e = o5eVar;
        this.f = bVar;
        this.g = n0cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        if (defpackage.bb1.l0(r0) != r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, ContinuationImpl continuationImpl) {
        AppDatabaseCleaner$tryCleanup$1 appDatabaseCleaner$tryCleanup$1;
        int i;
        b bVar2;
        bVar.getClass();
        if (continuationImpl instanceof AppDatabaseCleaner$tryCleanup$1) {
            appDatabaseCleaner$tryCleanup$1 = (AppDatabaseCleaner$tryCleanup$1) continuationImpl;
            int i2 = appDatabaseCleaner$tryCleanup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                appDatabaseCleaner$tryCleanup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = appDatabaseCleaner$tryCleanup$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = appDatabaseCleaner$tryCleanup$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (bVar.h) {
                        if (!bVar.i) {
                            appDatabaseCleaner$tryCleanup$1.L$0 = bVar;
                            appDatabaseCleaner$tryCleanup$1.L$1 = bVar;
                            appDatabaseCleaner$tryCleanup$1.label = 1;
                            obj = bVar.b(appDatabaseCleaner$tryCleanup$1);
                            if (obj != coroutineSingletons) {
                                bVar2 = bVar;
                            }
                            return coroutineSingletons;
                        }
                        if (bVar.j && !bVar.k) {
                            appDatabaseCleaner$tryCleanup$1.L$0 = bVar;
                            appDatabaseCleaner$tryCleanup$1.L$1 = null;
                            appDatabaseCleaner$tryCleanup$1.label = 2;
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar = (b) appDatabaseCleaner$tryCleanup$1.L$0;
                    kotlin.b.b(obj);
                    w3c w3cVar = bVar.b;
                    at2 at2Var = bVar.a;
                    boolean q0 = at2Var.q0();
                    z83.i();
                    if (q0) {
                        w3cVar.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        ys2 U = at2Var.U();
                        bVar.c.reportEvent("tech_db_cleanup_checkpoint", kotlin.collections.b.i(new Pair(RemoteBioParameters.TIME, Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime)), new Pair("error", Long.valueOf(U.a)), new Pair("wal_pages", Long.valueOf(U.b)), new Pair("db_pages", Long.valueOf(U.c))));
                    }
                    bVar.k = true;
                    return zy11Var;
                }
                bVar = (b) appDatabaseCleaner$tryCleanup$1.L$1;
                bVar2 = (b) appDatabaseCleaner$tryCleanup$1.L$0;
                kotlin.b.b(obj);
                bVar.j = ((Boolean) obj).booleanValue();
                bVar2.i = true;
                bVar = bVar2;
                if (bVar.j) {
                    appDatabaseCleaner$tryCleanup$1.L$0 = bVar;
                    appDatabaseCleaner$tryCleanup$1.L$1 = null;
                    appDatabaseCleaner$tryCleanup$1.label = 2;
                }
                return zy11Var;
            }
        }
        appDatabaseCleaner$tryCleanup$1 = new AppDatabaseCleaner$tryCleanup$1(bVar, continuationImpl);
        Object obj2 = appDatabaseCleaner$tryCleanup$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = appDatabaseCleaner$tryCleanup$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        bVar.j = ((Boolean) obj2).booleanValue();
        bVar2.i = true;
        bVar = bVar2;
        if (bVar.j) {
        }
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x019c -> B:10:0x01a1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        AppDatabaseCleaner$deleteUnusedRows$1 appDatabaseCleaner$deleteUnusedRows$1;
        int i;
        long elapsedRealtime;
        int i2;
        Ref$IntRef ref$IntRef;
        int i3;
        tfx[] tfxVarArr;
        b bVar = this;
        if (continuationImpl instanceof AppDatabaseCleaner$deleteUnusedRows$1) {
            appDatabaseCleaner$deleteUnusedRows$1 = (AppDatabaseCleaner$deleteUnusedRows$1) continuationImpl;
            int i4 = appDatabaseCleaner$deleteUnusedRows$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                appDatabaseCleaner$deleteUnusedRows$1.label = i4 - Integer.MIN_VALUE;
                Object obj = appDatabaseCleaner$deleteUnusedRows$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = appDatabaseCleaner$deleteUnusedRows$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    at2 at2Var = bVar.a;
                    boolean q0 = at2Var.q0();
                    z83.i();
                    if (!q0) {
                        return Boolean.FALSE;
                    }
                    bVar.b.getClass();
                    elapsedRealtime = SystemClock.elapsedRealtime();
                    fsh j = at2Var.j();
                    Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                    i2 = 17;
                    tfx[] tfxVarArr2 = {new AppDatabaseCleaner$deleteUnusedRows$atomicDeleteHandlers$1(0, j, fsh.class, "deleteMemberRows", "deleteMemberRows()I", 0), new AppDatabaseCleaner$deleteUnusedRows$atomicDeleteHandlers$2(0, j, fsh.class, "deleteMemberRightsRows", "deleteMemberRightsRows()I", 0), new AppDatabaseCleaner$deleteUnusedRows$atomicDeleteHandlers$3(0, j, fsh.class, "deleteUserRoleRows", "deleteUserRoleRows()I", 0), new AppDatabaseCleaner$deleteUnusedRows$atomicDeleteHandlers$4(0, j, fsh.class, "deleteChatMessageRows", "deleteChatMessageRows()I", 0), new AppDatabaseCleaner$deleteUnusedRows$atomicDeleteHandlers$5(0, j, fsh.class, "deleteChatMessageViewRows", "deleteChatMessageViewRows()I", 0), new AppDatabaseCleaner$deleteUnusedRows$atomicDeleteHandlers$6(0, j, fsh.class, "deleteChatMetadataRows", "deleteChatMetadataRows()I", 0), new AppDatabaseCleaner$deleteUnusedRows$atomicDeleteHandlers$7(0, j, fsh.class, "deleteChatNotificationRows", "deleteChatNotificationRows()I", 0), new AppDatabaseCleaner$deleteUnusedRows$atomicDeleteHandlers$8(0, j, fsh.class, "deleteThreadViewRows", "deleteThreadViewRows()I", 0), new AppDatabaseCleaner$deleteUnusedRows$atomicDeleteHandlers$9(0, j, fsh.class, "deleteThreadMessageViewRows", "deleteThreadMessageViewRows()I", 0), new AppDatabaseCleaner$deleteUnusedRows$atomicDeleteHandlers$10(0, j, fsh.class, "deleteMessageTranslationRows", "deleteMessageTranslationRows()I", 0), new AppDatabaseCleaner$deleteUnusedRows$atomicDeleteHandlers$11(0, j, fsh.class, "deleteChatTranslationRows", "deleteChatTranslationRows()I", 0), new AppDatabaseCleaner$deleteUnusedRows$atomicDeleteHandlers$12(0, j, fsh.class, "deleteChatEventRows", "deleteChatEventRows()I", 0), new AppDatabaseCleaner$deleteUnusedRows$atomicDeleteHandlers$13(0, j, fsh.class, "deleteChatEditTimestampRows", "deleteChatEditTimestampRows()I", 0), new AppDatabaseCleaner$deleteUnusedRows$atomicDeleteHandlers$14(0, j, fsh.class, "deleteChatTimelineVersionRows", "deleteChatTimelineVersionRows()I", 0), new AppDatabaseCleaner$deleteUnusedRows$atomicDeleteHandlers$15(0, j, fsh.class, "deleteChatFilterRefRows", "deleteChatFilterRefRows()I", 0), new AppDatabaseCleaner$deleteUnusedRows$atomicDeleteHandlers$16(0, j, fsh.class, "deleteChatMiniappRows", "deleteChatMiniappRows()I", 0), new AppDatabaseCleaner$deleteUnusedRows$atomicDeleteHandlers$17(0, j, fsh.class, "deletePersonalMentionRows", "deletePersonalMentionRows()I", 0)};
                    ref$IntRef = ref$IntRef2;
                    i3 = 0;
                    tfxVarArr = tfxVarArr2;
                    if (i3 < i2) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = appDatabaseCleaner$deleteUnusedRows$1.I$1;
                    int i6 = appDatabaseCleaner$deleteUnusedRows$1.I$0;
                    elapsedRealtime = appDatabaseCleaner$deleteUnusedRows$1.J$0;
                    tfx tfxVar = (tfx) appDatabaseCleaner$deleteUnusedRows$1.L$3;
                    tfxVarArr = (tfx[]) appDatabaseCleaner$deleteUnusedRows$1.L$2;
                    ref$IntRef = (Ref$IntRef) appDatabaseCleaner$deleteUnusedRows$1.L$1;
                    b bVar2 = (b) appDatabaseCleaner$deleteUnusedRows$1.L$0;
                    kotlin.b.b(obj);
                    int i7 = i5;
                    bVar = bVar2;
                    boolean q02 = bVar.a.q0();
                    z83.i();
                    if (q02) {
                        return Boolean.FALSE;
                    }
                    ref$IntRef.element = ((Number) ((sls) tfxVar).invoke()).intValue() + ref$IntRef.element;
                    int i8 = i6 + 1;
                    i2 = i7;
                    i3 = i8;
                    if (i3 < i2) {
                        x22 x22Var = bVar.c;
                        bVar.b.getClass();
                        x22Var.reportEvent("tech_db_cleanup_unused", kotlin.collections.b.i(new Pair(RemoteBioParameters.TIME, new Long(SystemClock.elapsedRealtime() - elapsedRealtime)), new Pair("deleted", new Integer(ref$IntRef.element))));
                        return Boolean.valueOf(ref$IntRef.element > 0);
                    }
                    tfxVar = tfxVarArr[i3];
                    appDatabaseCleaner$deleteUnusedRows$1.L$0 = bVar;
                    appDatabaseCleaner$deleteUnusedRows$1.L$1 = ref$IntRef;
                    appDatabaseCleaner$deleteUnusedRows$1.L$2 = tfxVarArr;
                    appDatabaseCleaner$deleteUnusedRows$1.L$3 = tfxVar;
                    appDatabaseCleaner$deleteUnusedRows$1.J$0 = elapsedRealtime;
                    appDatabaseCleaner$deleteUnusedRows$1.I$0 = i3;
                    appDatabaseCleaner$deleteUnusedRows$1.I$1 = i2;
                    appDatabaseCleaner$deleteUnusedRows$1.label = 1;
                    if (bb1.l0(appDatabaseCleaner$deleteUnusedRows$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    int i9 = i2;
                    i6 = i3;
                    i7 = i9;
                    boolean q022 = bVar.a.q0();
                    z83.i();
                    if (q022) {
                    }
                }
            }
        }
        appDatabaseCleaner$deleteUnusedRows$1 = new AppDatabaseCleaner$deleteUnusedRows$1(bVar, continuationImpl);
        Object obj2 = appDatabaseCleaner$deleteUnusedRows$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = appDatabaseCleaner$deleteUnusedRows$1.label;
        if (i != 0) {
        }
    }
}
