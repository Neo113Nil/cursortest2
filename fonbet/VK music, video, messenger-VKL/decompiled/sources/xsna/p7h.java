package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.m7h;

/* compiled from: CommunityLeaveReducer.kt */
/* loaded from: classes5.dex */
public final class p7h extends dm50<t7h, m7h, r7h> {
    @Override // xsna.dm50
    public final r7h c(r7h r7hVar, m7h m7hVar) {
        r7h r7hVar2 = r7hVar;
        m7h m7hVar2 = m7hVar;
        if (m7hVar2 instanceof m7h.a) {
            return new r7h(((m7h.a) m7hVar2).b, r7hVar2.c);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final t7h d() {
        return new t7h(e(new vd1(9)), e(new kz0(13)));
    }

    @Override // xsna.dm50
    public final void h(r7h r7hVar, t7h t7hVar) {
        f(t7hVar.a, r7hVar);
    }
}
