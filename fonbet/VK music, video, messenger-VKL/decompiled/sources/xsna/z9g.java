package xsna;

import com.vk.api.generated.market.dto.MarketMarketItemFullDto;
import com.vk.api.generated.video.dto.VideoGetAlbumsResponseDto;
import com.vk.api.generated.video.dto.VideoVideoAlbumDto;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.dto.common.VideoAlbum;
import com.vk.dto.common.data.VKList;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import com.vk.photo.editor.views.PointerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.d;
import kotlinx.serialization.KSerializer;
import xsna.ymq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class z9g implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ z9g(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = 1;
        switch (this.b) {
            case 0:
                String str = (String) obj;
                d.b bVar = (d.b) obj2;
                if (str.length() == 0) {
                    return bVar.toString();
                }
                return str + ", " + bVar;
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-223709836, intValue, -1, "com.vk.community.design.compose.image.ComposableSingletons$CommunityImageContentKt.lambda$-223709836.<anonymous> (CommunityImageContent.kt:33)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(866784315, intValue2, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda$866784315.<anonymous> (Scaffold.kt:181)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-880770723, intValue3, -1, "com.vk.profile.user.impl.ui.content.gifts.ComposableSingletons$UserProfileContentGiftsViewHolderKt.lambda$-880770723.<anonymous> (UserProfileContentGiftsViewHolder.kt:166)");
                    }
                    tth.a(null, fmi.a, aVar3, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 4:
                d0l d0lVar = (d0l) obj2;
                Long f = d0lVar.f();
                Long valueOf = Long.valueOf(d0lVar.a());
                k9x k9xVar = d0lVar.a;
                return e43.l(f, valueOf, Integer.valueOf(k9xVar.b), Integer.valueOf(k9xVar.c), Integer.valueOf(d0lVar.e()));
            case 5:
                return new ca7(null, null, j5g.u0((List) obj2, (List) obj), null, 11);
            case 6:
                return new Pair((n410) obj, (MarketMarketItemFullDto) obj2);
            case 7:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                ow90.e.getClass();
                return dx90.k((ScrollScreenType) obj, booleanValue);
            case 8:
                List list = (List) obj2;
                KSerializer n = s1v.n((dcy) obj, s1v.r(ini0.a, list, true), new ar40(list, i));
                if (n != null) {
                    return xn8.a(n);
                }
                return null;
            case 9:
                return new ymq0.a((VKList) ((it80) obj).a, null, null, (List) ((it80) obj2).a);
            case 10:
                List list2 = (List) obj;
                VideoGetAlbumsResponseDto videoGetAlbumsResponseDto = (VideoGetAlbumsResponseDto) obj2;
                List<VideoVideoAlbumDto> d = videoGetAlbumsResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (VideoVideoAlbumDto videoVideoAlbumDto : d) {
                    VideoAlbum videoAlbum = new VideoAlbum(videoVideoAlbumDto.getId() < 0);
                    videoAlbum.b = videoVideoAlbumDto.getId();
                    videoAlbum.c = videoVideoAlbumDto.getTitle();
                    videoAlbum.f = videoVideoAlbumDto.q();
                    arrayList.add(videoAlbum);
                }
                return new fns0(videoGetAlbumsResponseDto.getCount(), arrayList, list2);
            case 11:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar4.K(-159029414);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-159029414, intValue4, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:141)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar4.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.e;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                return frv0Var;
            default:
                ((PointerView) obj).setInnerCircleRadius(((Float) obj2).floatValue());
                return s3q0.a;
        }
    }
}
