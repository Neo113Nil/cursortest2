package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.video.profile.presentation.VideoProfileWrapperFragment;

/* compiled from: VideoProfileNavigator.kt */
/* loaded from: classes2.dex */
public interface p8t0 {
    VideoProfileWrapperFragment.a b(UserId userId);

    default void a(Context context, UserId userId) {
    }
}
