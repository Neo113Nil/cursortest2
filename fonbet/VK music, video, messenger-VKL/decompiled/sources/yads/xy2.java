package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class xy2 {
    public static final /* synthetic */ xy2 a = new xy2();
    public static final Object b = new Object();
    public static volatile zy2 c;

    public static yy2 a(Context context) {
        zy2 zy2Var;
        zy2 zy2Var2 = c;
        if (zy2Var2 != null) {
            return zy2Var2;
        }
        synchronized (b) {
            zy2Var = c;
            if (zy2Var == null) {
                zy2Var = new zy2(vh1.a(context, "YadPreferenceFile"));
                c = zy2Var;
            }
        }
        return zy2Var;
    }
}
