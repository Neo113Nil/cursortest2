package defpackage;

import com.yandex.messaging.domain.statuses.StatusAvailability;
import com.yandex.messaging.ui.statuses.UserStatusViewData$TitleRes;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class bu21 extends fu21 {
    public final /* synthetic */ int d;
    public final long e;
    public final long f;
    public final int g;
    public final int h;
    public final boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu21(int i, long j, long j2, boolean z) {
        super(StatusAvailability.Away, z);
        this.d = i;
        switch (i) {
            case 1:
                int res = UserStatusViewData$TitleRes.Busy.getRes();
                int i2 = oyh0.statuses_busy_description;
                super(StatusAvailability.Busy, z);
                this.e = j;
                this.f = j2;
                this.g = res;
                this.h = i2;
                this.i = z;
                break;
            case 2:
                int res2 = UserStatusViewData$TitleRes.Dnd.getRes();
                int i3 = oyh0.statuses_dnd_description;
                super(StatusAvailability.Dnd, z);
                this.e = j;
                this.f = j2;
                this.g = res2;
                this.h = i3;
                this.i = z;
                break;
            default:
                int res3 = UserStatusViewData$TitleRes.Away.getRes();
                int i4 = oyh0.statuses_away_description;
                this.e = j;
                this.f = j2;
                this.g = res3;
                this.h = i4;
                this.i = z;
                break;
        }
    }

    @Override // defpackage.gu21
    public final boolean a() {
        switch (this.d) {
        }
        return this.i;
    }

    @Override // defpackage.fu21
    public final int c() {
        switch (this.d) {
        }
        return this.g;
    }

    public final int hashCode() {
        switch (this.d) {
        }
        return this.a.hashCode();
    }

    public final String toString() {
        int i = this.d;
        boolean z = this.i;
        int i2 = this.h;
        int i3 = this.g;
        long j = this.f;
        String p = e3n.p(this.e);
        switch (i) {
            case 0:
                StringBuilder l = x4e.l("Away(duration=", p, ", timestamp=", j);
                l.append(", title=");
                l.append(i3);
                l.append(", description=");
                l.append(i2);
                return xra1.a(l, ", muteNotifications=", z, Extension.C_BRAKE);
            case 1:
                StringBuilder l2 = x4e.l("Busy(duration=", p, ", timestamp=", j);
                l2.append(", title=");
                l2.append(i3);
                l2.append(", description=");
                l2.append(i2);
                return xra1.a(l2, ", muteNotifications=", z, Extension.C_BRAKE);
            default:
                StringBuilder l3 = x4e.l("Dnd(duration=", p, ", timestamp=", j);
                l3.append(", title=");
                l3.append(i3);
                l3.append(", description=");
                l3.append(i2);
                return xra1.a(l3, ", muteNotifications=", z, Extension.C_BRAKE);
        }
    }
}
