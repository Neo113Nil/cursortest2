package xsna;

import com.vk.log.L;
import com.vk.voip.OKVoipEngine;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import xsna.a7f0;
import xsna.flx0;
import xsna.j9d0;
import xsna.mlx0;
import xsna.nlx0;
import xsna.nlx0.a;
import xsna.nlx0.b;
import xsna.slx0;

/* compiled from: WhiteboardFeature.kt */
/* loaded from: classes7.dex */
public final class plx0 extends wk50<com.vk.voip.ui.whiteboard.presentation.main.ui.b, qlx0, flx0, slx0> {
    public final fhw0 f;
    public final bpn0 g;
    public final bpn0 h;
    public final bpn0 i;
    public final nlx0 j;
    public final f4z k;

    public plx0(fhw0 fhw0Var, bpn0 bpn0Var, bpn0 bpn0Var2, bpn0 bpn0Var3) {
        super(flx0.d.b, new xlx0());
        this.f = fhw0Var;
        this.g = bpn0Var;
        this.h = bpn0Var2;
        this.i = bpn0Var3;
        nlx0 nlx0Var = new nlx0();
        nlx0.b bVar = nlx0Var.new b();
        nlx0.a aVar = nlx0Var.new a();
        r3y.a("VKWebAppBottomMenuWillOpen", bVar);
        r3y.a("VKWebAppBottomMenuWillClose", aVar);
        this.j = nlx0Var;
        this.k = new f4z();
    }

    @Override // xsna.wk50
    public final void N(qlx0 qlx0Var, flx0 flx0Var) {
        qlx0 qlx0Var2 = qlx0Var;
        flx0 flx0Var2 = flx0Var;
        fhw0 fhw0Var = this.f;
        if (fhw0Var.isInitialized() || (flx0Var2 instanceof flx0.d)) {
            if (flx0Var2.equals(flx0.d.b)) {
                a7f0.a.d(this, fhw0Var.a(), null, new wi3(L.a, 15), new vgb0(0, this, plx0.class, "initWhiteboardFeature", "initWhiteboardFeature()V", 0, 4), 1);
                return;
            }
            if (flx0Var2.equals(flx0.e.b)) {
                T(new slx0.b(!qlx0Var2.c));
                return;
            }
            if (!(flx0Var2 instanceof flx0.a)) {
                if (flx0Var2.equals(flx0.b.b)) {
                    this.k.b(mlx0.a.a);
                    return;
                } else {
                    if (!flx0Var2.equals(flx0.c.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    L.A("WhiteboardFeature", "end call declineOrHang");
                    a7f0.a.f(this, new io.reactivex.rxjava3.internal.operators.single.v(new gca(this, 3)).q(asu0.a.d()), null, null, 7);
                    return;
                }
            }
            ilx0 ilx0Var = (ilx0) this.h.getValue();
            j9d0 j9d0Var = ((flx0.a) flx0Var2).b;
            gvw0 gvw0Var = ilx0Var.a;
            if (j9d0Var.equals(j9d0.h.a)) {
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.A(!(com.vk.voip.ui.c.r.getParticipantStatesManager() != null ? r1.isOwnHandRaised() : false));
                return;
            }
            if (j9d0Var.equals(j9d0.g.a)) {
                com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                cVar.getClass();
                if (com.vk.voip.ui.c.z0()) {
                    cVar.q1();
                    return;
                }
                MediaOptionState videoState = OKVoipEngine.b.getMediaOptionsForCurrentUser().getVideoState();
                if (videoState != MediaOptionState.MUTED_PERMANENT) {
                    com.vk.voip.ui.c.s1(gvw0Var, null);
                    return;
                }
                htb0 htb0Var = ilx0Var.c;
                if (htb0Var != null) {
                    Boolean bool = Boolean.FALSE;
                    htb0Var.invoke(null, videoState, bool, bool);
                    return;
                }
                return;
            }
            if (j9d0Var.equals(j9d0.f.a)) {
                com.vk.voip.ui.c.k1(com.vk.voip.ui.c.b);
                return;
            }
            if (!j9d0Var.equals(j9d0.i.a)) {
                if (j9d0Var.equals(j9d0.j.a)) {
                    com.vk.voip.ui.c.b.getClass();
                    com.vk.voip.ui.c.l1();
                    return;
                }
                return;
            }
            com.vk.voip.ui.c cVar2 = com.vk.voip.ui.c.b;
            cVar2.getClass();
            if (com.vk.voip.ui.c.v) {
                cVar2.A0();
                return;
            }
            MediaOptionState audioState = OKVoipEngine.b.getMediaOptionsForCurrentUser().getAudioState();
            if (audioState != MediaOptionState.MUTED_PERMANENT) {
                com.vk.voip.ui.c.C0(cVar2, gvw0Var);
                return;
            }
            htb0 htb0Var2 = ilx0Var.c;
            if (htb0Var2 != null) {
                Boolean bool2 = Boolean.FALSE;
                htb0Var2.invoke(audioState, null, bool2, bool2);
            }
        }
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.j.getClass();
        r3y.c("VKWebAppBottomMenuWillOpen");
        r3y.c("VKWebAppBottomMenuWillClose");
    }
}
