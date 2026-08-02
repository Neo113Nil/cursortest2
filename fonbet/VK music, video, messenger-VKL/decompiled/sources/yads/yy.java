package yads;

import android.content.Context;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class yy {
    public static final /* synthetic */ yy a = new yy();
    public static final Object b = new Object();
    public static volatile cz c;

    public static zy a(Context context) {
        if (c == null) {
            synchronized (b) {
                try {
                    if (c == null) {
                        c = new cz(vh1.a(context, "YadPreferenceFile"), new en0(), new u7(), new t43());
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        cz czVar = c;
        if (czVar != null) {
            return czVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
