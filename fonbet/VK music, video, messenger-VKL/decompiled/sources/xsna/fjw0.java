package xsna;

import com.vk.voip.ui.VoipViewModelState;

/* compiled from: VoipCallStateChangedEvent.kt */
/* loaded from: classes7.dex */
public final class fjw0 {
    public final VoipViewModelState a;
    public final VoipViewModelState b;
    public final boolean c;
    public final boolean d;

    public fjw0(VoipViewModelState voipViewModelState, VoipViewModelState voipViewModelState2, boolean z, boolean z2) {
        this.a = voipViewModelState;
        this.b = voipViewModelState2;
        this.c = z;
        this.d = z2;
    }

    public final VoipViewModelState a() {
        return this.a;
    }

    public final VoipViewModelState b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjw0)) {
            return false;
        }
        fjw0 fjw0Var = (fjw0) obj;
        return this.a == fjw0Var.a && this.b == fjw0Var.b && this.c == fjw0Var.c && this.d == fjw0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipCallStateChangedEvent(newState=");
        sb.append(this.a);
        sb.append(", oldState=");
        sb.append(this.b);
        sb.append(", isClosedByBusy=");
        sb.append(this.c);
        sb.append(", isClosedByTimeout=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
