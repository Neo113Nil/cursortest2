package xsna;

import android.content.Context;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.queue.di.QueueSyncComponent;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xsna.hfr;
import xsna.usi0;

/* compiled from: PreloadMultiaccountTask.kt */
/* loaded from: classes11.dex */
public final class t1d0 implements gzs<s3q0> {
    public final bpn0 b;
    public final bpn0 c;
    public final bpn0 d;
    public final bpn0 e;
    public final bpn0 f;

    public t1d0(bpn0 bpn0Var, bpn0 bpn0Var2, bpn0 bpn0Var3, bpn0 bpn0Var4, bpn0 bpn0Var5) {
        this.b = bpn0Var;
        this.c = bpn0Var2;
        this.d = bpn0Var3;
        this.e = bpn0Var4;
        this.f = bpn0Var5;
    }

    public final void a(s6i s6iVar, Iterable<? extends usi0> iterable) {
        if (!Preference.f("multi_push_settings_prefs").getBoolean("is_multi_push_disabled", true)) {
            s6iVar.n(Collections.singletonList(Long.valueOf(((b25) this.f.getValue()).c().b)));
            return;
        }
        hfr t = rli0.t(new i5g(iterable), new fb3(1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        hfr.a aVar = new hfr.a(t);
        while (aVar.hasNext()) {
            linkedHashSet.add(Long.valueOf(((usi0.a) aVar.next()).c().b().b));
        }
        s6iVar.n(linkedHashSet);
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        ((MultiAccountComponent) this.c.getValue()).d().d().a(new r1d0(0), new e620(L.a, 1));
        bpn0 bpn0Var = this.b;
        s240 s240Var = new s240(((SessionManagementComponent) bpn0Var.getValue()).J2(), ((QueueSyncComponent) this.e.getValue()).H4());
        hg1.h(s240Var.d.U(new jcw(new cb3(1))), new adx(1, this));
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        final s6i s6iVar = new s6i(context);
        a(s6iVar, ((SessionManagementComponent) bpn0Var.getValue()).J2().g());
        ((SessionManagementComponent) bpn0Var.getValue()).J2().f(new ayi0() { // from class: xsna.s1d0
            @Override // xsna.ayi0
            public final void a(uxi0 uxi0Var) {
                t1d0.this.a(s6iVar, uxi0Var.a());
            }
        });
        ArrayList e = ((SessionManagementComponent) bpn0Var.getValue()).J2().e();
        ArrayList arrayList = new ArrayList(c5g.u(e, 10));
        Iterator it = e.iterator();
        while (it.hasNext()) {
            arrayList.add(((usi0.a) it.next()).c().b());
        }
        ((VkClientMultiAccountComponent) this.d.getValue()).Vc().b(arrayList);
        return s3q0.a;
    }
}
