package xsna;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: RippleUtils.java */
/* loaded from: classes13.dex */
public final class olg0 {
    public static final int[] a = {R.attr.state_pressed};
    public static final int[] b = {R.attr.state_focused};
    public static final int[] c = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] d = {R.attr.state_selected};

    @NonNull
    public static ColorStateList a(@Nullable ColorStateList colorStateList) {
        int[] iArr = b;
        return new ColorStateList(new int[][]{d, iArr, StateSet.NOTHING}, new int[]{b(colorStateList, c), b(colorStateList, iArr), b(colorStateList, a)});
    }

    public static int b(@Nullable ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return n8g.l(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    @NonNull
    public static ColorStateList c(@Nullable ColorStateList colorStateList) {
        return colorStateList != null ? colorStateList : ColorStateList.valueOf(0);
    }
}
