package xsna;

import com.vk.dto.donut.DonutLevel;
import xsna.nn20;
import xsna.vd70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class dr3 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dr3(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((fr3) this.d).i((mr3) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 1:
                qwo qwoVar = (qwo) this.d;
                izs<? super uvo, s3q0> izsVar = (izs) this.c;
                wh50 wh50Var = (wh50) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-312579196, intValue, -1, "com.vk.ads.easypromote.impl.presentation.EasyPromoteSettingsView.ThemedContent.<anonymous> (EasyPromoteSettingsView.kt:88)");
                    }
                    qwoVar.m((fwo) wh50Var.getValue(), izsVar, aVar, 512);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((nn20) this.d).d((nn20.a) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(439));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((be70) this.d).l((vd70.a) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 4:
                DonutLevel donutLevel = (DonutLevel) this.d;
                izs izsVar2 = (izs) this.c;
                mtk0 mtk0Var = (mtk0) this.e;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1880140699, intValue2, -1, "com.vk.donut.privacy.levels.levelsbottomsheet.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PrivacyEditDonutLevelsBottomSheetView.kt:133)");
                    }
                    kdd0.b(izsVar2, mtk0Var, donutLevel, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                erd0.a((f7u) this.d, (lbe) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ dr3(Object obj, izs izsVar, mtk0 mtk0Var, int i) {
        this.b = i;
        this.d = obj;
        this.c = izsVar;
        this.e = mtk0Var;
    }
}
