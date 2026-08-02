package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.Collections;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes3.dex */
public final class lg01 implements ev31 {
    public final yf01 a;

    public lg01(yf01 yf01Var) {
        this.a = yf01Var;
    }

    @Override // defpackage.ev31
    public final Object q(Object obj) {
        uf01 uf01Var = (uf01) obj;
        List list = uf01Var.d;
        Throwable th = uf01Var.f;
        if (th != null) {
            return new hg01(r501.a(th, null, null, null, null, null, null, null, null, null, null, null, null, 65534));
        }
        if (list == null) {
            return ig01.a;
        }
        int i = kg01.a[uf01Var.e.ordinal()];
        if (i != 1) {
            yf01 yf01Var = this.a;
            if (i == 2) {
                ListBuilder a = rcc.a();
                a.addAll(list);
                yf01Var.getClass();
                a.addAll(Collections.singletonList(new ke01()));
                list = a.j();
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                ListBuilder a2 = rcc.a();
                a2.addAll(list);
                a2.addAll(yf01Var.a);
                list = a2.j();
            }
        }
        Text.Constant i2 = g8e.i(Text.Companion, uf01Var.a);
        String str = uf01Var.b;
        Text.Constant constant = str != null ? new Text.Constant(str) : null;
        String str2 = uf01Var.c;
        return new gg01(list, new stz0(i2, constant, null, null, null, qtz0.a, false, null, null, str2 != null ? new Text.Constant(str2) : null, null, null, 31708));
    }
}
