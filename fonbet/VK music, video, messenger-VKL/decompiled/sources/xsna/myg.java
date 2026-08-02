package xsna;

import androidx.compose.runtime.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class myg implements yzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ myg(izs izsVar, wh50 wh50Var, wh50 wh50Var2) {
        this.c = izsVar;
        this.d = wh50Var;
        this.e = wh50Var2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                mtk0 mtk0Var = (mtk0) this.d;
                mtk0 mtk0Var2 = (mtk0) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1172221626, intValue, -1, "com.vk.ecomm.reviews.impl.communities.createreview.presentation.view.CreateCommunityReviewContentView.<anonymous>.<anonymous> (CommunityCreateReviewContentView.kt:102)");
                }
                boolean booleanValue = ((Boolean) mtk0Var.getValue()).booleanValue();
                boolean booleanValue2 = ((Boolean) mtk0Var2.getValue()).booleanValue();
                izs izsVar = this.c;
                boolean J = aVar.J(izsVar);
                Object x = aVar.x();
                Object obj4 = a.C0011a.a;
                if (J || x == obj4) {
                    x = new nyg(izsVar, 0);
                    aVar.R(x);
                }
                gzs gzsVar = (gzs) x;
                boolean J2 = aVar.J(izsVar);
                Object x2 = aVar.x();
                if (J2 || x2 == obj4) {
                    x2 = new m87(izsVar, 2);
                    aVar.R(x2);
                }
                ahg0.a(booleanValue, booleanValue2, false, gzsVar, (gzs) x2, null, "sendReviewButton", aVar, 1573248);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
            default:
                dlv0 dlv0Var = (dlv0) this.d;
                f3b0 f3b0Var = (f3b0) this.e;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2106037074, intValue2, -1, "com.vk.music.stickyplayer.presentation.MusicContent.<anonymous>.<anonymous>.<anonymous> (MusicWithBottomPlayer.kt:282)");
                    }
                    d4b0.a(dlv0Var, f3b0Var.b().a, null, this.c, aVar2, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ myg(dlv0 dlv0Var, f3b0 f3b0Var, izs izsVar) {
        this.d = dlv0Var;
        this.e = f3b0Var;
        this.c = izsVar;
    }
}
