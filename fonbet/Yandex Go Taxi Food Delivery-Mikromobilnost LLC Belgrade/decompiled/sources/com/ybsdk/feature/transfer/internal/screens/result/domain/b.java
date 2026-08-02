package com.ybsdk.feature.transfer.internal.screens.result.domain;

import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.transfer.utils.domain.entities.TransferStatus;
import com.ybsdk.core.utils.poller.PollerTimeoutException;
import com.ybsdk.di.modules.features.s;
import com.ybsdk.feature.transfer.api.TransferResultScreenParams;
import com.ybsdk.utils.poller.c;
import defpackage.ayp0;
import defpackage.et01;
import defpackage.g1e0;
import defpackage.ht01;
import defpackage.iyd0;
import defpackage.l1e0;
import defpackage.mw3;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.w511;
import defpackage.x4c;
import defpackage.zxp0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final com.ybsdk.feature.transfer.internal.data.a a;
    public final com.ybsdk.utils.poller.b b;
    public final TransferResultScreenParams c;
    public final s d;
    public final com.ybsdk.feature.transfer.internal.screens.result.presentation.b e;

    public b(com.ybsdk.feature.transfer.internal.data.a aVar, com.ybsdk.utils.poller.b bVar, TransferResultScreenParams transferResultScreenParams, s sVar, com.ybsdk.feature.transfer.internal.screens.result.presentation.b bVar2) {
        this.a = aVar;
        this.b = bVar;
        this.c = transferResultScreenParams;
        this.d = sVar;
        this.e = bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, TransferResultScreenParams transferResultScreenParams, String str, ContinuationImpl continuationImpl) {
        TransferStatusInteractor$callConfirm$1 transferStatusInteractor$callConfirm$1;
        int i;
        Object e;
        Throwable a;
        bVar.getClass();
        if (continuationImpl instanceof TransferStatusInteractor$callConfirm$1) {
            transferStatusInteractor$callConfirm$1 = (TransferStatusInteractor$callConfirm$1) continuationImpl;
            int i2 = transferStatusInteractor$callConfirm$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferStatusInteractor$callConfirm$1.label = i2 - Integer.MIN_VALUE;
                TransferStatusInteractor$callConfirm$1 transferStatusInteractor$callConfirm$12 = transferStatusInteractor$callConfirm$1;
                Object obj = transferStatusInteractor$callConfirm$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferStatusInteractor$callConfirm$12.label;
                String str2 = null;
                Object[] objArr = 0;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c c = bVar.b.c(g1e0.b, new TransferStatusInteractor$callConfirm$2(2, null), new TransferStatusInteractor$callConfirm$3(bVar, transferResultScreenParams, str, new Money(transferResultScreenParams.getTransferringAmount(), str2, 2, objArr == true ? 1 : 0), null));
                    transferStatusInteractor$callConfirm$12.label = 1;
                    e = c.e(transferStatusInteractor$callConfirm$12);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    e = ((Result) obj).getValue();
                }
                a = Result.a(e);
                if (a != null) {
                    return (ayp0) e;
                }
                if (a instanceof PollerTimeoutException) {
                    return new zxp0(new et01(TransferStatus.TIMEOUT, (String) null, (String) null, (mw3) null, 30));
                }
                x4c.g("confirm failed", a, null, null, 12);
                return new zxp0(new et01(TransferStatus.ERROR, (String) null, (String) null, (mw3) null, 30));
            }
        }
        transferStatusInteractor$callConfirm$1 = new TransferStatusInteractor$callConfirm$1(bVar, continuationImpl);
        TransferStatusInteractor$callConfirm$1 transferStatusInteractor$callConfirm$122 = transferStatusInteractor$callConfirm$1;
        Object obj2 = transferStatusInteractor$callConfirm$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferStatusInteractor$callConfirm$122.label;
        String str22 = null;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        a = Result.a(e);
        if (a != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, String str, ContinuationImpl continuationImpl) {
        TransferStatusInteractor$callGetStatus$1 transferStatusInteractor$callGetStatus$1;
        int i;
        Object e;
        Throwable a;
        bVar.getClass();
        if (continuationImpl instanceof TransferStatusInteractor$callGetStatus$1) {
            transferStatusInteractor$callGetStatus$1 = (TransferStatusInteractor$callGetStatus$1) continuationImpl;
            int i2 = transferStatusInteractor$callGetStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferStatusInteractor$callGetStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferStatusInteractor$callGetStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferStatusInteractor$callGetStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c c = bVar.b.c(l1e0.b, new TransferStatusInteractor$callGetStatus$2(2, null), new TransferStatusInteractor$callGetStatus$3(bVar, str, null));
                    transferStatusInteractor$callGetStatus$1.label = 1;
                    e = c.e(transferStatusInteractor$callGetStatus$1);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    e = ((Result) obj).getValue();
                }
                a = Result.a(e);
                if (a != null) {
                    return (et01) e;
                }
                if (a instanceof PollerTimeoutException) {
                    return new et01(TransferStatus.TIMEOUT, (String) null, (String) null, (mw3) null, 30);
                }
                x4c.g("Exception during callGetStatus() in TransferStatusInteractor", a, null, null, 12);
                return new et01(TransferStatus.ERROR, (String) null, (String) null, (mw3) null, 30);
            }
        }
        transferStatusInteractor$callGetStatus$1 = new TransferStatusInteractor$callGetStatus$1(bVar, continuationImpl);
        Object obj2 = transferStatusInteractor$callGetStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferStatusInteractor$callGetStatus$1.label;
        if (i != 0) {
        }
        a = Result.a(e);
        if (a != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(b bVar, Money money, String str, String str2, String str3, int i, ContinuationImpl continuationImpl) {
        TransferStatusInteractor$getConfirmResult$1 transferStatusInteractor$getConfirmResult$1;
        int i2;
        int i3;
        Money money2;
        String str4;
        String str5;
        int i4;
        String str6;
        String str7;
        String str8;
        TransferResultScreenParams transferResultScreenParams = bVar.c;
        if (continuationImpl instanceof TransferStatusInteractor$getConfirmResult$1) {
            transferStatusInteractor$getConfirmResult$1 = (TransferStatusInteractor$getConfirmResult$1) continuationImpl;
            int i5 = transferStatusInteractor$getConfirmResult$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                transferStatusInteractor$getConfirmResult$1.label = i5 - Integer.MIN_VALUE;
                TransferStatusInteractor$getConfirmResult$1 transferStatusInteractor$getConfirmResult$12 = transferStatusInteractor$getConfirmResult$1;
                Object obj = transferStatusInteractor$getConfirmResult$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = transferStatusInteractor$getConfirmResult$12.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    int i6 = ht01.a[transferResultScreenParams.getTransferType().ordinal()];
                    if (i6 != 1) {
                        if (i6 == 2) {
                            x4c.g("screenArguments.transferId is null in C2C transfer", null, null, null, 14);
                            return new iyd0(null, new zxp0(new et01(TransferStatus.ERROR, (String) null, (String) null, (mw3) null, 30)));
                        }
                        w511.b();
                        return null;
                    }
                    if (str3 == null) {
                        s sVar = bVar.d;
                        transferStatusInteractor$getConfirmResult$12.L$0 = money;
                        transferStatusInteractor$getConfirmResult$12.L$1 = str;
                        transferStatusInteractor$getConfirmResult$12.L$2 = str2;
                        i3 = i;
                        transferStatusInteractor$getConfirmResult$12.I$0 = i3;
                        transferStatusInteractor$getConfirmResult$12.label = 1;
                        obj = sVar.a(transferStatusInteractor$getConfirmResult$12);
                        if (obj != coroutineSingletons) {
                            str7 = str;
                            str8 = str2;
                        }
                    }
                    i3 = i;
                    money2 = money;
                    str4 = str;
                    str5 = str2;
                    i4 = 14;
                    str6 = str3;
                    if (str6 == null) {
                        x4c.g("[transfers] Null agreementId with confirmSimplified flow", null, null, null, i4);
                        return new iyd0(null, new zxp0(new et01(TransferStatus.ERROR, (String) null, (String) null, (mw3) null, 30)));
                    }
                    com.ybsdk.feature.transfer.internal.data.a aVar = bVar.a;
                    String partnerId = transferResultScreenParams.getPartnerEntity().getPartnerId();
                    transferStatusInteractor$getConfirmResult$12.L$0 = null;
                    transferStatusInteractor$getConfirmResult$12.L$1 = null;
                    transferStatusInteractor$getConfirmResult$12.L$2 = null;
                    transferStatusInteractor$getConfirmResult$12.label = 2;
                    Object b = aVar.b(str6, partnerId, money2, str5, str4, i3, transferStatusInteractor$getConfirmResult$12);
                    return b == coroutineSingletons ? coroutineSingletons : b;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i7 = transferStatusInteractor$getConfirmResult$12.I$0;
                String str9 = (String) transferStatusInteractor$getConfirmResult$12.L$2;
                String str10 = (String) transferStatusInteractor$getConfirmResult$12.L$1;
                Money money3 = (Money) transferStatusInteractor$getConfirmResult$12.L$0;
                kotlin.b.b(obj);
                i3 = i7;
                money = money3;
                str8 = str9;
                str7 = str10;
                str6 = (String) obj;
                i4 = 14;
                money2 = money;
                str5 = str8;
                str4 = str7;
                if (str6 == null) {
                }
            }
        }
        transferStatusInteractor$getConfirmResult$1 = new TransferStatusInteractor$getConfirmResult$1(bVar, continuationImpl);
        TransferStatusInteractor$getConfirmResult$1 transferStatusInteractor$getConfirmResult$122 = transferStatusInteractor$getConfirmResult$1;
        Object obj2 = transferStatusInteractor$getConfirmResult$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = transferStatusInteractor$getConfirmResult$122.label;
        if (i2 != 0) {
        }
        str6 = (String) obj2;
        i4 = 14;
        money2 = money;
        str5 = str8;
        str4 = str7;
        if (str6 == null) {
        }
    }

    public final rol0 d(String str) {
        return new rol0(new TransferStatusInteractor$getTransferStatuses$1(this, str, null));
    }
}
