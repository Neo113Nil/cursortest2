package yads;

import android.os.Handler;
import android.os.Looper;
import xsna.s3q0;

/* loaded from: classes10.dex */
public abstract class d12 {
    public static e12 a() {
        if (e12.d == null) {
            synchronized (e12.c) {
                try {
                    if (e12.d == null) {
                        e12.d = new e12(new Handler(Looper.getMainLooper()));
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        e12 e12Var = e12.d;
        if (e12Var != null) {
            return e12Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
