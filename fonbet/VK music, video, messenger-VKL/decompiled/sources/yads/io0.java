package yads;

import java.util.HashSet;

/* loaded from: classes10.dex */
public abstract class io0 {
    public static final HashSet a = new HashSet();
    public static String b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (io0.class) {
            if (a.add(str)) {
                b += ", " + str;
            }
        }
    }
}
