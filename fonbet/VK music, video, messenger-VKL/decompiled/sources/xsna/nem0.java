package xsna;

/* compiled from: StoryStatisticsInfoDbModel.kt */
/* loaded from: classes6.dex */
public final class nem0 {
    public final String a;
    public final int b;
    public final boolean c;

    public nem0(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nem0)) {
            return false;
        }
        nem0 nem0Var = (nem0) obj;
        return epx.f(this.a, nem0Var.a) && this.b == nem0Var.b && this.c == nem0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryStatisticsElement(name=");
        sb.append(this.a);
        sb.append(", counter=");
        sb.append(this.b);
        sb.append(", isUnavailable=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
