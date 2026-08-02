package xsna;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkFriendsInfo;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.e21;
import xsna.ngv0;
import xsna.tgv0;
import xsna.tlo0;

/* compiled from: AdsSubscribeBannerRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class d21 {
    public final VkRichCell a;
    public final ConstraintLayout b;
    public final gzs<s3q0> c;
    public e21 d;

    public d21(VkRichCell vkRichCell, ConstraintLayout constraintLayout, gzs<s3q0> gzsVar) {
        this.a = vkRichCell;
        this.b = constraintLayout;
        this.c = gzsVar;
    }

    public static String a(int i, Resources resources, boolean z) {
        if (i < 1000) {
            return resources.getQuantityString(z ? R.plurals.community_friends : R.plurals.community_subscribers, i, Integer.valueOf(i));
        }
        boolean z2 = i >= 1000000;
        Integer valueOf = Integer.valueOf((z2 && z) ? R.string.community_friends_formatted_with_m : (!z2 || z) ? (z2 || !z) ? R.string.community_subscribers_formatted_with_k : R.string.community_friends_formatted_with_k : R.string.community_subscribers_formatted_with_m);
        int i2 = i >= 1000000 ? 1000000 : 1000;
        StringBuilder sb = new StringBuilder();
        sb.append(i / i2);
        sb.append(',');
        sb.append((i % i2) / (i2 / 10));
        Pair pair = new Pair(valueOf, sb.toString());
        return resources.getString(((Number) pair.i()).intValue(), pair.j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v8 */
    public final void b(e21 e21Var) {
        ConstraintLayout constraintLayout;
        VkRichCell vkRichCell;
        int i;
        List<String> list;
        ImageUrl b;
        if (e21Var.equals(this.d) || (constraintLayout = this.b) == null || (vkRichCell = this.a) == null) {
            return;
        }
        if (e21Var instanceof e21.b) {
            int a = e3m.a(R.dimen.clip_subscribe_banner_image_size, constraintLayout.getContext());
            e21.b bVar = (e21.b) e21Var;
            SdkFriendsInfo sdkFriendsInfo = bVar.e;
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(e3m.f(R.attr.vk_ui_text_contrast, vkRichCell.getContext()));
            VkCell.Left.a aVar = VkCell.Left.Companion;
            SdkImages sdkImages = bVar.d;
            ?? r11 = 0;
            r11 = 0;
            String str = (sdkImages == null || (b = sdkImages.b(a)) == null) ? null : b.b;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            vkRichCell.setLeft(VkCell.Left.a.a(aVar, new VkCell.Left.Main.a(new us5(str), VkCell.Left.Main.Size.Small)));
            String str3 = bVar.a;
            tlo0.a aVar2 = tlo0.Companion;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) str3);
            spannableStringBuilder.setSpan(foregroundColorSpan, 0, str3.length(), 0);
            SpannedString spannedString = new SpannedString(spannableStringBuilder);
            aVar2.getClass();
            tlo0.h hVar = new tlo0.h(spannedString);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            vgv0 vgv0Var = new vgv0(hVar, (ngv0.a) null, (ngv0) null, 1, 6);
            if (sdkFriendsInfo != null && (list = sdkFriendsInfo.c) != null) {
                List<String> list2 = list;
                r11 = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    itj0.d((String) it.next(), r11);
                }
            }
            if (r11 == 0) {
                r11 = EmptyList.b;
            }
            List list3 = r11;
            Resources resources = vkRichCell.getContext().getResources();
            if (sdkFriendsInfo == null || (i = sdkFriendsInfo.b) <= 0) {
                Integer num = bVar.b;
                if (num != null) {
                    str2 = a(num.intValue(), resources, false);
                }
            } else {
                str2 = a(i, resources, true);
            }
            tlo0.a aVar3 = tlo0.Companion;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) str2);
            spannableStringBuilder2.setSpan(foregroundColorSpan, 0, str2.length(), 0);
            SpannedString spannedString2 = new SpannedString(spannableStringBuilder2);
            aVar3.getClass();
            tlo0.h hVar2 = new tlo0.h(spannedString2);
            VkUserStack.Size size = VkUserStack.Size.Small;
            TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
            vkRichCell.setMiddle(ahn.v(vgv0Var, null, null, null, new tgv0.a(list3, null, hVar2, size, (sdkFriendsInfo == null || sdkFriendsInfo.b <= 0) ? VkUserStack.AvatarsPosition.Right : VkUserStack.AvatarsPosition.Left, 2), null, null, 494));
            vkRichCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, new VkCell.Right.a.b(new tlo0.f(bVar.c ? R.string.clips_open_community : R.string.clips_subscribe_community), this.c, VkButton.Appearance.Overlay, VkButton.Mode.Primary, null, null, null, null, 2032), null, null, null, 30));
            d3m.c(this.b, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            if (!(e21Var instanceof e21.a)) {
                throw new NoWhenBranchMatchedException();
            }
            d3m.e(constraintLayout, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        }
        this.d = e21Var;
    }
}
