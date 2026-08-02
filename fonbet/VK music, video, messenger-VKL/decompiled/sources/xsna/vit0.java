package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.libvideo.api.Subscription;

/* compiled from: VideoSubscriptionRepository.kt */
/* loaded from: classes2.dex */
public interface vit0 {
    void a(UserId userId);

    io.reactivex.rxjava3.core.q<Subscription> b(UserId userId);

    io.reactivex.rxjava3.internal.operators.completable.w c(UserId userId, VideoNotificationsStatus videoNotificationsStatus);

    io.reactivex.rxjava3.core.q<VideoNotificationsStatus> d(UserId userId);

    io.reactivex.rxjava3.core.q<? extends xc6> e(UserId userId);

    io.reactivex.rxjava3.internal.operators.observable.j1 f(UserId userId);
}
