package defpackage;

import com.adjust.sdk.Constants;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public final class fjz {
    public final qnr0 a;
    public final wnt b;
    public final kf00 c;
    public final c6i d;
    public final onr0 e;
    public final yxe0 f;
    public final pnr0 g;

    public fjz(qnr0 qnr0Var, wnt wntVar, kf00 kf00Var, c6i c6iVar, onr0 onr0Var, yxe0 yxe0Var, pnr0 pnr0Var) {
        this.a = qnr0Var;
        this.b = wntVar;
        this.c = kf00Var;
        this.d = c6iVar;
        this.e = onr0Var;
        this.f = yxe0Var;
        this.g = pnr0Var;
    }

    public static String b(ihz ihzVar) {
        if (ihzVar == null) {
            return null;
        }
        return b.i(new Pair("order_key", ihzVar.b()), new Pair("order_status", ihzVar.c()), new Pair(Constants.REFERRER_API_META, ihzVar.a()), new Pair("button_list", ihzVar.d())).toString();
    }

    public final void a(ihz ihzVar, String str) {
        onr0.a(this.e, b(ihzVar), null, str, null, null, 246);
    }
}
