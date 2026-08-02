package xsna;

import android.content.Context;
import com.vk.dto.common.Peer;

/* compiled from: ImExternal.kt */
/* loaded from: classes.dex */
public final class x3w {
    public final Context a;
    public final fpo b;
    public final Peer c;
    public final fat d;
    public final mb8 e;
    public final g58 f;
    public final m66 g;
    public final n66 h;
    public final t03 i;
    public final lu2 j;
    public final qy8 k;
    public final eu2 l;
    public final bb3 m;
    public final sw1 n;
    public final vv8 o;
    public final ab3 p;
    public final bib q;

    public x3w(Context context, fpo fpoVar, Peer peer, fat fatVar, mb8 mb8Var, g58 g58Var, m66 m66Var, n66 n66Var, t03 t03Var, lu2 lu2Var, qy8 qy8Var, eu2 eu2Var, bb3 bb3Var, sw1 sw1Var, vv8 vv8Var, ab3 ab3Var, bib bibVar) {
        this.a = context;
        this.b = fpoVar;
        this.c = peer;
        this.d = fatVar;
        this.e = mb8Var;
        this.f = g58Var;
        this.g = m66Var;
        this.h = n66Var;
        this.i = t03Var;
        this.j = lu2Var;
        this.k = qy8Var;
        this.l = eu2Var;
        this.m = bb3Var;
        this.n = sw1Var;
        this.o = vv8Var;
        this.p = ab3Var;
        this.q = bibVar;
    }

    public static x3w a(x3w x3wVar, fpo fpoVar, Peer peer) {
        Context context = x3wVar.a;
        fat fatVar = x3wVar.d;
        mb8 mb8Var = x3wVar.e;
        g58 g58Var = x3wVar.f;
        m66 m66Var = x3wVar.g;
        n66 n66Var = x3wVar.h;
        t03 t03Var = x3wVar.i;
        lu2 lu2Var = x3wVar.j;
        qy8 qy8Var = x3wVar.k;
        eu2 eu2Var = x3wVar.l;
        bb3 bb3Var = x3wVar.m;
        sw1 sw1Var = x3wVar.n;
        vv8 vv8Var = x3wVar.o;
        ab3 ab3Var = x3wVar.p;
        bib bibVar = x3wVar.q;
        x3wVar.getClass();
        return new x3w(context, fpoVar, peer, fatVar, mb8Var, g58Var, m66Var, n66Var, t03Var, lu2Var, qy8Var, eu2Var, bb3Var, sw1Var, vv8Var, ab3Var, bibVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3w)) {
            return false;
        }
        x3w x3wVar = (x3w) obj;
        return this.a.equals(x3wVar.a) && this.b.equals(x3wVar.b) && epx.f(this.c, x3wVar.c) && this.d.equals(x3wVar.d) && this.e.equals(x3wVar.e) && this.f.equals(x3wVar.f) && this.g.equals(x3wVar.g) && this.h.equals(x3wVar.h) && this.i.equals(x3wVar.i) && this.j.equals(x3wVar.j) && this.k.equals(x3wVar.k) && this.l.equals(x3wVar.l) && this.m.equals(x3wVar.m) && this.n.equals(x3wVar.n) && this.o.equals(x3wVar.o) && this.p.equals(x3wVar.p) && this.q.equals(x3wVar.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + bh10.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c.b)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImExternal(context=" + this.a + ", credentials=" + this.b + ", community=" + this.c + ", queueSyncManagerProvider=" + this.d + ", msgActionDelegate=" + this.e + ", jobManagerFactory=" + this.f + ", jobNotificationFactory=" + this.g + ", msgPushSettingsProvider=" + this.h + ", tmpFileCache=" + this.i + ", imageLosslessConverter=" + this.j + ", photoConverter=" + this.k + ", videoConverter=" + this.l + ", storyConverter=" + this.m + ", contactsManager=" + this.n + ", historyAttachesActionsDelegate=" + this.o + ", reactionAssetsLoader=" + this.p + ", credentialsProviderFactory=" + this.q + ')';
    }
}
