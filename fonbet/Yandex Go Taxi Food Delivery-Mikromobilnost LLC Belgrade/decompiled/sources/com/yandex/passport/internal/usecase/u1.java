package com.yandex.passport.internal.usecase;

import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.exception.NetworkException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.data.exceptions.ChallengeRequiredException;
import com.yandex.passport.data.exceptions.CurrentMuidMissingException;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.wb;
import com.yandex.passport.internal.report.yb;
import com.yandex.passport.internal.report.yd;
import defpackage.ny61;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class u1 {
    public final com.yandex.passport.internal.usecase.ui.g a;
    public final com.yandex.passport.internal.storage.a b;
    public final com.yandex.passport.internal.report.reporters.d1 c;
    public final com.yandex.passport.internal.flags.j d;
    public final com.yandex.passport.internal.core.accounts.t e;

    public u1(com.yandex.passport.internal.usecase.ui.g gVar, com.yandex.passport.internal.storage.a aVar, com.yandex.passport.internal.report.reporters.d1 d1Var, com.yandex.passport.internal.flags.j jVar, com.yandex.passport.internal.core.accounts.t tVar) {
        this.a = gVar;
        this.b = aVar;
        this.c = d1Var;
        this.d = jVar;
        this.e = tVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x021d, code lost:
    
        if (r14.b(r1, true, r2) == r3) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ce A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #3 {all -> 0x005f, blocks: (B:24:0x005a, B:25:0x01c4, B:27:0x01ce), top: B:23:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0225 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:30:0x0221, B:32:0x0225, B:44:0x006e), top: B:43:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019d A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:49:0x0191, B:51:0x019d, B:53:0x01a1, B:55:0x01a5, B:58:0x01aa, B:61:0x01e9, B:63:0x01f3, B:64:0x020d, B:82:0x00de, B:83:0x00f1, B:85:0x00f7, B:87:0x0107, B:92:0x0111, B:93:0x0115, B:95:0x011b, B:99:0x012a, B:101:0x012e, B:103:0x0138, B:104:0x0152, B:106:0x0155), top: B:81:0x00de }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v1 v1Var, ContinuationImpl continuationImpl) {
        UpdateMasterTokenIfPossibleUseCase$execute$1 updateMasterTokenIfPossibleUseCase$execute$1;
        Object obj;
        int i;
        u1 u1Var;
        com.yandex.passport.internal.b bVar;
        v1 v1Var2;
        u1 u1Var2;
        Object obj2;
        ModernAccount modernAccount;
        Object value;
        Throwable a;
        v1 v1Var3;
        Object obj3;
        Throwable th;
        Uid c;
        v1 v1Var4;
        if (continuationImpl instanceof UpdateMasterTokenIfPossibleUseCase$execute$1) {
            updateMasterTokenIfPossibleUseCase$execute$1 = (UpdateMasterTokenIfPossibleUseCase$execute$1) continuationImpl;
            int i2 = updateMasterTokenIfPossibleUseCase$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateMasterTokenIfPossibleUseCase$execute$1.label = i2 - Integer.MIN_VALUE;
                obj = updateMasterTokenIfPossibleUseCase$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateMasterTokenIfPossibleUseCase$execute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.b a2 = v1Var.a();
                    Uid c2 = v1Var.c();
                    updateMasterTokenIfPossibleUseCase$execute$1.L$0 = this;
                    updateMasterTokenIfPossibleUseCase$execute$1.L$1 = v1Var;
                    updateMasterTokenIfPossibleUseCase$execute$1.L$2 = a2;
                    updateMasterTokenIfPossibleUseCase$execute$1.label = 1;
                    Object c3 = this.b.c(c2, updateMasterTokenIfPossibleUseCase$execute$1);
                    if (c3 != coroutineSingletons) {
                        u1Var = this;
                        bVar = a2;
                        obj = c3;
                        v1Var2 = v1Var;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        v1Var2 = (v1) updateMasterTokenIfPossibleUseCase$execute$1.L$1;
                        u1 u1Var3 = (u1) updateMasterTokenIfPossibleUseCase$execute$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            u1Var = u1Var3;
                            value = ((Result) obj).getValue();
                            a = Result.a(value);
                        } catch (Throwable th2) {
                            th = th2;
                            u1Var2 = u1Var3;
                            c = v1Var2.c();
                            updateMasterTokenIfPossibleUseCase$execute$1.L$0 = v1Var2;
                            updateMasterTokenIfPossibleUseCase$execute$1.L$1 = th;
                            updateMasterTokenIfPossibleUseCase$execute$1.L$2 = null;
                            updateMasterTokenIfPossibleUseCase$execute$1.L$3 = null;
                            updateMasterTokenIfPossibleUseCase$execute$1.label = 5;
                            if (u1Var2.b(c, false, updateMasterTokenIfPossibleUseCase$execute$1) != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        if (a != null) {
                            if (!(a instanceof CurrentMuidMissingException) && !(a instanceof ChallengeRequiredException) && !(a instanceof NetworkException)) {
                                Uid c4 = v1Var2.c();
                                updateMasterTokenIfPossibleUseCase$execute$1.L$0 = u1Var;
                                updateMasterTokenIfPossibleUseCase$execute$1.L$1 = v1Var2;
                                updateMasterTokenIfPossibleUseCase$execute$1.L$2 = value;
                                updateMasterTokenIfPossibleUseCase$execute$1.L$3 = a;
                                updateMasterTokenIfPossibleUseCase$execute$1.label = 4;
                                if (u1Var.b(c4, false, updateMasterTokenIfPossibleUseCase$execute$1) != coroutineSingletons) {
                                    v1Var3 = v1Var2;
                                    u1Var2 = u1Var;
                                    obj3 = value;
                                    th = a;
                                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    }
                                    value = obj3;
                                    v1Var2 = v1Var3;
                                    if (!(value instanceof Result.Failure)) {
                                    }
                                    return Boolean.FALSE;
                                }
                                return coroutineSingletons;
                            }
                            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Can't make master enabled token because of backend error for: " + v1Var2.c(), 8);
                            }
                            Uid c5 = v1Var2.c();
                            updateMasterTokenIfPossibleUseCase$execute$1.L$0 = u1Var;
                            updateMasterTokenIfPossibleUseCase$execute$1.L$1 = v1Var2;
                            updateMasterTokenIfPossibleUseCase$execute$1.L$2 = value;
                            updateMasterTokenIfPossibleUseCase$execute$1.label = 3;
                        }
                        u1Var2 = u1Var;
                        if (!(value instanceof Result.Failure)) {
                        }
                        return Boolean.FALSE;
                    }
                    if (i == 3) {
                        value = updateMasterTokenIfPossibleUseCase$execute$1.L$2;
                        v1Var2 = (v1) updateMasterTokenIfPossibleUseCase$execute$1.L$1;
                        u1Var2 = (u1) updateMasterTokenIfPossibleUseCase$execute$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            if (!(value instanceof Result.Failure)) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            c = v1Var2.c();
                            updateMasterTokenIfPossibleUseCase$execute$1.L$0 = v1Var2;
                            updateMasterTokenIfPossibleUseCase$execute$1.L$1 = th;
                            updateMasterTokenIfPossibleUseCase$execute$1.L$2 = null;
                            updateMasterTokenIfPossibleUseCase$execute$1.L$3 = null;
                            updateMasterTokenIfPossibleUseCase$execute$1.label = 5;
                            if (u1Var2.b(c, false, updateMasterTokenIfPossibleUseCase$execute$1) != coroutineSingletons) {
                                v1Var4 = v1Var2;
                                com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                }
                                return Boolean.FALSE;
                            }
                            return coroutineSingletons;
                        }
                        return Boolean.FALSE;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = (Throwable) updateMasterTokenIfPossibleUseCase$execute$1.L$1;
                        v1Var4 = (v1) updateMasterTokenIfPossibleUseCase$execute$1.L$0;
                        kotlin.b.b(obj);
                        com.yandex.passport.common.logger.c cVar32 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Can not make master enabled token because of error for: " + v1Var4.c(), th);
                        }
                        return Boolean.FALSE;
                    }
                    th = (Throwable) updateMasterTokenIfPossibleUseCase$execute$1.L$3;
                    obj3 = updateMasterTokenIfPossibleUseCase$execute$1.L$2;
                    v1Var3 = (v1) updateMasterTokenIfPossibleUseCase$execute$1.L$1;
                    u1Var2 = (u1) updateMasterTokenIfPossibleUseCase$execute$1.L$0;
                    try {
                        kotlin.b.b(obj);
                        com.yandex.passport.common.logger.c cVar4 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Can not make master enabled token because of error for: " + v1Var3.c(), th);
                        }
                        value = obj3;
                        v1Var2 = v1Var3;
                        if (!(value instanceof Result.Failure)) {
                            com.yandex.passport.internal.report.reporters.d1 d1Var = u1Var2.c;
                            Uid c6 = v1Var2.c();
                            d1Var.getClass();
                            d1Var.f(yb.w, new yd(c6));
                            return Boolean.TRUE;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        v1Var2 = v1Var3;
                        c = v1Var2.c();
                        updateMasterTokenIfPossibleUseCase$execute$1.L$0 = v1Var2;
                        updateMasterTokenIfPossibleUseCase$execute$1.L$1 = th;
                        updateMasterTokenIfPossibleUseCase$execute$1.L$2 = null;
                        updateMasterTokenIfPossibleUseCase$execute$1.L$3 = null;
                        updateMasterTokenIfPossibleUseCase$execute$1.label = 5;
                        if (u1Var2.b(c, false, updateMasterTokenIfPossibleUseCase$execute$1) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    return Boolean.FALSE;
                }
                bVar = (com.yandex.passport.internal.b) updateMasterTokenIfPossibleUseCase$execute$1.L$2;
                v1Var2 = (v1) updateMasterTokenIfPossibleUseCase$execute$1.L$1;
                u1Var = (u1) updateMasterTokenIfPossibleUseCase$execute$1.L$0;
                kotlin.b.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return Boolean.FALSE;
                }
                ModernAccount e = bVar.e(v1Var2.c());
                if (e != null && e.getHasMasterToken()) {
                    return Boolean.FALSE;
                }
                try {
                    ArrayList c7 = u1Var.e.c(v1Var2.b(), bVar);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = c7.iterator();
                    while (it.hasNext()) {
                        ModernAccount e2 = bVar.e(((com.yandex.passport.internal.entities.k) it.next()).d());
                        if (e2 != null) {
                            arrayList.add(e2);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (((ModernAccount) obj2).getHasMasterToken()) {
                            break;
                        }
                    }
                    modernAccount = (ModernAccount) obj2;
                } catch (Throwable th5) {
                    th = th5;
                    u1Var2 = u1Var;
                    c = v1Var2.c();
                    updateMasterTokenIfPossibleUseCase$execute$1.L$0 = v1Var2;
                    updateMasterTokenIfPossibleUseCase$execute$1.L$1 = th;
                    updateMasterTokenIfPossibleUseCase$execute$1.L$2 = null;
                    updateMasterTokenIfPossibleUseCase$execute$1.L$3 = null;
                    updateMasterTokenIfPossibleUseCase$execute$1.label = 5;
                    if (u1Var2.b(c, false, updateMasterTokenIfPossibleUseCase$execute$1) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (modernAccount == null) {
                    com.yandex.passport.common.logger.c cVar5 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Neighbour account with Master related token not found for uid " + v1Var2.c(), 8);
                    }
                    return Boolean.FALSE;
                }
                com.yandex.passport.internal.usecase.ui.g gVar = u1Var.a;
                Uid c8 = v1Var2.c();
                Uid b = v1Var2.b();
                Uid uid = modernAccount.getUid();
                MasterToken masterToken = modernAccount.getMasterToken();
                Environment environment = modernAccount.getUid().getEnvironment();
                AnalyticsFromValue.Companion.getClass();
                com.yandex.passport.internal.usecase.ui.f fVar = new com.yandex.passport.internal.usecase.ui.f(c8, b, uid, masterToken, environment, com.yandex.passport.internal.analytics.a.a(), modernAccount.getLocationId());
                updateMasterTokenIfPossibleUseCase$execute$1.L$0 = u1Var;
                updateMasterTokenIfPossibleUseCase$execute$1.L$1 = v1Var2;
                updateMasterTokenIfPossibleUseCase$execute$1.L$2 = null;
                updateMasterTokenIfPossibleUseCase$execute$1.label = 2;
                obj = gVar.a(fVar, updateMasterTokenIfPossibleUseCase$execute$1);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                value = ((Result) obj).getValue();
                a = Result.a(value);
                if (a != null) {
                }
                u1Var2 = u1Var;
                if (!(value instanceof Result.Failure)) {
                }
                return Boolean.FALSE;
            }
        }
        updateMasterTokenIfPossibleUseCase$execute$1 = new UpdateMasterTokenIfPossibleUseCase$execute$1(this, continuationImpl);
        obj = updateMasterTokenIfPossibleUseCase$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateMasterTokenIfPossibleUseCase$execute$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public final Object b(Uid uid, boolean z, Continuation continuation) {
        com.yandex.passport.internal.flags.j jVar = this.d;
        int intValue = z ? ((Number) jVar.b(com.yandex.passport.internal.flags.q.f)).intValue() : ((Number) jVar.b(com.yandex.passport.internal.flags.q.e)).intValue();
        com.yandex.passport.internal.report.reporters.d1 d1Var = this.c;
        d1Var.getClass();
        d1Var.f(wb.w, new yd(uid), new md(intValue, 2));
        Object a = this.b.a(uid, intValue, continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }
}
