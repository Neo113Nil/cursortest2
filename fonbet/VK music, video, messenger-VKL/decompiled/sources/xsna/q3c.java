package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import xsna.d9k.b;
import xsna.g9k;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class q3c implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ xzs c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q3c(int i, Object obj, xzs xzsVar) {
        this.b = i;
        this.d = obj;
        this.c = xzsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CharSequence b;
        switch (this.b) {
            case 0:
                v8s v8sVar = (v8s) this.d;
                izs izsVar = (izs) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1996715854, intValue, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.CheckoutFormContent.<anonymous>.<anonymous>.<anonymous> (CheckoutContent.kt:171)");
                }
                x7i x7iVar = (x7i) j5g.a0(v8sVar.b);
                if (x7iVar == null) {
                    aVar.K(1135107660);
                } else {
                    aVar.K(1135107661);
                    x3c.b(x7iVar, izsVar, txj0.f(ahn.E(q630.a.a, "checkout_do_order"), 1.0f), aVar, 384);
                }
                aVar.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
            case 1:
                izs izsVar2 = (izs) this.c;
                d9k d9kVar = (d9k) this.d;
                fm50 fm50Var = (fm50) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2092044701, intValue2, -1, "com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.view.CreateMarketItemReviewView.ThemedContent.<anonymous>.<anonymous> (CreateMarketItemReviewView.kt:92)");
                }
                CharSequence charSequence = null;
                if (fm50Var.equals(g9k.c.a)) {
                    aVar2.K(410267040);
                    f9k.a(null, aVar2, 0);
                    aVar2.j();
                } else {
                    boolean z = fm50Var instanceof g9k.b;
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (z) {
                        aVar2.K(-166508047);
                        g9k.b bVar = (g9k.b) fm50Var;
                        wh50 a = jk50.a(bVar.a, aVar2, 0, 3);
                        wh50 a2 = jk50.a(bVar.b, aVar2, 0, 3);
                        tlo0 tlo0Var = (tlo0) a.getValue();
                        if (tlo0Var == null) {
                            aVar2.K(-166261412);
                            aVar2.j();
                            b = null;
                        } else {
                            aVar2.K(410278725);
                            b = tlo0Var.b(((Context) aVar2.r(AndroidCompositionLocals_androidKt.b)).getResources());
                            aVar2.j();
                        }
                        String valueOf = String.valueOf(b);
                        tlo0 tlo0Var2 = (tlo0) a2.getValue();
                        if (tlo0Var2 == null) {
                            aVar2.K(-166154276);
                        } else {
                            aVar2.K(410282181);
                            charSequence = tlo0Var2.b(((Context) aVar2.r(AndroidCompositionLocals_androidKt.b)).getResources());
                        }
                        aVar2.j();
                        String valueOf2 = String.valueOf(charSequence);
                        boolean J = aVar2.J(izsVar2);
                        Object x = aVar2.x();
                        if (J || x == c0012a) {
                            x = new dz7(izsVar2, 2);
                            aVar2.R(x);
                        }
                        n8k.a(0, aVar2, valueOf, valueOf2, (gzs) x, null);
                        aVar2.j();
                    } else if (fm50Var instanceof g9k.d) {
                        aVar2.K(-165864859);
                        g9k.d dVar = (g9k.d) fm50Var;
                        wh50 a3 = jk50.a(dVar.a, aVar2, 0, 3);
                        wh50 a4 = jk50.a(dVar.b, aVar2, 0, 3);
                        wh50 c = jk50.c(dVar.c, aVar2);
                        q630 d = txj0.d(q630.a.a, 1.0f);
                        String str = (String) a3.getValue();
                        String str2 = (String) a4.getValue();
                        boolean booleanValue = ((Boolean) c.getValue()).booleanValue();
                        boolean J2 = aVar2.J(izsVar2);
                        Object x2 = aVar2.x();
                        if (J2 || x2 == c0012a) {
                            x2 = new sv7(izsVar2, 3);
                            aVar2.R(x2);
                        }
                        gzs gzsVar = (gzs) x2;
                        boolean J3 = aVar2.J(izsVar2);
                        Object x3 = aVar2.x();
                        if (J3 || x3 == c0012a) {
                            x3 = new me1(izsVar2, 2);
                            aVar2.R(x3);
                        }
                        b9k.a(str, str2, d, booleanValue, gzsVar, (gzs) x3, aVar2, 384);
                        aVar2.j();
                    } else {
                        if (fm50Var instanceof g9k.a) {
                            aVar2.K(-165015583);
                            k8k.e(0, aVar2, (g9k.a) fm50Var, izsVar2, null);
                            s3q0 s3q0Var = s3q0.a;
                            boolean y = aVar2.y(d9kVar);
                            Object x4 = aVar2.x();
                            if (y || x4 == c0012a) {
                                x4 = d9kVar.new b(null);
                                aVar2.R(x4);
                            }
                            bap.g(s3q0Var, (wzs) x4, aVar2, 6);
                        } else {
                            aVar2.K(-170667131);
                        }
                        aVar2.j();
                    }
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
            default:
                m8t0 m8t0Var = (m8t0) this.d;
                gzs gzsVar2 = (gzs) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-584376982, intValue3, -1, "com.vk.video.profile.presentation.menu.VideoProfileMoreBottomSheetRedesign.Content.<anonymous>.<anonymous> (VideoProfileMoreBottomSheetRedesign.kt:72)");
                    }
                    boolean z2 = m8t0Var.a.e;
                    boolean y2 = aVar3.y(m8t0Var) | aVar3.J(gzsVar2);
                    Object x5 = aVar3.x();
                    a.C0011a.C0012a c0012a2 = a.C0011a.a;
                    if (y2 || x5 == c0012a2) {
                        x5 = new defpackage.f0(29, m8t0Var, gzsVar2);
                        aVar3.R(x5);
                    }
                    gzs gzsVar3 = (gzs) x5;
                    boolean y3 = aVar3.y(m8t0Var) | aVar3.J(gzsVar2);
                    Object x6 = aVar3.x();
                    if (y3 || x6 == c0012a2) {
                        x6 = new rs0(24, m8t0Var, gzsVar2);
                        aVar3.R(x6);
                    }
                    o8t0.a(z2, gzsVar3, (gzs) x6, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ q3c(izs izsVar, d9k d9kVar) {
        this.b = 1;
        this.c = izsVar;
        this.d = d9kVar;
    }
}
