package xsna;

import android.net.Uri;
import xsna.zdh0;

/* compiled from: ScreenshotDetector.kt */
/* loaded from: classes5.dex */
public final class aeh0 implements zdh0.b {
    public final /* synthetic */ io.reactivex.rxjava3.core.r<Uri> a;

    public aeh0(io.reactivex.rxjava3.core.r<Uri> rVar) {
        this.a = rVar;
    }

    @Override // xsna.zdh0.b
    public final void a(Throwable th) {
        this.a.b(th);
    }

    @Override // xsna.zdh0.b
    public final void b(Uri uri) {
        this.a.onNext(uri);
    }
}
