package xsna;

import android.content.Context;
import android.content.res.Resources;
import java.util.HashMap;
import xsna.b5x;
import xsna.mco0;

/* compiled from: probablyBelongsTo.kt */
/* loaded from: classes18.dex */
public final class jgd0 extends fl10 {
    public final s94 b;

    public jgd0(s94 s94Var, kco0 kco0Var) {
        this.b = s94Var;
    }

    @Override // xsna.fl10
    public final tao0 e(b5x.c cVar, Context context) {
        jco0 a;
        Integer num;
        if (cVar == null || (a = dmf0.a(cVar)) == null || (num = a.c) == null) {
            return null;
        }
        Resources.Theme theme = context.getTheme();
        s94 s94Var = this.b;
        HashMap<Resources.Theme, HashMap<Integer, String>> hashMap = s94Var.b;
        if (hashMap.get(theme) == null) {
            s94Var.a(theme);
        }
        HashMap<Integer, String> hashMap2 = hashMap.get(theme);
        if (hashMap2 == null) {
            hashMap2 = s94Var.a(theme);
            hashMap.put(theme, hashMap2);
        }
        String str = hashMap2.get(num);
        if (str != null) {
            return new mco0.b(a, str);
        }
        return null;
    }
}
