package defpackage;

import com.yandex.go.agreement.api.AcceptanceChangeSource;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class of {
    public final cne0 a;
    public final r0 b = bvf0.c(EmptyList.a);
    public final r0 c = bvf0.c(Boolean.FALSE);
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public of(dne0 dne0Var) {
        this.a = dne0Var.a("ru.yandex.taxi.gdpr.PREFS");
    }

    public final List a() {
        return (List) this.b.getValue();
    }

    public final void b(List list, AcceptanceChangeSource acceptanceChangeSource) {
        r0 r0Var = this.b;
        r0Var.getClass();
        r0Var.m(null, list);
        if (acceptanceChangeSource == AcceptanceChangeSource.LAUNCH) {
            Boolean bool = Boolean.TRUE;
            r0 r0Var2 = this.c;
            r0Var2.getClass();
            r0Var2.m(null, bool);
        }
    }
}
