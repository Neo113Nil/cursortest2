package defpackage;

import android.content.res.Resources;
import com.yandex.messaging.domain.statuses.StatusAvailability;
import com.yandex.messaging.domain.statuses.StatusIconType;

/* loaded from: classes15.dex */
public final class du21 extends gu21 {
    public final String d;
    public final String e;
    public final StatusIconType f;

    public du21(StatusAvailability statusAvailability, long j, long j2, String str, String str2, boolean z, StatusIconType statusIconType) {
        super(statusAvailability, z);
        this.d = str;
        this.e = str2;
        this.f = statusIconType;
    }

    @Override // defpackage.gu21
    public final String b(Resources resources) {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof du21)) {
            return false;
        }
        du21 du21Var = (du21) obj;
        return jl40.l(du21Var.e, this.e) && jl40.l(du21Var.d, this.d);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
