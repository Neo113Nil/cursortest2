package defpackage;

import com.yandex.plus.log.api.LogPriority;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class ndd0 implements mdd0 {
    public final UUID a;
    public final jlv b;
    public final ArrayList c;

    public ndd0(ped0 ped0Var, List list, UUID uuid) {
        this.a = uuid;
        jlv jlvVar = new jlv();
        this.b = jlvVar;
        this.c = a.m0(list, scc.g(new m5z0(), new rkd0(1, ped0Var, uuid), jlvVar));
    }

    @Override // defpackage.pgz
    public final void a(LogPriority logPriority, String str, String str2) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            pgz pgzVar = (pgz) it.next();
            if (pgzVar.e(logPriority)) {
                pgzVar.a(logPriority, str, str2);
            }
        }
    }

    @Override // defpackage.pgz
    public final void b(LogPriority logPriority, String str, String str2, Throwable th) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            pgz pgzVar = (pgz) it.next();
            if (pgzVar.e(logPriority)) {
                pgzVar.b(logPriority, str, str2, th);
            }
        }
    }

    @Override // defpackage.pgz
    public final boolean e(LogPriority logPriority) {
        return true;
    }
}
