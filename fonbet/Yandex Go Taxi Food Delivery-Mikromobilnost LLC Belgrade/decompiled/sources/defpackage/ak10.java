package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class ak10 implements bk10 {
    public final int a;
    public final zj10 b;

    public ak10(int i, zj10 zj10Var) {
        this.a = i;
        this.b = zj10Var;
    }

    @Override // defpackage.bk10
    public final int a() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak10)) {
            return false;
        }
        ak10 ak10Var = (ak10) obj;
        return this.a == ak10Var.a && this.b.equals(ak10Var.b);
    }

    @Override // defpackage.bk10
    public final Drawable f() {
        return null;
    }

    @Override // defpackage.bk10
    public final zj10 getBackground() {
        return this.b;
    }

    @Override // defpackage.bk10
    public final int getIcon() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(-1) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 961)) * 31);
    }

    public final String toString() {
        return "Hamburger(icon=" + this.a + ", image=null, background=" + this.b + ", foreground=-1)";
    }
}
