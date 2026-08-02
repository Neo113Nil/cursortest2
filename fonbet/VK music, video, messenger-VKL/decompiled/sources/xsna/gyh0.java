package xsna;

import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;

/* compiled from: SearchResultItem.kt */
/* loaded from: classes2.dex */
public final class gyh0<T> {
    public final T a;
    public final ImSearchItemLoggingInfo b;

    public gyh0(T t, ImSearchItemLoggingInfo imSearchItemLoggingInfo) {
        this.a = t;
        this.b = imSearchItemLoggingInfo;
    }

    public static gyh0 a(gyh0 gyh0Var, ImSearchItemLoggingInfo imSearchItemLoggingInfo) {
        T t = gyh0Var.a;
        gyh0Var.getClass();
        return new gyh0(t, imSearchItemLoggingInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyh0)) {
            return false;
        }
        gyh0 gyh0Var = (gyh0) obj;
        return epx.f(this.a, gyh0Var.a) && epx.f(this.b, gyh0Var.b);
    }

    public final int hashCode() {
        T t = this.a;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        ImSearchItemLoggingInfo imSearchItemLoggingInfo = this.b;
        return hashCode + (imSearchItemLoggingInfo != null ? imSearchItemLoggingInfo.hashCode() : 0);
    }

    public final String toString() {
        return "SearchResultItem(item=" + this.a + ", searchLoggingInfo=" + this.b + ')';
    }
}
