package defpackage;

import android.content.Context;
import com.yandex.go.chargers.notification.ChargersNotification;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes12.dex */
public final class j6a {
    public final Context a;
    public final pav b;
    public final tj60 c;

    public j6a(pav pavVar, tj60 tj60Var, Context context) {
        this.a = context;
        this.b = pavVar;
        this.c = tj60Var;
    }

    public static void b(j6a j6aVar, k6a k6aVar) {
        j6aVar.getClass();
        Context context = j6aVar.a;
        k6aVar.getClass();
        j6aVar.a(new ChargersNotification(context, "ChargersNotification", k6aVar.a, null, k6aVar.b, j6aVar.b, 0), null);
    }

    public final void a(ChargersNotification chargersNotification, sls slsVar) {
        c.z(new sb0(slsVar, this, chargersNotification, 12), chargersNotification);
        chargersNotification.setExpiresListener(new qn5(3, this, chargersNotification));
        chargersNotification.startExpiresTimer(5000L);
        this.c.e(chargersNotification);
    }
}
