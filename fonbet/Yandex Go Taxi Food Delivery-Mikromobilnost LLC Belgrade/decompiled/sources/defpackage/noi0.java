package defpackage;

import java.util.HashMap;
import ru.yandex.taxi.analytics.referrer.analytics.ReferrerSource;

/* loaded from: classes9.dex */
public final class noi0 {
    public final zf a;
    public final t61 b;

    public noi0(zf zfVar, t61 t61Var) {
        this.a = zfVar;
        this.b = t61Var;
    }

    public final void a(String str, ReferrerSource referrerSource) {
        if (str == null || evu0.J(str)) {
            return;
        }
        String source = referrerSource.getSource();
        zf zfVar = this.a;
        zfVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("referrer", str);
        hashMap.put("source", source);
        zfVar.a.a("InstallReferrer.Received", hashMap, 1, new HashMap());
    }
}
