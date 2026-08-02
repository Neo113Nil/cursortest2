package defpackage;

import com.apollographql.apollo3.api.a;
import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class k351 implements b70 {
    public static final List a = Collections.singletonList("__typename");

    public static g351 c(xdx xdxVar, c cVar) {
        d351 d351Var;
        e351 e351Var;
        j70 j70Var = cVar.a;
        f351 f351Var = null;
        Integer num = null;
        String str = null;
        while (xdxVar.h2(a) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        if (str == null) {
            ny61.r("__typename was not found");
            return null;
        }
        if (a.a(a.b("FillWidth"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            List list = h351.a;
            String str2 = null;
            while (xdxVar.h2(h351.a) == 0) {
                foe foeVar2 = l80.a;
                str2 = xdxVar.nextString();
            }
            d351Var = new d351(str2);
        } else {
            d351Var = null;
        }
        if (a.a(a.b("FitWidth"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            List list2 = i351.a;
            String str3 = null;
            while (xdxVar.h2(i351.a) == 0) {
                foe foeVar3 = l80.a;
                str3 = xdxVar.nextString();
            }
            e351Var = new e351(str3);
        } else {
            e351Var = null;
        }
        if (a.a(a.b("FixWidth"), j70Var.b(), str, j70Var)) {
            xdxVar.rewind();
            List list3 = j351.a;
            while (xdxVar.h2(j351.a) == 0) {
                num = (Integer) l80.b.b(xdxVar, cVar);
            }
            f351Var = new f351(num.intValue());
        }
        return new g351(str, d351Var, e351Var, f351Var);
    }
}
