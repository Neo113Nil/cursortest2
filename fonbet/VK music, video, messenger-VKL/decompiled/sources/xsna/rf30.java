package xsna;

import androidx.annotation.Nullable;
import xsna.fi20;

/* compiled from: Mp4AlternateGroupData.java */
/* loaded from: classes12.dex */
public final class rf30 implements fi20.a {
    public final int a;

    public rf30(int i) {
        this.a = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rf30) && this.a == ((rf30) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.a;
    }
}
