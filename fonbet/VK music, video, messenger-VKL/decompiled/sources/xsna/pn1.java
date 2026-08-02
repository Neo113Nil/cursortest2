package xsna;

import xsna.jpl0;
import xsna.q630;
import xsna.zjq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class pn1 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pn1(Object obj, izs izsVar, int i, Object obj2) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = izsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                jpl0.a.d dVar = (jpl0.a.d) this.d;
                r820 r820Var = (r820) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1060314738, intValue, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.albums.<anonymous> (AlbumsItem.kt:56)");
                    }
                    apl0 apl0Var = dVar.a;
                    do1.c(0, aVar, apl0Var.d, this.c, r820Var, null, apl0Var.i);
                    if (a690.d(q630.a.a, 8, aVar, 6)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                zjq0.a.b bVar = (zjq0.a.b) this.d;
                siq0 siq0Var = (siq0) this.e;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-303314627, intValue2, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.UserEditProfileMviView.UserEditContent.<anonymous> (UserEditProfileMviView.kt:81)");
                    }
                    boolean booleanValue = ((Boolean) jk50.d(bVar.c, Boolean.FALSE, aVar2, 48).getValue()).booleanValue();
                    izs izsVar = this.c;
                    if (booleanValue) {
                        aVar2.K(565249925);
                        siq0Var.h(70, aVar2, kai.c(480814178, new t3g(siq0Var, bVar, izsVar), aVar2));
                        aVar2.j();
                    } else {
                        aVar2.K(565381396);
                        siq0Var.i(bVar, izsVar, null, aVar2, 4096);
                        aVar2.j();
                    }
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
}
