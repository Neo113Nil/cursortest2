package xsna;

/* compiled from: PostingCtaAttachChoiceBottomSheetDelegate.kt */
/* loaded from: classes4.dex */
public final class rsx {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public rsx(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsx)) {
            return false;
        }
        rsx rsxVar = (rsx) obj;
        return this.a == rsxVar.a && this.b == rsxVar.b && this.c == rsxVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InvolvementAttachesState(isMarketLinkEnabled=");
        sb.append(this.a);
        sb.append(", isMarketMessagesEnabled=");
        sb.append(this.b);
        sb.append(", isBookingEnabled=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
