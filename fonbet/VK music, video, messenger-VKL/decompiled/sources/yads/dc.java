package yads;

/* loaded from: classes10.dex */
public final class dc implements op0 {
    public dc(int i) {
        this((Object) null);
    }

    public final pp0[] a(np0[] np0VarArr, im imVar) {
        pp0 ecVar;
        tn2 a = ec.a(np0VarArr);
        pp0[] pp0VarArr = new pp0[np0VarArr.length];
        for (int i = 0; i < np0VarArr.length; i++) {
            np0 np0Var = np0VarArr[i];
            if (np0Var != null) {
                int[] iArr = np0Var.b;
                if (iArr.length != 0) {
                    if (iArr.length == 1) {
                        ecVar = new rv0(iArr[0], np0Var.c, np0Var.a);
                    } else {
                        long j = 25000;
                        ecVar = new ec(np0Var.a, iArr, np0Var.c, imVar, 10000, j, j, 1279, 719, 0.7f, 0.75f, (s51) a.get(i), xv.a);
                    }
                    pp0VarArr[i] = ecVar;
                }
            }
        }
        return pp0VarArr;
    }

    public dc(Object obj) {
    }
}
