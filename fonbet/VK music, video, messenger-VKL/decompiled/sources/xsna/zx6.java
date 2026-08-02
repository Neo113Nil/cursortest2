package xsna;

import com.vk.api.generated.friends.dto.FriendsSearchResponseDto;
import com.vk.api.generated.messages.dto.MessagesChatSettingsDto;
import com.vk.api.generated.messages.dto.MessagesChatSettingsPhotoDto;
import com.vk.api.generated.messages.dto.MessagesConversationDto;
import com.vk.api.generated.messages.dto.MessagesConversationPeerTypeDto;
import com.vk.api.generated.messages.dto.MessagesSearchConversationsResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: BestFriendsSearchApiRequest.kt */
/* loaded from: classes4.dex */
public final class zx6 extends com.vk.api.request.rx.batch.a<MessagesSearchConversationsResponseDto, FriendsSearchResponseDto, cts> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    @Override // com.vk.api.request.rx.batch.a
    public final cts K0(bv6<MessagesSearchConversationsResponseDto> bv6Var, bv6<FriendsSearchResponseDto> bv6Var2) {
        ?? r10;
        ?? r1;
        List<UsersUserFullDto> d;
        List<MessagesConversationDto> d2;
        String str;
        MessagesChatSettingsPhotoDto e;
        Integer d3;
        MessagesChatSettingsDto f;
        Integer d4;
        MessagesSearchConversationsResponseDto messagesSearchConversationsResponseDto = bv6Var.a;
        if (messagesSearchConversationsResponseDto == null || (d2 = messagesSearchConversationsResponseDto.d()) == null) {
            r10 = EmptyList.b;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : d2) {
                MessagesConversationDto messagesConversationDto = (MessagesConversationDto) obj;
                if (messagesConversationDto.g().f() == MessagesConversationPeerTypeDto.CHAT && (f = messagesConversationDto.f()) != null && (d4 = f.d()) != null && d4.intValue() > 0) {
                    arrayList.add(obj);
                }
            }
            r10 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MessagesConversationDto messagesConversationDto2 = (MessagesConversationDto) it.next();
                long j = messagesConversationDto2.g().d().b;
                MessagesChatSettingsDto f2 = messagesConversationDto2.f();
                if (f2 == null || (str = f2.getTitle()) == null) {
                    str = "";
                }
                String str2 = str;
                MessagesChatSettingsDto f3 = messagesConversationDto2.f();
                int intValue = (f3 == null || (d3 = f3.d()) == null) ? 0 : d3.intValue();
                MessagesChatSettingsDto f4 = messagesConversationDto2.f();
                r10.add(new ox6(intValue, str2, (f4 == null || (e = f4.e()) == null) ? null : e.g(), j));
            }
        }
        FriendsSearchResponseDto friendsSearchResponseDto = bv6Var2.a;
        if (friendsSearchResponseDto == null || (d = friendsSearchResponseDto.d()) == null) {
            r1 = EmptyList.b;
        } else {
            List<UsersUserFullDto> list = d;
            r1 = new ArrayList(c5g.u(list, 10));
            for (UsersUserFullDto usersUserFullDto : list) {
                Serializer.c<ProfileFriendItem> cVar = ProfileFriendItem.CREATOR;
                r1.add(ProfileFriendItem.a.b(usersUserFullDto));
            }
        }
        return new cts(r10, r1);
    }
}
