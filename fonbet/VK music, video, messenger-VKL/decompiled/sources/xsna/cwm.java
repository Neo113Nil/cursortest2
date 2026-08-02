package xsna;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import xsna.ai70;

/* compiled from: DialogsToolbarAvatarProviderImpl.kt */
/* loaded from: classes18.dex */
public final class cwm implements bwm {
    public Object b;
    public Object c;

    public /* synthetic */ cwm(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.bwm
    public io.reactivex.rxjava3.core.q a() {
        io.reactivex.rxjava3.internal.operators.observable.j1 U = ((llp) this.b).a().b0(s080.class).U(new e05(new cqf(this, 13), 18));
        cn o = ((b25) this.c).o();
        io.reactivex.rxjava3.core.q o0 = U.o0(io.reactivex.rxjava3.core.x.k(new sr5(o.b, o.c, o.j)));
        o0.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.y(o0, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    public synchronized Object b() {
        if (!((ArrayList) this.b).isEmpty()) {
            return ((ArrayList) this.b).remove(r0.size() - 1);
        }
        ai70.a aVar = (ai70.a) this.c;
        aVar.getClass();
        return new ai70(aVar.b);
    }

    public tho0 c(List list) {
        pzo pzoVar;
        pzo pzoVar2 = null;
        try {
            int size = list.size();
            int i = 0;
            pzo pzoVar3 = null;
            while (i < size) {
                try {
                    pzoVar = (pzo) list.get(i);
                } catch (Exception e) {
                    e = e;
                    pzoVar2 = pzoVar3;
                }
                try {
                    pzoVar.a((c2p) this.c);
                    i++;
                    pzoVar3 = pzoVar;
                } catch (Exception e2) {
                    e = e2;
                    pzoVar2 = pzoVar;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((c2p) this.c).a.a());
                    sb2.append(", composition=");
                    sb2.append(((c2p) this.c).c());
                    sb2.append(", selection=");
                    c2p c2pVar = (c2p) this.c;
                    sb2.append((Object) qko0.h(jgz.c(c2pVar.b, c2pVar.c)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    j5g.f0(list, sb, "\n", null, null, new j9k(pzoVar2, this), 60);
                    throw new RuntimeException(sb.toString(), e);
                }
            }
            c2p c2pVar2 = (c2p) this.c;
            c2pVar2.getClass();
            us2 us2Var = new us2(c2pVar2.a.toString());
            c2p c2pVar3 = (c2p) this.c;
            long c = jgz.c(c2pVar3.b, c2pVar3.c);
            qko0 qko0Var = qko0.g(((tho0) this.b).b) ? null : new qko0(c);
            tho0 tho0Var = new tho0(us2Var, qko0Var != null ? qko0Var.a : jgz.c(qko0.e(c), qko0.f(c)), ((c2p) this.c).c());
            this.b = tho0Var;
            return tho0Var;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public synchronized void d(View view) {
        ((ai70.a) this.c).getClass();
        ((ArrayList) this.b).add(view);
    }
}
