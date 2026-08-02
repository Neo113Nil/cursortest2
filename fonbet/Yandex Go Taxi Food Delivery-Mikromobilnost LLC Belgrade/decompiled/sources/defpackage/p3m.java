package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes4.dex */
public final class p3m extends t9 {
    public static final o3m Companion = new o3m();
    public static final i3y[] c;
    public final kr a;
    public final kr b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new acj(24)), a.b(lazyThreadSafetyMode, new acj(25))};
    }

    public /* synthetic */ p3m(int i, kr krVar, kr krVar2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, n3m.a.getDescriptor());
            throw null;
        }
        this.a = krVar;
        this.b = krVar2;
    }

    @Override // defpackage.szl
    public final void a(neo neoVar, l1o l1oVar) {
        kr krVar = neoVar instanceof k3m ? this.a : neoVar instanceof l3m ? this.b : null;
        if (krVar == null) {
            return;
        }
        l1oVar.b.a(new gxl(krVar));
    }

    @Override // defpackage.szl
    public final void dispose() {
    }
}
