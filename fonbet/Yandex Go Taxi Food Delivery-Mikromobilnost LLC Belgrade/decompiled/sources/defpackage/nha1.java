package defpackage;

import android.net.Uri;

/* loaded from: classes11.dex */
public abstract class nha1 {
    public static final xia1 a;

    static {
        xia1 xia1Var;
        Uri uri = uha1.a;
        synchronized (fia1.class) {
            try {
                if (fia1.a == null) {
                    xia1 xia1Var2 = new xia1();
                    synchronized (fia1.class) {
                        if (fia1.a != null) {
                            throw new IllegalStateException("init() already called");
                        }
                        fia1.a = xia1Var2;
                    }
                }
                xia1Var = fia1.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        a = xia1Var;
    }
}
