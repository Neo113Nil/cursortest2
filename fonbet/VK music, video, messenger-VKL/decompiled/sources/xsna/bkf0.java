package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.feed.core.models.news.NewsEntry;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import xsna.mqp;

/* compiled from: RecyclerViewObserverImpl.kt */
/* loaded from: classes4.dex */
public final class bkf0 extends eg00<u1c0> {
    public final m1o c;
    public final btm d;
    public final tbh e;
    public final dqp f;
    public final wv2 g;
    public final mqp.b h;
    public final s1v i = new s1v();

    public bkf0(m1o m1oVar, btm btmVar, tbh tbhVar, dqp dqpVar, wv2 wv2Var, mqp.b bVar) {
        this.c = m1oVar;
        this.d = btmVar;
        this.e = tbhVar;
        this.f = dqpVar;
        this.g = wv2Var;
        this.h = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.eg00, xsna.zjf0
    public final void b(RecyclerView.e0 e0Var) {
        super.b(e0Var);
        if (e0Var instanceof rql0) {
            qql0 qql0Var = ((mqp) this.d.c).n;
            if (qql0Var != null) {
                rov rovVar = (rov) e0Var;
                erl0 erl0Var = qql0Var.e;
                if (erl0Var != null) {
                    erl0Var.b(rovVar);
                    return;
                }
                return;
            }
            return;
        }
        if (!(e0Var instanceof zdx)) {
            if (e0Var instanceof qi6) {
                ((qi6) e0Var).I6();
            }
        } else {
            xdx xdxVar = ((mqp) this.e.c).o;
            if (xdxVar != null) {
                Iterator it = xdxVar.c.iterator();
                while (it.hasNext()) {
                    ((WeakReference) it.next()).clear();
                }
            }
        }
    }

    @Override // xsna.eg00, xsna.zjf0
    public final void d(RecyclerView.e0 e0Var, Object obj) {
        ehv ehvVar;
        u1c0 u1c0Var = (u1c0) obj;
        NewsEntry newsEntry = u1c0Var.a;
        super.d(e0Var, u1c0Var);
        if (e0Var instanceof chv) {
            if ((newsEntry instanceof Html5Entry) && (ehvVar = ((mqp) this.c.c).m) != null) {
                ehvVar.l((chv) e0Var, (Html5Entry) newsEntry);
            }
        } else if ((e0Var instanceof vto) || (e0Var instanceof sto) || (e0Var instanceof w3c0)) {
            this.g.invoke(u1c0Var);
        }
        if (u1c0Var.g()) {
            this.f.G0(u1c0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.eg00, xsna.zjf0
    public final void e(RecyclerView.e0 e0Var) {
        xdx xdxVar;
        if ((e0Var instanceof qi6) && (e0Var instanceof i7o)) {
            ((qi6) e0Var).Q6(new s6o((i7o) e0Var, this.h, this.i));
        }
        super.e(e0Var);
        if (e0Var instanceof chv) {
            ehv ehvVar = ((mqp) this.c.c).m;
            if (ehvVar != null) {
                ehvVar.h.add(new WeakReference<>(e0Var));
                return;
            }
            return;
        }
        if (!(e0Var instanceof rql0)) {
            if (!(e0Var instanceof zdx) || (xdxVar = ((mqp) this.e.c).o) == null) {
                return;
            }
            xdxVar.c.add(new WeakReference((zdx) e0Var));
            return;
        }
        qql0 qql0Var = ((mqp) this.d.c).n;
        if (qql0Var != null) {
            rov rovVar = (rov) e0Var;
            erl0 erl0Var = qql0Var.e;
            if (erl0Var != null) {
                erl0Var.a(rovVar);
            }
        }
    }
}
