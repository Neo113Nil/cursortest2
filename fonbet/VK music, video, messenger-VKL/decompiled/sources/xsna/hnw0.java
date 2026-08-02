package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import java.util.List;

/* compiled from: VoipDataProviderApiImpl.kt */
/* loaded from: classes7.dex */
public final class hnw0 {
    public static final List<UsersFieldsDto> h;
    public static final List<UsersFieldsDto> i;
    public static final List<String> j;
    public final yhq0 a;
    public final g89 b;
    public final String c;
    public final d8t0 d;
    public final ots e = new ots();
    public final u1r0 f = new u1r0();
    public final vg20 g = new vg20();

    static {
        UsersFieldsDto usersFieldsDto = UsersFieldsDto.FIRST_NAME_NOM;
        UsersFieldsDto usersFieldsDto2 = UsersFieldsDto.LAST_NAME_NOM;
        UsersFieldsDto usersFieldsDto3 = UsersFieldsDto.PHOTO_BASE;
        UsersFieldsDto usersFieldsDto4 = UsersFieldsDto.SEX;
        UsersFieldsDto usersFieldsDto5 = UsersFieldsDto.VERIFIED;
        UsersFieldsDto usersFieldsDto6 = UsersFieldsDto.FRIEND_STATUS;
        UsersFieldsDto usersFieldsDto7 = UsersFieldsDto.CAN_CALL;
        UsersFieldsDto usersFieldsDto8 = UsersFieldsDto.CONTACT_NAME;
        UsersFieldsDto usersFieldsDto9 = UsersFieldsDto.FIRST_NAME_GEN;
        UsersFieldsDto usersFieldsDto10 = UsersFieldsDto.FIRST_NAME_DAT;
        UsersFieldsDto usersFieldsDto11 = UsersFieldsDto.IS_NFT;
        h = e43.l(usersFieldsDto, usersFieldsDto2, usersFieldsDto3, usersFieldsDto4, usersFieldsDto5, usersFieldsDto6, usersFieldsDto7, usersFieldsDto8, usersFieldsDto9, usersFieldsDto10, usersFieldsDto11);
        i = e43.l(usersFieldsDto, usersFieldsDto2, usersFieldsDto9, usersFieldsDto10, usersFieldsDto4, usersFieldsDto5, usersFieldsDto6, usersFieldsDto7, usersFieldsDto8, usersFieldsDto11, usersFieldsDto3);
        j = e43.l("first_name", "last_name", "sex,verified", "friend_status", "can_call", "contact_name", "first_name_gen", "first_name_dat", "member_status", "custom_names_for_calls", "is_nft", "is_nft_photo", "photo_base");
    }

    public hnw0(yhq0 yhq0Var, g89 g89Var, String str, d8t0 d8t0Var) {
        this.a = yhq0Var;
        this.b = g89Var;
        this.c = str;
        this.d = d8t0Var;
    }
}
