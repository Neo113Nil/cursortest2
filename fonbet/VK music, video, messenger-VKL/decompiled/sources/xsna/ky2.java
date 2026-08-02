package xsna;

import com.vk.api.generated.users.dto.UsersFieldsDto;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ApiFields.kt */
/* loaded from: classes2.dex */
public final class ky2 {
    public static final Object a;
    public static final String b;
    public static final Object c;
    public static final String d;
    public static final Object e;
    public static final List<UsersFieldsDto> f;

    static {
        hy2 hy2Var = new hy2(0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        a = msy.a(lazyThreadSafetyMode, hy2Var);
        b = z23.c("\\s", "\n        first_name,first_name_acc,first_name_gen, first_name_dat,last_name,last_name_acc,last_name_gen, last_name_dat, screen_name,\n        photo_base,sex,verified,domain,blacklisted,blacklisted_by_me,\n        country,city,occupation,online_info, can_call,is_service,friend_status,contacts,\n        is_messages_blocked,can_invite_to_chats,\n        emoji_status,image_status,bdate,can_write,contact_id,can_send_friend_request,members_count,activity,is_nft,is_nft_photo,\n        is_verified,is_service_account,social_button_type,\n        can_write_private_message,is_adult\n        ", "");
        c = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.g0(3));
        d = z23.c("\\s", "\n        verified,screen_name,is_messages_blocked,online_status,members_count,activity,is_nft_photo,member_status,description,can_message,url,deactivated,deactivated_message,deactivated_type,can_post_donut,age_limits,url,warning_notification,trust_mark,is_monetization_available\n        ", "");
        e = msy.a(lazyThreadSafetyMode, new iy2(0));
        UsersFieldsDto usersFieldsDto = UsersFieldsDto.FIRST_NAME_NOM;
        UsersFieldsDto usersFieldsDto2 = UsersFieldsDto.FIRST_NAME_GEN;
        UsersFieldsDto usersFieldsDto3 = UsersFieldsDto.FIRST_NAME_ACC;
        UsersFieldsDto usersFieldsDto4 = UsersFieldsDto.FIRST_NAME_DAT;
        UsersFieldsDto usersFieldsDto5 = UsersFieldsDto.LAST_NAME_NOM;
        UsersFieldsDto usersFieldsDto6 = UsersFieldsDto.LAST_NAME_GEN;
        UsersFieldsDto usersFieldsDto7 = UsersFieldsDto.LAST_NAME_ACC;
        UsersFieldsDto usersFieldsDto8 = UsersFieldsDto.LAST_NAME_DAT;
        UsersFieldsDto usersFieldsDto9 = UsersFieldsDto.SCREEN_NAME;
        UsersFieldsDto usersFieldsDto10 = UsersFieldsDto.SEX;
        UsersFieldsDto usersFieldsDto11 = UsersFieldsDto.VERIFIED;
        UsersFieldsDto usersFieldsDto12 = UsersFieldsDto.DOMAIN;
        UsersFieldsDto usersFieldsDto13 = UsersFieldsDto.BLACKLISTED;
        UsersFieldsDto usersFieldsDto14 = UsersFieldsDto.BLACKLISTED_BY_ME;
        UsersFieldsDto usersFieldsDto15 = UsersFieldsDto.COUNTRY;
        UsersFieldsDto usersFieldsDto16 = UsersFieldsDto.CITY;
        UsersFieldsDto usersFieldsDto17 = UsersFieldsDto.OCCUPATION;
        UsersFieldsDto usersFieldsDto18 = UsersFieldsDto.ONLINE_INFO;
        UsersFieldsDto usersFieldsDto19 = UsersFieldsDto.CAN_CALL;
        UsersFieldsDto usersFieldsDto20 = UsersFieldsDto.IS_SERVICE_ACCOUNT;
        f = e43.l(usersFieldsDto, usersFieldsDto2, usersFieldsDto3, usersFieldsDto4, usersFieldsDto5, usersFieldsDto6, usersFieldsDto7, usersFieldsDto8, usersFieldsDto9, usersFieldsDto10, usersFieldsDto11, usersFieldsDto12, usersFieldsDto13, usersFieldsDto14, usersFieldsDto15, usersFieldsDto16, usersFieldsDto17, usersFieldsDto18, usersFieldsDto19, usersFieldsDto20, UsersFieldsDto.FRIEND_STATUS, UsersFieldsDto.CONTACTS, UsersFieldsDto.CAN_INVITE_TO_CHATS, UsersFieldsDto.EMOJI_STATUS, UsersFieldsDto.IMAGE_STATUS, UsersFieldsDto.BDATE, UsersFieldsDto.CAN_SEND_FRIEND_REQUEST, UsersFieldsDto.ACTIVITY, UsersFieldsDto.IS_NFT, UsersFieldsDto.IS_VERIFIED, usersFieldsDto20, UsersFieldsDto.SOCIAL_BUTTON_TYPE, UsersFieldsDto.CAN_WRITE_PRIVATE_MESSAGE, UsersFieldsDto.PHOTO_BASE);
    }
}
