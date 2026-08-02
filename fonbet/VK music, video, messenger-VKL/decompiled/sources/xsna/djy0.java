package xsna;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;

/* loaded from: classes12.dex */
public final class djy0 {
    public com.digitalturbine.ignite.authenticator.receiver.a a;
    public Context b;
    public yyy0 c;
    public yyy0 d;

    public final void a() {
        com.digitalturbine.ignite.authenticator.receiver.a aVar;
        vay0.a("%s : start", "OneDTPropertyWatchdog");
        Context context = this.b;
        if (context == null || (aVar = this.a) == null || aVar.b) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("com.dt.ignite.service.action.PROPERTY_CHANGED");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(aVar, intentFilter, 4);
        } else {
            context.registerReceiver(aVar, intentFilter);
        }
        this.a.b = true;
    }
}
