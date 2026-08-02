package xsna;

import android.widget.LinearLayout;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.a;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.view.components.divider.VkSeparator;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoAlbum;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import java.util.Collections;
import xsna.cut0;
import xsna.g3s;
import xsna.j490;
import xsna.l3s;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class a76 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ a76(byte b, int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                LinearLayout linearLayout = (LinearLayout) obj;
                rzt0 rzt0Var = (rzt0) obj2;
                if (rzt0Var instanceof com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.a) {
                    VkSeparator vkSeparator = (VkSeparator) linearLayout.findViewById(R.id.clip_badge_trailing_separator);
                    com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.a aVar = (com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.a) rzt0Var;
                    a.C0710a c0710a = aVar.c;
                    bwt0.n0(vkSeparator, c0710a.a);
                    vkSeparator.setDividerHeight(r2.getHeight());
                    vkSeparator.setBackgroundColor(cut0.a.a(c0710a.b, vkSeparator.getContext()));
                    VkText vkText = (VkText) linearLayout.findViewById(R.id.clip_badge_trailing_label);
                    vkText.setText(tlo0.b.a(aVar.a, vkText.getContext()));
                    vkText.setTextColor(cut0.a.a(aVar.b, vkText.getContext()));
                }
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1343667108, intValue, -1, "com.vk.music.stickyplayer.presentation.components.radio.ComposableSingletons$RadioBigPlayerControlsKt.lambda$-1343667108.<anonymous> (RadioBigPlayerControls.kt:34)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-564448197, intValue2, -1, "com.vk.core.compose.component.image.ComposableSingletons$VkResizablePictureKt.lambda$-564448197.<anonymous> (VkResizablePicture.kt:59)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 3:
                u1c0 u1c0Var = (u1c0) obj;
                NewsEntry newsEntry = (NewsEntry) obj2;
                if (!(newsEntry instanceof Post)) {
                    return s3q0.a;
                }
                Post post = (Post) newsEntry;
                u1c0Var.h = (ol60) j5g.a0(Collections.singletonList(new wvl(post, post.fc(), post.isReported())));
                return s3q0.a;
            case 4:
                k4s k4sVar = (k4s) obj;
                k4s k4sVar2 = (k4s) obj2;
                return new l3s.d.b(new g3s.a(k4sVar.a, k4sVar2.a, k4sVar.b, k4sVar2.b));
            case 5:
                return new o5t0((VideoAlbum) obj, (UserProfile) obj2);
            case 6:
                return Double.valueOf(((Double) obj2).doubleValue() + ((Double) obj).doubleValue());
            case 7:
                return new j490.a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            case 8:
                ((Integer) obj2).getClass();
                nml0.a(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            default:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar4.K(1698988576);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1698988576, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:177)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar4.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.O;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                return frv0Var;
        }
    }

    public /* synthetic */ a76(int i) {
        this.b = 8;
    }
}
