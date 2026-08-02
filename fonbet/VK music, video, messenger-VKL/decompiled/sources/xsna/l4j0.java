package xsna;

/* compiled from: TitleRes.kt */
/* loaded from: classes18.dex */
public final class l4j0 implements ezo0 {
    public final boolean a;

    public l4j0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l4j0) && this.a == ((l4j0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("SferumTitle(isTeacher="), this.a, ')');
    }
}
