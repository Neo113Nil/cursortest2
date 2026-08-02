package xsna;

import android.content.Context;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.profile.design.compose.user.FriendsAndFollowersBlockData;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: UserProfileFriendsAndFollowersInfoBlocksBuilder.kt */
/* loaded from: classes5.dex */
public final class ppq0 {
    public final sdi a = new sdi();

    public static FriendsAndFollowersBlockData.a b(List list) {
        List list2 = list;
        return new FriendsAndFollowersBlockData.a(j5g.H0(list2, 0), j5g.H0(list2, 2), j5g.H0(list2, 3));
    }

    /* JADX WARN: Finally extract failed */
    public final FriendsAndFollowersBlockData a(Context context, int i, List<String> list, boolean z) {
        if (i == 0) {
            return null;
        }
        s8u0 s8u0Var = new s8u0(0);
        VkTypographyToken vkTypographyToken = VkTypographyToken.Headline2Medium;
        int h = s8u0Var.h(new uav0(vkTypographyToken));
        try {
            int i2 = s8u0Var.i(new klv0(vkTypographyToken, VkColorToken.TextPrimary));
            try {
                s8u0Var.e(String.valueOf(i));
                s3q0 s3q0Var = s3q0.a;
                s8u0Var.f(i2);
                s8u0Var.f(h);
                s8u0Var = new s8u0(0);
                VkTypographyToken vkTypographyToken2 = VkTypographyToken.FootnoteNormal;
                h = s8u0Var.h(new uav0(vkTypographyToken2));
                try {
                    i2 = s8u0Var.i(new klv0(vkTypographyToken2, VkColorToken.TextSecondary));
                    try {
                        s8u0Var.e(drm0.p0(context.getResources().getQuantityString(R.plurals.friends_quantity, i, "")).toString());
                        s8u0Var.f(i2);
                        s8u0Var.f(h);
                        return new FriendsAndFollowersBlockData(s8u0Var, s8u0Var, b(list), FriendsAndFollowersBlockData.BlockType.ALL_FRIENDS, z);
                    } finally {
                    }
                } finally {
                    s8u0Var.f(h);
                }
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
