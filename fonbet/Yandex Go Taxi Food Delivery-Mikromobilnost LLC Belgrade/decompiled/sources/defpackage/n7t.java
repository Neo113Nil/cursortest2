package defpackage;

import com.yandex.messaging.domain.k;
import kotlin.coroutines.Continuation;

/* loaded from: classes15.dex */
public final class n7t extends k {
    public final k020 b;

    public n7t(k020 k020Var, kse kseVar) {
        super(kseVar.e);
        this.b = k020Var;
    }

    @Override // com.yandex.messaging.domain.k
    public final Object b(Object obj, Continuation continuation) {
        m7t m7tVar = (m7t) obj;
        String str = m7tVar.a;
        ywr t = this.b.t(m7tVar.b, str);
        if (t == null) {
            return null;
        }
        hwr hwrVar = t.a;
        return new jjf(hwrVar.a, hwrVar.c, hwrVar.b, hwrVar.d, hwrVar.f, hwrVar.g, t.b(), t.a());
    }
}
