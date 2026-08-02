package xsna;

import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.profile.user.api.domain.actions.ProfileAction;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import kotlin.NoWhenBranchMatchedException;
import xsna.gs90;
import xsna.yvu;

/* compiled from: ProfileActions.kt */
/* loaded from: classes5.dex */
public final class ttd0 {
    public static final yvu a(ExtendedUserProfile extendedUserProfile, ytd0 ytd0Var, boolean z) {
        int i;
        WebImageSize e;
        String str;
        Integer num = ytd0Var.g;
        String str2 = ytd0Var.a;
        String str3 = ytd0Var.c;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        WebImage webImage = ytd0Var.e;
        if (webImage != null && (e = webImage.e(iah0.a(28))) != null && (str = e.b) != null) {
            str4 = str;
        }
        vv5 vv5Var = new vv5(str3, str4);
        String str5 = ytd0Var.b;
        if (epx.f(str5, ProfileAction.Type.OPEN_APP.h())) {
            gs90 gs90Var = ytd0Var.d;
            gs90.a aVar = gs90Var instanceof gs90.a ? (gs90.a) gs90Var : null;
            if (aVar != null) {
                return new yvu.g(str2, num != null ? num.intValue() : 0, z, aVar, vv5Var);
            }
        } else {
            if (epx.f(str5, ProfileAction.Type.STORY.h())) {
                return new yvu.k(str2, z);
            }
            if (epx.f(str5, ProfileAction.Type.POST.h())) {
                return new yvu.i(str2, z);
            }
            if (epx.f(str5, ProfileAction.Type.PHOTO.h())) {
                return new yvu.h(str2, z);
            }
            if (epx.f(str5, ProfileAction.Type.CLIP.h())) {
                return new yvu.b(str2, z);
            }
            if (epx.f(str5, ProfileAction.Type.CALL.h())) {
                return new yvu.a(str2, z);
            }
            if (epx.f(str5, ProfileAction.Type.GIFT.h())) {
                return new yvu.d(str2, z);
            }
            if (epx.f(str5, ProfileAction.Type.LIVE.h())) {
                return new yvu.e(str2, z);
            }
            if (epx.f(str5, ProfileAction.Type.FRIEND.h())) {
                int i2 = extendedUserProfile.a.v;
                int i3 = i2 != 1 ? i2 != 2 ? i2 != 3 ? R.drawable.vk_icon_user_add_outline_28 : R.drawable.vk_icon_user_added_outline_28 : R.drawable.vk_icon_user_incoming_outline_28 : R.drawable.vk_icon_user_outgoing_outline_28;
                if (i2 == 1) {
                    boolean z2 = extendedUserProfile.k0;
                    if (z2) {
                        i = R.string.vk_header_action_request_sent;
                    } else {
                        if (z2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R.string.profile_btn_subscribed;
                    }
                } else if (i2 == 2) {
                    i = R.string.vk_header_action_request_received;
                } else if (i2 != 3) {
                    boolean z3 = extendedUserProfile.A1;
                    i = R.string.vk_header_action_add_friend;
                    if (!z3 && !extendedUserProfile.k0) {
                        i = R.string.profile_subscribe;
                    }
                } else {
                    i = R.string.vk_header_action_friend;
                }
                return new yvu.c(str2, z, new ztu(i, i3));
            }
            if (epx.f(str5, ProfileAction.Type.PROFILE_QUESTION.h())) {
                return new yvu.j(str2, z, num != null ? num.intValue() : 0, vv5Var, new ztu(R.string.vk_header_action_question, R.drawable.vk_icon_question_outline_28));
            }
        }
        return null;
    }
}
