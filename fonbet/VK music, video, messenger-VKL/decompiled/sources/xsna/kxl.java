package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.maps.model.MarkerOptions;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import xsna.kyl;
import xsna.xxl;

/* compiled from: DeliveryPointsMap.kt */
/* loaded from: classes18.dex */
public final class kxl {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final Context context, kyl.c cVar, xxl.c cVar2, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        Object obj;
        final wh50 wh50Var;
        androidx.compose.runtime.a M = aVar.M(16930547);
        int i2 = i | (M.y(context) ? 4 : 2) | (M.J(cVar) ? 32 : 16) | (M.J(cVar2) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(16930547, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.DeliveryPointsMap (DeliveryPointsMap.kt:48)");
            }
            wh50 d = jk50.d(cVar2.c, new kyl.a(0), M, 48);
            wh50 d2 = jk50.d(cVar2.d, new kyl.d(0), M, 48);
            wh50 a = jk50.a(cVar2.e, M, 48, 2);
            Object x = M.x();
            Object obj2 = a.C0011a.a;
            if (x == obj2) {
                x = androidx.compose.runtime.k.b(null);
                M.R(x);
            }
            wh50 wh50Var2 = (wh50) x;
            Object x2 = M.x();
            if (x2 == obj2) {
                x2 = androidx.compose.runtime.k.b(null);
                M.R(x2);
            }
            final wh50 wh50Var3 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == obj2) {
                x3 = j3v0.c(context);
                M.R(x3);
            }
            final jm00 jm00Var = (jm00) x3;
            b(wh50Var3, (kyl.a) d.getValue(), M, 6);
            oj00 oj00Var = (oj00) wh50Var2.getValue();
            c(oj00Var != null ? new qow(oj00Var) : null, (kyl.d) d2.getValue(), M, 0);
            oj00 oj00Var2 = (oj00) wh50Var2.getValue();
            d(oj00Var2 != null ? new qow(oj00Var2) : null, (kyl.f) a.getValue(), M, 0);
            j3v0.a(((f5z) M.r(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle(), jm00Var, M, 0);
            oj00 oj00Var3 = (oj00) wh50Var2.getValue();
            j3v0.b(oj00Var3 != null ? new qow(oj00Var3) : null, M, 0);
            q630 d3 = txj0.d(q630Var, 1.0f);
            boolean y = M.y(jm00Var) | ((i2 & 7168) == 2048) | M.y(context);
            Object x4 = M.x();
            if (y || x4 == obj2) {
                wh50Var = wh50Var2;
                obj = new izs() { // from class: xsna.jxl
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.izs
                    public final Object invoke(Object obj3) {
                        k3v0 k3v0Var = new k3v0(new exl(izsVar, context, wh50Var3), wh50Var, 0);
                        jm00 jm00Var2 = jm00.this;
                        jm00Var2.c(k3v0Var);
                        return (View) jm00Var2;
                    }
                };
                M.R(obj);
            } else {
                obj = x4;
                wh50Var = wh50Var2;
            }
            izs izsVar2 = (izs) obj;
            boolean z = (i2 & 112) == 32;
            Object x5 = M.x();
            if (z || x5 == obj2) {
                x5 = new rh4(10, wh50Var, cVar);
                M.R(x5);
            }
            ae2.a(0, 0, M, izsVar2, (izs) x5, d3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pz7(context, cVar, cVar2, izsVar, q630Var, i);
        }
    }

    public static final void b(wh50<wwf<lwl>> wh50Var, kyl.a aVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(773618307);
        int i2 = (M.J(aVar) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(773618307, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.UpdateClusters (DeliveryPointsMap.kt:128)");
            }
            wwf<lwl> value = wh50Var.getValue();
            if (value != null) {
                value.b();
                value.h(aVar.a);
                value.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ljf(wh50Var, aVar, i, 1);
        }
    }

    public static final void c(qow<oj00> qowVar, kyl.d dVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.f fVar;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
        oj00 oj00Var;
        jar0 jar0Var;
        androidx.compose.runtime.a M = aVar.M(-2132397907);
        int i2 = (M.J(qowVar) ? 4 : 2) | i | (M.J(dVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2132397907, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.UpdateSelectedDeliveryPointMarker (DeliveryPointsMap.kt:140)");
            }
            if (qowVar == null || (oj00Var = qowVar.a) == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                fVar = M.s();
                if (fVar != null) {
                    wzsVar = new gx(qowVar, dVar, i, 6);
                    fVar.d = wzsVar;
                }
                return;
            }
            oj00 oj00Var2 = oj00Var;
            Object x = M.x();
            if (x == a.C0011a.a) {
                vj00 vj00Var = ofx.a;
                if (vj00Var == null) {
                    vj00Var = null;
                }
                rdr0 c = vj00Var.c();
                Bitmap bitmap = dVar.b;
                if (bitmap != null) {
                    vj00 vj00Var2 = ofx.a;
                    if (vj00Var2 == null) {
                        vj00Var2 = null;
                    }
                    vj00Var2.getClass();
                    jar0Var = xx1.h(bitmap);
                } else {
                    jar0Var = null;
                }
                c.a(jar0Var);
                Coordinates coordinates = dVar.c;
                c.b(new edr0(coordinates.b, coordinates.c));
                c.a.o = 1.0f;
                x = oj00Var2.e(c);
                M.R(x);
            }
            fo00 fo00Var = (fo00) x;
            if (fo00Var != null) {
                fo00Var.b(dVar.a);
            }
            if (fo00Var != null) {
                Coordinates coordinates2 = dVar.c;
                fo00Var.a(new edr0(coordinates2.b, coordinates2.c));
            }
            Bitmap bitmap2 = dVar.b;
            if (bitmap2 != null) {
                vj00 vj00Var3 = ofx.a;
                (vj00Var3 != null ? vj00Var3 : null).getClass();
                jar0 h = xx1.h(bitmap2);
                if (fo00Var != null) {
                    fo00Var.c(h);
                }
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        fVar = M.s();
        if (fVar != null) {
            wzsVar = new y61(qowVar, dVar, i, 5);
            fVar.d = wzsVar;
        }
    }

    public static final void d(qow<oj00> qowVar, kyl.f fVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> x2Var;
        oj00 oj00Var;
        androidx.compose.runtime.a M = aVar.M(-1559326615);
        int i2 = (M.J(qowVar) ? 4 : 2) | i | (M.J(fVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1559326615, i2, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.UpdateUserLocationMarker (DeliveryPointsMap.kt:106)");
            }
            if (fVar == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s == null) {
                    return;
                } else {
                    x2Var = new ps7(qowVar, fVar, i, 1);
                }
            } else {
                Coordinates coordinates = fVar.a;
                if (qowVar == null || (oj00Var = qowVar.a) == null) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    s = M.s();
                    if (s == null) {
                        return;
                    } else {
                        x2Var = new i8c(qowVar, fVar, i, 4);
                    }
                } else {
                    oj00 oj00Var2 = oj00Var;
                    Object x = M.x();
                    if (x == a.C0011a.a) {
                        vj00 vj00Var = ofx.a;
                        if (vj00Var == null) {
                            vj00Var = null;
                        }
                        rdr0 c = vj00Var.c();
                        MarkerOptions markerOptions = c.a;
                        vj00 vj00Var2 = ofx.a;
                        vj00 vj00Var3 = vj00Var2 != null ? vj00Var2 : null;
                        Bitmap bitmap = fVar.b;
                        vj00Var3.getClass();
                        c.a(xx1.h(bitmap));
                        c.b(new edr0(coordinates.b, coordinates.c));
                        markerOptions.o = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        markerOptions.f = 0.5f;
                        markerOptions.g = 0.5f;
                        x = oj00Var2.e(c);
                        M.R(x);
                    }
                    fo00 fo00Var = (fo00) x;
                    if (fo00Var != null) {
                        fo00Var.a(new edr0(coordinates.b, coordinates.c));
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            s.d = x2Var;
        }
        M.h();
        s = M.s();
        if (s != null) {
            x2Var = new x2(qowVar, fVar, i, 1);
            s.d = x2Var;
        }
    }
}
