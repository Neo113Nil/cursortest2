package xsna;

/* compiled from: ClipFeedTooltip.kt */
/* loaded from: classes17.dex */
public final class zyc {
    public final boolean a;

    public zyc(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zyc) && this.a == ((zyc) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("ClipFeedTooltipShowSettings(isTipRequired="), this.a, ')');
    }
}
