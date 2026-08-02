package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ds60;
import xsna.r070;

/* compiled from: NewsfeedMainMviTaskMapper.kt */
/* loaded from: classes4.dex */
public final class qt60 implements au60<r070> {
    @Override // xsna.au60
    public final r070 a(ds60 ds60Var) {
        if (ds60Var instanceof ds60.f) {
            return new r070.h.c((ds60.f) ds60Var);
        }
        if (ds60Var instanceof ds60.b) {
            return new s070((ds60.b) ds60Var);
        }
        if (ds60Var instanceof ds60.h) {
            return new w070((ds60.h) ds60Var);
        }
        if (ds60Var instanceof ds60.g) {
            return new r070.k.d((ds60.g) ds60Var);
        }
        if (ds60Var instanceof ds60.c) {
            return new t070((ds60.c) ds60Var);
        }
        if (ds60Var instanceof ds60.e) {
            return new v070((ds60.e) ds60Var);
        }
        if (ds60Var instanceof ds60.d) {
            return new u070((ds60.d) ds60Var);
        }
        if (!(ds60Var instanceof ds60.a)) {
            throw new NoWhenBranchMatchedException();
        }
        ds60.a aVar = (ds60.a) ds60Var;
        if (aVar instanceof ds60.a.C2747a) {
            return r070.d.a.b;
        }
        if (aVar instanceof ds60.a.b) {
            return r070.d.b.b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
