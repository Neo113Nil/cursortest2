package xsna;

import com.vk.clips.design.view.sidecontrols.renderer.model.Mode;

/* compiled from: AnimatedButtonState.kt */
/* loaded from: classes16.dex */
public final class ch2 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Mode d;
    public final afj e;
    public final ily f;
    public final ok2 g;

    public ch2() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch2)) {
            return false;
        }
        ch2 ch2Var = (ch2) obj;
        return this.a == ch2Var.a && this.b == ch2Var.b && this.c == ch2Var.c && this.d == ch2Var.d && epx.f(this.e, ch2Var.e) && epx.f(this.f, ch2Var.f) && epx.f(this.g, ch2Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AnimatedButtonState(isVisible=" + this.a + ", isEnabled=" + this.b + ", isChecked=" + this.c + ", mode=" + this.d + ", container=" + this.e + ", label=" + this.f + ", icon=" + this.g + ')';
    }

    public ch2(boolean z, boolean z2, boolean z3, Mode mode, afj afjVar, ily ilyVar, ok2 ok2Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = mode;
        this.e = afjVar;
        this.f = ilyVar;
        this.g = ok2Var;
    }

    public /* synthetic */ ch2(int i) {
        this(true, true, false, Mode.BUTTON, new afj((String) null, 3), new ily(7), new ok2(0));
    }
}
