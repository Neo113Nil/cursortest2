package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ds60;
import xsna.t5c0;

/* compiled from: PostMviTaskMapper.kt */
/* loaded from: classes4.dex */
public final class c6c0 implements au60<t5c0> {
    @Override // xsna.au60
    public final t5c0 a(ds60 ds60Var) {
        if (ds60Var instanceof ds60.f) {
            return new t5c0.d.b((ds60.f) ds60Var);
        }
        if (ds60Var instanceof ds60.b) {
            return new u5c0((ds60.b) ds60Var);
        }
        if (ds60Var instanceof ds60.h) {
            return new y5c0((ds60.h) ds60Var);
        }
        if (ds60Var instanceof ds60.c) {
            return new v5c0((ds60.c) ds60Var);
        }
        if (ds60Var instanceof ds60.e) {
            return new x5c0((ds60.e) ds60Var);
        }
        if (ds60Var instanceof ds60.d) {
            return new w5c0((ds60.d) ds60Var);
        }
        if (ds60Var instanceof ds60.a) {
            return new t5c0.c.a((ds60.a) ds60Var);
        }
        if (ds60Var instanceof ds60.g.a) {
            return new z5c0((ds60.g) ds60Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
