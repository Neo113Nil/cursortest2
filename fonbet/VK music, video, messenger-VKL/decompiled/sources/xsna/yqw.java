package xsna;

/* compiled from: ContactSyncEvents.kt */
/* loaded from: classes.dex */
public final class yqw extends daj {
    public final boolean a;

    public yqw(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yqw) && this.a == ((yqw) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("InAppPermissionChanged(granted="), this.a, ')');
    }
}
