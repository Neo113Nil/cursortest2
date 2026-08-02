package com.ybsdk.feature.transfer.internal.domain;

import com.ybsdk.core.transfer.utils.domain.entities.TransferType;
import com.ybsdk.feature.transfer.api.entities.TransferInfo;
import defpackage.ny61;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final com.ybsdk.feature.transfer.internal.data.a a;

    public b(com.ybsdk.feature.transfer.internal.data.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TransferType transferType, ContinuationImpl continuationImpl) {
        PartnersInteractor$getTransferInfo$1 partnersInteractor$getTransferInfo$1;
        int i;
        if (continuationImpl instanceof PartnersInteractor$getTransferInfo$1) {
            partnersInteractor$getTransferInfo$1 = (PartnersInteractor$getTransferInfo$1) continuationImpl;
            int i2 = partnersInteractor$getTransferInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                partnersInteractor$getTransferInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = partnersInteractor$getTransferInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnersInteractor$getTransferInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    partnersInteractor$getTransferInfo$1.label = 1;
                    Object e = this.a.e(transferType, partnersInteractor$getTransferInfo$1);
                    return e == coroutineSingletons ? coroutineSingletons : e;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        partnersInteractor$getTransferInfo$1 = new PartnersInteractor$getTransferInfo$1(this, continuationImpl);
        Object obj2 = partnersInteractor$getTransferInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnersInteractor$getTransferInfo$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:12:0x002a, B:13:0x006b, B:15:0x006f, B:16:0x0077, B:25:0x0055), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055 A[Catch: all -> 0x007b, TRY_ENTER, TryCatch #0 {all -> 0x007b, blocks: (B:12:0x002a, B:13:0x006b, B:15:0x006f, B:16:0x0077, B:25:0x0055), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(TransferType transferType, ContinuationImpl continuationImpl) {
        PartnersInteractor$loadAllPartners$1 partnersInteractor$loadAllPartners$1;
        int i;
        Object a;
        Object obj;
        TransferInfo transferInfo;
        try {
            if (continuationImpl instanceof PartnersInteractor$loadAllPartners$1) {
                partnersInteractor$loadAllPartners$1 = (PartnersInteractor$loadAllPartners$1) continuationImpl;
                int i2 = partnersInteractor$loadAllPartners$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    partnersInteractor$loadAllPartners$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = partnersInteractor$loadAllPartners$1.result;
                    Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = partnersInteractor$loadAllPartners$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        partnersInteractor$loadAllPartners$1.label = 1;
                        a = a(transferType, partnersInteractor$loadAllPartners$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            transferInfo = (TransferInfo) partnersInteractor$loadAllPartners$1.L$0;
                            kotlin.b.b(obj2);
                            obj = ((Result) obj2).getValue();
                            if (!(obj instanceof Result.Failure)) {
                                obj = new PartnersEntity(transferInfo, (List) obj);
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        kotlin.b.b(obj2);
                        a = ((Result) obj2).getValue();
                    }
                    if (!(a instanceof Result.Failure)) {
                        return a;
                    }
                    TransferInfo transferInfo2 = (TransferInfo) a;
                    com.ybsdk.feature.transfer.internal.data.a aVar = this.a;
                    String transferId = transferInfo2.getTransferId();
                    partnersInteractor$loadAllPartners$1.L$0 = transferInfo2;
                    partnersInteractor$loadAllPartners$1.label = 2;
                    Object c = aVar.c(transferId, partnersInteractor$loadAllPartners$1);
                    if (c != obj3) {
                        obj = c;
                        transferInfo = transferInfo2;
                        if (!(obj instanceof Result.Failure)) {
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    return obj3;
                }
            }
            if (i != 0) {
            }
            if (!(a instanceof Result.Failure)) {
            }
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        partnersInteractor$loadAllPartners$1 = new PartnersInteractor$loadAllPartners$1(this, continuationImpl);
        Object obj22 = partnersInteractor$loadAllPartners$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnersInteractor$loadAllPartners$1.label;
    }
}
