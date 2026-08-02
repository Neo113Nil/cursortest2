package xsna;

import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.VoipAudioManager;
import com.vk.voip.ui.VoipViewModelState;
import xsna.va9;

/* compiled from: VoipVmojiDelegate.kt */
/* loaded from: classes7.dex */
public final class r5x0 extends va9 {
    public final com.vk.voip.ui.c s;

    /* compiled from: VoipVmojiDelegate.kt */
    public static final class a {
        public final com.vk.voip.ui.c a;

        public a(com.vk.voip.ui.c cVar) {
            this.a = cVar;
        }

        public final boolean a() {
            this.a.getClass();
            return com.vk.voip.ui.c.r0();
        }

        public final io.reactivex.rxjava3.internal.operators.observable.j1 b() {
            this.a.getClass();
            return com.vk.voip.ui.c.H0(true).U(new uxb0(new kul0(6), 21));
        }
    }

    /* compiled from: VoipVmojiDelegate.kt */
    public static final class b {
        public final com.vk.voip.ui.c a;
        public final VoipAudioManager b;

        public b(com.vk.voip.ui.c cVar, VoipAudioManager voipAudioManager) {
            this.a = cVar;
            this.b = voipAudioManager;
        }
    }

    /* compiled from: VoipVmojiDelegate.kt */
    public static final class c implements va9.e {
        public final pvw0 a;

        public c(pvw0 pvw0Var) {
            this.a = pvw0Var;
        }

        @Override // xsna.va9.e
        public final void e() {
            this.a.e();
        }

        @Override // xsna.va9.e
        public final void g() {
            this.a.g();
        }

        @Override // xsna.va9.e
        public final void h() {
            this.a.P0();
        }
    }

    public r5x0(chr0 chr0Var, com.vk.voip.ui.c cVar, com.vk.voip.ui.a aVar) {
        super(com.vk.voip.ui.c.r, chr0Var, new b(cVar, aVar), new a(cVar), new bpn0(new hsv0(cVar, 5)), com.vk.voip.ui.c.n0);
        this.s = cVar;
    }

    @Override // xsna.va9
    public final boolean e() {
        zqk0 zqk0Var;
        xdw0 xdw0Var;
        this.s.getClass();
        CallMemberId a2 = com.vk.voip.ui.c.r.a();
        if (a2 != null) {
            Long n = arm0.n(a2.b);
            if ((n != null ? n.longValue() : 0L) > 0) {
                com.vk.voip.ui.c.b.getClass();
                if (!com.vk.voip.ui.c.J().h() && (((zqk0Var = com.vk.voip.ui.c.P) == null || (xdw0Var = zqk0Var.k) == null || !xdw0Var.h) && com.vk.voip.ui.c.r0())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xsna.va9
    public final boolean f() {
        if (!this.d.a()) {
            return false;
        }
        if (com.vk.voip.ui.c.b.s0()) {
            return true;
        }
        return (com.vk.voip.ui.c.K0 == VoipViewModelState.CallingPeer || com.vk.voip.ui.c.K0 == VoipViewModelState.ReceivingCallFromPeer) ? false : true;
    }
}
