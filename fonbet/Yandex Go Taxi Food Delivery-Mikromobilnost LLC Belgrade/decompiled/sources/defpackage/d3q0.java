package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes9.dex */
public final class d3q0 implements kq90 {
    public static final c3q0 Companion = new c3q0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new wrp0(12))};
    public final w2q0 a;

    public /* synthetic */ d3q0(int i, w2q0 w2q0Var) {
        if (1 == (i & 1)) {
            this.a = w2q0Var;
        } else {
            qje.Z(i, 1, b3q0.a.getDescriptor());
            throw null;
        }
    }

    public d3q0(w2q0 w2q0Var) {
        this.a = w2q0Var;
    }
}
