package xsna;

/* compiled from: VideoProfileRefreshViewState.kt */
/* loaded from: classes6.dex */
public final class u8t0 {
    public final boolean a;

    public u8t0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u8t0) && this.a == ((u8t0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("VideoProfileRefreshViewState(isReloadingInBackground="), this.a, ')');
    }
}
