package androidx.webkit.internal;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import defpackage.ih41;
import defpackage.kh41;

/* loaded from: classes10.dex */
class ApiHelperForM$2 extends WebMessagePort.WebMessageCallback {
    final /* synthetic */ kh41.a val$callback;

    public ApiHelperForM$2(kh41.a aVar) {
        this.val$callback = aVar;
    }

    @Override // android.webkit.WebMessagePort.WebMessageCallback
    public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
        this.val$callback.onMessage(new a(webMessagePort), new ih41(webMessage.getData(), a.i(webMessage.getPorts())));
    }
}
