package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: ChatListPartInterfaces.kt */
/* loaded from: classes2.dex */
public interface suj {
    boolean F();

    default int c(Context context) {
        return e3m.d(R.attr.im_msg_part_corner_radius_small, context);
    }

    boolean f();

    default int g(Context context) {
        return t() > 0 ? c(context) : f() ? c(context) : p(context);
    }

    default int m0(Context context) {
        return t() > 0 ? c(context) : F() ? c(context) : p(context);
    }

    default int p(Context context) {
        return e3m.d(R.attr.im_msg_part_corner_radius_big, context);
    }

    int t();
}
