package xsna;

import com.vk.dto.common.Direction;
import com.vk.im.engine.models.ConversationCard;
import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;

/* compiled from: MsgItemContentBuilder.kt */
/* loaded from: classes2.dex */
public interface ik30 {
    rvr0 a(long j, uk30 uk30Var);

    nsr0 b(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2, uk30 uk30Var);

    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.h c(ConversationCard conversationCard, uk30 uk30Var);

    wur0 d(ConversationCard conversationCard, uk30 uk30Var);

    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.e e(ConversationCard conversationCard, uk30 uk30Var);

    xqr0 f(long j, uk30 uk30Var);

    ArrayList g(Msg msg, uk30 uk30Var);

    lvr0 h(Direction direction, Msg msg, uk30 uk30Var);
}
