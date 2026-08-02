package defpackage;

import android.webkit.SslErrorHandler;

/* loaded from: classes12.dex */
public final class lp41 implements sl60 {
    public final /* synthetic */ SslErrorHandler a;
    public final /* synthetic */ boolean b;

    public lp41(SslErrorHandler sslErrorHandler, boolean z) {
        this.a = sslErrorHandler;
        this.b = z;
    }

    @Override // defpackage.sl60
    public final void a() {
        boolean z = this.b;
        SslErrorHandler sslErrorHandler = this.a;
        if (z) {
            if (sslErrorHandler != null) {
                sslErrorHandler.proceed();
            }
        } else if (sslErrorHandler != null) {
            sslErrorHandler.cancel();
        }
    }

    @Override // defpackage.sl60
    public final void r() {
        SslErrorHandler sslErrorHandler = this.a;
        if (sslErrorHandler != null) {
            sslErrorHandler.proceed();
        }
    }
}
