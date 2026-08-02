package xsna;

import android.view.View;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.im.engine.internal.api_commands.friends.FriendsAddApiCmd;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgSendSource;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.external.AudioTrack;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import xsna.vm30;

/* compiled from: MsgListVcCallback.kt */
/* loaded from: classes2.dex */
public interface ym30 {

    /* compiled from: MsgListVcCallback.kt */
    public interface a {
        void a(Collection<? extends Msg> collection);
    }

    void C(int i);

    void C0();

    void D0();

    void J(Msg msg, int i);

    void L();

    void M(Attach attach, Msg msg, NestedMsg nestedMsg);

    void N(Msg msg, int i);

    void O(Attach attach);

    void Q(Msg msg, sz30 sz30Var);

    void R(Attach attach, Msg msg, NestedMsg nestedMsg);

    void S();

    void T(ug30 ug30Var, Msg msg);

    void U(Attach attach, Msg msg, NestedMsg nestedMsg);

    void V(float f);

    void X(qtd0 qtd0Var, FriendsAddApiCmd.Source source, FriendsAddApiCmd.BlockType blockType);

    void Z(Msg msg, StickerItem stickerItem);

    void a(MsgSendSource.b bVar);

    void a0();

    void b();

    void c0();

    void d0(Collection<? extends Msg> collection, Map<Msg, vm30.e> map);

    void e(List<Integer> list);

    void e0(Collection<? extends Msg> collection, boolean z);

    void f(Msg msg, NestedMsg nestedMsg);

    void g(int i);

    void h(List<Integer> list);

    void h0(qtd0 qtd0Var);

    void i(List<AudioTrack> list, AudioTrack audioTrack, Long l);

    void i0();

    void j(Msg msg);

    void j0(Attach attach);

    void k(Attach attach);

    void k0(Msg msg, Integer num);

    void l(Msg msg, com.vk.im.engine.models.messages.a aVar, AttachAudioMsg attachAudioMsg);

    void l0();

    void n(Msg msg);

    void o0();

    void p();

    void p0(Group group, View view);

    void q(Msg msg, AttachWithTranscription attachWithTranscription, boolean z);

    void q0(Msg msg);

    void s0();

    void t();

    void t0(Msg msg);

    void u(Attach attach);

    void u0(int i);

    int v0(Direction direction);

    void w(com.vk.im.engine.models.messages.a aVar);

    void w0();

    void x(uh30 uh30Var);

    void x0();

    void y();

    void y0(Msg msg, AttachWithTranscription attachWithTranscription);

    void z0(String str, Direction direction);

    default void A0() {
    }

    default void B0() {
    }

    default void D() {
    }

    default void E() {
    }

    default void W() {
    }

    default void Y() {
    }

    default void b0() {
    }

    default void m0() {
    }

    default void r0() {
    }

    default void E0(String str) {
    }

    default void F(StoryEntry storyEntry) {
    }

    default void G(Peer peer) {
    }

    default void H(int i) {
    }

    default void I(boolean z) {
    }

    default void K(Action action) {
    }

    default void P(String str) {
    }

    default void f0(View view) {
    }

    default void g0(Msg msg) {
    }

    default void m(Peer peer) {
    }

    default void r(Attach attach) {
    }

    default void v(biu biuVar) {
    }

    default void z(int i) {
    }

    default void B(Peer peer, boolean z) {
    }

    default void c(int i, View view) {
    }

    default void d(int i, String str) {
    }

    default void s(int i, String str) {
    }

    default void A(Peer peer, boolean z, Attach attach) {
    }

    default void n0(Attach attach, Boolean bool, long j) {
    }

    default void o(ImageList imageList, Msg msg, int i) {
    }
}
