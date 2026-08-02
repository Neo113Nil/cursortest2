package xsna;

import com.vk.api.generated.fave.dto.FaveGetExtendedItemTypeDto;
import com.vk.fave.entities.FaveType;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FaveGetRequestProvider.kt */
/* loaded from: classes4.dex */
public final class hqq {
    public static final String a = j5g.g0(e43.l("photo_base", "verified", "trending", "is_verified", "friend_status", "has_unseen_stories", "is_government_organization", "first_name_gen", "last_name_gen", "url", "trust_mark"), StringUtils.COMMA, null, null, 0, null, 62);

    /* compiled from: FaveGetRequestProvider.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FaveType.values().length];
            try {
                iArr[FaveType.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FaveType.ARTICLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FaveType.LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FaveType.PODCAST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FaveType.VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FaveType.CLIP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FaveType.PRODUCT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FaveType.NARRATIVE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final FaveGetExtendedItemTypeDto a(FaveType faveType) {
        switch (a.$EnumSwitchMapping$0[faveType.ordinal()]) {
            case 1:
                return FaveGetExtendedItemTypeDto.POST;
            case 2:
                return FaveGetExtendedItemTypeDto.ARTICLE;
            case 3:
                return FaveGetExtendedItemTypeDto.LINK;
            case 4:
                return FaveGetExtendedItemTypeDto.PODCAST;
            case 5:
                return FaveGetExtendedItemTypeDto.VIDEO;
            case 6:
                return FaveGetExtendedItemTypeDto.CLIP;
            case 7:
                return FaveGetExtendedItemTypeDto.PRODUCT;
            case 8:
                return FaveGetExtendedItemTypeDto.NARRATIVE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
