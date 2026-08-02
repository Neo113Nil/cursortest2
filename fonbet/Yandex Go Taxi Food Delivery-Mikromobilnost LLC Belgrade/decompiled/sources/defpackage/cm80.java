package defpackage;

/* loaded from: classes13.dex */
public final class cm80 extends dm80 {
    public final u370 c;
    public final String d;
    public final kbc0 e;
    public final boolean f;
    public final boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm80(svj svjVar, lg80 lg80Var, u370 u370Var, String str, kbc0 kbc0Var, boolean z, boolean z2, int i) {
        super(svjVar, lg80Var);
        u370Var = (i & 4) != 0 ? l76.I : u370Var;
        str = (i & 8) != 0 ? "" : str;
        kbc0Var = (i & 16) != 0 ? null : kbc0Var;
        z = (i & 32) != 0 ? true : z;
        z2 = (i & 64) != 0 ? true : z2;
        this.c = u370Var;
        this.d = str;
        this.e = kbc0Var;
        this.f = z;
        this.g = z2;
    }
}
