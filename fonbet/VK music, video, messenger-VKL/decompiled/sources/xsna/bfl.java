package xsna;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import java.util.HashSet;
import xsna.z720;

/* compiled from: DefaultFragmentWithCustomMenu.kt */
/* loaded from: classes6.dex */
public final class bfl implements tds, uds, vds, sds {
    @Override // xsna.tds
    public final ColorStateList Oc() {
        int[][] iArr = {new int[]{-16842912}, new int[]{R.attr.state_checked}};
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        int color = context.getColor(com.vkontakte.android.R.color.vk_gray_500);
        Context context2 = e43.a;
        return new ColorStateList(iArr, new int[]{color, (context2 != null ? context2 : null).getColor(com.vkontakte.android.R.color.vk_white)});
    }

    @Override // xsna.vds
    public final int Q0() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        HashSet hashSet = iah0.a;
        return fnj.d(context) ? -1 : 1;
    }

    @Override // xsna.sds
    public final int getBottomMargin() {
        return 0;
    }

    @Override // xsna.tds
    public final z720.a gf() {
        return new z720.a(com.vkontakte.android.R.color.vk_black, com.vkontakte.android.R.color.color_list_left_menu_text, com.vkontakte.android.R.color.color_list_left_menu_icons, com.vkontakte.android.R.color.vk_black, com.vkontakte.android.R.color.vk_black, com.vkontakte.android.R.color.vk_white, com.vkontakte.android.R.color.vk_white);
    }

    @Override // xsna.woo0
    public final int o7() {
        return -16777216;
    }

    @Override // xsna.tds
    public final int qc() {
        return 0;
    }
}
