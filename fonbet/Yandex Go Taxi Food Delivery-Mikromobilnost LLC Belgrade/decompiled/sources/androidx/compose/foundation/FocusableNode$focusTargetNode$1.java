package androidx.compose.foundation;

import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.node.s;
import androidx.compose.ui.node.u;
import defpackage.aur;
import defpackage.bdp;
import defpackage.dai0;
import defpackage.ivr;
import defpackage.qje;
import defpackage.tje;
import defpackage.tls;
import defpackage.vvr;
import defpackage.wls;
import defpackage.y5y;
import defpackage.zoy0;
import defpackage.ztr;
import defpackage.zx40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class FocusableNode$focusTargetNode$1 extends FunctionReferenceImpl implements wls {
    /* JADX WARN: Multi-variable type inference failed */
    public final void i(ivr ivrVar, ivr ivrVar2) {
        boolean b;
        g gVar = (g) this.receiver;
        if (gVar.isAttached() && (b = ((FocusStateImpl) ivrVar2).b()) != ((FocusStateImpl) ivrVar).b()) {
            tls tlsVar = gVar.w;
            if (tlsVar != null) {
                tlsVar.invoke(Boolean.valueOf(b));
            }
            zoy0 zoy0Var = vvr.a;
            if (b) {
                tje.N(gVar.getCoroutineScope(), null, null, new FocusableNode$onFocusStateChange$1(gVar, null), 3);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                u.e(gVar, new bdp(10, ref$ObjectRef, gVar));
                y5y y5yVar = (y5y) ref$ObjectRef.element;
                if (y5yVar != null) {
                    y5yVar.a();
                } else {
                    y5yVar = null;
                }
                gVar.y = y5yVar;
                s sVar = gVar.z;
                if (sVar != null && sVar.d() && gVar.isAttached()) {
                    dai0.n(gVar, zoy0Var);
                }
            } else {
                y5y y5yVar2 = gVar.y;
                if (y5yVar2 != null) {
                    y5yVar2.b();
                }
                gVar.y = null;
                if (gVar.isAttached()) {
                    dai0.n(gVar, zoy0Var);
                }
            }
            qje.P(gVar).D();
            zx40 zx40Var = gVar.c;
            if (zx40Var != null) {
                ztr ztrVar = gVar.x;
                if (!b) {
                    if (ztrVar != null) {
                        gVar.H0(zx40Var, new aur(ztrVar));
                        gVar.x = null;
                        return;
                    }
                    return;
                }
                if (ztrVar != null) {
                    gVar.H0(zx40Var, new aur(ztrVar));
                    gVar.x = null;
                }
                ztr ztrVar2 = new ztr();
                gVar.H0(zx40Var, ztrVar2);
                gVar.x = ztrVar2;
            }
        }
    }

    @Override // defpackage.wls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        i((ivr) obj, (ivr) obj2);
        return zy11.a;
    }
}
