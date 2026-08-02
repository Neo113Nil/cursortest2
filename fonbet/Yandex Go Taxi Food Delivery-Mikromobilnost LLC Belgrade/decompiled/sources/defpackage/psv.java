package defpackage;

import androidx.compose.animation.core.RepeatMode;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class psv implements rfd {
    public final qsv a;

    public psv(qsv qsvVar, tzt tztVar) {
        this.a = qsvVar;
    }

    public static long c(osv osvVar) {
        nsv nsvVar = (nsv) osvVar.x;
        int i = nsvVar.b == RepeatMode.Reverse ? 2 : 1;
        h531 a = nsvVar.a.a(osvVar.c);
        long r = a.r() + (a.f() * i);
        int i2 = yx21.a;
        return r * 1000000;
    }

    @Override // defpackage.rfd
    public final long a() {
        Long l;
        Iterator it = this.a.b.b.f().iterator();
        if (it.hasNext()) {
            Long valueOf = Long.valueOf(c((osv) it.next()));
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(c((osv) it.next()));
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l = valueOf;
        } else {
            l = null;
        }
        long longValue = l != null ? l.longValue() : 0L;
        int i = yx21.a;
        return (longValue + 999999) / 1000000;
    }

    @Override // defpackage.rfd
    public final void b() {
        this.a.a.a.setValue(0L);
    }
}
