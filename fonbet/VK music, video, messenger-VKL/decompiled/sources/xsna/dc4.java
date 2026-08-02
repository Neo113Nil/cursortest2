package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: ChatListPartInterfaces.kt */
/* loaded from: classes2.dex */
public interface dc4 extends tuj {
    boolean T();

    @Override // xsna.tuj
    default f14 e(Context context) {
        int d = e3m.d(R.attr.im_msg_part_corner_radius_big, context);
        int c = c(context);
        if (!a0()) {
            return (j() && k()) ? new f14(c, c) : (j() && (r() || T())) ? new f14(0, d) : j() ? new f14(m0(context), d) : new f14(d, d);
        }
        int i = F() ? 0 : d;
        if (f() && !i()) {
            d = 0;
        }
        return new f14(i, d);
    }

    boolean j();

    boolean r();
}
