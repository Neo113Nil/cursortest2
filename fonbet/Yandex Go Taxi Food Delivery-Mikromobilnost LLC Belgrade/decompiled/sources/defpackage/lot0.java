package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes13.dex */
public final class lot0 {
    public final i3y a;

    public lot0(dne0 dne0Var) {
        this.a = a.b(LazyThreadSafetyMode.NONE, new ef(dne0Var, 1));
    }

    public final cne0 a() {
        return (cne0) this.a.getValue();
    }

    public final String b(String str) {
        return a().l(str, null);
    }
}
