package xsna;

/* compiled from: VideoClickAction.kt */
/* loaded from: classes3.dex */
public final class det0 extends dbs0 {
    public final boolean a;

    public det0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof det0) && this.a == ((det0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("VideoScaleAction(isScaled="), this.a, ')');
    }
}
