package yads;

import android.content.Context;
import java.util.Set;

/* loaded from: classes10.dex */
public final class b2 {
    public final Set a = xsna.tj0.c();
    public final Set b = xsna.tj0.c();
    public int c;

    public b2(Context context) {
        this.c = a(context);
    }

    public static int a(Context context) {
        return context.getResources().getConfiguration().orientation;
    }
}
