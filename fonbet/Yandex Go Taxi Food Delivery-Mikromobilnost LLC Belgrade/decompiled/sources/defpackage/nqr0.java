package defpackage;

import android.content.Context;
import java.io.File;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public final class nqr0 implements d1r {
    public final oyq a;

    public nqr0(oyq oyqVar) {
        this.a = oyqVar;
    }

    @Override // defpackage.d1r
    public final boolean a(Context context, au2 au2Var) {
        if (au2Var.c()) {
            return ((String) a.P(au2Var.a)).equals("shared_media");
        }
        return false;
    }

    @Override // defpackage.d1r
    public final File f(au2 au2Var) {
        lyq b;
        if (!au2Var.c()) {
            ny61.g("Failed requirement.");
            return null;
        }
        String str = (String) b64.c(2, au2Var.a);
        if (str != null && (b = this.a.b(str)) != null) {
            cyj cyjVar = b.a;
            String str2 = b.b;
            if (cyjVar.B != null) {
                qxj qxjVar = (qxj) cyjVar.C.get(str2);
                if (qxjVar != null && qxjVar.c) {
                    File a = qxjVar.a(0);
                    if (a.exists()) {
                        return a;
                    }
                }
                return null;
            }
            ny61.r("cache is closed");
        }
        return null;
    }
}
