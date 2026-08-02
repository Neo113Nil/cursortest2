package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import java.util.List;

/* compiled from: FriendsBridge.kt */
/* loaded from: classes15.dex */
public interface zls {
    static /* synthetic */ boolean o(zls zlsVar, Context context, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        return zlsVar.b(context, null, z);
    }

    default boolean H0() {
        return false;
    }

    default boolean b(Context context, Window window, boolean z) {
        return false;
    }

    default void e(Context context) {
    }

    default void h(Context context) {
    }

    default void k(Context context) {
    }

    default void m(Context context) {
    }

    default void a(Context context, boolean z) {
    }

    default void f(Context context, String str) {
    }

    default void n(Context context, UserProfile userProfile) {
    }

    default void c(Activity activity, FragmentManager fragmentManager, Object obj) {
    }

    default void g(Context context, String str, List list) {
    }

    default void i(Context context, UserProfile userProfile, VoipCallSource voipCallSource) {
    }

    default void j(Context context, UserId userId, String str) {
    }

    default void d(Context context, VoipCallSource voipCallSource, UserId userId, boolean z) {
    }

    default void l(Context context, String str, String str2, long j) {
    }
}
