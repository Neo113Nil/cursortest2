package xsna;

import android.os.Parcelable;

/* compiled from: AppStateCacheEntry.kt */
/* loaded from: classes.dex */
public final class q93 {
    public final String a;
    public final Parcelable b;
    public volatile boolean c;

    public q93(String str, Parcelable parcelable) {
        this.a = str;
        this.b = parcelable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q93)) {
            return false;
        }
        q93 q93Var = (q93) obj;
        return epx.f(this.a, q93Var.a) && epx.f(this.b, q93Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Parcelable parcelable = this.b;
        return Long.hashCode(0L) + ((hashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31);
    }

    public final String toString() {
        return "AppStateCacheEntry(uid=" + this.a + ", parcelable=" + this.b + ", keepAtLeastMs=0)";
    }
}
