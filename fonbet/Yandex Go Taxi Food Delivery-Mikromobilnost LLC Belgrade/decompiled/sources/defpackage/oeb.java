package defpackage;

import com.yandex.messaging.internal.entities.ChatId;
import kotlin.a;

/* loaded from: classes15.dex */
public final class oeb {
    public final i3y a;
    public final i3y b;

    public oeb(at2 at2Var) {
        this.a = a.a(new neb(at2Var, 0));
        this.b = a.a(new neb(at2Var, 1));
    }

    public final String a(o1b0 o1b0Var) {
        if (o1b0Var.p) {
            return (String) androidx.room.util.a.b(((meb) this.b.getValue()).a, true, false, new hcb(o1b0Var.a, 13));
        }
        if (!ChatId.Companion.f(o1b0Var.b)) {
            return o1b0Var.c;
        }
        Long l = o1b0Var.i;
        if (l == null) {
            return null;
        }
        long longValue = l.longValue();
        Long l2 = o1b0Var.j;
        if (l2 == null) {
            return null;
        }
        fy10 fy10Var = (fy10) androidx.room.util.a.b(((by10) this.a.getValue()).a, true, false, new j2b(21, longValue, l2.longValue()));
        if (fy10Var != null) {
            return fy10Var.j;
        }
        return null;
    }
}
