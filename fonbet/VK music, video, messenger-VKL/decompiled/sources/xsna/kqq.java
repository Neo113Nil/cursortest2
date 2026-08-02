package xsna;

import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* compiled from: FaveGetWithPagesRequestProvider.kt */
/* loaded from: classes4.dex */
public final class kqq {
    public static final List<BaseUserGroupFieldsDto> a;
    public static final String b;

    static {
        List<BaseUserGroupFieldsDto> l = e43.l(BaseUserGroupFieldsDto.PHOTO_BASE, BaseUserGroupFieldsDto.VERIFIED, BaseUserGroupFieldsDto.TRENDING, BaseUserGroupFieldsDto.IS_VERIFIED, BaseUserGroupFieldsDto.ONLINE, BaseUserGroupFieldsDto.HAS_UNSEEN_STORIES, BaseUserGroupFieldsDto.IS_GOVERNMENT_ORGANIZATION, BaseUserGroupFieldsDto.TRUST_MARK, BaseUserGroupFieldsDto.FIRST_NAME_GEN, BaseUserGroupFieldsDto.LAST_NAME_GEN, BaseUserGroupFieldsDto.URL, BaseUserGroupFieldsDto.MEMBERS_COUNT, BaseUserGroupFieldsDto.FOLLOWERS_COUNT);
        a = l;
        b = j5g.g0(l, StringUtils.COMMA, null, null, 0, new oa(24), 30);
    }
}
