package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ds60;
import xsna.lg60;

/* compiled from: NewsfeedCustomMviTaskMapper.kt */
/* loaded from: classes4.dex */
public final class ng60 implements au60<lg60> {
    @Override // xsna.au60
    public final lg60 a(ds60 ds60Var) {
        if (ds60Var instanceof ds60.f) {
            return new lg60.a.b((ds60.f) ds60Var);
        }
        if (ds60Var instanceof ds60.b) {
            return new dg60((ds60.b) ds60Var);
        }
        if (ds60Var instanceof ds60.h) {
            return new ig60((ds60.h) ds60Var);
        }
        if (ds60Var instanceof ds60.c) {
            return new eg60((ds60.c) ds60Var);
        }
        if (ds60Var instanceof ds60.e) {
            return new gg60((ds60.e) ds60Var);
        }
        if (ds60Var instanceof ds60.d) {
            return new fg60((ds60.d) ds60Var);
        }
        if (ds60Var instanceof ds60.a) {
            return new cg60((ds60.a) ds60Var);
        }
        if (ds60Var instanceof ds60.g.a) {
            return new hg60((ds60.g) ds60Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
