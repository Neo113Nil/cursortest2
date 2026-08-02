package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.status.StatusImagePopup;
import com.vk.dto.user.ImageStatus;
import com.vkontakte.android.data.b;

/* compiled from: StatusImageUtils.kt */
/* loaded from: classes5.dex */
public final class szk0 {
    public static final void a(Context context, UserId userId, ImageStatus imageStatus) {
        StatusImagePopup statusImagePopup = imageStatus.h;
        if (statusImagePopup == null) {
            b(imageStatus.b, context, userId);
            return;
        }
        nzk0 nzk0Var = new nzk0(context);
        nzk0Var.e = statusImagePopup;
        nzk0Var.f = false;
        nzk0Var.g = new in60(imageStatus, 17);
        nzk0Var.h = new lva0(imageStatus, 18);
        nzk0Var.S0();
    }

    public static final void b(int i, Context context, UserId userId) {
        i730 i730Var = new i730("status.getImagePopup", 2);
        i730Var.F(userId, "user_id");
        i730Var.R("extended", true);
        i730Var.K("fields", "photo_base");
        bug0.d(rsg0.y0(i730Var, null, null, 3), context, null, 6).subscribe(new zyu(new fnz(context, i), 24), new o060(new k220(27), 13));
    }

    @ozl
    public static final void c(String str, ImageStatus imageStatus) {
        b.d a = io.reactivex.rxjava3.processors.b.a("emoji_status", "action", str);
        a.b(Integer.valueOf(imageStatus.f), "emoji_id");
        a.b(imageStatus.g, "event_name");
        a.e();
    }
}
