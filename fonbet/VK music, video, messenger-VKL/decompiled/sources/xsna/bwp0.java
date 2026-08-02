package xsna;

/* compiled from: UGCChatSettingsEntity.kt */
/* loaded from: classes5.dex */
public final class bwp0 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public bwp0(long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwp0)) {
            return false;
        }
        bwp0 bwp0Var = (bwp0) obj;
        return this.a == bwp0Var.a && this.b == bwp0Var.b && this.c == bwp0Var.c && this.d == bwp0Var.d && this.e == bwp0Var.e && this.f == bwp0Var.f && this.g == bwp0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UGCChatSettingsEntity(chatId=");
        sb.append(this.a);
        sb.append(", isHiddenInKb=");
        sb.append(this.b);
        sb.append(", isHiddenEverywhere=");
        sb.append(this.c);
        sb.append(", needToShowOnboarding=");
        sb.append(this.d);
        sb.append(", isEditBanned=");
        sb.append(this.e);
        sb.append(", canEdit=");
        sb.append(this.f);
        sb.append(", canHide=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
