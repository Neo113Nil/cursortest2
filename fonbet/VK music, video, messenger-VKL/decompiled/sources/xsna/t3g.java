package xsna;

import com.vk.catalog.mvi.block.impl.filtersbottomsheet.FilterBottomSheetState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import xsna.i8s0;
import xsna.zjq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class t3g implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t3g(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                w3g.c((x3g) this.d, (izs) this.c, (mtk0) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                sfr.a((FilterBottomSheetState) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            case 2:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.preview.c.h((PreviewViewState.e) this.d, (PreviewViewState.Size) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                siq0 siq0Var = (siq0) this.d;
                zjq0.a.b bVar = (zjq0.a.b) this.e;
                izs izsVar = (izs) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(480814178, intValue, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.UserEditProfileMviView.UserEditContent.<anonymous>.<anonymous> (UserEditProfileMviView.kt:84)");
                    }
                    siq0Var.i(bVar, izsVar, null, aVar, 4096);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((i8s0) this.d).c((i8s0.a) this.c, (jai) this.e, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ t3g(siq0 siq0Var, zjq0.a.b bVar, izs izsVar) {
        this.b = 3;
        this.d = siq0Var;
        this.e = bVar;
        this.c = izsVar;
    }
}
