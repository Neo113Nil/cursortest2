package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkImage;
import com.vk.im.ui.views.InfoBarView;
import java.util.List;
import ru.ok.android.webrtc.utils.retry.RetryKt;
import xsna.aqb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class zpb implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ zpb(byte b, int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = 2;
        switch (this.b) {
            case 0:
                VkImage vkImage = (VkImage) obj;
                VkCell.f fVar = (VkCell.f) obj2;
                if ((fVar instanceof aqb.a ? (aqb.a) fVar : null) != null) {
                    vkImage.setImageResource(((aqb.a) fVar).a);
                }
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                v8c.h(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 2:
                UIBlockList uIBlockList = (UIBlockList) obj;
                kc4 kc4Var = new kc4(r2 ? (byte) 1 : (byte) 0, i);
                for (UIBlock uIBlock : uIBlockList.y) {
                    kc4Var.invoke(uIBlockList, uIBlock);
                    if (uIBlock instanceof UIBlockList) {
                        o19.w((UIBlockList) uIBlock, kc4Var);
                    }
                }
                return uIBlockList;
            case 3:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-831708473, intValue, -1, "com.vk.ecomm.reviews.impl.communities.reviews.presentation.ComposableSingletons$CommunityReviewsFragmentKt.lambda$-831708473.<anonymous> (CommunityReviewsFragment.kt:596)");
                    }
                    emi.e.g(6, aVar, fto0.f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 4:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1398478681, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.podcast.ComposableSingletons$KidsPodcastBigPlayerControlsKt.lambda$-1398478681.<anonymous> (KidsPodcastBigPlayerControls.kt:40)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 5:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(338121782, intValue3, -1, "com.vk.core.compose.component.ComposableSingletons$VkAccentTabRowKt.lambda$338121782.<anonymous> (VkAccentTabRow.kt:226)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 6:
                ((InfoBarView) obj).x.setDialogThemeBinder((kkm) obj2);
                return s3q0.a;
            case 7:
                return j5g.u0((List) obj2, (List) obj);
            case 8:
                return RetryKt.a((Throwable) obj, ((Integer) obj2).intValue());
            default:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar4.K(-2146214307);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2146214307, intValue4, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:248)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar4.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.h1;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                return frv0Var;
        }
    }

    public /* synthetic */ zpb(int i) {
        this.b = 1;
    }
}
