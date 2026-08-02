package defpackage;

import com.yandex.messaging.core.net.entities.proto.message.LocalizedData;
import com.yandex.messaging.domain.user.UserNameType;
import java.util.Iterator;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public final class np21 {
    public final at2 a;
    public final z5z b;
    public final h3y c;

    public np21(at2 at2Var, z5z z5zVar, h3y h3yVar) {
        this.a = at2Var;
        this.b = z5zVar;
        this.c = h3yVar;
    }

    public final qp21 a(in21 in21Var, long j) {
        Object obj;
        LocalizedData a;
        String displayName;
        boolean z = in21Var.n;
        String str = in21Var.a;
        String str2 = in21Var.c;
        if (((iv21) this.c.get()).c && (a = this.b.a(str2)) != null && (displayName = a.getDisplayName()) != null) {
            str = displayName;
        }
        at2 at2Var = this.a;
        if (j != 0) {
            xl21 xl21Var = (xl21) a.R(at2Var.I().b(j, str2));
            if ((xl21Var == null || !xl21Var.g) && !z) {
                return new qp21(str, UserNameType.NORMAL);
            }
            return new qp21(xl21Var != null ? xl21Var.i : null, UserNameType.DELETED);
        }
        if (!z) {
            return new qp21(str, UserNameType.NORMAL);
        }
        Iterator it = at2Var.I().c(str2).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!((xl21) obj).g) {
                break;
            }
        }
        xl21 xl21Var2 = (xl21) obj;
        return new qp21(xl21Var2 != null ? xl21Var2.i : null, UserNameType.DELETED);
    }
}
