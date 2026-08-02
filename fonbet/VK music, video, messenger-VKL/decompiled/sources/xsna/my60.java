package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ds60;
import xsna.ey60;

/* compiled from: NewsfeedSearchMviTaskMapper.kt */
/* loaded from: classes4.dex */
public final class my60 implements au60<ey60> {
    @Override // xsna.au60
    public final ey60 a(ds60 ds60Var) {
        if (ds60Var instanceof ds60.f) {
            return new ey60.b.c((ds60.f) ds60Var);
        }
        if (ds60Var instanceof ds60.b) {
            return new fy60((ds60.b) ds60Var);
        }
        if (ds60Var instanceof ds60.h) {
            return new jy60((ds60.h) ds60Var);
        }
        if (ds60Var instanceof ds60.c) {
            return new gy60((ds60.c) ds60Var);
        }
        if (ds60Var instanceof ds60.e) {
            return new iy60((ds60.e) ds60Var);
        }
        if (ds60Var instanceof ds60.d) {
            return new hy60((ds60.d) ds60Var);
        }
        if (ds60Var instanceof ds60.a) {
            return new ey60.a.C2840a((ds60.a) ds60Var);
        }
        if (ds60Var instanceof ds60.g.a) {
            return new ey60.c.a((ds60.g) ds60Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
