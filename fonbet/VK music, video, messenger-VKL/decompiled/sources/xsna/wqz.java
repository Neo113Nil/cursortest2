package xsna;

import androidx.compose.runtime.a;
import xsna.kdh0;
import xsna.n610;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class wqz implements yzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wqz(izs izsVar, q510 q510Var) {
        this.c = izsVar;
        this.d = q510Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                kdh0.a aVar = (kdh0.a) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1792686187, intValue, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.screen.middleSettingsItems.<anonymous> (Loaded.kt:210)");
                    }
                    uzi0 uzi0Var = aVar.m;
                    izs izsVar = this.c;
                    boolean J = aVar2.J(izsVar);
                    Object x = aVar2.x();
                    Object obj4 = a.C0011a.a;
                    if (J || x == obj4) {
                        x = new gy7(izsVar, 3);
                        aVar2.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    q630 E = ahn.E(q630.a.a, "LoadedTags.PUBLICATION_DATE");
                    boolean J2 = aVar2.J(izsVar);
                    Object x2 = aVar2.x();
                    if (J2 || x2 == obj4) {
                        x2 = new j97(izsVar, 4);
                        aVar2.R(x2);
                    }
                    tzi0.a(uzi0Var, gzsVar, E, (gzs) x2, aVar2, 384, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                q510 q510Var = (q510) this.d;
                fm50 fm50Var = (fm50) obj;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1275857437, intValue2, -1, "com.vk.ecomm.reviews.impl.itemsforreview.presentation.view.MarketItemsForReviewComposeScreen.ThemedContent.<anonymous>.<anonymous> (MarketItemsForReviewComposeScreen.kt:63)");
                }
                if (fm50Var instanceof n610.d) {
                    aVar3.K(1391787749);
                    p510.a(null, aVar3, 0);
                    aVar3.j();
                } else {
                    boolean z = fm50Var instanceof n610.c;
                    izs izsVar2 = this.c;
                    if (z) {
                        aVar3.K(1391943989);
                        boolean J3 = aVar3.J(izsVar2);
                        Object x3 = aVar3.x();
                        if (J3 || x3 == a.C0011a.a) {
                            x3 = new h97(izsVar2, 4);
                            aVar3.R(x3);
                        }
                        n510.a(0, aVar3, (gzs) x3, null);
                        aVar3.j();
                    } else if (fm50Var instanceof n610.b) {
                        aVar3.K(1392204296);
                        l510.a(null, aVar3, 0);
                        aVar3.j();
                    } else {
                        if (fm50Var instanceof n610.a) {
                            aVar3.K(1392363884);
                            k510.a(((wow) jk50.c(((n610.a) fm50Var).b, aVar3).getValue()).b, izsVar2, q510Var.g, null, aVar3, 0);
                        } else {
                            aVar3.K(1389037119);
                        }
                        aVar3.j();
                    }
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ wqz(kdh0.a aVar, izs izsVar) {
        this.d = aVar;
        this.c = izsVar;
    }
}
