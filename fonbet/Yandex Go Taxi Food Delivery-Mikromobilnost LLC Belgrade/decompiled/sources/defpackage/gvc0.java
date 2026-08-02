package defpackage;

import com.yandex.quark.js.QuarkJsState;
import com.yandex.quark.js.implementation.webView.internal.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class gvc0 implements f38, zhg0 {
    public final zwf0 a;
    public final c b;
    public final LinkedHashMap c = new LinkedHashMap();
    public volatile boolean w;

    public gvc0(zwf0 zwf0Var, c cVar) {
        this.a = zwf0Var;
        this.b = cVar;
    }

    public final void a(String str, plc plcVar) {
        plcVar.getClass();
        this.a.f("PlatformCapabilityRegistry", str + Extension.COLON_SPACE + plcVar.a());
    }

    public final void b(u28 u28Var) {
        Object obj;
        if (this.w) {
            c cVar = this.b;
            String a = u28Var.a();
            png currentState = u28Var.getCurrentState();
            Set m = u28Var.d().m();
            ArrayList arrayList = new ArrayList(tcc.n(m, 10));
            Iterator it = m.iterator();
            while (it.hasNext()) {
                arrayList.add(((dnj) it.next()).a);
            }
            syj0 b = cVar.x.b(new ekc(a, currentState, arrayList, Boolean.valueOf(u28Var instanceof e2z)));
            jyj0 jyj0Var = b instanceof jyj0 ? (jyj0) b : null;
            if (jyj0Var == null || (obj = jyj0Var.a) == null) {
                return;
            }
            a("Failed to register platform capability ".concat(z28.a(u28Var.a())), (plc) obj);
        }
    }

    @Override // defpackage.f38
    public final synchronized void c(e38 e38Var) {
        Object obj;
        if (e38Var instanceof c38) {
            String a = ((c38) e38Var).a.a();
            if (this.c.containsKey(new z28(a))) {
                this.a.e("PlatformCapabilityRegistry", "Attempt to register duplicate platform capability ".concat(z28.a(a)));
            } else {
                this.c.put(new z28(a), ((c38) e38Var).a);
                ((c38) e38Var).a.b(new fvc0(this, a));
                b(((c38) e38Var).a);
            }
        } else {
            if (!(e38Var instanceof d38)) {
                throw new NoWhenBranchMatchedException();
            }
            String a2 = ((d38) e38Var).a.a();
            if (((u28) this.c.remove(new z28(((d38) e38Var).a.a()))) != null && this.w && this.w) {
                syj0 b = this.b.x.b(new zkc(a2));
                jyj0 jyj0Var = b instanceof jyj0 ? (jyj0) b : null;
                if (jyj0Var != null && (obj = jyj0Var.a) != null) {
                    a("Failed to unregister platform capability ".concat(z28.a(a2)), (plc) obj);
                }
            }
        }
    }

    @Override // defpackage.zhg0
    public final synchronized void d(QuarkJsState quarkJsState) {
        try {
            int i = evc0.a[quarkJsState.ordinal()];
            if (i == 1) {
                this.w = false;
            } else if (i == 2) {
                this.w = true;
                Iterator it = this.c.values().iterator();
                while (it.hasNext()) {
                    b((u28) it.next());
                }
                this.b.b(akc.c);
            } else if (i == 3) {
                this.w = false;
                this.c.clear();
            } else if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
        } finally {
        }
    }
}
