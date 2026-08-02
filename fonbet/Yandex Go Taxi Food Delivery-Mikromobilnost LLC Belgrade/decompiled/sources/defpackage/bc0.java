package defpackage;

import com.yandex.messaging.internal.backendconfig.a;
import com.yandex.messaging.internal.storage.folders.d;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class bc0 extends wx4 {
    public final long b;
    public final String c;
    public final String d;
    public final d e;
    public final k020 f;
    public final a g;

    public bc0(long j, String str, String str2, d dVar, k020 k020Var, a aVar, el21 el21Var) {
        super(el21Var);
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = dVar;
        this.f = k020Var;
        this.g = aVar;
    }

    @Override // defpackage.gr
    public final boolean a(gr grVar) {
        if (!(grVar instanceof bc0)) {
            return false;
        }
        bc0 bc0Var = (bc0) grVar;
        return bc0Var.b == this.b && jl40.l(bc0Var.c, this.c) && jl40.l(bc0Var.d, this.d);
    }

    @Override // defpackage.wx4
    public final Object b(cl21 cl21Var, Continuation continuation) {
        String str = this.c;
        ywr t = this.f.t(this.b, str);
        kwr kwrVar = kwr.a;
        if (t == null) {
            return new iyj0(kwrVar);
        }
        hwr hwrVar = t.a;
        Set set = hwrVar.f;
        Set set2 = hwrVar.f;
        String str2 = this.d;
        if (set.contains(str2)) {
            return new iyj0(kwrVar);
        }
        if (set2.size() >= this.g.a().getFolders().getMaxChatsPerFolder()) {
            return new iyj0(jwr.a);
        }
        int i = hwrVar.d;
        String str3 = hwrVar.b;
        LinkedHashSet i2 = v4r0.i(set2, str2);
        Set set3 = hwrVar.g;
        Set b = t.b();
        Set a = t.a();
        String str4 = this.c;
        long j = this.b;
        jjf jjfVar = new jjf(str4, j, str3, i, i2, set3, b, a);
        d dVar = this.e;
        dVar.getClass();
        return dVar.e(j, new fxr(jjfVar, 0), continuation);
    }
}
