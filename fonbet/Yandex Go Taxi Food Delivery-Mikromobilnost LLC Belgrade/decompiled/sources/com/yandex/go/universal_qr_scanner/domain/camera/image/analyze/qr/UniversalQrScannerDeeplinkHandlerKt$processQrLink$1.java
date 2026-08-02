package com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.qr;

import android.net.Uri;
import com.yandex.go.yb.domain.t;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.kz11;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.z5u;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Loep0;", "Landroid/net/Uri;", LaunchBrowserActivity.KEY_URI, "Lz5u;", "<anonymous>", "(Loep0;Landroid/net/Uri;)Lz5u;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.qr.UniversalQrScannerDeeplinkHandlerKt$processQrLink$1", f = "UniversalQrScannerDeeplinkHandler.kt", l = {120}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UniversalQrScannerDeeplinkHandlerKt$processQrLink$1 extends SuspendLambda implements zls {
    final /* synthetic */ kz11 $this_processQrLink;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalQrScannerDeeplinkHandlerKt$processQrLink$1(kz11 kz11Var, Continuation continuation) {
        super(3, continuation);
        this.$this_processQrLink = kz11Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UniversalQrScannerDeeplinkHandlerKt$processQrLink$1 universalQrScannerDeeplinkHandlerKt$processQrLink$1 = new UniversalQrScannerDeeplinkHandlerKt$processQrLink$1(this.$this_processQrLink, (Continuation) obj3);
        universalQrScannerDeeplinkHandlerKt$processQrLink$1.L$0 = (oep0) obj;
        universalQrScannerDeeplinkHandlerKt$processQrLink$1.L$1 = (Uri) obj2;
        return universalQrScannerDeeplinkHandlerKt$processQrLink$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Uri uri = (Uri) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            kz11 kz11Var = this.$this_processQrLink;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            obj = ((t) kz11Var).d(uri, this);
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
        return (z5u) obj;
    }
}
