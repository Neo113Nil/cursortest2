package defpackage;

import com.yandex.plus.home.datasource.openapi.models.NetworkNotificationModel$Position;
import java.net.URI;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class cv50 implements sx50 {
    public static final bv50 Companion = new bv50();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new rk50(27)), null, null};
    public final NetworkNotificationModel$Position a;
    public final String b;
    public final URI c;

    public /* synthetic */ cv50(int i, NetworkNotificationModel$Position networkNotificationModel$Position, String str, URI uri) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, av50.a.getDescriptor());
            throw null;
        }
        this.a = networkNotificationModel$Position;
        this.b = str;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv50)) {
            return false;
        }
        cv50 cv50Var = (cv50) obj;
        return this.a == cv50Var.a && jl40.l(this.b, cv50Var.b) && jl40.l(this.c, cv50Var.c);
    }

    @Override // defpackage.sx50
    public final NetworkNotificationModel$Position getPosition() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "NetworkIconNotificationModel(position=" + this.a + ", type=" + this.b + ", url=" + this.c + ')';
    }
}
