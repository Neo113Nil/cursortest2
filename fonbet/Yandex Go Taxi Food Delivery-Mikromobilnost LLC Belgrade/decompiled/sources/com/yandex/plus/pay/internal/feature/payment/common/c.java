package com.yandex.plus.pay.internal.feature.payment.common;

import com.yandex.plus.pay.api.exception.PlusPayException;
import com.yandex.plus.pay.common.internal.log.PayCoreLogTag;
import com.yandex.plus.pay.internal.model.PlusPayInvoice;
import com.yandex.plus.pay.repository.api.model.sync.UserSyncStatus;
import defpackage.fdd0;
import defpackage.j0x0;
import defpackage.jl40;
import defpackage.k0x0;
import defpackage.kxw;
import defpackage.mdd0;
import defpackage.ny61;
import defpackage.oxw;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes2.dex */
public final class c implements k0x0 {
    public static final PlusPayInvoice.PollingConfiguration e = new PlusPayInvoice.PollingConfiguration(60000, 1000);
    public final com.yandex.plus.pay.graphql.invoice.a a;
    public final com.yandex.plus.pay.graphql.user.a b;
    public final fdd0 c;
    public final mdd0 d;

    public c(com.yandex.plus.pay.graphql.invoice.a aVar, com.yandex.plus.pay.graphql.user.a aVar2, fdd0 fdd0Var, mdd0 mdd0Var) {
        this.a = aVar;
        this.b = aVar2;
        this.c = fdd0Var;
        this.d = mdd0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e3, code lost:
    
        if (r15 == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f4, code lost:
    
        if (kotlinx.coroutines.a.i(r11, r0) != r1) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00f4 -> B:12:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, PlusPayInvoice plusPayInvoice, long j, j0x0 j0x0Var, ContinuationImpl continuationImpl) {
        SyncInvoiceInteractorImpl$waitForInvoiceSync$1 syncInvoiceInteractorImpl$waitForInvoiceSync$1;
        int i;
        PlusPayInvoice plusPayInvoice2;
        j0x0 j0x0Var2;
        long j2;
        j0x0 j0x0Var3;
        PlusPayInvoice plusPayInvoice3;
        Boolean bool;
        boolean z;
        j0x0 j0x0Var4;
        cVar.getClass();
        if (continuationImpl instanceof SyncInvoiceInteractorImpl$waitForInvoiceSync$1) {
            syncInvoiceInteractorImpl$waitForInvoiceSync$1 = (SyncInvoiceInteractorImpl$waitForInvoiceSync$1) continuationImpl;
            int i2 = syncInvoiceInteractorImpl$waitForInvoiceSync$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                syncInvoiceInteractorImpl$waitForInvoiceSync$1.label = i2 - Integer.MIN_VALUE;
                Object obj = syncInvoiceInteractorImpl$waitForInvoiceSync$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = syncInvoiceInteractorImpl$waitForInvoiceSync$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PlusPayInvoice.Status invoiceStatus = plusPayInvoice.getInvoiceStatus();
                    switch (invoiceStatus == null ? -1 : oxw.a[invoiceStatus.ordinal()]) {
                        case -1:
                        case 9:
                        case 10:
                        case 11:
                            break;
                        case 0:
                        default:
                            w511.b();
                            break;
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            String id = plusPayInvoice.getId();
                            syncInvoiceInteractorImpl$waitForInvoiceSync$1.L$0 = plusPayInvoice;
                            syncInvoiceInteractorImpl$waitForInvoiceSync$1.L$1 = j0x0Var;
                            syncInvoiceInteractorImpl$waitForInvoiceSync$1.L$2 = null;
                            syncInvoiceInteractorImpl$waitForInvoiceSync$1.J$0 = j;
                            syncInvoiceInteractorImpl$waitForInvoiceSync$1.label = 1;
                            obj = cVar.d(id, syncInvoiceInteractorImpl$waitForInvoiceSync$1);
                            if (obj != obj2) {
                            }
                            break;
                    }
                    return null;
                }
                if (i == 1) {
                    j2 = syncInvoiceInteractorImpl$waitForInvoiceSync$1.J$0;
                    j0x0 j0x0Var5 = (j0x0) syncInvoiceInteractorImpl$waitForInvoiceSync$1.L$1;
                    plusPayInvoice2 = (PlusPayInvoice) syncInvoiceInteractorImpl$waitForInvoiceSync$1.L$0;
                    kotlin.b.b(obj);
                    j0x0Var3 = j0x0Var5;
                    plusPayInvoice3 = (PlusPayInvoice) obj;
                    if (plusPayInvoice3 == null) {
                    }
                    if (!jl40.l(bool, Boolean.TRUE)) {
                    }
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j2 = syncInvoiceInteractorImpl$waitForInvoiceSync$1.J$0;
                        j0x0 j0x0Var6 = (j0x0) syncInvoiceInteractorImpl$waitForInvoiceSync$1.L$1;
                        plusPayInvoice2 = (PlusPayInvoice) syncInvoiceInteractorImpl$waitForInvoiceSync$1.L$0;
                        kotlin.b.b(obj);
                        j0x0Var4 = j0x0Var6;
                        PlusPayInvoice plusPayInvoice4 = plusPayInvoice2;
                        j0x0Var = j0x0Var4;
                        j = j2;
                        plusPayInvoice = plusPayInvoice4;
                        String id2 = plusPayInvoice.getId();
                        syncInvoiceInteractorImpl$waitForInvoiceSync$1.L$0 = plusPayInvoice;
                        syncInvoiceInteractorImpl$waitForInvoiceSync$1.L$1 = j0x0Var;
                        syncInvoiceInteractorImpl$waitForInvoiceSync$1.L$2 = null;
                        syncInvoiceInteractorImpl$waitForInvoiceSync$1.J$0 = j;
                        syncInvoiceInteractorImpl$waitForInvoiceSync$1.label = 1;
                        obj = cVar.d(id2, syncInvoiceInteractorImpl$waitForInvoiceSync$1);
                        if (obj != obj2) {
                            j0x0 j0x0Var7 = j0x0Var;
                            plusPayInvoice2 = plusPayInvoice;
                            j2 = j;
                            j0x0Var3 = j0x0Var7;
                            plusPayInvoice3 = (PlusPayInvoice) obj;
                            if (plusPayInvoice3 == null) {
                                bool = null;
                            } else {
                                PlusPayInvoice.Status invoiceStatus2 = plusPayInvoice3.getInvoiceStatus();
                                switch (invoiceStatus2 == null ? -1 : oxw.a[invoiceStatus2.ordinal()]) {
                                    case -1:
                                    case 9:
                                    case 10:
                                    case 11:
                                        z = true;
                                        break;
                                    case 0:
                                    default:
                                        w511.b();
                                        return null;
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        z = false;
                                        break;
                                }
                                bool = Boolean.valueOf(z);
                            }
                            if (!jl40.l(bool, Boolean.TRUE)) {
                                return plusPayInvoice3;
                            }
                            j0x0Var2 = j0x0Var3;
                            if (jl40.l(bool, Boolean.FALSE)) {
                                syncInvoiceInteractorImpl$waitForInvoiceSync$1.L$0 = plusPayInvoice2;
                                syncInvoiceInteractorImpl$waitForInvoiceSync$1.L$1 = j0x0Var3;
                                syncInvoiceInteractorImpl$waitForInvoiceSync$1.L$2 = null;
                                syncInvoiceInteractorImpl$waitForInvoiceSync$1.J$0 = j2;
                                syncInvoiceInteractorImpl$waitForInvoiceSync$1.label = 2;
                                e eVar = (e) j0x0Var3;
                                Object a = eVar.a(plusPayInvoice3, syncInvoiceInteractorImpl$waitForInvoiceSync$1);
                                j0x0Var2 = eVar;
                            }
                            syncInvoiceInteractorImpl$waitForInvoiceSync$1.L$0 = plusPayInvoice2;
                            syncInvoiceInteractorImpl$waitForInvoiceSync$1.L$1 = j0x0Var2;
                            syncInvoiceInteractorImpl$waitForInvoiceSync$1.L$2 = null;
                            syncInvoiceInteractorImpl$waitForInvoiceSync$1.J$0 = j2;
                            syncInvoiceInteractorImpl$waitForInvoiceSync$1.label = 3;
                            j0x0Var4 = j0x0Var2;
                        }
                        return obj2;
                    }
                    j2 = syncInvoiceInteractorImpl$waitForInvoiceSync$1.J$0;
                    j0x0 j0x0Var8 = (j0x0) syncInvoiceInteractorImpl$waitForInvoiceSync$1.L$1;
                    plusPayInvoice2 = (PlusPayInvoice) syncInvoiceInteractorImpl$waitForInvoiceSync$1.L$0;
                    kotlin.b.b(obj);
                    j0x0Var2 = j0x0Var8;
                    syncInvoiceInteractorImpl$waitForInvoiceSync$1.L$0 = plusPayInvoice2;
                    syncInvoiceInteractorImpl$waitForInvoiceSync$1.L$1 = j0x0Var2;
                    syncInvoiceInteractorImpl$waitForInvoiceSync$1.L$2 = null;
                    syncInvoiceInteractorImpl$waitForInvoiceSync$1.J$0 = j2;
                    syncInvoiceInteractorImpl$waitForInvoiceSync$1.label = 3;
                    j0x0Var4 = j0x0Var2;
                }
            }
        }
        syncInvoiceInteractorImpl$waitForInvoiceSync$1 = new SyncInvoiceInteractorImpl$waitForInvoiceSync$1(cVar, continuationImpl);
        Object obj3 = syncInvoiceInteractorImpl$waitForInvoiceSync$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = syncInvoiceInteractorImpl$waitForInvoiceSync$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (kotlinx.coroutines.a.i(r7, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r9 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0060 -> B:21:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c cVar, long j, ContinuationImpl continuationImpl) {
        SyncInvoiceInteractorImpl$waitForUserSync$1 syncInvoiceInteractorImpl$waitForUserSync$1;
        int i;
        cVar.getClass();
        if (continuationImpl instanceof SyncInvoiceInteractorImpl$waitForUserSync$1) {
            syncInvoiceInteractorImpl$waitForUserSync$1 = (SyncInvoiceInteractorImpl$waitForUserSync$1) continuationImpl;
            int i2 = syncInvoiceInteractorImpl$waitForUserSync$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                syncInvoiceInteractorImpl$waitForUserSync$1.label = i2 - Integer.MIN_VALUE;
                Object obj = syncInvoiceInteractorImpl$waitForUserSync$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = syncInvoiceInteractorImpl$waitForUserSync$1.label;
                if (i != 0) {
                    if (i == 1) {
                        j = syncInvoiceInteractorImpl$waitForUserSync$1.J$0;
                        kotlin.b.b(obj);
                        if (((UserSyncStatus) obj) == UserSyncStatus.SYNCED) {
                            return zy11.a;
                        }
                        syncInvoiceInteractorImpl$waitForUserSync$1.L$0 = null;
                        syncInvoiceInteractorImpl$waitForUserSync$1.J$0 = j;
                        syncInvoiceInteractorImpl$waitForUserSync$1.label = 2;
                    } else {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = syncInvoiceInteractorImpl$waitForUserSync$1.J$0;
                    }
                }
                kotlin.b.b(obj);
                syncInvoiceInteractorImpl$waitForUserSync$1.L$0 = null;
                syncInvoiceInteractorImpl$waitForUserSync$1.J$0 = j;
                syncInvoiceInteractorImpl$waitForUserSync$1.label = 1;
                obj = cVar.e(syncInvoiceInteractorImpl$waitForUserSync$1);
            }
        }
        syncInvoiceInteractorImpl$waitForUserSync$1 = new SyncInvoiceInteractorImpl$waitForUserSync$1(cVar, continuationImpl);
        Object obj3 = syncInvoiceInteractorImpl$waitForUserSync$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = syncInvoiceInteractorImpl$waitForUserSync$1.label;
        if (i != 0) {
        }
        kotlin.b.b(obj3);
        syncInvoiceInteractorImpl$waitForUserSync$1.L$0 = null;
        syncInvoiceInteractorImpl$waitForUserSync$1.J$0 = j;
        syncInvoiceInteractorImpl$waitForUserSync$1.label = 1;
        obj3 = cVar.e(syncInvoiceInteractorImpl$waitForUserSync$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(PlusPayInvoice plusPayInvoice, e eVar, ContinuationImpl continuationImpl) {
        SyncInvoiceInteractorImpl$getSyncedInvoice$1 syncInvoiceInteractorImpl$getSyncedInvoice$1;
        int i;
        PlusPayInvoice plusPayInvoice2;
        if (continuationImpl instanceof SyncInvoiceInteractorImpl$getSyncedInvoice$1) {
            syncInvoiceInteractorImpl$getSyncedInvoice$1 = (SyncInvoiceInteractorImpl$getSyncedInvoice$1) continuationImpl;
            int i2 = syncInvoiceInteractorImpl$getSyncedInvoice$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                syncInvoiceInteractorImpl$getSyncedInvoice$1.label = i2 - Integer.MIN_VALUE;
                Object obj = syncInvoiceInteractorImpl$getSyncedInvoice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = syncInvoiceInteractorImpl$getSyncedInvoice$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PlusPayInvoice.PollingConfiguration pollingConfiguration = plusPayInvoice.getPollingConfiguration();
                    if (pollingConfiguration == null) {
                        pollingConfiguration = e;
                    }
                    PlusPayInvoice.PollingConfiguration pollingConfiguration2 = pollingConfiguration;
                    long totalTimeoutMillis = pollingConfiguration2.getTotalTimeoutMillis();
                    SyncInvoiceInteractorImpl$getSyncedInvoice$2 syncInvoiceInteractorImpl$getSyncedInvoice$2 = new SyncInvoiceInteractorImpl$getSyncedInvoice$2(this, plusPayInvoice, pollingConfiguration2, eVar, null);
                    syncInvoiceInteractorImpl$getSyncedInvoice$1.L$0 = null;
                    syncInvoiceInteractorImpl$getSyncedInvoice$1.L$1 = null;
                    syncInvoiceInteractorImpl$getSyncedInvoice$1.L$2 = null;
                    syncInvoiceInteractorImpl$getSyncedInvoice$1.label = 1;
                    obj = kotlinx.coroutines.a.w(totalTimeoutMillis, syncInvoiceInteractorImpl$getSyncedInvoice$2, syncInvoiceInteractorImpl$getSyncedInvoice$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                plusPayInvoice2 = (PlusPayInvoice) obj;
                if (plusPayInvoice2 == null) {
                    return plusPayInvoice2;
                }
                throw new PlusPayException("Invoice synchronization retry limit exceeded", 2);
            }
        }
        syncInvoiceInteractorImpl$getSyncedInvoice$1 = new SyncInvoiceInteractorImpl$getSyncedInvoice$1(this, continuationImpl);
        Object obj2 = syncInvoiceInteractorImpl$getSyncedInvoice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = syncInvoiceInteractorImpl$getSyncedInvoice$1.label;
        if (i != 0) {
        }
        plusPayInvoice2 = (PlusPayInvoice) obj2;
        if (plusPayInvoice2 == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:29|30))(3:31|32|(1:34))|12|13|(2:15|(1:17)(1:18))|19|(1:21)|22|(2:24|25)(1:27)))|41|6|7|(0)(0)|12|13|(0)|19|(0)|22|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0063, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0064, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0038, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005d, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        SyncInvoiceInteractorImpl$tryToGetInvoice$1 syncInvoiceInteractorImpl$tryToGetInvoice$1;
        Object obj;
        int i;
        Throwable a;
        kxw kxwVar;
        if (continuationImpl instanceof SyncInvoiceInteractorImpl$tryToGetInvoice$1) {
            syncInvoiceInteractorImpl$tryToGetInvoice$1 = (SyncInvoiceInteractorImpl$tryToGetInvoice$1) continuationImpl;
            int i2 = syncInvoiceInteractorImpl$tryToGetInvoice$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                syncInvoiceInteractorImpl$tryToGetInvoice$1.label = i2 - Integer.MIN_VALUE;
                obj = syncInvoiceInteractorImpl$tryToGetInvoice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = syncInvoiceInteractorImpl$tryToGetInvoice$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.plus.pay.graphql.invoice.a aVar = this.a;
                    syncInvoiceInteractorImpl$tryToGetInvoice$1.L$0 = null;
                    syncInvoiceInteractorImpl$tryToGetInvoice$1.L$1 = null;
                    syncInvoiceInteractorImpl$tryToGetInvoice$1.L$2 = null;
                    syncInvoiceInteractorImpl$tryToGetInvoice$1.L$3 = null;
                    syncInvoiceInteractorImpl$tryToGetInvoice$1.I$0 = 0;
                    syncInvoiceInteractorImpl$tryToGetInvoice$1.I$1 = 0;
                    syncInvoiceInteractorImpl$tryToGetInvoice$1.label = 1;
                    obj = aVar.c(str, syncInvoiceInteractorImpl$tryToGetInvoice$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                a = Result.a(obj);
                if (a != null) {
                    boolean z = a instanceof TimeoutCancellationException;
                    mdd0 mdd0Var = this.d;
                    if (z) {
                        mdd0.g(mdd0Var, PayCoreLogTag.PAYMENT, "Timeout when receiving invoice.", null, 12);
                    } else {
                        mdd0.g(mdd0Var, PayCoreLogTag.PAYMENT, "Error when receiving invoice.", a, 8);
                    }
                }
                if (obj instanceof Result.Failure) {
                    obj = null;
                }
                kxwVar = (kxw) obj;
                if (kxwVar == null) {
                    return this.c.a(kxwVar);
                }
                return null;
            }
        }
        syncInvoiceInteractorImpl$tryToGetInvoice$1 = new SyncInvoiceInteractorImpl$tryToGetInvoice$1(this, continuationImpl);
        obj = syncInvoiceInteractorImpl$tryToGetInvoice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = syncInvoiceInteractorImpl$tryToGetInvoice$1.label;
        if (i != 0) {
        }
        a = Result.a(obj);
        if (a != null) {
        }
        if (obj instanceof Result.Failure) {
        }
        kxwVar = (kxw) obj;
        if (kxwVar == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(1:31))|12|13|(2:15|(1:17)(1:18))|19|(1:21)|22|23))|39|6|7|(0)(0)|12|13|(0)|19|(0)|22|23|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0036, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        r0 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005e, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005f, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0034, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        r0 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum e(ContinuationImpl continuationImpl) {
        SyncInvoiceInteractorImpl$tryToGetUserSyncStatus$1 syncInvoiceInteractorImpl$tryToGetUserSyncStatus$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof SyncInvoiceInteractorImpl$tryToGetUserSyncStatus$1) {
            syncInvoiceInteractorImpl$tryToGetUserSyncStatus$1 = (SyncInvoiceInteractorImpl$tryToGetUserSyncStatus$1) continuationImpl;
            int i2 = syncInvoiceInteractorImpl$tryToGetUserSyncStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                syncInvoiceInteractorImpl$tryToGetUserSyncStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = syncInvoiceInteractorImpl$tryToGetUserSyncStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = syncInvoiceInteractorImpl$tryToGetUserSyncStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.plus.pay.graphql.user.a aVar = this.b;
                    syncInvoiceInteractorImpl$tryToGetUserSyncStatus$1.L$0 = null;
                    syncInvoiceInteractorImpl$tryToGetUserSyncStatus$1.L$1 = null;
                    syncInvoiceInteractorImpl$tryToGetUserSyncStatus$1.L$2 = null;
                    syncInvoiceInteractorImpl$tryToGetUserSyncStatus$1.I$0 = 0;
                    syncInvoiceInteractorImpl$tryToGetUserSyncStatus$1.I$1 = 0;
                    syncInvoiceInteractorImpl$tryToGetUserSyncStatus$1.label = 1;
                    obj = aVar.a(syncInvoiceInteractorImpl$tryToGetUserSyncStatus$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                a = Result.a(obj);
                if (a != null) {
                    boolean z = a instanceof TimeoutCancellationException;
                    mdd0 mdd0Var = this.d;
                    if (z) {
                        mdd0.g(mdd0Var, PayCoreLogTag.PAYMENT, "Timeout when wait for user sync status.", null, 12);
                    } else {
                        mdd0.g(mdd0Var, PayCoreLogTag.PAYMENT, "Error when receiving user sync status.", a, 8);
                    }
                }
                return (UserSyncStatus) (obj instanceof Result.Failure ? null : obj);
            }
        }
        syncInvoiceInteractorImpl$tryToGetUserSyncStatus$1 = new SyncInvoiceInteractorImpl$tryToGetUserSyncStatus$1(this, continuationImpl);
        Object obj2 = syncInvoiceInteractorImpl$tryToGetUserSyncStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = syncInvoiceInteractorImpl$tryToGetUserSyncStatus$1.label;
        if (i != 0) {
        }
        a = Result.a(obj2);
        if (a != null) {
        }
        return (UserSyncStatus) (obj2 instanceof Result.Failure ? null : obj2);
    }
}
