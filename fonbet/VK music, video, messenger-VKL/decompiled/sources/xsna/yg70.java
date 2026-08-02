package xsna;

/* compiled from: NotificationSettingsPatch.kt */
/* loaded from: classes5.dex */
public final class yg70 implements ug70 {
    public final int b;

    public yg70(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yg70) && this.b == ((yg70) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("ChangeManagedCommunitiesCount(sourcesCount="), this.b, ')');
    }
}
