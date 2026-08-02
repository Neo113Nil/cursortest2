package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.base.dto.BaseLinkButtonStyleDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.api.generated.status.dto.StatusImageStatusDto;
import com.vk.api.generated.users.dto.UsersEmojiStatusDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.status.StatusImagePopup;
import com.vk.dto.status.StatusImagePopupPhoto;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.UserSex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: UsersUserFullToOwnerMapper.kt */
/* loaded from: classes3.dex */
public final class k2r0 {
    public final bpn0 a = new bpn0(new ufm0(5));

    /* compiled from: UsersUserFullToOwnerMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BaseSexDto.values().length];
            try {
                iArr[BaseSexDto.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BaseSexDto.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.vk.dto.user.ImageStatus] */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.vk.dto.common.LinkButton] */
    /* JADX WARN: Type inference failed for: r14v6, types: [com.vk.dto.user.ImageStatus] */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.vk.dto.user.ImageStatus] */
    public final Owner a(UsersUserFullDto usersUserFullDto) {
        BaseLinkButtonActionDto e;
        Action b;
        boolean z;
        boolean z2;
        String D0 = usersUserFullDto.D0();
        String x1 = usersUserFullDto.x1();
        BaseBoolIntDto R2 = usersUserFullDto.R2();
        BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
        VerifyInfo verifyInfo = new VerifyInfo(R2 == baseBoolIntDto, usersUserFullDto.O2() == baseBoolIntDto, false, false, false, false, 60, null);
        Serializer.c<Image> cVar = Image.CREATOR;
        Image a2 = Image.b.a(usersUserFullDto.r2());
        ImageSize Cb = a2.Cb(glw.a().a(), true, false);
        String str = Cb != null ? Cb.d.d : null;
        BaseSexDto L2 = usersUserFullDto.L2();
        int i = L2 == null ? -1 : a.$EnumSwitchMapping$0[L2.ordinal()];
        UserSex userSex = i != 1 ? i != 2 ? UserSex.UNKNOWN : UserSex.MALE : UserSex.FEMALE;
        StatusImageStatusDto t1 = usersUserFullDto.t1();
        UsersEmojiStatusDto y0 = usersUserFullDto.y0();
        if (t1 != null) {
            int id = t1.getId();
            String e2 = t1.e();
            new ne6();
            r2 = new ImageStatus(id, e2, ne6.a(t1.d()), null, 0, null, null, 120, null);
        } else if (y0 != null) {
            int e3 = y0.e();
            String title = y0.getTitle();
            String f = y0.f();
            bpn0 bpn0Var = this.a;
            Image a3 = ((kfa0) bpn0Var.getValue()).a(y0.g());
            StatusImagePopupPhoto statusImagePopupPhoto = new StatusImagePopupPhoto("custom", ((kfa0) bpn0Var.getValue()).a(y0.g()));
            String title2 = y0.getTitle();
            String i2 = y0.i();
            BaseLinkButtonDto d = y0.d();
            if (d != null && (e = d.e()) != null && (b = wf6.b(e)) != null) {
                String title3 = d.getTitle();
                if (title3 == null) {
                    title3 = "";
                }
                BaseLinkButtonStyleDto o = d.o();
                r2 = new LinkButton(title3, b, o != null ? o.name() : null);
            }
            r2 = new ImageStatus(e3, title, a3, null, e3, f, new StatusImagePopup(null, null, statusImagePopupPhoto, title2, i2, null, e43.m(r2), null, true, null), 8, null);
        }
        Integer o1 = usersUserFullDto.o1();
        boolean z3 = (o1 != null ? o1.intValue() : 0) == 1;
        FriendsFriendStatusStatusDto V0 = usersUserFullDto.V0();
        if (V0 == null) {
            V0 = FriendsFriendStatusStatusDto.NOT_A_FRIEND;
        }
        UserSex userSex2 = userSex;
        UserId s1 = usersUserFullDto.s1();
        String a4 = v1v.a(' ', D0, x1);
        boolean z4 = true;
        String N0 = usersUserFullDto.N0();
        if (usersUserFullDto.D() == baseBoolIntDto) {
            z = true;
        } else {
            z = true;
            z4 = false;
        }
        if (usersUserFullDto.j() == baseBoolIntDto) {
            z2 = z;
        } else {
            z2 = z;
            z = false;
        }
        Integer U0 = usersUserFullDto.U0();
        int intValue = U0 != null ? U0.intValue() : 0;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = V0;
        boolean z5 = z2;
        Owner owner = new Owner(s1, a4, null, str, verifyInfo, a2, N0, null, null, r2, userSex2, D0, x1, z4, z, false, z3, null, intValue, null, null, false, 3834244, null);
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto2 = FriendsFriendStatusStatusDto.IS_FRIEND;
        owner.g(4, (friendsFriendStatusStatusDto == friendsFriendStatusStatusDto2 || friendsFriendStatusStatusDto == FriendsFriendStatusStatusDto.OUTCOMING_REQUEST) ? z5 : false);
        owner.B(epx.f(usersUserFullDto.h3(), Boolean.TRUE));
        owner.p(friendsFriendStatusStatusDto == friendsFriendStatusStatusDto2 ? z5 : false);
        return owner;
    }

    public final LinkedHashMap b(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a((UsersUserFullDto) it.next()));
        }
        int e = on00.e(c5g.u(arrayList, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            linkedHashMap.put(((Owner) next).b, next);
        }
        return linkedHashMap;
    }
}
