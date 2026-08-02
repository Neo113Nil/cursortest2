package xsna;

import com.vk.clips.design.view.sidecontrols.side.reactions.ReactionsLoading;
import com.vk.clips.tool.view.viewer.feed.list.clip.ClipFeedSideControlsView;
import xsna.v1t0;

/* compiled from: ClipFeedItemSideControlsReducer.kt */
/* loaded from: classes17.dex */
public final class rwc {
    public final ClipFeedSideControlsView.d a;
    public final swc b = new swc();
    public n7e c;

    public rwc(n7e n7eVar, ClipFeedSideControlsView.d dVar) {
        this.a = dVar;
        this.c = n7eVar;
    }

    public final void a(ReactionsLoading reactionsLoading) {
        n7e n7eVar = this.c;
        pwc pwcVar = this.b.a;
        q6f0 q6f0Var = n7eVar.a;
        pwcVar.getClass();
        q6f0 a = q6f0Var.c == reactionsLoading ? q6f0Var : q6f0.a(q6f0Var, null, null, reactionsLoading, 3);
        if (!q6f0Var.equals(a)) {
            n7eVar = n7e.a(n7eVar, a, null, 30);
        }
        c(n7eVar);
    }

    public final void b(v1t0.b bVar) {
        n7e n7eVar = this.c;
        pwc pwcVar = this.b.a;
        q6f0 q6f0Var = n7eVar.a;
        mwc mwcVar = (mwc) pwcVar.c;
        zbn zbnVar = q6f0Var.b;
        mwcVar.getClass();
        ybn ybnVar = zbnVar.b;
        boolean z = ybnVar.c;
        boolean z2 = bVar.a;
        zbn zbnVar2 = z == z2 ? zbnVar : new zbn(zbnVar.a, new ybn(ybnVar.a, ybnVar.b, z2));
        q6f0 a = (epx.f(zbnVar, zbnVar2) && q6f0Var.c == ReactionsLoading.NONE) ? q6f0Var : q6f0.a(q6f0Var, null, zbnVar2, ReactionsLoading.NONE, 1);
        if (!q6f0Var.equals(a)) {
            n7eVar = n7e.a(n7eVar, a, null, 30);
        }
        c(n7eVar);
    }

    public final void c(n7e n7eVar) {
        this.c = n7eVar;
        this.a.invoke(n7eVar);
    }
}
