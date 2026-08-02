package com.yandex.passport.internal.usecase;

import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.report.xb;
import com.yandex.passport.internal.report.yd;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class w0 {
    public final com.yandex.passport.internal.core.accounts.d a;
    public final com.yandex.passport.internal.storage.a b;
    public final u1 c;
    public final com.yandex.passport.internal.flags.j d;
    public final com.yandex.passport.internal.report.reporters.d1 e;

    public w0(com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.storage.a aVar, u1 u1Var, com.yandex.passport.internal.flags.j jVar, com.yandex.passport.internal.report.reporters.d1 d1Var) {
        this.a = dVar;
        this.b = aVar;
        this.c = u1Var;
        this.d = jVar;
        this.e = d1Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|(1:(1:(7:11|12|13|(3:16|(2:18|19)(1:21)|14)|22|23|24)(2:26|27))(2:28|29))(4:31|(10:33|(4:36|(3:41|42|43)|44|34)|47|48|(4:50|(2:53|51)|54|55)|56|(2:59|57)|60|61|(2:63|19)(1:64))|23|24)|30|13|(1:14)|22|23|24))|69|6|7|(0)(0)|30|13|(1:14)|22|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0038, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0138, code lost:
    
        r13 = com.yandex.passport.common.logger.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0140, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0142, code lost:
    
        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.LogLevel.ERROR, null, "An error occurred while making all tokens master related: " + r12, 8);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0114 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:12:0x0033, B:14:0x010e, B:16:0x0114, B:29:0x004d, B:30:0x0108, B:33:0x0067, B:34:0x007a, B:36:0x0080, B:39:0x008d, B:42:0x0093, B:48:0x0097, B:50:0x009f, B:51:0x00ae, B:53:0x00b4, B:55:0x00c2, B:56:0x00d4, B:57:0x00e3, B:59:0x00e9, B:61:0x00f7), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MakeAllTokenMasterRelatedUseCase$execute$1 makeAllTokenMasterRelatedUseCase$execute$1;
        int i;
        com.yandex.passport.internal.b a;
        w0 w0Var;
        List list;
        Iterator it;
        if (continuationImpl instanceof MakeAllTokenMasterRelatedUseCase$execute$1) {
            makeAllTokenMasterRelatedUseCase$execute$1 = (MakeAllTokenMasterRelatedUseCase$execute$1) continuationImpl;
            int i2 = makeAllTokenMasterRelatedUseCase$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                makeAllTokenMasterRelatedUseCase$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = makeAllTokenMasterRelatedUseCase$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = makeAllTokenMasterRelatedUseCase$execute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (((Boolean) this.d.b(com.yandex.passport.internal.flags.q.d)).booleanValue()) {
                        a = this.a.a();
                        ArrayList f = a.f();
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = f.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            ModernAccount modernAccount = (ModernAccount) next;
                            if (modernAccount.getMasterUid() != null && !modernAccount.getHasMasterToken()) {
                                arrayList.add(next);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            com.yandex.passport.internal.report.reporters.d1 d1Var = this.e;
                            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                arrayList2.add(((ModernAccount) it3.next()).getUid());
                            }
                            d1Var.getClass();
                            d1Var.f(xb.w, new yd(arrayList2));
                        }
                        com.yandex.passport.internal.storage.a aVar = this.b;
                        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList, 10));
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(((ModernAccount) it4.next()).getUid());
                        }
                        makeAllTokenMasterRelatedUseCase$execute$1.L$0 = this;
                        makeAllTokenMasterRelatedUseCase$execute$1.L$1 = a;
                        makeAllTokenMasterRelatedUseCase$execute$1.L$2 = arrayList;
                        makeAllTokenMasterRelatedUseCase$execute$1.label = 1;
                        if (aVar.b(arrayList3, makeAllTokenMasterRelatedUseCase$execute$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        w0Var = this;
                        list = arrayList;
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) makeAllTokenMasterRelatedUseCase$execute$1.L$2;
                    a = (com.yandex.passport.internal.b) makeAllTokenMasterRelatedUseCase$execute$1.L$1;
                    w0Var = (w0) makeAllTokenMasterRelatedUseCase$execute$1.L$0;
                    kotlin.b.b(obj);
                    while (it.hasNext()) {
                        ModernAccount modernAccount2 = (ModernAccount) it.next();
                        u1 u1Var = w0Var.c;
                        v1 v1Var = new v1(modernAccount2.getUid(), modernAccount2.getMasterUid(), a);
                        makeAllTokenMasterRelatedUseCase$execute$1.L$0 = w0Var;
                        makeAllTokenMasterRelatedUseCase$execute$1.L$1 = a;
                        makeAllTokenMasterRelatedUseCase$execute$1.L$2 = it;
                        makeAllTokenMasterRelatedUseCase$execute$1.label = 2;
                        if (u1Var.a(v1Var, makeAllTokenMasterRelatedUseCase$execute$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                list = (List) makeAllTokenMasterRelatedUseCase$execute$1.L$2;
                a = (com.yandex.passport.internal.b) makeAllTokenMasterRelatedUseCase$execute$1.L$1;
                w0Var = (w0) makeAllTokenMasterRelatedUseCase$execute$1.L$0;
                kotlin.b.b(obj);
                it = list.iterator();
                while (it.hasNext()) {
                }
                return zy11.a;
            }
        }
        makeAllTokenMasterRelatedUseCase$execute$1 = new MakeAllTokenMasterRelatedUseCase$execute$1(this, continuationImpl);
        Object obj2 = makeAllTokenMasterRelatedUseCase$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = makeAllTokenMasterRelatedUseCase$execute$1.label;
        if (i != 0) {
        }
        it = list.iterator();
        while (it.hasNext()) {
        }
        return zy11.a;
    }
}
