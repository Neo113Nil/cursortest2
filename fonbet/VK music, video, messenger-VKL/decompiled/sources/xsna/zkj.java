package xsna;

import com.vk.voip.ui.call_by_phone.ui.ActionButtonState;
import xsna.tlo0;

/* compiled from: VoipCallByPhoneViewState.kt */
/* loaded from: classes7.dex */
public final class zkj {
    public final boolean a;
    public final ActionButtonState b;
    public final boolean c;
    public final tlo0 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public zkj(boolean z, ActionButtonState actionButtonState, tlo0.f fVar, boolean z2, boolean z3, boolean z4, int i) {
        boolean z5 = (i & 4) == 0;
        fVar = (i & 8) != 0 ? null : fVar;
        z2 = (i & 16) != 0 ? false : z2;
        z3 = (i & 32) != 0 ? false : z3;
        z4 = (i & 64) != 0 ? false : z4;
        this.a = z;
        this.b = actionButtonState;
        this.c = z5;
        this.d = fVar;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkj)) {
            return false;
        }
        zkj zkjVar = (zkj) obj;
        return this.a == zkjVar.a && this.b == zkjVar.b && this.c == zkjVar.c && epx.f(this.d, zkjVar.d) && this.e == zkjVar.e && this.f == zkjVar.f && this.g == zkjVar.g;
    }

    public final int hashCode() {
        int b = qoy.b((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c);
        tlo0 tlo0Var = this.d;
        return Boolean.hashCode(this.g) + qoy.b(qoy.b((b + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentState(actionButtonEnabled=");
        sb.append(this.a);
        sb.append(", actionButtonState=");
        sb.append(this.b);
        sb.append(", isInputRecolored=");
        sb.append(this.c);
        sb.append(", label=");
        sb.append(this.d);
        sb.append(", clearInput=");
        sb.append(this.e);
        sb.append(", showKeyboard=");
        sb.append(this.f);
        sb.append(", alternativeButtonVisible=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
