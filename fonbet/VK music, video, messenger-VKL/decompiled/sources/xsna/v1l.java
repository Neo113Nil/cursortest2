package xsna;

import android.app.Activity;
import android.net.Uri;
import xsna.zdh0;

/* compiled from: DatingScreenshotDelegate.kt */
/* loaded from: classes6.dex */
public final class v1l implements zdh0.b {
    public final /* synthetic */ w1l a;

    public v1l(w1l w1lVar) {
        this.a = w1lVar;
    }

    @Override // xsna.zdh0.b
    public final void a(Throwable th) {
        xgx0.a.getClass();
        xgx0.d(th);
    }

    @Override // xsna.zdh0.b
    public final void b(Uri uri) {
        w1l w1lVar = this.a;
        Activity activity = (Activity) w1lVar.b.invoke();
        if (activity != null) {
            activity.runOnUiThread(new yn2(w1lVar, 4));
        }
    }
}
