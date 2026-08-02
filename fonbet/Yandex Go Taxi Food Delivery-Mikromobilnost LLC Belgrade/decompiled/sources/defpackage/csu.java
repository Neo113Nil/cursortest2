package defpackage;

import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.BackupHostsWithPciDss;
import com.ybsdk.rconfig.configs.HostsWithPciDss;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes8.dex */
public final class csu {
    public final w4o a;
    public final b b;
    public final r9y c;
    public final dj4 d;

    public csu(w4o w4oVar, b bVar, r9y r9yVar, dj4 dj4Var) {
        this.a = w4oVar;
        this.b = bVar;
        this.c = r9yVar;
        this.d = dj4Var;
    }

    public final boolean a(String str) {
        List singletonList;
        Object obj;
        ListBuilder a = rcc.a();
        w4o w4oVar = this.a;
        a.add(w4oVar.a);
        a.add(w4oVar.b);
        a.add(w4oVar.c);
        this.c.getClass();
        byte[] bArr = tje.y1;
        if (w4oVar.equals(t4o.d)) {
            singletonList = scc.g(tje.q(tje.l1), tje.q(bArr));
        } else if (w4oVar.equals(v4o.d)) {
            singletonList = scc.g(tje.q(tje.H0), tje.q(tje.D0));
        } else {
            if (!w4oVar.equals(u4o.d)) {
                w511.b();
                return false;
            }
            byte[] bArr2 = new byte[58];
            for (int i = 0; i < 58; i++) {
                bArr2[i] = (byte) (bArr[i] ^ tje.b[i % 8]);
            }
            singletonList = Collections.singletonList(new String(bArr2, uza.a));
        }
        a.addAll(singletonList);
        b bVar = this.b;
        bVar.getClass();
        for (HostsWithPciDss hostsWithPciDss : ((BackupHostsWithPciDss) bVar.d(ej4.a).getData()).getHosts()) {
            String regular = hostsWithPciDss.getRegular();
            this.d.getClass();
            if (dj4.b(regular)) {
                a.add(hostsWithPciDss.getRegular());
            }
            if (dj4.b(hostsWithPciDss.getPciDss())) {
                a.add(hostsWithPciDss.getPciDss());
            }
        }
        Iterator it = a.I(a.j()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (evu0.y((String) obj, str, false)) {
                break;
            }
        }
        return obj != null;
    }
}
