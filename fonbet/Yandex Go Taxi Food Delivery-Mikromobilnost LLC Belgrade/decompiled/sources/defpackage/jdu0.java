package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes15.dex */
public final class jdu0 {
    public final to3 a;
    public final pcu0 b;
    public vbu0 c;

    public jdu0(to3 to3Var, wff0 wff0Var, pcu0 pcu0Var) {
        this.a = to3Var;
        this.b = pcu0Var;
        wff0Var.a(new fn3(15, this));
    }

    public final void a(String[] strArr) {
        vbu0 vbu0Var = this.c;
        if (vbu0Var != null) {
            vbu0Var.b = null;
            xo3 xo3Var = vbu0Var.a;
            if (xo3Var != null) {
                xo3Var.cancel();
                vbu0Var.a = null;
            }
            this.c = null;
        }
        pcu0 pcu0Var = this.b;
        String[] d = pcu0Var.b.b().d();
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.removeAll(Arrays.asList(d));
        if (arrayList.isEmpty() && Arrays.equals(strArr, pcu0Var.b.b().h())) {
            return;
        }
        if (arrayList.isEmpty()) {
            pcu0Var.a(strArr);
            return;
        }
        String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
        vbu0 vbu0Var2 = new vbu0();
        this.c = vbu0Var2;
        vbu0Var2.b = new r3k0(12, this, strArr);
        vbu0Var2.a = this.a.b(new ykn0(19, vbu0Var2), strArr2);
    }
}
