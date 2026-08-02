package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class lde {
    public final eu90 a;

    public lde(eu90 eu90Var) {
        this.a = eu90Var;
    }

    public final void a(String str) {
        eu90 eu90Var = this.a;
        eu90Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("fail_reason", str);
        linkedHashMap.put("_meta", eu90.c(new HashMap()));
        eu90Var.f("CollectingContacts.SendMail.Failed", linkedHashMap);
    }

    public final void b(String str, String str2, String str3) {
        eu90 eu90Var = this.a;
        LinkedHashMap t = xvz.t(eu90Var, "purchase_session_id", str, "url", str2);
        t.put("skipButtonText", str3);
        t.put("_meta", eu90.c(new HashMap()));
        eu90Var.f("CollectingContacts.SendMail.Success", t);
    }
}
