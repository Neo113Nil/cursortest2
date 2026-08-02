package androidx.compose.ui.node;

import defpackage.dr60;
import defpackage.e530;
import defpackage.i4u;
import defpackage.p8e;
import defpackage.qje;
import defpackage.reu;
import defpackage.sls;
import defpackage.tls;
import defpackage.u0y;
import defpackage.v0y;
import defpackage.x910;

/* loaded from: classes10.dex */
public abstract class u {
    public static int a(u0y u0yVar, LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        t tVar = new t(x910Var, NodeMeasuringIntrinsics$IntrinsicMinMax.Max, NodeMeasuringIntrinsics$IntrinsicWidthHeight.Height);
        long b = p8e.b(0, i, 0, 0, 13);
        return u0yVar.a.e(new androidx.compose.ui.layout.d(lookaheadCapablePlaceable, lookaheadCapablePlaceable.getLayoutDirection()), tVar, b).getHeight();
    }

    public static int b(i4u i4uVar, LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        t tVar = new t(x910Var, NodeMeasuringIntrinsics$IntrinsicMinMax.Max, NodeMeasuringIntrinsics$IntrinsicWidthHeight.Width);
        long b = p8e.b(0, 0, 0, i, 7);
        return ((v0y) i4uVar.a).e(new androidx.compose.ui.layout.d(lookaheadCapablePlaceable, lookaheadCapablePlaceable.getLayoutDirection()), tVar, b).getWidth();
    }

    public static int c(reu reuVar, LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        t tVar = new t(x910Var, NodeMeasuringIntrinsics$IntrinsicMinMax.Min, NodeMeasuringIntrinsics$IntrinsicWidthHeight.Height);
        long b = p8e.b(0, i, 0, 0, 13);
        return ((v0y) reuVar.b).e(new androidx.compose.ui.layout.d(lookaheadCapablePlaceable, lookaheadCapablePlaceable.getLayoutDirection()), tVar, b).getHeight();
    }

    public static int d(u0y u0yVar, LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        t tVar = new t(x910Var, NodeMeasuringIntrinsics$IntrinsicMinMax.Min, NodeMeasuringIntrinsics$IntrinsicWidthHeight.Width);
        long b = p8e.b(0, 0, 0, i, 7);
        return u0yVar.a.e(new androidx.compose.ui.layout.d(lookaheadCapablePlaceable, lookaheadCapablePlaceable.getLayoutDirection()), tVar, b).getWidth();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(e530 e530Var, sls slsVar) {
        v ownerScope$ui = e530Var.getOwnerScope$ui();
        if (ownerScope$ui == null) {
            ownerScope$ui = new v((dr60) e530Var);
            e530Var.setOwnerScope$ui(ownerScope$ui);
        }
        w snapshotObserver = qje.Q(e530Var).getSnapshotObserver();
        tls tlsVar = v.b;
        snapshotObserver.a.c(ownerScope$ui, ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1.w, slsVar);
    }
}
