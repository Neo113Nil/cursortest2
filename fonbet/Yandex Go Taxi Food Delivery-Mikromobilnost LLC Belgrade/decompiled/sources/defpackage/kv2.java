package defpackage;

import kotlinx.serialization.json.c;

/* loaded from: classes11.dex */
public final class kv2 implements e52 {
    public final g3y a;

    public kv2(d311 d311Var, g3y g3yVar) {
        this.a = g3yVar;
    }

    @Override // defpackage.e52
    public final void a(String str, c cVar) {
        ((tv2) this.a.get()).a(str, cVar);
        d311.a("FeedSDK.AppMetrica", "reportEvent event=" + str + ", payload=" + cVar);
    }
}
