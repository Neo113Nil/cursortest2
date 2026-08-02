package xsna;

import android.content.Context;

/* compiled from: ReLinker.java */
/* loaded from: classes12.dex */
public final class yye0 {

    /* compiled from: ReLinker.java */
    public interface a {
        void b();

        void d(Throwable th);
    }

    public static void a(Context context, String str, a aVar) {
        bze0 bze0Var = new bze0();
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        bze0.c("Beginning load of %s...", str);
        new Thread(new zye0(bze0Var, context, str, aVar)).start();
    }
}
