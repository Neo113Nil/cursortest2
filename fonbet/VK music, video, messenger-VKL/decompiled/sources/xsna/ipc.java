package xsna;

import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import java.util.Collections;
import java.util.List;
import xsna.g0o;
import xsna.xpc;

/* compiled from: ClipCtaWithDonutMviBootstrapper.kt */
/* loaded from: classes16.dex */
public final class ipc implements vj50<ppc, on50, xpc, npc> {
    public final dpc a;

    public ipc(dpc dpcVar) {
        this.a = dpcVar;
    }

    @Override // xsna.vj50
    public final ppc a() {
        dpc dpcVar = this.a;
        ClipInvolvementActionButton<?> clipInvolvementActionButton = dpcVar.b;
        return new ppc(clipInvolvementActionButton, dpcVar.c, dpcVar.d, dpcVar.e, dpcVar.h ? g0o.b.a : g0o.c.a, clipInvolvementActionButton != null, dpcVar.f, dpcVar.g, dpcVar.i);
    }

    @Override // xsna.vj50
    public final /* bridge */ /* synthetic */ npc b() {
        return null;
    }

    @Override // xsna.vj50
    public final List<xpc> c(ppc ppcVar) {
        return Collections.singletonList(xpc.a.b);
    }
}
