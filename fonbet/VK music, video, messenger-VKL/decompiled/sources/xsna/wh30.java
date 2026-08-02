package xsna;

import com.vk.im.engine.models.typing.ComposingType;

/* compiled from: MsgComposingProfile.kt */
/* loaded from: classes2.dex */
public final class wh30 {
    public final qtd0 a;
    public final ComposingType b;

    public wh30(qtd0 qtd0Var, ComposingType composingType) {
        this.a = qtd0Var;
        this.b = composingType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh30)) {
            return false;
        }
        wh30 wh30Var = (wh30) obj;
        return epx.f(this.a, wh30Var.a) && this.b == wh30Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MsgComposingProfile(profile=" + this.a + ", type=" + this.b + ')';
    }
}
