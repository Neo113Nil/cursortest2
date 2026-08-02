package defpackage;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class jk70 extends yr31 {
    public final ek70 b;
    public final ck70 c;
    public final ds0 w;
    public final fk70 x;

    public jk70(ek70 ek70Var, ck70 ck70Var, ds0 ds0Var) {
        this.b = ek70Var;
        this.c = ck70Var;
        this.w = ds0Var;
        kw7 kw7Var = ek70Var.a;
        String str = kw7Var.a;
        String str2 = kw7Var.b;
        ArrayList<wv7> arrayList = kw7Var.c;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (wv7 wv7Var : arrayList) {
            arrayList2.add(new ml70(wv7Var.a, wv7Var.b.booleanValue(), wv7Var.c, wv7Var.d));
        }
        this.x = new fk70(str, str2, arrayList2);
        ds0 ds0Var2 = this.w;
        String str3 = this.b.a.d;
        if (str3 != null) {
            ds0Var2.d(str3, "Shown");
        } else {
            ds0Var2.getClass();
        }
    }
}
