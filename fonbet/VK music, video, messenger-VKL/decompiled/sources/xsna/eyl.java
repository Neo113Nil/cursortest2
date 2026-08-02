package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.cart.impl.points_map.ui.compose.sheet.DeliveryPointsSheetState;
import xsna.cri;
import xsna.dt1;
import xsna.kyl;
import xsna.q630;
import xsna.xxl;

/* compiled from: DeliveryPointsMapScreen.kt */
/* loaded from: classes18.dex */
public final class eyl {
    public static final void a(final izs izsVar, final boolean z, final kyl.b bVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(755415482);
        int i2 = (M.y(izsVar) ? 4 : 2) | i | (M.l(z) ? 32 : 16) | (M.J(bVar) ? 256 : 128) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(755415482, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.AboveSheetContent (DeliveryPointsMapScreen.kt:119)");
            }
            q630.a aVar2 = q630.a.a;
            q630 D = s200.D(txj0.f(aVar2, 1.0f), 16);
            a.h hVar = androidx.compose.foundation.layout.a.g;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(hVar, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            boolean z2 = bVar.b;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2) {
                M.K(-436964525);
                q630 g = ahn.E(aVar2, "delivery_points_filters_button").g(new gor0(dt1.a.m));
                boolean z3 = bVar.a;
                boolean z4 = (i2 & 14) == 4;
                Object x = M.x();
                if (z4 || x == c0012a) {
                    x = new tq0(izsVar, 4);
                    M.R(x);
                }
                icr.a(0, M, (gzs) x, g, z3);
                M.j();
            } else {
                M.K(-436594044);
                ja8.a(new gor0(dt1.a.m), M, 0);
                M.j();
            }
            boolean z5 = (i2 & 14) == 4;
            Object x2 = M.x();
            if (z5 || x2 == c0012a) {
                x2 = new a97(izsVar, 2);
                M.R(x2);
            }
            tkq0.a((i2 << 3) & 896, M, (gzs) x2, ahn.E(new gor0(dt1.a.m), "delivery_points_location_button"), z);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, bVar, q630Var2, i) { // from class: xsna.cyl
                public final /* synthetic */ boolean c;
                public final /* synthetic */ kyl.b d;
                public final /* synthetic */ q630 e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    eyl.a(izs.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(Context context, xxl.c cVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(320059350);
        if ((i & 6) == 0) {
            i2 = (M.y(context) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(cVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(320059350, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.DeliveryPointsMapScreenContent (DeliveryPointsMapScreen.kt:40)");
            }
            wh50 d = jk50.d(cVar.a, new kyl.c(0), M, 0);
            wh50 d2 = jk50.d(cVar.b, kyl.e.c.c, M, 48);
            DeliveryPointsSheetState deliveryPointsSheetState = DeliveryPointsSheetState.Hidden;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new ot(18);
                M.R(x);
            }
            f12 c = s88.c(deliveryPointsSheetState, (izs) x, M, 196614, 30);
            dt1.a.getClass();
            cp10 d3 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d3, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            boolean z = ((kyl.e) d2.getValue()).b;
            q630.a aVar3 = q630.a.a;
            q630 d4 = txj0.d(aVar3, 1.0f);
            jai c3 = kai.c(855730333, new f7c(1, izsVar, d2), M);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new kc4((byte) 0, 5);
                M.R(x2);
            }
            s88.b(c3, (wzs) x2, c, d4, z, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-250942811, new mog(3, izsVar, d), M), kai.c(1221335782, new byl(context, cVar, izsVar, d), M), M, 905972790);
            M = M;
            pwl.a(izsVar, (kyl.e) d2.getValue(), ra8.a.b(txj0.f(aVar3, 1.0f), dt1.a.i), M, (i2 >> 6) & 14);
            jx9.a(((kyl.c) d.getValue()).b, ((kyl.c) d.getValue()).c, txj0.d(aVar3, 1.0f), M, 384);
            M.G();
            DeliveryPointsSheetState deliveryPointsSheetState2 = ((kyl.e) d2.getValue()).a;
            boolean J = M.J(c) | M.J(d2);
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                x3 = new dyl(c, d2, null);
                M.R(x3);
            }
            bap.g(deliveryPointsSheetState2, (wzs) x3, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sq0(context, cVar, izsVar, q630Var, i);
        }
    }
}
