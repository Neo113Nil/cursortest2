package xsna;

import android.content.Context;
import com.vk.cachecontrol.api.CacheTarget;
import java.io.File;
import xsna.gx8;

/* compiled from: NotificationFileLoaderHelper.kt */
/* loaded from: classes.dex */
public final class y970 implements gx8.a {
    public static final y970 b = new y970();
    public static final File c;
    public static final bpn0 d;
    public static final bpn0 e;

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        c = new File(context.getExternalCacheDir(), "notifications_cache");
        d = new bpn0(new q03(9));
        e = new bpn0(new r03(6));
    }

    @Override // xsna.gx8.a
    public final CacheTarget a() {
        return CacheTarget.OTHER;
    }

    @Override // xsna.gx8.a
    public final void dispose() {
        ((l9r) d.getValue()).c();
    }

    @Override // xsna.gx8.a
    public final String getDescription() {
        return "NotificationFileLoaderHelper";
    }

    @Override // xsna.gx8.a
    public final long u() {
        return z4g.g(c);
    }
}
