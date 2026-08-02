package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import ru.CryptoPro.reprov.x509.PolicyConstraintsExtension;

/* loaded from: classes11.dex */
public final class bvb1 extends s591 {
    public final cga1 c;
    public final HashMap w;

    public bvb1(cga1 cga1Var) {
        super(PolicyConstraintsExtension.REQUIRE);
        this.w = new HashMap();
        this.c = cga1Var;
    }

    @Override // defpackage.s591
    public final r691 c(cr71 cr71Var, List list) {
        r691 r691Var;
        cwa1.e(1, PolicyConstraintsExtension.REQUIRE, list);
        String zzc = ((p791) cr71Var.c).b(cr71Var, (r691) list.get(0)).zzc();
        HashMap hashMap = this.w;
        if (hashMap.containsKey(zzc)) {
            return (r691) hashMap.get(zzc);
        }
        HashMap hashMap2 = this.c.a;
        if (hashMap2.containsKey(zzc)) {
            try {
                r691Var = (r691) ((Callable) hashMap2.get(zzc)).call();
            } catch (Exception unused) {
                ny61.r("Failed to create API implementation: ".concat(String.valueOf(zzc)));
                return null;
            }
        } else {
            r691Var = r691.z5;
        }
        if (r691Var instanceof s591) {
            hashMap.put(zzc, (s591) r691Var);
        }
        return r691Var;
    }
}
