package com.yandex.messaging.core.net.entities;

import com.yandex.messaging.core.net.entities.proto.MeetingUpdatedData;
import com.yandex.messaging.core.net.entities.proto.YouAddedToThreadData;
import com.yandex.messaging.core.net.entities.proto.YouRemovedFromThreadData;

/* loaded from: classes15.dex */
public interface StateSyncDiff {

    public interface Handler {
        void a(PinnedChatsBucket pinnedChatsBucket);

        void b(MiniappsBucket miniappsBucket);

        void c(MeetingUpdatedData meetingUpdatedData);

        void d(StickerPacksBucket stickerPacksBucket);

        void e(RestrictionsBucket restrictionsBucket);

        void f(ChatRoleChangedData chatRoleChangedData);

        void g(ChatMutingsBucket chatMutingsBucket);

        void h(FoldersBucket foldersBucket);

        void i(PrivacyBucket privacyBucket);

        void j(UserStatusPresetBucket userStatusPresetBucket);

        void k(HiddenPrivateChatsBucket hiddenPrivateChatsBucket);

        void l(PreferencesBucket preferencesBucket);

        void m(UserReloadData userReloadData);

        void n(YouAddedData youAddedData);

        void o(SelfRemovedData selfRemovedData);

        void p(YouAddedToThreadData youAddedToThreadData);

        void q(ChatInfoChangedData chatInfoChangedData);

        void r(YouRemovedFromThreadData youRemovedFromThreadData);
    }

    void sync(Handler handler);
}
