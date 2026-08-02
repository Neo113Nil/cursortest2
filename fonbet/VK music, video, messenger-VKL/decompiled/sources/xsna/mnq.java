package xsna;

/* compiled from: FaveDividerDto.kt */
/* loaded from: classes4.dex */
public final class mnq {
    public final boolean a;

    public mnq(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mnq) && this.a == ((mnq) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("FaveDividerDto(withBottomMargin="), this.a, ')');
    }
}
