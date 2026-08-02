package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import xsna.qr60;

/* compiled from: DiscoverMediaPagingReducer.kt */
/* loaded from: classes4.dex */
public final class c4n implements bm50<t4n, i4n> {
    public final pr60 a;

    public c4n(j4n j4nVar, s1v s1vVar, rr60 rr60Var) {
        this.a = new pr60(s1vVar, rr60Var);
    }

    @Override // xsna.bm50
    public final t4n a(t4n t4nVar, i4n i4nVar) {
        t4n t4nVar2 = t4nVar;
        i4n i4nVar2 = i4nVar;
        ur60 ur60Var = t4nVar2.b;
        qr60.a aVar = i4nVar2.a;
        if (rr60.a(ur60Var, aVar)) {
            return t4n.a(t4nVar2, this.a.a(ur60Var, aVar), null, false, 0, 14);
        }
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return t4nVar2;
        }
        L.u(l, L.LogType.d, new Object[]{"Skipping " + i4nVar2});
        return t4nVar2;
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(i4n i4nVar) {
        return true;
    }
}
