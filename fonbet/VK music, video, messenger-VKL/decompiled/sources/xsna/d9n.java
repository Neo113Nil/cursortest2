package xsna;

import xsna.qr60;

/* compiled from: DiscoverSimilarFeedPagingReducer.kt */
/* loaded from: classes4.dex */
public final class d9n implements bm50<l8n, i8n> {
    public final pr60 a;

    public d9n(s1v s1vVar, rr60 rr60Var) {
        this.a = new pr60(s1vVar, rr60Var);
    }

    @Override // xsna.bm50
    public final l8n a(l8n l8nVar, i8n i8nVar) {
        l8n l8nVar2 = l8nVar;
        i8n i8nVar2 = i8nVar;
        String str = l8nVar2.f;
        String str2 = l8nVar2.b;
        ur60 ur60Var = l8nVar2.e;
        String str3 = i8nVar2.c;
        String str4 = i8nVar2.b;
        qr60.a aVar = i8nVar2.a;
        boolean z = aVar instanceof qr60.a.g;
        pr60 pr60Var = this.a;
        if (!z) {
            return l8n.a(l8nVar2, null, pr60Var.a(ur60Var, aVar), null, 503);
        }
        ur60 a = pr60Var.a(ur60Var, aVar);
        if (str2.length() == 0 && str4 != null && str4.length() != 0) {
            str2 = str4;
        }
        if (epx.f(str, "unknown") && str3 != null && str3.length() != 0) {
            str = str3;
        }
        sq60 sq60Var = a.b;
        String str5 = l8nVar2.i;
        return l8n.a(l8nVar2, str2, ur60.a(a, sq60.a(sq60Var, null, null, null, (str5 == null || str5.length() == 0) ? a.b.d : false, false, null, null, 247), null, null, null, false, false, 62), str, 358);
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(i8n i8nVar) {
        return true;
    }
}
