package yads;

import android.content.Context;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class ww {
    public static volatile zw b;
    public static final /* synthetic */ ww a = new ww();
    public static final Object c = new Object();

    public static xw a(Context context) {
        if (b == null) {
            synchronized (c) {
                try {
                    if (b == null) {
                        b = yw.a(context);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zw zwVar = b;
        if (zwVar != null) {
            return zwVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
