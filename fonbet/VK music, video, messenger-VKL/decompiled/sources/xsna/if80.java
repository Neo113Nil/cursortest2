package xsna;

import androidx.compose.runtime.a;
import xsna.psn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class if80 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ if80(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        boolean z;
        switch (this.b) {
            case 0:
                hh80 hh80Var = (hh80) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1364679161, intValue, -1, "com.vk.onboardingpromo.impl.ui.view.ButtonPagerComponent.<anonymous>.<anonymous> (OnboardingPromoDefaultSlides.kt:421)");
                    }
                    ff80 ff80Var = hh80Var.d.d;
                    yqv0.c(ff80Var.b, null, pf80.h(false, ff80Var.e, aVar), null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar, 0, 0, 16378);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                wh50 wh50Var = (wh50) this.c;
                col colVar = (col) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(colVar) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(900605012, intValue2, -1, "com.vk.design.demo.presentation.screens.RatingBarContent.Content.<anonymous>.<anonymous> (RatingBarContent.kt:85)");
                    }
                    if (((Number) wh50Var.getValue()).intValue() == 0) {
                        i = intValue2;
                        z = true;
                    } else {
                        i = intValue2;
                        z = false;
                    }
                    Object x = aVar2.x();
                    Object obj4 = a.C0011a.a;
                    if (x == obj4) {
                        x = new fyd0(wh50Var, 1);
                        aVar2.R(x);
                    }
                    int i2 = ((i << 21) & 29360128) | 48;
                    colVar.c(z, (gzs) x, null, psn0.a.C3529a.a("Compose", aVar2), null, null, null, aVar2, i2, 116);
                    boolean z2 = ((Number) wh50Var.getValue()).intValue() == 1;
                    Object x2 = aVar2.x();
                    if (x2 == obj4) {
                        x2 = new ixe0(0, wh50Var);
                        aVar2.R(x2);
                    }
                    colVar.c(z2, (gzs) x2, null, psn0.a.C3529a.a("View", aVar2), null, null, null, aVar2, i2, 116);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                izs izsVar = (izs) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2080809302, intValue3, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.screen.itemsClips.<anonymous> (SettingsScreen.kt:97)");
                    }
                    n3j0.d(0, aVar3, izsVar, null);
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
}
