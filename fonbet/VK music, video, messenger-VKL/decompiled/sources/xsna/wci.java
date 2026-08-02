package xsna;

import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.core.compose.generated.VkTypographyToken;
import java.util.ArrayList;
import xsna.g3s;
import xsna.l3s;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class wci implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ wci(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1988242525, intValue, -1, "com.vk.clips.design.compose.description.ComposableSingletons$ClipsEditDescriptionViewKt.lambda$1988242525.<anonymous> (ClipsEditDescriptionView.kt:168)");
                    }
                    ijv0.c(SeparatorDpi.At2x, SeparatorAppearance.PrimaryAlpha, q630.a.a, aVar, 438, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-603961998, intValue2, -1, "com.vk.profile.core.tabs.ui.articles.ComposableSingletons$ProfileContentArticlesViewHolderKt.lambda$-603961998.<anonymous> (ProfileContentArticlesViewHolder.kt:101)");
                    }
                    tth.a(null, xji.a, aVar2, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1168689798, intValue3, -1, "com.vk.core.compose.component.ComposableSingletons$VkPictureKt.lambda$1168689798.<anonymous> (VkPicture.kt:82)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 3:
                return (c4o) obj;
            case 4:
                k4s k4sVar = (k4s) obj;
                k4s k4sVar2 = (k4s) obj2;
                return new l3s.f.b(new g3s.a(k4sVar.a, k4sVar2.a, k4sVar.b, k4sVar2.b));
            case 5:
                Object obj3 = ((ArrayList) ((lca) obj2).y0()).get(((Integer) obj).intValue());
                UIBlockMusicPlaylist uIBlockMusicPlaylist = obj3 instanceof UIBlockMusicPlaylist ? (UIBlockMusicPlaylist) obj3 : null;
                if (uIBlockMusicPlaylist != null) {
                    return uIBlockMusicPlaylist.z;
                }
                return null;
            default:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar4.K(858564381);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(858564381, intValue4, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:169)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar4.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.G;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                return frv0Var;
        }
    }
}
