package xsna;

/* compiled from: SkipContainer.kt */
/* loaded from: classes3.dex */
public final class kzj0 {
    public boolean a;

    public kzj0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kzj0) && this.a == ((kzj0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("SkipContainerParentData(isSkippable="), this.a, ')');
    }

    public kzj0(int i) {
        this.a = false;
    }
}
