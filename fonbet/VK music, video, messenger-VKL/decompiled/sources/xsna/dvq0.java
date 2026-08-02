package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.UserProfile;
import com.vk.mvi.androidx.MviImplFragment;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: UserProfileUtil.kt */
/* loaded from: classes5.dex */
public interface dvq0 {
    boolean a(UserId userId);

    void b(String str);

    UserId c();

    boolean d(ExtendedUserProfile extendedUserProfile);

    ImageStatus e();

    boolean f();

    String g(ExtendedUserProfile extendedUserProfile);

    String getString(int i, Object... objArr);

    UserProfile h();

    long i();

    defpackage.f0 j(MviImplFragment mviImplFragment);

    boolean k(ExtendedUserProfile extendedUserProfile);

    void l(String str);

    boolean m();

    boolean n();
}
