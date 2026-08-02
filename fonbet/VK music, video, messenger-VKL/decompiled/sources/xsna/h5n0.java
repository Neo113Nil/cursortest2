package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.a5n0;
import xsna.ds60;

/* compiled from: SuggestedPostsMviTaskMapper.kt */
/* loaded from: classes4.dex */
public final class h5n0 implements au60<a5n0> {
    @Override // xsna.au60
    public final a5n0 a(ds60 ds60Var) {
        if (ds60Var instanceof ds60.f) {
            return new a5n0.b.C2524b((ds60.f) ds60Var);
        }
        if (ds60Var instanceof ds60.b) {
            return new b5n0((ds60.b) ds60Var);
        }
        if (ds60Var instanceof ds60.h) {
            return new f5n0((ds60.h) ds60Var);
        }
        if (ds60Var instanceof ds60.c) {
            return new c5n0((ds60.c) ds60Var);
        }
        if (ds60Var instanceof ds60.e) {
            return new e5n0((ds60.e) ds60Var);
        }
        if (ds60Var instanceof ds60.d) {
            return new d5n0((ds60.d) ds60Var);
        }
        if (ds60Var instanceof ds60.a) {
            return new a5n0.a.b((ds60.a) ds60Var);
        }
        if (ds60Var instanceof ds60.g.a) {
            return new g5n0((ds60.g) ds60Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
