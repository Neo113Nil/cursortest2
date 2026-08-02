package com.yandex.go.transfer_requirement.transferapi;

import com.yandex.go.address.models.Address;
import com.yandex.go.transfer_requirement.transferapi.TransferParam;
import com.yandex.go.transfer_requirement.transferapi.check.TransferCheckResponse;
import com.yandex.go.transfer_requirement.transferapi.draft.TransferDraftResponse;
import com.yandex.go.zone.model.Zone;
import defpackage.bvf0;
import defpackage.cmt;
import defpackage.dqe0;
import defpackage.fh01;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import java.util.TimeZone;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a {
    public final TransferApi a;
    public final dqe0 b;
    public final fh01 c;

    public a(TransferApi transferApi, dqe0 dqe0Var, fh01 fh01Var) {
        this.a = transferApi;
        this.b = dqe0Var;
        this.c = fh01Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, TransferParam transferParam, ContinuationImpl continuationImpl) {
        TransferApiInteractor$callCheck$1 transferApiInteractor$callCheck$1;
        int i;
        aVar.getClass();
        try {
            if (continuationImpl instanceof TransferApiInteractor$callCheck$1) {
                transferApiInteractor$callCheck$1 = (TransferApiInteractor$callCheck$1) continuationImpl;
                int i2 = transferApiInteractor$callCheck$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    transferApiInteractor$callCheck$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = transferApiInteractor$callCheck$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = transferApiInteractor$callCheck$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<TransferCheckResponse> a = aVar.a.a(transferParam);
                        transferApiInteractor$callCheck$1.L$0 = null;
                        transferApiInteractor$callCheck$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.d(a, transferApiInteractor$callCheck$1);
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
                    return (TransferCheckResponse) obj;
                }
            }
            if (i != 0) {
            }
            return (TransferCheckResponse) obj;
        } catch (Exception unused) {
            return new TransferCheckResponse(0);
        }
        transferApiInteractor$callCheck$1 = new TransferApiInteractor$callCheck$1(aVar, continuationImpl);
        Object obj2 = transferApiInteractor$callCheck$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferApiInteractor$callCheck$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, TransferParam transferParam, ContinuationImpl continuationImpl) {
        TransferApiInteractor$callDraft$1 transferApiInteractor$callDraft$1;
        int i;
        aVar.getClass();
        try {
            if (continuationImpl instanceof TransferApiInteractor$callDraft$1) {
                transferApiInteractor$callDraft$1 = (TransferApiInteractor$callDraft$1) continuationImpl;
                int i2 = transferApiInteractor$callDraft$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    transferApiInteractor$callDraft$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = transferApiInteractor$callDraft$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = transferApiInteractor$callDraft$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<TransferDraftResponse> b = aVar.a.b(transferParam);
                        transferApiInteractor$callDraft$1.L$0 = null;
                        transferApiInteractor$callDraft$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.d(b, transferApiInteractor$callDraft$1);
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
                    return (TransferDraftResponse) obj;
                }
            }
            if (i != 0) {
            }
            return (TransferDraftResponse) obj;
        } catch (Exception unused) {
            return new TransferDraftResponse(0);
        }
        transferApiInteractor$callDraft$1 = new TransferApiInteractor$callDraft$1(aVar, continuationImpl);
        Object obj2 = transferApiInteractor$callDraft$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferApiInteractor$callDraft$1.label;
    }

    public final Object c(TransferParam.TransferType transferType, String str, String str2, String str3, String str4, int i, String str5, tls tlsVar, Continuation continuation) {
        TransferApiInteractor$callTransferCheck$2 transferApiInteractor$callTransferCheck$2 = new TransferApiInteractor$callTransferCheck$2(this, f(transferType, str, str2, str3, str4, i, str5), tlsVar, null);
        fh01 fh01Var = this.c;
        fh01Var.getClass();
        Object n = bvf0.n(new TransferCallRepository$addCallJob$2(fh01Var, transferApiInteractor$callTransferCheck$2, null), continuation);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }

    public final Object d(TransferParam.TransferType transferType, String str, String str2, String str3, String str4, int i, String str5, tls tlsVar, Continuation continuation) {
        TransferApiInteractor$callTransferDraft$2 transferApiInteractor$callTransferDraft$2 = new TransferApiInteractor$callTransferDraft$2(this, f(transferType, str, str2, str3, str4, i, str5), tlsVar, null);
        fh01 fh01Var = this.c;
        fh01Var.getClass();
        Object n = bvf0.n(new TransferCallRepository$addCallJob$2(fh01Var, transferApiInteractor$callTransferDraft$2, null), continuation);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }

    public final void e() {
        fh01 fh01Var = this.c;
        pzt0 pzt0Var = fh01Var.a;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        fh01Var.a = null;
    }

    public final TransferParam f(TransferParam.TransferType transferType, String str, String str2, String str3, String str4, int i, String str5) {
        TimeZone timeZone;
        zzs B;
        Address h = this.b.a.G.h();
        String str6 = null;
        TransferParam.PointA pointA = (h == null || (B = h.B()) == null) ? null : new TransferParam.PointA(h.c2(), B.a, B.b);
        List J0 = kotlin.collections.a.J0(this.b.a.O.b);
        Zone c = this.b.c();
        if (c != null && (timeZone = c.f) != null) {
            str6 = timeZone.getID();
        }
        return new TransferParam(transferType, str, str2, str3, str4, str5, str6, Integer.valueOf(i), pointA, J0);
    }
}
