package xsna;

import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import java.util.ArrayList;
import java.util.List;
import xsna.ca9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class dmi implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ dmi(byte b, int i) {
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
                        androidx.compose.runtime.b.f(669675615, intValue, -1, "com.vk.profile.user.impl.ui.adapter.holders.ComposableSingletons$UserProfileAdvertBannerViewHolderKt.lambda$669675615.<anonymous> (UserProfileAdvertBannerViewHolder.kt:282)");
                    }
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
                        androidx.compose.runtime.b.f(-641020822, intValue2, -1, "com.vk.core.compose.component.ComposableSingletons$VkScaffoldKt.lambda$-641020822.<anonymous> (VkScaffold.kt:54)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                return new cij0((List) obj2);
            case 3:
                Object obj3 = ((ArrayList) ((lca) obj2).y0()).get(((Integer) obj).intValue());
                UIBlockMusicPlaylist uIBlockMusicPlaylist = obj3 instanceof UIBlockMusicPlaylist ? (UIBlockMusicPlaylist) obj3 : null;
                if (uIBlockMusicPlaylist != null) {
                    return uIBlockMusicPlaylist.z;
                }
                return null;
            case 4:
                ((Integer) obj2).getClass();
                bf30.b(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 5:
                return Boolean.TRUE;
            case 6:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar3.K(-1208299143);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1208299143, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:184)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.V;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var;
            default:
                ca9 ca9Var = (ca9) obj;
                Boolean bool = (Boolean) obj2;
                if ((ca9Var instanceof ca9.c) && ((ca9.c) ca9Var).z && !bool.booleanValue()) {
                    r3 = true;
                }
                return new VoipActionsFeatureState.u(r3);
        }
    }
}
