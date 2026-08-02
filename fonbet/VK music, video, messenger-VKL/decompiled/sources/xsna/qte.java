package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.lgj0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class qte implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ qte(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return new Pair((ShortVideoGetPlaylistsResponseDto) obj, (List) obj2);
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-781471976, intValue, -1, "com.vk.core.compose.component.modal.ComposableSingletons$ModalKt.lambda$-781471976.<anonymous> (Modal.kt:293)");
                    }
                    a030.a(null, aVar, 0);
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
                        androidx.compose.runtime.b.f(488757687, intValue2, -1, "com.vk.profile.core.tabs.ui.articles.ComposableSingletons$ProfileContentArticlesViewHolderKt.lambda$488757687.<anonymous> (ProfileContentArticlesViewHolder.kt:100)");
                    }
                    rrv0.d(null, null, null, null, xji.b, aVar2, 24576, 15);
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
                        androidx.compose.runtime.b.f(-1701719443, intValue3, -1, "com.vk.tabbar.settings.impl.suggests.ComposableSingletons$TabbarSuggestTopPanelKt.lambda$-1701719443.<anonymous> (TabbarSuggestTopPanel.kt:164)");
                    }
                    q630 d = txj0.d(q630.a.a, 1.0f);
                    String N = d370.N(R.string.tabbar_onboarding_accessibility_close, 0, aVar3);
                    lg90 a = pg90.a(R.drawable.vk_icon_dismiss_24, 0, aVar3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    vqv.a(a, N, d, ylu0Var.getIcon().f, aVar3, 392, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 4:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2091969470, intValue4, -1, "com.vk.core.compose.component.ComposableSingletons$VkPictureKt.lambda$-2091969470.<anonymous> (VkPicture.kt:117)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 5:
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                aVar5.K(785304337);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(785304337, intValue5, -1, "com.vk.clips.viewer.impl.feed.view.notinterested.actions.HideThisAuthor.getAction.<anonymous> (HideThisAuthor.kt:23)");
                }
                qzu0.a.getClass();
                lg90 f0 = qzu0.f0(aVar5);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar5.j();
                return f0;
            case 6:
                return new Pair((JSONObject) obj, (String) obj2);
            case 7:
                ((Integer) obj).intValue();
                return s3q0.a;
            case 8:
                return Integer.valueOf(((ydp) obj2).a);
            case 9:
                Object obj3 = ((ArrayList) ((lca) obj2).y0()).get(((Integer) obj).intValue());
                UIBlockMusicTrack uIBlockMusicTrack = obj3 instanceof UIBlockMusicTrack ? (UIBlockMusicTrack) obj3 : null;
                if (uIBlockMusicTrack != null) {
                    return uIBlockMusicTrack.z;
                }
                return null;
            case 10:
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue6 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar6.K(443237564);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(443237564, intValue6, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:170)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar6.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.H;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar6.j();
                return frv0Var;
            default:
                int intValue7 = ((Integer) obj2).intValue();
                qfx0.d.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(((UserId) obj).b);
                sb.append('_');
                sb.append(intValue7);
                return (VideoFile) yfb.y(lgj0.a.c(Collections.singletonList(sb.toString()), (58 & 4) == 0 ? wfj0.b : null), new l3f(fgj0.a, 12)).u(0L);
        }
    }
}
