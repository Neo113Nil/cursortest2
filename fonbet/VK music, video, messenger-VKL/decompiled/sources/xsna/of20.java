package xsna;

import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.Collection;

/* compiled from: MessagesInteractor.kt */
/* loaded from: classes16.dex */
public interface of20 {
    io.reactivex.rxjava3.internal.operators.single.f0 a(MsgFromChannel msgFromChannel, ChannelMsgSendConfig channelMsgSendConfig);

    io.reactivex.rxjava3.internal.operators.completable.y b(Collection collection);

    io.reactivex.rxjava3.internal.operators.completable.p c(Msg msg, ChannelType channelType);

    void d(int i);

    io.reactivex.rxjava3.core.a e(MsgFromChannel msgFromChannel, ChannelType channelType);
}
