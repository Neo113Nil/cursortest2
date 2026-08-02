package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingOptionsItemDto;
import xsna.le70;

/* compiled from: NotificationSettingList.kt */
/* loaded from: classes5.dex */
public final class xe70 implements izs<NotificationsNotificationSettingOptionsItemDto, s3q0> {
    public final /* synthetic */ izs<le70, s3q0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public xe70(izs<? super le70, s3q0> izsVar) {
        this.b = izsVar;
    }

    @Override // xsna.izs
    public final s3q0 invoke(NotificationsNotificationSettingOptionsItemDto notificationsNotificationSettingOptionsItemDto) {
        this.b.invoke(new le70.b(notificationsNotificationSettingOptionsItemDto));
        return s3q0.a;
    }
}
