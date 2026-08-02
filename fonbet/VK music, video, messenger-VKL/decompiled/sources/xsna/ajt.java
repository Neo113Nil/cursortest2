package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersSearchSexDto;
import com.vk.api.generated.users.dto.UsersSearchStatusDto;
import com.vk.superapp.api.VkRelation;
import com.vk.superapp.core.api.models.VkGender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.r1r0;
import xsna.t1r0;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class ajt implements ufn0 {
    public final bpn0 a = new bpn0(new pr1(23));

    /* compiled from: GeneratedSuperappApi.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VkGender.values().length];
            try {
                iArr[VkGender.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkGender.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkGender.MALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VkRelation.values().length];
            try {
                iArr2[VkRelation.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VkRelation.NOT_MARRIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VkRelation.MEETS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[VkRelation.ENGAGED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[VkRelation.MARRIED.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[VkRelation.COMPLICATED.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[VkRelation.ACTIVELY_LOOKING.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[VkRelation.IN_LOVE.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[VkRelation.CIVIL_MARRIAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // xsna.ufn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 a(String str, String str2, int i, int i2, int i3, VkGender vkGender, int i4, int i5, VkRelation vkRelation) {
        UsersSearchSexDto usersSearchSexDto;
        UsersSearchStatusDto usersSearchStatusDto;
        int i6 = a.$EnumSwitchMapping$0[vkGender.ordinal()];
        if (i6 == 1) {
            usersSearchSexDto = UsersSearchSexDto.ANY;
        } else if (i6 == 2) {
            usersSearchSexDto = UsersSearchSexDto.FEMALE;
        } else {
            if (i6 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            usersSearchSexDto = UsersSearchSexDto.MALE;
        }
        switch (a.$EnumSwitchMapping$1[vkRelation.ordinal()]) {
            case 1:
                usersSearchStatusDto = UsersSearchStatusDto.NOT_SPECIFIED;
                break;
            case 2:
                usersSearchStatusDto = UsersSearchStatusDto.NOT_MARRIED;
                break;
            case 3:
                usersSearchStatusDto = UsersSearchStatusDto.RELATIONSHIP;
                break;
            case 4:
                usersSearchStatusDto = UsersSearchStatusDto.ENGAGED;
                break;
            case 5:
                usersSearchStatusDto = UsersSearchStatusDto.MARRIED;
                break;
            case 6:
                usersSearchStatusDto = UsersSearchStatusDto.COMPLICATED;
                break;
            case 7:
                usersSearchStatusDto = UsersSearchStatusDto.ACTIVELY_SEARCHING;
                break;
            case 8:
                usersSearchStatusDto = UsersSearchStatusDto.IN_LOVE;
                break;
            case 9:
                usersSearchStatusDto = UsersSearchStatusDto.NOT_SPECIFIED;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        List l = e43.l(UsersFieldsDto.FIRST_NAME_NOM, UsersFieldsDto.LAST_NAME_NOM, UsersFieldsDto.SEX, UsersFieldsDto.CITY, UsersFieldsDto.PHOTO, UsersFieldsDto.PHOTO_BASE);
        Integer valueOf = Integer.valueOf(i2);
        Integer valueOf2 = Integer.valueOf(i);
        Integer valueOf3 = Integer.valueOf(i3);
        Integer valueOf4 = Integer.valueOf(i4);
        Integer valueOf5 = Integer.valueOf(i5);
        if (((-491710) & 32) != 0) {
            valueOf3 = null;
        }
        Integer num = ((-491710) & 128) != 0 ? null : 0;
        if ((32768 & (-491710)) != 0) {
            usersSearchSexDto = null;
        }
        bx2 e = e370.e(t1r0.a.a(str2, valueOf, valueOf2, l, valueOf3, num, usersSearchSexDto, (65536 & (-491710)) != 0 ? null : usersSearchStatusDto, (131072 & (-491710)) != 0 ? null : valueOf4, (262144 & (-491710)) != 0 ? null : valueOf5, "restore_super_app"));
        e.n = str;
        e.o = null;
        return rdx0.u(e).U(new vj0(new p99(1, (h1r0) this.a.getValue(), h1r0.class, "map", "map(Lcom/vk/api/generated/users/dto/UsersSearchResponseDto;)Lcom/vk/superapp/api/dto/common/VkList;", 0, 6), 22));
    }

    @Override // xsna.ufn0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 b(List list) {
        List l = e43.l(UsersFieldsDto.CITY, UsersFieldsDto.SEX, UsersFieldsDto.COUNTRY, UsersFieldsDto.PHOTO_BASE, UsersFieldsDto.TIMEZONE, UsersFieldsDto.BDATE, UsersFieldsDto.BDATE_VISIBILITY);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Number) obj).longValue() != 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dq.h(((Number) it.next()).longValue(), arrayList2);
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if ((58 & 1) != 0) {
            arrayList2 = null;
        }
        if ((58 & 4) != 0) {
            l = null;
        }
        sfx a2 = r1r0.a.a(arrayList2, null, l, null, null);
        bx2 bx2Var = new bx2("5.285", new io.reactivex.rxjava3.internal.operators.observable.n0(2), a2.b());
        bx2Var.i = null;
        bx2Var.j.putAll(a2.getParamsMap());
        return rdx0.u(bx2Var);
    }

    @Override // xsna.ufn0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 c(List list) {
        List l = e43.l(UsersFieldsDto.FIRST_NAME_NOM, UsersFieldsDto.LAST_NAME_NOM, UsersFieldsDto.SEX, UsersFieldsDto.CITY, UsersFieldsDto.PHOTO, UsersFieldsDto.PHOTO_BASE);
        if ((58 & 1) != 0) {
            list = null;
        }
        if ((58 & 4) != 0) {
            l = null;
        }
        return rdx0.u(e370.e(r1r0.a.a(list, null, l, null, null))).U(new t34(new bw6(1, (h1r0) this.a.getValue(), h1r0.class, "map", "map(Ljava/util/List;)Ljava/util/List;", 0, 5), 18));
    }
}
