package xsna;

import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsRepository;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import java.util.Optional;
import ru.ok.android.webrtc.media_options.MediaOptionState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class c80 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ c80(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ysg0.b.a(new htm0((StickerStockItem) obj, (StickerStockItem) obj2));
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(237628827, intValue, -1, "com.vk.core.compose.component.ComposableSingletons$VkScaffoldKt.lambda$237628827.<anonymous> (VkScaffold.kt:26)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                ((Float) obj).getClass();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                qcy<Object>[] qcyVarArr = StoriesComponentImpl.N;
                com.vk.stories.b.a.getClass();
                return com.vk.stories.b.e(booleanValue);
            case 3:
                return (VideoDiscoveryRecommendationsRepository.a) obj;
            case 4:
                Optional optional = (Optional) obj2;
                VideoFile videoFile = (VideoFile) ((Optional) obj).orElse(null);
                String r1 = videoFile != null ? videoFile.r1() : null;
                VideoFile videoFile2 = (VideoFile) optional.orElse(null);
                return Boolean.valueOf(epx.f(r1, videoFile2 != null ? videoFile2.r1() : null));
            case 5:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar2.K(1308328794);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1308328794, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:240)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.Z0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return frv0Var;
            default:
                return new VoipActionsFeatureState.o(((Boolean) obj).booleanValue(), (MediaOptionState) obj2);
        }
    }
}
