package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: ChatListPartInterfaces.kt */
/* loaded from: classes2.dex */
public interface nl8 {
    default int G0(Context context) {
        return Math.max(iah0.f().widthPixels - J0(context), iah0.a(70));
    }

    default int J0(Context context) {
        return e3m.a(R.dimen.msg_bubble_max_width, context);
    }

    default int P(Context context) {
        return e3m.d(R.attr.im_msg_box_margin_start_with_avatar, context);
    }

    default int W(Context context) {
        return e3m.d(R.attr.im_msg_box_margin_start_no_avatar, context);
    }

    default int Y(Context context) {
        return (iah0.f().widthPixels - G0(context)) - h(context);
    }

    void Z(int i);

    default int h(Context context) {
        if (!q()) {
            return W(context);
        }
        return P(context) + iah0.a(32);
    }

    boolean q();
}
