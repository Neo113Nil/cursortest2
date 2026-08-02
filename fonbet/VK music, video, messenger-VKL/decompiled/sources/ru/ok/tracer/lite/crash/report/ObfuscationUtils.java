package ru.ok.tracer.lite.crash.report;

import kotlin.random.Random;
import ru.ok.tracer.Tracer;

/* compiled from: ObfuscationUtils.kt */
/* loaded from: classes9.dex */
public final class ObfuscationUtils {
    public static final boolean hasTracer() {
        try {
            Tracer tracer = Tracer.INSTANCE;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final boolean isObfuscated() {
        try {
            Random.b.getClass();
            String str = BuildConfig.LIBRARY_PACKAGE_NAME + ((char) ((Random.c.j() * Integer.parseInt("0")) + 46)) + "SeemsUnused";
            return !Class.forName(str).getName().equals(str);
        } catch (Throwable unused) {
            return true;
        }
    }
}
