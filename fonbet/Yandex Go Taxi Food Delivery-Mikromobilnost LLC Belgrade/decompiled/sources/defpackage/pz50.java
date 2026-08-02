package defpackage;

import com.yandex.plus.core.network.error.NetworkException;

/* loaded from: classes2.dex */
public final class pz50 implements sz50 {
    public final NetworkException a;

    public pz50(NetworkException networkException) {
        this.a = networkException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pz50) && jl40.l(this.a, ((pz50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(error=" + this.a + ')';
    }
}
