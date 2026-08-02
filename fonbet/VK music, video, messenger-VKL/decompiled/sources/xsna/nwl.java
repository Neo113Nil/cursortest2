package xsna;

import androidx.compose.runtime.a;
import com.vk.libvideo.design.compose.base.timeline.TimelineViewState;
import xsna.kdh0;
import xsna.kyl;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class nwl implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nwl(int i, Object obj, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                kyl.e eVar = (kyl.e) this.d;
                izs izsVar = (izs) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-785351220, intValue, -1, "com.vk.ecomm.cart.impl.points_map.ui.compose.DeliveryPointsBottomFixedContent.<anonymous> (DeliveryPointsBottomFixedContent.kt:44)");
                }
                boolean J = aVar.J(eVar) | aVar.J(izsVar);
                Object x = aVar.x();
                if (J || x == a.C0011a.a) {
                    x = new fg1(9, eVar, izsVar);
                    aVar.R(x);
                }
                gzs gzsVar = (gzs) x;
                q630 f = txj0.f(q630.a.a, 1.0f);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pwl.b(0, aVar, gzsVar, ahn.E(s200.D(hr80.m(f, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a), 12), "delivery_points_map_delivery_here"));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
            case 1:
                kdh0.a aVar2 = (kdh0.a) this.d;
                izs izsVar2 = (izs) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-656611704, intValue2, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.screen.upperSettingsItems.<anonymous> (Loaded.kt:172)");
                    }
                    uzi0 uzi0Var = aVar2.j;
                    boolean J2 = aVar3.J(izsVar2);
                    Object x2 = aVar3.x();
                    if (J2 || x2 == a.C0011a.a) {
                        x2 = new u78(izsVar2, 2);
                        aVar3.R(x2);
                    }
                    tzi0.a(uzi0Var, (gzs) x2, ahn.E(q630.a.a, "LoadedTags.ALBUMS"), null, aVar3, 384, 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            default:
                mtk0 mtk0Var = (mtk0) this.d;
                TimelineViewState timelineViewState = (TimelineViewState) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-289353398, intValue3, -1, "com.vk.libvideo.design.compose.base.timeline.TimelineView.<anonymous> (TimelineView.kt:90)");
                }
                com.vk.libvideo.design.compose.base.timeline.a.b(mtk0Var, timelineViewState.c, timelineViewState.h, null, aVar4, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
        }
        return s3q0.a;
    }
}
