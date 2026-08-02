package xsna;

import android.util.Patterns;
import kotlin.NoWhenBranchMatchedException;
import xsna.gke;

/* compiled from: ClipsLinksEditReducer.kt */
/* loaded from: classes16.dex */
public final class hke extends dm50<jke, gke, ike> {
    public static boolean i(String str, String str2) {
        return Patterns.WEB_URL.matcher(str).matches() && str2.length() <= 40 && !defpackage.b.b(str);
    }

    @Override // xsna.dm50
    public final ike c(ike ikeVar, gke gkeVar) {
        ike ikeVar2 = ikeVar;
        gke gkeVar2 = gkeVar;
        if (gkeVar2 instanceof gke.a) {
            String str = ((gke.a) gkeVar2).b;
            return ike.a(ikeVar2, str, null, i(str, ikeVar2.c), 10);
        }
        if (gkeVar2 instanceof gke.b) {
            gke.b bVar = (gke.b) gkeVar2;
            if (bVar.b.length() > 40) {
                return ikeVar2;
            }
            String str2 = bVar.b;
            return ike.a(ikeVar2, null, str2, i(ikeVar2.b, str2), 9);
        }
        if (!(gkeVar2 instanceof gke.c)) {
            throw new NoWhenBranchMatchedException();
        }
        gke.c cVar = (gke.c) gkeVar2;
        String str3 = cVar.b;
        String str4 = cVar.c;
        return new ike(str3, str4, i(str3, str4), cVar.d);
    }

    @Override // xsna.dm50
    public final jke d() {
        return new jke(e(new d40(12)), e(new tr0(6)));
    }

    @Override // xsna.dm50
    public final void h(ike ikeVar, jke jkeVar) {
        f(jkeVar.b, ikeVar);
    }
}
