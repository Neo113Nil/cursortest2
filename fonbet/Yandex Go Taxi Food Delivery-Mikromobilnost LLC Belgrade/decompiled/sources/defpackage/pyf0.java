package defpackage;

import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.authorized.j;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes15.dex */
public final class pyf0 implements x790 {
    public final ServerMessageRef a;
    public final j b;
    public final mv10 c;
    public final ArrayList d = new ArrayList();
    public boolean e;

    public pyf0(ServerMessageRef serverMessageRef, j jVar, mv10 mv10Var) {
        this.a = serverMessageRef;
        this.b = jVar;
        this.c = mv10Var;
    }

    @Override // defpackage.x790
    public final void a(qgg qggVar) {
        this.e = false;
        this.d.add(new zs21(this.b, new e5h(this, ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED, qggVar)));
    }

    @Override // defpackage.x790
    public final void b() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((x08) it.next()).cancel();
        }
    }

    @Override // defpackage.x790
    public final Long c(Object obj) {
        return Long.valueOf(((lyf0) obj).a());
    }

    @Override // defpackage.x790
    public final void d(Object obj, int i, aq80 aq80Var) {
        ((Number) obj).longValue();
        aq80Var.F(new w790(EmptyList.a, false, false));
    }

    @Override // defpackage.x790
    public final void e(Object obj, int i, yj70 yj70Var) {
        this.d.add(new zs21(this.b, new e5h(this, ((Number) obj).longValue() - 1, yj70Var)));
    }
}
