package xsna;

/* compiled from: VideoQueueState.kt */
/* loaded from: classes3.dex */
public final class lat0 {
    public final boolean a;
    public final boolean b;

    public lat0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lat0)) {
            return false;
        }
        lat0 lat0Var = (lat0) obj;
        return this.a == lat0Var.a && this.b == lat0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoQueueState(previousButtonEnabled=");
        sb.append(this.a);
        sb.append(", nextButtonEnabled=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
