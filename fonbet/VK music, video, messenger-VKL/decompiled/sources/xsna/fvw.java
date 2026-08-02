package xsna;

import com.vk.voip.dto.call_member.CallMemberId;

/* compiled from: InfoAboutActive.kt */
/* loaded from: classes7.dex */
public final class fvw {
    public final String a;
    public final String b;
    public final CallMemberId c;
    public final dfw0 d;
    public final qvw0 e;
    public final qvw0 f;
    public final boolean g;
    public final boolean h;

    public fvw(String str, String str2, CallMemberId callMemberId, dfw0 dfw0Var, qvw0 qvw0Var, qvw0 qvw0Var2, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = callMemberId;
        this.d = dfw0Var;
        this.e = qvw0Var;
        this.f = qvw0Var2;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvw)) {
            return false;
        }
        fvw fvwVar = (fvw) obj;
        return epx.f(this.a, fvwVar.a) && epx.f(this.b, fvwVar.b) && epx.f(this.c, fvwVar.c) && epx.f(this.d, fvwVar.d) && epx.f(this.e, fvwVar.e) && epx.f(this.f, fvwVar.f) && this.g == fvwVar.g && this.h == fvwVar.h;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31;
        dfw0 dfw0Var = this.d;
        int hashCode2 = (hashCode + (dfw0Var == null ? 0 : dfw0Var.hashCode())) * 31;
        qvw0 qvw0Var = this.e;
        int hashCode3 = (hashCode2 + (qvw0Var == null ? 0 : qvw0Var.hashCode())) * 31;
        qvw0 qvw0Var2 = this.f;
        return Boolean.hashCode(this.h) + qoy.b((hashCode3 + (qvw0Var2 != null ? qvw0Var2.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InfoAboutActive(broadcastId=");
        sb.append(this.a);
        sb.append(", broadcastOwnerId=");
        sb.append(this.b);
        sb.append(", broadcastInitiatorId=");
        sb.append(this.c);
        sb.append(", broadcastInfo=");
        sb.append(this.d);
        sb.append(", broadcastOwner=");
        sb.append(this.e);
        sb.append(", broadcastInitiator=");
        sb.append(this.f);
        sb.append(", canManage=");
        sb.append(this.g);
        sb.append(", canStop=");
        return defpackage.q0.a(sb, this.h, ')');
    }
}
