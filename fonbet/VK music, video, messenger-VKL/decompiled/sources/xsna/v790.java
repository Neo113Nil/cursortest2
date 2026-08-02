package xsna;

import android.content.Context;
import com.vk.log.L;

/* compiled from: PackageInfoProvider.kt */
/* loaded from: classes.dex */
public final class v790 {
    public static final v790 a = new v790();
    public static volatile Integer b;

    public final synchronized int a(Context context) {
        if (b != null) {
            return b.intValue();
        }
        try {
            b = Integer.valueOf((int) context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode());
        } catch (Exception e) {
            L.i(e);
            b = -1;
        }
        return b.intValue();
    }
}
