package androidx.media3.datasource;

import android.net.http.UrlRequest$StatusListener;
import defpackage.bvu;
import defpackage.cyd;

/* loaded from: classes10.dex */
class HttpEngineDataSource$UrlRequestWrapper$1 implements UrlRequest$StatusListener {
    final /* synthetic */ bvu this$0;
    final /* synthetic */ cyd val$conditionVariable;
    final /* synthetic */ int[] val$statusHolder;

    public HttpEngineDataSource$UrlRequestWrapper$1(bvu bvuVar, int[] iArr, cyd cydVar) {
        this.this$0 = bvuVar;
        this.val$statusHolder = iArr;
        this.val$conditionVariable = cydVar;
    }

    public void onStatus(int i) {
        this.val$statusHolder[0] = i;
        this.val$conditionVariable.d();
    }
}
