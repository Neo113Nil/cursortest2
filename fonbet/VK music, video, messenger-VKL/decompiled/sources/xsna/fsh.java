package xsna;

import android.content.Context;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: CommunityProfilePhotosDelegateContract.kt */
/* loaded from: classes5.dex */
public interface fsh {
    default void a(Context context, ExtendedUserProfile extendedUserProfile, int i) {
        b(context, extendedUserProfile);
    }

    void b(Context context, ExtendedUserProfile extendedUserProfile);

    void c();

    default void dispose() {
    }
}
