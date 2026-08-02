package xsna;

import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.friends.dto.FriendsGetOrderDto;
import com.vk.api.generated.messages.dto.MessagesGetConversationsFilterDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.mts;
import xsna.r1r0;

/* compiled from: ClipsShareRemoteStorage.kt */
/* loaded from: classes17.dex */
public final class o3f implements w8i {
    public static final List<UsersFieldsDto> f;
    public static final List<UsersFieldsDto> g;
    public static final List<BaseUserGroupFieldsDto> h;
    public final u1r0 b = new u1r0();
    public final ots c = new ots();
    public final vg20 d = new vg20();
    public final p3f e = new p3f();

    static {
        UsersFieldsDto usersFieldsDto = UsersFieldsDto.BLACKLISTED;
        UsersFieldsDto usersFieldsDto2 = UsersFieldsDto.BLACKLISTED_BY_ME;
        UsersFieldsDto usersFieldsDto3 = UsersFieldsDto.CAN_WRITE_PRIVATE_MESSAGE;
        f = e43.l(usersFieldsDto, usersFieldsDto2, usersFieldsDto3);
        g = e43.l(UsersFieldsDto.CONTACT_NAME, UsersFieldsDto.FIRST_NAME_NOM, UsersFieldsDto.LAST_NAME_NOM, UsersFieldsDto.PHOTO_BASE, usersFieldsDto, usersFieldsDto2, usersFieldsDto3);
        h = e43.l(BaseUserGroupFieldsDto.FIRST_NAME, BaseUserGroupFieldsDto.PHOTO_BASE, BaseUserGroupFieldsDto.CAN_WRITE_PRIVATE_MESSAGE);
    }

    public final io.reactivex.rxjava3.internal.operators.single.y a(UserId userId) {
        ArrayList arrayList;
        List singletonList = Collections.singletonList(userId);
        tfx tfxVar = new tfx("messages.getConversationsById", new uq(19), new vq(22));
        tfx.p(tfxVar, "peer_ids", singletonList, 0L, 12);
        tfxVar.j("extended", false);
        List<BaseUserGroupFieldsDto> list = h;
        if (list != null) {
            List<BaseUserGroupFieldsDto> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        return rsg0.W(yfb.x(tfxVar), 7).l(new o40(new l3f(this.e, 0), 8));
    }

    public final io.reactivex.rxjava3.internal.operators.single.d0 b(UserId userId) {
        return new io.reactivex.rxjava3.internal.operators.single.d0(rsg0.W(yfb.x(r1r0.a.b(this.b, Collections.singletonList(userId), f, null, null, 56)), 7).l(new com.vk.movika.sdk.base.hooks.k(new pj1(this.e, 2), 11)), new ao(9), null);
    }

    public final io.reactivex.rxjava3.internal.operators.single.r c(int i, int i2, boolean z, List list) {
        xy2 n;
        MessagesGetConversationsFilterDto messagesGetConversationsFilterDto = MessagesGetConversationsFilterDto.ALL;
        Integer valueOf = Integer.valueOf(i2);
        n = this.d.n((r19 & 1) != 0 ? null : valueOf, Integer.valueOf(i), (r19 & 4) != 0 ? null : messagesGetConversationsFilterDto, (r19 & 8) != 0 ? null : Boolean.TRUE, (r19 & 32) != 0 ? null : h, (r19 & 64) != 0 ? null : null, (r19 & 8192) != 0 ? null : 2);
        dz2 x = yfb.x(n);
        x.n = z;
        return new io.reactivex.rxjava3.internal.operators.single.r(rsg0.W(x, 7).l(new ox0(new m3f(1, this.e, p3f.class, "map", "map(Lcom/vk/api/generated/messages/dto/MessagesGetConversationsResponseDto;)Ljava/util/List;", 0), 13)), new rx0(new k3f(i, i2, this, list, z), 10));
    }

    public final io.reactivex.rxjava3.internal.operators.single.r d(int i, int i2, boolean z, List list) {
        dz2 x = yfb.x(mts.a.b(this.c, null, FriendsGetOrderDto.HINTS, null, Integer.valueOf(i), Integer.valueOf(i2), g, null, null, 965));
        x.n = z;
        return new io.reactivex.rxjava3.internal.operators.single.r(rsg0.W(x, 7).l(new mj1(new n3f(1, this.e, p3f.class, "map", "map(Lcom/vk/api/generated/friends/dto/FriendsGetFieldsResponseDto;)Ljava/util/List;", 0), 11)), new e05(new j3f(i, i2, this, list, z), 11));
    }
}
