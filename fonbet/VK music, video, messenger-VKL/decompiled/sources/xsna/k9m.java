package xsna;

import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.metrics.trackers.CriticalException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: DialogAddIncognitoLpTask.kt */
/* loaded from: classes2.dex */
public final class k9m extends e500 {
    public final w2w c;
    public final long d;
    public final int e;
    public final bpn0 f;
    public boolean g;

    /* compiled from: DialogAddIncognitoLpTask.kt */
    public static final class a extends CriticalException {
    }

    public k9m(w2w w2wVar, long j, int i) {
        super("DialogAddIncognitoLpTask");
        this.c = w2wVar;
        this.d = j;
        this.e = i;
        this.f = new bpn0(new b1j(this, 7));
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        ns20 ns20Var = (ns20) this.f.getValue();
        ns20Var.getClass();
        LinkedHashMap linkedHashMap = c400Var.k;
        long j = this.d;
        Map map = (Map) linkedHashMap.getOrDefault(Long.valueOf(j), jgp.b);
        int i = this.e;
        if (map.containsKey(Integer.valueOf(i))) {
            return;
        }
        hpm e = ns20Var.a.I0().b().e();
        e.getClass();
        StringBuilder a2 = eq0.a(i, "SELECT EXISTS(SELECT incognito_id FROM dialog_members WHERE dialog_id = ", " AND incognito_id = ", j);
        a2.append(" LIMIT 1)");
        Boolean I = fl3.I(e.b.b().d(a2.toString(), null));
        if (I != null ? I.booleanValue() : false) {
            return;
        }
        if (!c400Var.o) {
            LinkedHashMap linkedHashMap2 = f400Var.n;
            Long valueOf = Long.valueOf(j);
            Object obj = linkedHashMap2.get(valueOf);
            if (obj == null) {
                obj = new HashSet();
                linkedHashMap2.put(valueOf, obj);
            }
            ((Set) obj).add(Integer.valueOf(i));
            return;
        }
        if (this.g) {
            return;
        }
        com.vk.metrics.eventtracking.b.a.a(new a("Missing in " + j + " incognito = " + i));
        this.g = true;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.g(this.d);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        Map map = (Map) c400Var.k.get(Long.valueOf(this.d));
        DialogMember dialogMember = map != null ? (DialogMember) map.get(Integer.valueOf(this.e)) : null;
        if (dialogMember != null) {
            this.c.I0().u(new qd1(11, this, dialogMember));
        }
    }
}
