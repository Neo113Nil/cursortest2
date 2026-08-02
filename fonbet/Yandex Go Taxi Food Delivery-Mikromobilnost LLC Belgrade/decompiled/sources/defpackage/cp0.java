package defpackage;

import kotlin.collections.EmptyList;
import ru.yandex.taxi.address.clarification.impl.ui.recycler.a;
import ru.yandex.taxi.address.clarification.impl.ui.recycler.b;
import ru.yandex.taxi.widget.c;

/* loaded from: classes5.dex */
public final class cp0 extends bys {
    public final dp0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cp0(pav pavVar, k7x0 k7x0Var, c cVar, tls tlsVar) {
        super(scc.g(r15, new zxs(r15.a(), 0, null, r11, null, new e3o0(16, cVar))));
        int i = a.a0;
        g0c a = qoi0.a(gfq0.class);
        zhb0 zhb0Var = new zhb0(pavVar, k7x0Var, cVar, tlsVar, 12);
        Class a2 = a.a();
        EmptyList emptyList = EmptyList.a;
        zxs zxsVar = new zxs(a2, 0, null, emptyList, null, zhb0Var);
        int i2 = b.T;
        g0c a3 = qoi0.a(lrq0.class);
        this.z = new dp0();
    }

    @Override // defpackage.bys
    public final boolean j(Object obj, Object obj2) {
        this.z.getClass();
        return dp0.d((ap0) obj, (ap0) obj2);
    }

    @Override // defpackage.bys
    public final boolean k(Object obj, Object obj2) {
        this.z.getClass();
        return ((ap0) obj).getClass() == ((ap0) obj2).getClass();
    }
}
