package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.properties.PassportLogoutPropertiesImpl;
import com.yandex.passport.internal.ui.challenge.logout.LogoutBehaviour;
import defpackage.ds31;
import defpackage.ffx;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.w511;
import defpackage.yr31;
import defpackage.ywv;
import defpackage.zwv;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class x0 extends yr31 {
    public static final ywv B;
    public final com.yandex.passport.internal.core.accounts.d b;
    public final com.yandex.passport.internal.core.accounts.t c;
    public final com.yandex.passport.internal.properties.p w;
    public final com.yandex.passport.internal.flags.j x;
    public PassportLogoutPropertiesImpl z;
    public final kotlinx.coroutines.flow.n0 y = ffx.c(0, 0, null, 7);
    public final kotlinx.coroutines.flow.n0 A = ffx.c(1, 0, null, 6);

    static {
        zwv zwvVar = new zwv();
        zwvVar.a(qoi0.a(x0.class), new u0(0));
        B = zwvVar.b();
    }

    public x0(com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.core.accounts.t tVar, com.yandex.passport.internal.properties.p pVar, com.yandex.passport.internal.flags.j jVar) {
        this.b = dVar;
        this.c = tVar;
        this.w = pVar;
        this.x = jVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(2:18|19)(1:(1:12)(2:16|17)))(3:20|21|(11:23|(2:26|24)|27|28|(1:30)(1:66)|(3:32|(4:35|(3:37|38|39)(1:41)|40|33)|42)(1:65)|43|44|(1:64)(1:52)|53|(2:60|(2:62|63))(2:56|(2:58|59)))(2:67|68))|13|14))|73|6|7|(0)(0)|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0045, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0144, code lost:
    
        r1 = r17.y;
        r4 = new com.yandex.passport.internal.ui.challenge.logout.bottomsheet.r0(r0);
        r2.L$0 = null;
        r2.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0153, code lost:
    
        if (r1.emit(r4, r2) == r3) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object W(x0 x0Var, PassportLogoutPropertiesImpl passportLogoutPropertiesImpl, ContinuationImpl continuationImpl) {
        LogoutBottomsheetViewModel$logic$1 logoutBottomsheetViewModel$logic$1;
        int i;
        ?? r9;
        x0Var.getClass();
        if (continuationImpl instanceof LogoutBottomsheetViewModel$logic$1) {
            logoutBottomsheetViewModel$logic$1 = (LogoutBottomsheetViewModel$logic$1) continuationImpl;
            int i2 = logoutBottomsheetViewModel$logic$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                logoutBottomsheetViewModel$logic$1.label = i2 - Integer.MIN_VALUE;
                Object obj = logoutBottomsheetViewModel$logic$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = logoutBottomsheetViewModel$logic$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.internal.b a = x0Var.b.a();
                    ModernAccount e = a.e(com.yandex.passport.internal.util.p.B(passportLogoutPropertiesImpl.getUid()));
                    if (e == null) {
                        throw new PassportAccountNotFoundException(passportLogoutPropertiesImpl.getUid());
                    }
                    ArrayList f = a.f();
                    ArrayList arrayList = new ArrayList(tcc.n(f, 10));
                    Iterator it = f.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ModernAccount) it.next()).getUid());
                    }
                    Uid masterUid = e.getMasterUid();
                    if (!((Boolean) x0Var.x.b(com.yandex.passport.internal.flags.q.r0)).booleanValue()) {
                        masterUid = null;
                    }
                    if (masterUid != null) {
                        ArrayList c = x0Var.c.c(masterUid, a);
                        r9 = new ArrayList();
                        Iterator it2 = c.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            if (arrayList.contains(((com.yandex.passport.internal.entities.k) next).a)) {
                                r9.add(next);
                            }
                        }
                    } else {
                        r9 = EmptyList.a;
                    }
                    List list = r9;
                    boolean z = (e.isMailish() || e.isPdd() || e.getUid().getEnvironment() == Environment.TEAM_PRODUCTION || e.getUid().getEnvironment() == Environment.TEAM_TESTING) ? false : true;
                    boolean canLogoutOnDevice = passportLogoutPropertiesImpl.getCanLogoutOnDevice();
                    if (canLogoutOnDevice || z) {
                        kotlinx.coroutines.flow.n0 n0Var = x0Var.A;
                        v0 v0Var = new v0(com.yandex.passport.internal.util.p.B(passportLogoutPropertiesImpl.getUid()), e.getMasterUid(), !x0Var.w.w, z, canLogoutOnDevice, list);
                        logoutBottomsheetViewModel$logic$1.L$0 = x0Var;
                        logoutBottomsheetViewModel$logic$1.label = 2;
                        if (n0Var.emit(v0Var, logoutBottomsheetViewModel$logic$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        kotlinx.coroutines.flow.n0 n0Var2 = x0Var.y;
                        s0 s0Var = new s0(passportLogoutPropertiesImpl, LogoutBehaviour.DROP_CLIENT_TOKEN);
                        logoutBottomsheetViewModel$logic$1.L$0 = x0Var;
                        logoutBottomsheetViewModel$logic$1.label = 1;
                        if (n0Var2.emit(s0Var, logoutBottomsheetViewModel$logic$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else if (i == 1 || i == 2) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        logoutBottomsheetViewModel$logic$1 = new LogoutBottomsheetViewModel$logic$1(x0Var, continuationImpl);
        Object obj2 = logoutBottomsheetViewModel$logic$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = logoutBottomsheetViewModel$logic$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final void X(LogoutBottomsheetWish logoutBottomsheetWish) {
        int i = w0.a[logoutBottomsheetWish.ordinal()];
        kotlinx.coroutines.flow.n0 n0Var = this.y;
        if (i == 1 || i == 2) {
            tje.N(ds31.a(this), null, null, new LogoutBottomsheetViewModel$wish$$inlined$emitOn$1(n0Var, null), 3);
            return;
        }
        if (i == 3) {
            tje.N(ds31.a(this), null, null, new LogoutBottomsheetViewModel$wish$$inlined$emitOn$2(n0Var, null, this), 3);
            return;
        }
        if (i == 4) {
            tje.N(ds31.a(this), null, null, new LogoutBottomsheetViewModel$wish$$inlined$emitOn$3(n0Var, null, this), 3);
        } else if (i == 5) {
            tje.N(ds31.a(this), null, null, new LogoutBottomsheetViewModel$wish$$inlined$emitOn$4(n0Var, null, this), 3);
        } else {
            w511.b();
        }
    }
}
