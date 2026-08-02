package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes9.dex */
public final class pzp0 {
    public static final ozp0 Companion = new ozp0();
    public static final i3y[] c;
    public final tg2 a;
    public final tg2 b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new wpp0(27)), a.b(lazyThreadSafetyMode, new wpp0(28))};
    }

    public /* synthetic */ pzp0(int i, tg2 tg2Var, tg2 tg2Var2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, nzp0.a.getDescriptor());
            throw null;
        }
        this.a = tg2Var;
        this.b = tg2Var2;
    }

    public pzp0(tg2 tg2Var, tg2 tg2Var2) {
        this.a = tg2Var;
        this.b = tg2Var2;
    }
}
