package defpackage;

import com.yandex.messaging.domain.statuses.StatusAvailability;
import com.yandex.messaging.ui.statuses.UserStatusViewData$TitleRes;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class eu21 extends fu21 {
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu21(long j, long j2, boolean z) {
        super(StatusAvailability.Default, z);
        int res = UserStatusViewData$TitleRes.Default.getRes();
        int i = oyh0.statuses_default_description;
        this.d = j;
        this.e = j2;
        this.f = res;
        this.g = i;
        this.h = z;
    }

    @Override // defpackage.gu21
    public final boolean a() {
        return this.h;
    }

    @Override // defpackage.fu21
    public final int c() {
        return this.f;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder l = x4e.l("Default(duration=", e3n.p(this.d), ", timestamp=", this.e);
        l.append(", title=");
        l.append(this.f);
        l.append(", description=");
        l.append(this.g);
        return xra1.a(l, ", muteNotifications=", this.h, Extension.C_BRAKE);
    }
}
