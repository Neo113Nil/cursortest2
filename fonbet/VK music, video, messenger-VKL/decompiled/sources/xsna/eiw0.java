package xsna;

import com.vk.core.voip.VoipCallSource;

/* compiled from: VoipCallServiceNavigationEvent.kt */
/* loaded from: classes7.dex */
public final class eiw0 implements x49 {
    public final qtd0 a;
    public final VoipCallSource b;

    public eiw0(qtd0 qtd0Var, VoipCallSource voipCallSource) {
        this.a = qtd0Var;
        this.b = voipCallSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eiw0)) {
            return false;
        }
        eiw0 eiw0Var = (eiw0) obj;
        return epx.f(this.a, eiw0Var.a) && epx.f(this.b, eiw0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowCallAs(profile=" + this.a + ", source=" + this.b + ')';
    }
}
