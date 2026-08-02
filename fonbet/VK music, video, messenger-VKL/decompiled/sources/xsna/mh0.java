package xsna;

import com.vkontakte.android.R;
import one.video.ad.ux.a;
import xsna.ph0;

/* compiled from: AdProductMapper.kt */
/* loaded from: classes8.dex */
public final class mh0 {
    public static one.video.ad.ux.a a(nej0 nej0Var) {
        Object obj = ph0.a;
        ph0.b a = ph0.a(nej0Var.g);
        ph0.b a2 = ph0.a(nej0Var.f);
        a.C2169a c2169a = null;
        String str = a != null ? a.b : null;
        Long l = a != null ? a.a : null;
        Long l2 = a2 != null ? a2.a : null;
        if (l != null && l2 != null) {
            if (l.equals(l2)) {
                c2169a = new a.C2169a("NEW", R.color.one_video_azure_300);
            } else {
                int longValue = (int) ((1 - (l.longValue() / l2.longValue())) * 100);
                if (5 <= longValue && longValue < 96) {
                    c2169a = new a.C2169a(tgw.b(longValue, "-", "%"), R.color.one_video_red);
                }
            }
        }
        return new one.video.ad.ux.a(nej0Var.a, nej0Var.b, nej0Var.c, str, c2169a, nej0Var.d);
    }
}
