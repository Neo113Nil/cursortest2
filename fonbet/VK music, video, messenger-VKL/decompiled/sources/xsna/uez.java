package xsna;

import android.view.View;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class uez implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uez(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                ((Integer) obj3).intValue();
                float f = ListGroupCallView.o0;
                ((ListGroupCallView) obj4).Y4((View) obj);
                break;
            case 1:
                hh80 hh80Var = (hh80) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(318800953, intValue, -1, "com.vk.onboardingpromo.impl.ui.view.ButtonPagerComponent.<anonymous>.<anonymous> (OnboardingPromoFullscreenSlides.kt:425)");
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
            default:
                wh50 wh50Var = (wh50) obj4;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1135569942, intValue2, -1, "com.vk.libvideo.design.compose.base.preview.PreviewTopText.<anonymous> (PreviewView.kt:796)");
                }
                yqv0.c((String) wh50Var.getValue(), null, wlb0.h(aVar2).getText().d, null, wlb0.k(aVar2).c(aVar2), 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar2).s0, aVar2, 0, 0, 8170);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
        }
        return s3q0.a;
    }
}
