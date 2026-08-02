package com.yandex.plus.pay.internal.feature.payment.common;

import com.yandex.plus.pay.internal.model.PlusPayInvoice;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.j0x0;
import defpackage.ny61;
import defpackage.tls;
import defpackage.xod0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class e implements j0x0 {
    public final zls a;
    public final tls b;
    public final kotlinx.coroutines.sync.a c = gtq0.a();
    public volatile boolean d;

    public e(tls tlsVar, zls zlsVar) {
        this.a = zlsVar;
        this.b = tlsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e6, code lost:
    
        if (r10.invoke(r0) == r1) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #0 {all -> 0x0084, blocks: (B:27:0x0071, B:29:0x0079, B:33:0x0089, B:36:0x0091, B:38:0x00a1, B:40:0x00ab, B:42:0x00b1, B:43:0x00b7, B:49:0x00a7, B:50:0x00d0, B:52:0x00d4), top: B:26:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r10v11, types: [g050] */
    /* JADX WARN: Type inference failed for: r10v15, types: [g050] */
    /* JADX WARN: Type inference failed for: r2v5, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayInvoice plusPayInvoice, ContinuationImpl continuationImpl) {
        WebActionStatusCallback$onNonTerminalInvoice$1 webActionStatusCallback$onNonTerminalInvoice$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        int i2;
        kotlinx.coroutines.sync.a aVar2;
        int i3;
        kotlinx.coroutines.sync.a aVar3;
        String trustFormUrl;
        try {
            if (continuationImpl instanceof WebActionStatusCallback$onNonTerminalInvoice$1) {
                webActionStatusCallback$onNonTerminalInvoice$1 = (WebActionStatusCallback$onNonTerminalInvoice$1) continuationImpl;
                int i4 = webActionStatusCallback$onNonTerminalInvoice$1.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    webActionStatusCallback$onNonTerminalInvoice$1.label = i4 - Integer.MIN_VALUE;
                    Object obj = webActionStatusCallback$onNonTerminalInvoice$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = webActionStatusCallback$onNonTerminalInvoice$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = this.c;
                        webActionStatusCallback$onNonTerminalInvoice$1.L$0 = plusPayInvoice;
                        webActionStatusCallback$onNonTerminalInvoice$1.L$1 = aVar;
                        webActionStatusCallback$onNonTerminalInvoice$1.I$0 = 0;
                        webActionStatusCallback$onNonTerminalInvoice$1.label = 1;
                        if (aVar.a(webActionStatusCallback$onNonTerminalInvoice$1) != coroutineSingletons) {
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            ?? r10 = (g050) webActionStatusCallback$onNonTerminalInvoice$1.L$1;
                            aVar2 = r10;
                        } else {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ?? r102 = (g050) webActionStatusCallback$onNonTerminalInvoice$1.L$1;
                            aVar2 = r102;
                        }
                        try {
                            kotlin.b.b(obj);
                            aVar3 = aVar2;
                            aVar = aVar3;
                            aVar.d(null);
                            return zy11.a;
                        } catch (Throwable th) {
                            th = th;
                            aVar2.d(null);
                            throw th;
                        }
                    }
                    int i5 = webActionStatusCallback$onNonTerminalInvoice$1.I$0;
                    ?? r2 = (g050) webActionStatusCallback$onNonTerminalInvoice$1.L$1;
                    PlusPayInvoice plusPayInvoice2 = (PlusPayInvoice) webActionStatusCallback$onNonTerminalInvoice$1.L$0;
                    kotlin.b.b(obj);
                    aVar = r2;
                    i2 = i5;
                    plusPayInvoice = plusPayInvoice2;
                    if (plusPayInvoice.getInvoiceStatus() != PlusPayInvoice.Status.WAIT_FOR_3DS && plusPayInvoice.getInvoiceStatus() != PlusPayInvoice.Status.WAIT_FOR_NOTIFICATION) {
                        i3 = 0;
                        if (plusPayInvoice.getTrustFormUrl() != null || i3 == 0) {
                            if (this.d) {
                                tls tlsVar = this.b;
                                webActionStatusCallback$onNonTerminalInvoice$1.L$0 = null;
                                webActionStatusCallback$onNonTerminalInvoice$1.L$1 = aVar;
                                webActionStatusCallback$onNonTerminalInvoice$1.I$0 = i2;
                                webActionStatusCallback$onNonTerminalInvoice$1.I$1 = 0;
                                webActionStatusCallback$onNonTerminalInvoice$1.I$2 = i3;
                                webActionStatusCallback$onNonTerminalInvoice$1.label = 3;
                            }
                            aVar.d(null);
                            return zy11.a;
                        }
                        this.d = true;
                        zls zlsVar = this.a;
                        String trustFormUrl2 = plusPayInvoice.getTrustFormUrl();
                        PlusPayInvoice.WebWidgetQrCodeParams webWidgetQrCodeParams = plusPayInvoice.getWebWidgetQrCodeParams();
                        if (webWidgetQrCodeParams == null || (trustFormUrl = webWidgetQrCodeParams.getUrl()) == null) {
                            trustFormUrl = plusPayInvoice.getTrustFormUrl();
                        }
                        PlusPayInvoice.WebWidgetQrCodeParams webWidgetQrCodeParams2 = plusPayInvoice.getWebWidgetQrCodeParams();
                        xod0 xod0Var = new xod0(trustFormUrl, webWidgetQrCodeParams2 != null ? webWidgetQrCodeParams2.getUnderlineText() : null);
                        webActionStatusCallback$onNonTerminalInvoice$1.L$0 = null;
                        webActionStatusCallback$onNonTerminalInvoice$1.L$1 = aVar;
                        webActionStatusCallback$onNonTerminalInvoice$1.I$0 = i2;
                        webActionStatusCallback$onNonTerminalInvoice$1.I$1 = 0;
                        webActionStatusCallback$onNonTerminalInvoice$1.I$2 = i3;
                        webActionStatusCallback$onNonTerminalInvoice$1.label = 2;
                        if (zlsVar.invoke(trustFormUrl2, xod0Var, webActionStatusCallback$onNonTerminalInvoice$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        aVar3 = aVar;
                        aVar = aVar3;
                        aVar.d(null);
                        return zy11.a;
                    }
                    i3 = 1;
                    if (plusPayInvoice.getTrustFormUrl() != null) {
                    }
                    if (this.d) {
                    }
                    aVar.d(null);
                    return zy11.a;
                }
            }
            if (plusPayInvoice.getInvoiceStatus() != PlusPayInvoice.Status.WAIT_FOR_3DS) {
                i3 = 0;
                if (plusPayInvoice.getTrustFormUrl() != null) {
                }
                if (this.d) {
                }
                aVar.d(null);
                return zy11.a;
            }
            i3 = 1;
            if (plusPayInvoice.getTrustFormUrl() != null) {
            }
            if (this.d) {
            }
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th2) {
            th = th2;
            aVar2 = aVar;
            aVar2.d(null);
            throw th;
        }
        webActionStatusCallback$onNonTerminalInvoice$1 = new WebActionStatusCallback$onNonTerminalInvoice$1(this, continuationImpl);
        Object obj2 = webActionStatusCallback$onNonTerminalInvoice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webActionStatusCallback$onNonTerminalInvoice$1.label;
        if (i != 0) {
        }
    }
}
