package xsna;

import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoAlbumActionItem;
import com.vk.video.ui.upload.impl.videoviewer.presentation.compose.screen.IconViewState;
import xsna.jgt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class k77 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k77(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((com.vk.biometrics.lock.impl.presentation.base.mvi.pin.i) this.c).j((x77) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 1:
                mtk0 mtk0Var = (mtk0) this.c;
                s890 s890Var = (s890) this.d;
                jai jaiVar = (jai) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-20345758, intValue, -1, "androidx.compose.material.Button.<anonymous> (Button.kt:120)");
                    }
                    rvi.a(hfj.a.b(Float.valueOf(l5g.e(((l5g) mtk0Var.getValue()).a))), kai.c(-869936862, new iq8(0, s890Var, jaiVar), aVar), aVar, 56);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((jzj) this.c).h((vzj) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((l080) this.c).h((o080) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 4:
                ((Integer) obj2).getClass();
                kch0.b((IconViewState) this.c, (gzs) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                t0s0.a((VideoAlbumActionItem) this.c, (String) this.d, (gzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 6:
                m8t0 m8t0Var = (m8t0) this.c;
                ViewGroup viewGroup = (ViewGroup) this.d;
                ComposeView composeView = (ComposeView) this.e;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-311449990, intValue2, -1, "com.vk.video.profile.presentation.menu.VideoProfileMoreBottomSheetRedesign.show.<anonymous>.<anonymous> (VideoProfileMoreBottomSheetRedesign.kt:36)");
                    }
                    if (((Boolean) ((zak0) m8t0Var.b).getValue()).booleanValue()) {
                        aVar2.K(-1277244895);
                        boolean y = aVar2.y(m8t0Var) | aVar2.y(viewGroup) | aVar2.y(composeView);
                        Object x = aVar2.x();
                        if (y || x == a.C0011a.a) {
                            x = new defpackage.a0(m8t0Var, viewGroup, composeView, 7);
                            aVar2.R(x);
                        }
                        m8t0Var.a((gzs) x, aVar2, 0);
                    } else {
                        aVar2.K(-1278736088);
                    }
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((jgt0) this.c).a((jgt0.b) this.d, (gzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ k77(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
