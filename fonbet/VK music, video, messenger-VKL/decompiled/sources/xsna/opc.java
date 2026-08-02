package xsna;

import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import kotlin.NoWhenBranchMatchedException;
import xsna.g0o;
import xsna.npc;

/* compiled from: ClipCtaWithDonutMviReducer.kt */
/* loaded from: classes16.dex */
public final class opc implements bm50<ppc, npc> {
    @Override // xsna.bm50
    public final ppc a(ppc ppcVar, npc npcVar) {
        ppc ppcVar2 = ppcVar;
        npc npcVar2 = npcVar;
        if (npcVar2 instanceof npc.b) {
            return ppc.a(ppcVar2, null, new g0o.a(((npc.b) npcVar2).a), false, 495);
        }
        if (npcVar2 instanceof npc.c) {
            ClipInvolvementActionButton<?> clipInvolvementActionButton = ((npc.c) npcVar2).a;
            return ppc.a(ppcVar2, clipInvolvementActionButton, null, clipInvolvementActionButton != null, 478);
        }
        if (npcVar2.equals(npc.a.a)) {
            return ppc.a(ppcVar2, null, null, false, 478);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(npc npcVar) {
        return true;
    }
}
