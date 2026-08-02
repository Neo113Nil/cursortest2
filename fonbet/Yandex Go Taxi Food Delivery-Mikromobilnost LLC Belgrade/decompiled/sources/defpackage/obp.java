package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class obp {
    public final q42 a;
    public final eu90 b;

    public obp(q42 q42Var, eu90 eu90Var) {
        this.a = q42Var;
        this.b = eu90Var;
    }

    public final void a(String str) {
        eu90 eu90Var = this.b;
        eu90Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("fail_reason", str);
        linkedHashMap.put("_meta", eu90.c(new HashMap()));
        eu90Var.f("FamilyInvite.Fail", linkedHashMap);
    }
}
