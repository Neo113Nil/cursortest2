package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.vkontakte.android.R;

/* compiled from: BordersDrawer.kt */
/* loaded from: classes4.dex */
public final class h28 {
    public static final int e;
    public static final int f;
    public final Drawable a;
    public final Drawable b;
    public final Drawable c;
    public final Drawable d;

    static {
        int floor = (int) Math.floor(24 * Resources.getSystem().getDisplayMetrics().density);
        int floor2 = (int) Math.floor(2 * Resources.getSystem().getDisplayMetrics().density);
        e = floor2;
        f = floor - floor2;
    }

    public h28(Context context) {
        this.a = knj.a(R.drawable.ic_corner_top_left, context);
        this.b = knj.a(R.drawable.ic_corner_bottom_left, context);
        this.c = knj.a(R.drawable.ic_corner_top_right, context);
        this.d = knj.a(R.drawable.ic_corner_bottom_right, context);
    }
}
