package defpackage;

/* loaded from: classes2.dex */
public final class aic0 implements eic0 {
    public final String a;

    public aic0(String str) {
        this.a = str;
    }

    @Override // defpackage.eic0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aic0) && jl40.l(this.a, ((aic0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("JustInteract(actionContext="), this.a, ')');
    }
}
