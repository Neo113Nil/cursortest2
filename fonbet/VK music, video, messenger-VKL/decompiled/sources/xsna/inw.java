package xsna;

import android.media.ImageWriter;
import android.view.Surface;
import java.lang.reflect.Method;

/* compiled from: ImageWriterCompatApi26Impl.java */
/* loaded from: classes11.dex */
public final class inw {
    public static final Method a;

    static {
        try {
            Class cls = Integer.TYPE;
            a = ImageWriter.class.getMethod("newInstance", Surface.class, cls, cls);
        } catch (NoSuchMethodException unused) {
        }
    }
}
