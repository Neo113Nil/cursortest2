package io.reactivex.rxjava3.core;

import com.ironsource.X3;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Objects;
import xsna.so;

/* compiled from: Notification.java */
/* loaded from: classes8.dex */
public final class p<T> {
    public static final p<Object> b = new p<>(null);
    public final Object a;

    public p(Object obj) {
        this.a = obj;
    }

    public static <T> p<T> a(Throwable th) {
        Objects.requireNonNull(th, "error is null");
        return new p<>(new NotificationLite.b(th));
    }

    public static <T> p<T> b(T t) {
        Objects.requireNonNull(t, "value is null");
        return new p<>(t);
    }

    public final Throwable c() {
        Object obj = this.a;
        if (obj instanceof NotificationLite.b) {
            return NotificationLite.c(obj);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return Objects.equals(this.a, ((p) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (!(obj instanceof NotificationLite.b)) {
            return so.a(obj, "OnNextNotification[", X3.j.e);
        }
        return "OnErrorNotification[" + NotificationLite.c(obj) + X3.j.e;
    }
}
