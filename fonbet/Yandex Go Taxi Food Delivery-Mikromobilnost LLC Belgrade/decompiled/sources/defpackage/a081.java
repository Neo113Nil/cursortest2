package defpackage;

import android.content.Context;

/* loaded from: classes7.dex */
public final class a081 {
    public static final Object f = new Object();
    public static volatile a081 g;
    public volatile gg81 a;
    public Boolean b;
    public boolean c;
    public boolean d;
    public boolean e = true;

    public static void b() {
        synchronized (f) {
        }
    }

    public final gg81 a(Context context) {
        gg81 gg81Var;
        gg81 gg81Var2 = this.a;
        if (gg81Var2 != null) {
            return gg81Var2;
        }
        synchronized (f) {
            gg81Var = this.a;
            if (gg81Var == null) {
                gg81Var = bu71.a(context).b();
                this.a = gg81Var;
            }
        }
        return gg81Var;
    }

    public final Boolean c() {
        Boolean bool;
        synchronized (f) {
            bool = this.b;
        }
        return bool;
    }
}
