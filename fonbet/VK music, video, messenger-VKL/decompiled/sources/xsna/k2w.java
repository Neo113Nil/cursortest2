package xsna;

import android.content.res.Configuration;
import kotlin.NoWhenBranchMatchedException;
import xsna.c63;
import xsna.pdg0;

/* compiled from: ImEngineProvider.kt */
/* loaded from: classes11.dex */
public final class k2w extends c63.b {
    @Override // xsna.c63.b
    public final void B(Configuration configuration) {
        String str = i2w.e;
        pzv pzvVar = i2w.d;
        if (pzvVar == null) {
            pzvVar = null;
        }
        pzvVar.getClass();
        if (epx.f(str, ply.a())) {
            return;
        }
        a1w a1wVar = i2w.c;
        if (a1wVar == null) {
            a1wVar = null;
        }
        pdg0 n = a1wVar.n(i2w.a, new o9q());
        if (!(n instanceof pdg0.b)) {
            if (!(n instanceof pdg0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ((pdg0.a) n).a().getClass();
        } else {
            pzv pzvVar2 = i2w.d;
            (pzvVar2 != null ? pzvVar2 : null).getClass();
            i2w.e = ply.a();
        }
    }
}
