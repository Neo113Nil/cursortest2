package defpackage;

/* loaded from: classes.dex */
public abstract class hc90 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        tty0[] tty0VarArr = sty0.b;
        a = sty0.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0033, code lost:
    
        if (defpackage.sty0.a(r3, r17.c) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final gc90 a(gc90 gc90Var, int i, int i2, long j, apy0 apy0Var, tvc0 tvc0Var, ehy ehyVar, int i3, int i4, try0 try0Var) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        apy0 apy0Var2 = apy0Var;
        tvc0 tvc0Var2 = tvc0Var;
        ehy ehyVar2 = ehyVar;
        int i7 = i3;
        int i8 = i4;
        try0 try0Var2 = try0Var;
        if (i5 == 0 || i5 == gc90Var.a) {
            tty0[] tty0VarArr = sty0.b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
            }
            if ((apy0Var2 == null || apy0Var2.equals(gc90Var.d)) && ((i6 == 0 || i6 == gc90Var.b) && ((tvc0Var2 == null || tvc0Var2.equals(gc90Var.e)) && ((ehyVar2 == null || ehyVar2.equals(gc90Var.f)) && ((i7 == 0 || i7 == gc90Var.g) && ((i8 == 0 || i8 == gc90Var.h) && (try0Var2 == null || try0Var2.equals(gc90Var.i)))))))) {
                return gc90Var;
            }
        } else {
            j2 = 0;
        }
        tty0[] tty0VarArr2 = sty0.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = gc90Var.c;
        }
        if (apy0Var2 == null) {
            apy0Var2 = gc90Var.d;
        }
        if (i5 == 0) {
            i5 = gc90Var.a;
        }
        if (i6 == 0) {
            i6 = gc90Var.b;
        }
        tvc0 tvc0Var3 = gc90Var.e;
        if (tvc0Var3 != null && tvc0Var2 == null) {
            tvc0Var2 = tvc0Var3;
        }
        if (ehyVar2 == null) {
            ehyVar2 = gc90Var.f;
        }
        if (i7 == 0) {
            i7 = gc90Var.g;
        }
        if (i8 == 0) {
            i8 = gc90Var.h;
        }
        if (try0Var2 == null) {
            try0Var2 = gc90Var.i;
        }
        return new gc90(i5, i6, j3, apy0Var2, tvc0Var2, ehyVar2, i7, i8, try0Var2);
    }
}
