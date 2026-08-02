package xsna;

import android.content.Context;
import android.content.res.Resources;
import com.vk.api.generated.notifications.dto.NotificationsGetRedesignSettingsResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingsSectionRedesignDto;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.ug70;

/* compiled from: NotificationSettingsReducer.kt */
/* loaded from: classes5.dex */
public final class kh70 extends dm50<uh70, ug70, oh70> {
    public static oh70 i(oh70 oh70Var, String str, izs izsVar) {
        NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto = oh70Var.h;
        gg70 gg70Var = null;
        ArrayList arrayList = null;
        NotificationsNotificationSettingsSectionRedesignDto j = notificationsNotificationSettingsSectionRedesignDto != null ? j(notificationsNotificationSettingsSectionRedesignDto, str, izsVar) : null;
        gg70 gg70Var2 = oh70Var.d;
        if (gg70Var2 != null) {
            NotificationsGetRedesignSettingsResponseDto notificationsGetRedesignSettingsResponseDto = gg70Var2.b;
            List<NotificationsNotificationSettingsSectionRedesignDto> d = notificationsGetRedesignSettingsResponseDto.d();
            boolean z = false;
            if (d != null) {
                List<NotificationsNotificationSettingsSectionRedesignDto> list = d;
                arrayList = new ArrayList(c5g.u(list, 10));
                for (NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto2 : list) {
                    NotificationsNotificationSettingsSectionRedesignDto j2 = j(notificationsNotificationSettingsSectionRedesignDto2, str, izsVar);
                    if (!j2.equals(notificationsNotificationSettingsSectionRedesignDto2)) {
                        z = true;
                    }
                    arrayList.add(j2);
                }
            }
            gg70Var = gg70.a(gg70Var2, false, z ? NotificationsGetRedesignSettingsResponseDto.a(notificationsGetRedesignSettingsResponseDto, arrayList) : notificationsGetRedesignSettingsResponseDto, false, false, 0, null, 125);
        }
        return oh70.a(oh70Var, false, false, gg70Var, false, null, null, j, false, null, 443);
    }

    public static NotificationsNotificationSettingsSectionRedesignDto j(NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto, String str, izs izsVar) {
        List<NotificationsNotificationSettingRedesignDto> e = notificationsNotificationSettingsSectionRedesignDto.e();
        ArrayList arrayList = new ArrayList(c5g.u(e, 10));
        boolean z = false;
        for (NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto : e) {
            if (epx.f(notificationsNotificationSettingRedesignDto.getId(), str)) {
                notificationsNotificationSettingRedesignDto = (NotificationsNotificationSettingRedesignDto) izsVar.invoke(notificationsNotificationSettingRedesignDto);
                z = true;
            }
            arrayList.add(notificationsNotificationSettingRedesignDto);
        }
        return z ? NotificationsNotificationSettingsSectionRedesignDto.a(notificationsNotificationSettingsSectionRedesignDto, arrayList) : notificationsNotificationSettingsSectionRedesignDto;
    }

    @Override // xsna.dm50
    public final oh70 c(oh70 oh70Var, ug70 ug70Var) {
        oh70 oh70Var2 = oh70Var;
        ug70 ug70Var2 = ug70Var;
        gg70 gg70Var = oh70Var2.d;
        if (ug70Var2 instanceof pg70) {
            return oh70.a(oh70Var2, false, false, null, false, null, null, null, false, null, 503);
        }
        if (ug70Var2 instanceof qg70) {
            return oh70.a(oh70Var2, false, false, null, true, null, null, null, false, null, 503);
        }
        if (ug70Var2 instanceof rg70) {
            return oh70.a(oh70Var2, false, false, ((rg70) ug70Var2).b, false, null, null, null, false, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
        }
        if (ug70Var2 instanceof sg70) {
            return oh70.a(oh70Var2, false, true, null, false, null, null, null, false, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
        }
        if (ug70Var2 instanceof tg70) {
            return oh70.a(oh70Var2, true, false, null, false, null, null, null, false, null, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
        }
        ArrayList arrayList = null;
        gg70 gg70Var2 = null;
        if (ug70Var2 instanceof ch70) {
            return oh70.a(oh70Var2, false, false, gg70Var != null ? gg70.a(gg70Var, false, null, false, false, ((ch70) ug70Var2).b, null, 95) : null, false, null, null, null, false, null, 507);
        }
        if (ug70Var2 instanceof dh70) {
            return oh70.a(oh70Var2, false, false, gg70Var != null ? gg70.a(gg70Var, false, null, false, ((dh70) ug70Var2).b, 0, null, 111) : null, false, null, null, null, false, null, 507);
        }
        if (ug70Var2 instanceof eh70) {
            return oh70.a(oh70Var2, false, false, gg70Var != null ? gg70.a(gg70Var, false, null, ((eh70) ug70Var2).b, false, 0, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) : null, false, null, null, null, false, null, 507);
        }
        if (ug70Var2 instanceof fh70) {
            return oh70.a(oh70Var2, false, false, gg70Var != null ? gg70.a(gg70Var, ((fh70) ug70Var2).b, null, false, false, 0, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) : null, false, null, null, null, false, null, 507);
        }
        if (ug70Var2 instanceof bh70) {
            return oh70.a(oh70Var2, false, false, gg70Var != null ? gg70.a(gg70Var, false, null, false, false, 0, ((bh70) ug70Var2).b, 63) : null, false, null, null, null, false, null, 507);
        }
        if (ug70Var2 instanceof gh70) {
            if (gg70Var != null) {
                NotificationsGetRedesignSettingsResponseDto notificationsGetRedesignSettingsResponseDto = gg70Var.b;
                List<NotificationsNotificationSettingsSectionRedesignDto> d = notificationsGetRedesignSettingsResponseDto.d();
                if (d != null) {
                    List<NotificationsNotificationSettingsSectionRedesignDto> list = d;
                    arrayList = new ArrayList(c5g.u(list, 10));
                    for (NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto : list) {
                        String id = notificationsNotificationSettingsSectionRedesignDto.getId();
                        NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto2 = ((gh70) ug70Var2).b;
                        if (epx.f(id, notificationsNotificationSettingsSectionRedesignDto2.getId())) {
                            notificationsNotificationSettingsSectionRedesignDto = notificationsNotificationSettingsSectionRedesignDto2;
                        }
                        arrayList.add(notificationsNotificationSettingsSectionRedesignDto);
                    }
                }
                gg70Var2 = gg70.a(gg70Var, false, NotificationsGetRedesignSettingsResponseDto.a(notificationsGetRedesignSettingsResponseDto, arrayList), false, false, 0, null, 125);
            }
            return oh70.a(oh70Var2, false, false, gg70Var2, false, null, null, ((gh70) ug70Var2).b, false, null, 443);
        }
        if (ug70Var2 instanceof xg70) {
            NotificationsNotificationSettingRedesignDto notificationsNotificationSettingRedesignDto = ((xg70) ug70Var2).b;
            return i(oh70Var2, notificationsNotificationSettingRedesignDto.getId(), new zl20(notificationsNotificationSettingRedesignDto, 13));
        }
        if (ug70Var2 instanceof ug70.a) {
            ug70.a aVar = (ug70.a) ug70Var2;
            return oh70.a(oh70Var2, false, false, null, false, aVar.b, aVar.c, aVar.d, false, null, 399);
        }
        if (ug70Var2 instanceof vg70) {
            vg70 vg70Var = (vg70) ug70Var2;
            NotificationsNotificationSettingsSectionRedesignDto notificationsNotificationSettingsSectionRedesignDto3 = vg70Var.b;
            return oh70.a(oh70Var2, false, false, null, false, null, notificationsNotificationSettingsSectionRedesignDto3.getTitle(), notificationsNotificationSettingsSectionRedesignDto3, vg70Var.c, null, 284);
        }
        if (ug70Var2 instanceof wg70) {
            return oh70.a(oh70Var2, false, false, null, false, null, null, null, false, new sh20(), 255);
        }
        if (ug70Var2 instanceof ah70) {
            return oh70.a(oh70Var2, false, false, null, false, null, null, null, ((ah70) ug70Var2).b, null, 383);
        }
        if (ug70Var2 instanceof zg70) {
            zg70 zg70Var = (zg70) ug70Var2;
            Context context = e43.a;
            Resources resources = (context != null ? context : null).getResources();
            int i = zg70Var.c;
            return i(oh70Var2, zg70Var.b, new ga3(resources.getQuantityString(R.plurals.not_sources, i, Integer.valueOf(i)), 2));
        }
        if (!(ug70Var2 instanceof yg70)) {
            throw new NoWhenBranchMatchedException();
        }
        yg70 yg70Var = (yg70) ug70Var2;
        Context context2 = e43.a;
        Resources resources2 = (context2 != null ? context2 : null).getResources();
        int i2 = yg70Var.b;
        return i(oh70Var2, "group_notify", new v89(resources2.getQuantityString(R.plurals.communities, i2, Integer.valueOf(i2)), 1));
    }

    @Override // xsna.dm50
    public final uh70 d() {
        return new uh70(e(new mgz(this, 16)));
    }

    @Override // xsna.dm50
    public final void h(oh70 oh70Var, uh70 uh70Var) {
        f(uh70Var.a, oh70Var);
    }
}
