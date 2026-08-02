package defpackage;

import java.util.Iterator;
import java.util.Map;
import ru.yandex.taxi.order.map.controller.internal.Command$CommandType;

/* loaded from: classes6.dex */
public final class a09 {
    public final long a;
    public final yvf0 b;
    public final h3y c;
    public final w53 d = new w53();

    public a09(long j, yvf0 yvf0Var, h3y h3yVar) {
        this.a = j;
        this.b = yvf0Var;
        this.c = h3yVar;
    }

    public final w53 a() {
        w53 w53Var = new w53();
        Iterator it = ((q53) this.d.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            w53Var.put((String) entry.getKey(), ((r78) entry.getValue()).b());
        }
        return w53Var;
    }

    public final void b(ylc ylcVar) {
        for (flc flcVar : ylcVar.a) {
            Command$CommandType command$CommandType = flcVar.b;
            sjm sjmVar = flcVar.c;
            Command$CommandType command$CommandType2 = flcVar.b;
            String str = flcVar.a;
            int i = zz8.a[command$CommandType.ordinal()];
            h3y h3yVar = this.c;
            yvf0 yvf0Var = this.b;
            long j = this.a;
            w53 w53Var = this.d;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        w511.b();
                        return;
                    }
                    w53Var.remove(str);
                } else {
                    if (command$CommandType2 == Command$CommandType.Remove) {
                        w511.x("Not available for CommandType.Remove");
                        return;
                    }
                    if (sjmVar == null) {
                        w511.x("Contract violation");
                        return;
                    }
                    r78 r78Var = (r78) w53Var.get(str);
                    if (r78Var != null) {
                        r78Var.a(str, sjmVar);
                    } else {
                        r78 r78Var2 = new r78(j, yvf0Var, h3yVar);
                        r78Var2.a(str, sjmVar);
                        w53Var.put(str, r78Var2);
                    }
                }
            } else if (command$CommandType2 == Command$CommandType.Remove) {
                w511.x("Not available for CommandType.Remove");
                return;
            } else if (sjmVar == null) {
                w511.x("Contract violation");
                return;
            } else {
                r78 r78Var3 = new r78(j, yvf0Var, h3yVar);
                r78Var3.a(str, sjmVar);
                w53Var.put(str, r78Var3);
            }
        }
    }
}
