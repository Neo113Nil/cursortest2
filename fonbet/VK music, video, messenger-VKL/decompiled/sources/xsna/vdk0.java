package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.sdk0;
import xsna.xdk0;

/* compiled from: SocialGraphFriendsReducer.kt */
/* loaded from: classes5.dex */
public final class vdk0 extends dm50<ydk0, sdk0, xdk0> {
    @Override // xsna.dm50
    public final xdk0 c(xdk0 xdk0Var, sdk0 sdk0Var) {
        xdk0 xdk0Var2 = xdk0Var;
        sdk0 sdk0Var2 = sdk0Var;
        if (sdk0Var2 instanceof sdk0.a.C3662a) {
            return xdk0.a(xdk0Var2, null, 1);
        }
        if (sdk0Var2 instanceof sdk0.a.b) {
            return xdk0Var2;
        }
        if (sdk0Var2 instanceof sdk0.b.c) {
            return xdk0.a(xdk0Var2, xdk0.a.c.b, 2);
        }
        if (sdk0Var2 instanceof sdk0.b.C3663b) {
            return xdk0.a(xdk0Var2, new xdk0.a.AbstractC3997a.C3998a(((sdk0.b.C3663b) sdk0Var2).b), 2);
        }
        if (sdk0Var2 instanceof sdk0.b.a) {
            return xdk0.a(xdk0Var2, new xdk0.a.b(((sdk0.b.a) sdk0Var2).b), 2);
        }
        if (sdk0Var2 instanceof sdk0.b.d) {
            return xdk0.a(xdk0Var2, new xdk0.a.AbstractC3997a.b(((sdk0.b.d) sdk0Var2).b), 2);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final ydk0 d() {
        return new ydk0(e(new tdk0(0)));
    }

    @Override // xsna.dm50
    public final void h(xdk0 xdk0Var, ydk0 ydk0Var) {
        f(ydk0Var.a, xdk0Var);
    }
}
