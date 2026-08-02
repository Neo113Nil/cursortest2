package xsna;

/* compiled from: ConfirmationItems.kt */
/* loaded from: classes6.dex */
public final class yl7 implements hfz {
    public final String b;
    public final String c;

    public yl7() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl7)) {
            return false;
        }
        yl7 yl7Var = (yl7) obj;
        return epx.f(this.b, yl7Var.b) && epx.f(this.c, yl7Var.c);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusesAlertCardItem(alertTitle=");
        sb.append(this.b);
        sb.append(", alertSubtitle=");
        return ho8.a(sb, this.c, ')');
    }

    public yl7(String str, String str2) {
        this.b = str;
        this.c = str2;
    }
}
