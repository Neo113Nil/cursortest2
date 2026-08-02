package defpackage;

import android.location.Location;

/* loaded from: classes5.dex */
public abstract class mx81 {
    private static volatile mx81 a;

    public static void a(db dbVar, Location location) {
        d().b(dbVar, location);
    }

    public static mx81 c(mx81 mx81Var) {
        a = mx81Var;
        return mx81Var;
    }

    public static mx81 d() {
        if (a == null) {
            synchronized (mx81.class) {
                try {
                    if (a == null) {
                        a = new lx81();
                    }
                } finally {
                }
            }
        }
        return a;
    }

    public abstract void b(db dbVar, Location location);
}
