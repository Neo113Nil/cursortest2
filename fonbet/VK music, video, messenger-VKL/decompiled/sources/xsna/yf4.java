package xsna;

import com.vk.libvideo.design.compose.base.preview.PreviewViewState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class yf4 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yf4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                dg4.b((r1m) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                gyj.a((zwj) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                w5l.b((s8r) this.c, (gzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                vzo.a((euc) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 4:
                g2m g2mVar = (g2m) this.c;
                g4u g4uVar = (g4u) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(62513018, intValue, -1, "com.vk.ecomm.market.good.ui.holder.description.GoodDescriptionCharacteristicsComposeViewHolder.onBind.<anonymous> (GoodDescriptionComposeViewHolders.kt:65)");
                    }
                    if (g2mVar == null) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        return s3q0.a;
                    }
                    rrv0.d(null, null, null, null, kai.c(-490561739, new fd1(3, g2mVar, g4uVar), aVar), aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                kj40.a((gzs) this.c, (gzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.preview.c.B((PreviewViewState.n) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 7:
                fnd0 fnd0Var = (fnd0) this.c;
                ml1 ml1Var = (ml1) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1830615273, intValue2, -1, "com.vk.ecomm.market.good.ui.topbar.ProductCardTopBarUiDelegate.bind.<anonymous> (ProductCardTopBarUiDelegate.kt:51)");
                    }
                    if (fnd0Var == null) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        return s3q0.a;
                    }
                    rrv0.d(null, null, null, null, kai.c(-1410560114, new gd1(5, fnd0Var, ml1Var), aVar2), aVar2, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                em50 em50Var = (em50) obj;
                oml0 oml0Var = (oml0) obj2;
                return oml0Var instanceof qqd0 ? em50Var.a((e64) this.c, oml0Var) : em50Var.a((e64) this.d, oml0Var);
        }
    }

    public /* synthetic */ yf4(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
