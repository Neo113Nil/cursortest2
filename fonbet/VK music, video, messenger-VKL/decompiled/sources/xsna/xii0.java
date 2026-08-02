package xsna;

import android.content.Context;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.messages.dto.MessagesChatSettingsDto;
import com.vk.api.generated.messages.dto.MessagesChatSettingsPhotoDto;
import com.vk.api.generated.messages.dto.MessagesContactDto;
import com.vk.api.generated.messages.dto.MessagesConversationDto;
import com.vk.api.generated.messages.dto.MessagesConversationPeerTypeDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.lists.c;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.builders.MapBuilder;

/* compiled from: SendStoryUsersPagedDataProvider.kt */
/* loaded from: classes16.dex */
public final class xii0 implements c.l<Triple<? extends String, ? extends Integer, ? extends List<? extends s8m>>> {
    public static final List<UsersFieldsDto> i = e43.l(UsersFieldsDto.DOMAIN, UsersFieldsDto.IMAGE_STATUS, UsersFieldsDto.CAN_WRITE_PRIVATE_MESSAGE, UsersFieldsDto.PHOTO_BASE);
    public final sg20 b;
    public gzs<String> c;
    public final io.reactivex.rxjava3.disposables.b d;
    public final ui e;
    public final gpj0 f;
    public final j2r0 g = new j2r0();
    public final s8m h;

    public xii0(Context context, vg20 vg20Var, daz dazVar, io.reactivex.rxjava3.disposables.b bVar, ui uiVar, gpj0 gpj0Var) {
        this.b = vg20Var;
        this.c = dazVar;
        this.d = bVar;
        this.e = uiVar;
        this.f = gpj0Var;
        this.h = new s8m(gpj0Var.getUid(), context.getString(R.string.vkim_dialog_with_self_title), null, null, 52);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s8m b(MessagesConversationDto messagesConversationDto, MapBuilder mapBuilder) {
        s8m s8mVar;
        String title;
        MessagesChatSettingsPhotoDto e;
        UserId d;
        MessagesConversationPeerTypeDto f = messagesConversationDto.g().f();
        boolean z = (f == MessagesConversationPeerTypeDto.USER || f == MessagesConversationPeerTypeDto.GROUP || f == MessagesConversationPeerTypeDto.CONTACT) && mapBuilder != null;
        String str = null;
        if (z) {
            if (f == MessagesConversationPeerTypeDto.CONTACT) {
                d = new UserId(messagesConversationDto.g().e() != null ? r3.intValue() : 0L);
            } else {
                d = messagesConversationDto.g().d();
            }
            if (mapBuilder != null) {
                s8mVar = (s8m) mapBuilder.get(d);
                if (z) {
                    MessagesChatSettingsDto f2 = messagesConversationDto.f();
                    if (f2 != null) {
                        title = f2.getTitle();
                    }
                    title = null;
                } else {
                    if (s8mVar != null) {
                        title = s8mVar.b;
                    }
                    title = null;
                }
                if (title == null) {
                    title = "";
                }
                String str2 = title;
                if (z) {
                    MessagesChatSettingsDto f3 = messagesConversationDto.f();
                    if (f3 != null && (e = f3.e()) != null) {
                        str = e.d();
                    }
                } else if (s8mVar != null) {
                    str = s8mVar.c;
                }
                return new s8m(messagesConversationDto.g().d(), str2, str, f, 40);
            }
        }
        s8mVar = null;
        if (z) {
        }
        if (title == null) {
        }
        String str22 = title;
        if (z) {
        }
        return new s8m(messagesConversationDto.g().d(), str22, str, f, 40);
    }

    public final MapBuilder a(List list, List list2, List list3) {
        MapBuilder mapBuilder = new MapBuilder();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) it.next();
                this.g.getClass();
                UserProfile a = j2r0.a(usersUserFullDto);
                mapBuilder.put(usersUserFullDto.s1(), new s8m(usersUserFullDto.s1(), a.e, a.h, null, 56));
            }
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                GroupsGroupFullDto groupsGroupFullDto = (GroupsGroupFullDto) it2.next();
                UserId e = fkq0.e(groupsGroupFullDto.P0());
                UserId e2 = fkq0.e(groupsGroupFullDto.P0());
                String y1 = groupsGroupFullDto.y1();
                if (y1 == null) {
                    y1 = "";
                }
                mapBuilder.put(e, new s8m(e2, y1, groupsGroupFullDto.R1(), null, 56));
            }
        }
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                MessagesContactDto messagesContactDto = (MessagesContactDto) it3.next();
                UserId userId = new UserId(messagesContactDto.getId());
                mapBuilder.put(userId, new s8m(userId, messagesContactDto.g(), messagesContactDto.i(), null, 56));
            }
        }
        return mapBuilder.h();
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<Triple<String, Integer, List<s8m>>> hj(com.vk.lists.c cVar, boolean z) {
        return ui(0, cVar);
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<Triple<? extends String, ? extends Integer, ? extends List<? extends s8m>>> ui(int i2, com.vk.lists.c cVar) {
        io.reactivex.rxjava3.internal.operators.observable.j1 U;
        xy2 n;
        String invoke = this.c.invoke();
        if (invoke.length() == 0) {
            n = this.b.n((r19 & 1) != 0 ? null : Integer.valueOf(i2), 20, (r19 & 4) != 0 ? null : null, (r19 & 8) != 0 ? null : Boolean.TRUE, (r19 & 32) != 0 ? null : null, (r19 & 64) != 0 ? null : null, (r19 & 8192) != 0 ? null : 2);
            U = rsg0.T(yfb.x(n)).U(new p5w(new zkb(this, i2, 3), 16));
        } else {
            U = rsg0.T(yfb.x(this.b.g(invoke, i))).U(new vii0(new bnc0(this, 9), 0));
        }
        return U.U(new wii0(new ge3(invoke, 4), 0));
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<Triple<String, Integer, List<s8m>>> qVar, boolean z, com.vk.lists.c cVar) {
        hg1.e(this.d, qVar.subscribe(new wmz(new wd3(25, cVar, this), 19), new kjs(new mi10(this, 22), 19)));
    }
}
