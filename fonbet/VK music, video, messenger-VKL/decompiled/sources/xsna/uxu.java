package xsna;

import android.content.Context;
import com.vk.api.generated.notifications.dto.NotificationsEditRedesignSettingsSectionResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingHintDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingsSectionRedesignDto;
import com.vk.api.generated.notifications.dto.NotificationsUnifiedNotificationDto;
import com.vk.dto.common.data.VKList;
import com.vk.pushes.NotificationUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.nh70;
import xsna.vzi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class uxu implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uxu(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        NotificationsNotificationSettingHintDto notificationsNotificationSettingHintDto;
        NotificationsUnifiedNotificationDto e;
        switch (this.b) {
            case 0:
                ((wxu) this.d).x((VKList) obj, this.c);
                break;
            default:
                hg70 hg70Var = (hg70) this.d;
                f4z f4zVar = hg70Var.q;
                NotificationsEditRedesignSettingsSectionResponseDto notificationsEditRedesignSettingsSectionResponseDto = (NotificationsEditRedesignSettingsSectionResponseDto) obj;
                NotificationsNotificationSettingsSectionRedesignDto d = notificationsEditRedesignSettingsSectionResponseDto != null ? notificationsEditRedesignSettingsSectionResponseDto.d() : null;
                if (d != null) {
                    List<NotificationsNotificationSettingRedesignDto> e2 = d.e();
                    ArrayList arrayList = new ArrayList(c5g.u(e2, 10));
                    for (NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto : e2) {
                        NotificationsNotificationSettingHintDto d2 = notificationsNotificationSettingRedesignDto.d();
                        if (d2 != null) {
                            NotificationsNotificationSettingHintDto d3 = notificationsNotificationSettingRedesignDto.d();
                            notificationsNotificationSettingHintDto = NotificationsNotificationSettingHintDto.a(d2, (d3 == null || (e = d3.e()) == null) ? null : ci70.a(e));
                        } else {
                            notificationsNotificationSettingHintDto = null;
                        }
                        arrayList.add(NotificationsNotificationSettingRedesignDto.a(notificationsNotificationSettingRedesignDto, null, notificationsNotificationSettingHintDto, null, 239));
                    }
                    NotificationsNotificationSettingsSectionRedesignDto a = NotificationsNotificationSettingsSectionRedesignDto.a(d, arrayList);
                    f4zVar.b(vzi0.c.a);
                    Iterator<T> it = a.e().iterator();
                    while (it.hasNext()) {
                        NotificationUtils.Type b = NotificationUtils.Type.b(((NotificationsNotificationSettingRedesignDto) it.next()).getId());
                        if (b != null) {
                            Context context = e43.a;
                            if (context == null) {
                                context = null;
                            }
                            NotificationUtils.k(context, b, this.c);
                        }
                    }
                    hg70Var.T(new gh70(a));
                    hg70Var.p.b(new nh70.a(a));
                } else {
                    f4zVar.b(vzi0.a.a);
                }
                break;
        }
        return s3q0.a;
    }
}
