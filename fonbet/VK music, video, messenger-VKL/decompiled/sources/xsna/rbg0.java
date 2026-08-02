package xsna;

/* compiled from: ProductActionButtonsState.kt */
/* loaded from: classes18.dex */
public final class rbg0 {
    public final String a;
    public final String b;

    public rbg0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbg0)) {
            return false;
        }
        rbg0 rbg0Var = (rbg0) obj;
        return epx.f(this.a, rbg0Var.a) && epx.f(this.b, rbg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResponseTimeData(highlightText=");
        sb.append(this.a);
        sb.append(", descriptionText=");
        return ho8.a(sb, this.b, ')');
    }
}
