package ru.ok.android.webrtc.utils;

import java.util.Arrays;
import ru.ok.android.webrtc.connection.BadConnectionCallback;

/* loaded from: classes9.dex */
public final class a {
    public int b = 0;
    public final boolean[] a = new boolean[BadConnectionCallback.Cause.values().length];

    public final boolean a(BadConnectionCallback.Cause cause, boolean z) {
        boolean z2 = this.a[cause.ordinal()];
        this.a[cause.ordinal()] = z;
        if (z2 == z) {
            return false;
        }
        this.b += z ? 1 : -1;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.b == aVar.b && Arrays.equals(this.a, aVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
