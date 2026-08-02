package defpackage;

import com.yandex.plus.home.plaque.repository.graphql.cache.dto.NotificationDto$Position;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class nh60 implements rh60 {
    public static final mh60 Companion = new mh60();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new ew50(28)), null};
    public final NotificationDto$Position a;
    public final int b;

    public /* synthetic */ nh60(int i, NotificationDto$Position notificationDto$Position, int i2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, lh60.a.getDescriptor());
            throw null;
        }
        this.a = notificationDto$Position;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final NotificationDto$Position b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh60)) {
            return false;
        }
        nh60 nh60Var = (nh60) obj;
        return this.a == nh60Var.a && this.b == nh60Var.b;
    }

    public final int hashCode() {
        NotificationDto$Position notificationDto$Position = this.a;
        return Integer.hashCode(this.b) + ((notificationDto$Position == null ? 0 : notificationDto$Position.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Count(position=");
        sb.append(this.a);
        sb.append(", count=");
        return oyr.s(sb, this.b, ')');
    }

    public nh60(NotificationDto$Position notificationDto$Position, int i) {
        this.a = notificationDto$Position;
        this.b = i;
    }
}
