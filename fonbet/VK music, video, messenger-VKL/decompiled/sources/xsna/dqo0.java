package xsna;

import android.os.Build;
import android.os.PowerManager;
import com.vkontakte.android.VKApplication;

/* compiled from: ThermalApiTask.kt */
/* loaded from: classes11.dex */
public final class dqo0 implements gzs<s3q0> {
    public final VKApplication b;

    public dqo0(VKApplication vKApplication) {
        this.b = vKApplication;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        if (Build.VERSION.SDK_INT >= 29) {
            PowerManager powerManager = (PowerManager) this.b.getSystemService("power");
            asu0.a.getClass();
            powerManager.addThermalStatusListener(asu0.x(), new cqo0());
        }
        return s3q0.a;
    }
}
