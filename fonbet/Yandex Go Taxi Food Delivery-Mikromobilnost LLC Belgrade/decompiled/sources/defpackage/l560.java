package defpackage;

import com.yandex.payment.sdk.core.data.CardId;

/* loaded from: classes2.dex */
public final class l560 extends yr31 {
    public final vv90 b;
    public final qu5 c;
    public final dy40 w;
    public final dy40 x;
    public final dy40 y;
    public final boolean z;

    public l560(vv90 vv90Var, px90 px90Var, qu5 qu5Var, cg8 cg8Var, v1m0 v1m0Var) {
        this.b = vv90Var;
        this.c = qu5Var;
        dy40 dy40Var = new dy40();
        this.w = dy40Var;
        dy40 dy40Var2 = new dy40();
        this.x = dy40Var2;
        this.y = new dy40();
        String str = (String) v1m0Var.b.a("ARG_VERIFY_CARD_ID");
        int i = 4;
        if (str == null || evu0.J(str)) {
            this.z = false;
            qu5Var.h = new fl10(this);
            qu5Var.a(cg8Var, new pm5(1, qu5Var), new sr4(8, qu5Var), new hh5(4, qu5Var));
            px90.h(px90Var, qu5Var.b);
            return;
        }
        this.z = true;
        px90.h(px90Var, new pg8(i, this));
        dy40Var.l(kn8.a);
        dy40Var2.l(e98.a);
        ((yv90) vv90Var).j.f(new CardId(str), new xl10(this));
    }
}
