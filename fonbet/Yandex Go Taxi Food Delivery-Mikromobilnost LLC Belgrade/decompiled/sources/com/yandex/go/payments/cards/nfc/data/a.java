package com.yandex.go.payments.cards.nfc.data;

import android.content.Intent;
import android.nfc.TagLostException;
import defpackage.ddf;
import defpackage.jst;
import defpackage.ny61;
import defpackage.q760;
import defpackage.r760;
import defpackage.ra0;
import defpackage.vpr;
import defpackage.xby;
import defpackage.ylm0;
import defpackage.zy11;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;
    public final /* synthetic */ r760 b;

    public a(b bVar, r760 r760Var) {
        this.a = bVar;
        this.b = r760Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006b A[Catch: all -> 0x0036, CancellationException -> 0x00f8, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x0032, B:13:0x005f, B:15:0x006b), top: B:11:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1 nfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1;
        int i;
        ylm0 ylm0Var;
        TagLostException tagLostException;
        q760 q760Var;
        com.yandex.go.payments.cards.nfc.domain.a aVar;
        try {
            if (continuation instanceof NfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1) {
                nfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1 = (NfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1) continuation;
                int i2 = nfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    nfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = nfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = nfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1.label;
                    b bVar = this.a;
                    ylm0Var = null;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        Intent intent = (Intent) obj;
                        q760 q760Var2 = bVar.b;
                        try {
                            aVar = bVar.d;
                        } catch (Throwable th) {
                            tagLostException = th;
                            q760Var = q760Var2;
                            int i3 = q760Var.d + 1;
                            q760Var.d = i3;
                            String b = q760Var.a.b().b();
                            if (!(tagLostException instanceof TagLostException)) {
                                xby.l(jst.e, "NFC_SCAN_ERROR:TAG_LOST", null, tagLostException, "Nfc tag was lost on " + b + " screen, attempt: " + i3, 2);
                            } else if (tagLostException instanceof IOException) {
                                xby.l(jst.e, "NFC_SCAN_ERROR:IO", null, tagLostException, "Nfc scan io error on " + b + " screen, attempt: " + i3, 2);
                            } else {
                                xby.l(jst.e, "NFC_SCAN_ERROR:UNKNOWN", null, tagLostException, "Nfc scan unknown error on " + b + " screen, attempt: " + i3, 2);
                            }
                            return zy11.a;
                        }
                        if (aVar == null) {
                            q760Var = q760Var2;
                            if (ylm0Var != null) {
                                bVar.b.a();
                                ra0.f((ra0) ((ddf) this.b).b, ylm0Var);
                            }
                            return zy11.a;
                        }
                        nfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1.L$0 = null;
                        nfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1.L$1 = null;
                        nfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1.L$2 = null;
                        nfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1.L$3 = q760Var2;
                        nfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1.label = 1;
                        Object a = aVar.a(intent, nfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj2 = a;
                        q760Var = q760Var2;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        q760Var = (q760) nfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1.L$3;
                        try {
                            kotlin.b.b(obj2);
                        } catch (Throwable th2) {
                            tagLostException = th2;
                            int i32 = q760Var.d + 1;
                            q760Var.d = i32;
                            String b2 = q760Var.a.b().b();
                            if (!(tagLostException instanceof TagLostException)) {
                            }
                            return zy11.a;
                        }
                    }
                    ylm0Var = (ylm0) obj2;
                    if (ylm0Var != null) {
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            ylm0Var = (ylm0) obj2;
            if (ylm0Var != null) {
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
        nfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1 = new NfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1(this, continuation);
        Object obj22 = nfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1.label;
        b bVar2 = this.a;
        ylm0Var = null;
    }
}
