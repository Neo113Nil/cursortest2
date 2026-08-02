package defpackage;

import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.masstransit.analytic.CloseReason;

/* loaded from: classes6.dex */
public final class b140 {
    public final co40 a;
    public volatile List b = EmptyList.a;
    public volatile boolean c;
    public volatile boolean d;

    public b140(co40 co40Var) {
        this.a = co40Var;
    }

    public final void a(CloseReason closeReason, igu0 igu0Var) {
        String analyticsName = igu0Var.d.getAnalyticsName();
        String reason = closeReason.getReason();
        String str = igu0Var.a;
        co40 co40Var = this.a;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        if (reason != null) {
            hashMap.put("close_reason", reason);
        }
        if (analyticsName != null) {
            hashMap.put("open_reason", analyticsName);
        }
        if (str != null) {
            hashMap.put("stop_id", str);
        }
        co40Var.a.a("StopCard.Closed", hashMap, 1, new HashMap());
    }
}
