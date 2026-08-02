package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.video.VideoNotificationsStatus;

/* compiled from: VideoProfileRepository.kt */
/* loaded from: classes6.dex */
public interface v8t0 {
    static /* synthetic */ io.reactivex.rxjava3.core.a f(v8t0 v8t0Var, UserId userId, AdminLeaveAction adminLeaveAction, String str, int i) {
        if ((i & 2) != 0) {
            adminLeaveAction = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        return v8t0Var.e(userId, adminLeaveAction, str, (i & 8) == 0 ? "VIDEO_CHANNEL" : null);
    }

    io.reactivex.rxjava3.internal.operators.single.s a(UserId userId, VideoNotificationsStatus videoNotificationsStatus);

    io.reactivex.rxjava3.internal.operators.single.y b(UserId userId);

    io.reactivex.rxjava3.internal.operators.single.s c();

    io.reactivex.rxjava3.internal.operators.single.s d(UserId userId);

    io.reactivex.rxjava3.internal.operators.single.s e(UserId userId, AdminLeaveAction adminLeaveAction, String str, String str2);

    io.reactivex.rxjava3.internal.operators.single.s g(UserId userId);
}
