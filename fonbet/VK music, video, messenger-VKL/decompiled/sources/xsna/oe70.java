package xsna;

import android.content.Context;
import com.vk.api.generated.notifications.dto.NotificationsEditRedesignPushSettingResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingHintDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingOptionsDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingStatusDto;
import com.vk.api.generated.notifications.dto.NotificationsUnifiedNotificationDto;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.auth.validation.VkValidateRouterInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.pushes.NotificationUtils;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import xsna.cf70;
import xsna.if70;
import xsna.vzi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class oe70 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ oe70(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
        this.f = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto;
        NotificationsNotificationSettingHintDto notificationsNotificationSettingHintDto;
        NotificationsNotificationSettingHintDto d;
        NotificationsNotificationSettingHintDto d2;
        NotificationsUnifiedNotificationDto e;
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                NotificationsNotificationSettingOptionsDto notificationsNotificationSettingOptionsDto = (NotificationsNotificationSettingOptionsDto) obj4;
                qe70 qe70Var = (qe70) obj3;
                f4z f4zVar = qe70Var.o;
                jf70 jf70Var = (jf70) obj2;
                NotificationsEditRedesignPushSettingResponseDto notificationsEditRedesignPushSettingResponseDto = (NotificationsEditRedesignPushSettingResponseDto) obj;
                NotificationsNotificationSettingRedesignDto d3 = notificationsEditRedesignPushSettingResponseDto.d();
                NotificationsNotificationSettingOptionsDto j = d3 != null ? d3.j() : null;
                NotificationsNotificationSettingRedesignDto d4 = notificationsEditRedesignPushSettingResponseDto.d();
                if (d4 != null) {
                    NotificationsNotificationSettingRedesignDto d5 = notificationsEditRedesignPushSettingResponseDto.d();
                    if (d5 == null || (d = d5.d()) == null) {
                        notificationsNotificationSettingHintDto = null;
                    } else {
                        NotificationsNotificationSettingRedesignDto d6 = notificationsEditRedesignPushSettingResponseDto.d();
                        notificationsNotificationSettingHintDto = NotificationsNotificationSettingHintDto.a(d, (d6 == null || (d2 = d6.d()) == null || (e = d2.e()) == null) ? null : ci70.a(e));
                    }
                    if (notificationsNotificationSettingOptionsDto != null) {
                        j = notificationsNotificationSettingOptionsDto;
                    }
                    notificationsNotificationSettingRedesignDto = NotificationsNotificationSettingRedesignDto.a(d4, null, notificationsNotificationSettingHintDto, j, 175);
                } else {
                    notificationsNotificationSettingRedesignDto = null;
                }
                if (notificationsNotificationSettingRedesignDto != null) {
                    f4zVar.b(vzi0.c.a);
                    qe70Var.T(new cf70.f(notificationsNotificationSettingRedesignDto));
                    NotificationsNotificationSettingStatusDto g = notificationsNotificationSettingRedesignDto.g();
                    NotificationsNotificationSettingStatusDto.NotificationsNotificationSettingStatusEnumDto notificationsNotificationSettingStatusEnumDto = g instanceof NotificationsNotificationSettingStatusDto.NotificationsNotificationSettingStatusEnumDto ? (NotificationsNotificationSettingStatusDto.NotificationsNotificationSettingStatusEnumDto) g : null;
                    if (notificationsNotificationSettingStatusEnumDto != null && notificationsNotificationSettingStatusEnumDto.d() != null) {
                        qe70Var.n.b(new if70.c(notificationsNotificationSettingRedesignDto));
                    }
                    boolean z = this.c;
                    SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick(z ? MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick.Event.PUSH_ENABLED : MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick.Event.PUSH_DISABLED, MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick.Label.SELECTED_COMMUNITY_PUSHES, null, MobileOfficialAppsImStat$TypeImPushNotificationsSettingsClick.LabelType.ALL, 4, null), 2);
                    UiTracker uiTracker = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                    uzp0 uzp0Var = UiTracker.h;
                    uzp0Var.getClass();
                    new bjc(c, b, uzp0Var.a).q();
                    String str = jf70Var.d;
                    NotificationUtils.Type b2 = NotificationUtils.Type.b(str);
                    if (b2 == null) {
                        break;
                    } else {
                        Context context = e43.a;
                        if (context == null) {
                            context = null;
                        }
                        NotificationUtils.k(context, b2, z);
                        Context context2 = e43.a;
                        if (context2 == null) {
                            context2 = null;
                        }
                        NotificationUtils.m(context2, NotificationUtils.Type.b(str), z);
                        if (notificationsNotificationSettingOptionsDto == null) {
                            Context context3 = e43.a;
                            NotificationUtils.l(context3 != null ? context3 : null, NotificationUtils.Type.b(str), z);
                        }
                    }
                } else {
                    f4zVar.b(vzi0.a.a);
                }
                break;
            default:
                x3a0 x3a0Var = (x3a0) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                vgg vggVar = (vgg) obj;
                Throwable th = vggVar.a;
                par0.a.getClass();
                par0.d(th);
                boolean z2 = th instanceof VKApiExecutionException;
                if (z2 && f35.b((VKApiExecutionException) th)) {
                    sir0 sir0Var = sir0.a;
                    ctu0 ctu0Var = x3a0Var.y;
                    VkValidateRouterInfo.EnterSmsCode enterSmsCode = new VkValidateRouterInfo.EnterSmsCode(str2, false, this.c, null, str3, 8, null);
                    sir0Var.getClass();
                    ctu0Var.d(enterSmsCode, true);
                } else {
                    if (z2 && f35.d((VKApiExecutionException) th)) {
                        y3a0 y3a0Var = (y3a0) x3a0Var.a;
                        if (y3a0Var != null) {
                            Context context4 = x3a0Var.b;
                            com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
                            bVar.getClass();
                            com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.ALERT_KEYS_NOT_SUPPORTED, null, null, null, 30);
                            y3a0Var.U2(context4.getString(R.string.vk_passkey_not_supported_on_device), context4.getString(R.string.vk_passkey_try_another_device_or_restore), context4.getString(R.string.vk_auth_accessibility_close), new ef4(3, null), null, null, true, new v05(1, null), new k3(2, null));
                        }
                    } else if (vggVar.b() == ApiErrorViewType.CUSTOM) {
                        x3a0Var.u0(th);
                        s3q0 s3q0Var = s3q0.a;
                    } else {
                        vggVar.c();
                    }
                    x3a0Var.B.invoke(VkPhoneValidationErrorReason.API);
                }
                break;
        }
        return s3q0.a;
    }
}
