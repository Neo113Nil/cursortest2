package xsna;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import com.vk.bridges.di.ImBridgeComponent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.dto.call_member.CallMemberId;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.smu0;
import xsna.zew0;

/* compiled from: VoipBottomSheetDialog.kt */
/* loaded from: classes7.dex */
public final class yew0 implements smu0.a {
    public final /* synthetic */ zew0.b a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ zew0 c;

    public yew0(zew0.b bVar, Context context, zew0 zew0Var) {
        this.a = bVar;
        this.b = context;
        this.c = zew0Var;
    }

    @Override // xsna.smu0.a
    public final void a() {
        gzs<s3q0> gzsVar;
        evw0 evw0Var;
        gvw0 gvw0Var;
        gvw0 gvw0Var2;
        zew0.b bVar = this.a;
        boolean z = bVar instanceof zew0.b.g;
        zew0 zew0Var = this.c;
        if (z) {
            zew0.a aVar = zew0.k1;
            long j = ((zew0.b.g) bVar).b;
            o0w b = ((ImBridgeComponent) ((k7m) m7m.f(com.vk.voip.ui.c.b)).a(fpf0.a(ImBridgeComponent.class))).g5().b();
            Class<? extends FragmentImpl> D = b.D();
            Context context = this.b;
            Intent j2 = o0w.j(b, context, null, j, null, null, "voip", D, null, 100261882);
            j2.setFlags(335544320);
            context.startActivity(j2);
            com.vk.voip.ui.c.j0().A0();
            gzs<s3q0> gzsVar2 = zew0Var.j1;
            if (gzsVar2 != null) {
                gzsVar2.invoke();
                return;
            }
            return;
        }
        if (bVar instanceof zew0.b.f) {
            gzs<s3q0> gzsVar3 = zew0Var.j1;
            if (gzsVar3 != null) {
                gzsVar3.invoke();
                return;
            }
            return;
        }
        byte b2 = 0;
        if (bVar instanceof zew0.b.c) {
            zew0.a aVar2 = zew0.k1;
            LayoutInflater.Factory kn = zew0Var.kn();
            evw0Var = kn instanceof evw0 ? (evw0) kn : null;
            if (evw0Var == null || (gvw0Var2 = evw0Var.getPermissions()) == null) {
                gvw0Var2 = new gvw0(zew0Var.requireContext(), new ivw0());
            }
            gvw0Var2.h(new a8j0(13), new u8c(b2, 6));
            return;
        }
        if (bVar instanceof zew0.b.d) {
            zew0.a aVar3 = zew0.k1;
            CallMemberId callMemberId = ((zew0.b.d) bVar).b;
            com.vk.voip.ui.c.b.getClass();
            if (com.vk.voip.ui.c.p0()) {
                com.vk.voip.ui.c.r.getClass();
                Conversation conversation = OKVoipEngine.E.getConversation();
                if (conversation != null) {
                    conversation.grantRoles(mnh0.H(callMemberId), false, CallParticipant.Role.ADMIN);
                }
                com.vk.voip.ui.c.j0().q0();
                return;
            }
            return;
        }
        if (!(bVar instanceof zew0.b.C4176b)) {
            if (!(bVar instanceof zew0.b.a) || (gzsVar = zew0Var.j1) == null) {
                return;
            }
            gzsVar.invoke();
            return;
        }
        zew0.a aVar4 = zew0.k1;
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        LayoutInflater.Factory kn2 = zew0Var.kn();
        evw0Var = kn2 instanceof evw0 ? (evw0) kn2 : null;
        if (evw0Var == null || (gvw0Var = evw0Var.getPermissions()) == null) {
            gvw0Var = new gvw0(zew0Var.requireContext(), new ivw0());
        }
        q0s0 q0s0Var = new q0s0(7);
        cVar.getClass();
        com.vk.voip.ui.c.s1(gvw0Var, q0s0Var);
    }

    @Override // xsna.smu0.a
    public final void b() {
    }

    @Override // xsna.smu0.a
    public final void onCancel() {
    }
}
