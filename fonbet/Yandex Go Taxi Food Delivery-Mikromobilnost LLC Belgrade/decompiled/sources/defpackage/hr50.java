package defpackage;

import com.yandex.plus.home.datasource.openapi.models.NetworkNotificationModel$Position;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class hr50 implements sx50 {
    public static final gr50 Companion = new gr50();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new rk50(20)), null, null};
    public final NetworkNotificationModel$Position a;
    public final String b;
    public final int c;

    public /* synthetic */ hr50(int i, NetworkNotificationModel$Position networkNotificationModel$Position, String str, int i2) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, fr50.a.getDescriptor());
            throw null;
        }
        this.a = networkNotificationModel$Position;
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr50)) {
            return false;
        }
        hr50 hr50Var = (hr50) obj;
        return this.a == hr50Var.a && jl40.l(this.b, hr50Var.b) && this.c == hr50Var.c;
    }

    @Override // defpackage.sx50
    public final NetworkNotificationModel$Position getPosition() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkCounterNotificationModel(position=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", count=");
        return oyr.s(sb, this.c, ')');
    }
}
