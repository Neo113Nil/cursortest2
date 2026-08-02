package defpackage;

/* loaded from: classes2.dex */
public class n0o extends of8 {
    @Override // defpackage.of8
    public final up8 b(nf8 nf8Var) {
        Integer l;
        ze8 ze8Var = (ze8) nf8Var;
        String str = ze8Var.b;
        if (str.length() == 2 && (l = bvu0.l(10, str)) != null && l.intValue() >= 12) {
            Integer l2 = bvu0.l(10, ze8Var.a);
            int intValue = l2 != null ? l2.intValue() : 0;
            if (intValue <= 12 && intValue >= 1) {
                return null;
            }
        }
        return up8.b;
    }
}
