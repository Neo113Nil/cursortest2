package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ds60;
import xsna.y4f0;

/* compiled from: ReactionsFeedMviTaskMapper.kt */
/* loaded from: classes4.dex */
public final class a5f0 implements au60<y4f0> {
    @Override // xsna.au60
    public final y4f0 a(ds60 ds60Var) {
        if (ds60Var instanceof ds60.f) {
            return new y4f0.a.b((ds60.f) ds60Var);
        }
        if (ds60Var instanceof ds60.b) {
            return new t4f0((ds60.b) ds60Var);
        }
        if (ds60Var instanceof ds60.h) {
            return new x4f0((ds60.h) ds60Var);
        }
        if (ds60Var instanceof ds60.c) {
            return new u4f0((ds60.c) ds60Var);
        }
        if (ds60Var instanceof ds60.e) {
            return new w4f0((ds60.e) ds60Var);
        }
        if (ds60Var instanceof ds60.d) {
            return new v4f0((ds60.d) ds60Var);
        }
        if (ds60Var instanceof ds60.a) {
            return new s4f0((ds60.a) ds60Var);
        }
        if (ds60Var instanceof ds60.g.a) {
            return new z4f0((ds60.g) ds60Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
