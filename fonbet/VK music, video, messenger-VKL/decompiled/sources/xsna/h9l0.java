package xsna;

import android.content.Context;
import android.util.DisplayMetrics;
import com.vkontakte.android.R;

/* compiled from: StickersConfig.kt */
/* loaded from: classes5.dex */
public final class h9l0 {
    public static final int a = iah0.a(34);
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;

    static {
        int a2 = iah0.a(176);
        b = a2;
        c = (int) (iah0.f().widthPixels * 0.22f);
        e = 4;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        boolean b2 = fnj.b(context);
        d = context.getResources().getDimensionPixelSize(R.dimen.sticker_suggest_size);
        Context context2 = e43.a;
        int i2 = fnj.b(context2 != null ? context2 : null) ? 12 : 4;
        f = i2;
        g = fnj.b(context) ? 12 : 6;
        if (b2) {
            a2 = iah0.a(250);
        }
        h = Math.min(a2, 512);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i3 = fnj.b(context) ? xgy.F : displayMetrics.widthPixels;
        int i4 = fnj.b(context) ? xgy.G : displayMetrics.heightPixels;
        int a3 = iah0.a(3);
        int i5 = (i3 - a3) / i2;
        int i6 = (i4 - a3) / 4;
        int i7 = xgy.F / 4;
        if (!b2) {
            i7 = Math.max(i5, i6);
        }
        i = Math.min(i7, 512);
        j = cn70.b(20);
    }
}
