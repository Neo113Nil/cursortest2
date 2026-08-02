package xsna;

import android.view.View;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;

/* compiled from: MessagesInteractionHandler.kt */
/* loaded from: classes16.dex */
public interface nf20 {
    void V(uh30 uh30Var);

    void b();

    default void L(Peer peer) {
    }

    default void R(Msg msg) {
    }

    default void S(Msg msg) {
    }

    default void T(int i) {
    }

    default void U(Msg msg) {
    }

    default void Y(Msg msg) {
    }

    default void n(Msg msg) {
    }

    default void Q(Msg msg, sz30 sz30Var) {
    }

    default void W(Msg msg, NestedMsg nestedMsg, Attach attach, View view) {
    }

    default void X(Msg msg, NestedMsg nestedMsg, Attach attach, View view) {
    }
}
