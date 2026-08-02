package xsna;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class dsz0 {
    public final int a;
    public final int b;
    public final boolean c;

    public dsz0(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dsz0) && this.a == ((dsz0) obj).a;
    }

    public final int hashCode() {
        return Integer.valueOf(this.a).hashCode();
    }
}
