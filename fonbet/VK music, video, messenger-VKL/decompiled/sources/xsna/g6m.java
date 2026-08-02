package xsna;

import androidx.annotation.Nullable;

/* compiled from: DeviceInfo.java */
/* loaded from: classes12.dex */
public final class g6m {
    public static final /* synthetic */ int c = 0;
    public final int a = 0;
    public final int b = 0;

    /* compiled from: DeviceInfo.java */
    public static final class a {
    }

    static {
        y2r0.L(0);
        y2r0.L(1);
        y2r0.L(2);
        y2r0.L(3);
    }

    public g6m(a aVar) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6m)) {
            return false;
        }
        g6m g6mVar = (g6m) obj;
        g6mVar.getClass();
        return this.a == g6mVar.a && this.b == g6mVar.b;
    }

    public final int hashCode() {
        return (((16337 + this.a) * 31) + this.b) * 31;
    }
}
