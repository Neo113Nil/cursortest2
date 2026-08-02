package defpackage;

import com.yandex.messaging.internal.ChatAlias;
import com.yandex.messaging.internal.CreateChannel;
import com.yandex.messaging.internal.CreateFamilyChat;
import com.yandex.messaging.internal.CreateGroupChat;
import com.yandex.messaging.internal.ExistingChat;
import com.yandex.messaging.internal.InviteChat;
import com.yandex.messaging.internal.InviteThread;
import com.yandex.messaging.internal.PrivateChat;
import com.yandex.messaging.internal.StaffChat;
import com.yandex.messaging.internal.ThreadChat;

/* loaded from: classes15.dex */
public interface k8b {
    Object c(ExistingChat existingChat);

    Object j(CreateChannel createChannel);

    Object k(InviteThread inviteThread);

    Object m(InviteChat inviteChat);

    Object n(StaffChat staffChat);

    Object p(ChatAlias chatAlias);

    Object t(ThreadChat threadChat);

    Object u(CreateFamilyChat createFamilyChat);

    Object v();

    Object w(CreateGroupChat createGroupChat);

    Object z(PrivateChat privateChat);
}
