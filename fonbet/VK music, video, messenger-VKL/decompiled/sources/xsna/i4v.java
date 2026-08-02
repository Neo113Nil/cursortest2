package xsna;

import com.vk.biometrics.lock.impl.service.HidePushContentService;
import com.vk.pushes.notifications.base.a;
import com.vkontakte.android.R;

/* compiled from: HidePushContentServiceNotification.kt */
/* loaded from: classes15.dex */
public final class i4v extends com.vk.pushes.notifications.base.a {
    public final String x;

    public i4v(HidePushContentService hidePushContentService) {
        super(hidePushContentService, new a.C1751a(dt.b("body", hidePushContentService.getString(R.string.bl_hide_push_notification_text))));
        this.x = "hide_push_content_service";
    }

    @Override // com.vk.pushes.notifications.base.a, xsna.ri6
    public final String c() {
        return this.x;
    }
}
