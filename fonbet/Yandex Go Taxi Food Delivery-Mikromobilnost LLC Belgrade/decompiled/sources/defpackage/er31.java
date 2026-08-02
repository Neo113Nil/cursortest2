package defpackage;

import com.yandex.messaging.core.net.entities.GetUrlPreviewResponse;
import com.yandex.messaging.core.net.entities.MentionedUserDto;
import com.yandex.messaging.core.net.entities.UrlPreviewChatDto;
import com.yandex.messaging.core.net.entities.UrlPreviewDto;
import com.yandex.messaging.core.net.entities.UrlPreviewImageDto;
import com.yandex.messaging.core.net.entities.UrlPreviewMessageDto;
import com.yandex.messaging.core.net.entities.UrlPreviewUserDto;
import com.yandex.messaging.core.net.entities.UrlPreviewVideoDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes5.dex */
public abstract class er31 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    public static ye0 a(GetUrlPreviewResponse getUrlPreviewResponse) {
        UrlPreviewUserDto user;
        ?? r3;
        UrlPreviewVideoDto video;
        String url = getUrlPreviewResponse.getUrl();
        if (url == null) {
            return null;
        }
        UrlPreviewDto preview = getUrlPreviewResponse.getPreview();
        String source = (preview == null || (video = preview.getVideo()) == null) ? null : video.getSource();
        if (source != null) {
            UrlPreviewDto preview2 = getUrlPreviewResponse.getPreview();
            if (preview2 == null) {
                return null;
            }
            String title = preview2.getTitle();
            String description = preview2.getDescription();
            UrlPreviewImageDto image = preview2.getImage();
            String source2 = image != null ? image.getSource() : null;
            UrlPreviewImageDto image2 = preview2.getImage();
            Integer width = image2 != null ? image2.getWidth() : null;
            UrlPreviewImageDto image3 = preview2.getImage();
            return new qh21(source, title, description, source2, source, width, image3 != null ? image3.getHeight() : null);
        }
        if (getUrlPreviewResponse.getPreview() != null) {
            UrlPreviewDto preview3 = getUrlPreviewResponse.getPreview();
            if (preview3 == null) {
                return null;
            }
            String title2 = preview3.getTitle();
            String description2 = preview3.getDescription();
            String turboLink = preview3.getTurboLink();
            UrlPreviewImageDto image4 = preview3.getImage();
            String source3 = image4 != null ? image4.getSource() : null;
            UrlPreviewImageDto image5 = preview3.getImage();
            Integer width2 = image5 != null ? image5.getWidth() : null;
            UrlPreviewImageDto image6 = preview3.getImage();
            return new lh21(url, title2, description2, turboLink, source3, width2, image6 != null ? image6.getHeight() : null);
        }
        if (getUrlPreviewResponse.getChat() != null) {
            UrlPreviewChatDto chat = getUrlPreviewResponse.getChat();
            if (chat != null) {
                return new jh21(url, chat.getChatId(), chat.getInviteHash(), chat.getChatName(), chat.getDescription(), chat.getAvatarId(), chat.getMemberCount());
            }
            return null;
        }
        if (getUrlPreviewResponse.getMessage() == null) {
            if (getUrlPreviewResponse.getUser() == null || (user = getUrlPreviewResponse.getUser()) == null) {
                return null;
            }
            String guid = user.getGuid();
            String displayName = user.getDisplayName();
            String phoneId = user.getPhoneId();
            String avatarId = user.getAvatarId();
            user.getGender();
            Long lastSeen = user.getLastSeen();
            return new oh21(url, guid, displayName, avatarId, phoneId, lastSeen != null ? Long.valueOf(lastSeen.longValue() / 1000) : null);
        }
        UrlPreviewMessageDto message = getUrlPreviewResponse.getMessage();
        if (message == null) {
            return null;
        }
        UrlPreviewUserDto user2 = message.getUser();
        List<MentionedUserDto> mentionedUsers = message.getMentionedUsers();
        if (mentionedUsers != null) {
            List<MentionedUserDto> list = mentionedUsers;
            r3 = new ArrayList(tcc.n(list, 10));
            for (MentionedUserDto mentionedUserDto : list) {
                r3.add(new mh21(mentionedUserDto.getGuid(), mentionedUserDto.getPhoneId(), mentionedUserDto.getDisplayName()));
            }
        } else {
            r3 = EmptyList.a;
        }
        List list2 = r3;
        if (user2 == null) {
            return new kh21(url, message.getText(), message.getTimestamp(), list2, message.getChat().getAvatarId(), message.getChat().getChatId(), message.getChat().getInviteHash(), message.getChat().getChatName());
        }
        String text = message.getText();
        long timestamp = message.getTimestamp();
        String avatarId2 = user2.getAvatarId();
        String chatId = message.getChat().getChatId();
        String inviteHash = message.getChat().getInviteHash();
        String guid2 = user2.getGuid();
        String phoneId2 = user2.getPhoneId();
        String displayName2 = user2.getDisplayName();
        user2.getGender();
        return new ph21(url, text, timestamp, list2, avatarId2, chatId, inviteHash, guid2, phoneId2, displayName2);
    }

    public static final lum b(sls slsVar, boolean z) {
        return new lum(new vu30(29), d990.a, new j4j(slsVar, z), e990.a);
    }
}
