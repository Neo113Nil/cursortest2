package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ds60;
import xsna.lwq0;

/* compiled from: UserProfileWallMviTaskMapper.kt */
/* loaded from: classes4.dex */
public final class vwq0 implements au60<lwq0> {
    @Override // xsna.au60
    public final lwq0 a(ds60 ds60Var) {
        if (ds60Var instanceof ds60.f) {
            return new lwq0.c.C3307c((ds60.f) ds60Var);
        }
        if (ds60Var instanceof ds60.b) {
            return new mwq0((ds60.b) ds60Var);
        }
        if (ds60Var instanceof ds60.h) {
            return new qwq0((ds60.h) ds60Var);
        }
        if (ds60Var instanceof ds60.c) {
            return new nwq0((ds60.c) ds60Var);
        }
        if (ds60Var instanceof ds60.e) {
            return new pwq0((ds60.e) ds60Var);
        }
        if (ds60Var instanceof ds60.d) {
            return new owq0((ds60.d) ds60Var);
        }
        if (ds60Var instanceof ds60.a) {
            return new lwq0.a.C3305a((ds60.a) ds60Var);
        }
        if (ds60Var instanceof ds60.g.a) {
            return new rwq0((ds60.g) ds60Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
