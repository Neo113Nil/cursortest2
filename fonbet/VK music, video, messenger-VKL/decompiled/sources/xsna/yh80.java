package xsna;

/* compiled from: CheckoutOnboardingContentAdapter.kt */
/* loaded from: classes6.dex */
public final class yh80 implements hfz {
    public final String b;
    public final int c;

    public yh80(String str, int i) {
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh80)) {
            return false;
        }
        yh80 yh80Var = (yh80) obj;
        return epx.f(this.b, yh80Var.b) && this.c == yh80Var.c;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingSubtitleItem(text=");
        sb.append(this.b);
        sb.append(", icon=");
        return vu5.b(sb, this.c, ')');
    }
}
