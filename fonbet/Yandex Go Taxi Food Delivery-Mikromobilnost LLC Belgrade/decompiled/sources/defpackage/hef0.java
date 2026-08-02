package defpackage;

import java.util.HashMap;

/* loaded from: classes8.dex */
public final class hef0 {
    public final zef0 a;

    public hef0(zef0 zef0Var) {
        this.a = zef0Var;
    }

    public final void a(String str, String str2, String str3) {
        zef0 zef0Var = this.a;
        zef0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("entry_point", str);
        if (str2 != null) {
            hashMap.put("service_name", str2);
        }
        if (str3 != null) {
            hashMap.put("extra_layout", str3);
        }
        zef0Var.a.a("ProfileMenu.EntryPointButton.Tapped", hashMap, 1, new HashMap());
    }
}
