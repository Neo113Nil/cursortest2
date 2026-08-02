package xsna;

import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.story.api.domain.interactor.upload.StoryTaskParams;
import java.util.List;

/* compiled from: StoriesHelperFunctions.kt */
/* loaded from: classes6.dex */
public final class tsl0 {
    public static final List<BaseUserGroupFieldsDto> a = e43.l(BaseUserGroupFieldsDto.BDATE, BaseUserGroupFieldsDto.CAN_UPLOAD_STORY, BaseUserGroupFieldsDto.CAN_WRITE_PRIVATE_MESSAGE, BaseUserGroupFieldsDto.FIRST_NAME_ACC, BaseUserGroupFieldsDto.FIRST_NAME_DAT, BaseUserGroupFieldsDto.FIRST_NAME_GEN, BaseUserGroupFieldsDto.FRIEND_STATUS, BaseUserGroupFieldsDto.IS_MEMBER, BaseUserGroupFieldsDto.LAST_NAME_ACC, BaseUserGroupFieldsDto.LAST_NAME_DAT, BaseUserGroupFieldsDto.LAST_NAME_GEN, BaseUserGroupFieldsDto.MEMBER_STATUS, BaseUserGroupFieldsDto.NAME, BaseUserGroupFieldsDto.SCREEN_NAME, BaseUserGroupFieldsDto.SEX, BaseUserGroupFieldsDto.TRENDING, BaseUserGroupFieldsDto.VERIFIED, BaseUserGroupFieldsDto.IS_VERIFIED, BaseUserGroupFieldsDto.IMAGE_STATUS, BaseUserGroupFieldsDto.IS_NFT, BaseUserGroupFieldsDto.IS_NFT_PHOTO, BaseUserGroupFieldsDto.PHOTO_BASE);

    public static final List<BaseUserGroupFieldsDto> a() {
        return a;
    }

    public static final StoryTaskParams b(int i, String str) {
        pro0.b();
        return (StoryTaskParams) wmi0.a.k(str + '_' + i);
    }

    public static final void c(String str, int i, StoryTaskParams storyTaskParams) {
        pro0.b();
        wmi0.a.n(str + '_' + i, storyTaskParams);
    }
}
