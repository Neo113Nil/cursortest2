package xsna;

/* compiled from: TemplateDetailsViewState.kt */
/* loaded from: classes3.dex */
public final class c8p0 {
    public final boolean a;

    public c8p0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c8p0) && this.a == ((c8p0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("TopBarViewState(isEdit="), this.a, ')');
    }
}
