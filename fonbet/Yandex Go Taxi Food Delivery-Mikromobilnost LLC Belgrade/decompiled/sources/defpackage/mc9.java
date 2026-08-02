package defpackage;

import com.yandex.messaging.analytics.OrganizationChangeReporter$ChangeType;
import com.yandex.messaging.analytics.OrganizationChangeSource;
import com.yandex.messaging.data.e;

/* loaded from: classes15.dex */
public final class mc9 extends xx4 {
    public final long w;
    public final OrganizationChangeSource x;
    public final e y;
    public final ai80 z;

    public mc9(long j, OrganizationChangeSource organizationChangeSource, e eVar, ai80 ai80Var) {
        this.w = j;
        this.x = organizationChangeSource;
        this.y = eVar;
        this.z = ai80Var;
    }

    @Override // defpackage.xx4
    public final void j(cl21 cl21Var) {
        e eVar = this.y;
        Long a = eVar.a();
        eVar.a.edit().putLong("user_current_org_id", this.w).apply();
        ai80 ai80Var = this.z;
        ai80Var.getClass();
        ai80Var.a(a, this.w, OrganizationChangeReporter$ChangeType.ByUser, this.x);
    }
}
