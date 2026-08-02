package defpackage;

import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import defpackage.dd11;
import defpackage.l8m;
import defpackage.nl91;
import defpackage.pl91;
import defpackage.qje;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class l8m extends e530 implements dd11, u8m, izx {
    public final seu a;
    public l8m b;
    public u8m c;
    public long w;

    public l8m(int i) {
        this.a = seu.z;
        this.w = 0L;
    }

    public final boolean E0(g8m g8mVar) {
        l8m l8mVar = this.b;
        if (l8mVar != null) {
            return l8mVar.E0(g8mVar);
        }
        u8m u8mVar = this.c;
        if (u8mVar != null) {
            return ((l8m) u8mVar).E0(g8mVar);
        }
        return false;
    }

    public final void F0(g8m g8mVar) {
        u8m u8mVar = this.c;
        if (u8mVar != null) {
            ((l8m) u8mVar).F0(g8mVar);
            return;
        }
        l8m l8mVar = this.b;
        if (l8mVar != null) {
            l8mVar.F0(g8mVar);
        }
    }

    public final void G0(g8m g8mVar) {
        u8m u8mVar = this.c;
        if (u8mVar != null) {
            ((l8m) u8mVar).G0(g8mVar);
        }
        l8m l8mVar = this.b;
        if (l8mVar != null) {
            l8mVar.G0(g8mVar);
        }
        this.b = null;
    }

    public final void H0(final g8m g8mVar) {
        dd11 dd11Var;
        l8m l8mVar;
        l8m l8mVar2 = this.b;
        if (l8mVar2 == null || !nl91.c(l8mVar2, pl91.c(g8mVar))) {
            if (getNode().isAttached()) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                dai0.O(this, new tls() { // from class: androidx.compose.ui.draganddrop.DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Type inference failed for: r4v1, types: [T, dd11] */
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        ?? r4 = (dd11) obj;
                        l8m l8mVar3 = (l8m) r4;
                        l8m l8mVar4 = this;
                        l8mVar4.getClass();
                        if (!qje.Q(l8mVar4).getDragAndDropManager().isInterestedTarget(l8mVar3) || !nl91.c(l8mVar3, pl91.c(g8mVar))) {
                            return TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                        }
                        Ref$ObjectRef.this.element = r4;
                        return TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal;
                    }
                });
                dd11Var = (dd11) ref$ObjectRef.element;
            } else {
                dd11Var = null;
            }
            l8mVar = (l8m) dd11Var;
        } else {
            l8mVar = l8mVar2;
        }
        if (l8mVar != null && l8mVar2 == null) {
            nl91.d(l8mVar, g8mVar);
            u8m u8mVar = this.c;
            if (u8mVar != null) {
                ((l8m) u8mVar).G0(g8mVar);
            }
        } else if (l8mVar == null && l8mVar2 != null) {
            u8m u8mVar2 = this.c;
            if (u8mVar2 != null) {
                nl91.d(u8mVar2, g8mVar);
            }
            l8mVar2.G0(g8mVar);
        } else if (!jl40.l(l8mVar, l8mVar2)) {
            if (l8mVar != null) {
                nl91.d(l8mVar, g8mVar);
            }
            if (l8mVar2 != null) {
                l8mVar2.G0(g8mVar);
            }
        } else if (l8mVar != null) {
            l8mVar.H0(g8mVar);
        } else {
            u8m u8mVar3 = this.c;
            if (u8mVar3 != null) {
                ((l8m) u8mVar3).H0(g8mVar);
            }
        }
        this.b = l8mVar;
    }

    public final void I0(g8m g8mVar) {
        u8m u8mVar = this.c;
        if (u8mVar != null) {
            ((l8m) u8mVar).I0(g8mVar);
            return;
        }
        l8m l8mVar = this.b;
        if (l8mVar != null) {
            l8mVar.I0(g8mVar);
        }
    }

    @Override // defpackage.dd11
    public final Object V() {
        return this.a;
    }

    @Override // defpackage.izx, defpackage.ga10
    public final void a(long j) {
        this.w = j;
    }

    @Override // defpackage.e530
    public final void onDetach() {
        this.c = null;
        this.b = null;
    }

    public l8m() {
        this(0);
    }
}
