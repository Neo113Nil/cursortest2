package xsna;

/* compiled from: ModerationItem.kt */
/* loaded from: classes18.dex */
public final class c530 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Integer d;
    public final d530 e;

    public c530(boolean z, boolean z2, boolean z3, Integer num, d530 d530Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = num;
        this.e = d530Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModerationItem(isAdult=");
        sb.append(this.a);
        sb.append(", isOwner=");
        sb.append(this.b);
        sb.append(", isHardBlocked=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
