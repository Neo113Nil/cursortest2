package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: ChatListPartInterfaces.kt */
/* loaded from: classes2.dex */
public interface tuj extends suj {
    boolean a0();

    @Override // xsna.suj
    default int c(Context context) {
        return k() ? e3m.a(R.dimen.vkim_msg_part_corner_radius_small, context) : e3m.d(R.attr.im_msg_part_corner_radius_small, context);
    }

    default f14 e(Context context) {
        if (a0()) {
            return new f14(F() ? 0 : e3m.d(R.attr.im_msg_part_corner_radius_big, context), (!f() || i()) ? e3m.d(R.attr.im_msg_part_corner_radius_big, context) : 0);
        }
        return new f14(m0(context), g(context));
    }

    boolean i();

    boolean k();
}
