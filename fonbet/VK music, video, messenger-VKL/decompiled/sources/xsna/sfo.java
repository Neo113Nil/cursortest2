package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog.mvi.block.BlockId;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.q630;

/* compiled from: DragAndDropReorder.kt */
/* loaded from: classes16.dex */
public final class sfo {
    public static final pqo a = new pqo(new a44(14));
    public static final pqo b = new pqo(new a44(14));
    public static final pqo c = new pqo(new a44(14));

    /* compiled from: DragAndDropReorder.kt */
    public static final class a implements PointerInputEventHandler {
        public final /* synthetic */ wfo a;
        public final /* synthetic */ Object b;

        public a(wfo wfoVar, Object obj) {
            this.a = wfoVar;
            this.b = obj;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
            int i = 13;
            wfo wfoVar = this.a;
            d50 d50Var = new d50(i, wfoVar, this.b);
            bih bihVar = new bih(wfoVar, i);
            h1j h1jVar = new h1j(wfoVar, 8);
            w61 w61Var = new w61(wfoVar, 5);
            float f = lgo.a;
            Object c = d7s.c(dmb0Var, new ggo(null, bihVar, h1jVar, d50Var, w61Var), spjVar);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (c != coroutineSingletons) {
                c = s3q0.a;
            }
            return c == coroutineSingletons ? c : s3q0.a;
        }
    }

    /* compiled from: DragAndDropReorder.kt */
    public static final class b implements PointerInputEventHandler {
        public final /* synthetic */ nfu a;
        public final /* synthetic */ Object b;

        public b(nfu nfuVar, Object obj) {
            this.a = nfuVar;
            this.b = obj;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
            nfu nfuVar = this.a;
            v74 v74Var = new v74(10, nfuVar, this.b);
            ecm ecmVar = new ecm(nfuVar, 3);
            m1i m1iVar = new m1i(nfuVar, 9);
            bn7 bn7Var = new bn7(nfuVar, 5);
            float f = lgo.a;
            Object c = d7s.c(dmb0Var, new ggo(null, ecmVar, m1iVar, v74Var, bn7Var), spjVar);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (c != coroutineSingletons) {
                c = s3q0.a;
            }
            return c == coroutineSingletons ? c : s3q0.a;
        }
    }

    public static final void a(final boolean z, final xvy xvyVar, final zzs zzsVar, final gzs gzsVar, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(252679018);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.J(xvyVar) ? 32 : 16) | (M.y(zzsVar) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024);
        boolean z2 = true;
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(252679018, i2, -1, "com.vk.catalog.mvi.section.ui.view.reorder.DragAndDropContainer (DragAndDropReorder.kt:64)");
            }
            if (z) {
                M.K(-1516810381);
                int i3 = i2 >> 3;
                int i4 = i3 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1827113901, i4, -1, "com.vk.catalog.mvi.section.ui.view.reorder.rememberDragDropState (DragAndDropReorder.kt:243)");
                }
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = bap.j(EmptyCoroutineContext.b, M);
                    M.R(x);
                }
                yvj yvjVar = (yvj) x;
                int i5 = (i3 & 14) ^ 6;
                boolean z3 = (i5 > 4 && M.J(xvyVar)) || (i3 & 6) == 4;
                Object x2 = M.x();
                if (z3 || x2 == c0012a) {
                    x2 = new wfo(xvyVar, yvjVar, zzsVar, gzsVar);
                    M.R(x2);
                }
                wfo wfoVar = (wfo) x2;
                boolean y = M.y(wfoVar);
                if ((i5 <= 4 || !M.J(xvyVar)) && (6 & i3) != 4) {
                    z2 = false;
                }
                boolean z4 = y | z2;
                Object x3 = M.x();
                if (z4 || x3 == c0012a) {
                    x3 = new tfo(wfoVar, xvyVar, null);
                    M.R(x3);
                }
                bap.g(wfoVar, (wzs) x3, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                rvi.a(a.b(wfoVar), jaiVar, M, 56);
                M.j();
            } else {
                M.K(-1516583585);
                jaiVar.invoke(M, 6);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, xvyVar, zzsVar, gzsVar, jaiVar, i) { // from class: xsna.nfo
                public final /* synthetic */ boolean b;
                public final /* synthetic */ xvy c;
                public final /* synthetic */ zzs d;
                public final /* synthetic */ gzs e;
                public final /* synthetic */ jai f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(24577);
                    sfo.a(this.b, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(boolean z, BlockId blockId, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1486675480);
        int i2 = (M.l(z) ? 4 : 2) | i | (M.J(blockId) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1486675480, i2, -1, "com.vk.catalog.mvi.section.ui.view.reorder.DraggableItem (DragAndDropReorder.kt:100)");
            }
            if (z) {
                M.K(153670895);
                rvi.a(c.b(blockId), kai.c(-379067539, new m00(jaiVar, 3), M), M, 56);
                M.j();
            } else {
                M.K(153811201);
                jaiVar.invoke(M, 6);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pfo(z, blockId, jaiVar, i);
        }
    }

    public static final q630 c() {
        gii giiVar = new gii(2);
        return qri.a(q630.a.a, a5x.a, giiVar);
    }

    public static final q630 d(q630 q630Var) {
        return qri.a(q630Var, a5x.a, new ux6(5));
    }
}
