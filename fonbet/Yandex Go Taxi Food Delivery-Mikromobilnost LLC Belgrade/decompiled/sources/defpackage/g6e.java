package defpackage;

import androidx.compose.ui.graphics.colorspace.a;

/* loaded from: classes.dex */
public abstract class g6e {
    public static final wx40 a;

    static {
        a aVar = wgc.e;
        int i = aVar.c;
        d6e d6eVar = new d6e(aVar, aVar, 1);
        int i2 = aVar.c;
        qw60 qw60Var = wgc.x;
        int i3 = (qw60Var.c << 6) | i2;
        f6e f6eVar = new f6e(aVar, qw60Var, 0);
        int i4 = (i2 << 6) | qw60Var.c;
        f6e f6eVar2 = new f6e(qw60Var, aVar, 0);
        wx40 wx40Var = y5w.a;
        wx40 wx40Var2 = new wx40((Object) null);
        wx40Var2.i(i | (i << 6), d6eVar);
        wx40Var2.i(i3, f6eVar);
        wx40Var2.i(i4, f6eVar2);
        a = wx40Var2;
    }
}
