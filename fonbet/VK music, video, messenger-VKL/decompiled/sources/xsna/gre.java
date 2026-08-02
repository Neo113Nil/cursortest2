package xsna;

import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.dto.common.VideoFile;
import java.util.Collections;
import java.util.Optional;
import kotlin.Pair;
import xsna.r1k0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class gre implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ gre(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return new Pair((VideoFile) obj, (VideoFile) obj2);
            case 1:
                return new Pair((e8b0) obj, (xpe) obj2);
            case 2:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(220644748, intValue, -1, "com.vk.ecomm.reviews.impl.marketitem.replies.presentation.ComposableSingletons$MarketItemReviewRepliesFragmentKt.lambda$220644748.<anonymous> (MarketItemReviewRepliesFragment.kt:340)");
                    }
                    zfr0.d(SpinnerState.Loading, null, null, null, null, 0L, 0L, null, null, aVar, 6, 510);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 3:
                DateTimePickerState dateTimePickerState = (DateTimePickerState) obj2;
                return e43.l((DateTimePickerState.DialogState) ((zak0) dateTimePickerState.k).getValue(), dateTimePickerState.a.b());
            case 4:
                ((Integer) obj2).intValue();
                return new tfu(n34.a(1));
            case 5:
                return ((kwz) obj2).a.toLanguageTag();
            case 6:
                Integer num = (Integer) obj2;
                r1k0.a aVar2 = (r1k0.a) ((Optional) obj).orElse(null);
                if (aVar2 == null) {
                    return r1k0.b.a.a;
                }
                int intValue2 = num.intValue();
                if (aVar2 instanceof r1k0.a.AbstractC3589a.b) {
                    r1k0.a.AbstractC3589a.b bVar = (r1k0.a.AbstractC3589a.b) aVar2;
                    aVar2 = new r1k0.a.AbstractC3589a.b(bVar.b, bVar.c, intValue2);
                } else if (aVar2 instanceof r1k0.a.AbstractC3589a.C3590a) {
                    aVar2 = new r1k0.a.AbstractC3589a.C3590a(((r1k0.a.AbstractC3589a.C3590a) aVar2).b, intValue2);
                }
                return new r1k0.b.C3591b(Collections.singletonList(aVar2));
            default:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar3.K(8369625);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(8369625, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:151)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.o;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var;
        }
    }

    public /* synthetic */ gre(hht0 hht0Var) {
        this.b = 6;
    }
}
