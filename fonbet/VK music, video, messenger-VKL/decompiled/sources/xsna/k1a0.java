package xsna;

import com.vkontakte.android.R;
import java.util.List;

/* compiled from: PersonAvatarDrawableProvider.kt */
/* loaded from: classes16.dex */
public final class k1a0 {
    public static List a(int i) {
        abg0 abg0Var = dhr0.t;
        List l = e43.l(e43.l(Integer.valueOf(abg0Var.c(R.attr.im_chat_avatar_start_color_1)), Integer.valueOf(abg0Var.c(R.attr.im_chat_avatar_end_color_1))), e43.l(Integer.valueOf(abg0Var.c(R.attr.im_chat_avatar_start_color_2)), Integer.valueOf(abg0Var.c(R.attr.im_chat_avatar_end_color_2))), e43.l(Integer.valueOf(abg0Var.c(R.attr.im_chat_avatar_start_color_3)), Integer.valueOf(abg0Var.c(R.attr.im_chat_avatar_end_color_3))), e43.l(Integer.valueOf(abg0Var.c(R.attr.im_chat_avatar_start_color_4)), Integer.valueOf(abg0Var.c(R.attr.im_chat_avatar_end_color_4))), e43.l(Integer.valueOf(abg0Var.c(R.attr.im_chat_avatar_start_color_5)), Integer.valueOf(abg0Var.c(R.attr.im_chat_avatar_end_color_5))), e43.l(Integer.valueOf(abg0Var.c(R.attr.im_chat_avatar_start_color_6)), Integer.valueOf(abg0Var.c(R.attr.im_chat_avatar_end_color_6))));
        return (List) l.get(i % l.size());
    }
}
