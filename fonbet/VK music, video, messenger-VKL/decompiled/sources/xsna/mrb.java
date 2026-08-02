package xsna;

import com.vk.channelrestrictions.RestrictionBadge;

/* compiled from: ChatHeaderInfoState.kt */
/* loaded from: classes16.dex */
public final class mrb {
    public final ks5 a;
    public final amw b;
    public final uzo0 c;
    public final c1n0 d;
    public final lrb e;
    public final RestrictionBadge f;
    public final int g;

    public mrb(ks5 ks5Var, amw amwVar, uzo0 uzo0Var, c1n0 c1n0Var, lrb lrbVar, RestrictionBadge restrictionBadge, int i) {
        this.a = ks5Var;
        this.b = amwVar;
        this.c = uzo0Var;
        this.d = c1n0Var;
        this.e = lrbVar;
        this.f = restrictionBadge;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mrb)) {
            return false;
        }
        mrb mrbVar = (mrb) obj;
        return epx.f(this.a, mrbVar.a) && epx.f(this.b, mrbVar.b) && this.c.equals(mrbVar.c) && epx.f(this.d, mrbVar.d) && this.e.equals(mrbVar.e) && this.f == mrbVar.f && this.g == mrbVar.g;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        c1n0 c1n0Var = this.d;
        int b = qoy.b(fw3.a((hashCode + (c1n0Var == null ? 0 : c1n0Var.hashCode())) * 31, 31, this.e.a), 31, false);
        RestrictionBadge restrictionBadge = this.f;
        return Integer.hashCode(this.g) + ((b + (restrictionBadge != null ? restrictionBadge.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatHeaderInfoState(avatarState=");
        sb.append(this.a);
        sb.append(", imageStatusState=");
        sb.append(this.b);
        sb.append(", titleState=");
        sb.append(this.c);
        sb.append(", subtitleState=");
        sb.append(this.d);
        sb.append(", headerInfoMenuState=");
        sb.append(this.e);
        sb.append(", showDonutButton=false, restrictionBadge=");
        sb.append(this.f);
        sb.append(", unreadCount=");
        return vu5.b(sb, this.g, ')');
    }
}
