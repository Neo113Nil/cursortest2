package defpackage;

/* loaded from: classes2.dex */
public final class dic0 implements eic0 {
    public final String a;

    public dic0(String str) {
        this.a = str;
    }

    @Override // defpackage.eic0
    public final String a() {
        return "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dic0) && jl40.l(this.a, ((dic0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("ToggleSwitch(actionContext=, widgetId="), this.a, ')');
    }
}
