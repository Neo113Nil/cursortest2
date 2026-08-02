package org.chromium.base;

/* loaded from: classes8.dex */
public class JavaUtils {
    private JavaUtils() {
    }

    public static <T extends Throwable> RuntimeException throwUnchecked(Throwable th) throws Throwable {
        throw th;
    }
}
