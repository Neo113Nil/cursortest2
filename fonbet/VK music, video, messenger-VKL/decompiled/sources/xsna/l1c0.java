package xsna;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.newsfeed.common.presentation.model.items.CoownershipStatusUiDto;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: PostCoownersInviteBannerTransformer.kt */
/* loaded from: classes4.dex */
public final class l1c0 implements gn60<Post, wm60> {
    public final CoownershipStatusUiDto b;
    public final List<NewsfeedCoowners.CoownerRequest> c;

    /* compiled from: PostCoownersInviteBannerTransformer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoownershipStatusUiDto.values().length];
            try {
                iArr[CoownershipStatusUiDto.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoownershipStatusUiDto.Approved.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoownershipStatusUiDto.Rejected.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoownershipStatusUiDto.Closed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public l1c0(CoownershipStatusUiDto coownershipStatusUiDto, List<NewsfeedCoowners.CoownerRequest> list) {
        this.b = coownershipStatusUiDto;
        this.c = list;
    }

    public static SpannableString a(String str, String str2) {
        int K = drm0.K(0, 6, str, str2, false);
        SpannableString spannableString = new SpannableString(str);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        spannableString.setSpan(new TextAppearanceSpan(context, R.style.VkUiTypography_SubheadMedium), K, str2.length() + K, 18);
        return spannableString;
    }

    public static SpannableString b(String str, String str2, String str3) {
        int K = drm0.K(0, 6, str, str2, false);
        int K2 = drm0.K(0, 6, str, str3, false);
        SpannableString spannableString = new SpannableString(str);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        spannableString.setSpan(new TextAppearanceSpan(context, R.style.VkUiTypography_SubheadMedium), K, str2.length() + K, 18);
        Context context2 = e43.a;
        spannableString.setSpan(new TextAppearanceSpan(context2 != null ? context2 : null, R.style.VkUiTypography_SubheadMedium), K2, str3.length() + K2, 18);
        return spannableString;
    }

    public final List c(Post post) {
        List<NewsfeedCoowners.CoownerRequest> list;
        NewsfeedCoowners newsfeedCoowners = post.f0;
        int[] iArr = a.$EnumSwitchMapping$0;
        CoownershipStatusUiDto coownershipStatusUiDto = this.b;
        int i = iArr[coownershipStatusUiDto.ordinal()];
        if (i == 1) {
            list = newsfeedCoowners != null ? newsfeedCoowners.g : null;
        } else {
            if (i != 2 && i != 3 && i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            list = this.c;
        }
        NewsfeedCoowners.CoownerRequest coownerRequest = list != null ? (NewsfeedCoowners.CoownerRequest) j5g.a0(list) : null;
        if (newsfeedCoowners != null && coownerRequest != null) {
            Owner owner = coownerRequest.c;
            if (coownershipStatusUiDto != CoownershipStatusUiDto.Closed) {
                Owner owner2 = coownerRequest.b;
                String str = owner2.c;
                String str2 = str == null ? "" : str;
                String str3 = owner.c;
                String str4 = str3 != null ? str3 : "";
                return Collections.singletonList(new m1c0(post, owner2, owner, (fkq0.b(owner2.b) && fkq0.d(owner.b)) ? a(y8g0.f(R.string.coowners_group_invites_user_title, str2), str2) : (fkq0.d(owner2.b) && fkq0.b(owner.b)) ? b(y8g0.f(R.string.coowners_user_invites_group_title, str2, str4), str2, str4) : (fkq0.b(owner2.b) && fkq0.b(owner.b)) ? b(y8g0.f(R.string.coowners_group_invites_group_title, str2, str4), str2, str4) : a(y8g0.f(R.string.coowners_user_invites_user_title, str2), str2), fkq0.d(owner.b) ? y8g0.e(R.string.coowners_invite_accepted_user_title) : y8g0.e(R.string.coowners_invite_accepted_group_title), fkq0.d(owner.b) ? y8g0.e(R.string.coowners_invite_accepted_user_subtitle) : y8g0.e(R.string.coowners_invite_accepted_group_subtitle), str, coownerRequest.d, this.b, 0));
            }
        }
        return EmptyList.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return c((Post) pair);
    }
}
