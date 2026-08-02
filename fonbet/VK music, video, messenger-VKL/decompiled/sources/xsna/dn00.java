package xsna;

import com.vk.api.generated.likes.dto.LikesAddActionDto;
import com.vk.api.generated.likes.dto.LikesTypeDto;
import com.vk.newsfeed.common.domain.model.AddLikeAction;
import com.vk.newsfeed.common.domain.model.LikableItemType;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Mappers.kt */
/* loaded from: classes4.dex */
public final class dn00 {

    /* compiled from: Mappers.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AddLikeAction.TriggerType.values().length];
            try {
                iArr[AddLikeAction.TriggerType.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AddLikeAction.TriggerType.DOUBLE_TAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AddLikeAction.TriggerType.REACTIONS_POPUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AddLikeAction.TriggerType.REACTIONS_MODAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LikableItemType.values().length];
            try {
                iArr2[LikableItemType.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LikableItemType.COMMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[LikableItemType.PHOTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[LikableItemType.AUDIO.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[LikableItemType.VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[LikableItemType.NOTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[LikableItemType.MARKET.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[LikableItemType.PHOTO_COMMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[LikableItemType.VIDEO_COMMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[LikableItemType.TOPIC_COMMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[LikableItemType.MARKET_COMMENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[LikableItemType.SITEPAGE.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[LikableItemType.TEXTPOST.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final LikesAddActionDto a(AddLikeAction.TriggerType triggerType) {
        int i = a.$EnumSwitchMapping$0[triggerType.ordinal()];
        if (i == 1) {
            return LikesAddActionDto.BUTTON;
        }
        if (i == 2) {
            return LikesAddActionDto.DOUBLE_TAP;
        }
        if (i == 3) {
            return LikesAddActionDto.REACTIONS_POPUP;
        }
        if (i == 4) {
            return LikesAddActionDto.REACTIONS_MODAL;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final LikesTypeDto b(LikableItemType likableItemType) {
        switch (a.$EnumSwitchMapping$1[likableItemType.ordinal()]) {
            case 1:
                return LikesTypeDto.POST;
            case 2:
                return LikesTypeDto.COMMENT;
            case 3:
                return LikesTypeDto.PHOTO;
            case 4:
                return LikesTypeDto.AUDIO;
            case 5:
                return LikesTypeDto.VIDEO;
            case 6:
                return LikesTypeDto.NOTE;
            case 7:
                return LikesTypeDto.MARKET;
            case 8:
                return LikesTypeDto.PHOTO_COMMENT;
            case 9:
                return LikesTypeDto.VIDEO_COMMENT;
            case 10:
                return LikesTypeDto.TOPIC_COMMENT;
            case 11:
                return LikesTypeDto.MARKET_COMMENT;
            case 12:
                return LikesTypeDto.SITEPAGE;
            case 13:
                return LikesTypeDto.TEXTPOST;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
