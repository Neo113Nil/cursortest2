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

/* compiled from: MsgListAdapterCallback.kt */
/* loaded from: classes2.dex */
public interface pk30 {
    void A(Peer peer, boolean z, Attach attach);

    void B(Peer peer, boolean z);

    void C(int i);

    void D();

    void E();

    void F(StoryEntry storyEntry);

    void G(Peer peer);

    void H(int i);

    void I(boolean z);

    void J(Msg msg, int i);

    void K(Action action);

    void L(Peer peer);

    void M(Attach attach, Msg msg, NestedMsg nestedMsg);

    void N(Msg msg, int i);

    void O(Attach attach);

    void P(String str);

    void R(Attach attach, Msg msg, NestedMsg nestedMsg);

    void S(Attach attach, Boolean bool, long j);

    void T(Msg msg, StickerItem stickerItem);

    void U(Msg msg, sz30 sz30Var);

    void V(Msg msg, com.vk.im.engine.models.messages.a aVar, AttachAudioMsg attachAudioMsg, float f);

    void W(Msg msg, com.vk.im.engine.models.messages.a aVar, AttachAudioMsg attachAudioMsg);

    void X(Attach attach, Msg msg, NestedMsg nestedMsg);

    void Y(Msg msg);

    void Z(Attach attach);

    void a(MsgSendSource.b bVar);

    void a0(Msg msg, NestedMsg nestedMsg, AttachWithTranscription attachWithTranscription);

    void b();

    void b0(int i);

    void c(int i, View view);

    void d(int i, String str);

    void e(List<Integer> list);

    void f(Msg msg, NestedMsg nestedMsg);

    void g(int i);

    void h(List<Integer> list);

    void i(List<AudioTrack> list, AudioTrack audioTrack, Long l);

    void j(Msg msg);

    void k(Attach attach);

    void l(Msg msg, com.vk.im.engine.models.messages.a aVar, AttachAudioMsg attachAudioMsg);

    void m(Peer peer);

    void o(ImageList imageList, Msg msg, int i);

    void p();

    void q(Msg msg, AttachWithTranscription attachWithTranscription, boolean z);

    void r(Attach attach);

    void t();

    void u(Attach attach);

    void v(biu biuVar);

    void w(com.vk.im.engine.models.messages.a aVar);

    void x(uh30 uh30Var);

    void y();

    void z(int i);

    default void s(int i, String str) {
    }
}
