package xsna;

import android.view.View;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.common.Peer;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgSendSource;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.external.AudioTrack;
import java.util.List;
import xsna.ug30;

/* compiled from: AdapterCallbackImpl.kt */
/* loaded from: classes2.dex */
public final class kj0 implements pk30 {
    public final vm30 a;

    public kj0(vm30 vm30Var) {
        this.a = vm30Var;
    }

    @Override // xsna.pk30
    public final void A(Peer peer, boolean z, Attach attach) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.A(peer, z, attach);
        }
    }

    @Override // xsna.pk30
    public final void B(Peer peer, boolean z) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.B(peer, z);
        }
    }

    @Override // xsna.pk30
    public final void C(int i) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.C(i);
        }
    }

    @Override // xsna.pk30
    public final void D() {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.D();
        }
    }

    @Override // xsna.pk30
    public final void E() {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.E();
        }
    }

    @Override // xsna.pk30
    public final void F(StoryEntry storyEntry) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.F(storyEntry);
        }
    }

    @Override // xsna.pk30
    public final void G(Peer peer) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.G(peer);
        }
    }

    @Override // xsna.pk30
    public final void H(int i) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.H(i);
        }
    }

    @Override // xsna.pk30
    public final void I(boolean z) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.I(z);
        }
    }

    @Override // xsna.pk30
    public final void J(Msg msg, int i) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.J(msg, i);
        }
    }

    @Override // xsna.pk30
    public final void K(Action action) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.K(action);
        }
    }

    @Override // xsna.pk30
    public final void L(Peer peer) {
        vm30 vm30Var = this.a;
        ym30 ym30Var = vm30Var.t0;
        if (ym30Var != null) {
            ym30Var.T(new ug30.c0(peer, vm30Var.h0.l), null);
        }
    }

    @Override // xsna.pk30
    public final void M(Attach attach, Msg msg, NestedMsg nestedMsg) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.M(attach, msg, nestedMsg);
        }
    }

    @Override // xsna.pk30
    public final void N(Msg msg, int i) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.N(msg, i);
        }
    }

    @Override // xsna.pk30
    public final void O(Attach attach) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.O(attach);
        }
    }

    @Override // xsna.pk30
    public final void P(String str) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.P(str);
        }
    }

    @Override // xsna.pk30
    public final void R(Attach attach, Msg msg, NestedMsg nestedMsg) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.R(attach, msg, nestedMsg);
        }
    }

    @Override // xsna.pk30
    public final void S(Attach attach, Boolean bool, long j) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.n0(attach, bool, j);
        }
    }

    @Override // xsna.pk30
    public final void T(Msg msg, StickerItem stickerItem) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.Z(msg, stickerItem);
        }
    }

    @Override // xsna.pk30
    public final void U(Msg msg, sz30 sz30Var) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.Q(msg, sz30Var);
        }
    }

    @Override // xsna.pk30
    public final void V(Msg msg, com.vk.im.engine.models.messages.a aVar, AttachAudioMsg attachAudioMsg, float f) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.V(f);
        }
    }

    @Override // xsna.pk30
    public final void W(Msg msg, com.vk.im.engine.models.messages.a aVar, AttachAudioMsg attachAudioMsg) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.c0();
        }
    }

    @Override // xsna.pk30
    public final void X(Attach attach, Msg msg, NestedMsg nestedMsg) {
        vm30 vm30Var = this.a;
        awt0.p(vm30Var.t);
        ym30 ym30Var = vm30Var.t0;
        if (ym30Var != null) {
            ym30Var.U(attach, msg, nestedMsg);
        }
    }

    @Override // xsna.pk30
    public final void Y(Msg msg) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.n(msg);
        }
    }

    @Override // xsna.pk30
    public final void Z(Attach attach) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.j0(attach);
        }
    }

    @Override // xsna.pk30
    public final void a(MsgSendSource.b bVar) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.a(bVar);
        }
    }

    @Override // xsna.pk30
    public final void a0(Msg msg, NestedMsg nestedMsg, AttachWithTranscription attachWithTranscription) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.y0(msg, attachWithTranscription);
        }
    }

    @Override // xsna.pk30
    public final void b() {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.b();
        }
    }

    @Override // xsna.pk30
    public final void b0(int i) {
        vm30 vm30Var = this.a;
        awt0.p(vm30Var.t);
        ym30 ym30Var = vm30Var.t0;
        if (ym30Var != null) {
            ym30Var.u0(i);
        }
    }

    @Override // xsna.pk30
    public final void c(int i, View view) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.c(i, view);
        }
    }

    @Override // xsna.pk30
    public final void d(int i, String str) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.d(i, str);
        }
    }

    @Override // xsna.pk30
    public final void e(List<Integer> list) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.e(list);
        }
    }

    @Override // xsna.pk30
    public final void f(Msg msg, NestedMsg nestedMsg) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.f(msg, nestedMsg);
        }
    }

    @Override // xsna.pk30
    public final void g(int i) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.g(i);
        }
    }

    @Override // xsna.pk30
    public final void h(List<Integer> list) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.h(list);
        }
    }

    @Override // xsna.pk30
    public final void i(List<AudioTrack> list, AudioTrack audioTrack, Long l) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.i(list, audioTrack, l);
        }
    }

    @Override // xsna.pk30
    public final void j(Msg msg) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.j(msg);
        }
    }

    @Override // xsna.pk30
    public final void k(Attach attach) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.k(attach);
        }
    }

    @Override // xsna.pk30
    public final void l(Msg msg, com.vk.im.engine.models.messages.a aVar, AttachAudioMsg attachAudioMsg) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.l(msg, aVar, attachAudioMsg);
        }
    }

    @Override // xsna.pk30
    public final void m(Peer peer) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.m(peer);
        }
    }

    @Override // xsna.pk30
    public final void o(ImageList imageList, Msg msg, int i) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.o(imageList, msg, i);
        }
    }

    @Override // xsna.pk30
    public final void p() {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.p();
        }
    }

    @Override // xsna.pk30
    public final void q(Msg msg, AttachWithTranscription attachWithTranscription, boolean z) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.q(msg, attachWithTranscription, z);
        }
    }

    @Override // xsna.pk30
    public final void r(Attach attach) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.r(attach);
        }
    }

    @Override // xsna.pk30
    public final void s(int i, String str) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.s(i, str);
        }
    }

    @Override // xsna.pk30
    public final void t() {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.t();
        }
    }

    @Override // xsna.pk30
    public final void u(Attach attach) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.u(attach);
        }
    }

    @Override // xsna.pk30
    public final void v(biu biuVar) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.v(biuVar);
        }
    }

    @Override // xsna.pk30
    public final void w(com.vk.im.engine.models.messages.a aVar) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.w(aVar);
        }
    }

    @Override // xsna.pk30
    public final void x(uh30 uh30Var) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.x(uh30Var);
        }
    }

    @Override // xsna.pk30
    public final void y() {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.y();
        }
    }

    @Override // xsna.pk30
    public final void z(int i) {
        ym30 ym30Var = this.a.t0;
        if (ym30Var != null) {
            ym30Var.z(i);
        }
    }
}
