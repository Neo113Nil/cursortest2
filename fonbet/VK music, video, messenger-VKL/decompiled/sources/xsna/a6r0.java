package xsna;

import androidx.core.app.NotificationCompat;
import com.vk.superapp.api.generated.GsonHolder;
import java.util.List;
import ru.ok.android.onelog.UploadService;

/* compiled from: UxpollsService.kt */
/* loaded from: classes6.dex */
public final class a6r0 implements z5r0 {
    @Override // xsna.z5r0
    public final ufx a(long j, List list, String str, String str2, String str3, String str4) {
        ufx ufxVar = new ufx("uxpolls.getById", new vcl0(5), new y5r0(0));
        ufx.l(ufxVar, "ext_user_id", j, 8);
        ufxVar.h("poll_ids", list);
        if (str != null) {
            ufx.n(ufxVar, "project", str, 0, 12);
        }
        if (str2 != null) {
            ufx.n(ufxVar, "notifier", str2, 0, 12);
        }
        if (str3 != null) {
            ufx.n(ufxVar, "user_locale", str3, 0, 12);
        }
        if (str4 != null) {
            ufx.n(ufxVar, "user_platform", str4, 0, 12);
        }
        return ufxVar;
    }

    @Override // xsna.z5r0
    public final ufx b(long j, String str, String str2, String str3, List list) {
        ufx ufxVar = new ufx("uxpolls.get", new zzq0(2), new jgj0(6));
        ufxVar.e = "no-cache";
        ufx.l(ufxVar, "ext_user_id", j, 8);
        ufxVar.h("triggers", list);
        if (str != null) {
            ufx.n(ufxVar, "project", str, 0, 12);
        }
        if (str2 != null) {
            ufx.n(ufxVar, "notifier", str2, 0, 12);
        }
        if (str3 != null) {
            ufx.n(ufxVar, "user_locale", str3, 0, 12);
        }
        return ufxVar;
    }

    @Override // xsna.z5r0
    public final ufx c(long j, int i, String str, List list, String str2) {
        ufx ufxVar = new ufx("uxpolls.answer", new zjh0(8), new bkh0(7));
        ufx.l(ufxVar, "ext_user_id", j, 8);
        ufx.k(ufxVar, "poll_id", i, 0, 12);
        ufx.n(ufxVar, UploadService.EXTRA_TRIGGER, str, 0, 12);
        ufx.n(ufxVar, "answers", GsonHolder.a().toJson(list), 0, 12);
        if (str2 != null) {
            ufx.n(ufxVar, "user_platform", str2, 0, 12);
        }
        return ufxVar;
    }

    @Override // xsna.z5r0
    public final ufx d(long j, String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, Integer num3, Integer num4, String str6, String str7, List list) {
        ufx ufxVar = new ufx("uxpolls.interact", new sq(29), new tq(28));
        ufx.l(ufxVar, "ext_user_id", j, 8);
        ufx.n(ufxVar, UploadService.EXTRA_TRIGGER, str, 0, 12);
        ufx.n(ufxVar, NotificationCompat.CATEGORY_EVENT, str2, 0, 12);
        if (str3 != null) {
            ufx.n(ufxVar, "project", str3, 0, 12);
        }
        if (str4 != null) {
            ufx.n(ufxVar, "notifier", str4, 0, 12);
        }
        if (num != null) {
            ufxVar.f(num.intValue(), 0, 100000, "poll_id");
        }
        if (str5 != null) {
            ufx.n(ufxVar, "user_platform", str5, 0, 12);
        }
        if (num2 != null) {
            ufx.k(ufxVar, "user_age", num2.intValue(), 0, 12);
        }
        if (num3 != null) {
            ufx.k(ufxVar, "user_sex", num3.intValue(), 0, 12);
        }
        if (num4 != null) {
            ufx.k(ufxVar, "user_registration_date", num4.intValue(), 0, 12);
        }
        if (str6 != null) {
            ufx.n(ufxVar, "user_country_iso2", str6, 0, 12);
        }
        if (str7 != null) {
            ufx.n(ufxVar, "track_code", str7, 0, 12);
        }
        if (list != null) {
            ufx.n(ufxVar, "answers", GsonHolder.a().toJson(list), 0, 12);
        }
        return ufxVar;
    }
}
