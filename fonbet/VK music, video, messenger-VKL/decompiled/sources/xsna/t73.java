package xsna;

import com.vk.di.component.DiScopedComponent;
import com.vk.settings.api.di.NotificationsSettingsComponent;
import com.vk.settings.impl.di.component.RedesignNotificationsSettingsComponent;

/* compiled from: AppNotificationSettingsComponent.kt */
/* loaded from: classes11.dex */
public final class t73 implements c8m<NotificationsSettingsComponent, pwj0> {
    @Override // xsna.c8m
    public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
        return new RedesignNotificationsSettingsComponent();
    }
}
