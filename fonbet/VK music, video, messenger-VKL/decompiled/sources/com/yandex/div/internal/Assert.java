package com.yandex.div.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.reactivex.rxjava3.internal.operators.observable.q1;
import xsna.fw3;
import xsna.ho8;
import xsna.i5s;

/* loaded from: classes7.dex */
public class Assert {

    @NonNull
    private static AssertionErrorHandler sAssertionErrorHandler = new q1(4);
    private static volatile boolean sEnabled = false;

    public static void assertEquals(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        if (obj == null && obj2 == null) {
            return;
        }
        if (obj == null || !obj.equals(obj2)) {
            if (!(obj instanceof String) || !(obj2 instanceof String)) {
                failNotEquals(str, obj, obj2);
                return;
            }
            if (str == null) {
                str = "";
            }
            performFail(new ComparisonFailure(str, (String) obj, (String) obj2));
        }
    }

    public static void assertMainThread() {
        if (isEnabled()) {
            assertSame("Code run not in main thread!", Looper.getMainLooper(), Looper.myLooper());
        }
    }

    public static void assertNull(@Nullable String str, @Nullable Object obj) {
        assertTrue(str, obj == null);
    }

    public static void assertSame(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        if (obj == obj2) {
            return;
        }
        failNotSame(str, obj, obj2);
    }

    public static void assertTrue(@Nullable String str, boolean z) {
        if (z) {
            return;
        }
        fail(str);
    }

    public static void fail(@Nullable String str) {
        if (sEnabled) {
            if (str == null) {
                str = "";
            }
            performFail(new AssertionError(str));
        }
    }

    private static void failNotEquals(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        fail(format(str, obj, obj2));
    }

    private static void failNotSame(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        fail((str != null ? str.concat(" ") : "") + "expected same:<" + obj + "> was not:<" + obj2 + ">");
    }

    public static String format(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        String str2 = "";
        if (str != null && !str.equals("")) {
            str2 = str.concat(" ");
        }
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        if (!valueOf.equals(valueOf2)) {
            StringBuilder b = i5s.b(str2, "expected:<", valueOf, "> but was:<", valueOf2);
            b.append(">");
            return b.toString();
        }
        StringBuilder b2 = ho8.b(str2, "expected: ");
        b2.append(formatClassAndValue(obj, valueOf));
        b2.append(" but was: ");
        b2.append(formatClassAndValue(obj2, valueOf2));
        return b2.toString();
    }

    private static String formatClassAndValue(@Nullable Object obj, @Nullable String str) {
        return fw3.c(obj == null ? "null" : obj.getClass().getName(), "<", str, ">");
    }

    public static boolean isEnabled() {
        return sEnabled;
    }

    private static void performFail(@NonNull AssertionError assertionError) {
        if (isEnabled()) {
            ((q1) sAssertionErrorHandler).getClass();
            lambda$static$0(assertionError);
        }
    }

    public static void assertNull(@Nullable Object obj) {
        assertNull(null, obj);
    }

    public static void assertTrue(boolean z) {
        assertTrue(null, z);
    }

    public static void fail(@Nullable String str, @Nullable Throwable th) {
        if (sEnabled) {
            AssertionError assertionError = new AssertionError(str);
            assertionError.initCause(th);
            performFail(assertionError);
        }
    }

    private static /* synthetic */ void lambda$static$0(AssertionError assertionError) {
        throw assertionError;
    }
}
