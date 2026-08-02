package xsna;

import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StoriesFields.kt */
/* loaded from: classes6.dex */
public final class isl0 {
    public static final List<BaseUserGroupFieldsDto> a;
    public static final ArrayList b;

    static {
        List<BaseUserGroupFieldsDto> l = e43.l(BaseUserGroupFieldsDto.BDATE, BaseUserGroupFieldsDto.CAN_UPLOAD_STORY, BaseUserGroupFieldsDto.CAN_WRITE_PRIVATE_MESSAGE, BaseUserGroupFieldsDto.FIRST_NAME_ACC, BaseUserGroupFieldsDto.FIRST_NAME_DAT, BaseUserGroupFieldsDto.FIRST_NAME_GEN, BaseUserGroupFieldsDto.FRIEND_STATUS, BaseUserGroupFieldsDto.IS_MEMBER, BaseUserGroupFieldsDto.LAST_NAME_ACC, BaseUserGroupFieldsDto.LAST_NAME_DAT, BaseUserGroupFieldsDto.LAST_NAME_GEN, BaseUserGroupFieldsDto.MEMBER_STATUS, BaseUserGroupFieldsDto.NAME, BaseUserGroupFieldsDto.SCREEN_NAME, BaseUserGroupFieldsDto.SEX, BaseUserGroupFieldsDto.TRENDING, BaseUserGroupFieldsDto.VERIFIED, BaseUserGroupFieldsDto.IS_VERIFIED, BaseUserGroupFieldsDto.IMAGE_STATUS, BaseUserGroupFieldsDto.IS_NFT, BaseUserGroupFieldsDto.IS_NFT_PHOTO, BaseUserGroupFieldsDto.PHOTO_BASE);
        a = l;
        b = j5g.u0(e43.l(BaseUserGroupFieldsDto.CAN_SUBSCRIBE_STORIES, BaseUserGroupFieldsDto.IS_SUBSCRIBED_STORIES), l);
    }

    public static ArrayList a() {
        return b;
    }

    public static List b() {
        return a;
    }
}
