package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class e511 extends kr {
    public static final c511 Companion = new c511();
    public static final i3y[] d;
    public final List a;
    public final kr b;
    public final kr c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{a.b(lazyThreadSafetyMode, new z411(0)), a.b(lazyThreadSafetyMode, new z411(2)), a.b(lazyThreadSafetyMode, new z411(4))};
    }

    public /* synthetic */ e511(int i, List list, kr krVar, kr krVar2) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, a511.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = krVar;
        this.c = krVar2;
    }
}
