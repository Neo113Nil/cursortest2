package androidx.compose.ui.platform;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import defpackage.qh;
import defpackage.sls;
import defpackage.tls;
import defpackage.yee;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* synthetic */ class AndroidComposeView$contentCaptureManager$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        View view = (View) this.receiver;
        tls tlsVar = c.a;
        if (Build.VERSION.SDK_INT >= 30) {
            qh.c(view);
        }
        ContentCaptureSession contentCaptureSession = view.getContentCaptureSession();
        if (contentCaptureSession == null) {
            return null;
        }
        return yee.g(contentCaptureSession, view);
    }
}
