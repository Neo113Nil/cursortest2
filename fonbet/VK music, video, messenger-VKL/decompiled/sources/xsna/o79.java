package xsna;

import xsna.ycw0;

/* compiled from: CallParticipantPermissionsActionsViewModel.kt */
/* loaded from: classes7.dex */
public final class o79 implements ycw0 {
    public final ycw0.p a;
    public final ycw0.o b;
    public final ycw0.w c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public o79(ycw0.p pVar, ycw0.o oVar, ycw0.w wVar, boolean z, boolean z2, boolean z3) {
        this.a = pVar;
        this.b = oVar;
        this.c = wVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o79)) {
            return false;
        }
        o79 o79Var = (o79) obj;
        return epx.f(this.a, o79Var.a) && epx.f(this.b, o79Var.b) && epx.f(this.c, o79Var.c) && this.d == o79Var.d && this.e == o79Var.e && this.f == o79Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(qoy.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallParticipantPermissionsActionsViewModel(mediaSettingVideo=");
        sb.append(this.a);
        sb.append(", mediaSettingMicrophone=");
        sb.append(this.b);
        sb.append(", watchTogether=");
        sb.append(this.c);
        sb.append(", isRecordEnabled=");
        sb.append(this.d);
        sb.append(", isScreenSharingEnabled=");
        sb.append(this.e);
        sb.append(", isShowChatHistoryEnabled=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
