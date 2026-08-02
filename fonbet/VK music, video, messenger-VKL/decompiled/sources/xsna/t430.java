package xsna;

/* compiled from: ModerationConfirmAdultMVI.kt */
/* loaded from: classes18.dex */
public final class t430 implements km50 {
    public final boolean b;

    public t430(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t430) && this.b == ((t430) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("ModerationConfirmAdultState(isLoading="), this.b, ')');
    }
}
