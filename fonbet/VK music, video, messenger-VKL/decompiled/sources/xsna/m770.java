package xsna;

import com.vk.api.generated.notifications.dto.NotificationsActionApiCallConfirmDto;
import com.vk.api.generated.notifications.dto.NotificationsActionDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationRedesignDto;
import com.vk.core.ui.tracking.UiTracker;
import xsna.ha70;

/* compiled from: NotificationActionMapper.kt */
/* loaded from: classes4.dex */
public final class m770 {
    public final gj70 a = new gj70();

    public final ha70 a(NotificationsActionDto notificationsActionDto, NotificationsNotificationRedesignDto notificationsNotificationRedesignDto, x970 x970Var, Boolean bool) {
        if (notificationsActionDto instanceof NotificationsActionDto.NotificationsActionUngroupDto) {
            return new ha70.k(((NotificationsActionDto.NotificationsActionUngroupDto) notificationsActionDto).d());
        }
        if (notificationsActionDto instanceof NotificationsActionDto.NotificationsActionEntityShowDto) {
            ha70 a = this.a.a(((NotificationsActionDto.NotificationsActionEntityShowDto) notificationsActionDto).d(), x970Var);
            return a == null ? ha70.y.a : a;
        }
        if (notificationsActionDto instanceof NotificationsActionDto.NotificationsActionApiCallDto) {
            NotificationsActionDto.NotificationsActionApiCallDto notificationsActionApiCallDto = (NotificationsActionDto.NotificationsActionApiCallDto) notificationsActionDto;
            ha70.f fVar = new ha70.f(notificationsNotificationRedesignDto.getId(), notificationsActionApiCallDto.e(), bool);
            NotificationsActionApiCallConfirmDto d = notificationsActionApiCallDto.d();
            return d == null ? fVar : new ha70.x(d.getTitle(), d.f(), d.e(), d.d(), fVar);
        }
        if (notificationsActionDto instanceof NotificationsActionDto.NotificationsActionLinkFollowDto) {
            String url = ((NotificationsActionDto.NotificationsActionLinkFollowDto) notificationsActionDto).getUrl();
            UiTracker uiTracker = UiTracker.a;
            return new ha70.l(url, UiTracker.d());
        }
        if (notificationsActionDto instanceof NotificationsActionDto.NotificationsActionOpenGroupNotificationsDto) {
            NotificationsActionDto.NotificationsActionOpenGroupNotificationsDto notificationsActionOpenGroupNotificationsDto = (NotificationsActionDto.NotificationsActionOpenGroupNotificationsDto) notificationsActionDto;
            return new ha70.h(notificationsActionOpenGroupNotificationsDto.getTitle(), notificationsActionOpenGroupNotificationsDto.d().b);
        }
        if (!(notificationsActionDto instanceof NotificationsActionDto.NotificationsActionOpenGroupCategoryNotificationsDto)) {
            return ha70.y.a;
        }
        NotificationsActionDto.NotificationsActionOpenGroupCategoryNotificationsDto notificationsActionOpenGroupCategoryNotificationsDto = (NotificationsActionDto.NotificationsActionOpenGroupCategoryNotificationsDto) notificationsActionDto;
        return new ha70.g(notificationsActionOpenGroupCategoryNotificationsDto.getTitle(), notificationsActionOpenGroupCategoryNotificationsDto.d(), notificationsActionOpenGroupCategoryNotificationsDto.e().b);
    }
}
