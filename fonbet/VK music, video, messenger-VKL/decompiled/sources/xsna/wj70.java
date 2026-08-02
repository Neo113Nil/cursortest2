package xsna;

import android.content.Context;
import com.vk.libvideo.api.NotificationsPermission;

/* compiled from: NotificationsPermissionImpl.kt */
/* loaded from: classes14.dex */
public final class wj70 implements NotificationsPermission {
    public final z970 a;

    public wj70(z970 z970Var) {
        this.a = z970Var;
    }

    @Override // com.vk.libvideo.api.NotificationsPermission
    public final io.reactivex.rxjava3.internal.operators.completable.c0 a(final Context context) {
        return new io.reactivex.rxjava3.internal.operators.completable.c0(this.a.a(), new io.reactivex.rxjava3.functions.n() { // from class: xsna.vj70
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                wj70.this.getClass();
                return anj.a(context, "android.permission.POST_NOTIFICATIONS") == 0 ? NotificationsPermission.Result.GRANTED : NotificationsPermission.Result.DENIED;
            }
        }, null);
    }
}
