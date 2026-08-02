package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class z20 {
    public final Context a;

    public z20(Context context) {
        this.a = uz.a(context);
    }

    public final boolean a() {
        return (this.a.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
