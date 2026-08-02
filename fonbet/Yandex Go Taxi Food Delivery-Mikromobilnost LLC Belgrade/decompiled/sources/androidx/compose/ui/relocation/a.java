package androidx.compose.ui.relocation;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.s;
import defpackage.cqh;
import defpackage.e530;
import defpackage.ixv;
import defpackage.lqh;
import defpackage.nk6;
import defpackage.qje;
import defpackage.rzo;
import defpackage.rzx;
import defpackage.sls;
import defpackage.t300;
import defpackage.v7x0;
import defpackage.wwg;
import defpackage.wz40;
import defpackage.zii0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public abstract class a {
    public static final Object a(cqh cqhVar, final sls slsVar, ContinuationImpl continuationImpl) {
        Object obj;
        final s O;
        Object z0;
        t300 t300Var;
        if (cqhVar.getNode().isAttached()) {
            if (!cqhVar.getNode().isAttached()) {
                ixv.b("visitAncestors called on an unattached node");
            }
            e530 parent$ui = cqhVar.getNode().getParent$ui();
            LayoutNode P = qje.P(cqhVar);
            loop0: while (true) {
                obj = null;
                if (P == null) {
                    break;
                }
                if ((((e530) P.a0.g).getAggregateChildKindSet$ui() & 524288) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & 524288) != 0) {
                            e530 e530Var = parent$ui;
                            wz40 wz40Var = null;
                            while (e530Var != null) {
                                if (e530Var instanceof nk6) {
                                    obj = e530Var;
                                    break loop0;
                                }
                                if ((e530Var.getKindSet$ui() & 524288) != 0 && (e530Var instanceof lqh)) {
                                    int i = 0;
                                    for (e530 e530Var2 = ((lqh) e530Var).b; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
                                        if ((e530Var2.getKindSet$ui() & 524288) != 0) {
                                            i++;
                                            if (i == 1) {
                                                e530Var = e530Var2;
                                            } else {
                                                if (wz40Var == null) {
                                                    wz40Var = new wz40(new e530[16]);
                                                }
                                                if (e530Var != null) {
                                                    wz40Var.b(e530Var);
                                                    e530Var = null;
                                                }
                                                wz40Var.b(e530Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                e530Var = qje.c(wz40Var);
                            }
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                P = P.s();
                parent$ui = (P == null || (t300Var = P.a0) == null) ? null : (v7x0) t300Var.f;
            }
            nk6 nk6Var = (nk6) obj;
            if (nk6Var != null && (z0 = nk6Var.z0((O = qje.O(cqhVar)), new sls() { // from class: androidx.compose.ui.relocation.BringIntoViewModifierNodeKt$bringIntoView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    zii0 zii0Var;
                    sls slsVar2 = sls.this;
                    if (slsVar2 != null && (zii0Var = (zii0) slsVar2.invoke()) != null) {
                        return zii0Var;
                    }
                    rzx rzxVar = O;
                    if (!rzxVar.d()) {
                        rzxVar = null;
                    }
                    if (rzxVar != null) {
                        return wwg.b(0L, rzo.a0(rzxVar.e()));
                    }
                    return null;
                }
            }, continuationImpl)) == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return z0;
            }
        }
        return zy11.a;
    }
}
