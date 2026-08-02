package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: Encoding.java */
/* loaded from: classes.dex */
public final class ijp {
    public final String a;

    public ijp(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.a = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijp)) {
            return false;
        }
        return this.a.equals(((ijp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @NonNull
    public final String toString() {
        return i5s.a(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
