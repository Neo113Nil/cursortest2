package xsna;

import com.vk.core.compose.component.defaults.TabMode;
import com.vk.libvideo.design.compose.base.timeline.TimelineViewState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class hxo0 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ long c;
    public final /* synthetic */ q630 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hxo0(long j, q630 q630Var, zzs zzsVar, jai jaiVar) {
        this.c = j;
        this.d = q630Var;
        this.e = zzsVar;
        this.f = jaiVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        int i2 = 1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.timeline.a.b((mtk0) obj4, this.c, (TimelineViewState.d) obj3, this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                zzs zzsVar = (zzs) obj4;
                jai jaiVar = (jai) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-568095850, intValue, -1, "com.vk.core.compose.component.VkSecondaryTabRow.<anonymous> (VkSecondaryTabRow.kt:128)");
                    }
                    bpn0 bpn0Var = npv0.a;
                    TabMode tabMode = TabMode.Secondary;
                    lnx.c(this.c, this.d, false, npv0.f(tabMode), npv0.g(tabMode), npv0.i(tabMode), 0L, kai.c(443366034, new yiv0(zzsVar), aVar), joi.a, kai.c(-1269384, new fch0(i2, jaiVar), aVar), aVar, 918552576, 68);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ hxo0(mtk0 mtk0Var, long j, TimelineViewState.d dVar, q630 q630Var, int i) {
        this.e = mtk0Var;
        this.c = j;
        this.f = dVar;
        this.d = q630Var;
    }
}
