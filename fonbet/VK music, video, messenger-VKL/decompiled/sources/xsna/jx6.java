package xsna;

import android.content.Context;
import xsna.b5x;
import xsna.mco0;

/* compiled from: belongsTo.kt */
/* loaded from: classes18.dex */
public final class jx6 extends fl10 {
    public final s94 b;

    public jx6(s94 s94Var, kco0 kco0Var) {
        this.b = s94Var;
    }

    @Override // xsna.fl10
    public final tao0 e(b5x.c cVar, Context context) {
        jco0 a;
        Integer num;
        if (cVar == null || (a = dmf0.a(cVar)) == null || (num = a.a) == null || num.intValue() <= 0 || !this.b.a.contains(num)) {
            return null;
        }
        return new mco0.a(a);
    }
}
