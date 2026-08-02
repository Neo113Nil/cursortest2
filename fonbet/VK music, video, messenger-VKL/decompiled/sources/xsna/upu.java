package xsna;

/* compiled from: GroupsGetContentForTabsConfig.kt */
/* loaded from: classes11.dex */
public final class upu {
    public static final a c = new a();
    public static final upu d = new upu(false, false);
    public final boolean a;
    public final boolean b;

    /* compiled from: GroupsGetContentForTabsConfig.kt */
    public static final class a {
    }

    public upu() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upu)) {
            return false;
        }
        upu upuVar = (upu) obj;
        return this.a == upuVar.a && this.b == upuVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGetContentForTabsConfig(shouldChangeTabPrefetchCount=");
        sb.append(this.a);
        sb.append(", shouldChangeComChatsFullscreenMethod=");
        return defpackage.q0.a(sb, this.b, ')');
    }

    public upu(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
