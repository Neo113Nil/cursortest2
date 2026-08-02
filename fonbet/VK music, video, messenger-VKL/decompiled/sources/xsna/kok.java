package xsna;

import android.os.Handler;
import android.os.Looper;

/* compiled from: CustomTabsClient.java */
/* loaded from: classes11.dex */
public final class kok extends rmv {
    public final Handler a;
    public final /* synthetic */ eok b;

    public kok(eok eokVar) {
        this.b = eokVar;
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        this.a = new Handler(Looper.getMainLooper());
    }
}
