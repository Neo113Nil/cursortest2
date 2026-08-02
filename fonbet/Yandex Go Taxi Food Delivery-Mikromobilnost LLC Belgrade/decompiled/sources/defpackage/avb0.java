package defpackage;

/* loaded from: classes15.dex */
public final class avb0 {
    public final to3 a;
    public final k020 b;
    public final x22 c;
    public yub0 d;

    public avb0(to3 to3Var, k020 k020Var, x22 x22Var) {
        this.a = to3Var;
        this.b = k020Var;
        this.c = x22Var;
    }

    public final yub0 a(String[] strArr, zub0 zub0Var) {
        long j = this.b.j("pinned_chats");
        yub0 yub0Var = this.d;
        if (yub0Var != null) {
            yub0Var.cancel();
        }
        yub0 yub0Var2 = new yub0(this, j, strArr, zub0Var);
        this.d = yub0Var2;
        return yub0Var2;
    }
}
