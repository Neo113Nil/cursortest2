package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.analytics.OrganizationChangeReporter$ChangeType;
import com.yandex.messaging.analytics.OrganizationChangeSource;
import com.yandex.messaging.data.e;

/* loaded from: classes15.dex */
public final class ai80 {
    public final x22 a;

    public ai80(x22 x22Var, e eVar) {
        this.a = x22Var;
        x22Var.i("organization", String.valueOf(eVar.c()));
    }

    public final void a(Long l, long j, OrganizationChangeReporter$ChangeType organizationChangeReporter$ChangeType, OrganizationChangeSource organizationChangeSource) {
        if (l != null && l.longValue() == j) {
            return;
        }
        this.a.i("organization", String.valueOf(j));
        new Handler(Looper.getMainLooper()).post(new zh80(this, l, j, organizationChangeReporter$ChangeType, organizationChangeSource, 0));
    }
}
