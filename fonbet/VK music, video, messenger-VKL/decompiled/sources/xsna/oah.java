package xsna;

import android.content.Context;
import com.vk.pushes.NotificationUtils;
import xsna.dfq0;

/* compiled from: CommunityMessageNotification.kt */
/* loaded from: classes5.dex */
public final class oah extends dfq0 {
    public final NotificationUtils.Type A;
    public final dfq0.a z;

    public oah(Context context, dfq0.a aVar) {
        super(context, aVar, null);
        this.z = aVar;
        this.A = NotificationUtils.Type.CommunityMessages;
    }

    @Override // xsna.dfq0
    public final String toString() {
        return "CommunityMessageNotification(notify=" + this.z + ')';
    }

    @Override // com.vk.pushes.notifications.base.a
    public final NotificationUtils.Type w() {
        return this.A;
    }
}
