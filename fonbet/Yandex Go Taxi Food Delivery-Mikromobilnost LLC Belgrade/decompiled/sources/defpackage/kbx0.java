package defpackage;

/* loaded from: classes6.dex */
public final class kbx0 implements nbx0 {
    public final boolean a;
    public final bhh b;
    public final amh c;

    public kbx0(boolean z, bhh bhhVar, amh amhVar) {
        this.a = z;
        this.b = bhhVar;
        this.c = amhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kbx0) {
            kbx0 kbx0Var = (kbx0) obj;
            return this.a == kbx0Var.a && this.b == kbx0Var.b && this.c == kbx0Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MultiTapSwitch(switched=" + this.a + ", checkedChangeAction=" + this.b + ", badgeBodyClickAction=" + this.c + ", isEnabled=true)";
    }
}
