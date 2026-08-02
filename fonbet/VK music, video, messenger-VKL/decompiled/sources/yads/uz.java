package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public abstract class uz {
    public static final Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public static final ub2 b(Context context) {
        int i = context.getResources().getConfiguration().orientation;
        return i != 1 ? i != 2 ? ub2.e : ub2.c : ub2.d;
    }
}
