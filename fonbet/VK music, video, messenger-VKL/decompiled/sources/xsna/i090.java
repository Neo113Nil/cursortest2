package xsna;

import android.content.Context;
import xsna.b5x;
import xsna.mco0;

/* compiled from: otherwise.kt */
/* loaded from: classes18.dex */
public final class i090 extends fl10 {
    @Override // xsna.fl10
    public final tao0 e(b5x.c cVar, Context context) {
        jco0 a;
        if (cVar == null || (a = dmf0.a(cVar)) == null) {
            return null;
        }
        Integer num = a.a;
        if (num != null && num.intValue() > 0) {
            return new mco0.a(a);
        }
        Integer num2 = a.b;
        return (num2 == null || num2.intValue() <= 0) ? k090.a : new mco0.c(a);
    }
}
