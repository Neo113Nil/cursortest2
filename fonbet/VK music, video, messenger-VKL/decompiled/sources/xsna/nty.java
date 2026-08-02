package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vkontakte.android.R;
import xsna.h0d0;

/* compiled from: LazyLayout.kt */
/* loaded from: classes11.dex */
public final class nty {
    public static final void a(gzs gzsVar, final q630 q630Var, final cuy cuyVar, final oty otyVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1055276397);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16) | (M.J(cuyVar) ? 256 : 128) | (M.J(otyVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1055276397, i2, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:111)");
            }
            final wh50 c = androidx.compose.runtime.k.c(gzsVar, M, i2 & 14);
            po40.c(6, M, kai.c(-933153643, new yzs() { // from class: xsna.kty
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ytm0 ytm0Var;
                    q630 g;
                    Object ltyVar;
                    j1h0 j1h0Var = (j1h0) obj;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-933153643, intValue, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:115)");
                    }
                    Object x = aVar2.x();
                    Object obj4 = a.C0011a.a;
                    if (x == obj4) {
                        x = new hty(j1h0Var, new n8s(1, c));
                        aVar2.R(x);
                    }
                    hty htyVar = (hty) x;
                    Object x2 = aVar2.x();
                    if (x2 == obj4) {
                        x2 = new ytm0(new ity(htyVar));
                        aVar2.R(x2);
                    }
                    ytm0 ytm0Var2 = (ytm0) x2;
                    cuy cuyVar2 = cuy.this;
                    if (cuyVar2 != null) {
                        aVar2.K(1743490539);
                        Object obj5 = cuyVar2.a;
                        if (obj5 == null) {
                            aVar2.K(887527095);
                            h0d0.a aVar3 = h0d0.a;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1141871251, 0, -1, "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:36)");
                            }
                            obj5 = h0d0.a;
                            if (obj5 != null) {
                                aVar2.K(1345554384);
                                aVar2.j();
                            } else {
                                aVar2.K(1345603457);
                                View view = (View) aVar2.r(AndroidCompositionLocals_androidKt.f);
                                boolean J = aVar2.J(view);
                                Object x3 = aVar2.x();
                                if (J || x3 == obj4) {
                                    Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                                    x3 = tag instanceof g0d0 ? (g0d0) tag : null;
                                    if (x3 == null) {
                                        x3 = new ub2(view);
                                        view.setTag(R.id.compose_prefetch_scheduler, x3);
                                    }
                                    aVar2.R(x3);
                                }
                                aVar2.j();
                                obj5 = (g0d0) x3;
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar2.K(887526010);
                        }
                        aVar2.j();
                        Object obj6 = obj5;
                        Object[] objArr = {cuyVar2, htyVar, ytm0Var2, obj6};
                        boolean J2 = aVar2.J(cuyVar2) | aVar2.y(htyVar) | aVar2.y(ytm0Var2) | aVar2.y(obj6);
                        Object x4 = aVar2.x();
                        if (J2 || x4 == obj4) {
                            ltyVar = new lty(cuyVar2, htyVar, ytm0Var2, obj6, 0);
                            ytm0Var = ytm0Var2;
                            aVar2.R(ltyVar);
                        } else {
                            ltyVar = x4;
                            ytm0Var = ytm0Var2;
                        }
                        bap.d(objArr, (izs) ltyVar, aVar2);
                        aVar2.j();
                    } else {
                        ytm0Var = ytm0Var2;
                        aVar2.K(1744076749);
                        aVar2.j();
                    }
                    int i3 = duy.a;
                    q630 q630Var2 = q630Var;
                    q630 q630Var3 = (cuyVar2 == null || (g = q630Var2.g(new opp0(cuyVar2))) == null) ? q630Var2 : g;
                    boolean J3 = aVar2.J(htyVar);
                    Object obj7 = otyVar;
                    boolean J4 = J3 | aVar2.J(obj7);
                    Object x5 = aVar2.x();
                    if (J4 || x5 == obj4) {
                        x5 = new hp7(4, htyVar, obj7);
                        aVar2.R(x5);
                    }
                    xtm0.b(ytm0Var, q630Var3, (wzs) x5, aVar2, 8, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uct(gzsVar, q630Var, cuyVar, otyVar, i);
        }
    }
}
