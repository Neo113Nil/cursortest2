package defpackage;

import com.adjust.sdk.Constants;
import com.ybsdk.rconfig.configs.HostsWithPciDss;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public final class dj4 {
    public final w4o a;
    public final bx50 b;
    public List c = EmptyList.a;
    public final HostsWithPciDss d = c();

    public dj4(w4o w4oVar, bx50 bx50Var) {
        this.a = w4oVar;
        this.b = bx50Var;
    }

    public static boolean b(String str) {
        if (evu0.J(str)) {
            return false;
        }
        try {
            URL url = new URL(str);
            if (!cvu0.t(url.getProtocol(), "http", true)) {
                if (!cvu0.t(url.getProtocol(), Constants.SCHEME, true)) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final List a() {
        List<HostsWithPciDss> list = (List) this.b.invoke();
        if (this.c.equals(list)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (HostsWithPciDss hostsWithPciDss : list) {
            boolean b = b(hostsWithPciDss.getPciDss());
            boolean b2 = b(hostsWithPciDss.getRegular());
            if (!b || !b2) {
                HostsWithPciDss c = c();
                hostsWithPciDss = c != null ? new HostsWithPciDss(!b2 ? c.getRegular() : hostsWithPciDss.getRegular(), !b ? c.getPciDss() : hostsWithPciDss.getPciDss(), hostsWithPciDss.getUz()) : null;
            }
            if (hostsWithPciDss != null) {
                arrayList.add(hostsWithPciDss);
            }
        }
        this.c = arrayList;
        return arrayList;
    }

    public final HostsWithPciDss c() {
        byte[] bArr = tje.y1;
        byte[] bArr2 = tje.l1;
        t4o t4oVar = t4o.d;
        w4o w4oVar = this.a;
        if (!w4oVar.equals(t4oVar) && !w4oVar.equals(v4o.d)) {
            if (w4oVar.equals(u4o.d)) {
                return null;
            }
            w511.b();
            return null;
        }
        return new HostsWithPciDss(tje.q(bArr2), tje.q(bArr), null);
    }
}
