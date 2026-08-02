package xsna;

import java.util.ArrayList;

/* compiled from: JniTestInstanceHolder.java */
/* loaded from: classes8.dex */
public final class dyx {
    public static ArrayList<dyx> b;
    public Object a;

    public static synchronized dyx a() {
        dyx dyxVar;
        synchronized (dyx.class) {
            try {
                if (b == null) {
                    b = new ArrayList<>();
                }
                dyxVar = new dyx();
                b.add(dyxVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dyxVar;
    }
}
