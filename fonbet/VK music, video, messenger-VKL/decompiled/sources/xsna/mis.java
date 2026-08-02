package xsna;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.PhotoStackView;
import com.vk.dto.common.MutualInfo;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.user.RequestUserProfile;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import org.chromium.base.TimeUtils;

/* compiled from: FriendRequestBindDelegate.kt */
/* loaded from: classes16.dex */
public class mis {
    public static void a(RequestUserProfile requestUserProfile, View view, PhotoStackView photoStackView, TextView textView) {
        String str;
        Integer num;
        UserProfile userProfile;
        UserProfile[] userProfileArr = requestUserProfile.j0;
        if (userProfileArr == null || userProfileArr.length == 0) {
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        if (view != null) {
            view.setVisibility(0);
        }
        UserProfile[] userProfileArr2 = requestUserProfile.j0;
        int min = Math.min(userProfileArr2 != null ? userProfileArr2.length : 0, 3);
        photoStackView.setCount(min);
        for (int i = 0; i < min; i++) {
            UserProfile[] userProfileArr3 = requestUserProfile.j0;
            if (userProfileArr3 != null && (userProfile = (UserProfile) rl3.S(i, userProfileArr3)) != null) {
                photoStackView.h(i, userProfile.o(16));
            }
        }
        if (textView != null) {
            Context context = textView.getContext();
            if (context != null) {
                MutualInfo mutualInfo = requestUserProfile.d0;
                str = enj.f(R.plurals.friends_catalog_mutual_friends, (mutualInfo == null || (num = mutualInfo.b) == null) ? requestUserProfile.k0 : num.intValue(), context);
            } else {
                str = null;
            }
            textView.setText(str);
        }
    }

    public static void b(RequestUserProfile requestUserProfile, hjs hjsVar, gzs gzsVar, gzs gzsVar2, gzs gzsVar3) {
        Boolean bool = requestUserProfile.i0;
        if (epx.f(bool, Boolean.TRUE)) {
            gzsVar.invoke();
        } else if (epx.f(bool, Boolean.FALSE)) {
            gzsVar2.invoke();
        } else {
            gzsVar3.invoke();
        }
        hjsVar.k(requestUserProfile);
    }

    public static void c(Context context, RequestUserProfile requestUserProfile, ImageView imageView) {
        VerifyInfo verifyInfo = requestUserProfile.B;
        if (!verifyInfo.Cb()) {
            f4m.j(imageView);
        } else {
            imageView.setVisibility(0);
            imageView.setImageDrawable(VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, context, null, 28));
        }
    }

    public static void d(RequestUserProfile requestUserProfile, String str) {
        int a = pvo0.a();
        String str2 = "friend_recomm_view:" + requestUserProfile.c + ':' + str + ':' + requestUserProfile.J;
        if (com.vkontakte.android.data.b.i(str2)) {
            return;
        }
        String str3 = requestUserProfile.c + '|' + a + "||" + str + "||" + requestUserProfile.J;
        b.d dVar = new b.d("show_user_rec");
        dVar.b = true;
        dVar.c = true;
        dVar.b(str3, "user_ids");
        dVar.e();
        com.vkontakte.android.data.b.e(TimeUtils.MILLISECONDS_PER_DAY, str2);
    }
}
