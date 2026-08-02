package xsna;

import com.vk.api.generated.appWidgets.dto.AppWidgetsUpdateTypeDto;
import com.vk.dto.common.id.UserId;

/* compiled from: AppWidgetsService.kt */
/* loaded from: classes2.dex */
public interface kc3 {
    default tfx a(String str, AppWidgetsUpdateTypeDto appWidgetsUpdateTypeDto, UserId userId, Integer num) {
        tfx tfxVar = new tfx("appWidgets.update", new jq(3), new kq(3));
        tfx.o(tfxVar, "code", str, 0, 100000, 4);
        tfx.o(tfxVar, "type", appWidgetsUpdateTypeDto.i(), 0, 0, 12);
        tfx.n(tfxVar, "group_id", userId, 0L, 0L, 8);
        tfx.l(tfxVar, "app_id", num.intValue(), 0, 0, 8);
        return tfxVar;
    }
}
