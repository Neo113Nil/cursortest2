package xsna;

/* compiled from: IntList.kt */
/* loaded from: classes11.dex */
public final class b9x {
    public static final ng50 a = new ng50(0);

    public static final ng50 a(int... iArr) {
        ng50 ng50Var = new ng50(iArr.length);
        int i = ng50Var.b;
        if (i < 0) {
            alk.D("");
            throw null;
        }
        if (iArr.length == 0) {
            return ng50Var;
        }
        ng50Var.d(iArr.length + i);
        int[] iArr2 = ng50Var.a;
        int i2 = ng50Var.b;
        if (i != i2) {
            jw5.e(iArr.length + i, i, i2, iArr2, iArr2);
        }
        jw5.i(i, 0, 12, iArr, iArr2);
        ng50Var.b += iArr.length;
        return ng50Var;
    }
}
