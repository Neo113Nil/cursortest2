package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.messages.dto.MessagesChatSettingsDto;
import com.vk.api.generated.messages.dto.MessagesChatSettingsPhotoDto;
import com.vk.api.generated.messages.dto.MessagesContactDto;
import com.vk.api.generated.messages.dto.MessagesConversationCanWriteDto;
import com.vk.api.generated.messages.dto.MessagesConversationWithMessageDto;
import com.vk.api.generated.messages.dto.MessagesGetConversationsResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.f9j0;
import xsna.p3f;

/* compiled from: ClipsShareRemoteStorage.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class m3f extends FunctionReferenceImpl implements izs<MessagesGetConversationsResponseDto, List<? extends f9j0.c.a>> {
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01dc, code lost:
    
        if (r5 != null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        if (r4 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0140, code lost:
    
        if (r5 != null) goto L64;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<? extends f9j0.c.a> invoke(MessagesGetConversationsResponseDto messagesGetConversationsResponseDto) {
        Object c2858a;
        String str;
        MessagesChatSettingsPhotoDto e;
        MessagesChatSettingsPhotoDto e2;
        String g;
        String str2;
        MessagesChatSettingsPhotoDto e3;
        String g2;
        String str3;
        String r2;
        Object obj;
        String str4;
        String V1;
        Object obj2;
        String str5;
        String i;
        Object obj3;
        MessagesGetConversationsResponseDto messagesGetConversationsResponseDto2 = messagesGetConversationsResponseDto;
        ((p3f) this.receiver).getClass();
        List<MessagesConversationWithMessageDto> f = messagesGetConversationsResponseDto2.f();
        ArrayList arrayList = new ArrayList(c5g.u(f, 10));
        for (MessagesConversationWithMessageDto messagesConversationWithMessageDto : f) {
            List<UsersUserFullDto> g3 = messagesGetConversationsResponseDto2.g();
            List<GroupsGroupFullDto> e4 = messagesGetConversationsResponseDto2.e();
            List<MessagesContactDto> d = messagesGetConversationsResponseDto2.d();
            int i2 = p3f.a.$EnumSwitchMapping$0[messagesConversationWithMessageDto.d().g().f().ordinal()];
            String str6 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            str6 = null;
            boolean z = false;
            String str7 = "";
            if (i2 == 1) {
                UserId d2 = messagesConversationWithMessageDto.d().g().d();
                MessagesChatSettingsDto f2 = messagesConversationWithMessageDto.d().f();
                if (f2 == null || (str = f2.getTitle()) == null) {
                    str = "";
                }
                MessagesChatSettingsDto f3 = messagesConversationWithMessageDto.d().f();
                if (f3 == null || (e2 = f3.e()) == null || (g = e2.g()) == null) {
                    MessagesChatSettingsDto f4 = messagesConversationWithMessageDto.d().f();
                    if (f4 != null && (e = f4.e()) != null) {
                        str6 = e.f();
                    }
                    if (str6 != null) {
                        str7 = str6;
                    }
                } else {
                    str7 = g;
                }
                MessagesConversationCanWriteDto e5 = messagesConversationWithMessageDto.d().e();
                if (e5 != null && !e5.d()) {
                    z = true;
                }
                c2858a = new f9j0.c.a.C2858a(d2, !z, str, str7);
            } else if (i2 == 2) {
                UserId d3 = messagesConversationWithMessageDto.d().g().d();
                MessagesChatSettingsDto f5 = messagesConversationWithMessageDto.d().f();
                if (f5 == null || (str2 = f5.getTitle()) == null) {
                    str2 = "";
                }
                MessagesChatSettingsDto f6 = messagesConversationWithMessageDto.d().f();
                if (f6 != null && (e3 = f6.e()) != null && (g2 = e3.g()) != null) {
                    str7 = g2;
                }
                MessagesConversationCanWriteDto e6 = messagesConversationWithMessageDto.d().e();
                if (e6 != null && !e6.d()) {
                    z = true;
                }
                c2858a = new f9j0.c.a.C2858a(d3, !z, str2, str7);
            } else if (i2 == 3) {
                UserId d4 = messagesConversationWithMessageDto.d().g().d();
                if (g3 != null) {
                    Iterator<T> it = g3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (epx.f(((UsersUserFullDto) obj).s1(), messagesConversationWithMessageDto.d().g().d())) {
                            break;
                        }
                    }
                    UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj;
                    if (usersUserFullDto != null) {
                        str3 = usersUserFullDto.D0();
                    }
                }
                str3 = "";
                if (g3 != null) {
                    Iterator<T> it2 = g3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (epx.f(((UsersUserFullDto) next).s1(), messagesConversationWithMessageDto.d().g().d())) {
                            obj6 = next;
                            break;
                        }
                    }
                    UsersUserFullDto usersUserFullDto2 = (UsersUserFullDto) obj6;
                    if (usersUserFullDto2 != null && (r2 = usersUserFullDto2.r2()) != null) {
                        str7 = r2;
                    }
                }
                MessagesConversationCanWriteDto e7 = messagesConversationWithMessageDto.d().e();
                if (e7 != null && !e7.d()) {
                    z = true;
                }
                c2858a = new f9j0.c.a.d(d4, !z, str3, str7);
            } else if (i2 == 4) {
                UserId d5 = messagesConversationWithMessageDto.d().g().d();
                if (e4 != null) {
                    Iterator<T> it3 = e4.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it3.next();
                        if (fkq0.e(((GroupsGroupFullDto) obj2).P0()).equals(messagesConversationWithMessageDto.d().g().d())) {
                            break;
                        }
                    }
                    GroupsGroupFullDto groupsGroupFullDto = (GroupsGroupFullDto) obj2;
                    if (groupsGroupFullDto != null) {
                        str4 = groupsGroupFullDto.y1();
                    }
                }
                str4 = "";
                if (e4 != null) {
                    Iterator<T> it4 = e4.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        Object next2 = it4.next();
                        if (fkq0.e(((GroupsGroupFullDto) next2).P0()).equals(messagesConversationWithMessageDto.d().g().d())) {
                            obj5 = next2;
                            break;
                        }
                    }
                    GroupsGroupFullDto groupsGroupFullDto2 = (GroupsGroupFullDto) obj5;
                    if (groupsGroupFullDto2 != null && (V1 = groupsGroupFullDto2.V1()) != null) {
                        str7 = V1;
                    }
                }
                MessagesConversationCanWriteDto e8 = messagesConversationWithMessageDto.d().e();
                if (e8 != null && !e8.d()) {
                    z = true;
                }
                c2858a = new f9j0.c.a.C2859c(d5, !z, str4, str7);
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                UserId d6 = messagesConversationWithMessageDto.d().g().d();
                if (d != null) {
                    Iterator<T> it5 = d.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it5.next();
                        if (epx.f(((MessagesContactDto) obj3).getUserId(), messagesConversationWithMessageDto.d().g().d())) {
                            break;
                        }
                    }
                    MessagesContactDto messagesContactDto = (MessagesContactDto) obj3;
                    if (messagesContactDto != null) {
                        str5 = messagesContactDto.g();
                    }
                }
                str5 = "";
                if (d != null) {
                    Iterator<T> it6 = d.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        Object next3 = it6.next();
                        if (epx.f(((MessagesContactDto) next3).getUserId(), messagesConversationWithMessageDto.d().g().d())) {
                            obj4 = next3;
                            break;
                        }
                    }
                    MessagesContactDto messagesContactDto2 = (MessagesContactDto) obj4;
                    if (messagesContactDto2 != null && (i = messagesContactDto2.i()) != null) {
                        str7 = i;
                    }
                }
                MessagesConversationCanWriteDto e9 = messagesConversationWithMessageDto.d().e();
                if (e9 != null && !e9.d()) {
                    z = true;
                }
                c2858a = new f9j0.c.a.b(d6, !z, str5, str7);
            }
            arrayList.add(c2858a);
        }
        return arrayList;
    }
}
