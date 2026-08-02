package xsna;

import android.content.SharedPreferences;
import com.vk.toggle.b;
import com.vk.toggle.internal.ToggleManager;

/* compiled from: UserToggleManager.kt */
/* loaded from: classes11.dex */
public class d0r0 {
    public final ToggleManager a;
    public final bpn0 b = new bpn0(new n66(this, 7));
    public final bpn0 c = new bpn0(new rq6(12));

    public d0r0(ToggleManager toggleManager) {
        this.a = toggleManager;
    }

    public static boolean b(b.d dVar, b.d dVar2) {
        if (dVar2 == null) {
            return false;
        }
        if (dVar == null || dVar.a != dVar2.a) {
            return true;
        }
        String obj = dVar.c.toString();
        if (obj == null) {
            obj = "";
        }
        String obj2 = dVar2.c.toString();
        return !obj.equals(obj2 != null ? obj2 : "");
    }

    public final SharedPreferences a() {
        return (SharedPreferences) this.c.getValue();
    }

    public final boolean c(b.d dVar) {
        if (!(dVar instanceof b0r0)) {
            return this.a.h.e().a(dVar, false);
        }
        b.d b = this.a.h.b(dVar.b.toString(), false);
        if (b == null) {
            return false;
        }
        if (b(b, dVar)) {
            this.a.h.e().a(dVar, true);
            twi twiVar = this.a.i;
            twiVar.a.put(dVar.b.toString(), dVar);
        } else {
            this.a.h.k(dVar.b.toString(), true);
            twi twiVar2 = this.a.i;
            twiVar2.a.remove(dVar.b.toString());
        }
        ToggleManager toggleManager = this.a;
        return toggleManager.l.containsKey(dVar.b.toString());
    }
}
