package androidx.compose.foundation.relocation;

import androidx.compose.foundation.gestures.f;
import androidx.compose.ui.node.s;
import defpackage.bvf0;
import defpackage.e530;
import defpackage.izx;
import defpackage.nk6;
import defpackage.qje;
import defpackage.rzx;
import defpackage.sb0;
import defpackage.sls;
import defpackage.zii0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class b extends e530 implements nk6, izx {
    public f a;
    public boolean b;

    public static final zii0 E0(b bVar, rzx rzxVar, sls slsVar) {
        zii0 zii0Var;
        if (bVar.isAttached() && bVar.b) {
            s O = qje.O(bVar);
            if (!rzxVar.d()) {
                rzxVar = null;
            }
            if (rzxVar != null && (zii0Var = (zii0) slsVar.invoke()) != null) {
                return zii0Var.j(O.j(rzxVar, false).e());
            }
        }
        return null;
    }

    @Override // defpackage.izx
    public final void A(rzx rzxVar) {
        this.b = true;
    }

    @Override // defpackage.e530
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.nk6
    public final Object z0(s sVar, sls slsVar, ContinuationImpl continuationImpl) {
        Object n = bvf0.n(new BringIntoViewResponderNode$bringIntoView$2(this, sVar, slsVar, new sb0(9, this, sVar, slsVar), null), continuationImpl);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }
}
