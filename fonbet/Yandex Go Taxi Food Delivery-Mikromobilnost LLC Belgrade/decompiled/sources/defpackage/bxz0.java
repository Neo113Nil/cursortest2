package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class bxz0 {
    public static WeakReference b;
    public oo2 a;

    public final synchronized axz0 a() {
        String str;
        axz0 axz0Var;
        oo2 oo2Var = this.a;
        synchronized (((ArrayDeque) oo2Var.w)) {
            str = (String) ((ArrayDeque) oo2Var.w).peek();
        }
        Pattern pattern = axz0.d;
        axz0Var = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                axz0Var = new axz0(split[0], split[1]);
            }
        }
        return axz0Var;
    }
}
