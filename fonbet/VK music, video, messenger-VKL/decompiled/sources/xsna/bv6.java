package xsna;

import com.vk.api.sdk.exceptions.VKApiException;

/* compiled from: BatchResponseItem.kt */
@ozl
/* loaded from: classes15.dex */
public final class bv6<T> {
    public final T a;
    public final VKApiException b;

    public bv6(T t, VKApiException vKApiException) {
        this.a = t;
        this.b = vKApiException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv6)) {
            return false;
        }
        bv6 bv6Var = (bv6) obj;
        return epx.f(this.a, bv6Var.a) && epx.f(this.b, bv6Var.b);
    }

    public final int hashCode() {
        T t = this.a;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        VKApiException vKApiException = this.b;
        return hashCode + (vKApiException != null ? vKApiException.hashCode() : 0);
    }

    public final String toString() {
        return "BatchResponseItem(body=" + this.a + ", error=" + this.b + ')';
    }
}
