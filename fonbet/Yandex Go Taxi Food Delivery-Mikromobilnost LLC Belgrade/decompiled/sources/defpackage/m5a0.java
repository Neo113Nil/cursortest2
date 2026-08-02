package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class m5a0 implements b70 {
    public static final m5a0 a = new m5a0();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        v3a0 v3a0Var = (v3a0) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(v3a0Var.a);
        List list = tw90.a;
        rw90 rw90Var = v3a0Var.b;
        bfxVar.A1("badgeText");
        sw90 sw90Var = sw90.a;
        foe foeVar2 = l80.a;
        ep60 ep60Var = new ep60(sw90Var, true);
        pw90 pw90Var = rw90Var.a;
        if (pw90Var == null) {
            bfxVar.k2();
        } else {
            ep60Var.a(bfxVar, cVar, pw90Var);
        }
        bfxVar.A1("subtitleText");
        ep60 ep60Var2 = new ep60(uw90.a, true);
        qw90 qw90Var = rw90Var.b;
        if (qw90Var == null) {
            bfxVar.k2();
        } else {
            ep60Var2.a(bfxVar, cVar, qw90Var);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new v3a0(str, tw90.c(xdxVar, cVar));
    }
}
