package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class ipl {
    public final w53 a = new w53();

    public final int a(String str) {
        if (str == null) {
            return -1;
        }
        w53 w53Var = this.a;
        Object obj = w53Var.get(str);
        if (obj == null) {
            obj = Integer.valueOf(View.generateViewId());
            w53Var.put(str, obj);
        }
        return ((Number) obj).intValue();
    }
}
