package defpackage;

import android.os.Trace;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public abstract class ozz0 implements AutoCloseable {
    public static String a(String str) {
        return str.length() < 124 ? str : str.substring(0, HProv.PP_SAME_MEDIA).concat("...");
    }

    public static void c(String str) {
        Trace.beginSection(ffx.f0(a(str)));
    }
}
