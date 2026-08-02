package com.yandex.passport.internal.ui.base;

import androidx.fragment.app.Fragment;
import com.yandex.passport.R;

/* loaded from: classes2.dex */
public final class j {
    public static final int[] e = {R.anim.passport_slide_right_in, R.anim.passport_slide_right_out};
    public static final int[] f = {R.anim.passport_slide_left_in, R.anim.passport_slide_left_out};
    public static final int[] g = {R.anim.passport_dialog_second_in, R.anim.passport_dialog_first_out};
    public static final int[] h = {R.anim.passport_dialog_first_in, R.anim.passport_dialog_second_out};
    public final String a;
    public final Fragment b;
    public final ShowFragmentInfo$AnimationType c;
    public final boolean d;

    public j(String str, Fragment fragment, ShowFragmentInfo$AnimationType showFragmentInfo$AnimationType, boolean z) {
        this.a = str;
        this.b = fragment;
        this.c = showFragmentInfo$AnimationType;
        this.d = z;
    }
}
