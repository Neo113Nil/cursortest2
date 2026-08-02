package com.yandex.go.account.am.domain;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.c2;
import com.yandex.passport.api.i;
import com.yandex.passport.api.k2;
import com.yandex.passport.internal.impl.o;
import defpackage.ep90;
import defpackage.gtq0;
import defpackage.ip90;
import defpackage.mu11;
import defpackage.ny61;
import defpackage.u02;
import defpackage.zy11;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.k;

/* loaded from: classes.dex */
public final class a {
    public final ip90 a;
    public final ep90 b;
    public final k c;
    public final u02 d;

    public a(ip90 ip90Var, ep90 ep90Var, k kVar, u02 u02Var) {
        this.a = ip90Var;
        this.b = ep90Var;
        this.c = kVar;
        this.d = u02Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.yandex.passport.api.k2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PassportUidImpl passportUidImpl, ContinuationImpl continuationImpl) {
        SyncCurrentUidInteractor$checkAndUpdatePassportUid$1 syncCurrentUidInteractor$checkAndUpdatePassportUid$1;
        int i;
        Object r;
        PassportUidImpl passportUidImpl2;
        k2 uid;
        zy11 zy11Var;
        if (continuationImpl instanceof SyncCurrentUidInteractor$checkAndUpdatePassportUid$1) {
            syncCurrentUidInteractor$checkAndUpdatePassportUid$1 = (SyncCurrentUidInteractor$checkAndUpdatePassportUid$1) continuationImpl;
            int i2 = syncCurrentUidInteractor$checkAndUpdatePassportUid$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                syncCurrentUidInteractor$checkAndUpdatePassportUid$1.label = i2 - Integer.MIN_VALUE;
                Object obj = syncCurrentUidInteractor$checkAndUpdatePassportUid$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = syncCurrentUidInteractor$checkAndUpdatePassportUid$1.label;
                if (i != 0) {
                    b.b(obj);
                    com.yandex.passport.api.b a = this.b.a();
                    syncCurrentUidInteractor$checkAndUpdatePassportUid$1.L$0 = passportUidImpl;
                    syncCurrentUidInteractor$checkAndUpdatePassportUid$1.label = 1;
                    r = a.r(syncCurrentUidInteractor$checkAndUpdatePassportUid$1);
                    passportUidImpl2 = passportUidImpl;
                    if (r == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r6 = (k2) syncCurrentUidInteractor$checkAndUpdatePassportUid$1.L$0;
                    b.b(obj);
                    r = ((Result) obj).getValue();
                    passportUidImpl2 = r6;
                }
                if (r instanceof Result.Failure) {
                    r = null;
                }
                i iVar = (i) r;
                uid = iVar != null ? iVar.getUid() : null;
                zy11Var = zy11.a;
                if (uid == null && uid.getValue() == passportUidImpl2.getValue()) {
                    return zy11Var;
                }
                c2 c2Var = new c2();
                c2Var.a = passportUidImpl2;
                ((o) this.a.a()).p.a(c2Var);
                return zy11Var;
            }
        }
        syncCurrentUidInteractor$checkAndUpdatePassportUid$1 = new SyncCurrentUidInteractor$checkAndUpdatePassportUid$1(this, continuationImpl);
        Object obj2 = syncCurrentUidInteractor$checkAndUpdatePassportUid$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = syncCurrentUidInteractor$checkAndUpdatePassportUid$1.label;
        if (i != 0) {
        }
        if (r instanceof Result.Failure) {
        }
        i iVar2 = (i) r;
        if (iVar2 != null) {
        }
        zy11Var = zy11.a;
        if (uid == null) {
        }
        c2 c2Var2 = new c2();
        c2Var2.a = passportUidImpl2;
        ((o) this.a.a()).p.a(c2Var2);
        return zy11Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(7:21|22|(1:24)(1:29)|(2:26|(1:28))|13|(1:15)|16)|12|13|(0)|16))|32|6|7|(0)(0)|12|13|(0)|16) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0032, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        r5 = new kotlin.Result.Failure(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        SyncCurrentUidInteractor$sync$1 syncCurrentUidInteractor$sync$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof SyncCurrentUidInteractor$sync$1) {
            syncCurrentUidInteractor$sync$1 = (SyncCurrentUidInteractor$sync$1) continuationImpl;
            int i2 = syncCurrentUidInteractor$sync$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                syncCurrentUidInteractor$sync$1.label = i2 - Integer.MIN_VALUE;
                Object obj = syncCurrentUidInteractor$sync$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = syncCurrentUidInteractor$sync$1.label;
                zy11 zy11Var = zy11.a;
                Object obj3 = null;
                if (i != 0) {
                    b.b(obj);
                    mu11 a2 = this.c.x.a();
                    if (!a2.a()) {
                        a2 = null;
                    }
                    if (a2 != null) {
                        PassportUidImpl h = gtq0.h(this.d, a2.a);
                        syncCurrentUidInteractor$sync$1.L$0 = null;
                        syncCurrentUidInteractor$sync$1.L$1 = null;
                        syncCurrentUidInteractor$sync$1.label = 1;
                        if (a(h, syncCurrentUidInteractor$sync$1) == obj2) {
                            return obj2;
                        }
                    }
                    a = Result.a(obj3);
                    if (a != null) {
                        gtq0.F("sync", "Sync UID with passport failed", a);
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                obj3 = zy11Var;
                a = Result.a(obj3);
                if (a != null) {
                }
                return zy11Var;
            }
        }
        syncCurrentUidInteractor$sync$1 = new SyncCurrentUidInteractor$sync$1(this, continuationImpl);
        Object obj4 = syncCurrentUidInteractor$sync$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = syncCurrentUidInteractor$sync$1.label;
        zy11 zy11Var2 = zy11.a;
        Object obj32 = null;
        if (i != 0) {
        }
        obj32 = zy11Var2;
        a = Result.a(obj32);
        if (a != null) {
        }
        return zy11Var2;
    }
}
