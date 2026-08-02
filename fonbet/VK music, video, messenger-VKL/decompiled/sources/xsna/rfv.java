package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.core.compose.component.cell.content.RichCell$Middle;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class rfv implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rfv(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.b) {
            case 0:
                UIBlockList uIBlockList = (UIBlockList) this.c;
                int intValue = ((Integer) obj2).intValue();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= aVar.o(intValue) ? 32 : 16;
                }
                if (aVar.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1992285428, intValue2, -1, "com.vk.music.playlist.framework.presentation.catalog.HorizontalSlider.<anonymous>.<anonymous>.<anonymous> (HorizontalSlider.kt:41)");
                    }
                    ((epi) aVar.r(fpi.a)).a(uIBlockList.y.get(intValue), aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                RichCell$Middle.g gVar = (RichCell$Middle.g) this.c;
                q9g q9gVar = (q9g) obj;
                q630 q630Var = (q630) obj2;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                if ((intValue3 & 6) == 0) {
                    i = (aVar2.J(q9gVar) ? 4 : 2) | intValue3;
                } else {
                    i = intValue3;
                }
                if ((intValue3 & 48) == 0) {
                    i |= aVar2.J(q630Var) ? 32 : 16;
                }
                if (aVar2.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(191520266, i, -1, "com.vk.core.compose.component.cell.content.toSexyCellSubtitle.<anonymous> (SexyMiddleImpl.kt:184)");
                    }
                    gVar.b(q9gVar, q630Var, RichCell$Middle.Size.Medium, aVar2, (i & 14) | 384 | (i & 112));
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
