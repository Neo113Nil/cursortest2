package xsna;

import com.vk.log.L;
import com.vk.network.proxy.verifier.VkProxyPoll;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: RxUtil.kt */
/* loaded from: classes.dex */
public final class pgn implements p7f0, qev0, j601 {
    public Object b;

    public /* synthetic */ pgn(Object obj) {
        this.b = obj;
    }

    public synchronized boolean a(q93 q93Var) {
        c();
        L.e("AppStateCache", "PUT mem: " + q93Var.a);
        ((ArrayList) this.b).add(q93Var);
        return true;
    }

    public void b(io.reactivex.rxjava3.disposables.c cVar) {
        io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) this.b;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.b = cVar;
    }

    public void c() {
        if (((ArrayList) this.b).size() <= 8) {
            return;
        }
        L.e("AppStateCache", "TRIM mem: " + ((ArrayList) this.b) + ".size to 8");
        int size = ((ArrayList) this.b).size() - 8;
        Iterator it = ((ArrayList) this.b).iterator();
        int i = 0;
        while (it.hasNext()) {
            q93 q93Var = (q93) it.next();
            if (!q93Var.c) {
                LinkedBlockingDeque<String> linkedBlockingDeque = com.vk.core.util.state.a.a;
                com.vk.core.util.state.a.a("TRIM mem: " + q93Var + " not sync with storage!");
            }
            it.remove();
            i++;
            if (i == size || size == 0) {
                return;
            }
        }
    }

    @Override // xsna.qev0
    public VkProxyPoll d() {
        return !enj.n(((cj00) this.b).a) ? VkProxyPoll.CANCEL : VkProxyPoll.NEXT;
    }

    @Override // xsna.i7f0
    public Object getValue(Object obj, qcy qcyVar) {
        return (io.reactivex.rxjava3.disposables.c) this.b;
    }

    @Override // xsna.p7f0
    public /* bridge */ /* synthetic */ void setValue(Object obj, qcy qcyVar, Object obj2) {
        b((io.reactivex.rxjava3.disposables.c) obj2);
    }

    @Override // xsna.j601
    public Object zza() {
        ek01 ek01Var = (ek01) ((j601) this.b).zza();
        if (ek01Var != null) {
            return ek01Var;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
