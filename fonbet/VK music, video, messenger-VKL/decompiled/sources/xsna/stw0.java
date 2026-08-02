package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.admin_change_name.VoipAdminChangeNameConfig;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import xsna.a7f0;
import xsna.b89;
import xsna.buw0;
import xsna.c99;
import xsna.epw0;
import xsna.ptw0;
import xsna.srw0;
import xsna.utw0;
import xsna.wtw0;

/* compiled from: VoipParticipantSettingsFeature.kt */
/* loaded from: classes7.dex */
public final class stw0 extends wk50<duw0, buw0, ptw0, ytw0> {
    public final CallMemberId f;
    public final com.vk.voip.b g;
    public final p490 h;
    public final ttw0 i;
    public final kdw0<mdw0> j;
    public final m99 k;
    public final f4z l;
    public final f4z<wtw0> m;
    public final b79 n;

    public stw0(CallMemberId callMemberId, com.vk.voip.b bVar, p490 p490Var, ttw0 ttw0Var, kdw0 kdw0Var) {
        super(ptw0.a.b, new auw0());
        this.f = callMemberId;
        this.g = bVar;
        this.h = p490Var;
        this.i = ttw0Var;
        this.j = kdw0Var;
        m99 v = p490Var.v();
        v.b(c99.n.a);
        this.k = v;
        this.l = new f4z();
        this.m = new f4z<>();
        this.n = new b79(callMemberId, OKVoipEngine.b);
    }

    @Override // xsna.wk50
    public final void N(buw0 buw0Var, ptw0 ptw0Var) {
        buw0 buw0Var2 = buw0Var;
        ptw0 ptw0Var2 = ptw0Var;
        buw0.b bVar = buw0Var2.e;
        buw0.d dVar = buw0Var2.f;
        boolean z = ptw0Var2 instanceof ptw0.a;
        m99 m99Var = this.k;
        if (z) {
            a7f0.a.e(this, m99Var.f, null, new bjm0(this, 25), new biw0(this, 6), null, 9);
            return;
        }
        if (ptw0Var2 instanceof ptw0.j) {
            m99Var.b(c99.e0.a);
            return;
        }
        boolean z2 = ptw0Var2 instanceof ptw0.e;
        f4z f4zVar = this.l;
        CallMemberId callMemberId = this.f;
        if (z2) {
            UserId Bb = callMemberId.Bb();
            if (Bb == null) {
                return;
            }
            f4zVar.b(new utw0.e(Bb));
            return;
        }
        boolean z3 = ptw0Var2 instanceof ptw0.f;
        kdw0<mdw0> kdw0Var = this.j;
        com.vk.voip.b bVar2 = this.g;
        if (z3) {
            if (dVar.b) {
                ParticipantId H = mnh0.H(callMemberId);
                ParticipantStatesManager participantStatesManager = bVar2.getParticipantStatesManager();
                if (participantStatesManager != null) {
                    participantStatesManager.lowerHandParticipant(H);
                }
                kdw0Var.b(epw0.b.C2832b.a);
                return;
            }
            return;
        }
        boolean z4 = ptw0Var2 instanceof ptw0.h;
        f4z<wtw0> f4zVar2 = this.m;
        if (z4) {
            if (dVar.c) {
                Map<MediaOption, ? extends MediaOptionState> f = on00.f(new Pair(MediaOption.AUDIO, MediaOptionState.UNMUTED_BUT_MUTED_ONCE));
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.b0().b(callMemberId, f);
                kdw0Var.b(new srw0.b.C3687b(srw0.d.b.a, f));
                f4zVar2.b(new wtw0.a(bVar.f));
                return;
            }
            return;
        }
        if (ptw0Var2 instanceof ptw0.m) {
            if (dVar.d) {
                Map<MediaOption, ? extends MediaOptionState> f2 = on00.f(new Pair(MediaOption.VIDEO, MediaOptionState.UNMUTED_BUT_MUTED_ONCE));
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.b0().b(callMemberId, f2);
                kdw0Var.b(new srw0.b.C3687b(srw0.d.b.a, f2));
                f4zVar2.b(new wtw0.b(bVar.f));
                return;
            }
            return;
        }
        if (ptw0Var2 instanceof ptw0.b) {
            f4zVar.b(new utw0.b(callMemberId));
            return;
        }
        if (ptw0Var2 instanceof ptw0.i) {
            if (dVar.e) {
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.n1(callMemberId);
                return;
            } else {
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.Q0(callMemberId);
                return;
            }
        }
        if (ptw0Var2 instanceof ptw0.l) {
            com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
            tr80 tr80Var = new tr80(callMemberId);
            cVar.getClass();
            com.vk.voip.ui.c.S0(tr80Var);
            return;
        }
        if (ptw0Var2 instanceof ptw0.d) {
            if (bVar.c) {
                com.vk.voip.ui.c.b.U0(callMemberId);
                return;
            } else {
                com.vk.voip.ui.c.b.getClass();
                ysg0.b.a(new fr80(callMemberId));
                return;
            }
        }
        if (ptw0Var2 instanceof ptw0.g) {
            bVar2.j(callMemberId, false);
            return;
        }
        if (!(ptw0Var2 instanceof ptw0.k)) {
            if (!(ptw0Var2 instanceof ptw0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            f4zVar.b(new utw0.d(callMemberId));
            f4zVar.b(utw0.a.a);
            return;
        }
        b89.b bVar3 = buw0Var2.g.f;
        if (bVar3 == null) {
            return;
        }
        f4zVar.b(new utw0.c(new VoipAdminChangeNameConfig(bVar3.a, bVar3.e, new VoipAdminChangeNameConfig.ParticipantToChangeName(bVar3.b, bVar3.d, bVar3.c))));
        f4zVar.b(utw0.a.a);
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.h.w();
    }
}
