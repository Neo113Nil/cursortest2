package xsna;

/* compiled from: NotificationSettingsAction.kt */
/* loaded from: classes5.dex */
public final class sf70 implements rf70 {
    public final String b;

    public sf70(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sf70) && epx.f(this.b, ((sf70) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("ClickSection(sectionId="), this.b, ')');
    }
}
