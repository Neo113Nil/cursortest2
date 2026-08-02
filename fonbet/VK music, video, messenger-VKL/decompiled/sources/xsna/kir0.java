package xsna;

import org.jsoup.helper.ValidationException;

/* compiled from: Validate.java */
/* loaded from: classes8.dex */
public final class kir0 {
    public static void a(boolean z) {
        if (!z) {
            throw new ValidationException("Must be true");
        }
    }

    public static void b(String str) {
        if (str == null || str.length() == 0) {
            throw new ValidationException("String must not be empty");
        }
    }

    public static void c(Object obj) {
        if (obj == null) {
            throw new ValidationException("Object must not be null");
        }
    }
}
