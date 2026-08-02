package xsna;

import android.content.Context;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLikesInfoDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsGroupIsClosedDto;
import com.vk.api.generated.market.dto.MarketGetCommentsResponseDto;
import com.vk.api.generated.status.dto.StatusImageStatusDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.wall.dto.WallWallCommentDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentDto;
import com.vk.comments.core.BoardComment;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserSex;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: MarketItemCommentsResponseMapper.kt */
/* loaded from: classes17.dex */
public final class i110 {
    public final pax0 a;

    public i110(pax0 pax0Var) {
        this.a = pax0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [xsna.jgp] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final ArrayList a(MarketGetCommentsResponseDto marketGetCommentsResponseDto, UserId userId) {
        LinkedHashMap linkedHashMap;
        float f;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        List list;
        ImageStatus imageStatus;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        List<UsersUserFullDto> f2 = marketGetCommentsResponseDto.f();
        if (f2 != null) {
            List<UsersUserFullDto> list2 = f2;
            int e = on00.e(c5g.u(list2, 10));
            if (e < 16) {
                e = 16;
            }
            linkedHashMap = new LinkedHashMap(e);
            for (UsersUserFullDto usersUserFullDto : list2) {
                Pair pair = new Pair(usersUserFullDto.s1(), usersUserFullDto.K0());
                linkedHashMap.put(pair.i(), pair.j());
            }
        } else {
            linkedHashMap = null;
        }
        ?? r1 = jgp.b;
        if (linkedHashMap == null) {
            linkedHashMap = r1;
        }
        List<UsersUserFullDto> f3 = marketGetCommentsResponseDto.f();
        boolean z = true;
        if (f3 != null) {
            List<UsersUserFullDto> list3 = f3;
            ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
            for (UsersUserFullDto usersUserFullDto2 : list3) {
                Serializer.c<Image> cVar = Image.CREATOR;
                Image a = Image.b.a(usersUserFullDto2.r2());
                Owner owner = new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
                owner.b = usersUserFullDto2.s1();
                owner.m = usersUserFullDto2.D0();
                owner.n = usersUserFullDto2.x1();
                owner.c = rq.a(usersUserFullDto2, new StringBuilder(), ' ');
                BaseBoolIntDto R2 = usersUserFullDto2.R2();
                BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
                boolean z2 = R2 == baseBoolIntDto;
                boolean z3 = usersUserFullDto2.O2() == baseBoolIntDto;
                Boolean o3 = usersUserFullDto2.o3();
                owner.f = new VerifyInfo(z2, z3, o3 != null ? o3.booleanValue() : false, false, false, false, 56, null);
                owner.g = a;
                ImageSize Cb = a.Cb(glw.a().a(), true, false);
                String str = Cb != null ? Cb.d.d : null;
                if (str == null) {
                    str = "";
                }
                if (str.length() == 0) {
                    str = iah0.f().density > 1.0f ? usersUserFullDto2.G2() : usersUserFullDto2.E2();
                }
                owner.e = str;
                UserSex.a aVar = UserSex.Companion;
                BaseSexDto L2 = usersUserFullDto2.L2();
                Integer valueOf = L2 != null ? Integer.valueOf(L2.i()) : null;
                aVar.getClass();
                owner.l = UserSex.a.a(valueOf);
                owner.h = usersUserFullDto2.N0();
                StatusImageStatusDto t1 = usersUserFullDto2.t1();
                if (t1 != null) {
                    List<BaseImageDto> d = t1.d();
                    ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
                    for (BaseImageDto baseImageDto : d) {
                        arrayList2.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
                    }
                    imageStatus = new ImageStatus(t1.getId(), t1.e(), new Image(arrayList2), null, 0, null, null, 120, null);
                } else {
                    imageStatus = null;
                }
                owner.k = imageStatus;
                BaseBoolIntDto D = usersUserFullDto2.D();
                BaseBoolIntDto baseBoolIntDto2 = BaseBoolIntDto.YES;
                owner.o = D == baseBoolIntDto2;
                owner.p = usersUserFullDto2.j() == baseBoolIntDto2;
                Boolean n1 = usersUserFullDto2.n1();
                owner.q = n1 != null ? n1.booleanValue() : false;
                owner.p = usersUserFullDto2.j() == baseBoolIntDto2;
                Integer o1 = usersUserFullDto2.o1();
                owner.r = o1 != null && o1.intValue() == 1;
                Boolean h3 = usersUserFullDto2.h3();
                owner.B(h3 != null ? h3.booleanValue() : false);
                SocialButtonType.a aVar2 = SocialButtonType.Companion;
                UsersUserFullDto.SocialButtonTypeDto M2 = usersUserFullDto2.M2();
                String i = M2 != null ? M2.i() : null;
                aVar2.getClass();
                owner.s = SocialButtonType.a.a(i);
                arrayList.add(owner);
            }
            f = 1.0f;
            int e2 = on00.e(c5g.u(arrayList, 10));
            if (e2 < 16) {
                e2 = 16;
            }
            linkedHashMap2 = new LinkedHashMap(e2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                linkedHashMap2.put(((Owner) next).b, next);
            }
        } else {
            f = 1.0f;
            linkedHashMap2 = null;
        }
        if (linkedHashMap2 == null) {
            linkedHashMap2 = r1;
        }
        linkedHashMap4.putAll(linkedHashMap2);
        List<GroupsGroupFullDto> d2 = marketGetCommentsResponseDto.d();
        if (d2 != null) {
            List<GroupsGroupFullDto> list4 = d2;
            ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
            for (GroupsGroupFullDto groupsGroupFullDto : list4) {
                Serializer.c<Image> cVar2 = Image.CREATOR;
                Image a2 = Image.b.a(groupsGroupFullDto.V1());
                Owner owner2 = new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null);
                owner2.b = groupsGroupFullDto.P0();
                owner2.c = groupsGroupFullDto.y1();
                BaseBoolIntDto O2 = groupsGroupFullDto.O2();
                BaseBoolIntDto baseBoolIntDto3 = BaseBoolIntDto.YES;
                owner2.f = new VerifyInfo(O2 == baseBoolIntDto3, groupsGroupFullDto.I2() == baseBoolIntDto3, false, false, false, false, 56, null);
                owner2.g = a2;
                ImageSize Cb2 = a2.Cb(glw.a().a(), true, false);
                String str2 = Cb2 != null ? Cb2.d.d : null;
                if (str2 == null) {
                    str2 = "";
                }
                if (str2.length() == 0) {
                    str2 = iah0.f().density > f ? groupsGroupFullDto.D1() : groupsGroupFullDto.B1();
                }
                owner2.e = str2;
                owner2.g(2, groupsGroupFullDto.o3() == baseBoolIntDto3);
                owner2.g(4, groupsGroupFullDto.I3() == baseBoolIntDto3);
                String W = groupsGroupFullDto.W();
                owner2.o(!(W == null || drm0.N(W)));
                GroupsGroupIsClosedDto u3 = groupsGroupFullDto.u3();
                owner2.n((u3 != null ? u3.i() : 0) > 0);
                Boolean y3 = groupsGroupFullDto.y3();
                owner2.g(256, y3 != null ? y3.booleanValue() : false);
                owner2.g(64, groupsGroupFullDto.C() == baseBoolIntDto3);
                Integer o = groupsGroupFullDto.o();
                owner2.g(128, o != null && o.intValue() == 1);
                owner2.g(64, groupsGroupFullDto.C() == baseBoolIntDto3);
                owner2.o = groupsGroupFullDto.l() == baseBoolIntDto3;
                Boolean N0 = groupsGroupFullDto.N0();
                owner2.q = N0 != null ? N0.booleanValue() : false;
                Boolean N3 = groupsGroupFullDto.N3();
                owner2.B(N3 != null ? N3.booleanValue() : false);
                arrayList3.add(owner2);
            }
            int e3 = on00.e(c5g.u(arrayList3, 10));
            linkedHashMap3 = new LinkedHashMap(e3 >= 16 ? e3 : 16);
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                linkedHashMap3.put(((Owner) next2).b, next2);
            }
        } else {
            linkedHashMap3 = null;
        }
        if (linkedHashMap3 != null) {
            r1 = linkedHashMap3;
        }
        linkedHashMap4.putAll(r1);
        List<WallWallCommentDto> e4 = marketGetCommentsResponseDto.e();
        ArrayList arrayList4 = new ArrayList(c5g.u(e4, 10));
        for (WallWallCommentDto wallWallCommentDto : e4) {
            Owner owner3 = (Owner) linkedHashMap4.getOrDefault(fkq0.a(wallWallCommentDto.k()), new Owner(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194303, null));
            String str3 = (String) linkedHashMap.getOrDefault(owner3.b, null);
            UserId B = wallWallCommentDto.B();
            if ((B == null || fkq0.b(B) != z) ? false : z) {
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                str3 = context.getString(R.string.comment_to_community);
            }
            String str4 = str3;
            List<WallWallpostAttachmentDto> d3 = wallWallCommentDto.d();
            if (d3 != null) {
                ArrayList arrayList5 = new ArrayList();
                Iterator it3 = d3.iterator();
                while (it3.hasNext()) {
                    Attachment a3 = this.a.a((WallWallpostAttachmentDto) it3.next(), linkedHashMap4);
                    if (a3 != null) {
                        arrayList5.add(a3);
                    }
                }
                list = rdi.g(arrayList5);
            } else {
                list = null;
            }
            int id = wallWallCommentDto.getId();
            String C = wallWallCommentDto.C();
            String str5 = owner3.c;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = owner3.e;
            UserId k = wallWallCommentDto.k();
            int g = wallWallCommentDto.g();
            Integer p = wallWallCommentDto.p();
            int intValue = p != null ? p.intValue() : 0;
            Integer u = wallWallCommentDto.u();
            BoardComment boardComment = new BoardComment(id, C, str5, str6, k, g, intValue, userId, str4, u != null ? u.intValue() : 0, owner3.k, owner3.i(1024), owner3.l());
            BaseLikesInfoDto l = wallWallCommentDto.l();
            BaseBoolIntDto i2 = l != null ? l.i() : null;
            BaseBoolIntDto baseBoolIntDto4 = BaseBoolIntDto.YES;
            boardComment.q = i2 == baseBoolIntDto4;
            BaseLikesInfoDto l2 = wallWallCommentDto.l();
            boardComment.p = l2 != null ? l2.getCount() : 0;
            BaseLikesInfoDto l3 = wallWallCommentDto.l();
            boardComment.r = (l3 != null ? l3.e() : null) == baseBoolIntDto4;
            boardComment.z = wallWallCommentDto.f() == baseBoolIntDto4;
            if (list == null) {
                list = EmptyList.b;
            }
            ArrayList<Attachment> arrayList6 = boardComment.f;
            arrayList6.addAll(list);
            boardComment.B = owner3.f;
            int i3 = com.vkontakte.android.attachments.a.a;
            Collections.sort(arrayList6);
            boardComment.Ab();
            arrayList4.add(boardComment);
            z = true;
        }
        return arrayList4;
    }
}
