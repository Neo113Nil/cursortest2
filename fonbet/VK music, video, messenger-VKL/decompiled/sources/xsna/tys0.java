package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoNotificationsStatus;
import kotlin.Pair;

/* compiled from: VideoNotificationsSubscriptionBus.kt */
/* loaded from: classes17.dex */
public final class tys0 {
    public static final io.reactivex.rxjava3.subjects.f<Pair<UserId, VideoNotificationsStatus>> a = new io.reactivex.rxjava3.subjects.f<>();

    public static io.reactivex.rxjava3.internal.operators.observable.j1 a(UserId userId) {
        r2v r2vVar = new r2v(new sys0(userId, 0), 21);
        io.reactivex.rxjava3.subjects.f<Pair<UserId, VideoNotificationsStatus>> fVar = a;
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, r2vVar).U(new or20(new d7l0(13), 17));
    }
}
