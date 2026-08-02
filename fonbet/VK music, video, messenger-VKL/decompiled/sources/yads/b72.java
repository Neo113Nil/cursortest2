package yads;

import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import xsna.bpn0;

/* loaded from: classes10.dex */
public final class b72 {
    public final Context a;
    public final Lazy b = new bpn0(new a72(this));
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public b72(Context context) {
        this.a = context.getApplicationContext();
    }

    public final void a(String str, di3 di3Var, String str2) {
        nj0 nj0Var = (nj0) this.b.getValue();
        if (nj0Var == null) {
            di3Var.b();
            a();
            return;
        }
        Uri parse = Uri.parse(str);
        p51 p51Var = s51.c;
        qj0 qj0Var = new qj0(str2, parse, null, tn2.f, null, null, null);
        this.c.put(str2, di3Var);
        nj0Var.b.add(new vo3(str2, di3Var));
        nj0Var.c++;
        nj0Var.a.obtainMessage(6, 0, 0, qj0Var).sendToTarget();
        if (nj0Var.d) {
            nj0Var.d = false;
            nj0Var.c++;
            nj0Var.a.obtainMessage(1, 0, 0).sendToTarget();
            boolean a = nj0Var.a();
            Iterator it = nj0Var.b.iterator();
            while (it.hasNext()) {
                ((lj0) it.next()).getClass();
            }
            if (a) {
                Iterator it2 = nj0Var.b.iterator();
                while (it2.hasNext()) {
                    ((lj0) it2.next()).getClass();
                }
            }
        }
    }

    public final void a() {
        Iterator it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            String str = (String) ((Map.Entry) it.next()).getKey();
            nj0 nj0Var = (nj0) this.b.getValue();
            if (nj0Var != null) {
                nj0Var.c++;
                nj0Var.a.obtainMessage(7, str).sendToTarget();
            }
        }
        this.c.clear();
    }
}
