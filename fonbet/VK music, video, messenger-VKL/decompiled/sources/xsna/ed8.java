package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.q630;

/* compiled from: BringIntoViewResponder.kt */
/* loaded from: classes11.dex */
public final class ed8 extends q630.c implements kc8, ony {
    public lgj p;
    public boolean q;

    public static final zhf0 i2(ed8 ed8Var, tny tnyVar, gzs<zhf0> gzsVar) {
        zhf0 invoke;
        if (ed8Var.o && ed8Var.q) {
            androidx.compose.ui.node.o e = itl.e(ed8Var);
            if (!tnyVar.e()) {
                tnyVar = null;
            }
            if (tnyVar != null && (invoke = gzsVar.invoke()) != null) {
                return invoke.j(e.z(tnyVar, false).e());
            }
        }
        return null;
    }

    @Override // xsna.kc8
    public final Object S(androidx.compose.ui.node.o oVar, lc8 lc8Var, ContinuationImpl continuationImpl) {
        Object d = zvj.d(new dd8(this, oVar, lc8Var, new defpackage.w(this, oVar, lc8Var, 1), null), continuationImpl);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : s3q0.a;
    }

    @Override // xsna.q630.c
    public final boolean X1() {
        return false;
    }

    @Override // xsna.ony
    public final void s0(tny tnyVar) {
        this.q = true;
    }
}
