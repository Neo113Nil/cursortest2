package defpackage;

import android.content.Context;
import android.graphics.Rect;

/* loaded from: classes13.dex */
public final class bse {
    public final int a;
    public final int b;
    public final int c;
    public final Rect d;
    public final int e;

    public bse(Context context, int i) {
        this.a = i;
        this.b = context.getResources().getDimensionPixelSize(psg0.shortcuts_corners_round);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(mug0.shortcuts_corner_badge_up_corner_size);
        this.c = dimensionPixelSize;
        this.d = new Rect(context.getResources().getDimensionPixelSize(mug0.shortcuts_corner_badge_padding_left), context.getResources().getDimensionPixelSize(mug0.shortcuts_corner_badge_padding_top), context.getResources().getDimensionPixelSize(mug0.shortcuts_corner_badge_padding_right), context.getResources().getDimensionPixelSize(mug0.shortcuts_corner_badge_padding_bottom));
        this.e = i + dimensionPixelSize;
    }
}
