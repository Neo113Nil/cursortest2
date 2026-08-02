package xsna;

import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.feature.ReactionsFeedMviState;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ReactionsFeedStoreParams.kt */
/* loaded from: classes4.dex */
public final class h5f0 {
    public final qn60 a;
    public final pn60 b;
    public final eh60 c;
    public final s1v d;
    public final mo60 e;
    public final AtomicReference<wn60> f;
    public final xa4 g;
    public final l3f0 h;
    public final com.vk.channels.impl.channel_screen.send_msg.c i;
    public final g4f0 j;
    public final es60 k;
    public final gzs<ReactionsFeedMviState> l;

    public h5f0(qn60 qn60Var, pn60 pn60Var, eh60 eh60Var, s1v s1vVar, mo60 mo60Var, AtomicReference atomicReference, xa4 xa4Var, l3f0 l3f0Var, com.vk.channels.impl.channel_screen.send_msg.c cVar, g4f0 g4f0Var, es60 es60Var, gzs gzsVar) {
        this.a = qn60Var;
        this.b = pn60Var;
        this.c = eh60Var;
        this.d = s1vVar;
        this.e = mo60Var;
        this.f = atomicReference;
        this.g = xa4Var;
        this.h = l3f0Var;
        this.i = cVar;
        this.j = g4f0Var;
        this.k = es60Var;
        this.l = gzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5f0)) {
            return false;
        }
        h5f0 h5f0Var = (h5f0) obj;
        return this.a.equals(h5f0Var.a) && this.b.equals(h5f0Var.b) && this.c.equals(h5f0Var.c) && this.d.equals(h5f0Var.d) && this.e.equals(h5f0Var.e) && this.f.equals(h5f0Var.f) && this.g.equals(h5f0Var.g) && epx.f(this.h, h5f0Var.h) && this.i.equals(h5f0Var.i) && this.j.equals(h5f0Var.j) && this.k.equals(h5f0Var.k) && epx.f(this.l, h5f0Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReactionsFeedStoreParams(dataSet=");
        sb.append(this.a);
        sb.append(", itemsTransformer=");
        sb.append(this.b);
        sb.append(", deduplicator=");
        sb.append(this.c);
        sb.append(", positionSetter=");
        sb.append(this.d);
        sb.append(", listDependencies=");
        sb.append(this.e);
        sb.append(", lifecycleState=");
        sb.append(this.f);
        sb.append(", interactor=");
        sb.append(this.g);
        sb.append(", arguments=");
        sb.append(this.h);
        sb.append(", util=");
        sb.append(this.i);
        sb.append(", mappers=");
        sb.append(this.j);
        sb.append(", taskExecutorsDependencies=");
        sb.append(this.k);
        sb.append(", initialState=");
        return uf3.d(sb, this.l, ')');
    }
}
