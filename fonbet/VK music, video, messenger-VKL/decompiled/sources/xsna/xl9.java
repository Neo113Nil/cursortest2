package xsna;

/* compiled from: CameraToggles.kt */
/* loaded from: classes7.dex */
public final class xl9 {
    public final boolean a;

    public xl9(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xl9) && this.a == ((xl9) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("CameraToggles(isCrashOnCameraCloseRequired="), this.a, ')');
    }
}
