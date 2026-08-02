package com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.qr;

import android.net.Uri;
import com.yandex.go.mainscreen.superapp.analytics.SuperappMainAnalytics$UniversalQRScanningStatus;
import defpackage.ibw0;
import defpackage.jl40;
import defpackage.lz11;
import defpackage.m5u;
import defpackage.mvg;
import defpackage.n5u;
import defpackage.ny61;
import defpackage.o5u;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xz11;
import defpackage.yz11;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.qr.UniversalQrScannerDeeplinkHandler$handleDeeplink$2", f = "UniversalQrScannerDeeplinkHandler.kt", l = {44, 52}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UniversalQrScannerDeeplinkHandler$handleDeeplink$2 extends SuspendLambda implements wls {
    final /* synthetic */ Uri $deeplink;
    final /* synthetic */ Uri $modifiedUri;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalQrScannerDeeplinkHandler$handleDeeplink$2(a aVar, Uri uri, Uri uri2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$modifiedUri = uri;
        this.$deeplink = uri2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UniversalQrScannerDeeplinkHandler$handleDeeplink$2(this.this$0, this.$modifiedUri, this.$deeplink, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UniversalQrScannerDeeplinkHandler$handleDeeplink$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0095, code lost:
    
        if (r10.a.emit(r6, r9) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0031, code lost:
    
        if (r10 == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xz11 xz11Var;
        SuperappMainAnalytics$UniversalQRScanningStatus superappMainAnalytics$UniversalQRScanningStatus;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            Uri uri = this.$modifiedUri;
            this.label = 1;
            obj = a.a(aVar, uri, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        o5u o5uVar = (o5u) obj;
        boolean z = o5uVar instanceof m5u;
        n5u n5uVar = n5u.a;
        if (z) {
            xz11Var = xz11.a;
        } else {
            if (!jl40.l(o5uVar, n5uVar)) {
                w511.b();
                return null;
            }
            xz11Var = xz11.b;
        }
        a aVar2 = this.this$0;
        Uri uri2 = this.$deeplink;
        lz11 lz11Var = aVar2.h;
        lz11Var.getClass();
        if (z) {
            superappMainAnalytics$UniversalQRScanningStatus = SuperappMainAnalytics$UniversalQRScanningStatus.Success;
        } else {
            if (!jl40.l(o5uVar, n5uVar)) {
                w511.b();
                return null;
            }
            superappMainAnalytics$UniversalQRScanningStatus = SuperappMainAnalytics$UniversalQRScanningStatus.Fail;
        }
        String a = lz11.a(uri2);
        ibw0 ibw0Var = lz11Var.a;
        ibw0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("qr", a);
        hashMap.put("scanning_status", superappMainAnalytics$UniversalQRScanningStatus.getEventValue());
        ibw0Var.a.a("SuperappMain.UniversalQR.ScanningResult", hashMap, 1, new HashMap());
        yz11 yz11Var = this.this$0.i;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
