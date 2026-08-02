package yads;

import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class o63 {
    public static Object a(Callable callable, Object obj, String str, String str2) {
        if (obj == null) {
            return null;
        }
        try {
            return callable.call();
        } catch (Throwable unused) {
            return null;
        }
    }
}
