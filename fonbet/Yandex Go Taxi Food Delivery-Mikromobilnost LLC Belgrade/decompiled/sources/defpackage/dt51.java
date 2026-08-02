package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.widget.buttons.ButtonTrailView;

/* loaded from: classes8.dex */
public final class dt51 extends ft51 {
    public final zs51 a;
    public final ButtonTrailView.ButtonStyle b;

    public dt51(zs51 zs51Var) {
        ButtonTrailView.ButtonStyle buttonStyle = ButtonTrailView.ButtonStyle.CONTROL;
        this.a = zs51Var;
        this.b = buttonStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt51)) {
            return false;
        }
        dt51 dt51Var = (dt51) obj;
        return jl40.l(this.a, dt51Var.a) && this.b == dt51Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OneButtonOnly(action=" + this.a + ", buttonStyle=" + this.b + Extension.C_BRAKE;
    }
}
