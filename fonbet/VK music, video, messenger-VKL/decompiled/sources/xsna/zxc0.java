package xsna;

import androidx.core.app.NotificationCompat;
import com.vk.internal.api.GsonHolder;
import java.util.List;

/* compiled from: PreferenceDataStoreDelegate.android.kt */
/* loaded from: classes.dex */
public final class zxc0 implements aqk {
    public static final zxc0 a = new zxc0();

    public static xy2 a(zxc0 zxc0Var, String str, List list, int i) {
        String str2 = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            list = null;
        }
        zxc0Var.getClass();
        tfx tfxVar = new tfx("adsint.registerAdEvents", new jq(1), new kq(1));
        if (str2 != null) {
            tfx.o(tfxVar, "events", str2, 0, 0, 12);
        }
        if (list != null) {
            tfx.o(tfxVar, NotificationCompat.CATEGORY_EVENT, GsonHolder.a().toJson(list), 0, 0, 12);
        }
        return tfxVar;
    }

    public static dyc0 b(String str, x0g0 x0g0Var) {
        bdn bdnVar = bdn.a;
        return new dyc0(str, x0g0Var, yxc0.i, zvj.a(wgl.c.plus(whn0.a())));
    }
}
