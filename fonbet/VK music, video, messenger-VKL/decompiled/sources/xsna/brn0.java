package xsna;

/* compiled from: ContactSyncEvents.kt */
/* loaded from: classes17.dex */
public final class brn0 extends daj {
    public final boolean a;

    public brn0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof brn0) && this.a == ((brn0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("SystemPermissionChanged(granted="), this.a, ')');
    }
}
