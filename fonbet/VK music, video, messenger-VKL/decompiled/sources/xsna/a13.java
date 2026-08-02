package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: AppActionNavigatorCallback.kt */
/* loaded from: classes5.dex */
public interface a13 {
    void a(FragmentActivity fragmentActivity, UserProfile userProfile, String str);

    void b(Context context, UserId userId);

    void c(FragmentActivity fragmentActivity);

    void d(FragmentActivity fragmentActivity, ExtendedUserProfile extendedUserProfile, boolean z);

    void e(Context context, UserId userId);

    void f(Context context, ExtendedUserProfile extendedUserProfile, String str);

    void g(FragmentActivity fragmentActivity, ExtendedUserProfile extendedUserProfile);

    void h(Context context, UserId userId);

    void i(FragmentActivity fragmentActivity, ExtendedUserProfile extendedUserProfile);

    void j(FragmentActivity fragmentActivity, String str, UserId userId, String str2);

    void k(FragmentActivity fragmentActivity, UserId userId, String str);
}
